package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p000.C49998uj1;
/* renamed from: qh5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C47611qh5 {

    /* renamed from: a */
    public final C49711uE2<InterfaceC38133ak2, String> f105615a = new C49711uE2<>(1000);

    /* renamed from: b */
    public final InterfaceC41591gY3<C27652b> f105616b = C49998uj1.m9835d(10, new C27651a());

    /* renamed from: qh5$a */
    /* loaded from: classes5.dex */
    public class C27651a implements C49998uj1.InterfaceC29289d<C27652b> {
        public C27651a() {
        }

        @Override // p000.C49998uj1.InterfaceC29289d
        /* renamed from: a */
        public C27652b create() {
            try {
                return new C27652b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: qh5$b */
    /* loaded from: classes5.dex */
    public static final class C27652b implements C49998uj1.InterfaceC29291f {

        /* renamed from: b */
        public final MessageDigest f105618b;

        /* renamed from: c */
        public final LP5 f105619c = LP5.m96961a();

        public C27652b(MessageDigest messageDigest) {
            this.f105618b = messageDigest;
        }

        @Override // p000.C49998uj1.InterfaceC29291f
        /* renamed from: e */
        public LP5 mo9828e() {
            return this.f105619c;
        }
    }

    /* renamed from: a */
    public final String m17248a(InterfaceC38133ak2 interfaceC38133ak2) {
        C27652b c27652b = (C27652b) C52865zZ3.m1111d(this.f105616b.mo9830a());
        try {
            interfaceC38133ak2.mo3854a(c27652b.f105618b);
            return C47029pi6.m18903w(c27652b.f105618b.digest());
        } finally {
            this.f105616b.mo9829b(c27652b);
        }
    }

    /* renamed from: b */
    public String m17247b(InterfaceC38133ak2 interfaceC38133ak2) {
        String m10525g;
        synchronized (this.f105615a) {
            m10525g = this.f105615a.m10525g(interfaceC38133ak2);
        }
        if (m10525g == null) {
            m10525g = m17248a(interfaceC38133ak2);
        }
        synchronized (this.f105615a) {
            this.f105615a.m10523k(interfaceC38133ak2, m10525g);
        }
        return m10525g;
    }
}
