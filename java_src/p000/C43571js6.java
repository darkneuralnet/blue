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
/* renamed from: js6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43571js6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f93489a;

    /* renamed from: b */
    public final NestBadgeView f93490b;

    /* renamed from: c */
    public final TextView f93491c;

    /* renamed from: d */
    public final ImageView f93492d;

    /* renamed from: e */
    public final NestMarkerPin f93493e;

    /* renamed from: f */
    public final ProgressBar f93494f;

    public C43571js6(ConstraintLayout constraintLayout, NestBadgeView nestBadgeView, TextView textView, ImageView imageView, NestMarkerPin nestMarkerPin, ProgressBar progressBar) {
        this.f93489a = constraintLayout;
        this.f93490b = nestBadgeView;
        this.f93491c = textView;
        this.f93492d = imageView;
        this.f93493e = nestMarkerPin;
        this.f93494f = progressBar;
    }

    /* renamed from: a */
    public static C43571js6 m29800a(View view) {
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
                            return new C43571js6((ConstraintLayout) view, nestBadgeView, textView, imageView, nestMarkerPin, progressBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C43571js6 m29798c(LayoutInflater layoutInflater) {
        return m29797d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C43571js6 m29797d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_operator_nest_marker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m29800a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f93489a;
    }
}
