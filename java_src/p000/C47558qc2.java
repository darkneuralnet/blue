package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: qc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47558qc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f105509a;

    public C47558qc2(TextView textView) {
        this.f105509a = textView;
    }

    /* renamed from: a */
    public static C47558qc2 m17325a(View view) {
        if (view != null) {
            return new C47558qc2((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f105509a;
    }
}
