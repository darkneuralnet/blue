package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.RangeSeekBar;
/* renamed from: y31  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51975y31 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f118652a;

    /* renamed from: b */
    public final TextView f118653b;

    /* renamed from: c */
    public final TextView f118654c;

    /* renamed from: d */
    public final View f118655d;

    /* renamed from: e */
    public final RangeSeekBar f118656e;

    /* renamed from: f */
    public final TextView f118657f;

    /* renamed from: g */
    public final TextView f118658g;

    /* renamed from: h */
    public final TextView f118659h;

    /* renamed from: i */
    public final View f118660i;

    /* renamed from: j */
    public final TextView f118661j;

    /* renamed from: k */
    public final RangeSeekBar f118662k;

    public C51975y31(ConstraintLayout constraintLayout, TextView textView, TextView textView2, View view, RangeSeekBar rangeSeekBar, TextView textView3, TextView textView4, TextView textView5, View view2, TextView textView6, RangeSeekBar rangeSeekBar2) {
        this.f118652a = constraintLayout;
        this.f118653b = textView;
        this.f118654c = textView2;
        this.f118655d = view;
        this.f118656e = rangeSeekBar;
        this.f118657f = textView3;
        this.f118658g = textView4;
        this.f118659h = textView5;
        this.f118660i = view2;
        this.f118661j = textView6;
        this.f118662k = rangeSeekBar2;
    }

    /* renamed from: a */
    public static C51975y31 m4219a(View view) {
        View m96312a;
        View m96312a2;
        int i = C36585Vg4.filterRangeMaxLabel;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.filterRangeMinLabel;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null && (m96312a = C34328Lp6.m96312a(view, (i = C36585Vg4.signalDivider))) != null) {
                i = C36585Vg4.signalRangeSeekbar;
                RangeSeekBar rangeSeekBar = (RangeSeekBar) C34328Lp6.m96312a(view, i);
                if (rangeSeekBar != null) {
                    i = C36585Vg4.signalStrengthLabel;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C36585Vg4.title;
                        TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView4 != null) {
                            i = C36585Vg4.updateFrequency;
                            TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView5 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C36585Vg4.updateFrequencyDivider))) != null) {
                                i = C36585Vg4.updateFrequencyLabel;
                                TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView6 != null) {
                                    i = C36585Vg4.updateFrequencyRangeSeekbar;
                                    RangeSeekBar rangeSeekBar2 = (RangeSeekBar) C34328Lp6.m96312a(view, i);
                                    if (rangeSeekBar2 != null) {
                                        return new C51975y31((ConstraintLayout) view, textView, textView2, m96312a, rangeSeekBar, textView3, textView4, textView5, m96312a2, textView6, rangeSeekBar2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C51975y31 m4217c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.dialog_nearby_birds_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m4219a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f118652a;
    }
}
