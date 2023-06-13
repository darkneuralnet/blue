package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import co.bird.android.widget.BatteryViewV2;
/* renamed from: Fd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32812Fd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f9831a;

    /* renamed from: b */
    public final BatteryViewV2 f9832b;

    /* renamed from: c */
    public final TextView f9833c;

    /* renamed from: d */
    public final TextView f9834d;

    /* renamed from: e */
    public final TextView f9835e;

    /* renamed from: f */
    public final Group f9836f;

    /* renamed from: g */
    public final ImageView f9837g;

    /* renamed from: h */
    public final TextView f9838h;

    /* renamed from: i */
    public final ImageView f9839i;

    public C32812Fd2(ConstraintLayout constraintLayout, BatteryViewV2 batteryViewV2, TextView textView, TextView textView2, TextView textView3, Group group, ImageView imageView, TextView textView4, ImageView imageView2) {
        this.f9831a = constraintLayout;
        this.f9832b = batteryViewV2;
        this.f9833c = textView;
        this.f9834d = textView2;
        this.f9835e = textView3;
        this.f9836f = group;
        this.f9837g = imageView;
        this.f9838h = textView4;
        this.f9839i = imageView2;
    }

    /* renamed from: a */
    public static C32812Fd2 m106851a(View view) {
        int i = C32616Eh4.battery;
        BatteryViewV2 batteryViewV2 = (BatteryViewV2) C34328Lp6.m96312a(view, i);
        if (batteryViewV2 != null) {
            i = C32616Eh4.batteryText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C32616Eh4.code;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C32616Eh4.expiration;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C32616Eh4.expirationGroup;
                        Group group = (Group) C34328Lp6.m96312a(view, i);
                        if (group != null) {
                            i = C32616Eh4.expirationIcon;
                            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView != null) {
                                i = C32616Eh4.expirationSpace;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    i = C32616Eh4.icon;
                                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                    if (imageView2 != null) {
                                        return new C32812Fd2((ConstraintLayout) view, batteryViewV2, textView, textView2, textView3, group, imageView, textView4, imageView2);
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
        return this.f9831a;
    }
}
