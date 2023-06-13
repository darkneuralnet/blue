package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.NestMarkerPin;
/* renamed from: qs6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47722qs6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f106021a;

    /* renamed from: b */
    public final ImageView f106022b;

    /* renamed from: c */
    public final NestMarkerPin f106023c;

    public C47722qs6(ConstraintLayout constraintLayout, ImageView imageView, NestMarkerPin nestMarkerPin) {
        this.f106021a = constraintLayout;
        this.f106022b = imageView;
        this.f106023c = nestMarkerPin;
    }

    /* renamed from: a */
    public static C47722qs6 m16820a(View view) {
        int i = C31680Ah4.icon;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C31680Ah4.pin;
            NestMarkerPin nestMarkerPin = (NestMarkerPin) C34328Lp6.m96312a(view, i);
            if (nestMarkerPin != null) {
                return new C47722qs6((ConstraintLayout) view, imageView, nestMarkerPin);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C47722qs6 m16818c(LayoutInflater layoutInflater) {
        return m16817d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C47722qs6 m16817d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_operator_warehouse_marker_selected, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m16820a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f106021a;
    }
}
