package p000;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: hf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42251hf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CardView f85637a;

    /* renamed from: b */
    public final TextView f85638b;

    /* renamed from: c */
    public final RecyclerView f85639c;

    public C42251hf2(CardView cardView, TextView textView, RecyclerView recyclerView) {
        this.f85637a = cardView;
        this.f85638b = textView;
        this.f85639c = recyclerView;
    }

    /* renamed from: a */
    public static C42251hf2 m36108a(View view) {
        int i = C35658Rh4.issue;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C35658Rh4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                return new C42251hf2((CardView) view, textView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CardView getRoot() {
        return this.f85637a;
    }
}
