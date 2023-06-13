package p000;

import android.content.Context;
/* renamed from: SO6 */
/* loaded from: classes6.dex */
public final class SO6 {

    /* renamed from: c */
    public static final C42061hK6 f33613c = new C42061hK6("SplitInstallInfoProvider");

    /* renamed from: a */
    public final Context f33614a;

    /* renamed from: b */
    public final String f33615b;

    public SO6(Context context) {
        this.f33614a = context;
        this.f33615b = context.getPackageName();
    }

    /* renamed from: a */
    public static boolean m85526a(String str) {
        return str.startsWith("config.");
    }

    /* renamed from: b */
    public static boolean m85525b(String str) {
        return m85526a(str) || str.contains(".config.");
    }
}
