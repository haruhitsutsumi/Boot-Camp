package jp.co.netprotections.util;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;

public class ResponseUtil {

	//条件を満たさないリスト要素に名前(null)と審査結果(false)を詰める
	public static MemberJudgeResponseDto setNull() {

		MemberJudgeResponseDto responseNull = new MemberJudgeResponseDto();

		responseNull.setMemberName(null);

		responseNull.setEnlistedPropriety(false);

		return responseNull;
	}

	//リクエスト単体のチェック。名前があって、各値が0~5であるかの確認。
		public static boolean requestCheck(MemberJudgeRequestDto request) {
			//
			if((0<= request.getEventPlanning() && 5>=request.getEventPlanning())
					&&(0<= request.getCogitation() && 5>=request.getCogitation())
					&&(0<= request.getCoodination() && 5>=request.getCoodination())
					&&(0<= request.getProgrammingAbility() && 5>=request.getProgrammingAbility())
					&&(0<= request.getInfrastructureKnowledge() && 5>=request.getInfrastructureKnowledge())
					&&(request.getMemberName()!=null))
				{return true;
			}

			return false;
		}
}
