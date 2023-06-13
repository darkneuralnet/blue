package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
/* renamed from: xs6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C51871xs6 implements InterfaceC53057zs6 {

    /* renamed from: a */
    public final ViewOverlay f118288a;

    public C51871xs6(View view) {
        this.f118288a = view.getOverlay();
    }

    @Override // p000.InterfaceC53057zs6
    /* renamed from: a */
    public void mo194a(Drawable drawable) {
        this.f118288a.remove(drawable);
    }

    @Override // p000.InterfaceC53057zs6
    /* renamed from: b */
    public void mo193b(Drawable drawable) {
        this.f118288a.add(drawable);
    }
}
