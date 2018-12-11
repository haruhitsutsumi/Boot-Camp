package jp.co.netprotections.util;

import org.springframework.stereotype.Service;

import jp.co.netprotections.dto.MemberJudgeResponseDto;

@Service
public class ResponseUtil {

	//条件を満たさないリスト要素に名前(null)と審査結果(false)を詰める
	public MemberJudgeResponseDto setNull() {

		MemberJudgeResponseDto responseNull = new MemberJudgeResponseDto();

		responseNull.setMemberName(null);

		responseNull.setEnlistedPropriety(false);

		return responseNull;
	}
}
