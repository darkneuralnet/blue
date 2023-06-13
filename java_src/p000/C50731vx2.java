package p000;

import android.util.Log;
/* renamed from: vx2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C50731vx2 {

    /* renamed from: a */
    public static C50731vx2 f114936a;

    private C50731vx2() {
    }

    /* renamed from: c */
    public static synchronized C50731vx2 m7714c() {
        C50731vx2 c50731vx2;
        synchronized (C50731vx2.class) {
            if (f114936a == null) {
                f114936a = new C50731vx2();
            }
            c50731vx2 = f114936a;
        }
        return c50731vx2;
    }

    /* renamed from: a */
    public void m7716a(String str) {
        Log.d("FirebasePerformance", str);
    }

    /* renamed from: b */
    public void m7715b(String str) {
        Log.e("FirebasePerformance", str);
    }

    /* renamed from: d */
    public void m7713d(String str) {
        Log.i("FirebasePerformance", str);
    }

    /* renamed from: e */
    public void m7712e(String str) {
        Log.w("FirebasePerformance", str);
    }
}
