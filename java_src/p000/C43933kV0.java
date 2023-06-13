package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000e"}, m28432d2 = {"LkV0;", "T", "LjV0;", "Lvf;", "V", "Lwb6;", "typeConverter", "Lnk6;", C17296a.f69688o, "Lnu1;", "Lnu1;", "floatDecaySpec", "<init>", "(Lnu1;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kV0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43933kV0<T> implements InterfaceC43340jV0<T> {

    /* renamed from: a */
    public final InterfaceC45958nu1 f94441a;

    public C43933kV0(InterfaceC45958nu1 floatDecaySpec) {
        Intrinsics.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.f94441a = floatDecaySpec;
    }

    @Override // p000.InterfaceC43340jV0
    /* renamed from: a */
    public <V extends AbstractC29607vf> InterfaceC45863nk6<V> mo28912a(InterfaceC51108wb6<T, V> typeConverter) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        return new C48235rk6(this.f94441a);
    }
}
