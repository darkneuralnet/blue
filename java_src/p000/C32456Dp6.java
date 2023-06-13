package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.NestMarkerPin;
/* renamed from: Dp6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32456Dp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f6404a;

    /* renamed from: b */
    public final TextView f6405b;

    /* renamed from: c */
    public final ImageView f6406c;

    /* renamed from: d */
    public final NestMarkerPin f6407d;

    public C32456Dp6(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, NestMarkerPin nestMarkerPin) {
        this.f6404a = constraintLayout;
        this.f6405b = textView;
        this.f6406c = imageView;
        this.f6407d = nestMarkerPin;
    }

    /* renamed from: a */
    public static C32456Dp6 m109875a(View view) {
        int i = C31680Ah4.capacity;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C31680Ah4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C31680Ah4.pin;
                NestMarkerPin nestMarkerPin = (NestMarkerPin) C34328Lp6.m96312a(view, i);
                if (nestMarkerPin != null) {
                    return new C32456Dp6((ConstraintLayout) view, textView, imageView, nestMarkerPin);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C32456Dp6 m109873c(LayoutInflater layoutInflater) {
        return m109872d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C32456Dp6 m109872d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_area_marker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109875a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f6404a;
    }
}
