package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"LOr6;", "LZC0;", C17296a.f69688o, "(LOr6;)LZC0;", "viewModelScope", "lifecycle-viewmodel-ktx_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Tr6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36218Tr6 {
    /* renamed from: a */
    public static final ZC0 m82333a(AbstractC35048Or6 abstractC35048Or6) {
        Intrinsics.checkNotNullParameter(abstractC35048Or6, "<this>");
        ZC0 zc0 = (ZC0) abstractC35048Or6.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (zc0 != null) {
            return zc0;
        }
        Object tagIfAbsent = abstractC35048Or6.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C31712Al0(XU5.m76946b(null, 1, null).plus(T41.m84376c().mo14156G())));
        Intrinsics.checkNotNullExpressionValue(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (ZC0) tagIfAbsent;
    }
}
