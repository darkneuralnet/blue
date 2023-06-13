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
/* renamed from: hO2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42093hO2 extends KeyFactorySpi implements InterfaceC13287bp {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + InstructionFileId.DOT);
        }
        try {
            C44301l64 m27863o = C44301l64.m27863o(AbstractC7305S.m86134v(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (BD3.f2083n.m86135u(m27863o.m27862s().m105700j())) {
                    C43279jO2 m30731u = C43279jO2.m30731u(m27863o.m27859w());
                    return new C20621fv(new C43872kO2(m30731u.m30729w(), m30731u.m30730v(), m30731u.m30733o(), m30731u.m30732s(), m30731u.m30728x(), C33563Ii6.m101754b(m30731u.m30734j()).mo15579d()));
                }
                throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
            } catch (IOException unused) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
            }
        } catch (IOException e) {
            throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e);
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + InstructionFileId.DOT);
        }
        try {
            C39159cT5 m61288o = C39159cT5.m61288o(AbstractC7305S.m86134v(((X509EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (BD3.f2083n.m86135u(m61288o.m61289j().m105700j())) {
                    C44465lO2 m27344s = C44465lO2.m27344s(m61288o.m61286u());
                    return new C22509gv(new C45058mO2(m27344s.m27343u(), m27344s.m27342v(), m27344s.m27345o(), C33563Ii6.m101754b(m27344s.m27346j()).mo15579d()));
                }
                throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
            } catch (IOException e) {
                throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec: " + e.getMessage());
            }
        } catch (IOException e2) {
            throw new InvalidKeySpecException(e2.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        return null;
    }
}
