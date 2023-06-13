package co.bird.android.coreinterface.manager;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"Lco/bird/android/coreinterface/manager/BluetoothWakeFailure;", "Ljava/lang/Exception;", "", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "cause", "<init>", "(Ljava/lang/Throwable;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BluetoothWakeFailure extends Exception {

    /* renamed from: b */
    public final Throwable f63135b;

    public BluetoothWakeFailure(Throwable th) {
        super(th);
        this.f63135b = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f63135b;
    }
}
