package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.BatteryViewV2;
/* renamed from: Sb2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35836Sb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f33941a;

    /* renamed from: b */
    public final BatteryViewV2 f33942b;

    /* renamed from: c */
    public final TextView f33943c;

    /* renamed from: d */
    public final TextView f33944d;

    /* renamed from: e */
    public final ImageView f33945e;

    /* renamed from: f */
    public final ImageView f33946f;

    /* renamed from: g */
    public final TextView f33947g;

    /* renamed from: h */
    public final TextView f33948h;

    public C35836Sb2(ConstraintLayout constraintLayout, BatteryViewV2 batteryViewV2, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, TextView textView3, TextView textView4) {
        this.f33941a = constraintLayout;
        this.f33942b = batteryViewV2;
        this.f33943c = textView;
        this.f33944d = textView2;
        this.f33945e = imageView;
        this.f33946f = imageView2;
        this.f33947g = textView3;
        this.f33948h = textView4;
    }

    /* renamed from: a */
    public static C35836Sb2 m85209a(View view) {
        int i = C52955zi4.battery;
        BatteryViewV2 batteryViewV2 = (BatteryViewV2) C34328Lp6.m96312a(view, i);
        if (batteryViewV2 != null) {
            i = C52955zi4.batteryText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C52955zi4.code;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C52955zi4.more;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C52955zi4.statusIcon;
                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView2 != null) {
                            i = C52955zi4.statusTitle;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                i = C52955zi4.subtitle;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    return new C35836Sb2((ConstraintLayout) view, batteryViewV2, textView, textView2, imageView, imageView2, textView3, textView4);
                                }
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
        return this.f33941a;
    }
}
