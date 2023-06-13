package p000;
/* renamed from: gY8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41596gY8 extends AbstractC52268yY8 {
    public /* synthetic */ C41596gY8(WX8 wx8) {
        super(null);
    }

    @Override // p000.AbstractC52268yY8
    /* renamed from: a */
    public final void mo3270a(Object obj, long j) {
        ((NV8) C44919m89.m26268k(obj, j)).zzb();
    }

    @Override // p000.AbstractC52268yY8
    /* renamed from: b */
    public final void mo3269b(Object obj, Object obj2, long j) {
        NV8 nv8 = (NV8) C44919m89.m26268k(obj, j);
        NV8 nv82 = (NV8) C44919m89.m26268k(obj2, j);
        int size = nv8.size();
        int size2 = nv82.size();
        if (size > 0 && size2 > 0) {
            if (!nv8.zzc()) {
                nv8 = nv8.mo21037d(size2 + size);
            }
            nv8.addAll(nv82);
        }
        if (size > 0) {
            nv82 = nv8;
        }
        C44919m89.m26255x(obj, j, nv82);
    }

    private C41596gY8() {
        super(null);
    }
}
