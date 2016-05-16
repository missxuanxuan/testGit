package com.yyt.entity;

public class VoteOption {
	private int voId;
	private String voOption;
	private int vsId;
	private int voOrder;

	public int getVoId() {
		return voId;
	}

	public void setVoId(int voId) {
		this.voId = voId;
	}

	public String getVoOption() {
		return voOption;
	}

	public void setVoOption(String voOption) {
		this.voOption = voOption;
	}

	public int getVsId() {
		return vsId;
	}

	public void setVsId(int vsId) {
		this.vsId = vsId;
	}

	public int getVoOrder() {
		return voOrder;
	}

	public void setVoOrder(int voOrder) {
		this.voOrder = voOrder;
	}

	@Override
	public String toString() {
		return "\nVoteOption [voId=" + voId + ", voOption=" + voOption + ", vsId=" + vsId + ", voOrder=" + voOrder + "]";
	}

	public VoteOption(String voOption, int vsId, int voOrder) {
		this.voOption = voOption;
		this.vsId = vsId;
		this.voOrder = voOrder;
	}

	public VoteOption() {
	}

}
