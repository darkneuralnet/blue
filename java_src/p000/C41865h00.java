package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: h00  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41865h00 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f84580a;

    /* renamed from: b */
    public final TextView f84581b;

    /* renamed from: c */
    public final ImageView f84582c;

    /* renamed from: d */
    public final TextView f84583d;

    /* renamed from: e */
    public final RecyclerView f84584e;

    /* renamed from: f */
    public final TextView f84585f;

    public C41865h00(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, RecyclerView recyclerView, TextView textView3) {
        this.f84580a = constraintLayout;
        this.f84581b = textView;
        this.f84582c = imageView;
        this.f84583d = textView2;
        this.f84584e = recyclerView;
        this.f84585f = textView3;
    }

    /* renamed from: a */
    public static C41865h00 m37236a(View view) {
        int i = C39912di4.code;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.logo;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C39912di4.model;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C39912di4.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        i = C39912di4.title;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            return new C41865h00((ConstraintLayout) view, textView, imageView, textView2, recyclerView, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C41865h00 m37234c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.bottom_sheet_scrap_order_reasons, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37236a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f84580a;
    }
}
