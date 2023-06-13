package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC40818fE3;
import p000.WS0;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001f*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0017B#\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J-\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m28432d2 = {"Lfp2;", "", "Key", "Value", "LfE3;", "", "pageSize", "", "i", "LfE3$a;", "params", "LfE3$b;", DateTokenConverter.CONVERTER_KEY, "(LfE3$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LhE3;", TransferTable.COLUMN_STATE, "b", "(LhE3;)Ljava/lang/Object;", "h", "LSC0;", "LSC0;", "fetchDispatcher", "LWS0;", "c", "LWS0;", "g", "()LWS0;", "dataSource", "I", "<init>", "(LSC0;LWS0;)V", "e", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: fp2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41165fp2<Key, Value> extends AbstractC40818fE3<Key, Value> {

    /* renamed from: e */
    public static final C20541c f80750e = new C20541c(null);

    /* renamed from: b */
    public final SC0 f80751b;

    /* renamed from: c */
    public final WS0<Key, Value> f80752c;

    /* renamed from: d */
    public int f80753d;

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: fp2$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C20538a implements WS0.InterfaceC9028d, FunctionAdapter {

        /* renamed from: b */
        public final /* synthetic */ C41165fp2<Key, Value> f80754b;

        public C20538a(C41165fp2<Key, Value> c41165fp2) {
            this.f80754b = c41165fp2;
        }

        @Override // p000.WS0.InterfaceC9028d
        /* renamed from: a */
        public final void mo40789a() {
            this.f80754b.m41674c();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof WS0.InterfaceC9028d) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, this.f80754b, C41165fp2.class, "invalidate", "invalidate()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: fp2$b */
    /* loaded from: classes.dex */
    public static final class C20539b extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ C41165fp2<Key, Value> f80755g;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* renamed from: fp2$b$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C20540a implements WS0.InterfaceC9028d, FunctionAdapter {

            /* renamed from: b */
            public final /* synthetic */ C41165fp2<Key, Value> f80756b;

            public C20540a(C41165fp2<Key, Value> c41165fp2) {
                this.f80756b = c41165fp2;
            }

            @Override // p000.WS0.InterfaceC9028d
            /* renamed from: a */
            public final void mo40789a() {
                this.f80756b.m41674c();
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof WS0.InterfaceC9028d) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(0, this.f80756b, C41165fp2.class, "invalidate", "invalidate()V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20539b(C41165fp2<Key, Value> c41165fp2) {
            super(0);
            this.f80755g = c41165fp2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f80755g.m40792g().mo64718k(new C20540a(this.f80755g));
            this.f80755g.m40792g().mo64720f();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lfp2$c;", "", "", "PAGE_SIZE_NOT_SET", "I", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: fp2$c */
    /* loaded from: classes.dex */
    public static final class C20541c {
        public /* synthetic */ C20541c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20541c() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: fp2$d */
    /* loaded from: classes.dex */
    public /* synthetic */ class C20542d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WS0.EnumC9029e.values().length];
            iArr[WS0.EnumC9029e.POSITIONAL.ordinal()] = 1;
            iArr[WS0.EnumC9029e.PAGE_KEYED.ordinal()] = 2;
            iArr[WS0.EnumC9029e.ITEM_KEYED.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@"}, m28432d2 = {"", "Key", "Value", "LZC0;", "LfE3$b$c;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "androidx.paging.LegacyPagingSource$load$2", m28418f = "LegacyPagingSource.kt", m28417i = {}, m28416l = {112}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: fp2$e */
    /* loaded from: classes.dex */
    public static final class C20543e extends SuspendLambda implements Function2<ZC0, Continuation<? super AbstractC40818fE3.AbstractC20330b.C20333c<Key, Value>>, Object> {

        /* renamed from: h */
        public int f80757h;

        /* renamed from: i */
        public final /* synthetic */ C41165fp2<Key, Value> f80758i;

        /* renamed from: j */
        public final /* synthetic */ WS0.C9030f<Key> f80759j;

        /* renamed from: k */
        public final /* synthetic */ AbstractC40818fE3.AbstractC20325a<Key> f80760k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20543e(C41165fp2<Key, Value> c41165fp2, WS0.C9030f<Key> c9030f, AbstractC40818fE3.AbstractC20325a<Key> abstractC20325a, Continuation<? super C20543e> continuation) {
            super(2, continuation);
            this.f80758i = c41165fp2;
            this.f80759j = c9030f;
            this.f80760k = abstractC20325a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20543e(this.f80758i, this.f80759j, this.f80760k, continuation);
        }

        public final Object invoke(ZC0 zc0, Continuation<? super AbstractC40818fE3.AbstractC20330b.C20333c<Key, Value>> continuation) {
            return ((C20543e) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Object m78423d;
            Object m78424c;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f80757h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                WS0<Key, Value> m40792g = this.f80758i.m40792g();
                WS0.C9030f<Key> c9030f = this.f80759j;
                this.f80757h = 1;
                obj = m40792g.mo75407h(c9030f, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            AbstractC40818fE3.AbstractC20325a<Key> abstractC20325a = this.f80760k;
            WS0.C9022a c9022a = (WS0.C9022a) obj;
            List<Value> list = c9022a.f41033a;
            if (list.isEmpty() && (abstractC20325a instanceof AbstractC40818fE3.AbstractC20325a.C20328c)) {
                m78423d = null;
            } else {
                m78423d = c9022a.m78423d();
            }
            if (c9022a.f41033a.isEmpty() && (abstractC20325a instanceof AbstractC40818fE3.AbstractC20325a.C20326a)) {
                m78424c = null;
            } else {
                m78424c = c9022a.m78424c();
            }
            return new AbstractC40818fE3.AbstractC20330b.C20333c(list, m78423d, m78424c, c9022a.m78425b(), c9022a.m78426a());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Object obj) {
            return invoke(zc0, (Continuation) ((Continuation) obj));
        }
    }

    public C41165fp2(SC0 fetchDispatcher, WS0<Key, Value> dataSource) {
        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f80751b = fetchDispatcher;
        this.f80752c = dataSource;
        this.f80753d = Integer.MIN_VALUE;
        dataSource.mo64721c(new C20538a(this));
        m41673e(new C20539b(this));
    }

    /* JADX WARN: Incorrect condition in loop: B:19:0x0054 */
    @Override // p000.AbstractC40818fE3
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Key mo40794b(C42004hE3<Key, Value> state) {
        int lastIndex;
        int lastIndex2;
        Value m36584b;
        Intrinsics.checkNotNullParameter(state, "state");
        int i = C20542d.$EnumSwitchMapping$0[this.f80752c.m78429e().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return null;
            }
            if (i == 3) {
                Integer m36582d = state.m36582d();
                if (m36582d == null || (m36584b = state.m36584b(m36582d.intValue())) == null) {
                    return null;
                }
                return this.f80752c.mo75408d(m36584b);
            }
            throw new NoWhenBranchMatchedException();
        }
        Integer m36582d2 = state.m36582d();
        if (m36582d2 == null) {
            return null;
        }
        int intValue = m36582d2.intValue();
        int i2 = intValue - state.f84901d;
        for (int i3 = 0; i3 < lastIndex; i3++) {
            lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(state.m36581e().get(i3).m41666b());
            if (i2 <= lastIndex2) {
                break;
            }
            i2 -= state.m36581e().get(i3).m41666b().size();
        }
        AbstractC40818fE3.AbstractC20330b.C20333c<Key, Value> m36583c = state.m36583c(intValue);
        int i4 = (m36583c == null || (i4 = m36583c.m41662f()) == null) ? 0 : 0;
        Intrinsics.checkNotNull(i4, "null cannot be cast to non-null type kotlin.Int");
        return (Key) Integer.valueOf(((Integer) i4).intValue() + i2);
    }

    @Override // p000.AbstractC40818fE3
    /* renamed from: d */
    public Object mo40793d(AbstractC40818fE3.AbstractC20325a<Key> abstractC20325a, Continuation<? super AbstractC40818fE3.AbstractC20330b<Key, Value>> continuation) {
        EnumC47135pt2 enumC47135pt2;
        if (abstractC20325a instanceof AbstractC40818fE3.AbstractC20325a.C20329d) {
            enumC47135pt2 = EnumC47135pt2.REFRESH;
        } else if (abstractC20325a instanceof AbstractC40818fE3.AbstractC20325a.C20326a) {
            enumC47135pt2 = EnumC47135pt2.APPEND;
        } else if (abstractC20325a instanceof AbstractC40818fE3.AbstractC20325a.C20328c) {
            enumC47135pt2 = EnumC47135pt2.PREPEND;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        EnumC47135pt2 enumC47135pt22 = enumC47135pt2;
        if (this.f80753d == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            this.f80753d = m40791h(abstractC20325a);
        }
        return X30.m77504g(this.f80751b, new C20543e(this, new WS0.C9030f(enumC47135pt22, abstractC20325a.mo41669a(), abstractC20325a.m41671b(), abstractC20325a.m41670c(), this.f80753d), abstractC20325a, null), continuation);
    }

    /* renamed from: g */
    public final WS0<Key, Value> m40792g() {
        return this.f80752c;
    }

    /* renamed from: h */
    public final int m40791h(AbstractC40818fE3.AbstractC20325a<Key> abstractC20325a) {
        if ((abstractC20325a instanceof AbstractC40818fE3.AbstractC20325a.C20329d) && abstractC20325a.m41671b() % 3 == 0) {
            return abstractC20325a.m41671b() / 3;
        }
        return abstractC20325a.m41671b();
    }

    /* renamed from: i */
    public final void m40790i(int i) {
        boolean z;
        int i2 = this.f80753d;
        if (i2 != Integer.MIN_VALUE && i != i2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f80753d = i;
            return;
        }
        throw new IllegalStateException(("Page size is already set to " + this.f80753d + CoreConstants.DOT).toString());
    }
}
