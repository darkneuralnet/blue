package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\"\u001a\u0010\t\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m28432d2 = {"LEu6;", "LDf;", Entry.TYPE_TEXT, "LA96;", C17296a.f69688o, "LHe3;", "LHe3;", "b", "()LHe3;", "ValidatingEmptyOffsetMappingIdentity", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: vj6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50595vj6 {

    /* renamed from: a */
    public static final InterfaceC33290He3 f114553a = new C50003uj6(InterfaceC33290He3.f13687a.m103617a(), 0, 0);

    /* renamed from: a */
    public static final A96 m8229a(InterfaceC32735Eu6 interfaceC32735Eu6, C1577Df text) {
        Intrinsics.checkNotNullParameter(interfaceC32735Eu6, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        A96 filter = interfaceC32735Eu6.filter(text);
        return new A96(filter.m116051b(), new C50003uj6(filter.m116052a(), text.length(), filter.m116051b().length()));
    }

    /* renamed from: b */
    public static final InterfaceC33290He3 m8228b() {
        return f114553a;
    }
}
