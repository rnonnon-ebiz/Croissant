package camOperations;

import org.opencv.core.Mat;
import org.opencv.highgui.VideoCapture;

public class Cam {
    Mat frame;
    VideoCapture capture;
    private static final Cam cam = new Cam();

    protected Cam() {
	System.loadLibrary("opencv_java248");
	capture = new VideoCapture(0);
	frame = new Mat();
    }

    public static Cam getInstance() {
	return cam;
    }

    public Mat getFrame() {
	return frame;
    }

    public VideoCapture getCapture() {
	return capture;
    }

    public boolean read() {
	return capture.read(frame);
    }

    public void changeCaptureDevice(int device) {
	capture.release();
	capture.open(device);
    }
}
