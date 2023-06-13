package p000;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* renamed from: dt5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40022dt5 {

    /* renamed from: a */
    public final Map<C19886d, AbstractC33109Gk2<?, ?>> f77349a;

    /* renamed from: b */
    public final Map<C19885c, AbstractC31705Ak2<?>> f77350b;

    /* renamed from: c */
    public final Map<C19886d, LE3<?, ?>> f77351c;

    /* renamed from: d */
    public final Map<C19885c, KE3<?>> f77352d;

    /* renamed from: dt5$c */
    /* loaded from: classes6.dex */
    public static class C19885c {

        /* renamed from: a */
        public final Class<? extends InterfaceC38226at5> f77357a;

        /* renamed from: b */
        public final Q70 f77358b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C19885c)) {
                return false;
            }
            C19885c c19885c = (C19885c) obj;
            if (!c19885c.f77357a.equals(this.f77357a) || !c19885c.f77358b.equals(this.f77358b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(this.f77357a, this.f77358b);
        }

        public String toString() {
            return this.f77357a.getSimpleName() + ", object identifier: " + this.f77358b;
        }

        public C19885c(Class<? extends InterfaceC38226at5> cls, Q70 q70) {
            this.f77357a = cls;
            this.f77358b = q70;
        }
    }

    /* renamed from: dt5$d */
    /* loaded from: classes6.dex */
    public static class C19886d {

        /* renamed from: a */
        public final Class<?> f77359a;

        /* renamed from: b */
        public final Class<? extends InterfaceC38226at5> f77360b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C19886d)) {
                return false;
            }
            C19886d c19886d = (C19886d) obj;
            if (!c19886d.f77359a.equals(this.f77359a) || !c19886d.f77360b.equals(this.f77360b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(this.f77359a, this.f77360b);
        }

        public String toString() {
            return this.f77359a.getSimpleName() + " with serialization type: " + this.f77360b.getSimpleName();
        }

        public C19886d(Class<?> cls, Class<? extends InterfaceC38226at5> cls2) {
            this.f77359a = cls;
            this.f77360b = cls2;
        }
    }

    /* renamed from: e */
    public <SerializationT extends InterfaceC38226at5> AbstractC38726bk2 m43544e(SerializationT serializationt, C34570Mq5 c34570Mq5) throws GeneralSecurityException {
        C19885c c19885c = new C19885c(serializationt.getClass(), serializationt.mo65324a());
        if (this.f77350b.containsKey(c19885c)) {
            return this.f77350b.get(c19885c).mo115324d(serializationt, c34570Mq5);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + c19885c + " available");
    }

    public C40022dt5(C19884b c19884b) {
        this.f77349a = new HashMap(c19884b.f77353a);
        this.f77350b = new HashMap(c19884b.f77354b);
        this.f77351c = new HashMap(c19884b.f77355c);
        this.f77352d = new HashMap(c19884b.f77356d);
    }

    /* renamed from: dt5$b */
    /* loaded from: classes6.dex */
    public static final class C19884b {

        /* renamed from: a */
        public final Map<C19886d, AbstractC33109Gk2<?, ?>> f77353a;

        /* renamed from: b */
        public final Map<C19885c, AbstractC31705Ak2<?>> f77354b;

        /* renamed from: c */
        public final Map<C19886d, LE3<?, ?>> f77355c;

        /* renamed from: d */
        public final Map<C19885c, KE3<?>> f77356d;

        public C19884b() {
            this.f77353a = new HashMap();
            this.f77354b = new HashMap();
            this.f77355c = new HashMap();
            this.f77356d = new HashMap();
        }

        /* renamed from: e */
        public C40022dt5 m43539e() {
            return new C40022dt5(this);
        }

        /* renamed from: f */
        public <SerializationT extends InterfaceC38226at5> C19884b m43538f(AbstractC31705Ak2<SerializationT> abstractC31705Ak2) throws GeneralSecurityException {
            C19885c c19885c = new C19885c(abstractC31705Ak2.m115325c(), abstractC31705Ak2.m115326b());
            if (this.f77354b.containsKey(c19885c)) {
                AbstractC31705Ak2<?> abstractC31705Ak22 = this.f77354b.get(c19885c);
                if (!abstractC31705Ak22.equals(abstractC31705Ak2) || !abstractC31705Ak2.equals(abstractC31705Ak22)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + c19885c);
                }
            } else {
                this.f77354b.put(c19885c, abstractC31705Ak2);
            }
            return this;
        }

        /* renamed from: g */
        public <KeyT extends AbstractC38726bk2, SerializationT extends InterfaceC38226at5> C19884b m43537g(AbstractC33109Gk2<KeyT, SerializationT> abstractC33109Gk2) throws GeneralSecurityException {
            C19886d c19886d = new C19886d(abstractC33109Gk2.m104816b(), abstractC33109Gk2.m104815c());
            if (this.f77353a.containsKey(c19886d)) {
                AbstractC33109Gk2<?, ?> abstractC33109Gk22 = this.f77353a.get(c19886d);
                if (!abstractC33109Gk22.equals(abstractC33109Gk2) || !abstractC33109Gk2.equals(abstractC33109Gk22)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + c19886d);
                }
            } else {
                this.f77353a.put(c19886d, abstractC33109Gk2);
            }
            return this;
        }

        /* renamed from: h */
        public <SerializationT extends InterfaceC38226at5> C19884b m43536h(KE3<SerializationT> ke3) throws GeneralSecurityException {
            C19885c c19885c = new C19885c(ke3.m99057c(), ke3.m99058b());
            if (this.f77356d.containsKey(c19885c)) {
                KE3<?> ke32 = this.f77356d.get(c19885c);
                if (!ke32.equals(ke3) || !ke3.equals(ke32)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + c19885c);
                }
            } else {
                this.f77356d.put(c19885c, ke3);
            }
            return this;
        }

        /* renamed from: i */
        public <ParametersT extends JE3, SerializationT extends InterfaceC38226at5> C19884b m43535i(LE3<ParametersT, SerializationT> le3) throws GeneralSecurityException {
            C19886d c19886d = new C19886d(le3.m97511b(), le3.m97510c());
            if (this.f77355c.containsKey(c19886d)) {
                LE3<?, ?> le32 = this.f77355c.get(c19886d);
                if (!le32.equals(le3) || !le3.equals(le32)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + c19886d);
                }
            } else {
                this.f77355c.put(c19886d, le3);
            }
            return this;
        }

        public C19884b(C40022dt5 c40022dt5) {
            this.f77353a = new HashMap(c40022dt5.f77349a);
            this.f77354b = new HashMap(c40022dt5.f77350b);
            this.f77355c = new HashMap(c40022dt5.f77351c);
            this.f77356d = new HashMap(c40022dt5.f77352d);
        }
    }
}
