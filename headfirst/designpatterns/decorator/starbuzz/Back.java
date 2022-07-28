package com.jirancomms.commssearch.resource.cool;

import com.jirancomms.commssearch.pojo.cool.AlimiSettingBoardVM;
import com.jirancomms.commssearch.pojo.cool.AlimiSettingVM;
import com.jirancomms.commssearch.service.cool.AlimiSettingService;
import coolib.common.CCResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AlimiSettingResource {

    private final AlimiSettingService alimiSettingService;

    public AlimiSettingResource(AlimiSettingService alimiSettingService) {
        this.alimiSettingService = alimiSettingService;
    }

    /**
     @apiGroup alimiSetting
     @apiName _save
     @api {post} /api/alimiSetting/_save 학교 홈페이지와 연동된 게시글 저장, 수정, 삭제
     @apiDescription
     저장 : db에 schoolIdx값이 존재하지 않는 경우 \
     수정 : db에 schoolIdx값이 존재하는 경우 \
     삭제 : bDelete 값이 1인 경우

     @apiExample {curl}    Example usage:
     curl --location --request POST 'https://search.coolmessenger.com/api/alimiSetting/_save' \
     --header 'Content-Type: application/json' \
     --data-raw '{
     "schoolIdx":42508,
     "bAlimiConnectFlag":1,
     "bDelete":0,
     "schoolImage":"immageURL",
     "schoolUrl":"URL",
     "alimiJoinDate":"20220715",
     "writeDate":"20220715"
     }'

     @apiParam {Integer} schoolIdx school index
     @apiParam {Integer} bAlimiConnectFlag 자동 승인 여부 flag (1:자동승인, 0: 수동승인)
     @apiParam {Integer} bDelete 삭제여부(1: 삭제)
     @apiParam {String} schoolImage 학교 로고 이미지 URL
     @apiParam {String} schoolUrl 학교 홈페이지 URL
     @apiParam {Date} alimiJoinDate 알리미 가입일
     @apiParam {Date} writeDate 작성일

     @apiParamExample 연동 게시판 저장 또는 수정
     {
     "schoolIdx":42508,
     "bAlimiConnectFlag":1,
     "bDelete":0,
     "schoolImage":"immageURL",
     "schoolUrl":"URL",
     "alimiJoinDate":"20220715",
     "writeDate":"20220715"
     }
     @apiParamExample 연동 게시판 삭제
     {
     "schoolIdx":42508,
     "bAlimiConnectFlag":1,
     "bDelete":1,
     "schoolImage":"immageURL",
     "schoolUrl":"URL",
     "alimiJoinDate":"20220715",
     "writeDate":"20220715"
     }

     @apiSuccess {Boolean} result 결과
     @apiSuccess {String} message  응답메시지내용
     @apiSuccess {Number} errorCode  에러코드값

     @apiError {Boolean} result    결과
     @apiError {String} message  에러메시지내용
     @apiError {Number} errorCode  에러코드값
     */
    @PostMapping("/alimiSetting/_save")
    public CCResult saveSetting(@RequestBody AlimiSettingVM alimiSettingVM) {
        return this.alimiSettingService.saveSetting(alimiSettingVM);
    }

    /**
     @apiGroup alimiSetting
     @apiName search
     @apiHeader Content-Type application/json
     @api {get} /api/alimiSetting/_search/fields 학교 홈페이지와 연동된 게시글 검색

     @apiExample {curl}    Example usage:
     curl --location --request GET 'localhost:8080/api/alimiSetting/_search/fields?schoolIdx=42508'

     @apiParam {int} schoolIdx school index

     @apiSuccess {Boolean} result 결과
     @apiSuccess {String} message  응답메시지내용
     @apiSuccess {Number} errorCode  에러코드값

     @apiError {Boolean} result    결과
     @apiError {String} message  에러메시지내용
     @apiError {Number} errorCode  에러코드값
     **/
    @GetMapping("/alimiSetting/_search/fields")
    public CCResult searchSetting(AlimiSettingVM alimiSettingVM) {
        return this.alimiSettingService.searchSetting(alimiSettingVM);
    }

    @PostMapping("/alimiSettingBoard/_save")
    public CCResult saveSettingBoard(@RequestBody AlimiSettingBoardVM settingBoardVM) {
        return this.alimiSettingService.saveSettingBoard(settingBoardVM);
    }

    @GetMapping("/alimiSettingBaord/_search/fields")
    public CCResult searchSettingBoard(AlimiSettingBoardVM settingBoardVM) {
        return this.alimiSettingService.searchSettingBoard(settingBoardVM);
    }

    @GetMapping("/alimiSettingBaord/_delete")
    public CCResult deleteSettingBoard(int idx) {
        return this.alimiSettingService.deleteSettingBoard(idx);
    }
}
