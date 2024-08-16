package com.medium.programming.questions;

public class WordsCount {
	
	    public static int countWords(String str) {
	        if (str == null || str.isEmpty()) {
	            return 0;
	        }

	        String[] words = str.split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        String sentence = "Hello, how are you?";

	        int wordCount = countWords(sentence);

	        System.out.println("Number of words: " + wordCount);
	    }
	}


