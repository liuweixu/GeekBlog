package com.liublog.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * 文章预览列表
 *
 * @author liuweixu
 * @date 2023/03/10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticlePreviewListDTO {

    /**
     * 文章列表
     */
    private List<ArticlePreviewDTO> articlePreviewDTOList;

    /**
     * 条件名
     */
    private String name;

}
