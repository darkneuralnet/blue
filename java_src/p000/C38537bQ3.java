package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
/* renamed from: bQ3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38537bQ3 {

    /* renamed from: a */
    public final C52025y81 f57476a;

    /* renamed from: b */
    public final DynamicLinkData f57477b;

    @VisibleForTesting
    @KeepForSdk
    public C38537bQ3(DynamicLinkData dynamicLinkData) {
        if (dynamicLinkData == null) {
            this.f57477b = null;
            this.f57476a = null;
            return;
        }
        if (dynamicLinkData.m47302s() == 0) {
            dynamicLinkData.m47303L(DefaultClock.getInstance().currentTimeMillis());
        }
        this.f57477b = dynamicLinkData;
        this.f57476a = new C52025y81(dynamicLinkData);
    }

    /* renamed from: a */
    public Uri m64544a() {
        String m47301u;
        DynamicLinkData dynamicLinkData = this.f57477b;
        if (dynamicLinkData == null || (m47301u = dynamicLinkData.m47301u()) == null) {
            return null;
        }
        return Uri.parse(m47301u);
    }

    /* renamed from: b */
    public int m64543b() {
        DynamicLinkData dynamicLinkData = this.f57477b;
        if (dynamicLinkData == null) {
            return 0;
        }
        return dynamicLinkData.m47305F();
    }

    @VisibleForTesting
    /* renamed from: c */
    public Uri m64542c() {
        DynamicLinkData dynamicLinkData = this.f57477b;
        if (dynamicLinkData == null) {
            return null;
        }
        return dynamicLinkData.m47304K();
    }

    /* renamed from: d */
    public Intent m64541d(Context context) {
        if (m64543b() == 0) {
            return null;
        }
        try {
            if (context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0).versionCode < m64543b() && m64542c() != null) {
                return new Intent("android.intent.action.VIEW").setData(m64542c()).setPackage("com.android.vending");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
