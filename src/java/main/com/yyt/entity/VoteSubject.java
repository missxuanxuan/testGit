package com.yyt.entity;

import java.io.Serializable;

public class VoteSubject implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long vsid;

	private String vstitle;

	private Integer vsType;

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
		this.vstitle = vstitle == null ? null : vstitle.trim();
	}

	public Integer getVsType() {
		return vsType;
	}

	public void setVsType(Integer vsType) {
		this.vsType = vsType;
	}

	@Override
	public String toString() {
		return "VoteSubject [vsid=" + vsid + ", vstitle=" + vstitle + ", vsType=" + vsType + "]";
	}

}