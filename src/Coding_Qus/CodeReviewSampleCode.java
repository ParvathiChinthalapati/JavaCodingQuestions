package Coding_Qus;

import java.io.IOException;

//Review below code & give code review comments

public class CodeReviewSampleCode {

	public static void main(String[] args) {
		try {
			CodeReviewSampleCode obj = new CodeReviewSampleCode();
			String msg = obj.callMethod1("B", "D");
			System.out.println(msg);
		} catch (Exception ex) {
			ex.getMessage();
		}

	}

	public String callMethod1(String inputParam1, String inputParam2) throws Exception {
		if (inputParam1.equals("A")) {
			throw new Exception("Sent wrong parameter, please send a correct one");
		} else {
			try {
				boolean isValid = callMethod2(inputParam1);
				if (isValid) {
					// process continues
					System.out.println("Process continues here");
					return "Process Completed successfully";
				}
			} catch (IOException ioe) {
				System.out.println("IOException occurred");
				// return ioe.getMessage();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				// return e.getMessage();
			}
		}
		return null;
	}

	public boolean callMethod2(String inputParam1) throws IOException {
		if (inputParam1.equals("B")) {
			throw new IOException("callMethod2 received wrong parameter, please send a correct one");
		} else {
			System.out.println("callMethod2 validation is successful");
		}
		return true;
	}
}
