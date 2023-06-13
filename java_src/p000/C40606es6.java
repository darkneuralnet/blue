package p000;

import android.view.View;
import android.widget.RadioButton;
import androidx.cardview.widget.CardView;
/* renamed from: es6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40606es6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CardView f79039a;

    /* renamed from: b */
    public final RadioButton f79040b;

    public C40606es6(CardView cardView, RadioButton radioButton) {
        this.f79039a = cardView;
        this.f79040b = radioButton;
    }

    /* renamed from: a */
    public static C40606es6 m42471a(View view) {
        int i = C41087fh4.actionRadioButton;
        RadioButton radioButton = (RadioButton) C34328Lp6.m96312a(view, i);
        if (radioButton != null) {
            return new C40606es6((CardView) view, radioButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CardView getRoot() {
        return this.f79039a;
    }
}
