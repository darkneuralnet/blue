package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC40818fE3;
import p000.AbstractC46542ot2;
import p000.ZD3;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0017\u001bBW\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 \u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010*\u001a\u00020&\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010+\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000001¢\u0006\u0004\bC\u0010DJ\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002J$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u0000018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00105R(\u0010?\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b8\u00109\u0012\u0004\b=\u0010>\u001a\u0004\b,\u0010:\"\u0004\b;\u0010<R\u0011\u0010B\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\b8\u0010A¨\u0006E"}, m28432d2 = {"Lep2;", "", "K", "V", "", "q", "p", "e", "Lpt2;", "type", "LfE3$a;", "params", "n", "LfE3$b$c;", "value", "l", "", "throwable", "j", "k", "o", "m", "LZC0;", C17296a.f69688o, "LZC0;", "pagedListScope", "LZD3$d;", "b", "LZD3$d;", "getConfig", "()LZD3$d;", "config", "LfE3;", "c", "LfE3;", "h", "()LfE3;", Stripe3ds2AuthParams.FIELD_SOURCE, "LSC0;", DateTokenConverter.CONVERTER_KEY, "LSC0;", "notifyDispatcher", "fetchDispatcher", "Lep2$b;", "f", "Lep2$b;", "g", "()Lep2$b;", "pageConsumer", "Lep2$a;", "Lep2$a;", "keyProvider", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "detached", "LZD3$e;", "i", "LZD3$e;", "()LZD3$e;", "setLoadStateManager", "(LZD3$e;)V", "getLoadStateManager$annotations", "()V", "loadStateManager", "", "()Z", "isDetached", "<init>", "(LZC0;LZD3$d;LfE3;LSC0;LSC0;Lep2$b;Lep2$a;)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: ep2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40572ep2<K, V> {

    /* renamed from: a */
    public final ZC0 f78933a;

    /* renamed from: b */
    public final ZD3.C10145d f78934b;

    /* renamed from: c */
    public final AbstractC40818fE3<K, V> f78935c;

    /* renamed from: d */
    public final SC0 f78936d;

    /* renamed from: e */
    public final SC0 f78937e;

    /* renamed from: f */
    public final InterfaceC20112b<V> f78938f;

    /* renamed from: g */
    public final InterfaceC20111a<K> f78939g;

    /* renamed from: h */
    public final AtomicBoolean f78940h;

    /* renamed from: i */
    public ZD3.AbstractC10149e f78941i;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b`\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00018\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00018\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lep2$a;", "", "K", "j", "()Ljava/lang/Object;", "prevKey", "h", "nextKey", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ep2$a */
    /* loaded from: classes.dex */
    public interface InterfaceC20111a<K> {
        /* renamed from: h */
        K mo42512h();

        /* renamed from: j */
        K mo42511j();
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&¨\u0006\r"}, m28432d2 = {"Lep2$b;", "", "V", "Lpt2;", "type", "LfE3$b$c;", "page", "", "c", "Lot2;", TransferTable.COLUMN_STATE, "", "j", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ep2$b */
    /* loaded from: classes.dex */
    public interface InterfaceC20112b<V> {
        /* renamed from: c */
        boolean mo36674c(EnumC47135pt2 enumC47135pt2, AbstractC40818fE3.AbstractC20330b.C20333c<?, V> c20333c);

        /* renamed from: j */
        void mo36665j(EnumC47135pt2 enumC47135pt2, AbstractC46542ot2 abstractC46542ot2);
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: ep2$c */
    /* loaded from: classes.dex */
    public /* synthetic */ class C20113c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC47135pt2.values().length];
            iArr[EnumC47135pt2.PREPEND.ordinal()] = 1;
            iArr[EnumC47135pt2.APPEND.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"ep2$d", "LZD3$e;", "Lpt2;", "type", "Lot2;", TransferTable.COLUMN_STATE, "", DateTokenConverter.CONVERTER_KEY, "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ep2$d */
    /* loaded from: classes.dex */
    public static final class C20114d extends ZD3.AbstractC10149e {

        /* renamed from: d */
        public final /* synthetic */ C40572ep2<K, V> f78942d;

        public C20114d(C40572ep2<K, V> c40572ep2) {
            this.f78942d = c40572ep2;
        }

        @Override // p000.ZD3.AbstractC10149e
        /* renamed from: d */
        public void mo31833d(EnumC47135pt2 type, AbstractC46542ot2 state) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f78942d.m42523g().mo36665j(type, state);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@"}, m28432d2 = {"", "K", "V", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", m28418f = "LegacyPageFetcher.kt", m28417i = {0}, m28416l = {53}, m28415m = "invokeSuspend", m28414n = {"$this$launch"}, m28413s = {"L$0"})
    /* renamed from: ep2$e */
    /* loaded from: classes.dex */
    public static final class C20115e extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f78943h;

        /* renamed from: i */
        public /* synthetic */ Object f78944i;

        /* renamed from: j */
        public final /* synthetic */ C40572ep2<K, V> f78945j;

        /* renamed from: k */
        public final /* synthetic */ AbstractC40818fE3.AbstractC20325a<K> f78946k;

        /* renamed from: l */
        public final /* synthetic */ EnumC47135pt2 f78947l;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@"}, m28432d2 = {"", "K", "V", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        @DebugMetadata(m28419c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", m28418f = "LegacyPageFetcher.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: ep2$e$a */
        /* loaded from: classes.dex */
        public static final class C20116a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f78948h;

            /* renamed from: i */
            public final /* synthetic */ AbstractC40818fE3.AbstractC20330b<K, V> f78949i;

            /* renamed from: j */
            public final /* synthetic */ C40572ep2<K, V> f78950j;

            /* renamed from: k */
            public final /* synthetic */ EnumC47135pt2 f78951k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20116a(AbstractC40818fE3.AbstractC20330b<K, V> abstractC20330b, C40572ep2<K, V> c40572ep2, EnumC47135pt2 enumC47135pt2, Continuation<? super C20116a> continuation) {
                super(2, continuation);
                this.f78949i = abstractC20330b;
                this.f78950j = c40572ep2;
                this.f78951k = enumC47135pt2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C20116a(this.f78949i, this.f78950j, this.f78951k, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C20116a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f78948h == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC40818fE3.AbstractC20330b<K, V> abstractC20330b = this.f78949i;
                    if (abstractC20330b instanceof AbstractC40818fE3.AbstractC20330b.C20333c) {
                        this.f78950j.m42518l(this.f78951k, (AbstractC40818fE3.AbstractC20330b.C20333c) abstractC20330b);
                    } else if (abstractC20330b instanceof AbstractC40818fE3.AbstractC20330b.C20331a) {
                        this.f78950j.m42520j(this.f78951k, ((AbstractC40818fE3.AbstractC20330b.C20331a) abstractC20330b).m41668a());
                    } else if (abstractC20330b instanceof AbstractC40818fE3.AbstractC20330b.C20332b) {
                        this.f78950j.m42519k();
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20115e(C40572ep2<K, V> c40572ep2, AbstractC40818fE3.AbstractC20325a<K> abstractC20325a, EnumC47135pt2 enumC47135pt2, Continuation<? super C20115e> continuation) {
            super(2, continuation);
            this.f78945j = c40572ep2;
            this.f78946k = abstractC20325a;
            this.f78947l = enumC47135pt2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C20115e c20115e = new C20115e(this.f78945j, this.f78946k, this.f78947l, continuation);
            c20115e.f78944i = obj;
            return c20115e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C20115e) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            ZC0 zc0;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f78943h;
            if (i != 0) {
                if (i == 1) {
                    zc0 = (ZC0) this.f78944i;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ZC0 zc02 = (ZC0) this.f78944i;
                AbstractC40818fE3<K, V> m42522h = this.f78945j.m42522h();
                AbstractC40818fE3.AbstractC20325a<K> abstractC20325a = this.f78946k;
                this.f78944i = zc02;
                this.f78943h = 1;
                Object mo40793d = m42522h.mo40793d(abstractC20325a, this);
                if (mo40793d == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zc0 = zc02;
                obj = mo40793d;
            }
            AbstractC40818fE3.AbstractC20330b abstractC20330b = (AbstractC40818fE3.AbstractC20330b) obj;
            if (this.f78945j.m42522h().m41675a()) {
                this.f78945j.m42525e();
                return Unit.INSTANCE;
            }
            Z30.m73800d(zc0, this.f78945j.f78936d, null, new C20116a(abstractC20330b, this.f78945j, this.f78947l, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    public C40572ep2(ZC0 pagedListScope, ZD3.C10145d config, AbstractC40818fE3<K, V> source, SC0 notifyDispatcher, SC0 fetchDispatcher, InterfaceC20112b<V> pageConsumer, InterfaceC20111a<K> keyProvider) {
        Intrinsics.checkNotNullParameter(pagedListScope, "pagedListScope");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
        Intrinsics.checkNotNullParameter(pageConsumer, "pageConsumer");
        Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
        this.f78933a = pagedListScope;
        this.f78934b = config;
        this.f78935c = source;
        this.f78936d = notifyDispatcher;
        this.f78937e = fetchDispatcher;
        this.f78938f = pageConsumer;
        this.f78939g = keyProvider;
        this.f78940h = new AtomicBoolean(false);
        this.f78941i = new C20114d(this);
    }

    /* renamed from: e */
    public final void m42525e() {
        this.f78940h.set(true);
    }

    /* renamed from: f */
    public final ZD3.AbstractC10149e m42524f() {
        return this.f78941i;
    }

    /* renamed from: g */
    public final InterfaceC20112b<V> m42523g() {
        return this.f78938f;
    }

    /* renamed from: h */
    public final AbstractC40818fE3<K, V> m42522h() {
        return this.f78935c;
    }

    /* renamed from: i */
    public final boolean m42521i() {
        return this.f78940h.get();
    }

    /* renamed from: j */
    public final void m42520j(EnumC47135pt2 enumC47135pt2, Throwable th) {
        if (m42521i()) {
            return;
        }
        this.f78941i.m73535e(enumC47135pt2, new AbstractC46542ot2.C27092a(th));
    }

    /* renamed from: k */
    public final void m42519k() {
        this.f78935c.m41674c();
        m42525e();
    }

    /* renamed from: l */
    public final void m42518l(EnumC47135pt2 enumC47135pt2, AbstractC40818fE3.AbstractC20330b.C20333c<K, V> c20333c) {
        AbstractC46542ot2.C27094c m20363b;
        if (m42521i()) {
            return;
        }
        if (this.f78938f.mo36674c(enumC47135pt2, c20333c)) {
            int i = C20113c.$EnumSwitchMapping$0[enumC47135pt2.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    m42517m();
                    return;
                }
                throw new IllegalStateException("Can only fetch more during append/prepend");
            }
            m42515o();
            return;
        }
        ZD3.AbstractC10149e abstractC10149e = this.f78941i;
        if (c20333c.m41666b().isEmpty()) {
            m20363b = AbstractC46542ot2.C27094c.f102709b.m20364a();
        } else {
            m20363b = AbstractC46542ot2.C27094c.f102709b.m20363b();
        }
        abstractC10149e.m73535e(enumC47135pt2, m20363b);
    }

    /* renamed from: m */
    public final void m42517m() {
        K mo42512h = this.f78939g.mo42512h();
        if (mo42512h == null) {
            m42518l(EnumC47135pt2.APPEND, AbstractC40818fE3.AbstractC20330b.C20333c.f79725f.m41661a());
            return;
        }
        ZD3.AbstractC10149e abstractC10149e = this.f78941i;
        EnumC47135pt2 enumC47135pt2 = EnumC47135pt2.APPEND;
        abstractC10149e.m73535e(enumC47135pt2, AbstractC46542ot2.C27093b.f102708b);
        ZD3.C10145d c10145d = this.f78934b;
        m42516n(enumC47135pt2, new AbstractC40818fE3.AbstractC20325a.C20326a(mo42512h, c10145d.f47975a, c10145d.f47977c));
    }

    /* renamed from: n */
    public final void m42516n(EnumC47135pt2 enumC47135pt2, AbstractC40818fE3.AbstractC20325a<K> abstractC20325a) {
        Z30.m73800d(this.f78933a, this.f78937e, null, new C20115e(this, abstractC20325a, enumC47135pt2, null), 2, null);
    }

    /* renamed from: o */
    public final void m42515o() {
        K mo42511j = this.f78939g.mo42511j();
        if (mo42511j == null) {
            m42518l(EnumC47135pt2.PREPEND, AbstractC40818fE3.AbstractC20330b.C20333c.f79725f.m41661a());
            return;
        }
        ZD3.AbstractC10149e abstractC10149e = this.f78941i;
        EnumC47135pt2 enumC47135pt2 = EnumC47135pt2.PREPEND;
        abstractC10149e.m73535e(enumC47135pt2, AbstractC46542ot2.C27093b.f102708b);
        ZD3.C10145d c10145d = this.f78934b;
        m42516n(enumC47135pt2, new AbstractC40818fE3.AbstractC20325a.C20328c(mo42511j, c10145d.f47975a, c10145d.f47977c));
    }

    /* renamed from: p */
    public final void m42514p() {
        AbstractC46542ot2 m73537b = this.f78941i.m73537b();
        if ((m73537b instanceof AbstractC46542ot2.C27094c) && !m73537b.m20367a()) {
            m42517m();
        }
    }

    /* renamed from: q */
    public final void m42513q() {
        AbstractC46542ot2 m73536c = this.f78941i.m73536c();
        if ((m73536c instanceof AbstractC46542ot2.C27094c) && !m73536c.m20367a()) {
            m42515o();
        }
    }
}
