package com.pet.service;

import java.util.Map;

import com.pet.web.dto.PostDto;

public interface DashboardService {

	Map<String, Object> getDashboard(String tab, String start, String end);

	Map<String, Object> getPostEditJson(Long postId);

	Map<String, Object> editPost(PostDto newPostForm);

	Map<String, Object> getNumOfPostsByCategoriesForPieChart();

	Map<String, Object> getNumOfPostsByMonthForBarChart();

}
