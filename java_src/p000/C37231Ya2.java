package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.BatteryView;
/* renamed from: Ya2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37231Ya2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f46030a;

    /* renamed from: b */
    public final LinearLayout f46031b;

    /* renamed from: c */
    public final TextView f46032c;

    /* renamed from: d */
    public final BatteryView f46033d;

    /* renamed from: e */
    public final TextView f46034e;

    public C37231Ya2(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, BatteryView batteryView, TextView textView2) {
        this.f46030a = constraintLayout;
        this.f46031b = linearLayout;
        this.f46032c = textView;
        this.f46033d = batteryView;
        this.f46034e = textView2;
    }

    /* renamed from: a */
    public static C37231Ya2 m74891a(View view) {
        int i = C38115ai4.battery;
        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
        if (linearLayout != null) {
            i = C38115ai4.batteryLevel;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C38115ai4.batteryPercent;
                BatteryView batteryView = (BatteryView) C34328Lp6.m96312a(view, i);
                if (batteryView != null) {
                    i = C38115ai4.button;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C37231Ya2((ConstraintLayout) view, linearLayout, textView, batteryView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f46030a;
    }
}
