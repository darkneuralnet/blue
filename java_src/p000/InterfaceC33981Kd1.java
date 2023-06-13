package p000;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
/* renamed from: Kd1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC33981Kd1<T> {

    /* renamed from: Kd1$a */
    /* loaded from: classes6.dex */
    public static class C4509a implements InterfaceC33981Kd1<Cipher> {
        @Override // p000.InterfaceC33981Kd1
        /* renamed from: b */
        public Cipher mo98641a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Cipher.getInstance(str);
            }
            return Cipher.getInstance(str, provider);
        }
    }

    /* renamed from: Kd1$b */
    /* loaded from: classes6.dex */
    public static class C4510b implements InterfaceC33981Kd1<KeyAgreement> {
        @Override // p000.InterfaceC33981Kd1
        /* renamed from: b */
        public KeyAgreement mo98641a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyAgreement.getInstance(str);
            }
            return KeyAgreement.getInstance(str, provider);
        }
    }

    /* renamed from: Kd1$c */
    /* loaded from: classes6.dex */
    public static class C4511c implements InterfaceC33981Kd1<KeyFactory> {
        @Override // p000.InterfaceC33981Kd1
        /* renamed from: b */
        public KeyFactory mo98641a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyFactory.getInstance(str);
            }
            return KeyFactory.getInstance(str, provider);
        }
    }

    /* renamed from: Kd1$d */
    /* loaded from: classes6.dex */
    public static class C4512d implements InterfaceC33981Kd1<KeyPairGenerator> {
        @Override // p000.InterfaceC33981Kd1
        /* renamed from: b */
        public KeyPairGenerator mo98641a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyPairGenerator.getInstance(str);
            }
            return KeyPairGenerator.getInstance(str, provider);
        }
    }

    /* renamed from: Kd1$e */
    /* loaded from: classes6.dex */
    public static class C4513e implements InterfaceC33981Kd1<Mac> {
        @Override // p000.InterfaceC33981Kd1
        /* renamed from: b */
        public Mac mo98641a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Mac.getInstance(str);
            }
            return Mac.getInstance(str, provider);
        }
    }

    /* renamed from: Kd1$f */
    /* loaded from: classes6.dex */
    public static class C4514f implements InterfaceC33981Kd1<MessageDigest> {
        @Override // p000.InterfaceC33981Kd1
        /* renamed from: b */
        public MessageDigest mo98641a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return MessageDigest.getInstance(str);
            }
            return MessageDigest.getInstance(str, provider);
        }
    }

    /* renamed from: Kd1$g */
    /* loaded from: classes6.dex */
    public static class C4515g implements InterfaceC33981Kd1<Signature> {
        @Override // p000.InterfaceC33981Kd1
        /* renamed from: b */
        public Signature mo98641a(String str, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Signature.getInstance(str);
            }
            return Signature.getInstance(str, provider);
        }
    }

    /* renamed from: a */
    T mo98641a(String str, Provider provider) throws GeneralSecurityException;
}
