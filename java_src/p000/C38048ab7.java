package p000;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwz;
import p000.AbstractC41030fb7;
import p000.C38048ab7;
/* renamed from: ab7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C38048ab7<MessageType extends AbstractC41030fb7<MessageType, BuilderType>, BuilderType extends C38048ab7<MessageType, BuilderType>> extends AbstractC39835da7<MessageType, BuilderType> {

    /* renamed from: b */
    public final AbstractC41030fb7 f50702b;

    /* renamed from: c */
    public AbstractC41030fb7 f50703c;

    public C38048ab7(MessageType messagetype) {
        this.f50702b = messagetype;
        if (!messagetype.m41132o()) {
            this.f50703c = messagetype.m41125x();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: l */
    public static void m71109l(Object obj, Object obj2) {
        C41040fc7.m41106a().m41105b(obj.getClass()).mo33745c(obj, obj2);
    }

    @Override // p000.InterfaceC36309Ub7
    /* renamed from: e */
    public final boolean mo41142e() {
        return AbstractC41030fb7.m41133n(this.f50703c, false);
    }

    @Override // p000.AbstractC39835da7
    /* renamed from: m */
    public final C38048ab7 mo44112k() {
        C38048ab7 c38048ab7 = (C38048ab7) this.f50702b.mo1009p(5, null, null);
        c38048ab7.f50703c = mo64284u1();
        return c38048ab7;
    }

    /* renamed from: n */
    public final C38048ab7 m71107n(AbstractC41030fb7 abstractC41030fb7) {
        if (!this.f50702b.equals(abstractC41030fb7)) {
            if (!this.f50703c.m41132o()) {
                mo64286r();
            }
            m71109l(this.f50703c, abstractC41030fb7);
        }
        return this;
    }

    @Override // p000.InterfaceC35841Sb7
    /* renamed from: o */
    public final MessageType mo71104s() {
        MessageType mo64284u1 = mo64284u1();
        if (mo64284u1.mo41142e()) {
            return mo64284u1;
        }
        throw new zbwz(mo64284u1);
    }

    @Override // p000.InterfaceC35841Sb7
    /* renamed from: p */
    public MessageType mo64284u1() {
        if (!this.f50703c.m41132o()) {
            return (MessageType) this.f50703c;
        }
        this.f50703c.m41138i();
        return (MessageType) this.f50703c;
    }

    /* renamed from: q */
    public final void m71105q() {
        if (!this.f50703c.m41132o()) {
            mo64286r();
        }
    }

    /* renamed from: r */
    public void mo64286r() {
        AbstractC41030fb7 m41125x = this.f50702b.m41125x();
        m71109l(m41125x, this.f50703c);
        this.f50703c = m41125x;
    }
}
