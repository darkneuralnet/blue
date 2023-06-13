package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import co.bird.android.widget.ProgressButton;
/* renamed from: nt6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45953nt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f100991a;

    /* renamed from: b */
    public final Barrier f100992b;

    /* renamed from: c */
    public final ProgressButton f100993c;

    /* renamed from: d */
    public final View f100994d;

    /* renamed from: e */
    public final TextView f100995e;

    /* renamed from: f */
    public final Group f100996f;

    /* renamed from: g */
    public final TextView f100997g;

    public C45953nt6(ConstraintLayout constraintLayout, Barrier barrier, ProgressButton progressButton, View view, TextView textView, Group group, TextView textView2) {
        this.f100991a = constraintLayout;
        this.f100992b = barrier;
        this.f100993c = progressButton;
        this.f100994d = view;
        this.f100995e = textView;
        this.f100996f = group;
        this.f100997g = textView2;
    }

    /* renamed from: a */
    public static C45953nt6 m22236a(View view) {
        View m96312a;
        int i = C52955zi4.barrier;
        Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
        if (barrier != null) {
            i = C52955zi4.callToAction;
            ProgressButton progressButton = (ProgressButton) C34328Lp6.m96312a(view, i);
            if (progressButton != null && (m96312a = C34328Lp6.m96312a(view, (i = C52955zi4.divider))) != null) {
                i = C52955zi4.priceString;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C52955zi4.priceStringGroup;
                    Group group = (Group) C34328Lp6.m96312a(view, i);
                    if (group != null) {
                        i = C52955zi4.title;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            return new C45953nt6((ConstraintLayout) view, barrier, progressButton, m96312a, textView, group, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C45953nt6 m22234c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45268mk4.view_reservation_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m22236a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f100991a;
    }
}
