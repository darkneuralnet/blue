package p000;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyTypeException;
import java.security.Key;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;
/* renamed from: RX0 */
/* loaded from: classes6.dex */
public class RX0 implements InterfaceC31669Ag2 {

    /* renamed from: b */
    public static final Set<C42271hh2> f32138b;

    /* renamed from: a */
    public final C31903Bg2 f32139a = new C31903Bg2();

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(CE2.f3641d);
        linkedHashSet.addAll(AbstractC47660qm4.f105780c);
        linkedHashSet.addAll(O81.f25939c);
        f32138b = Collections.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: c */
    public InterfaceC44050kh2 m86643c(C42864ih2 c42864ih2, Key key) throws JOSEException {
        InterfaceC44050kh2 p81;
        if (CE2.f3641d.contains(c42864ih2.m33577r())) {
            if (key instanceof SecretKey) {
                p81 = new DE2((SecretKey) key);
            } else {
                throw new KeyTypeException(SecretKey.class);
            }
        } else if (AbstractC47660qm4.f105780c.contains(c42864ih2.m33577r())) {
            if (key instanceof RSAPublicKey) {
                p81 = new C48253rm4((RSAPublicKey) key);
            } else {
                throw new KeyTypeException(RSAPublicKey.class);
            }
        } else if (O81.f25939c.contains(c42864ih2.m33577r())) {
            if (key instanceof ECPublicKey) {
                p81 = new P81((ECPublicKey) key);
            } else {
                throw new KeyTypeException(ECPublicKey.class);
            }
        } else {
            throw new JOSEException("Unsupported JWS algorithm: " + c42864ih2.m33577r());
        }
        p81.getJCAContext().m113688c(this.f32139a.m113690a());
        return p81;
    }

    @Override // p000.InterfaceC31669Ag2
    public C31903Bg2 getJCAContext() {
        return this.f32139a;
    }
}
