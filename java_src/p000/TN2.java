package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J5\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R4\u0010 \u001a\"\u0012\u001e\u0012\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"LTN2;", "", "LZC0;", "b", "LAN2;", "S", "LRN2;", "viewModel", "initialState", "LSN2;", DateTokenConverter.CONVERTER_KEY, "(LRN2;LAN2;)LSN2;", C17296a.f69688o, "", "Z", "getDebugMode", "()Z", "debugMode", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getContextOverride", "()Lkotlin/coroutines/CoroutineContext;", "contextOverride", "c", "getStoreContextOverride", "storeContextOverride", "subscriptionCoroutineContextOverride", "", "Lkotlin/Function2;", "", "e", "Ljava/util/List;", "onConfigProvidedListener", "<init>", "(ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: TN2 */
/* loaded from: classes2.dex */
public class TN2 {

    /* renamed from: a */
    public final boolean f35387a;

    /* renamed from: b */
    public final CoroutineContext f35388b;

    /* renamed from: c */
    public final CoroutineContext f35389c;

    /* renamed from: d */
    public final CoroutineContext f35390d;

    /* renamed from: e */
    public final List<Function2<RN2<?>, SN2<?>, Unit>> f35391e;

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J \u0010\u0007\u001a\u00020\u0006\"\b\b\u0001\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¨\u0006\b"}, m28432d2 = {"TN2$a", "LSN2;", "LAN2;", "S", "LRN2;", "viewModel", "LsN2;", "e", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: TN2$a */
    /* loaded from: classes2.dex */
    public static final class C7820a extends SN2<S> {
        public C7820a(ZC0 zc0, boolean z, C40806fD0<S> c40806fD0, CoroutineContext coroutineContext) {
            super(z, c40806fD0, zc0, coroutineContext);
        }

        @Override // p000.SN2
        /* renamed from: e */
        public <S extends AN2> EnumC48606sN2 mo83709e(RN2<S> viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            return EnumC48606sN2.No;
        }
    }

    public TN2(boolean z, CoroutineContext contextOverride, CoroutineContext storeContextOverride, CoroutineContext subscriptionCoroutineContextOverride) {
        Intrinsics.checkNotNullParameter(contextOverride, "contextOverride");
        Intrinsics.checkNotNullParameter(storeContextOverride, "storeContextOverride");
        Intrinsics.checkNotNullParameter(subscriptionCoroutineContextOverride, "subscriptionCoroutineContextOverride");
        this.f35387a = z;
        this.f35388b = contextOverride;
        this.f35389c = storeContextOverride;
        this.f35390d = subscriptionCoroutineContextOverride;
        this.f35391e = new ArrayList();
    }

    /* renamed from: a */
    public <S extends AN2> SN2<S> m83713a(RN2<S> viewModel, S initialState) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        ZC0 m83712b = m83712b();
        return new C7820a(m83712b, this.f35387a, new C40806fD0(initialState, m83712b, this.f35389c), this.f35390d);
    }

    /* renamed from: b */
    public ZC0 m83712b() {
        return C37824aD0.m71790a(XU5.m76946b(null, 1, null).plus(T41.m84376c().mo14156G()).plus(this.f35388b));
    }

    /* renamed from: c */
    public final CoroutineContext m83711c() {
        return this.f35390d;
    }

    /* renamed from: d */
    public final <S extends AN2> SN2<S> m83710d(RN2<S> viewModel, S initialState) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        SN2<S> m83713a = m83713a(viewModel, initialState);
        Iterator<T> it = this.f35391e.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(viewModel, m83713a);
        }
        return m83713a;
    }

    public /* synthetic */ TN2(boolean z, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext2, (i & 8) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext3);
    }
}
