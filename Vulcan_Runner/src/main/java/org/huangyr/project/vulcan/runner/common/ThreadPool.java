package org.huangyr.project.vulcan.runner.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/*******************************************************************************
 *
 * @date 2019-09-04 17:32 
 * @author: <a href=mailto:huangyueran>黄跃然</a>
 * @Description: 线程池管理
 ******************************************************************************/
public class ThreadPool {

    public static ExecutorService runnerThreadPool = Executors.newFixedThreadPool(Constants.RUNNER_THREAD_NUM, new ThreadFactory() {
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setName("runner-thread-" + thread.getId());
            return thread;
        }
    });

    /**
     * 心跳线程池
     */
    public static ExecutorService heartThreadPool = Executors.newSingleThreadExecutor(new ThreadFactory() {
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setName("runner-heart-thread-" + thread.getId());
            return thread;
        }
    });

    /**
     * 租约线程池
     */
    public static ExecutorService lmThreadPool = Executors.newSingleThreadExecutor(new ThreadFactory() {
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setName("runner-lease-manager-thread-" + thread.getId());
            return thread;
        }
    });

}
