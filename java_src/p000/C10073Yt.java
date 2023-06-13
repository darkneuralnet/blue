package p000;

import androidx.camera.core.InterfaceC11183i;
import p000.C40160e74;
/* renamed from: Yt */
/* loaded from: classes.dex */
public final class C10073Yt extends C40160e74.AbstractC19965b {

    /* renamed from: a */
    public final C40753f74 f47590a;

    /* renamed from: b */
    public final InterfaceC11183i f47591b;

    public C10073Yt(C40753f74 c40753f74, InterfaceC11183i interfaceC11183i) {
        if (c40753f74 != null) {
            this.f47590a = c40753f74;
            if (interfaceC11183i != null) {
                this.f47591b = interfaceC11183i;
                return;
            }
            throw new NullPointerException("Null imageProxy");
        }
        throw new NullPointerException("Null processingRequest");
    }

    @Override // p000.C40160e74.AbstractC19965b
    /* renamed from: a */
    public InterfaceC11183i mo43248a() {
        return this.f47591b;
    }

    @Override // p000.C40160e74.AbstractC19965b
    /* renamed from: b */
    public C40753f74 mo43247b() {
        return this.f47590a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40160e74.AbstractC19965b)) {
            return false;
        }
        C40160e74.AbstractC19965b abstractC19965b = (C40160e74.AbstractC19965b) obj;
        if (this.f47590a.equals(abstractC19965b.mo43247b()) && this.f47591b.equals(abstractC19965b.mo43248a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f47590a.hashCode() ^ 1000003) * 1000003) ^ this.f47591b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f47590a + ", imageProxy=" + this.f47591b + "}";
    }
}
