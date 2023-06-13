package p000;

import p000.AbstractC35140Pb8;
import p000.C45775nb8;
/* renamed from: nb8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C45775nb8<MessageType extends AbstractC35140Pb8<MessageType, BuilderType>, BuilderType extends C45775nb8<MessageType, BuilderType>> extends Z18<MessageType, BuilderType> {

    /* renamed from: b */
    public final MessageType f100191b;

    /* renamed from: c */
    public MessageType f100192c;

    /* renamed from: d */
    public boolean f100193d = false;

    public C45775nb8(MessageType messagetype) {
        this.f100191b = messagetype;
        this.f100192c = (MessageType) messagetype.mo42375h(4, null, null);
    }

    /* renamed from: k */
    public static final void m23454k(MessageType messagetype, MessageType messagetype2) {
        C34528Ml8.m94915a().m94914b(messagetype.getClass()).mo2690f(messagetype, messagetype2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.Z18
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Z18 mo23459e(AbstractC45451n28 abstractC45451n28) {
        m23457g((AbstractC35140Pb8) abstractC45451n28);
        return this;
    }

    @Override // p000.Z18
    /* renamed from: f */
    public final BuilderType mo23460d() {
        BuilderType buildertype = (BuilderType) this.f100191b.mo42375h(5, null, null);
        buildertype.m23457g(zzg());
        return buildertype;
    }

    /* renamed from: g */
    public final BuilderType m23457g(MessageType messagetype) {
        if (this.f100193d) {
            m23455j();
            this.f100193d = false;
        }
        m23454k(this.f100192c, messagetype);
        return this;
    }

    @Override // p000.InterfaceC51783xj8
    /* renamed from: h */
    public MessageType zzg() {
        if (this.f100193d) {
            return this.f100192c;
        }
        MessageType messagetype = this.f100192c;
        C34528Ml8.m94915a().m94914b(messagetype.getClass()).mo2694b(messagetype);
        this.f100193d = true;
        return this.f100192c;
    }

    /* renamed from: j */
    public void m23455j() {
        MessageType messagetype = (MessageType) this.f100192c.mo42375h(4, null, null);
        m23454k(messagetype, this.f100192c);
        this.f100192c = messagetype;
    }

    @Override // p000.InterfaceC37318Yj8
    public final /* bridge */ /* synthetic */ InterfaceC34042Kj8 zzh() {
        return this.f100191b;
    }
}
