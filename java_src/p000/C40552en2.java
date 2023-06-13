package p000;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.ASN1ParsingException;
/* renamed from: en2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C40552en2 implements Enumeration {

    /* renamed from: a */
    public C3828J f78852a;

    /* renamed from: b */
    public Object f78853b = m42560a();

    public C40552en2(byte[] bArr) {
        this.f78852a = new C3828J(bArr, true);
    }

    /* renamed from: a */
    public final Object m42560a() {
        try {
            return this.f78852a.m101405k();
        } catch (IOException e) {
            throw new ASN1ParsingException("malformed DER construction: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f78853b != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.f78853b;
        if (obj != null) {
            this.f78853b = m42560a();
            return obj;
        }
        throw new NoSuchElementException();
    }
}
