package co.bird.android.coreinterface.manager;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/coreinterface/manager/LockBirdException;", "Ljava/lang/Exception;", "", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "", "c", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LockBirdException extends Exception {

    /* renamed from: b */
    public final String f63136b;

    /* renamed from: c */
    public final Throwable f63137c;

    public LockBirdException(String str, Throwable th) {
        super(str, th);
        this.f63136b = str;
        this.f63137c = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f63137c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f63136b;
    }
}
