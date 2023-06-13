package p000;

import java.util.NoSuchElementException;
/* renamed from: Um8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36409Um8 extends AbstractC43949kW7 {

    /* renamed from: b */
    public final C35950Sn8 f37982b;

    /* renamed from: c */
    public KW7 f37983c = m80874a();

    /* renamed from: d */
    public final /* synthetic */ C48277ro8 f37984d;

    public C36409Um8(C48277ro8 c48277ro8) {
        this.f37984d = c48277ro8;
        this.f37982b = new C35950Sn8(c48277ro8, null);
    }

    /* renamed from: a */
    public final KW7 m80874a() {
        C35950Sn8 c35950Sn8 = this.f37982b;
        if (c35950Sn8.hasNext()) {
            return c35950Sn8.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37983c != null;
    }

    @Override // p000.KW7
    public final byte zza() {
        KW7 kw7 = this.f37983c;
        if (kw7 != null) {
            byte zza = kw7.zza();
            if (!this.f37983c.hasNext()) {
                this.f37983c = m80874a();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
