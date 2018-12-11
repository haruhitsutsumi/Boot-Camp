package jp.co.netprotections.service.impl;

import org.springframework.stereotype.Service;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.service.MemberJudgeService;

@Service
public class MemberJudgeServiceImpl implements MemberJudgeService{

		//数値の判定をする
		@Override
		public MemberJudgeResponseDto scoreJudge(MemberJudgeRequestDto memberJudgeRequestDto) {

			MemberJudgeResponseDto response = new MemberJudgeResponseDto();

			response.setMemberName(memberJudgeRequestDto.getMemberName());

			if(memberJudgeRequestDto.getEventPlanning() <= 1 || memberJudgeRequestDto.getCoodination() <=1 ||
					memberJudgeRequestDto.getEventPlanning()
					+memberJudgeRequestDto.getCogitation()
					+memberJudgeRequestDto.getCoodination()
					+memberJudgeRequestDto.getProgrammingAbility()
					+memberJudgeRequestDto.getInfrastructureKnowledge()<=10) {
				response.setEnlistedPropriety(false);
			}else {
				response.setEnlistedPropriety(true);
				}
			return response;
		}
		//条件を満たさないリスト要素に名前(null)と審査結果(false)を詰める
//		public MemberJudgeResponseDto setNull() {
//
//			MemberJudgeResponseDto responseNull = new MemberJudgeResponseDto();
//
//			responseNull.setMemberName(null);
//
//			responseNull.setEnlistedPropriety(false);
//
//			return responseNull;
//		}
}