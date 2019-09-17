package dao;
public class SystemException extends Exception {
	private static final long serialVersionUID = 1L;

	public SystemException(int errorCode, String errorMessage) {
		super(errorMessage);
	}

}

