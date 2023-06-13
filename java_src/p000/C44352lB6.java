package p000;

import android.view.View;
import android.view.WindowId;
/* renamed from: lB6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C44352lB6 implements InterfaceC44945mB6 {

    /* renamed from: a */
    public final WindowId f95696a;

    public C44352lB6(View view) {
        this.f95696a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C44352lB6) && ((C44352lB6) obj).f95696a.equals(this.f95696a);
    }

    public int hashCode() {
        return this.f95696a.hashCode();
    }
}
