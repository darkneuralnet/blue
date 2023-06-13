package p000;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
/* renamed from: CE2 */
/* loaded from: classes6.dex */
public abstract class CE2 extends AbstractC25933mB {

    /* renamed from: d */
    public static final Set<C42271hh2> f3641d;

    /* renamed from: c */
    public final byte[] f3642c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(C42271hh2.f85663e);
        linkedHashSet.add(C42271hh2.f85664f);
        linkedHashSet.add(C42271hh2.f85665g);
        f3641d = Collections.unmodifiableSet(linkedHashSet);
    }

    public CE2(byte[] bArr, Set<C42271hh2> set) throws KeyLengthException {
        super(set);
        if (bArr.length >= 32) {
            this.f3642c = bArr;
            return;
        }
        throw new KeyLengthException("The secret length must be at least 256 bits");
    }

    /* renamed from: d */
    public static String m112597d(C42271hh2 c42271hh2) throws JOSEException {
        if (c42271hh2.equals(C42271hh2.f85663e)) {
            return "HMACSHA256";
        }
        if (c42271hh2.equals(C42271hh2.f85664f)) {
            return "HMACSHA384";
        }
        if (c42271hh2.equals(C42271hh2.f85665g)) {
            return "HMACSHA512";
        }
        throw new JOSEException(C3900J9.m101092d(c42271hh2, f3641d));
    }

    /* renamed from: e */
    public byte[] m112596e() {
        return this.f3642c;
    }
}
