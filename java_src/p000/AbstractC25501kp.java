package p000;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.p004os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
/* renamed from: kp */
/* loaded from: classes.dex */
public abstract class AbstractC25501kp<D> extends C48913st2<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile AbstractC25501kp<D>.RunnableC25502a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile AbstractC25501kp<D>.RunnableC25502a mTask;
    long mUpdateThrottle;

    /* renamed from: kp$a */
    /* loaded from: classes.dex */
    public final class RunnableC25502a extends AbstractC40970fV2<Void, Void, D> implements Runnable {

        /* renamed from: l */
        public final CountDownLatch f95031l = new CountDownLatch(1);

        /* renamed from: m */
        public boolean f95032m;

        public RunnableC25502a() {
        }

        @Override // p000.AbstractC40970fV2
        /* renamed from: h */
        public void mo28396h(D d) {
            try {
                AbstractC25501kp.this.dispatchOnCancelled(this, d);
            } finally {
                this.f95031l.countDown();
            }
        }

        @Override // p000.AbstractC40970fV2
        /* renamed from: i */
        public void mo28395i(D d) {
            try {
                AbstractC25501kp.this.dispatchOnLoadComplete(this, d);
            } finally {
                this.f95031l.countDown();
            }
        }

        @Override // p000.AbstractC40970fV2
        /* renamed from: n */
        public D mo28397b(Void... voidArr) {
            try {
                return (D) AbstractC25501kp.this.onLoadInBackground();
            } catch (OperationCanceledException e) {
                if (m41276f()) {
                    return null;
                }
                throw e;
            }
        }

        /* renamed from: o */
        public void m28393o() {
            try {
                this.f95031l.await();
            } catch (InterruptedException unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f95032m = false;
            AbstractC25501kp.this.executePendingTask();
        }
    }

    public AbstractC25501kp(Context context) {
        this(context, AbstractC40970fV2.f80221i);
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(AbstractC25501kp<D>.RunnableC25502a runnableC25502a, D d) {
        onCanceled(d);
        if (this.mCancellingTask == runnableC25502a) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(AbstractC25501kp<D>.RunnableC25502a runnableC25502a, D d) {
        if (this.mTask != runnableC25502a) {
            dispatchOnCancelled(runnableC25502a, d);
        } else if (isAbandoned()) {
            onCanceled(d);
        } else {
            commitContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mTask = null;
            deliverResult(d);
        }
    }

    @Override // p000.C48913st2
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f95032m);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f95032m);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C46655p46.m19994c(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C46655p46.m19995b(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask == null && this.mTask != null) {
            if (this.mTask.f95032m) {
                this.mTask.f95032m = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
                this.mTask.f95032m = true;
                this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
                return;
            }
            this.mTask.m41279c(this.mExecutor, null);
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract D loadInBackground();

    @Override // p000.C48913st2
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f95032m) {
                this.mTask.f95032m = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        } else if (this.mTask.f95032m) {
            this.mTask.f95032m = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        } else {
            boolean m41280a = this.mTask.m41280a(false);
            if (m41280a) {
                this.mCancellingTask = this.mTask;
                cancelLoadInBackground();
            }
            this.mTask = null;
            return m41280a;
        }
    }

    public void onCanceled(D d) {
    }

    @Override // p000.C48913st2
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new RunnableC25502a();
        executePendingTask();
    }

    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() {
        AbstractC25501kp<D>.RunnableC25502a runnableC25502a = this.mTask;
        if (runnableC25502a != null) {
            runnableC25502a.m28393o();
        }
    }

    private AbstractC25501kp(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }
}
