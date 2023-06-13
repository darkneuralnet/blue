package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
/* renamed from: nc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45779nc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f100205a;

    /* renamed from: b */
    public final View f100206b;

    /* renamed from: c */
    public final TextView f100207c;

    /* renamed from: d */
    public final Group f100208d;

    /* renamed from: e */
    public final TextView f100209e;

    /* renamed from: f */
    public final TextView f100210f;

    /* renamed from: g */
    public final TextView f100211g;

    public C45779nc2(ConstraintLayout constraintLayout, View view, TextView textView, Group group, TextView textView2, TextView textView3, TextView textView4) {
        this.f100205a = constraintLayout;
        this.f100206b = view;
        this.f100207c = textView;
        this.f100208d = group;
        this.f100209e = textView2;
        this.f100210f = textView3;
        this.f100211g = textView4;
    }

    /* renamed from: a */
    public static C45779nc2 m23435a(View view) {
        int i = C49388th4.divider;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            i = C49388th4.failedCount;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C49388th4.failedGroup;
                Group group = (Group) C34328Lp6.m96312a(view, i);
                if (group != null) {
                    i = C49388th4.failedHibernationLabel;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C49388th4.scannedCount;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            i = C49388th4.totalScannedLabel;
                            TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView4 != null) {
                                return new C45779nc2((ConstraintLayout) view, m96312a, textView, group, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f100205a;
    }
}
