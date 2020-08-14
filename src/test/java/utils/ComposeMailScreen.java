package utils;

import org.sikuli.script.Pattern;

public class ComposeMailScreen {	
		
	private Pattern composeBtn = new Pattern("C:\\Users\\manas\\eclipse-workspace\\GmailAutomation\\logo\\composeBtn.png");
	private Pattern idExistComposeBtn = new Pattern("C:\\Users\\manas\\eclipse-workspace\\GmailAutomation\\logo\\idExistComposeBtn.png");
	private Pattern toTxtBx = new Pattern("C:\\Users\\manas\\eclipse-workspace\\GmailAutomation\\logo\\toTxtBx.png");
	private Pattern subjectTxtBx = new Pattern("C:\\Users\\manas\\eclipse-workspace\\GmailAutomation\\logo\\SubjectTxtBx.png");
	private Pattern mailBodyTxtBx = new Pattern("C:\\Users\\manas\\eclipse-workspace\\GmailAutomation\\logo\\mailBodyTxtBx.png");
	private Pattern attachmentLnk = new Pattern("C:\\Users\\manas\\eclipse-workspace\\GmailAutomation\\logo\\attachmentLink.png");
	private Pattern sendBtn = new Pattern("C:\\Users\\manas\\eclipse-workspace\\GmailAutomation\\logo\\sendBtn.png");
			
	public Pattern getComposeBtn() {
		return composeBtn;
	}
	public Pattern getIdExistComposeBtn() {
		return idExistComposeBtn;
	}
	public Pattern getToTxtBx() {
		return toTxtBx;
	}
	public Pattern getSubjectTxtBx() {
		return subjectTxtBx;
	}
	public Pattern getMailBodyTxtBx() {
		return mailBodyTxtBx;
	}
	public Pattern getAttachmentLnk() {
		return attachmentLnk;
	}
	public Pattern getSendBtn() {
		return sendBtn;
	}
	
}
