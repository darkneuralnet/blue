package p000;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"Landroidx/lifecycle/f;", "Lzq2;", C17296a.f69688o, "(Landroidx/lifecycle/f;)Lzq2;", "coroutineScope", "lifecycle-common"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Bq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31993Bq2 {
    /* renamed from: a */
    public static final AbstractC53033zq2 m113448a(AbstractC11719f abstractC11719f) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        Intrinsics.checkNotNullParameter(abstractC11719f, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) abstractC11719f.m67022c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(abstractC11719f, XU5.m76946b(null, 1, null).plus(T41.m84376c().mo14156G()));
        } while (!C42482i24.m35337a(abstractC11719f.m67022c(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.m67045f();
        return lifecycleCoroutineScopeImpl;
    }
}
