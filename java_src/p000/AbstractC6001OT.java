package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p000.G96;
/* renamed from: OT */
/* loaded from: classes5.dex */
public abstract class AbstractC6001OT<R> implements I96<R> {

    /* renamed from: a */
    public final I96<Drawable> f26597a;

    /* renamed from: OT$a */
    /* loaded from: classes5.dex */
    public final class C6002a implements G96<R> {

        /* renamed from: a */
        public final G96<Drawable> f26598a;

        public C6002a(G96<Drawable> g96) {
            this.f26598a = g96;
        }

        @Override // p000.G96
        /* renamed from: a */
        public boolean mo87323a(R r, G96.InterfaceC2677a interfaceC2677a) {
            return this.f26598a.mo87323a(new BitmapDrawable(interfaceC2677a.getView().getResources(), AbstractC6001OT.this.mo33863b(r)), interfaceC2677a);
        }
    }

    public AbstractC6001OT(I96<Drawable> i96) {
        this.f26597a = i96;
    }

    @Override // p000.I96
    /* renamed from: a */
    public G96<R> mo88921a(ZS0 zs0, boolean z) {
        return new C6002a(this.f26597a.mo88921a(zs0, z));
    }

    /* renamed from: b */
    public abstract Bitmap mo33863b(R r);
}
