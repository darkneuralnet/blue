package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
/* renamed from: KD3 */
/* loaded from: classes.dex */
public class KD3 {

    /* renamed from: a */
    public static final String f19295a = AbstractC32056Bx2.m113270i("PackageManagerHelper");

    private KD3() {
    }

    /* renamed from: a */
    public static void m99070a(Context context, Class<?> cls, boolean z) {
        int i;
        String str;
        String str2 = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str3 = f19295a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            if (z) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            sb.append(str);
            m113272e.mo113269a(str3, sb.toString());
        } catch (Exception e) {
            AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
            String str4 = f19295a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (!z) {
                str2 = "disabled";
            }
            sb2.append(str2);
            m113272e2.mo113268b(str4, sb2.toString(), e);
        }
    }
}
