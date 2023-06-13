package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import co.bird.android.widget.BatteryViewV2;
/* renamed from: Ra2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35593Ra2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f32225a;

    /* renamed from: b */
    public final TextView f32226b;

    /* renamed from: c */
    public final TextView f32227c;

    /* renamed from: d */
    public final TextView f32228d;

    /* renamed from: e */
    public final BatteryViewV2 f32229e;

    /* renamed from: f */
    public final Group f32230f;

    /* renamed from: g */
    public final TextView f32231g;

    /* renamed from: h */
    public final TextView f32232h;

    /* renamed from: i */
    public final ImageView f32233i;

    /* renamed from: j */
    public final Barrier f32234j;

    /* renamed from: k */
    public final Switch f32235k;

    /* renamed from: l */
    public final TextView f32236l;

    /* renamed from: m */
    public final TextView f32237m;

    /* renamed from: n */
    public final TextView f32238n;

    /* renamed from: o */
    public final TextView f32239o;

    /* renamed from: p */
    public final TextView f32240p;

    /* renamed from: q */
    public final Group f32241q;

    public C35593Ra2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, BatteryViewV2 batteryViewV2, Group group, TextView textView4, TextView textView5, ImageView imageView, Barrier barrier, Switch r13, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, Group group2) {
        this.f32225a = constraintLayout;
        this.f32226b = textView;
        this.f32227c = textView2;
        this.f32228d = textView3;
        this.f32229e = batteryViewV2;
        this.f32230f = group;
        this.f32231g = textView4;
        this.f32232h = textView5;
        this.f32233i = imageView;
        this.f32234j = barrier;
        this.f32235k = r13;
        this.f32236l = textView6;
        this.f32237m = textView7;
        this.f32238n = textView8;
        this.f32239o = textView9;
        this.f32240p = textView10;
        this.f32241q = group2;
    }

    /* renamed from: a */
    public static C35593Ra2 m86611a(View view) {
        int i = C34722Nh4.battery;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C34722Nh4.batteryLabel;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C34722Nh4.batteryTextPlaceholder;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    i = C34722Nh4.batteryView;
                    BatteryViewV2 batteryViewV2 = (BatteryViewV2) C34328Lp6.m96312a(view, i);
                    if (batteryViewV2 != null) {
                        i = C34722Nh4.bluetoothVehicleLightsGroup;
                        Group group = (Group) C34328Lp6.m96312a(view, i);
                        if (group != null) {
                            i = C34722Nh4.code;
                            TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView4 != null) {
                                i = C34722Nh4.codeLabel;
                                TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView5 != null) {
                                    i = C34722Nh4.image;
                                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                    if (imageView != null) {
                                        i = C34722Nh4.infoBarrier;
                                        Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
                                        if (barrier != null) {
                                            i = C34722Nh4.lightSwitch;
                                            Switch r14 = (Switch) C34328Lp6.m96312a(view, i);
                                            if (r14 != null) {
                                                i = C34722Nh4.lightsLabel;
                                                TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView6 != null) {
                                                    i = C34722Nh4.ridden;
                                                    TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                                    if (textView7 != null) {
                                                        i = C34722Nh4.riddenLabel;
                                                        TextView textView8 = (TextView) C34328Lp6.m96312a(view, i);
                                                        if (textView8 != null) {
                                                            i = C34722Nh4.trip;
                                                            TextView textView9 = (TextView) C34328Lp6.m96312a(view, i);
                                                            if (textView9 != null) {
                                                                i = C34722Nh4.tripLabel;
                                                                TextView textView10 = (TextView) C34328Lp6.m96312a(view, i);
                                                                if (textView10 != null) {
                                                                    i = C34722Nh4.vehicleCodeGroup;
                                                                    Group group2 = (Group) C34328Lp6.m96312a(view, i);
                                                                    if (group2 != null) {
                                                                        return new C35593Ra2((ConstraintLayout) view, textView, textView2, textView3, batteryViewV2, group, textView4, textView5, imageView, barrier, r14, textView6, textView7, textView8, textView9, textView10, group2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
        return this.f32225a;
    }
}
