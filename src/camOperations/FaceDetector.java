package camOperations;

import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.objdetect.CascadeClassifier;

public class FaceDetector {
    CascadeClassifier cascadeClassifier;
    private static final FaceDetector faceDetector = new FaceDetector();

    protected FaceDetector() {
	cascadeClassifier = new CascadeClassifier("lbpcascade_frontalface.xml");
    }

    public static FaceDetector getInstance() {
	return faceDetector;
    }

    public boolean detectFace(Mat image) {
	System.out.println("\nRunning DetectFace");

	MatOfRect faceDetections = new MatOfRect();
	cascadeClassifier.detectMultiScale(image, faceDetections);

	System.out.println(String.format("Detected %s faces",
		faceDetections.toArray().length));

	return faceDetections.toArray().length >= 1;
    }
}
