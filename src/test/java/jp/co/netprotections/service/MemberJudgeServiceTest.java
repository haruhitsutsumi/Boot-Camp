package jp.co.netprotections.service;

import static org.hamcrest.CoreMatchers.*;
//これはなんでしょう？？
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.service.impl.MemberJudgeServiceImpl;

@RunWith(JUnit4.class)
public class MemberJudgeServiceTest{

//	メソッドを実行するインスタンスとして必要なので、生成

	MemberJudgeServiceImpl main = new MemberJudgeServiceImpl();

//eventPlanningが1以下である時に、結果がfalseになるかどうかの確認
	@Test
	public void testScoreJudge001(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName("haruhi");
		request.setEventPlanning(1);
		request.setCogitation(3);
		request.setCoodination(3);
		request.setProgrammingAbility(3);
		request.setInfrastructureKnowledge(3);

		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is(false));
	}
//coodinationが1以下である時に、結果がfalseniなるかどうかの確認
	@Test
	public void testScoreJudge002(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName("haruhi");
		request.setEventPlanning(3);
		request.setCogitation(3);
		request.setCoodination(1);
		request.setProgrammingAbility(3);
		request.setInfrastructureKnowledge(3);

		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is(false));
	}
//合計値が10以下である時に、結果がfalseであるかどうかの確認
	@Test
	public void testScoreJudge003(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName("haruhi");
		request.setEventPlanning(2);
		request.setCogitation(2);
		request.setCoodination(2);
		request.setProgrammingAbility(1);
		request.setInfrastructureKnowledge(1);

		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is(false));
	}
//eventPlanning,coodinationが2以上であり、合計が11以上で有る時に、結果がtrueであるかどうかの確認
	@Test
	public void testScoreJudge004(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName("haruhi");
		request.setEventPlanning(3);
		request.setCogitation(3);
		request.setCoodination(3);
		request.setProgrammingAbility(3);
		request.setInfrastructureKnowledge(3);

		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is(true));
	}
}
