package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import co.bird.android.imageupload.ImageUploadBar;
/* renamed from: lt6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44767lt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f96866a;

    /* renamed from: b */
    public final TextView f96867b;

    /* renamed from: c */
    public final ImageView f96868c;

    /* renamed from: d */
    public final ImageView f96869d;

    /* renamed from: e */
    public final ImageUploadBar f96870e;

    /* renamed from: f */
    public final TextView f96871f;

    /* renamed from: g */
    public final TextView f96872g;

    public C44767lt6(View view, TextView textView, ImageView imageView, ImageView imageView2, ImageUploadBar imageUploadBar, TextView textView2, TextView textView3) {
        this.f96866a = view;
        this.f96867b = textView;
        this.f96868c = imageView;
        this.f96869d = imageView2;
        this.f96870e = imageUploadBar;
        this.f96871f = textView2;
        this.f96872g = textView3;
    }

    /* renamed from: a */
    public static C44767lt6 m26701a(View view) {
        int i = C36585Vg4.addressText;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.checkIconGray;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C36585Vg4.checkIconGreen;
                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView2 != null) {
                    i = C36585Vg4.imageUploadBar;
                    ImageUploadBar imageUploadBar = (ImageUploadBar) C34328Lp6.m96312a(view, i);
                    if (imageUploadBar != null) {
                        i = C36585Vg4.scanBirdText;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C36585Vg4.scanRequiredTextView;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                return new C44767lt6(view, textView, imageView, imageView2, imageUploadBar, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C44767lt6 m26700b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C39311cj4.view_report, viewGroup);
            return m26701a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f96866a;
    }
}
