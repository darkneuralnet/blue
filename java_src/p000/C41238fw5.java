package p000;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.AbstractC11152d;
import androidx.camera.core.InterfaceC11183i;
/* renamed from: fw5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41238fw5 extends AbstractC11152d {

    /* renamed from: e */
    public final Object f81182e;

    /* renamed from: f */
    public final InterfaceC51066wX1 f81183f;

    /* renamed from: g */
    public Rect f81184g;

    /* renamed from: h */
    public final int f81185h;

    /* renamed from: i */
    public final int f81186i;

    public C41238fw5(InterfaceC11183i interfaceC11183i, InterfaceC51066wX1 interfaceC51066wX1) {
        this(interfaceC11183i, null, interfaceC51066wX1);
    }

    @Override // androidx.camera.core.AbstractC11152d, androidx.camera.core.InterfaceC11183i
    public Rect getCropRect() {
        synchronized (this.f81182e) {
            if (this.f81184g == null) {
                return new Rect(0, 0, getWidth(), getHeight());
            }
            return new Rect(this.f81184g);
        }
    }

    @Override // androidx.camera.core.AbstractC11152d, androidx.camera.core.InterfaceC11183i
    public int getHeight() {
        return this.f81186i;
    }

    @Override // androidx.camera.core.AbstractC11152d, androidx.camera.core.InterfaceC11183i
    public int getWidth() {
        return this.f81185h;
    }

    @Override // androidx.camera.core.AbstractC11152d, androidx.camera.core.InterfaceC11183i
    /* renamed from: i1 */
    public InterfaceC51066wX1 mo40428i1() {
        return this.f81183f;
    }

    @Override // androidx.camera.core.AbstractC11152d, androidx.camera.core.InterfaceC11183i
    public void setCropRect(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f81182e) {
            this.f81184g = rect;
        }
    }

    public C41238fw5(InterfaceC11183i interfaceC11183i, Size size, InterfaceC51066wX1 interfaceC51066wX1) {
        super(interfaceC11183i);
        this.f81182e = new Object();
        if (size == null) {
            this.f81185h = super.getWidth();
            this.f81186i = super.getHeight();
        } else {
            this.f81185h = size.getWidth();
            this.f81186i = size.getHeight();
        }
        this.f81183f = interfaceC51066wX1;
    }
}
