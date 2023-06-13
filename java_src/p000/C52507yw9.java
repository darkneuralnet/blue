package p000;
/* renamed from: yw9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52507yw9 implements InterfaceC33771Jf7 {

    /* renamed from: c */
    public static final Object f120435c = new Object();

    /* renamed from: a */
    public volatile InterfaceC33771Jf7 f120436a;

    /* renamed from: b */
    public volatile Object f120437b = f120435c;

    public C52507yw9(InterfaceC33771Jf7 interfaceC33771Jf7) {
        this.f120436a = interfaceC33771Jf7;
    }

    /* renamed from: a */
    public static InterfaceC33771Jf7 m2233a(InterfaceC33771Jf7 interfaceC33771Jf7) {
        interfaceC33771Jf7.getClass();
        if (interfaceC33771Jf7 instanceof C52507yw9) {
            return interfaceC33771Jf7;
        }
        return new C52507yw9(interfaceC33771Jf7);
    }

    @Override // p000.InterfaceC33771Jf7
    public final Object zza() {
        Object obj = this.f120437b;
        Object obj2 = f120435c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f120437b;
                if (obj == obj2) {
                    obj = this.f120436a.zza();
                    Object obj3 = this.f120437b;
                    if (obj3 != obj2 && obj3 != obj) {
                        String valueOf = String.valueOf(obj3);
                        String valueOf2 = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f120437b = obj;
                    this.f120436a = null;
                }
            }
        }
        return obj;
    }
}
