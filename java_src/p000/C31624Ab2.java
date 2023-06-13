package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Ab2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31624Ab2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f830a;

    /* renamed from: b */
    public final TextView f831b;

    /* renamed from: c */
    public final TextView f832c;

    /* renamed from: d */
    public final TextView f833d;

    /* renamed from: e */
    public final ImageView f834e;

    /* renamed from: f */
    public final ImageView f835f;

    /* renamed from: g */
    public final TextView f836g;

    public C31624Ab2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView, ImageView imageView2, TextView textView4) {
        this.f830a = constraintLayout;
        this.f831b = textView;
        this.f832c = textView2;
        this.f833d = textView3;
        this.f834e = imageView;
        this.f835f = imageView2;
        this.f836g = textView4;
    }

    /* renamed from: a */
    public static C31624Ab2 m115494a(View view) {
        int i = C39912di4.containerOrderId;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.lineItem1;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C39912di4.lineItem2;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    i = C39912di4.statusIconFailure;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C39912di4.statusIconSuccess;
                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView2 != null) {
                            i = C39912di4.statusText;
                            TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView4 != null) {
                                return new C31624Ab2((ConstraintLayout) view, textView, textView2, textView3, imageView, imageView2, textView4);
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
        return this.f830a;
    }
}
