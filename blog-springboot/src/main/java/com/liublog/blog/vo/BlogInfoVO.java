package com.liublog.blog.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 博客信息
 *
 * @author liuweixu
 * @date 2023/03/29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "博客信息")
public class BlogInfoVO {

    /**
     * 关于我内容
     */
    @ApiModelProperty(name = "aboutContent", value = "关于我内容", required = true, dataType = "String")
    private String aboutContent;

}
