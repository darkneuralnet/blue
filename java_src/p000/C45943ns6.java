package p000;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import co.bird.android.widget.BatteryView;
/* renamed from: ns6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45943ns6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CardView f100959a;

    /* renamed from: b */
    public final TextView f100960b;

    /* renamed from: c */
    public final BatteryView f100961c;

    /* renamed from: d */
    public final TextView f100962d;

    /* renamed from: e */
    public final TextView f100963e;

    /* renamed from: f */
    public final TextView f100964f;

    public C45943ns6(CardView cardView, TextView textView, BatteryView batteryView, TextView textView2, TextView textView3, TextView textView4) {
        this.f100959a = cardView;
        this.f100960b = textView;
        this.f100961c = batteryView;
        this.f100962d = textView2;
        this.f100963e = textView3;
        this.f100964f = textView4;
    }

    /* renamed from: a */
    public static C45943ns6 m22263a(View view) {
        int i = C33786Jh4.battery;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C33786Jh4.batteryIcon;
            BatteryView batteryView = (BatteryView) C34328Lp6.m96312a(view, i);
            if (batteryView != null) {
                i = C33786Jh4.birdCode;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C33786Jh4.status;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C33786Jh4.timeElapsed;
                        TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView4 != null) {
                            return new C45943ns6((CardView) view, textView, batteryView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CardView getRoot() {
        return this.f100959a;
    }
}
