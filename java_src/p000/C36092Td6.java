package p000;

import android.graphics.Bitmap;
/* renamed from: Td6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36092Td6 implements InterfaceC38502bM4<Bitmap, Bitmap> {

    /* renamed from: Td6$a */
    /* loaded from: classes5.dex */
    public static final class C7906a implements VL4<Bitmap> {

        /* renamed from: b */
        public final Bitmap f35813b;

        public C7906a(Bitmap bitmap) {
            this.f35813b = bitmap;
        }

        @Override // p000.VL4
        /* renamed from: a */
        public int mo5713a() {
            return C47029pi6.m18918h(this.f35813b);
        }

        @Override // p000.VL4
        /* renamed from: b */
        public void mo5712b() {
        }

        @Override // p000.VL4
        /* renamed from: c */
        public Bitmap get() {
            return this.f35813b;
        }

        @Override // p000.VL4
        /* renamed from: d */
        public Class<Bitmap> mo5710d() {
            return Bitmap.class;
        }
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<Bitmap> mo1781b(Bitmap bitmap, int i, int i2, C48964sy3 c48964sy3) {
        return new C7906a(bitmap);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public boolean mo1782a(Bitmap bitmap, C48964sy3 c48964sy3) {
        return true;
    }
}
