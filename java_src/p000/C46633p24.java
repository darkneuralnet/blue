package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import p000.V46;
/* renamed from: p24  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46633p24 implements InterfaceC45447n24 {

    /* renamed from: e */
    public static final V46.EnumC8541b f103028e = V46.EnumC8541b.f38571c;

    /* renamed from: a */
    public final ThreadLocal<Mac> f103029a;

    /* renamed from: b */
    public final String f103030b;

    /* renamed from: c */
    public final Key f103031c;

    /* renamed from: d */
    public final int f103032d;

    /* renamed from: p24$a */
    /* loaded from: classes6.dex */
    public class C27135a extends ThreadLocal<Mac> {
        public C27135a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Mac initialValue() {
            try {
                Mac m108639a = C32577Ed1.f7881f.m108639a(C46633p24.this.f103030b);
                m108639a.init(C46633p24.this.f103031c);
                return m108639a;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C46633p24(String str, Key key) throws GeneralSecurityException {
        C27135a c27135a = new C27135a();
        this.f103029a = c27135a;
        if (f103028e.mo80443a()) {
            this.f103030b = str;
            this.f103031c = key;
            if (key.getEncoded().length >= 16) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.f103032d = 20;
                        break;
                    case 1:
                        this.f103032d = 28;
                        break;
                    case 2:
                        this.f103032d = 32;
                        break;
                    case 3:
                        this.f103032d = 48;
                        break;
                    case 4:
                        this.f103032d = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
                }
                c27135a.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // p000.InterfaceC45447n24
    /* renamed from: a */
    public byte[] mo20026a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i <= this.f103032d) {
            this.f103029a.get().update(bArr);
            return Arrays.copyOf(this.f103029a.get().doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
