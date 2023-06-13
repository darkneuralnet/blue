package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.BatteryViewV2;
/* renamed from: oc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46372oc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f102190a;

    /* renamed from: b */
    public final BatteryViewV2 f102191b;

    /* renamed from: c */
    public final TextView f102192c;

    /* renamed from: d */
    public final TextView f102193d;

    /* renamed from: e */
    public final TextView f102194e;

    /* renamed from: f */
    public final ImageView f102195f;

    /* renamed from: g */
    public final ImageView f102196g;

    /* renamed from: h */
    public final TextView f102197h;

    public C46372oc2(ConstraintLayout constraintLayout, BatteryViewV2 batteryViewV2, TextView textView, TextView textView2, TextView textView3, ImageView imageView, ImageView imageView2, TextView textView4) {
        this.f102190a = constraintLayout;
        this.f102191b = batteryViewV2;
        this.f102192c = textView;
        this.f102193d = textView2;
        this.f102194e = textView3;
        this.f102195f = imageView;
        this.f102196g = imageView2;
        this.f102197h = textView4;
    }

    /* renamed from: a */
    public static C46372oc2 m20795a(View view) {
        int i = C49388th4.battery;
        BatteryViewV2 batteryViewV2 = (BatteryViewV2) C34328Lp6.m96312a(view, i);
        if (batteryViewV2 != null) {
            i = C49388th4.batteryLevel;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C49388th4.batteryShadow;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C49388th4.birdCode;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C49388th4.icon;
                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView != null) {
                            i = C49388th4.moreIcon;
                            ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView2 != null) {
                                i = C49388th4.state;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    return new C46372oc2((ConstraintLayout) view, batteryViewV2, textView, textView2, textView3, imageView, imageView2, textView4);
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
        return this.f102190a;
    }
}
