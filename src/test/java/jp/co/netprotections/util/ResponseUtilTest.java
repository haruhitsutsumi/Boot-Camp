package jp.co.netprotections.util;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;

@RunWith(JUnit4.class)
public class ResponseUtilTest {

/*メソッドを実行した時の戻り値のmemberNameフィールドの値がnullであるかどうか
 * enlistedproprietyがfalseであるかどうかの確認。
 */
	@Test
	public void testSetNull() {
		MemberJudgeResponseDto result = ResponseUtil.setNull();
		assertThat(result.getMemberName(),is(nullValue()));
		assertThat(result.getEnlistedPropriety(),is(false));
	}


	//各フィールドが正常値の時、戻り値がtrueであるかどうか
		@Test
		public void testRequestCheck000() {

			MemberJudgeRequestDto request = new MemberJudgeRequestDto();

			request.setMemberName("haruhi");
			request.setEventPlanning(3);
			request.setCogitation(3);
			request.setCoodination(3);
			request.setProgrammingAbility(3);
			request.setInfrastructureKnowledge(3);

			boolean result = ResponseUtil.requestCheck(request);

			assertThat(result,is(true));
		}
	//(eP<0）の時の戻り値がfalseであるかどうか
		@Test
		public void testRequestCheck001() {

			MemberJudgeRequestDto request = new MemberJudgeRequestDto();

			request.setMemberName("haruhi");
			request.setEventPlanning(-1);
			request.setCogitation(3);
			request.setCoodination(3);
			request.setProgrammingAbility(3);
			request.setInfrastructureKnowledge(3);

			boolean result = ResponseUtil.requestCheck(request);

			assertThat(result,is(false));
		}
	//(eP>5）の時の戻り値がfalseであるかどうか
		@Test
		public void testRequestCheck002() {

			MemberJudgeRequestDto request = new MemberJudgeRequestDto();

			request.setMemberName("haruhi");
			request.setEventPlanning(6);
			request.setCogitation(3);
			request.setCoodination(3);
			request.setProgrammingAbility(3);
			request.setInfrastructureKnowledge(3);

			boolean result = ResponseUtil.requestCheck(request);

			assertThat(result,is(false));
		}
	//(cogi<0）の時の戻り値がfalseであるかどうか
		@Test
		public void testRequestCheck003() {

			MemberJudgeRequestDto request = new MemberJudgeRequestDto();

			request.setMemberName("haruhi");
			request.setEventPlanning(3);
			request.setCogitation(-1);
			request.setCoodination(3);
			request.setProgrammingAbility(3);
			request.setInfrastructureKnowledge(3);

			boolean result = ResponseUtil.requestCheck(request);

			assertThat(result,is(false));
		}
	//(cogi>5）の時の戻り値がfalseであるかどうか
		@Test
		public void testRequestCheck004() {

			MemberJudgeRequestDto request = new MemberJudgeRequestDto();

			request.setMemberName("haruhi");
			request.setEventPlanning(3);
			request.setCogitation(6);
			request.setCoodination(3);
			request.setProgrammingAbility(3);
			request.setInfrastructureKnowledge(3);

			boolean result = ResponseUtil.requestCheck(request);

			assertThat(result,is(false));
	}

	//(coo<0）の時の戻り値がfalseであるかどうか
	@Test
	public void testRequestCheck005() {

		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName("haruhi");
		request.setEventPlanning(3);
		request.setCogitation(3);
		request.setCoodination(-1);
		request.setProgrammingAbility(3);
		request.setInfrastructureKnowledge(3);

		boolean result = ResponseUtil.requestCheck(request);

		assertThat(result,is(false));
	}
	//(coo>5）の時の戻り値がfalseであるかどうか
	@Test
	public void testRequestCheck006() {

		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName("haruhi");
		request.setEventPlanning(3);
		request.setCogitation(3);
		request.setCoodination(6);
		request.setProgrammingAbility(3);
		request.setInfrastructureKnowledge(3);

		boolean result = ResponseUtil.requestCheck(request);

		assertThat(result,is(false));
	}
	//(pA<0）の時の戻り値がfalseであるかどうか
	@Test
	public void testRequestCheck007() {

		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName("haruhi");
		request.setEventPlanning(3);
		request.setCogitation(3);
		request.setCoodination(3);
		request.setProgrammingAbility(-1);
		request.setInfrastructureKnowledge(3);

		boolean result = ResponseUtil.requestCheck(request);

		assertThat(result,is(false));
	}
	//(pA>5）の時の戻り値がfalseであるかどうか
	@Test
	public void testRequestCheck008() {

		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName("haruhi");
		request.setEventPlanning(3);
		request.setCogitation(3);
		request.setCoodination(3);
		request.setProgrammingAbility(6);
		request.setInfrastructureKnowledge(3);

		boolean result = ResponseUtil.requestCheck(request);

		assertThat(result,is(false));
	}
	//(iK<0）の時の戻り値がfalseであるかどうか
	@Test
	public void testRequestCheck009() {

		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName("haruhi");
		request.setEventPlanning(3);
		request.setCogitation(3);
		request.setCoodination(3);
		request.setProgrammingAbility(3);
		request.setInfrastructureKnowledge(-1);

		boolean result = ResponseUtil.requestCheck(request);

		assertThat(result,is(false));
	}
	//(iK>5）の時の戻り値がfalseであるかどうか
	@Test
	public void testRequestCheck010() {

		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName("haruhi");
		request.setEventPlanning(3);
		request.setCogitation(3);
		request.setCoodination(3);
		request.setProgrammingAbility(3);
		request.setInfrastructureKnowledge(6);

		boolean result = ResponseUtil.requestCheck(request);

		assertThat(result,is(false));
	}
	//memberName==nullの時の戻り値がfalseであるかどうか
	@Test
	public void testRequestCheck011() {

		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName(null);
		request.setEventPlanning(3);
		request.setCogitation(3);
		request.setCoodination(3);
		request.setProgrammingAbility(3);
		request.setInfrastructureKnowledge(3);

		boolean result = ResponseUtil.requestCheck(request);

		assertThat(result,is(false));
	}
	//memberNameフィールドをセットしない時の戻り値がfalseであるかどうか
	@Test
	public void testRequestCheck012() {

		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setEventPlanning(3);
		request.setCogitation(3);
		request.setCoodination(3);
		request.setProgrammingAbility(3);
		request.setInfrastructureKnowledge(3);

		boolean result = ResponseUtil.requestCheck(request);

		assertThat(result,is(false));
	}
}
