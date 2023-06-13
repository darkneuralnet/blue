package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import co.bird.android.widget.InfoPillConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
/* renamed from: Up6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36434Up6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f38088a;

    /* renamed from: b */
    public final TextView f38089b;

    /* renamed from: c */
    public final TextView f38090c;

    /* renamed from: d */
    public final InfoPillConstraintLayout f38091d;

    /* renamed from: e */
    public final ImageView f38092e;

    /* renamed from: f */
    public final ImageView f38093f;

    /* renamed from: g */
    public final ImageView f38094g;

    /* renamed from: h */
    public final ShapeableImageView f38095h;

    public C36434Up6(FrameLayout frameLayout, TextView textView, TextView textView2, InfoPillConstraintLayout infoPillConstraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ShapeableImageView shapeableImageView) {
        this.f38088a = frameLayout;
        this.f38089b = textView;
        this.f38090c = textView2;
        this.f38091d = infoPillConstraintLayout;
        this.f38092e = imageView;
        this.f38093f = imageView2;
        this.f38094g = imageView3;
        this.f38095h = shapeableImageView;
    }

    /* renamed from: a */
    public static C36434Up6 m80780a(View view) {
        int i = C31680Ah4.amount;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C31680Ah4.brand;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C31680Ah4.smallContainer;
                InfoPillConstraintLayout infoPillConstraintLayout = (InfoPillConstraintLayout) C34328Lp6.m96312a(view, i);
                if (infoPillConstraintLayout != null) {
                    i = C31680Ah4.smallDamagedBadge;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C31680Ah4.smallDispatchBadge;
                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView2 != null) {
                            i = C31680Ah4.smallIcon;
                            ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView3 != null) {
                                i = C31680Ah4.smallIconBackground;
                                ShapeableImageView shapeableImageView = (ShapeableImageView) C34328Lp6.m96312a(view, i);
                                if (shapeableImageView != null) {
                                    return new C36434Up6((FrameLayout) view, textView, textView2, infoPillConstraintLayout, imageView, imageView2, imageView3, shapeableImageView);
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
    public static C36434Up6 m80778c(LayoutInflater layoutInflater) {
        return m80777d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C36434Up6 m80777d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_charge_marker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m80780a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f38088a;
    }
}
