package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: ge2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41648ge2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f83970a;

    /* renamed from: b */
    public final RecyclerView f83971b;

    /* renamed from: c */
    public final TextView f83972c;

    public C41648ge2(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.f83970a = linearLayout;
        this.f83971b = recyclerView;
        this.f83972c = textView;
    }

    /* renamed from: a */
    public static C41648ge2 m37942a(View view) {
        int i = C39912di4.details;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            i = C39912di4.view;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C41648ge2((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f83970a;
    }
}
