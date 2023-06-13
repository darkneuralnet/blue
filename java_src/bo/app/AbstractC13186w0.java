package bo.app;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: bo.app.w0 */
/* loaded from: classes.dex */
public abstract class AbstractC13186w0 extends ThreadPoolExecutor {

    /* renamed from: d */
    private static final String f59387d = C43664k20.m29433n(AbstractC13186w0.class);

    /* renamed from: a */
    private final List<Runnable> f59388a;

    /* renamed from: b */
    private final Map<Runnable, Thread> f59389b;

    /* renamed from: c */
    private final String f59390c;

    /* renamed from: bo.app.w0$b */
    /* loaded from: classes.dex */
    public class RejectedExecutionHandlerC13188b implements RejectedExecutionHandler {
        private RejectedExecutionHandlerC13188b() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            String str = AbstractC13186w0.f59387d;
            C43664k20.m29438i(str, "Rejected execution on runnable: " + runnable + " . ID: " + AbstractC13186w0.this.f59390c);
            if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminating()) {
                String str2 = AbstractC13186w0.f59387d;
                C43664k20.m29431p(str2, "ThreadPoolExecutor is shutdown. Dropping rejected task. ID: " + AbstractC13186w0.this.f59390c);
                return;
            }
            String m62850b = AbstractC13186w0.this.m62850b();
            try {
                if (!AbstractC13186w0.this.f59388a.isEmpty()) {
                    Runnable runnable2 = (Runnable) AbstractC13186w0.this.f59388a.get(0);
                    if (runnable2 instanceof Future) {
                        ((Future) runnable2).cancel(true);
                    } else {
                        Thread thread = (Thread) AbstractC13186w0.this.f59389b.get(runnable2);
                        if (thread != null) {
                            thread.interrupt();
                        }
                    }
                    AbstractC13186w0.this.f59388a.remove(runnable2);
                    AbstractC13186w0.this.f59389b.remove(runnable2);
                }
                Runnable poll = threadPoolExecutor.getQueue().poll();
                if (poll != null) {
                    String str3 = AbstractC13186w0.f59387d;
                    C43664k20.m29424w(str3, "Running head of queue on caller thread: " + poll + " . ID: " + AbstractC13186w0.this.f59390c);
                    Executors.newSingleThreadExecutor().invokeAll(Collections.singletonList(Executors.callable(poll)), 200L, TimeUnit.MILLISECONDS);
                }
                String str4 = AbstractC13186w0.f59387d;
                C43664k20.m29424w(str4, "Re-adding rejected task to queue: " + runnable + " . ID: " + AbstractC13186w0.this.f59390c);
                threadPoolExecutor.execute(runnable);
            } catch (Exception e) {
                String str5 = AbstractC13186w0.f59387d;
                C43664k20.m29437j(str5, "Caught exception in rejected execution handler for incoming task: " + runnable + " . Running tasks description: " + m62850b, e);
            }
            if (m62850b != null) {
                String str6 = AbstractC13186w0.f59387d;
                C43664k20.m29421z(str6, "Handled rejected execution on incoming task: " + m62850b);
            }
        }
    }

    public AbstractC13186w0(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        this.f59388a = new CopyOnWriteArrayList();
        this.f59389b = new HashMap();
        this.f59390c = str;
        setRejectedExecutionHandler(new RejectedExecutionHandlerC13188b());
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        this.f59388a.remove(runnable);
        this.f59389b.remove(runnable);
        super.afterExecute(runnable, th);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        this.f59388a.add(runnable);
        this.f59389b.put(runnable, thread);
        super.beforeExecute(thread, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public String m62850b() {
        try {
            if (this.f59388a.size() != getActiveCount()) {
                String str = f59387d;
                C43664k20.m29438i(str, "Running task count does not match ThreadPoolExecutor active count. Returning null description.  runningTasks.size(): " + this.f59388a.size() + " getActiveCount(): " + getActiveCount() + " ID: " + this.f59390c);
                return null;
            }
            StringBuilder sb = new StringBuilder(1024);
            sb.append("There are ");
            sb.append(this.f59388a.size());
            sb.append(" known running tasks. Active thread dumps: [\n");
            for (Thread thread : this.f59389b.values()) {
                try {
                    sb.append(m62851a(thread.getStackTrace()));
                    sb.append("\n,");
                } catch (Exception e) {
                    String str2 = f59387d;
                    C43664k20.m29434m(str2, "Failed to create description for active thread: " + thread + " ID: " + this.f59390c, e);
                }
            }
            sb.append("]\nExecutor ID: ");
            sb.append(this.f59390c);
            sb.append(" state: ");
            sb.append(toString());
            return sb.toString();
        } catch (Exception e2) {
            String str3 = f59387d;
            C43664k20.m29434m(str3, "Failed to create running tasks description. ID: " + this.f59390c, e2);
            return null;
        }
    }

    /* renamed from: a */
    private static String m62851a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append("\nat ");
            sb.append(stackTraceElement);
        }
        return sb.toString();
    }
}
