package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
/* renamed from: cg2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39279cg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CardView f61030a;

    /* renamed from: b */
    public final ImageView f61031b;

    /* renamed from: c */
    public final EditText f61032c;

    public C39279cg2(CardView cardView, ImageView imageView, EditText editText) {
        this.f61030a = cardView;
        this.f61031b = imageView;
        this.f61032c = editText;
    }

    /* renamed from: a */
    public static C39279cg2 m61071a(View view) {
        int i = C36585Vg4.clear;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C36585Vg4.search;
            EditText editText = (EditText) C34328Lp6.m96312a(view, i);
            if (editText != null) {
                return new C39279cg2((CardView) view, imageView, editText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CardView getRoot() {
        return this.f61030a;
    }
}
