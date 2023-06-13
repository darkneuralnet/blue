package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC11183i;
import java.nio.ByteBuffer;
/* renamed from: androidx.camera.core.a */
/* loaded from: classes.dex */
public final class C11148a implements InterfaceC11183i {

    /* renamed from: b */
    public final Image f52433b;

    /* renamed from: c */
    public final C11149a[] f52434c;

    /* renamed from: d */
    public final InterfaceC51066wX1 f52435d;

    /* renamed from: androidx.camera.core.a$a */
    /* loaded from: classes.dex */
    public static final class C11149a implements InterfaceC11183i.InterfaceC11184a {

        /* renamed from: a */
        public final Image.Plane f52436a;

        public C11149a(Image.Plane plane) {
            this.f52436a = plane;
        }

        @Override // androidx.camera.core.InterfaceC11183i.InterfaceC11184a
        /* renamed from: a */
        public int mo69478a() {
            return this.f52436a.getRowStride();
        }

        @Override // androidx.camera.core.InterfaceC11183i.InterfaceC11184a
        /* renamed from: b */
        public int mo69477b() {
            return this.f52436a.getPixelStride();
        }

        @Override // androidx.camera.core.InterfaceC11183i.InterfaceC11184a
        /* renamed from: e */
        public ByteBuffer mo69476e() {
            return this.f52436a.getBuffer();
        }
    }

    public C11148a(Image image) {
        this.f52433b = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f52434c = new C11149a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f52434c[i] = new C11149a(planes[i]);
            }
        } else {
            this.f52434c = new C11149a[0];
        }
        this.f52435d = TY1.m83423d(C51672xY5.m5018a(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.InterfaceC11183i
    /* renamed from: A0 */
    public InterfaceC11183i.InterfaceC11184a[] mo69480A0() {
        return this.f52434c;
    }

    @Override // androidx.camera.core.InterfaceC11183i, java.lang.AutoCloseable
    public void close() {
        this.f52433b.close();
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public Rect getCropRect() {
        return this.f52433b.getCropRect();
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public int getFormat() {
        return this.f52433b.getFormat();
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public int getHeight() {
        return this.f52433b.getHeight();
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public int getWidth() {
        return this.f52433b.getWidth();
    }

    @Override // androidx.camera.core.InterfaceC11183i
    /* renamed from: i1 */
    public InterfaceC51066wX1 mo40428i1() {
        return this.f52435d;
    }

    @Override // androidx.camera.core.InterfaceC11183i
    /* renamed from: k3 */
    public Image mo69479k3() {
        return this.f52433b;
    }

    @Override // androidx.camera.core.InterfaceC11183i
    public void setCropRect(Rect rect) {
        this.f52433b.setCropRect(rect);
    }
}
