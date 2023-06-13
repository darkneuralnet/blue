package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.BatteryViewV2;
/* renamed from: eg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40482eg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f78677a;

    /* renamed from: b */
    public final BatteryViewV2 f78678b;

    /* renamed from: c */
    public final TextView f78679c;

    /* renamed from: d */
    public final TextView f78680d;

    /* renamed from: e */
    public final ImageView f78681e;

    public C40482eg2(ConstraintLayout constraintLayout, BatteryViewV2 batteryViewV2, TextView textView, TextView textView2, ImageView imageView) {
        this.f78677a = constraintLayout;
        this.f78678b = batteryViewV2;
        this.f78679c = textView;
        this.f78680d = textView2;
        this.f78681e = imageView;
    }

    /* renamed from: a */
    public static C40482eg2 m42635a(View view) {
        int i = C45248mi4.battery;
        BatteryViewV2 batteryViewV2 = (BatteryViewV2) C34328Lp6.m96312a(view, i);
        if (batteryViewV2 != null) {
            i = C45248mi4.batteryText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C45248mi4.code;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C45248mi4.icon;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        return new C40482eg2((ConstraintLayout) view, batteryViewV2, textView, textView2, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f78677a;
    }
}
