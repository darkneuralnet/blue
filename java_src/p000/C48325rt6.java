package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import co.bird.android.widget.BatteryView;
import co.bird.android.widget.CountdownView;
/* renamed from: rt6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48325rt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f107842a;

    /* renamed from: b */
    public final TextView f107843b;

    /* renamed from: c */
    public final BatteryView f107844c;

    /* renamed from: d */
    public final LinearLayout f107845d;

    /* renamed from: e */
    public final TextView f107846e;

    /* renamed from: f */
    public final CountdownView f107847f;

    /* renamed from: g */
    public final TextView f107848g;

    /* renamed from: h */
    public final TextView f107849h;

    /* renamed from: i */
    public final LinearLayout f107850i;

    /* renamed from: j */
    public final ImageView f107851j;

    public C48325rt6(View view, TextView textView, BatteryView batteryView, LinearLayout linearLayout, TextView textView2, CountdownView countdownView, TextView textView3, TextView textView4, LinearLayout linearLayout2, ImageView imageView) {
        this.f107842a = view;
        this.f107843b = textView;
        this.f107844c = batteryView;
        this.f107845d = linearLayout;
        this.f107846e = textView2;
        this.f107847f = countdownView;
        this.f107848g = textView3;
        this.f107849h = textView4;
        this.f107850i = linearLayout2;
        this.f107851j = imageView;
    }

    /* renamed from: a */
    public static C48325rt6 m15115a(View view) {
        int i = C52955zi4.batteryLevel;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C52955zi4.batteryPercent;
            BatteryView batteryView = (BatteryView) C34328Lp6.m96312a(view, i);
            if (batteryView != null) {
                i = C52955zi4.batteryView;
                LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                if (linearLayout != null) {
                    i = C52955zi4.clock;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C52955zi4.countDownClock;
                        CountdownView countdownView = (CountdownView) C34328Lp6.m96312a(view, i);
                        if (countdownView != null) {
                            i = C52955zi4.distance;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                i = C52955zi4.range;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    i = C52955zi4.rangeView;
                                    LinearLayout linearLayout2 = (LinearLayout) C34328Lp6.m96312a(view, i);
                                    if (linearLayout2 != null) {
                                        i = C52955zi4.thunder;
                                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                        if (imageView != null) {
                                            return new C48325rt6(view, textView, batteryView, linearLayout, textView2, countdownView, textView3, textView4, linearLayout2, imageView);
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

    /* renamed from: b */
    public static C48325rt6 m15114b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_ride_details, viewGroup);
            return m15115a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f107842a;
    }
}
