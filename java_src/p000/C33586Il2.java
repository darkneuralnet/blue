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
/* renamed from: Il2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C33586Il2 extends KeyFactorySpi implements InterfaceC13287bp {
    /* renamed from: a */
    public PrivateKey m101733a(C44301l64 c44301l64) throws IOException {
        return new C19901dv(c44301l64);
    }

    /* renamed from: b */
    public PublicKey m101732b(C39159cT5 c39159cT5) throws IOException {
        return new C20138ev(c39159cT5);
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return m101733a(C44301l64.m27863o(AbstractC7305S.m86134v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString(), e);
            }
        }
        throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + InstructionFileId.DOT);
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return m101732b(C39159cT5.m61288o(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString(), e);
            }
        }
        throw new InvalidKeySpecException("unknown key specification: " + keySpec + InstructionFileId.DOT);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C19901dv) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (!(key instanceof C20138ev)) {
            throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + InstructionFileId.DOT);
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("unknown key specification: " + cls + InstructionFileId.DOT);
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C19901dv) || (key instanceof C20138ev)) {
            return key;
        }
        throw new InvalidKeyException("unsupported key type");
    }
}
