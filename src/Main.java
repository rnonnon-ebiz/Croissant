import ExploitCam.CamWork;

class DetectFace {

}

public class Main {

    public static void main(String[] args) {
	CamWork camWork = new CamWork();
	if (args.length > 1) {
	    try {
		int missAcceptedTime = Integer.parseInt(args[1]);
		camWork.setMissAcceptedTime(missAcceptedTime);
	    } catch (NumberFormatException e) {
	    }
	}
	camWork.run();
    }
}