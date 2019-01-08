package jp.co.netprotections.controller;

import static org.hamcrest.CoreMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import jp.co.netprotections.util.RestTestBase;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MemberJudgeControllerTest extends RestTestBase{

	@Autowired
	public WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    private String targetUrl = "http://localhost:18080/main";

    // モック対象のControllerインスタンスを生成
  	@Before
  	public void setupMock() {
  		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
  	}
  	/**
	 * 001
	 * @throws Exception
	 *リクエストチェックメソッドがfalseの時、setnullがちゃんと機能しているか
	 *（レスポンスがname:null、enlistedPropriety：falseであるかどうか）
	 */
	@Test
	public void test001() throws Exception {
		// モック対象へのリクエスト文字列を取得
		String body = super.readForObject("test001.json");

		// Controllerにリクエストを送り、結果を取得
		ResultActions result = mockMvc.perform(post(targetUrl)
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.content(body));

		// 結果の検査。
		result.andExpect(status().is(HttpStatus.OK.value()))
			.andExpect(jsonPath("$.judgedCandidatesResultList[0].memberName",is(nullValue())))
			.andExpect(jsonPath("$.judgedCandidatesResultList[0].enlistedPropriety",is(false)));
	}
  	/**
	 * 002
	 * @throws Exception
	 *リクエストチェックメソッドがtrueの時、スコアジャッジ(false)がちゃんと機能しているかどうか
	 *（レスポンスがname:name、enlistedPropriety：falseであるかどうか)
	 */
	@Test
	public void test002() throws Exception {
		// モック対象へのリクエスト文字列を取得
		String body = super.readForObject("test002.json");

		// Controllerにリクエストを送り、結果を取得
		ResultActions result =
				mockMvc.perform(
						post(targetUrl)
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.content(body));

		// 結果の検査。ステータスがOKであること、および文字列の文字数が6であることを確認します
		result.andExpect(status().is(HttpStatus.OK.value()))
		.andExpect(jsonPath("$.judgedCandidatesResultList[0].memberName",is("haruhi")))
		.andExpect(jsonPath("$.judgedCandidatesResultList[0].enlistedPropriety",is(false)));
	}
  	/**
	 * 003
	 * @throws Exception
	 *リクエストチェックメソッドがtrueの時、スコアジャッジ(true)がちゃんと機能しているかどうか
	 *（レスポンスがname:name、enlistedPropriety：trueであるかどうか)
	 */	@Test
	public void test003() throws Exception {
		// モック対象へのリクエスト文字列を取得
		String body = super.readForObject("test003.json");

		// Controllerにリクエストを送り、結果を取得
		ResultActions result = mockMvc.perform(post(targetUrl)
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.content(body));

		// 結果の検査。ステータスがOKであること、および文字列の文字数が6であることを確認します
		result.andExpect(status().is(HttpStatus.OK.value()))
		.andExpect(jsonPath("$.judgedCandidatesResultList[0].memberName",is("haruhi")))
		.andExpect(jsonPath("$.judgedCandidatesResultList[0].enlistedPropriety",is(true)));
	}
  	/**
	 * 004
	 * @throws Exception
	 *リクエストにリストが無い時、レスポンスがnullであるかどうか
	 */
	@Test
	public void test004() throws Exception {
		// モック対象へのリクエスト文字列を取得
		String body = super.readForObject("test004.json");

		// Controllerにリクエストを送り、結果を取得
		ResultActions result = mockMvc.perform(post(targetUrl)
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.content(body));

		// 結果の検査。ステータスがOKであること、および文字列の文字数が6であることを確認します
		result.andExpect(status().is(HttpStatus.OK.value()))
		.andExpect(jsonPath("$",is(nullValue())));
	}
////  	/**
////	 * 005
////	 * @throws Exception
////	 *リクエストのリストが:[]の時レスポンスのリストが:[]であるかどうか
////	 */
////	@Test
////	public void test005() throws Exception {
//		// モック対象へのリクエスト文字列を取得
//		String body = super.readForObject("test005.json");
//
//		// Controllerにリクエストを送り、結果を取得
//		ResultActions result = mockMvc.perform(post(targetUrl)
//				.contentType(MediaType.APPLICATION_JSON_UTF8)
//				.content(body));
//
//		// 結果の検査。ステータスがOKであること、および文字列の文字数が6であることを確認します
//		result.andExpect(status().is(HttpStatus.OK.value()))
//			.andExpect(jsonPath("$.strLength").value(6));
//	}

}