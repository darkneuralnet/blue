package p000;

import java.io.IOException;
/* renamed from: D */
/* loaded from: classes8.dex */
public class C1267D extends AbstractC7305S {

    /* renamed from: c */
    public static final C1267D f5012c = new C1267D((byte) 0);

    /* renamed from: d */
    public static final C1267D f5013d = new C1267D((byte) -1);

    /* renamed from: b */
    public final byte f5014b;

    public C1267D(byte b) {
        this.f5014b = b;
    }

    /* renamed from: z */
    public static C1267D m111175z(byte[] bArr) {
        if (bArr.length == 1) {
            byte b = bArr[0];
            return b != -1 ? b != 0 ? new C1267D(b) : f5012c : f5013d;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    /* renamed from: A */
    public boolean m111176A() {
        return this.f5014b != 0;
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return m111176A() ? 1 : 0;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        return (abstractC7305S instanceof C1267D) && m111176A() == ((C1267D) abstractC7305S).m111176A();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89163j(z, 1, this.f5014b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        return 3;
    }

    public String toString() {
        return m111176A() ? "TRUE" : "FALSE";
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: x */
    public AbstractC7305S mo35868x() {
        return m111176A() ? f5013d : f5012c;
    }
}
