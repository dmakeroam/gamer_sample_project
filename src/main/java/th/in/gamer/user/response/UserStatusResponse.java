package th.in.gamer.user.response;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class UserStatusResponse implements Serializable{

	private static final long serialVersionUID = 2408218258306771523L;

	public UserStatusResponse(){
		
	}
	
	private boolean status;
	private String actionType;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

}
