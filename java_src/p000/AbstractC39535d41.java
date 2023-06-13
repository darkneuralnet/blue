package p000;

import com.nimbusds.jose.KeyLengthException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;
/* renamed from: d41  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC39535d41 extends AbstractC25649lB {
    public static final Set<C37051Xg2> SUPPORTED_ALGORITHMS;
    public static final Set<C36312Uc1> SUPPORTED_ENCRYPTION_METHODS = C41965hA0.f84763a;
    private final SecretKey cek;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(C37051Xg2.f43559m);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
    }

    public AbstractC39535d41(SecretKey secretKey) throws KeyLengthException {
        super(SUPPORTED_ALGORITHMS, getCompatibleEncryptionMethods(N70.m94359b(secretKey.getEncoded())));
        this.cek = secretKey;
    }

    private static Set<C36312Uc1> getCompatibleEncryptionMethods(int i) throws KeyLengthException {
        Set<C36312Uc1> set = C41965hA0.f84764b.get(Integer.valueOf(i));
        if (set != null) {
            return set;
        }
        throw new KeyLengthException("The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)");
    }

    @Override // p000.AbstractC25649lB, p000.InterfaceC31669Ag2
    public /* bridge */ /* synthetic */ C39289ch2 getJCAContext() {
        return super.getJCAContext();
    }

    public SecretKey getKey() {
        return this.cek;
    }

    @Override // p000.AbstractC25649lB, p000.InterfaceC40492eh2
    public /* bridge */ /* synthetic */ Set supportedEncryptionMethods() {
        return super.supportedEncryptionMethods();
    }

    @Override // p000.AbstractC25649lB, p000.InterfaceC40492eh2
    public /* bridge */ /* synthetic */ Set supportedJWEAlgorithms() {
        return super.supportedJWEAlgorithms();
    }
}
