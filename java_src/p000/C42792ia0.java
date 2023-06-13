package p000;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
/* renamed from: ia0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42792ia0 implements InterfaceC43999kc1 {

    /* renamed from: a */
    public final boolean f87478a;

    /* renamed from: b */
    public final String f87479b;

    /* renamed from: c */
    public final int f87480c;

    /* renamed from: ia0$a */
    /* loaded from: classes.dex */
    public static class C23286a {
        private C23286a() {
        }

        /* renamed from: a */
        public static EncoderProfiles m33800a(String str, int i) {
            EncoderProfiles all;
            all = CamcorderProfile.getAll(str, i);
            return all;
        }
    }

    public C42792ia0(String str) {
        boolean z;
        int i;
        this.f87479b = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            C33928Jx2.m99522l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z = false;
            i = -1;
        }
        this.f87478a = z;
        this.f87480c = i;
    }

    @Override // p000.InterfaceC43999kc1
    /* renamed from: a */
    public InterfaceC44592lc1 mo28797a(int i) {
        if (!this.f87478a || !CamcorderProfile.hasProfile(this.f87480c, i)) {
            return null;
        }
        return m33801d(i);
    }

    @Override // p000.InterfaceC43999kc1
    /* renamed from: b */
    public boolean mo28796b(int i) {
        if (!this.f87478a) {
            return false;
        }
        return CamcorderProfile.hasProfile(this.f87480c, i);
    }

    /* renamed from: c */
    public final InterfaceC44592lc1 m33802c(int i) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.f87480c, i);
        } catch (RuntimeException e) {
            C33928Jx2.m99521m("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + i, e);
            camcorderProfile = null;
        }
        if (camcorderProfile == null) {
            return null;
        }
        return C45185mc1.m25316a(camcorderProfile);
    }

    /* renamed from: d */
    public final InterfaceC44592lc1 m33801d(int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles m33800a = C23286a.m33800a(this.f87479b, i);
            if (m33800a == null) {
                return null;
            }
            if (S21.m86079a(C43716k72.class) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C33928Jx2.m99533a("Camera2EncoderProfilesProvider", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return C45185mc1.m25315b(m33800a);
                } catch (NullPointerException e) {
                    C33928Jx2.m99521m("Camera2EncoderProfilesProvider", "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e);
                }
            }
        }
        return m33802c(i);
    }
}
