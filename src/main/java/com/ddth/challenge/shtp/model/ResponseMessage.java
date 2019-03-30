package com.ddth.challenge.shtp.model;

public class ResponseMessage {
	private String message;
	private String status;
        private String date;
        
        
        
        
	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatus(String status) {
		this.status = status;
	}
       
        public void setDate(String date){
            this.date=date;
        }
        
        public String getDate(){
            return date;
        }
       
       

	public String getMessage() {
		return message;
	}

	public String getStatus() {
		return status;
	}

    public void setNodes(String[] nodes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
