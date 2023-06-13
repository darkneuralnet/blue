package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: ib2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42804ib2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f87509a;

    public C42804ib2(TextView textView) {
        this.f87509a = textView;
    }

    /* renamed from: a */
    public static C42804ib2 m33770a(View view) {
        if (view != null) {
            return new C42804ib2((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f87509a;
    }
}
