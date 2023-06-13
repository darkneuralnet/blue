package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.InterfaceC18149F;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p000.AbstractC35449Qk2;
/* renamed from: tk2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49416tk2<PrimitiveT, KeyProtoT extends InterfaceC18149F> implements InterfaceC48823sk2<PrimitiveT> {

    /* renamed from: a */
    public final AbstractC35449Qk2<KeyProtoT> f110956a;

    /* renamed from: b */
    public final Class<PrimitiveT> f110957b;

    /* renamed from: tk2$a */
    /* loaded from: classes6.dex */
    public static class C28814a<KeyFormatProtoT extends InterfaceC18149F, KeyProtoT extends InterfaceC18149F> {

        /* renamed from: a */
        public final AbstractC35449Qk2.AbstractC6849a<KeyFormatProtoT, KeyProtoT> f110958a;

        public C28814a(AbstractC35449Qk2.AbstractC6849a<KeyFormatProtoT, KeyProtoT> abstractC6849a) {
            this.f110958a = abstractC6849a;
        }

        /* renamed from: a */
        public KeyProtoT m11824a(AbstractC18199g abstractC18199g) throws GeneralSecurityException, InvalidProtocolBufferException {
            return m11823b(this.f110958a.mo2647d(abstractC18199g));
        }

        /* renamed from: b */
        public final KeyProtoT m11823b(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException {
            this.f110958a.mo2646e(keyformatprotot);
            return this.f110958a.mo2648a(keyformatprotot);
        }
    }

    public C49416tk2(AbstractC35449Qk2<KeyProtoT> abstractC35449Qk2, Class<PrimitiveT> cls) {
        if (!abstractC35449Qk2.m88101i().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", abstractC35449Qk2.toString(), cls.getName()));
        }
        this.f110956a = abstractC35449Qk2;
        this.f110957b = cls;
    }

    @Override // p000.InterfaceC48823sk2
    /* renamed from: a */
    public final C42301hk2 mo11830a(AbstractC18199g abstractC18199g) throws GeneralSecurityException {
        try {
            return C42301hk2.m35925N().m35919z(mo11827d()).m35921A(m11826e().m11824a(abstractC18199g).mo47796d()).m35920y(this.f110956a.mo2657g()).build();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // p000.InterfaceC48823sk2
    /* renamed from: b */
    public final PrimitiveT mo11829b(AbstractC18199g abstractC18199g) throws GeneralSecurityException {
        try {
            return m11825f(this.f110956a.mo2656h(abstractC18199g));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f110956a.m88103c().getName(), e);
        }
    }

    @Override // p000.InterfaceC48823sk2
    /* renamed from: c */
    public final InterfaceC18149F mo11828c(AbstractC18199g abstractC18199g) throws GeneralSecurityException {
        try {
            return m11826e().m11824a(abstractC18199g);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f110956a.mo2658f().m88100b().getName(), e);
        }
    }

    @Override // p000.InterfaceC48823sk2
    /* renamed from: d */
    public final String mo11827d() {
        return this.f110956a.mo2659d();
    }

    /* renamed from: e */
    public final C28814a<?, KeyProtoT> m11826e() {
        return new C28814a<>(this.f110956a.mo2658f());
    }

    /* renamed from: f */
    public final PrimitiveT m11825f(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (!Void.class.equals(this.f110957b)) {
            this.f110956a.mo2655j(keyprotot);
            return (PrimitiveT) this.f110956a.m88102e(keyprotot, (Class<PrimitiveT>) this.f110957b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }
}
