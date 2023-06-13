package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: jb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43397jb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f92996a;

    public C43397jb2(TextView textView) {
        this.f92996a = textView;
    }

    /* renamed from: a */
    public static C43397jb2 m30219a(View view) {
        if (view != null) {
            return new C43397jb2((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f92996a;
    }
}
