package p000;
/* renamed from: NR7 */
/* loaded from: classes6.dex */
public final class NR7 implements M99<Void> {

    /* renamed from: a */
    public final /* synthetic */ String f24601a;

    /* renamed from: b */
    public final /* synthetic */ String f24602b;

    /* renamed from: c */
    public final /* synthetic */ String f24603c;

    /* renamed from: d */
    public final /* synthetic */ String f24604d;

    public NR7(C39763dS7 c39763dS7, String str, String str2, String str3, String str4) {
        this.f24601a = str;
        this.f24602b = str2;
        this.f24603c = str3;
        this.f24604d = str4;
    }

    @Override // p000.M99
    public final void zza(Throwable th) {
        th.getMessage();
    }

    @Override // p000.M99
    public final /* bridge */ /* synthetic */ void zzb(Void r3) {
        String.format("A session storage token (%s) is stored for key: %s:%s", this.f24602b, this.f24603c, this.f24604d);
    }
}
