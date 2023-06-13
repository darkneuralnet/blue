package p000;

import android.os.Handler;
import android.os.Looper;
/* renamed from: UO7 */
/* loaded from: classes5.dex */
public final class UO7 extends Handler {

    /* renamed from: a */
    public final Looper f37331a;

    public UO7() {
        this.f37331a = Looper.getMainLooper();
    }

    public UO7(Looper looper) {
        super(looper);
        this.f37331a = Looper.getMainLooper();
    }
}
