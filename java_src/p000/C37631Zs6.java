package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/* renamed from: Zs6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37631Zs6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f49436a;

    public C37631Zs6(TextView textView) {
        this.f49436a = textView;
    }

    /* renamed from: a */
    public static C37631Zs6 m72356a(View view) {
        if (view != null) {
            return new C37631Zs6((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C37631Zs6 m72354c(LayoutInflater layoutInflater) {
        return m72353d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C37631Zs6 m72353d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45268mk4.view_rating_tag_count, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m72356a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f49436a;
    }
}
