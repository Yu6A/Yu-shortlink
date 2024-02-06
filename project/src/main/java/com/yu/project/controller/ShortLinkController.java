package com.yu.project.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.yu.project.common.convention.result.Result;
import com.yu.project.common.convention.result.Results;
import com.yu.project.dto.req.ShortLinkCreateReqDTO;
import com.yu.project.dto.resp.ShortLinkCreateRespDTO;
import com.yu.project.service.ShortLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ShortLinkController {

	private final ShortLinkService shortLinkService;

	/**
	 * 创建短链接
	 * @param requestParam
	 * @return
	 */
	@PostMapping("/api/short-link/v1/create")
	public Result<ShortLinkCreateRespDTO> createShortLink(@RequestBody ShortLinkCreateReqDTO requestParam) {
		return Results.success(shortLinkService.createShortLink(requestParam));
	}
}
