package p000;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: lK7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44434lK7 {
    /* renamed from: a */
    public static Looper m27423a(Looper looper) {
        return looper != null ? looper : m27422b();
    }

    /* renamed from: b */
    public static Looper m27422b() {
        boolean z;
        if (Looper.myLooper() != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
