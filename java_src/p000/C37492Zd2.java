package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.FilterSeekBar;
/* renamed from: Zd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37492Zd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f48852a;

    /* renamed from: b */
    public final FilterSeekBar f48853b;

    /* renamed from: c */
    public final TextView f48854c;

    /* renamed from: d */
    public final TextView f48855d;

    public C37492Zd2(ConstraintLayout constraintLayout, FilterSeekBar filterSeekBar, TextView textView, TextView textView2) {
        this.f48852a = constraintLayout;
        this.f48853b = filterSeekBar;
        this.f48854c = textView;
        this.f48855d = textView2;
    }

    /* renamed from: a */
    public static C37492Zd2 m72846a(View view) {
        int i = C45238mh4.filterSeekBar;
        FilterSeekBar filterSeekBar = (FilterSeekBar) C34328Lp6.m96312a(view, i);
        if (filterSeekBar != null) {
            i = C45238mh4.max;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C45238mh4.min;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C37492Zd2((ConstraintLayout) view, filterSeekBar, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f48852a;
    }
}
