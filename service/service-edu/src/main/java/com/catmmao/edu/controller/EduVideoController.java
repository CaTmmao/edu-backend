package com.catmmao.edu.controller;

import javax.annotation.Resource;

import com.catmmao.edu.entity.EduVideo;
import com.catmmao.edu.service.EduVideoService;
import com.catmmao.utils.data.response.CommonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 课程视频(EduVideo)表控制层
 *
 * @author catmmao
 * @since 2021-08-18 19:21:11
 */
@RestController
@CrossOrigin
@RequestMapping("service/video")
public class EduVideoController {

    @Resource
    private EduVideoService eduVideoService;

    /**
     * 删除视频信息（包括阿里云中保存的视频文件）
     *
     * @param id 视频ID
     * @return 是否成功
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<CommonResponse<?>> deleteVideoById(@PathVariable String id) {

        eduVideoService.deleteVideoById(id);
        return ResponseEntity.ok(CommonResponse.ok(true));
    }

    /**
     * 添加视频
     *
     * @param video 视频信息
     * @return 是否成功
     */
    @PostMapping
    public ResponseEntity<CommonResponse<Boolean>> AddVideo(@RequestBody EduVideo video) {

        eduVideoService.addVideo(video);
        return ResponseEntity.status(HttpStatus.CREATED).body(CommonResponse.ok(true));
    }

    /**
     * 更新视频
     *
     * @param id    视频ID
     * @param video 视频信息
     * @return 是否成功
     */
    @PatchMapping("/{id}")
    public ResponseEntity<CommonResponse<Boolean>> updateVideoById(@PathVariable String id,
                                                                   @RequestBody EduVideo video) {

        eduVideoService.updateVideoById(id, video);
        return ResponseEntity.ok(CommonResponse.ok(true));
    }
}

