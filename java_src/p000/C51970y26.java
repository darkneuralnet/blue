package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.atomic.AtomicReference;
@KeepForSdk
/* renamed from: y26  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51970y26 {
    private C51970y26() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m4229a(AtomicReference<Boolean> atomicReference, String str) {
        boolean z;
        if (atomicReference.get() != null) {
            return atomicReference.get().booleanValue();
        }
        if (DynamiteModule.m51595a(C52226yU2.m3451c().m3452b(), str) > 0) {
            z = true;
        } else {
            z = false;
        }
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }
}
