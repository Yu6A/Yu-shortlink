package com.yu.project.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yu.project.common.convention.result.Result;
import com.yu.project.dto.req.ShortLinkCreateReqDTO;
import com.yu.project.dto.resp.ShortLinkCreateRespDTO;

/**
 * 自定义流控策略
 */
public class CustomBlockHandler {

    public static Result<ShortLinkCreateRespDTO> createShortLinkBlockHandlerMethod(ShortLinkCreateReqDTO requestParam, BlockException exception) {
        return new Result<ShortLinkCreateRespDTO>().setCode("B100000").setMessage("当前访问网站人数过多，请稍后再试...");
    }
}
