package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¨\u0006\t"}, m28432d2 = {"", "name", "Lkotlin/Function1;", "LzY2;", "", "Lkotlin/ExtensionFunctionType;", "builder", "LmY2;", C17296a.f69688o, "navigation-common_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: nY2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45741nY2 {
    /* renamed from: a */
    public static final C45148mY2 m23553a(String name, Function1<? super C52855zY2, Unit> builder) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(builder, "builder");
        C52855zY2 c52855zY2 = new C52855zY2();
        builder.invoke(c52855zY2);
        return new C45148mY2(name, c52855zY2.m1179a());
    }
}
