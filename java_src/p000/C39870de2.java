package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
/* renamed from: de2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39870de2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CardView f76978a;

    /* renamed from: b */
    public final ImageView f76979b;

    /* renamed from: c */
    public final TextView f76980c;

    /* renamed from: d */
    public final EditText f76981d;

    public C39870de2(CardView cardView, ImageView imageView, TextView textView, EditText editText) {
        this.f76978a = cardView;
        this.f76979b = imageView;
        this.f76980c = textView;
        this.f76981d = editText;
    }

    /* renamed from: a */
    public static C39870de2 m43959a(View view) {
        int i = C33786Jh4.clear;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C33786Jh4.hint;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C33786Jh4.search;
                EditText editText = (EditText) C34328Lp6.m96312a(view, i);
                if (editText != null) {
                    return new C39870de2((CardView) view, imageView, textView, editText);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CardView getRoot() {
        return this.f76978a;
    }
}
