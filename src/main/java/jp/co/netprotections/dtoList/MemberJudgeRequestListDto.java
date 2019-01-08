package jp.co.netprotections.dtoList;

import java.util.List;

import org.springframework.stereotype.Component;

import jp.co.netprotections.dto.MemberJudgeRequestDto;

@Component
public class MemberJudgeRequestListDto{

//	private int judgeNo;
//
//	private String judgeMan;

	private List<MemberJudgeRequestDto> memberCandidatesList;

//	public int getJudgeNo() {
//
//		return judgeNo;
//	}
//	public void setJudgeNo(int judgeNo) {
//
//		this.judgeNo=judgeNo;
//	}

//	public String getJudgeMan() {
//
//		return judgeMan;
//	}
//	public void setJudgeMan(String name) {
//
//		this.judgeMan=name;
//	}
	public List<MemberJudgeRequestDto> getMemberCandidatesList() {

		return memberCandidatesList;
	}
	public void setMemberCandidatesList(List<MemberJudgeRequestDto> requests) {

		this.memberCandidatesList = requests;
	}
}