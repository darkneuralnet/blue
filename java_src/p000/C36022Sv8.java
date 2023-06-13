package p000;

import p000.Np9;
/* renamed from: Sv8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36022Sv8<T extends Np9> extends AbstractC41241fw8<T> {

    /* renamed from: a */
    public final T f34500a;

    /* renamed from: b */
    public final C48830sk9 f34501b;

    public C36022Sv8(T t, C48830sk9 c48830sk9) {
        this.f34500a = t;
        if (c48830sk9 != null) {
            this.f34501b = c48830sk9;
            return;
        }
        throw new NullPointerException("Null extensionRegistryLite");
    }

    @Override // p000.AbstractC41241fw8
    /* renamed from: a */
    public final C48830sk9 mo40426a() {
        return this.f34501b;
    }

    @Override // p000.AbstractC41241fw8
    /* renamed from: b */
    public final T mo40425b() {
        return this.f34500a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC41241fw8) {
            AbstractC41241fw8 abstractC41241fw8 = (AbstractC41241fw8) obj;
            if (this.f34500a.equals(abstractC41241fw8.mo40425b()) && this.f34501b.equals(abstractC41241fw8.mo40426a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f34500a.hashCode() ^ 1000003) * 1000003) ^ this.f34501b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f34500a);
        String valueOf2 = String.valueOf(this.f34501b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 54 + valueOf2.length());
        sb.append("ProtoSerializer{defaultValue=");
        sb.append(valueOf);
        sb.append(", extensionRegistryLite=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // p000.AbstractC41241fw8, p000.InterfaceC31738An8
    public final /* bridge */ /* synthetic */ Object zza() {
        return this.f34500a;
    }
}
