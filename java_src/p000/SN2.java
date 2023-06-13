package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B-\u0012\u0006\u0010\r\u001a\u00020\b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0007\u001a\u00020\u0006\"\b\b\u0001\u0010\u0002*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\t\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LSN2;", "", "S", "LAN2;", "LRN2;", "viewModel", "LsN2;", "e", "", C17296a.f69688o, "Z", "b", "()Z", "debugMode", "LEN2;", "LEN2;", "c", "()LEN2;", "stateStore", "LZC0;", "LZC0;", "()LZC0;", "coroutineScope", "Lkotlin/coroutines/CoroutineContext;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "subscriptionCoroutineContextOverride", "<init>", "(ZLEN2;LZC0;Lkotlin/coroutines/CoroutineContext;)V", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: SN2 */
/* loaded from: classes2.dex */
public abstract class SN2<S> {

    /* renamed from: a */
    public final boolean f33560a;

    /* renamed from: b */
    public final EN2<S> f33561b;

    /* renamed from: c */
    public final ZC0 f33562c;

    /* renamed from: d */
    public final CoroutineContext f33563d;

    public SN2(boolean z, EN2<S> stateStore, ZC0 coroutineScope, CoroutineContext subscriptionCoroutineContextOverride) {
        Intrinsics.checkNotNullParameter(stateStore, "stateStore");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(subscriptionCoroutineContextOverride, "subscriptionCoroutineContextOverride");
        this.f33560a = z;
        this.f33561b = stateStore;
        this.f33562c = coroutineScope;
        this.f33563d = subscriptionCoroutineContextOverride;
    }

    /* renamed from: a */
    public final ZC0 m85607a() {
        return this.f33562c;
    }

    /* renamed from: b */
    public final boolean m85606b() {
        return this.f33560a;
    }

    /* renamed from: c */
    public final EN2<S> m85605c() {
        return this.f33561b;
    }

    /* renamed from: d */
    public final CoroutineContext m85604d() {
        return this.f33563d;
    }

    /* renamed from: e */
    public abstract <S extends AN2> EnumC48606sN2 mo83709e(RN2<S> rn2);
}
