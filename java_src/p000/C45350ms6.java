package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.NestBadgeView;
import co.bird.android.widget.NestMarkerPin;
/* renamed from: ms6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45350ms6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f98967a;

    /* renamed from: b */
    public final NestBadgeView f98968b;

    /* renamed from: c */
    public final TextView f98969c;

    /* renamed from: d */
    public final ImageView f98970d;

    /* renamed from: e */
    public final NestMarkerPin f98971e;

    /* renamed from: f */
    public final ProgressBar f98972f;

    public C45350ms6(ConstraintLayout constraintLayout, NestBadgeView nestBadgeView, TextView textView, ImageView imageView, NestMarkerPin nestMarkerPin, ProgressBar progressBar) {
        this.f98967a = constraintLayout;
        this.f98968b = nestBadgeView;
        this.f98969c = textView;
        this.f98970d = imageView;
        this.f98971e = nestMarkerPin;
        this.f98972f = progressBar;
    }

    /* renamed from: a */
    public static C45350ms6 m24785a(View view) {
        int i = C31680Ah4.badge;
        NestBadgeView nestBadgeView = (NestBadgeView) C34328Lp6.m96312a(view, i);
        if (nestBadgeView != null) {
            i = C31680Ah4.capacity;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C31680Ah4.icon;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C31680Ah4.pin;
                    NestMarkerPin nestMarkerPin = (NestMarkerPin) C34328Lp6.m96312a(view, i);
                    if (nestMarkerPin != null) {
                        i = C31680Ah4.progress;
                        ProgressBar progressBar = (ProgressBar) C34328Lp6.m96312a(view, i);
                        if (progressBar != null) {
                            return new C45350ms6((ConstraintLayout) view, nestBadgeView, textView, imageView, nestMarkerPin, progressBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C45350ms6 m24783c(LayoutInflater layoutInflater) {
        return m24782d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C45350ms6 m24782d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_operator_nest_marker_selected, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m24785a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f98967a;
    }
}
