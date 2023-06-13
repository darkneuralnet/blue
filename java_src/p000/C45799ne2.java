package p000;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: ne2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45799ne2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f100263a;

    /* renamed from: b */
    public final TextView f100264b;

    /* renamed from: c */
    public final Button f100265c;

    /* renamed from: d */
    public final TextView f100266d;

    public C45799ne2(ConstraintLayout constraintLayout, TextView textView, Button button, TextView textView2) {
        this.f100263a = constraintLayout;
        this.f100264b = textView;
        this.f100265c = button;
        this.f100266d = textView2;
    }

    /* renamed from: a */
    public static C45799ne2 m23373a(View view) {
        int i = C39912di4.acceptedLabel;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.complete;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C39912di4.scannedCount;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C45799ne2((ConstraintLayout) view, textView, button, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f100263a;
    }
}
