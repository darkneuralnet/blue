package p000;

import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m28432d2 = {"LEb5;", "LSC0;", C17296a.f69688o, "b", "(LEb5;)LSC0;", "transactionDispatcher", "room-ktx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: eD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40213eD0 {
    /* renamed from: a */
    public static final SC0 m43101a(AbstractC32563Eb5 abstractC32563Eb5) {
        Intrinsics.checkNotNullParameter(abstractC32563Eb5, "<this>");
        Map<String, Object> m108727i = abstractC32563Eb5.m108727i();
        Object obj = m108727i.get("QueryDispatcher");
        if (obj == null) {
            obj = C34017Kh1.m98513a(abstractC32563Eb5.m108723m());
            m108727i.put("QueryDispatcher", obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (SC0) obj;
    }

    /* renamed from: b */
    public static final SC0 m43100b(AbstractC32563Eb5 abstractC32563Eb5) {
        Intrinsics.checkNotNullParameter(abstractC32563Eb5, "<this>");
        Map<String, Object> m108727i = abstractC32563Eb5.m108727i();
        Object obj = m108727i.get("TransactionDispatcher");
        if (obj == null) {
            obj = C34017Kh1.m98513a(abstractC32563Eb5.m108722p());
            m108727i.put("TransactionDispatcher", obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (SC0) obj;
    }
}
