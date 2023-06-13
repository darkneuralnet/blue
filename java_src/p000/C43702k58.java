package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgx;
import p000.C43702k58;
import p000.V78;
/* renamed from: k58  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C43702k58<MessageType extends V78<MessageType, BuilderType>, BuilderType extends C43702k58<MessageType, BuilderType>> extends AbstractC48665sT7<MessageType, BuilderType> {

    /* renamed from: b */
    public final V78 f93889b;

    /* renamed from: c */
    public V78 f93890c;

    public C43702k58(MessageType messagetype) {
        this.f93889b = messagetype;
        if (!messagetype.m80356D()) {
            this.f93890c = messagetype.m80347j();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: f */
    public static void m29320f(Object obj, Object obj2) {
        C48247rl8.m15451a().m15450b(obj.getClass()).mo40919a(obj, obj2);
    }

    @Override // p000.InterfaceC48227rj8
    /* renamed from: d */
    public final boolean mo15534d() {
        return V78.m80357C(this.f93890c, false);
    }

    @Override // p000.AbstractC48665sT7
    /* renamed from: g */
    public final C43702k58 mo14158e() {
        C43702k58 c43702k58 = (C43702k58) this.f93889b.mo3770G(5, null, null);
        c43702k58.f93890c = mo29322a();
        return c43702k58;
    }

    /* renamed from: h */
    public final C43702k58 m29318h(V78 v78) {
        if (!this.f93889b.equals(v78)) {
            if (!this.f93890c.m80356D()) {
                mo29314n();
            }
            m29320f(this.f93890c, v78);
        }
        return this;
    }

    @Override // p000.InterfaceC35437Qi8
    /* renamed from: j */
    public final MessageType mo29321c() {
        MessageType mo29322a = mo29322a();
        if (mo29322a.mo15534d()) {
            return mo29322a;
        }
        throw new zzgx(mo29322a);
    }

    @Override // p000.InterfaceC35437Qi8
    /* renamed from: k */
    public MessageType mo29322a() {
        if (!this.f93890c.m80356D()) {
            return (MessageType) this.f93890c;
        }
        this.f93890c.m80338u();
        return (MessageType) this.f93890c;
    }

    /* renamed from: m */
    public final void m29315m() {
        if (!this.f93890c.m80356D()) {
            mo29314n();
        }
    }

    /* renamed from: n */
    public void mo29314n() {
        V78 m80347j = this.f93889b.m80347j();
        m29320f(m80347j, this.f93890c);
        this.f93890c = m80347j;
    }
}
