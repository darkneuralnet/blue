package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import co.bird.android.widget.BatteryView;
import co.bird.android.widget.InfoPillConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
/* renamed from: Vp6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36668Vp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f39809a;

    /* renamed from: b */
    public final BatteryView f39810b;

    /* renamed from: c */
    public final Group f39811c;

    /* renamed from: d */
    public final TextView f39812d;

    /* renamed from: e */
    public final InfoPillConstraintLayout f39813e;

    /* renamed from: f */
    public final ImageView f39814f;

    /* renamed from: g */
    public final ImageView f39815g;

    /* renamed from: h */
    public final ImageView f39816h;

    /* renamed from: i */
    public final ShapeableImageView f39817i;

    /* renamed from: j */
    public final TextView f39818j;

    public C36668Vp6(FrameLayout frameLayout, BatteryView batteryView, Group group, TextView textView, InfoPillConstraintLayout infoPillConstraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ShapeableImageView shapeableImageView, TextView textView2) {
        this.f39809a = frameLayout;
        this.f39810b = batteryView;
        this.f39811c = group;
        this.f39812d = textView;
        this.f39813e = infoPillConstraintLayout;
        this.f39814f = imageView;
        this.f39815g = imageView2;
        this.f39816h = imageView3;
        this.f39817i = shapeableImageView;
        this.f39818j = textView2;
    }

    /* renamed from: a */
    public static C36668Vp6 m79383a(View view) {
        int i = C31680Ah4.batteryIcon;
        BatteryView batteryView = (BatteryView) C34328Lp6.m96312a(view, i);
        if (batteryView != null) {
            i = C31680Ah4.batteryInfoContainer;
            Group group = (Group) C34328Lp6.m96312a(view, i);
            if (group != null) {
                i = C31680Ah4.code;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C31680Ah4.largeContainer;
                    InfoPillConstraintLayout infoPillConstraintLayout = (InfoPillConstraintLayout) C34328Lp6.m96312a(view, i);
                    if (infoPillConstraintLayout != null) {
                        i = C31680Ah4.largeDamagedBadge;
                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView != null) {
                            i = C31680Ah4.largeDispatchBadge;
                            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView2 != null) {
                                i = C31680Ah4.largeIcon;
                                ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                if (imageView3 != null) {
                                    i = C31680Ah4.largeIconBackground;
                                    ShapeableImageView shapeableImageView = (ShapeableImageView) C34328Lp6.m96312a(view, i);
                                    if (shapeableImageView != null) {
                                        i = C31680Ah4.percentage;
                                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView2 != null) {
                                            return new C36668Vp6((FrameLayout) view, batteryView, group, textView, infoPillConstraintLayout, imageView, imageView2, imageView3, shapeableImageView, textView2);
                                        }
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
    public static C36668Vp6 m79381c(LayoutInflater layoutInflater) {
        return m79380d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C36668Vp6 m79380d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45258mj4.view_charge_marker_selected, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79383a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f39809a;
    }
}
