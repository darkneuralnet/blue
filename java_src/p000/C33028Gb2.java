package p000;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
/* renamed from: Gb2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33028Gb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CardView f12125a;

    /* renamed from: b */
    public final TextView f12126b;

    public C33028Gb2(CardView cardView, TextView textView) {
        this.f12125a = cardView;
        this.f12126b = textView;
    }

    /* renamed from: a */
    public static C33028Gb2 m104991a(View view) {
        int i = C36585Vg4.name;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            return new C33028Gb2((CardView) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CardView getRoot() {
        return this.f12125a;
    }
}
