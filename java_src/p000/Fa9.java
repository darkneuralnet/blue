package p000;

import com.google.android.gms.internal.mlkit_vision_face_bundled.zzqu;
import p000.AbstractC49926ub9;
import p000.Fa9;
/* renamed from: Fa9 */
/* loaded from: classes5.dex */
public class Fa9<MessageType extends AbstractC49926ub9<MessageType, BuilderType>, BuilderType extends Fa9<MessageType, BuilderType>> extends AbstractC47834r39<MessageType, BuilderType> {

    /* renamed from: b */
    public final AbstractC49926ub9 f9742b;

    /* renamed from: c */
    public AbstractC49926ub9 f9743c;

    /* renamed from: d */
    public boolean f9744d = false;

    public Fa9(MessageType messagetype) {
        this.f9742b = messagetype;
        this.f9743c = (AbstractC49926ub9) messagetype.mo9690n(4, null, null);
    }

    /* renamed from: j */
    public static final void m106924j(AbstractC49926ub9 abstractC49926ub9, AbstractC49926ub9 abstractC49926ub92) {
        C42288hi9.m36060a().m36059b(abstractC49926ub9.getClass()).mo83166a(abstractC49926ub9, abstractC49926ub92);
    }

    @Override // p000.AbstractC47834r39
    /* renamed from: f */
    public final /* synthetic */ AbstractC47834r39 mo16550f(A39 a39) {
        m106922l((AbstractC49926ub9) a39);
        return this;
    }

    @Override // p000.InterfaceC51161wg9
    /* renamed from: g */
    public final /* synthetic */ InterfaceC47012pg9 mo6491g() {
        return this.f9742b;
    }

    @Override // p000.AbstractC47834r39
    /* renamed from: k */
    public final Fa9 mo16551e() {
        Fa9 fa9 = (Fa9) this.f9742b.mo9690n(5, null, null);
        fa9.m106922l(zzs());
        return fa9;
    }

    /* renamed from: l */
    public final Fa9 m106922l(AbstractC49926ub9 abstractC49926ub9) {
        if (this.f9744d) {
            mo95153o();
            this.f9744d = false;
        }
        m106924j(this.f9743c, abstractC49926ub9);
        return this;
    }

    /* renamed from: m */
    public final MessageType m106921m() {
        MessageType zzs = zzs();
        if (zzs.zzv()) {
            return zzs;
        }
        throw new zzqu(zzs);
    }

    @Override // p000.InterfaceC42861ig9
    /* renamed from: n */
    public MessageType zzs() {
        if (this.f9744d) {
            return (MessageType) this.f9743c;
        }
        AbstractC49926ub9 abstractC49926ub9 = this.f9743c;
        C42288hi9.m36060a().m36059b(abstractC49926ub9.getClass()).zzf(abstractC49926ub9);
        this.f9744d = true;
        return (MessageType) this.f9743c;
    }

    /* renamed from: o */
    public void mo95153o() {
        AbstractC49926ub9 abstractC49926ub9 = (AbstractC49926ub9) this.f9743c.mo9690n(4, null, null);
        m106924j(abstractC49926ub9, this.f9743c);
        this.f9743c = abstractC49926ub9;
    }

    @Override // p000.InterfaceC51161wg9
    public final boolean zzv() {
        return AbstractC49926ub9.m9986l(this.f9743c, false);
    }
}
