package p000;

import java.util.NoSuchElementException;
/* renamed from: Jv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33915Jv7 extends AbstractC34590Ms7 {

    /* renamed from: b */
    public final C34383Lv7 f18777b;

    /* renamed from: c */
    public InterfaceC35058Os7 f18778c = m99558a();

    /* renamed from: d */
    public final /* synthetic */ C34617Mv7 f18779d;

    public C33915Jv7(C34617Mv7 c34617Mv7) {
        this.f18779d = c34617Mv7;
        this.f18777b = new C34383Lv7(c34617Mv7, null);
    }

    /* renamed from: a */
    public final InterfaceC35058Os7 m99558a() {
        C34383Lv7 c34383Lv7 = this.f18777b;
        if (c34383Lv7.hasNext()) {
            return c34383Lv7.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18778c != null;
    }

    @Override // p000.InterfaceC35058Os7
    public final byte zza() {
        InterfaceC35058Os7 interfaceC35058Os7 = this.f18778c;
        if (interfaceC35058Os7 != null) {
            byte zza = interfaceC35058Os7.zza();
            if (!this.f18778c.hasNext()) {
                this.f18778c = m99558a();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
