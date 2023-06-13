package p000;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Eb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32560Eb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f7765a;

    /* renamed from: b */
    public final TextView f7766b;

    /* renamed from: c */
    public final Button f7767c;

    /* renamed from: d */
    public final TextView f7768d;

    /* renamed from: e */
    public final TextView f7769e;

    public C32560Eb2(ConstraintLayout constraintLayout, TextView textView, Button button, TextView textView2, TextView textView3) {
        this.f7765a = constraintLayout;
        this.f7766b = textView;
        this.f7767c = button;
        this.f7768d = textView2;
        this.f7769e = textView3;
    }

    /* renamed from: a */
    public static C32560Eb2 m108737a(View view) {
        int i = C44052kh4.acceptedLabel;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C44052kh4.action;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C44052kh4.failedCount;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C44052kh4.scannedCount;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        return new C32560Eb2((ConstraintLayout) view, textView, button, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f7765a;
    }
}
