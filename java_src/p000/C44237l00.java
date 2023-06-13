package p000;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: l00  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44237l00 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f95338a;

    /* renamed from: b */
    public final Button f95339b;

    /* renamed from: c */
    public final TextView f95340c;

    /* renamed from: d */
    public final TextView f95341d;

    /* renamed from: e */
    public final View f95342e;

    /* renamed from: f */
    public final ImageView f95343f;

    /* renamed from: g */
    public final ImageView f95344g;

    public C44237l00(ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2, View view, ImageView imageView, ImageView imageView2) {
        this.f95338a = constraintLayout;
        this.f95339b = button;
        this.f95340c = textView;
        this.f95341d = textView2;
        this.f95342e = view;
        this.f95343f = imageView;
        this.f95344g = imageView2;
    }

    /* renamed from: a */
    public static C44237l00 m28029a(View view) {
        View m96312a;
        int i = C39912di4.actionButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C39912di4.actionDescription;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C39912di4.actionTitle;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null && (m96312a = C34328Lp6.m96312a(view, (i = C39912di4.iconInflectionPoint))) != null) {
                    i = C39912di4.noIssuesIcon;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C39912di4.skuImage;
                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView2 != null) {
                            return new C44237l00((ConstraintLayout) view, button, textView, textView2, m96312a, imageView, imageView2);
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
        return this.f95338a;
    }
}
