package jp.co.netprotections.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.dtoList.MemberJudgeRequestListDto;
import jp.co.netprotections.dtoList.MemberJudgeResponseListDto;
import jp.co.netprotections.service.MemberJudgeService;

@RestController
public class MemberJudgeController {

	@Autowired
	private MemberJudgeService memberJudgeService;

	@RequestMapping(value="/main",method=RequestMethod.POST,
			consumes=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public MemberJudgeResponseListDto excute
	(@RequestBody MemberJudgeRequestListDto memberCandidatesListClass){

		//リストフィールドを持たないリクエストにnullを返す。
		if(memberCandidatesListClass.getMemberCandidatesList() == null){
			return null;

		}else{
			//戻り値のリストフィールドに詰める型を作成
			List<MemberJudgeResponseDto> responseList = new ArrayList<MemberJudgeResponseDto>();

			//リストの各要素を処理し、上記で作成したリスト型にaddする
			for(MemberJudgeRequestDto request : memberCandidatesListClass.getMemberCandidatesList()){

				//名前を持たないリスト要素に名前(null)と審査結果(false)を詰める
				if(request.getMemberName()==null) {
					MemberJudgeResponseDto response = memberJudgeService.setNull();
					responseList.add(response);
				}
				//値の要件テスト
				else{
					if((0<= request.getEventPlanning() && 5>=request.getEventPlanning())
						&&(0<= request.getCogitation() && 5>=request.getCogitation())
						&&(0<= request.getCoodination() && 5>=request.getCoodination())
						&&(0<= request.getProgrammingAbility() && 5>=request.getProgrammingAbility())
						&&(0<= request.getInfrastructureKnowledge() && 5>=request.getInfrastructureKnowledge()))
					{
						//値の診断を実施し名前と審査結果を詰める
						MemberJudgeResponseDto response = memberJudgeService.scoreJudge(request);
						responseList.add(response);
					}
					else{
						//名前(null)と審査結果(false)を詰める
						MemberJudgeResponseDto response = memberJudgeService.setNull();
						responseList.add(response);
					}
				}
			}
		//戻り値の型であるMemberJudgeResponseListDtoのresponseListDtoのフィールドに詰める
		MemberJudgeResponseListDto responseListDto = new MemberJudgeResponseListDto();

		responseListDto.setJudgedCandidatesResultList(responseList);
		responseListDto.setJudgeMan(memberCandidatesListClass.getJudgeMan());
		responseListDto.setJudgeNo(memberCandidatesListClass.getJudgeNo());

		return responseListDto;
		}
	}
}