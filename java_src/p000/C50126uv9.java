package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
/* renamed from: uv9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50126uv9 {

    /* renamed from: a */
    public static final C51459xA8 f113215a = new C51459xA8("PhoneskyVerificationUtils");

    /* renamed from: a */
    public static boolean m9484a(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (r0 = signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        String m77727a = Wt9.m77727a(signature.toByteArray());
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(m77727a)) {
                            if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(m77727a)) {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    }
                } else {
                    f113215a.m5750e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
