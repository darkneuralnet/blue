package p000;
/* renamed from: E96 */
/* loaded from: classes5.dex */
public class E96 extends D96 {
    public E96(C32951Fs6 c32951Fs6) {
        super(c32951Fs6);
    }

    @Override // p000.D96
    /* renamed from: l */
    public void mo109333l(boolean z) {
        this.f5303b.reset();
        if (!z) {
            this.f5303b.postTranslate(this.f5304c.m106401G(), this.f5304c.m106375l() - this.f5304c.m106402F());
            return;
        }
        this.f5303b.setTranslate(-(this.f5304c.m106374m() - this.f5304c.m106400H()), this.f5304c.m106375l() - this.f5304c.m106402F());
        this.f5303b.postScale(-1.0f, 1.0f);
    }
}
