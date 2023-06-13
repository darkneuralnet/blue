package p000;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
/* renamed from: mc1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45185mc1 {
    private C45185mc1() {
    }

    /* renamed from: a */
    public static InterfaceC44592lc1 m25316a(CamcorderProfile camcorderProfile) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            C33928Jx2.m99522l("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return C34206Lc1.m96597a(camcorderProfile);
    }

    /* renamed from: b */
    public static InterfaceC44592lc1 m25315b(EncoderProfiles encoderProfiles) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return C33972Kc1.m98691a(encoderProfiles);
        }
        if (i >= 31) {
            return C33036Gc1.m104972a(encoderProfiles);
        }
        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i + ". Version 31 or higher required.");
    }
}
