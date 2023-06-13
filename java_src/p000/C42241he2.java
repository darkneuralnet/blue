package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: he2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42241he2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f85623a;

    /* renamed from: b */
    public final TextView f85624b;

    /* renamed from: c */
    public final ImageView f85625c;

    /* renamed from: d */
    public final TextView f85626d;

    public C42241he2(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f85623a = constraintLayout;
        this.f85624b = textView;
        this.f85625c = imageView;
        this.f85626d = textView2;
    }

    /* renamed from: a */
    public static C42241he2 m36120a(View view) {
        int i = C39912di4.calendarHint;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.calendarIcon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C39912di4.dates;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C42241he2((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f85623a;
    }
}
