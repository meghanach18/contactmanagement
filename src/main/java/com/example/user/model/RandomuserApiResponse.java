package com.example.user.model;

import java.util.ArrayList;

public class RandomuserApiResponse {
	 public ArrayList<Result> results;
	    public Info info;
		public ArrayList<Result> getResults() {
			return results;
		}
		public void setResults(ArrayList<Result> results) {
			this.results = results;
		}
		public Info getInfo() {
			return info;
		}
		public void setInfo(Info info) {
			this.info = info;
		}
		@Override
		public String toString() {
			return "RandomuserApiResponse [results=" + results + ", info=" + info + "]";
		}
		public RandomuserApiResponse(ArrayList<Result> results, Info info) {
			super();
			this.results = results;
			this.info = info;
		}
		public RandomuserApiResponse() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
