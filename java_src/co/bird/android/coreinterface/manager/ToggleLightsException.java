package co.bird.android.coreinterface.manager;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/coreinterface/manager/ToggleLightsException;", "Ljava/lang/Exception;", "", "b", "Z", "getLights", "()Z", "lights", "", "c", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "cause", "<init>", "(ZLjava/lang/Throwable;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ToggleLightsException extends Exception {

    /* renamed from: b */
    public final boolean f63141b;

    /* renamed from: c */
    public final Throwable f63142c;

    public ToggleLightsException(boolean z, Throwable th) {
        super(th);
        this.f63141b = z;
        this.f63142c = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f63142c;
    }
}
