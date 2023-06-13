package p000;
/* renamed from: aD8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37832aD8 implements InterfaceC38952c69 {

    /* renamed from: a */
    public final /* synthetic */ PC8 f50094a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC38952c69 f50095b;

    public C37832aD8(PC8 pc8, InterfaceC38952c69 interfaceC38952c69) {
        this.f50094a = pc8;
        this.f50095b = interfaceC38952c69;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f50095b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // p000.InterfaceC38952c69
    public final Mb9 zza() throws Exception {
        PC8 m107400c = FE8.m107400c(this.f50094a);
        try {
            return this.f50095b.zza();
        } finally {
            FE8.m107400c(m107400c);
        }
    }
}
