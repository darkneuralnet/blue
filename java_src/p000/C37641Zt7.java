package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzatc;
import p000.AbstractC40627eu7;
import p000.C37641Zt7;
/* renamed from: Zt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C37641Zt7<MessageType extends AbstractC40627eu7<MessageType, BuilderType>, BuilderType extends C37641Zt7<MessageType, BuilderType>> extends AbstractC51872xs7<MessageType, BuilderType> {

    /* renamed from: b */
    public final AbstractC40627eu7 f49450b;

    /* renamed from: c */
    public AbstractC40627eu7 f49451c;

    /* renamed from: d */
    public boolean f49452d = false;

    public C37641Zt7(MessageType messagetype) {
        this.f49450b = messagetype;
        this.f49451c = (AbstractC40627eu7) messagetype.mo5B(4, null, null);
    }

    /* renamed from: f */
    public static final void m72344f(AbstractC40627eu7 abstractC40627eu7, AbstractC40627eu7 abstractC40627eu72) {
        C32979Fv7.m106247a().m106246b(abstractC40627eu7.getClass()).mo29762a(abstractC40627eu7, abstractC40627eu72);
    }

    @Override // p000.AbstractC51872xs7
    /* renamed from: e */
    public final /* synthetic */ AbstractC51872xs7 mo4528e(AbstractC52465ys7 abstractC52465ys7) {
        m72342j((AbstractC40627eu7) abstractC52465ys7);
        return this;
    }

    @Override // p000.AbstractC51872xs7
    /* renamed from: h */
    public final C37641Zt7 mo4529d() {
        C37641Zt7 c37641Zt7 = (C37641Zt7) this.f49450b.mo5B(5, null, null);
        c37641Zt7.m72342j(zzv());
        return c37641Zt7;
    }

    /* renamed from: j */
    public final C37641Zt7 m72342j(AbstractC40627eu7 abstractC40627eu7) {
        if (this.f49452d) {
            mo65288o();
            this.f49452d = false;
        }
        m72344f(this.f49451c, abstractC40627eu7);
        return this;
    }

    @Override // p000.InterfaceC40637ev7
    /* renamed from: l */
    public final MessageType mo42381i() {
        MessageType zzv = zzv();
        if (zzv.mo37320n()) {
            return zzv;
        }
        throw new zzatc(zzv);
    }

    @Override // p000.InterfaceC40637ev7
    /* renamed from: m */
    public MessageType zzv() {
        if (this.f49452d) {
            return (MessageType) this.f49451c;
        }
        AbstractC40627eu7 abstractC40627eu7 = this.f49451c;
        C32979Fv7.m106247a().m106246b(abstractC40627eu7.getClass()).zzf(abstractC40627eu7);
        this.f49452d = true;
        return (MessageType) this.f49451c;
    }

    @Override // p000.InterfaceC41823gv7
    /* renamed from: n */
    public final boolean mo37320n() {
        return AbstractC40627eu7.m42410A(this.f49451c, false);
    }

    /* renamed from: o */
    public void mo65288o() {
        AbstractC40627eu7 abstractC40627eu7 = (AbstractC40627eu7) this.f49451c.mo5B(4, null, null);
        m72344f(abstractC40627eu7, this.f49451c);
        this.f49451c = abstractC40627eu7;
    }

    @Override // p000.InterfaceC41823gv7
    public final /* synthetic */ InterfaceC41230fv7 zzw() {
        return this.f49450b;
    }
}
