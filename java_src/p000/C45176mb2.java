package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.BatteryViewV2;
/* renamed from: mb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45176mb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f98375a;

    /* renamed from: b */
    public final BatteryViewV2 f98376b;

    /* renamed from: c */
    public final TextView f98377c;

    /* renamed from: d */
    public final TextView f98378d;

    /* renamed from: e */
    public final TextView f98379e;

    /* renamed from: f */
    public final ImageView f98380f;

    /* renamed from: g */
    public final TextView f98381g;

    /* renamed from: h */
    public final TextView f98382h;

    /* renamed from: i */
    public final TextView f98383i;

    /* renamed from: j */
    public final TextView f98384j;

    public C45176mb2(ConstraintLayout constraintLayout, BatteryViewV2 batteryViewV2, TextView textView, TextView textView2, TextView textView3, ImageView imageView, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f98375a = constraintLayout;
        this.f98376b = batteryViewV2;
        this.f98377c = textView;
        this.f98378d = textView2;
        this.f98379e = textView3;
        this.f98380f = imageView;
        this.f98381g = textView4;
        this.f98382h = textView5;
        this.f98383i = textView6;
        this.f98384j = textView7;
    }

    /* renamed from: a */
    public static C45176mb2 m25373a(View view) {
        int i = C33318Hh4.battery;
        BatteryViewV2 batteryViewV2 = (BatteryViewV2) C34328Lp6.m96312a(view, i);
        if (batteryViewV2 != null) {
            i = C33318Hh4.batteryLevel;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C33318Hh4.batterySpacer;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C33318Hh4.cancel;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C33318Hh4.clock;
                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView != null) {
                            i = C33318Hh4.code;
                            TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView4 != null) {
                                i = C33318Hh4.codeSpacer;
                                TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView5 != null) {
                                    i = C33318Hh4.timeRemaining;
                                    TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView6 != null) {
                                        i = C33318Hh4.timeSpacer;
                                        TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView7 != null) {
                                            return new C45176mb2((ConstraintLayout) view, batteryViewV2, textView, textView2, textView3, imageView, textView4, textView5, textView6, textView7);
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
    public ConstraintLayout getRoot() {
        return this.f98375a;
    }
}
