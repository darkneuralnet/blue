package p000;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
/* renamed from: xx2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C51917xx2 implements WD2 {

    /* renamed from: a */
    public static final Set<String> f118407a = new HashSet();

    @Override // p000.WD2
    /* renamed from: a */
    public void mo4388a(String str, Throwable th) {
        Set<String> set = f118407a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }

    /* renamed from: b */
    public void m4387b(String str, Throwable th) {
        if (C32416Dl2.f6279a) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override // p000.WD2
    public void debug(String str) {
        m4387b(str, null);
    }

    @Override // p000.WD2
    public void error(String str, Throwable th) {
        if (C32416Dl2.f6279a) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override // p000.WD2
    public void warning(String str) {
        mo4388a(str, null);
    }
}
