package jp.co.netprotections.dtoList;

import java.util.List;

import jp.co.netprotections.dto.MemberJudgeResponseDto;

public class MemberJudgeResponseListDto{

	private int judgeNo;

	private String judgeMan;

	private List<MemberJudgeResponseDto> judgedCandidatesResultList;

	public int getJudgeNo() {

		return judgeNo;
	}
	public void setJudgeNo(int judgeNo) {

		this.judgeNo=judgeNo;
	}

	public List<MemberJudgeResponseDto> getJudgedCandidatesResultList() {

		return judgedCandidatesResultList;
	}
	public void setJudgedCandidatesResultList(List<MemberJudgeResponseDto> responses) {

		this.judgedCandidatesResultList = responses;
		}
	public void setJudgeMan(String name) {
		this.judgeMan=name;
	}
	public String getJudgeMan() {
		return judgeMan;
	}

}