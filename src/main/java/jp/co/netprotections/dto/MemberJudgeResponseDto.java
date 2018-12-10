package jp.co.netprotections.dto;

public class MemberJudgeResponseDto {

	private String memberName;

	private Object enlistedPropriety;

	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName=memberName;
	}
	public Object getEnlistedPropriety() {
		return enlistedPropriety;
	}
	public void setEnlistedPropriety(Object enlistedPropriety) {
		this.enlistedPropriety=enlistedPropriety;
	}
}
