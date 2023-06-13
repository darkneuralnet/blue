package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: Xd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37024Xd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f43483a;

    public C37024Xd2(TextView textView) {
        this.f43483a = textView;
    }

    /* renamed from: a */
    public static C37024Xd2 m76750a(View view) {
        if (view != null) {
            return new C37024Xd2((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f43483a;
    }
}
