package demoexceptions.exceptionhandling;

import java.time.LocalDateTime;

public class ExceptionInfo {

	private String code;//to show a standard code
	private String msg;//a standard message
	private LocalDateTime localDateTime;//show date and time
	
	// getter and setter methods
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
}