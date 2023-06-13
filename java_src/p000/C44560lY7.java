package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import com.google.android.libraries.intelligence.acceleration.AndroidSystemDetectionJNI;
/* renamed from: lY7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44560lY7 {
    /* renamed from: a */
    public static C35814Ry7 m27161a() {
        byte[] GetDeviceInfo = AndroidSystemDetectionJNI.GetDeviceInfo();
        if (GetDeviceInfo == null) {
            return null;
        }
        try {
            return C35814Ry7.m86151E(GetDeviceInfo, C53068zt7.m154a());
        } catch (zzaqw e) {
            throw new C39745dQ7(C35814Ry7.class.getName(), e);
        }
    }

    /* renamed from: b */
    public static C33483Hz7 m27160b() {
        byte[] GetNNAPIInfo = AndroidSystemDetectionJNI.GetNNAPIInfo();
        if (GetNNAPIInfo == null) {
            return null;
        }
        try {
            return C33483Hz7.m103092E(GetNNAPIInfo, C53068zt7.m154a());
        } catch (zzaqw e) {
            throw new C39745dQ7(C33483Hz7.class.getName(), e);
        }
    }
}
