package p000;

import android.util.Log;
/* renamed from: je6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C43431je6 {

    /* renamed from: a */
    public static final String f93100a = "je6";

    /* renamed from: b */
    public static Class<?> f93101b;

    /* renamed from: a */
    public static void m30141a() {
        m30139c("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    /* renamed from: b */
    public static void m30140b(String str) {
        m30139c("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    /* renamed from: c */
    public static void m30139c(String str, String str2, String str3) {
        try {
            if (f93101b == null) {
                f93101b = Class.forName("com.unity3d.player.UnityPlayer");
            }
            f93101b.getMethod("UnitySendMessage", String.class, String.class, String.class).invoke(f93101b, str, str2, str3);
        } catch (Exception e) {
            Log.e(f93100a, "Failed to send message to Unity", e);
        }
    }
}
