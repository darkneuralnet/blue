package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
/* renamed from: ee2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40462ee2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CardView f78645a;

    /* renamed from: b */
    public final ImageView f78646b;

    /* renamed from: c */
    public final TextView f78647c;

    /* renamed from: d */
    public final EditText f78648d;

    public C40462ee2(CardView cardView, ImageView imageView, TextView textView, EditText editText) {
        this.f78645a = cardView;
        this.f78646b = imageView;
        this.f78647c = textView;
        this.f78648d = editText;
    }

    /* renamed from: a */
    public static C40462ee2 m42669a(View view) {
        int i = C34254Lh4.clear;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C34254Lh4.hint;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C34254Lh4.search;
                EditText editText = (EditText) C34328Lp6.m96312a(view, i);
                if (editText != null) {
                    return new C40462ee2((CardView) view, imageView, textView, editText);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CardView getRoot() {
        return this.f78645a;
    }
}
