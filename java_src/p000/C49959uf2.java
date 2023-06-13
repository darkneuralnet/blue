package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import co.bird.android.widget.BatteryViewV2;
/* renamed from: uf2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49959uf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f112730a;

    /* renamed from: b */
    public final BatteryViewV2 f112731b;

    /* renamed from: c */
    public final Group f112732c;

    /* renamed from: d */
    public final TextView f112733d;

    /* renamed from: e */
    public final TextView f112734e;

    /* renamed from: f */
    public final ImageView f112735f;

    /* renamed from: g */
    public final TextView f112736g;

    /* renamed from: h */
    public final TextView f112737h;

    /* renamed from: i */
    public final ImageView f112738i;

    public C49959uf2(ConstraintLayout constraintLayout, BatteryViewV2 batteryViewV2, Group group, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, ImageView imageView2) {
        this.f112730a = constraintLayout;
        this.f112731b = batteryViewV2;
        this.f112732c = group;
        this.f112733d = textView;
        this.f112734e = textView2;
        this.f112735f = imageView;
        this.f112736g = textView3;
        this.f112737h = textView4;
        this.f112738i = imageView2;
    }

    /* renamed from: a */
    public static C49959uf2 m9897a(View view) {
        int i = C52955zi4.battery;
        BatteryViewV2 batteryViewV2 = (BatteryViewV2) C34328Lp6.m96312a(view, i);
        if (batteryViewV2 != null) {
            i = C52955zi4.batteryGroup;
            Group group = (Group) C34328Lp6.m96312a(view, i);
            if (group != null) {
                i = C52955zi4.batterySpacer;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C52955zi4.batteryText;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C52955zi4.check;
                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView != null) {
                            i = C52955zi4.code;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                i = C52955zi4.description;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    i = C52955zi4.scan;
                                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                    if (imageView2 != null) {
                                        return new C49959uf2((ConstraintLayout) view, batteryViewV2, group, textView, textView2, imageView, textView3, textView4, imageView2);
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
        return this.f112730a;
    }
}
