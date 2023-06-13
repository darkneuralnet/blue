package p000;

import android.content.Context;
/* renamed from: d68  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39562d68 extends AbstractC42566iA8 {

    /* renamed from: a */
    public final Context f76127a;

    /* renamed from: b */
    public final InterfaceC38424bD7 f76128b;

    public C39562d68(Context context, InterfaceC38424bD7 interfaceC38424bD7) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f76127a = context;
        this.f76128b = interfaceC38424bD7;
    }

    @Override // p000.AbstractC42566iA8
    /* renamed from: a */
    public final Context mo34380a() {
        return this.f76127a;
    }

    @Override // p000.AbstractC42566iA8
    /* renamed from: b */
    public final InterfaceC38424bD7 mo34379b() {
        return this.f76128b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC42566iA8) {
            AbstractC42566iA8 abstractC42566iA8 = (AbstractC42566iA8) obj;
            if (this.f76127a.equals(abstractC42566iA8.mo34380a()) && this.f76128b.equals(abstractC42566iA8.mo34379b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f76127a.hashCode() ^ 1000003) * 1000003) ^ this.f76128b.hashCode();
    }

    public final String toString() {
        String obj = this.f76127a.toString();
        String obj2 = this.f76128b.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 46 + obj2.length());
        sb.append("FlagsContext{context=");
        sb.append(obj);
        sb.append(", hermeticFileOverrides=");
        sb.append(obj2);
        sb.append("}");
        return sb.toString();
    }
}
