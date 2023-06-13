package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
/* renamed from: ws6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51278ws6 implements InterfaceC52464ys6 {

    /* renamed from: a */
    public final ViewOverlay f116701a;

    public C51278ws6(View view) {
        this.f116701a = view.getOverlay();
    }

    @Override // p000.InterfaceC52464ys6
    /* renamed from: a */
    public void mo2347a(Drawable drawable) {
        this.f116701a.remove(drawable);
    }

    @Override // p000.InterfaceC52464ys6
    /* renamed from: b */
    public void mo2346b(Drawable drawable) {
        this.f116701a.add(drawable);
    }
}
