package p000;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import co.bird.android.widget.BatteryView;
/* renamed from: ud2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49939ud2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f112674a;

    /* renamed from: b */
    public final TextView f112675b;

    /* renamed from: c */
    public final BatteryView f112676c;

    /* renamed from: d */
    public final LinearLayout f112677d;

    /* renamed from: e */
    public final TextView f112678e;

    /* renamed from: f */
    public final LinearLayout f112679f;

    /* renamed from: g */
    public final Button f112680g;

    /* renamed from: h */
    public final ImageView f112681h;

    /* renamed from: i */
    public final TextView f112682i;

    /* renamed from: j */
    public final ImageView f112683j;

    /* renamed from: k */
    public final FrameLayout f112684k;

    public C49939ud2(LinearLayout linearLayout, TextView textView, BatteryView batteryView, LinearLayout linearLayout2, TextView textView2, LinearLayout linearLayout3, Button button, ImageView imageView, TextView textView3, ImageView imageView2, FrameLayout frameLayout) {
        this.f112674a = linearLayout;
        this.f112675b = textView;
        this.f112676c = batteryView;
        this.f112677d = linearLayout2;
        this.f112678e = textView2;
        this.f112679f = linearLayout3;
        this.f112680g = button;
        this.f112681h = imageView;
        this.f112682i = textView3;
        this.f112683j = imageView2;
        this.f112684k = frameLayout;
    }

    /* renamed from: a */
    public static C49939ud2 m9944a(View view) {
        int i = C32148Ch4.batteryLevel;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C32148Ch4.batteryPercent;
            BatteryView batteryView = (BatteryView) C34328Lp6.m96312a(view, i);
            if (batteryView != null) {
                i = C32148Ch4.batteryView;
                LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                if (linearLayout != null) {
                    i = C32148Ch4.range;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C32148Ch4.rangeView;
                        LinearLayout linearLayout2 = (LinearLayout) C34328Lp6.m96312a(view, i);
                        if (linearLayout2 != null) {
                            i = C32148Ch4.reserve;
                            Button button = (Button) C34328Lp6.m96312a(view, i);
                            if (button != null) {
                                i = C32148Ch4.thunder;
                                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                if (imageView != null) {
                                    i = C32148Ch4.vehicleIdentifier;
                                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView3 != null) {
                                        i = C32148Ch4.vehicleImage;
                                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                        if (imageView2 != null) {
                                            i = C32148Ch4.vehicleInfoContainer;
                                            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                                            if (frameLayout != null) {
                                                return new C49939ud2((LinearLayout) view, textView, batteryView, linearLayout, textView2, linearLayout2, button, imageView, textView3, imageView2, frameLayout);
                                            }
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

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f112674a;
    }
}
