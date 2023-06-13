package p000;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* renamed from: st2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C48913st2<D> {
    Context mContext;
    int mId;
    InterfaceC28423b<D> mListener;
    InterfaceC28422a<D> mOnLoadCanceledListener;
    boolean mStarted = false;
    boolean mAbandoned = false;
    boolean mReset = true;
    boolean mContentChanged = false;
    boolean mProcessingChange = false;

    /* renamed from: st2$a */
    /* loaded from: classes.dex */
    public interface InterfaceC28422a<D> {
    }

    /* renamed from: st2$b */
    /* loaded from: classes.dex */
    public interface InterfaceC28423b<D> {
        /* renamed from: a */
        void mo9606a(C48913st2<D> c48913st2, D d);
    }

    public C48913st2(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public String dataToString(D d) {
        StringBuilder sb = new StringBuilder(64);
        C41561gV0.m39267a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public void deliverCancellation() {
    }

    public void deliverResult(D d) {
        InterfaceC28423b<D> interfaceC28423b = this.mListener;
        if (interfaceC28423b != null) {
            interfaceC28423b.mo9606a(this, d);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    public void forceLoad() {
        onForceLoad();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public void onAbandon() {
    }

    public boolean onCancelLoad() {
        return false;
    }

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public void onForceLoad() {
    }

    public void onReset() {
    }

    public void onStartLoading() {
    }

    public void onStopLoading() {
    }

    public void registerListener(int i, InterfaceC28423b<D> interfaceC28423b) {
        if (this.mListener == null) {
            this.mListener = interfaceC28423b;
            this.mId = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void registerOnLoadCanceledListener(InterfaceC28422a<D> interfaceC28422a) {
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C41561gV0.m39267a(this, sb);
        sb.append(" id=");
        sb.append(this.mId);
        sb.append("}");
        return sb.toString();
    }

    public void unregisterListener(InterfaceC28423b<D> interfaceC28423b) {
        InterfaceC28423b<D> interfaceC28423b2 = this.mListener;
        if (interfaceC28423b2 != null) {
            if (interfaceC28423b2 == interfaceC28423b) {
                this.mListener = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    public void unregisterOnLoadCanceledListener(InterfaceC28422a<D> interfaceC28422a) {
        throw new IllegalStateException("No listener register");
    }
}
