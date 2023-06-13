package org.junit.internal;

import java.io.IOException;
import java.io.ObjectOutputStream;
/* loaded from: classes8.dex */
public class AssumptionViolatedException extends RuntimeException implements InterfaceC37153Xr5 {
    private static final long serialVersionUID = 2;

    /* renamed from: b */
    public final String f102655b;

    /* renamed from: c */
    public final boolean f102656c;

    /* renamed from: d */
    public final Object f102657d;

    /* renamed from: e */
    public final InterfaceC52747zM2<?> f102658e;

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("fAssumption", this.f102655b);
        putFields.put("fValueMatcher", this.f102656c);
        putFields.put("fMatcher", C37162Xs5.m76180b(this.f102658e));
        putFields.put("fValue", C37396Ys5.m74045a(this.f102657d));
        objectOutputStream.writeFields();
    }

    @Override // p000.InterfaceC37153Xr5
    /* renamed from: a */
    public void mo20420a(InterfaceC50759w01 interfaceC50759w01) {
        String str = this.f102655b;
        if (str != null) {
            interfaceC50759w01.mo1736a(str);
        }
        if (this.f102656c) {
            if (this.f102655b != null) {
                interfaceC50759w01.mo1736a(": ");
            }
            interfaceC50759w01.mo1736a("got: ");
            interfaceC50759w01.mo1735b(this.f102657d);
            if (this.f102658e != null) {
                interfaceC50759w01.mo1736a(", expected: ");
                interfaceC50759w01.mo1734c(this.f102658e);
            }
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return SR5.m85472k(this);
    }
}
