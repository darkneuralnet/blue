package p000;

import com.google.crypto.tink.shaded.protobuf.InterfaceC18149F;
import java.security.GeneralSecurityException;
/* renamed from: D24 */
/* loaded from: classes6.dex */
public abstract class D24<PrimitiveT, KeyProtoT extends InterfaceC18149F> {

    /* renamed from: a */
    public final Class<PrimitiveT> f5108a;

    public D24(Class<PrimitiveT> cls) {
        this.f5108a = cls;
    }

    /* renamed from: a */
    public abstract PrimitiveT mo2650a(KeyProtoT keyprotot) throws GeneralSecurityException;

    /* renamed from: b */
    public final Class<PrimitiveT> m111022b() {
        return this.f5108a;
    }
}
