package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¨\u0006\b"}, m28432d2 = {"Lbi2;", "from", "Lkotlin/Function1;", "Lhi2;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", C17296a.f69688o, "kotlinx-serialization-json"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Ji2 */
/* loaded from: classes8.dex */
public final class C33793Ji2 {
    /* renamed from: a */
    public static final AbstractC38706bi2 m99926a(AbstractC38706bi2 from, Function1<? super C42281hi2, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        C42281hi2 c42281hi2 = new C42281hi2(from);
        builderAction.invoke(c42281hi2);
        return new C33325Hi2(c42281hi2.m36085a(), c42281hi2.m36084b());
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC38706bi2 m99925b(AbstractC38706bi2 abstractC38706bi2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC38706bi2 = AbstractC38706bi2.f57969d;
        }
        return m99926a(abstractC38706bi2, function1);
    }
}
