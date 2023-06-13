package p000;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: G */
/* loaded from: classes8.dex */
public class C2595G extends AbstractC7305S {

    /* renamed from: d */
    public static C2595G[] f10718d = new C2595G[12];

    /* renamed from: b */
    public final byte[] f10719b;

    /* renamed from: c */
    public final int f10720c;

    public C2595G(byte[] bArr) {
        if (C4295K.m99372G(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & ByteCompanionObject.MIN_VALUE) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f10719b = C0210Ao.m115251d(bArr);
        this.f10720c = C4295K.m99369J(bArr);
    }

    /* renamed from: z */
    public static C2595G m106015z(byte[] bArr) {
        if (bArr.length > 1) {
            return new C2595G(bArr);
        }
        if (bArr.length != 0) {
            int i = bArr[0] & UByte.MAX_VALUE;
            C2595G[] c2595gArr = f10718d;
            if (i >= c2595gArr.length) {
                return new C2595G(bArr);
            }
            C2595G c2595g = c2595gArr[i];
            if (c2595g == null) {
                C2595G c2595g2 = new C2595G(bArr);
                c2595gArr[i] = c2595g2;
                return c2595g2;
            }
            return c2595g;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return C0210Ao.m115244k(this.f10719b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof C2595G) {
            return C0210Ao.m115254a(this.f10719b, ((C2595G) abstractC7305S).f10719b);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 10, this.f10719b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        return ER5.m109017a(this.f10719b.length) + 1 + this.f10719b.length;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }
}
