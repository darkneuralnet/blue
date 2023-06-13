package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: rc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48151rc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f107312a;

    /* renamed from: b */
    public final ImageView f107313b;

    /* renamed from: c */
    public final TextView f107314c;

    /* renamed from: d */
    public final TextView f107315d;

    /* renamed from: e */
    public final ImageView f107316e;

    public C48151rc2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
        this.f107312a = constraintLayout;
        this.f107313b = imageView;
        this.f107314c = textView;
        this.f107315d = textView2;
        this.f107316e = imageView2;
    }

    /* renamed from: a */
    public static C48151rc2 m15701a(View view) {
        int i = C38115ai4.chevron;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C38115ai4.code;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C38115ai4.status;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C38115ai4.statusIcon;
                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView2 != null) {
                        return new C48151rc2((ConstraintLayout) view, imageView, textView, textView2, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f107312a;
    }
}
