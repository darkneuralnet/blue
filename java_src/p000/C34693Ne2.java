package p000;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
/* renamed from: Ne2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34693Ne2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f24939a;

    /* renamed from: b */
    public final AppCompatTextView f24940b;

    public C34693Ne2(LinearLayout linearLayout, AppCompatTextView appCompatTextView) {
        this.f24939a = linearLayout;
        this.f24940b = appCompatTextView;
    }

    /* renamed from: a */
    public static C34693Ne2 m93611a(View view) {
        int i = C35190Ph4.header;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C34328Lp6.m96312a(view, i);
        if (appCompatTextView != null) {
            return new C34693Ne2((LinearLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f24939a;
    }
}
