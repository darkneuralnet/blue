package co.bird.android.coreinterface.manager;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/coreinterface/manager/UpdateRemoteLockStateFailure;", "Ljava/lang/Exception;", "", "b", "Z", "lock", "", "c", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "cause", "<init>", "(ZLjava/lang/Throwable;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UpdateRemoteLockStateFailure extends Exception {

    /* renamed from: b */
    public final boolean f63143b;

    /* renamed from: c */
    public final Throwable f63144c;

    public UpdateRemoteLockStateFailure(boolean z, Throwable th) {
        super("Unable to update the remote lock state to " + z, th);
        this.f63143b = z;
        this.f63144c = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f63144c;
    }
}
