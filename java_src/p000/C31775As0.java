package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.BatteryViewV2;
/* renamed from: As0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31775As0 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f1284a;

    /* renamed from: b */
    public final BatteryViewV2 f1285b;

    /* renamed from: c */
    public final TextView f1286c;

    /* renamed from: d */
    public final TextView f1287d;

    public C31775As0(ConstraintLayout constraintLayout, BatteryViewV2 batteryViewV2, TextView textView, TextView textView2) {
        this.f1284a = constraintLayout;
        this.f1285b = batteryViewV2;
        this.f1286c = textView;
        this.f1287d = textView2;
    }

    /* renamed from: a */
    public static C31775As0 m115004a(View view) {
        int i = C45831nh4.batteryLevel;
        BatteryViewV2 batteryViewV2 = (BatteryViewV2) C34328Lp6.m96312a(view, i);
        if (batteryViewV2 != null) {
            i = C45831nh4.batteryPercent;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C45831nh4.batteryPercent100;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C31775As0((ConstraintLayout) view, batteryViewV2, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f1284a;
    }
}
