package com.numbercombinations.rest.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.numbercombinations.services.ICombinationsService;
import com.numbercombinations.services.dto.ResponseDTO;


@RestController
@RequestMapping(path = "/combinations")
@CrossOrigin(origins = "http://localhost:8000")
public class CombinationsController {
	
	@Autowired
    private ICombinationsService combinationsService;
	
	@RequestMapping(value = "/getCombinations", method = RequestMethod.GET,produces = "application/json")
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public ResponseDTO getCombinations(HttpServletRequest request, HttpServletResponse response,
    		 @RequestParam("phoneNumber") Long phoneNumber) throws Exception{
		
    	System.out.println("Inside method");
		List<String> allCombinations = combinationsService.getCombinations(""+phoneNumber);
    	ResponseDTO outputDTO = new ResponseDTO();
    	outputDTO.setMessage("Success");
    	outputDTO.setCombinations(allCombinations);
    	System.out.println("the length" +allCombinations.size());
    	outputDTO.setMessage("Success");
        return outputDTO;
    }
}
