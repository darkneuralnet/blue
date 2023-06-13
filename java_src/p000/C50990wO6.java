package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
/* renamed from: wO6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50990wO6 {

    /* renamed from: a */
    public final Context f115895a;

    public C50990wO6(Context context) {
        this.f115895a = context;
    }

    @Nullable
    /* renamed from: b */
    public static String m6898b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Context m6899a() {
        return this.f115895a;
    }
}
