package p000;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
/* renamed from: cA6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C38989cA6 {
    private C38989cA6() {
    }

    /* renamed from: a */
    public static C37803aA6 m61805a(WebSettings webSettings) {
        return C49086tA6.m12933c().m110808a(webSettings);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m61804b(WebSettings webSettings, int i) {
        EnumC47901rA6 enumC47901rA6 = EnumC47901rA6.FORCE_DARK;
        if (enumC47901rA6.m16285e()) {
            webSettings.setForceDark(i);
        } else if (enumC47901rA6.m16284f()) {
            m61805a(webSettings).m71805a(i);
        } else {
            throw EnumC47901rA6.m16288b();
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public static void m61803c(WebSettings webSettings, int i) {
        if (EnumC47901rA6.FORCE_DARK_STRATEGY.m16284f()) {
            m61805a(webSettings).m71804b(i);
            return;
        }
        throw EnumC47901rA6.m16288b();
    }
}
