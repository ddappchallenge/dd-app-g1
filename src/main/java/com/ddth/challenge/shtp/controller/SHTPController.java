package com.ddth.challenge.shtp.controller;

import com.ddth.challenge.shtp.algorithm.ShortestPath;
import com.ddth.challenge.shtp.model.AllShortestPathResponse;
import com.ddth.challenge.shtp.model.Edge;
import com.ddth.challenge.shtp.model.Graph;
import com.ddth.challenge.shtp.model.ResponseMessage;
import com.ddth.challenge.shtp.model.ShortestPathResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SHTPController {

	public static String lastestMessage = "Hello World";
        Graph graph_obj =new Graph();
        
	@PostMapping(value="/graph")
	@ResponseStatus(HttpStatus.OK)
	public void createGraph(@RequestBody Graph req) throws Exception{
            
            graph_obj.getNodes();
            graph_obj.getEdges();
            System.out.println(graph_obj.getNodes());
            
            System.out.println(graph_obj.getEdges());
            
	}
	
	@GetMapping(value="/graph/shortestPath")
	public ShortestPathResponse getShortestPath(@RequestParam(value="src") String src, @RequestParam(value="dest") String dest) throws Exception{
		return null;
	}
	
	@GetMapping(value="/graph/allShortestPath")
	public AllShortestPathResponse getAllShortestPath(@RequestParam(value="src") String src, @RequestParam(value="dest") String dest) throws Exception{
		return null;
	}
}
