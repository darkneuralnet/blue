package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: xg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51747xg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f117959a;

    public C51747xg2(TextView textView) {
        this.f117959a = textView;
    }

    /* renamed from: a */
    public static C51747xg2 m4891a(View view) {
        if (view != null) {
            return new C51747xg2((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f117959a;
    }
}
