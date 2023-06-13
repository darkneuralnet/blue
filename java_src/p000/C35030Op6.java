package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import co.bird.android.widget.BatteryView;
/* renamed from: Op6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35030Op6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f27410a;

    /* renamed from: b */
    public final BatteryView f27411b;

    /* renamed from: c */
    public final TextView f27412c;

    /* renamed from: d */
    public final TextView f27413d;

    /* renamed from: e */
    public final ImageView f27414e;

    public C35030Op6(View view, BatteryView batteryView, TextView textView, TextView textView2, ImageView imageView) {
        this.f27410a = view;
        this.f27411b = batteryView;
        this.f27412c = textView;
        this.f27413d = textView2;
        this.f27414e = imageView;
    }

    /* renamed from: a */
    public static C35030Op6 m91312a(View view) {
        int i = C31680Ah4.battery;
        BatteryView batteryView = (BatteryView) C34328Lp6.m96312a(view, i);
        if (batteryView != null) {
            i = C31680Ah4.batteryPercent;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C31680Ah4.birdCode;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C31680Ah4.idIcon;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        return new C35030Op6(view, batteryView, textView, textView2, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C35030Op6 m91311b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45258mj4.view_birdwatcher_window_info, viewGroup);
            return m91312a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f27410a;
    }
}
