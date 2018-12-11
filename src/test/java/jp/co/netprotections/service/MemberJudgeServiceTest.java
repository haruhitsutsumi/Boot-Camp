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
//	MemberJudgeRequestDto request = new MemberJudgeRequestDto("haruhi",1,1,3,3,3);

//	テストコードのパラメータとして必要なので、インスタンス生成

	MemberJudgeServiceImpl main = new MemberJudgeServiceImpl();

	@Test
	public void testScoreJudge001(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	@Test
	public void testScoreJudge(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	@Test
	public void testScoreJudge(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	@Test
	public void testScoreJudge(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	@Test
	public void testScoreJudge(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	@Test
	public void testScoreJudge(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	@Test
	public void testScoreJudge(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	@Test
	public void testScoreJudge(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	@Test
	public void testScoreJudge(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	
	@Test
	public void testScoreJudge(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	@Test
	public void testScoreJudge(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	@Test
	public void testScoreJudge(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	@Test
	public void testScoreJudge(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	@Test
	public void testScoreJudge(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	@Test
	public void testScoreJudge(){
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();
		
		request.setMemberName();
		request.setEventPlanning();
		request.setCogitation();
		request.setCoodination();
		request.setProgrammingAbility();
		request.setInfrastructureKnowledge();
		
		MemberJudgeResponseDto result = main.scoreJudge(request);

		assertThat(result.getEnlistedPropriety(),is());
	}
	
	
	@Test
	public void test002() {
		MemberJudgeResponseDto result = main.setNull();

		assertThat(result.getEnlistedPropriety(),is(false));
		assertThat(result.getMemberName(),is(nullValue()));
	}
}
