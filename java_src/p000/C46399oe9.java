package p000;
/* renamed from: oe9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46399oe9 extends Ce9 {
    public /* synthetic */ C46399oe9(C41655ge9 c41655ge9) {
        super(null);
    }

    @Override // p000.Ce9
    /* renamed from: a */
    public final void mo20701a(Object obj, long j) {
        ((InterfaceC39857dc9) C51221wm9.m6356k(obj, j)).zzb();
    }

    @Override // p000.Ce9
    /* renamed from: b */
    public final void mo20700b(Object obj, Object obj2, long j) {
        InterfaceC39857dc9 interfaceC39857dc9 = (InterfaceC39857dc9) C51221wm9.m6356k(obj, j);
        InterfaceC39857dc9 interfaceC39857dc92 = (InterfaceC39857dc9) C51221wm9.m6356k(obj2, j);
        int size = interfaceC39857dc9.size();
        int size2 = interfaceC39857dc92.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC39857dc9.zzc()) {
                interfaceC39857dc9 = interfaceC39857dc9.mo1843d(size2 + size);
            }
            interfaceC39857dc9.addAll(interfaceC39857dc92);
        }
        if (size > 0) {
            interfaceC39857dc92 = interfaceC39857dc9;
        }
        C51221wm9.m6343x(obj, j, interfaceC39857dc92);
    }

    private C46399oe9() {
        super(null);
    }
}
