package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: Lf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34234Lf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f21877a;

    public C34234Lf2(TextView textView) {
        this.f21877a = textView;
    }

    /* renamed from: a */
    public static C34234Lf2 m96512a(View view) {
        if (view != null) {
            return new C34234Lf2((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f21877a;
    }
}
