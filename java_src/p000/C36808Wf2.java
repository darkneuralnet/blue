package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
/* renamed from: Wf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36808Wf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CardView f41482a;

    /* renamed from: b */
    public final ImageView f41483b;

    /* renamed from: c */
    public final TextView f41484c;

    public C36808Wf2(CardView cardView, ImageView imageView, TextView textView) {
        this.f41482a = cardView;
        this.f41483b = imageView;
        this.f41484c = textView;
    }

    /* renamed from: a */
    public static C36808Wf2 m78027a(View view) {
        int i = C43459jh4.image;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C43459jh4.title;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C36808Wf2((CardView) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CardView getRoot() {
        return this.f41482a;
    }
}
