package p000;

import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
/* renamed from: Xm4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37107Xm4 extends KeyFactorySpi implements InterfaceC13287bp {
    /* renamed from: a */
    public PrivateKey m76367a(C44301l64 c44301l64) throws IOException {
        C37341Ym4 m74281s = C37341Ym4.m74281s(c44301l64.m27859w());
        return new C26289mv(m74281s.m74280u(), m74281s.m74283j(), m74281s.m74279v(), m74281s.m74282o(), m74281s.m74277x(), m74281s.m74278w());
    }

    /* renamed from: b */
    public PublicKey m76366b(C39159cT5 c39159cT5) throws IOException {
        C38165an4 m70736v = C38165an4.m70736v(c39159cT5.m61286u());
        return new C26738nv(m70736v.m70737u(), m70736v.m70740j(), m70736v.m70738s(), m70736v.m70739o());
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof C37575Zm4) {
            return new C26289mv((C37575Zm4) keySpec);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return m76367a(C44301l64.m27863o(AbstractC7305S.m86134v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + InstructionFileId.DOT);
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof C38758bn4) {
            return new C26738nv((C38758bn4) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return m76366b(C39159cT5.m61288o(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + keySpec + InstructionFileId.DOT);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C26289mv) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (C37575Zm4.class.isAssignableFrom(cls)) {
                C26289mv c26289mv = (C26289mv) key;
                return new C37575Zm4(c26289mv.m24712c(), c26289mv.m24714a(), c26289mv.m24711d(), c26289mv.m24713b(), c26289mv.m24709f(), c26289mv.m24710e());
            }
        } else if (!(key instanceof C26738nv)) {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + InstructionFileId.DOT);
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        } else {
            if (C38758bn4.class.isAssignableFrom(cls)) {
                C26738nv c26738nv = (C26738nv) key;
                return new C38758bn4(c26738nv.m22191d(), c26738nv.m22194a(), c26738nv.m22192c(), c26738nv.m22193b());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + InstructionFileId.DOT);
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C26289mv) || (key instanceof C26738nv)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
