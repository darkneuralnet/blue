package p000;
/* renamed from: mD8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44965mD8 implements YH8 {

    /* renamed from: a */
    public final /* synthetic */ PC8 f97675a;

    /* renamed from: b */
    public final /* synthetic */ YH8 f97676b;

    public C44965mD8(PC8 pc8, YH8 yh8) {
        this.f97675a = pc8;
        this.f97676b = yh8;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f97676b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // p000.YH8
    public final Object zza(Object obj) {
        PC8 m107400c = FE8.m107400c(this.f97675a);
        try {
            return this.f97676b.zza(obj);
        } finally {
            FE8.m107400c(m107400c);
        }
    }
}
