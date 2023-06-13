package p000;

import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzck;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcn;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzcq;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzeq;
import java.io.EOFException;
import java.io.IOException;
/* renamed from: b08  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38298b08 {
    /* renamed from: a */
    public static C51629xT7 m65123a(C37003Xa8 c37003Xa8) throws zzcn {
        boolean z;
        try {
            try {
                c37003Xa8.m76825q();
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return (C51629xT7) C50507va8.f114324U.mo7460a(c37003Xa8);
            } catch (EOFException e2) {
                e = e2;
                z = false;
                if (z) {
                    return VT7.f39133b;
                }
                throw new zzcq(e);
            }
        } catch (zzeq e3) {
            throw new zzcq(e3);
        } catch (IOException e4) {
            throw new zzck(e4);
        } catch (NumberFormatException e5) {
            throw new zzcq(e5);
        }
    }
}
