package p000;

import android.content.Context;
import android.content.pm.PackageManager;
/* renamed from: MM6 */
/* loaded from: classes6.dex */
public final class MM6 {

    /* renamed from: c */
    public static final C42061hK6 f23008c = new C42061hK6("PackageStateCache");

    /* renamed from: a */
    public final Context f23009a;

    /* renamed from: b */
    public int f23010b = -1;

    public MM6(Context context) {
        this.f23009a = context;
    }

    /* renamed from: a */
    public final synchronized int m95397a() {
        if (this.f23010b == -1) {
            try {
                this.f23010b = this.f23009a.getPackageManager().getPackageInfo(this.f23009a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f23008c.m36537b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f23010b;
    }
}
