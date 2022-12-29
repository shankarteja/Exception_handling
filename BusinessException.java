package ExceptionHandlg_practiceroughf;

public class BusinessException extends Exception  {

	private final String erorrCode;

	public BusinessException(String msg, String erorrCode) {
		super(msg);
		this.erorrCode = erorrCode;
	}

	public String getErorrCode() {
		return erorrCode;
	}
}



