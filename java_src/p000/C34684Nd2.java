package p000;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import co.bird.android.widget.BatteryView;
/* renamed from: Nd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34684Nd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CardView f24862a;

    /* renamed from: b */
    public final TextView f24863b;

    /* renamed from: c */
    public final BatteryView f24864c;

    /* renamed from: d */
    public final CardView f24865d;

    /* renamed from: e */
    public final TextView f24866e;

    /* renamed from: f */
    public final TextView f24867f;

    public C34684Nd2(CardView cardView, TextView textView, BatteryView batteryView, CardView cardView2, TextView textView2, TextView textView3) {
        this.f24862a = cardView;
        this.f24863b = textView;
        this.f24864c = batteryView;
        this.f24865d = cardView2;
        this.f24866e = textView2;
        this.f24867f = textView3;
    }

    /* renamed from: a */
    public static C34684Nd2 m93691a(View view) {
        int i = C41087fh4.batteryLevel;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C41087fh4.batteryPercent;
            BatteryView batteryView = (BatteryView) C34328Lp6.m96312a(view, i);
            if (batteryView != null) {
                CardView cardView = (CardView) view;
                i = C41087fh4.code;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C41087fh4.status;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        return new C34684Nd2(cardView, textView, batteryView, cardView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CardView getRoot() {
        return this.f24862a;
    }
}
