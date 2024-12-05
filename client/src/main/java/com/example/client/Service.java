package com.example.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {
    private int[][] graph;
    private static final String SERVER_URL = "http://localhost:6060";

    public void genGraph(int size) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<int[][]> response = restTemplate.getForEntity(SERVER_URL + "/getMatrix/" + size, int[][].class);
        graph = response.getBody();
    }

    public void findMin() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<int[][]> entity = new HttpEntity<>(graph, headers);
        ResponseEntity<int[][]> response = restTemplate.postForEntity(SERVER_URL + "/findMin", entity, int[][].class);
        graph = response.getBody();
    }

    public void printGraph() {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
