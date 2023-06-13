package p000;
/* renamed from: A58 */
/* loaded from: classes5.dex */
public class A58 extends C43702k58 implements InterfaceC48227rj8 {
    public A58(Q58 q58) {
        super(q58);
    }

    @Override // p000.C43702k58
    /* renamed from: n */
    public final void mo29314n() {
        super.mo29314n();
        if (((Q58) this.f93890c).zza != C39542d48.m44638d()) {
            Q58 q58 = (Q58) this.f93890c;
            q58.zza = q58.zza.clone();
        }
    }

    @Override // p000.C43702k58
    /* renamed from: o */
    public final Q58 mo29316k() {
        if (!((Q58) this.f93890c).m80356D()) {
            return (Q58) this.f93890c;
        }
        ((Q58) this.f93890c).zza.m44635g();
        return (Q58) super.mo29322a();
    }
}
