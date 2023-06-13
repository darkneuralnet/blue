package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Hd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33280Hd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f13666a;

    /* renamed from: b */
    public final ImageView f13667b;

    /* renamed from: c */
    public final TextView f13668c;

    /* renamed from: d */
    public final TextView f13669d;

    /* renamed from: e */
    public final TextView f13670e;

    /* renamed from: f */
    public final ImageView f13671f;

    /* renamed from: g */
    public final TextView f13672g;

    public C33280Hd2(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, ImageView imageView2, TextView textView4) {
        this.f13666a = constraintLayout;
        this.f13667b = imageView;
        this.f13668c = textView;
        this.f13669d = textView2;
        this.f13670e = textView3;
        this.f13671f = imageView2;
        this.f13672g = textView4;
    }

    /* renamed from: a */
    public static C33280Hd2 m103643a(View view) {
        int i = C52955zi4.add;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C52955zi4.capacity;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C52955zi4.capacityHelper;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C52955zi4.details;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C52955zi4.subtract;
                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView2 != null) {
                            i = C52955zi4.title;
                            TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView4 != null) {
                                return new C33280Hd2((ConstraintLayout) view, imageView, textView, textView2, textView3, imageView2, textView4);
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
        return this.f13666a;
    }
}
