package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: m6 */
/* loaded from: classes3.dex */
public final class C25914m6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f97349a;

    /* renamed from: b */
    public final CardView f97350b;

    /* renamed from: c */
    public final Button f97351c;

    /* renamed from: d */
    public final Button f97352d;

    /* renamed from: e */
    public final RecyclerView f97353e;

    /* renamed from: f */
    public final TextView f97354f;

    public C25914m6(ConstraintLayout constraintLayout, CardView cardView, Button button, Button button2, RecyclerView recyclerView, TextView textView) {
        this.f97349a = constraintLayout;
        this.f97350b = cardView;
        this.f97351c = button;
        this.f97352d = button2;
        this.f97353e = recyclerView;
        this.f97354f = textView;
    }

    /* renamed from: a */
    public static C25914m6 m26350a(View view) {
        int i = C37530Zh4.ctaContainer;
        CardView cardView = (CardView) C34328Lp6.m96312a(view, i);
        if (cardView != null) {
            i = C37530Zh4.downloadInvoiceButton;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C37530Zh4.helpButton;
                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                if (button2 != null) {
                    i = C37530Zh4.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        i = C37530Zh4.titleText;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            return new C25914m6((ConstraintLayout) view, cardView, button, button2, recyclerView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C25914m6 m26348c(LayoutInflater layoutInflater) {
        return m26347d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25914m6 m26347d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34506Mj4.activity_transaction_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m26350a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f97349a;
    }
}
