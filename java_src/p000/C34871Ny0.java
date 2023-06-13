package p000;
/* renamed from: Ny0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34871Ny0 {
    /* renamed from: a */
    public static String m93163a(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", m93160d(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    /* renamed from: b */
    public static String m93162b(String str, String str2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", m93160d(str, str2), "perf-android-sdk", "android-ide");
    }

    /* renamed from: c */
    public static String m93161c(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", m93160d(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    /* renamed from: d */
    public static String m93160d(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", str, str2);
    }
}
