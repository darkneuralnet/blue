package p000;

import androidx.camera.core.AbstractC11152d;
import androidx.camera.core.InterfaceC11183i;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: jB5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43165jB5 extends AbstractC11152d {

    /* renamed from: e */
    public final AtomicBoolean f92269e;

    public C43165jB5(InterfaceC11183i interfaceC11183i) {
        super(interfaceC11183i);
        this.f92269e = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.AbstractC11152d, androidx.camera.core.InterfaceC11183i, java.lang.AutoCloseable
    public void close() {
        if (!this.f92269e.getAndSet(true)) {
            super.close();
        }
    }
}
