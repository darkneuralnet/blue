package p000;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
/* renamed from: Tm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36169Tm2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f36057a;

    /* renamed from: b */
    public final ImageView f36058b;

    /* renamed from: c */
    public final View f36059c;

    /* renamed from: d */
    public final AppCompatEditText f36060d;

    public C36169Tm2(View view, ImageView imageView, View view2, AppCompatEditText appCompatEditText) {
        this.f36057a = view;
        this.f36058b = imageView;
        this.f36059c = view2;
        this.f36060d = appCompatEditText;
    }

    /* renamed from: a */
    public static C36169Tm2 m82980a(View view) {
        View m96312a;
        int i = C34488Mh4.scanQR;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null && (m96312a = C34328Lp6.m96312a(view, (i = C34488Mh4.searchContainer))) != null) {
            i = C34488Mh4.searchText;
            AppCompatEditText appCompatEditText = (AppCompatEditText) C34328Lp6.m96312a(view, i);
            if (appCompatEditText != null) {
                return new C36169Tm2(view, imageView, m96312a, appCompatEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f36057a;
    }
}
