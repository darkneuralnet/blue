package p000;

import java.io.IOException;
/* renamed from: Z */
/* loaded from: classes8.dex */
public abstract class AbstractC10088Z extends AbstractC7305S implements SZ1 {

    /* renamed from: b */
    public final int f47715b;

    /* renamed from: c */
    public final boolean f47716c;

    /* renamed from: d */
    public final InterfaceC1693E f47717d;

    public AbstractC10088Z(boolean z, int i, InterfaceC1693E interfaceC1693E) {
        if (interfaceC1693E == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        this.f47715b = i;
        this.f47716c = z;
        this.f47717d = interfaceC1693E;
    }

    /* renamed from: z */
    public static AbstractC10088Z m73926z(Object obj) {
        if (obj == null || (obj instanceof AbstractC10088Z)) {
            return (AbstractC10088Z) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return m73926z(AbstractC7305S.m86134v((byte[]) obj));
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e.getMessage());
        }
    }

    /* renamed from: A */
    public AbstractC7305S m73929A() {
        return this.f47717d.mo13850c();
    }

    /* renamed from: C */
    public int m73928C() {
        return this.f47715b;
    }

    /* renamed from: D */
    public boolean m73927D() {
        return this.f47716c;
    }

    @Override // p000.SZ1
    /* renamed from: a */
    public AbstractC7305S mo17712a() {
        return mo13850c();
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return (this.f47715b ^ (this.f47716c ? 15 : 240)) ^ this.f47717d.mo13850c().hashCode();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof AbstractC10088Z) {
            AbstractC10088Z abstractC10088Z = (AbstractC10088Z) abstractC7305S;
            if (this.f47715b == abstractC10088Z.f47715b && this.f47716c == abstractC10088Z.f47716c) {
                AbstractC7305S mo13850c = this.f47717d.mo13850c();
                AbstractC7305S mo13850c2 = abstractC10088Z.f47717d.mo13850c();
                return mo13850c == mo13850c2 || mo13850c.mo39779j(mo13850c2);
            }
            return false;
        }
        return false;
    }

    public String toString() {
        return "[" + this.f47715b + "]" + this.f47717d;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: x */
    public AbstractC7305S mo35868x() {
        return new C39037cG0(this.f47716c, this.f47715b, this.f47717d);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return new C47949rG0(this.f47716c, this.f47715b, this.f47717d);
    }
}
