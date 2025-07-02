package com.fitlog.mvc.model.dao;

import java.util.List;

import com.fitlog.mvc.model.dto.Review;

public interface ReviewDao {
	int insertReview(Review review);
	List<Review> selectAllReviews(int colboardId);
    int removeReview(int reviewId);
	Review selectReview(int reviewId);
	int updateReview(Review originreview);
}
