package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: IZ */
/* loaded from: classes3.dex */
public final class C3707IZ implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f15886a;

    /* renamed from: b */
    public final ImageView f15887b;

    /* renamed from: c */
    public final RecyclerView f15888c;

    /* renamed from: d */
    public final TextView f15889d;

    public C3707IZ(LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView, TextView textView) {
        this.f15886a = linearLayout;
        this.f15887b = imageView;
        this.f15888c = recyclerView;
        this.f15889d = textView;
    }

    /* renamed from: a */
    public static C3707IZ m101931a(View view) {
        int i = C41680gh4.close;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C41680gh4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                i = C41680gh4.title;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    return new C3707IZ((LinearLayout) view, imageView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C3707IZ m101929c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36135Ti4.bottom_sheet_cannot_capture_reports, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m101931a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f15886a;
    }
}
