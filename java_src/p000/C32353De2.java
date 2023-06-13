package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
/* renamed from: De2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32353De2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f6125a;

    /* renamed from: b */
    public final RadioButton f6126b;

    public C32353De2(FrameLayout frameLayout, RadioButton radioButton) {
        this.f6125a = frameLayout;
        this.f6126b = radioButton;
    }

    /* renamed from: a */
    public static C32353De2 m110071a(View view) {
        int i = C34956Oh4.preloadOption;
        RadioButton radioButton = (RadioButton) C34328Lp6.m96312a(view, i);
        if (radioButton != null) {
            return new C32353De2((FrameLayout) view, radioButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f6125a;
    }
}
