package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
/* renamed from: st6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48917st6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f109454a;

    /* renamed from: b */
    public final AppCompatImageView f109455b;

    /* renamed from: c */
    public final Barrier f109456c;

    /* renamed from: d */
    public final TextView f109457d;

    /* renamed from: e */
    public final TextView f109458e;

    public C48917st6(View view, AppCompatImageView appCompatImageView, Barrier barrier, TextView textView, TextView textView2) {
        this.f109454a = view;
        this.f109455b = appCompatImageView;
        this.f109456c = barrier;
        this.f109457d = textView;
        this.f109458e = textView2;
    }

    /* renamed from: a */
    public static C48917st6 m13549a(View view) {
        int i = C36126Th4.icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C34328Lp6.m96312a(view, i);
        if (appCompatImageView != null) {
            i = C36126Th4.startBarrier;
            Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
            if (barrier != null) {
                i = C36126Th4.subtitle;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C36126Th4.title;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C48917st6(view, appCompatImageView, barrier, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C48917st6 m13548b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C33102Gj4.view_ride_pass_banner, viewGroup);
            return m13549a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f109454a;
    }
}
