package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\t"}, m28432d2 = {"", "Lew1;", "fonts", "Lkw1;", "b", "([Lew1;)Lkw1;", "LIb6;", "typeface", C17296a.f69688o, "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: lw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44792lw1 {
    /* renamed from: a */
    public static final AbstractC44199kw1 m26660a(InterfaceC33500Ib6 typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        return new C47728qt2(typeface);
    }

    /* renamed from: b */
    public static final AbstractC44199kw1 m26659b(InterfaceC40641ew1... fonts) {
        List asList;
        Intrinsics.checkNotNullParameter(fonts, "fonts");
        asList = ArraysKt___ArraysJvmKt.asList(fonts);
        return new C48350rw1(asList);
    }
}
