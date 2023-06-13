package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* renamed from: Cs6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32249Cs6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f4836a;

    /* renamed from: b */
    public final TextView f4837b;

    /* renamed from: c */
    public final RelativeLayout f4838c;

    /* renamed from: d */
    public final Button f4839d;

    /* renamed from: e */
    public final ImageView f4840e;

    /* renamed from: f */
    public final Button f4841f;

    /* renamed from: g */
    public final TextView f4842g;

    /* renamed from: h */
    public final Button f4843h;

    /* renamed from: i */
    public final TextView f4844i;

    public C32249Cs6(RelativeLayout relativeLayout, TextView textView, RelativeLayout relativeLayout2, Button button, ImageView imageView, Button button2, TextView textView2, Button button3, TextView textView3) {
        this.f4836a = relativeLayout;
        this.f4837b = textView;
        this.f4838c = relativeLayout2;
        this.f4839d = button;
        this.f4840e = imageView;
        this.f4841f = button2;
        this.f4842g = textView2;
        this.f4843h = button3;
        this.f4844i = textView3;
    }

    /* renamed from: a */
    public static C32249Cs6 m111384a(View view) {
        int i = C52955zi4.capacityTextView;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = C52955zi4.getDirectionsButton;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C52955zi4.image;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C52955zi4.mapArNestButton;
                    Button button2 = (Button) C34328Lp6.m96312a(view, i);
                    if (button2 != null) {
                        i = C52955zi4.notesTextView;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C52955zi4.showNearestParkingButton;
                            Button button3 = (Button) C34328Lp6.m96312a(view, i);
                            if (button3 != null) {
                                i = C52955zi4.titleTextView;
                                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView3 != null) {
                                    return new C32249Cs6(relativeLayout, textView, relativeLayout, button, imageView, button2, textView2, button3, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C32249Cs6 m111382c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45268mk4.view_parking_nest, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111384a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f4836a;
    }
}
