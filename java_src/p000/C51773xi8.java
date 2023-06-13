package p000;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
/* renamed from: xi8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51773xi8 {

    /* renamed from: a */
    public final C35248Pn8 f118008a;

    public C51773xi8(C42162hV8 c42162hV8) {
        this.f118008a = c42162hV8.m36293c0();
    }

    @VisibleForTesting
    /* renamed from: a */
    public final boolean m4801a() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.f118008a.mo22255z());
            if (packageManager == null) {
                this.f118008a.mo22258a().m106889s().m42708a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (packageManager.getPackageInfo("com.android.vending", 128).versionCode < 80837300) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            this.f118008a.mo22258a().m106889s().m42707b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
