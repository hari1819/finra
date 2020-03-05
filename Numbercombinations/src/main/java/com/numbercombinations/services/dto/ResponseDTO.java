/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.numbercombinations.services.dto;

import java.util.List;

public class ResponseDTO {

    /**
     *
     */
    private static final long serialVersionUID = -3396369626708482464L;
    private String message;
    private List<String> combinations;
  
    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

	public List<String> getCombinations() {
		return combinations;
	}

	public void setCombinations(List<String> combinations) {
		this.combinations = combinations;
	}

   
    
    
}
