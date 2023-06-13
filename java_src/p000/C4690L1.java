package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* renamed from: L1 */
/* loaded from: classes.dex */
public final class C4690L1 extends ClickableSpan {

    /* renamed from: b */
    public final int f20597b;

    /* renamed from: c */
    public final C27125p2 f20598c;

    /* renamed from: d */
    public final int f20599d;

    public C4690L1(int i, C27125p2 c27125p2, int i2) {
        this.f20597b = i;
        this.f20598c = c27125p2;
        this.f20599d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f20597b);
        this.f20598c.m20099U(this.f20599d, bundle);
    }
}
