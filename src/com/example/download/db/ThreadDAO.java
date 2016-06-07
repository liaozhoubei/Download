package com.example.download.db;

import java.util.List;

import com.example.download.entitis.ThreadInfo;

/**
 * 數據庫操作的接口類
 *
 */
public interface ThreadDAO {
	// 插入綫程
	public void insertThread(ThreadInfo info);
	// 刪除綫程
	public void deleteThread(String url, int thread_id);
	// 更新綫程
	public void updateThread(String url, int thread_id, int finished);
	// 查詢綫程
	public List<ThreadInfo> queryThreads(String url);
	// 判斷綫程是否存在
	public boolean isExists(String url, int threadId);
}
