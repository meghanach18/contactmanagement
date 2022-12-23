package com.example.user.model;

public class Info {
	 public String seed;
	    public int results;
	    public int page;
	    public String version;
		public String getSeed() {
			return seed;
		}
		public void setSeed(String seed) {
			this.seed = seed;
		}
		public int getResults() {
			return results;
		}
		public void setResults(int results) {
			this.results = results;
		}
		public int getPage() {
			return page;
		}
		public void setPage(int page) {
			this.page = page;
		}
		public String getVersion() {
			return version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
		@Override
		public String toString() {
			return "Info [seed=" + seed + ", results=" + results + ", page=" + page + ", version=" + version + "]";
		}
		public Info(String seed, int results, int page, String version) {
			super();
			this.seed = seed;
			this.results = results;
			this.page = page;
			this.version = version;
		}
		public Info() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
