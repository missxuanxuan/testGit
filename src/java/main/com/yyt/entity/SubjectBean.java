package com.yyt.entity;

import java.io.Serializable;

public class SubjectBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long vsid;
	private String vstitle;
	private int optionCount;
	private int voteUserCount;

	@Override
	public String toString() {
		return "SubjectBean [vsid=" + vsid + ", vstitle=" + vstitle + ",  optionCount=" + optionCount + ", voteUserCount=" + voteUserCount + "]";
	}

	public Long getVsid() {
		return vsid;
	}

	public void setVsid(Long vsid) {
		this.vsid = vsid;
	}

	public String getVstitle() {
		return vstitle;
	}

	public void setVstitle(String vstitle) {
		this.vstitle = vstitle;
	}


	public int getOptionCount() {
		return optionCount;
	}

	public void setOptionCount(int optionCount) {
		this.optionCount = optionCount;
	}

	public int getVoteUserCount() {
		return voteUserCount;
	}

	public void setVoteUserCount(int voteUserCount) {
		this.voteUserCount = voteUserCount;
	}

}
