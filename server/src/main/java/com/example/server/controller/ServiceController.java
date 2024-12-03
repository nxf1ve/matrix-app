package com.example.server.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/")
public class ServiceController {

    @GetMapping("/getMatrix/{size}")
    public int[][] generateMatrix(@PathVariable int size) {
        Random rand = new Random();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(100) + 1;
            }
        }

        return matrix;
    }

    @PostMapping("/findMin")
    public int findMinAboveDiagonal(@RequestBody int[][] graph) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < graph.length - 1; i++) {
            for (int j = i + 1; j < graph[i].length; j++) {
                if (graph[i][j] < min) {
                    min = graph[i][j];
                }
            }
        }
        return min;
    }
}
