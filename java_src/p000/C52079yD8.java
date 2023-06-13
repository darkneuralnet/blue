package p000;
/* renamed from: yD8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52079yD8 implements InterfaceC43713k69 {

    /* renamed from: a */
    public final /* synthetic */ PC8 f119153a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC43713k69 f119154b;

    public C52079yD8(PC8 pc8, InterfaceC43713k69 interfaceC43713k69) {
        this.f119153a = pc8;
        this.f119154b = interfaceC43713k69;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f119154b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // p000.InterfaceC43713k69
    public final Mb9 zza(Object obj) throws Exception {
        PC8 m107400c = FE8.m107400c(this.f119153a);
        try {
            return this.f119154b.zza(obj);
        } finally {
            FE8.m107400c(m107400c);
        }
    }
}
