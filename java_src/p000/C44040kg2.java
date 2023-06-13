package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.BatteryViewV2;
/* renamed from: kg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44040kg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f94769a;

    /* renamed from: b */
    public final BatteryViewV2 f94770b;

    /* renamed from: c */
    public final TextView f94771c;

    /* renamed from: d */
    public final TextView f94772d;

    /* renamed from: e */
    public final ImageView f94773e;

    public C44040kg2(ConstraintLayout constraintLayout, BatteryViewV2 batteryViewV2, TextView textView, TextView textView2, ImageView imageView) {
        this.f94769a = constraintLayout;
        this.f94770b = batteryViewV2;
        this.f94771c = textView;
        this.f94772d = textView2;
        this.f94773e = imageView;
    }

    /* renamed from: a */
    public static C44040kg2 m28653a(View view) {
        int i = C42876ii4.battery;
        BatteryViewV2 batteryViewV2 = (BatteryViewV2) C34328Lp6.m96312a(view, i);
        if (batteryViewV2 != null) {
            i = C42876ii4.batteryText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C42876ii4.code;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C42876ii4.icon;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        return new C44040kg2((ConstraintLayout) view, batteryViewV2, textView, textView2, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f94769a;
    }
}
