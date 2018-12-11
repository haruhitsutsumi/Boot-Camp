package jp.co.netprotections.util;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import jp.co.netprotections.dto.MemberJudgeResponseDto;

@RunWith(JUnit4.class)
public class ResponseUtilTest {

	ResponseUtil util = new ResponseUtil();
/*メソッドを実行した時の戻り値のmemberNameフィールドの値がnullであるかどうか
 * enlistedproprietyがfalseであるかどうかの確認。
 */
	@Test
	public void testSetNull() {
		MemberJudgeResponseDto result = util.setNull();
		assertThat(result.getMemberName(),is(nullValue()));
		assertThat(result.getEnlistedPropriety(),is(false));
	}
}
