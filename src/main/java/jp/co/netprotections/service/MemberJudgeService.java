package jp.co.netprotections.service;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;

public interface MemberJudgeService {

	public MemberJudgeResponseDto scoreJudge(MemberJudgeRequestDto dto);
	public MemberJudgeResponseDto setNull();
}