package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import co.bird.android.widget.BatteryView;
/* renamed from: Ip6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33626Ip6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f16259a;

    /* renamed from: b */
    public final BatteryView f16260b;

    /* renamed from: c */
    public final TextView f16261c;

    /* renamed from: d */
    public final ImageView f16262d;

    public C33626Ip6(View view, BatteryView batteryView, TextView textView, ImageView imageView) {
        this.f16259a = view;
        this.f16260b = batteryView;
        this.f16261c = textView;
        this.f16262d = imageView;
    }

    /* renamed from: a */
    public static C33626Ip6 m101656a(View view) {
        int i = C31680Ah4.battery;
        BatteryView batteryView = (BatteryView) C34328Lp6.m96312a(view, i);
        if (batteryView != null) {
            i = C31680Ah4.batteryPercent;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C31680Ah4.info;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    return new C33626Ip6(view, batteryView, textView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C33626Ip6 m101655b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45258mj4.view_battery_window_info, viewGroup);
            return m101656a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f16259a;
    }
}
