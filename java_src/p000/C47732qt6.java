package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
/* renamed from: qt6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47732qt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f106039a;

    /* renamed from: b */
    public final AppCompatTextView f106040b;

    /* renamed from: c */
    public final AppCompatImageView f106041c;

    /* renamed from: d */
    public final CircularProgressIndicator f106042d;

    public C47732qt6(View view, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, CircularProgressIndicator circularProgressIndicator) {
        this.f106039a = view;
        this.f106040b = appCompatTextView;
        this.f106041c = appCompatImageView;
        this.f106042d = circularProgressIndicator;
    }

    /* renamed from: a */
    public static C47732qt6 m16806a(View view) {
        int i = C52955zi4.action;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C34328Lp6.m96312a(view, i);
        if (appCompatTextView != null) {
            i = C52955zi4.actionIcon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C34328Lp6.m96312a(view, i);
            if (appCompatImageView != null) {
                i = C52955zi4.progressCircle;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
                if (circularProgressIndicator != null) {
                    return new C47732qt6(view, appCompatTextView, appCompatImageView, circularProgressIndicator);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C47732qt6 m16805b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_ride_control, viewGroup);
            return m16806a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f106039a;
    }
}
