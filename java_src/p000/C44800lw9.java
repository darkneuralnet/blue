package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzwf;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzwi;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzwl;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzyl;
import java.io.EOFException;
import java.io.IOException;
/* renamed from: lw9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44800lw9 {
    /* renamed from: a */
    public static Pv9 m26609a(Vx9 vx9) throws zzwi {
        boolean z;
        try {
            try {
                vx9.m79052q();
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return (Pv9) Tx9.f36524U.mo29592a(vx9);
            } catch (EOFException e2) {
                e = e2;
                z = false;
                if (z) {
                    return Sv9.f34502b;
                }
                throw new zzwl(e);
            }
        } catch (zzyl e3) {
            throw new zzwl(e3);
        } catch (IOException e4) {
            throw new zzwf(e4);
        } catch (NumberFormatException e5) {
            throw new zzwl(e5);
        }
    }
}
