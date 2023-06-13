package p000;
/* renamed from: Zx8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37678Zx8<T> extends AbstractC50204v39<T> {

    /* renamed from: i */
    public C51933xy8<T> f49579i;

    /* renamed from: j */
    public final int f49580j;

    public /* synthetic */ C37678Zx8(C51933xy8 c51933xy8, int i, C32296Cx8 c32296Cx8) {
        this.f49579i = c51933xy8;
        this.f49580j = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0006, code lost:
        r0 = p000.C51933xy8.m4367a(r0).f27614b;
     */
    @Override // p000.AbstractC50204v39
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo9253e() {
        InterfaceC38952c69 interfaceC38952c69;
        C51933xy8<T> c51933xy8 = this.f49579i;
        if (c51933xy8 == null || interfaceC38952c69 == null) {
            return null;
        }
        String valueOf = String.valueOf(interfaceC38952c69);
        StringBuilder sb = new StringBuilder(valueOf.length() + 11);
        sb.append("callable=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        C44819ly8 c44819ly8 = (C44819ly8) C51933xy8.m4363e(this.f49579i).get();
        if (c44819ly8 != null) {
            String valueOf2 = String.valueOf(sb2);
            String valueOf3 = String.valueOf(c44819ly8);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 10 + valueOf3.length());
            sb3.append(valueOf2);
            sb3.append(", trial=[");
            sb3.append(valueOf3);
            sb3.append("]");
            return sb3.toString();
        }
        return sb2;
    }

    @Override // p000.AbstractC50204v39
    /* renamed from: f */
    public final void mo9252f() {
        C44819ly8 c44819ly8;
        int i;
        C51933xy8<T> c51933xy8 = this.f49579i;
        this.f49579i = null;
        if (c51933xy8 != null && C51933xy8.m4361g(c51933xy8)) {
            do {
                c44819ly8 = (C44819ly8) C51933xy8.m4363e(c51933xy8).get();
                if (c44819ly8 != null) {
                    i = c44819ly8.f97032i;
                    if (i <= this.f49580j) {
                        c44819ly8.cancel(true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!C42482i24.m35337a(C51933xy8.m4363e(c51933xy8), c44819ly8, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC50204v39
    /* renamed from: g */
    public final boolean mo9251g(Mb9<? extends T> mb9) {
        return super.mo9251g(mb9);
    }
}
