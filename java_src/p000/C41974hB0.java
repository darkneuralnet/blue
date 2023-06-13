package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC40818fE3;
import p000.AbstractC46542ot2;
import p000.C38429bE3;
import p000.C40572ep2;
import p000.ZD3;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 g*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u00052\b\u0012\u0004\u0012\u00028\u00010\u0006:\u0001$Bi\u0012\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101\u0012\u0006\u0010^\u001a\u00020]\u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010a\u001a\u00020_\u0012\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u000107\u0012\u0006\u0010c\u001a\u00020b\u0012\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\b\u0010?\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\be\u0010fJ\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00010\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J'\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0018\u001a\u00020\u000f2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f0\u0016H\u0016J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001cH\u0017J \u0010$\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0017J \u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0017J\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\u001e\u0010+\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010*H\u0002J\u0010\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000bH\u0002J\u0018\u00100\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000bH\u0002R#\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\"\u0010<\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u0001078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0016\u0010?\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010G\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0016\u0010K\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010AR\u0016\u0010M\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010AR\u0016\u0010O\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010FR\u0014\u0010Q\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010FR&\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010R8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0018\u0010S\u0012\u0004\bT\u0010UR\u001c\u0010Z\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\f\u0012\u0004\bY\u0010U\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010[¨\u0006h"}, m28432d2 = {"LhB0;", "", "K", "V", "LZD3;", "LbE3$a;", "Lep2$b;", "Lpt2;", "type", "LfE3$b$c;", "page", "", "c", "Lot2;", TransferTable.COLUMN_STATE, "", "j", "deferEmpty", "deferBegin", "deferEnd", "c0", "(ZZZ)V", "Lkotlin/Function2;", "callback", "w", "loadType", "loadState", "U", "", "index", "M", "count", "b", "leadingNulls", "changed", "added", C17296a.f69688o, "endPosition", "h", "startOfDrops", "f", "e", "", "f0", "post", "g0", "begin", "end", "d0", "LfE3;", "l", "LfE3;", "E", "()LfE3;", "pagingSource", "LZD3$a;", "m", "LZD3$a;", "e0", "()LZD3$a;", "boundaryCallback", "n", "Ljava/lang/Object;", "initialLastKey", "o", "I", "prependItemsRequested", "p", "appendItemsRequested", "q", "Z", "boundaryCallbackBeginDeferred", "r", "boundaryCallbackEndDeferred", "s", "lowestIndexAccessed", "t", "highestIndexAccessed", "u", "replacePagesWithNulls", "v", "shouldTrim", "Lep2;", "Lep2;", "getPager$annotations", "()V", "pager", "A", "()Ljava/lang/Object;", "getLastKey$annotations", "lastKey", "()Z", "isDetached", "LZC0;", "coroutineScope", "LSC0;", "notifyDispatcher", "backgroundDispatcher", "LZD3$d;", "config", "initialPage", "<init>", "(LfE3;LZC0;LSC0;LSC0;LZD3$a;LZD3$d;LfE3$b$c;Ljava/lang/Object;)V", "x", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: hB0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C41974hB0<K, V> extends ZD3<V> implements C38429bE3.InterfaceC12326a, C40572ep2.InterfaceC20112b<V> {

    /* renamed from: x */
    public static final C22586a f84814x = new C22586a(null);

    /* renamed from: l */
    public final AbstractC40818fE3<K, V> f84815l;

    /* renamed from: m */
    public final ZD3.AbstractC10141a<V> f84816m;

    /* renamed from: n */
    public final K f84817n;

    /* renamed from: o */
    public int f84818o;

    /* renamed from: p */
    public int f84819p;

    /* renamed from: q */
    public boolean f84820q;

    /* renamed from: r */
    public boolean f84821r;

    /* renamed from: s */
    public int f84822s;

    /* renamed from: t */
    public int f84823t;

    /* renamed from: u */
    public boolean f84824u;

    /* renamed from: v */
    public final boolean f84825v;

    /* renamed from: w */
    public final C40572ep2<K, V> f84826w;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\u0007¨\u0006\f"}, m28432d2 = {"LhB0$a;", "", "", "prefetchDistance", "index", "leadingNulls", "b", "(III)I", "itemsBeforeTrailingNulls", C17296a.f69688o, "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: hB0$a */
    /* loaded from: classes.dex */
    public static final class C22586a {
        public /* synthetic */ C22586a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m36663a(int i, int i2, int i3) {
            return ((i2 + i) + 1) - i3;
        }

        /* renamed from: b */
        public final int m36662b(int i, int i2, int i3) {
            return i - (i2 - i3);
        }

        private C22586a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@"}, m28432d2 = {"", "K", "V", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1", m28418f = "ContiguousPagedList.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: hB0$b */
    /* loaded from: classes.dex */
    public static final class C22587b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f84827h;

        /* renamed from: i */
        public final /* synthetic */ boolean f84828i;

        /* renamed from: j */
        public final /* synthetic */ C41974hB0<K, V> f84829j;

        /* renamed from: k */
        public final /* synthetic */ boolean f84830k;

        /* renamed from: l */
        public final /* synthetic */ boolean f84831l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22587b(boolean z, C41974hB0<K, V> c41974hB0, boolean z2, boolean z3, Continuation<? super C22587b> continuation) {
            super(2, continuation);
            this.f84828i = z;
            this.f84829j = c41974hB0;
            this.f84830k = z2;
            this.f84831l = z3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22587b(this.f84828i, this.f84829j, this.f84830k, this.f84831l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C22587b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f84827h == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f84828i) {
                    this.f84829j.m36670e0().m73544c();
                }
                if (this.f84830k) {
                    this.f84829j.f84820q = true;
                }
                if (this.f84831l) {
                    this.f84829j.f84821r = true;
                }
                this.f84829j.m36667g0(false);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@"}, m28432d2 = {"", "K", "V", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "androidx.paging.ContiguousPagedList$tryDispatchBoundaryCallbacks$1", m28418f = "ContiguousPagedList.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: hB0$c */
    /* loaded from: classes.dex */
    public static final class C22588c extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f84832h;

        /* renamed from: i */
        public final /* synthetic */ C41974hB0<K, V> f84833i;

        /* renamed from: j */
        public final /* synthetic */ boolean f84834j;

        /* renamed from: k */
        public final /* synthetic */ boolean f84835k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22588c(C41974hB0<K, V> c41974hB0, boolean z, boolean z2, Continuation<? super C22588c> continuation) {
            super(2, continuation);
            this.f84833i = c41974hB0;
            this.f84834j = z;
            this.f84835k = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22588c(this.f84833i, this.f84834j, this.f84835k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C22588c) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f84832h == 0) {
                ResultKt.throwOnFailure(obj);
                this.f84833i.m36672d0(this.f84834j, this.f84835k);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41974hB0(AbstractC40818fE3<K, V> pagingSource, ZC0 coroutineScope, SC0 notifyDispatcher, SC0 backgroundDispatcher, ZD3.AbstractC10141a<V> abstractC10141a, ZD3.C10145d config, AbstractC40818fE3.AbstractC20330b.C20333c<K, V> initialPage, K k) {
        super(pagingSource, coroutineScope, notifyDispatcher, new C38429bE3(), config);
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(initialPage, "initialPage");
        this.f84815l = pagingSource;
        this.f84816m = abstractC10141a;
        this.f84817n = k;
        this.f84822s = Integer.MAX_VALUE;
        this.f84823t = Integer.MIN_VALUE;
        if (config.f47979e != Integer.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        this.f84825v = z;
        C38429bE3<V> m73565H = m73565H();
        Intrinsics.checkNotNull(m73565H, "null cannot be cast to non-null type androidx.paging.LegacyPageFetcher.KeyProvider<K of androidx.paging.ContiguousPagedList>");
        this.f84826w = new C40572ep2<>(coroutineScope, config, pagingSource, notifyDispatcher, backgroundDispatcher, this, m73565H);
        if (config.f47977c) {
            C38429bE3<V> m73565H2 = m73565H();
            if (initialPage.m41664d() != Integer.MIN_VALUE) {
                i2 = initialPage.m41664d();
            } else {
                i2 = 0;
            }
            if (initialPage.m41665c() != Integer.MIN_VALUE) {
                i3 = initialPage.m41665c();
            } else {
                i3 = 0;
            }
            if (initialPage.m41664d() != Integer.MIN_VALUE && initialPage.m41665c() != Integer.MIN_VALUE) {
                z2 = true;
            } else {
                z2 = false;
            }
            m73565H2.m64787y(i2, initialPage, i3, 0, this, z2);
        } else {
            C38429bE3<V> m73565H3 = m73565H();
            if (initialPage.m41664d() != Integer.MIN_VALUE) {
                i = initialPage.m41664d();
            } else {
                i = 0;
            }
            m73565H3.m64787y(0, initialPage, 0, i, this, false);
        }
        m36668f0(EnumC47135pt2.REFRESH, initialPage.m41666b());
    }

    @Override // p000.ZD3
    /* renamed from: A */
    public K mo36685A() {
        K mo40794b;
        C42004hE3<?, V> m64788x = m73565H().m64788x(m73548y());
        if (m64788x == null || (mo40794b = this.f84815l.mo40794b(m64788x)) == null) {
            return this.f84817n;
        }
        return mo40794b;
    }

    @Override // p000.ZD3
    /* renamed from: E */
    public final AbstractC40818fE3<K, V> mo36684E() {
        return this.f84815l;
    }

    @Override // p000.ZD3
    /* renamed from: I */
    public boolean mo36683I() {
        return this.f84826w.m42521i();
    }

    @Override // p000.ZD3
    /* renamed from: M */
    public void mo36682M(int i) {
        C22586a c22586a = f84814x;
        int m36662b = c22586a.m36662b(m73548y().f47976b, i, m73565H().mo23406c());
        int m36663a = c22586a.m36663a(m73548y().f47976b, i, m73565H().mo23406c() + m73565H().mo23407b());
        int max = Math.max(m36662b, this.f84818o);
        this.f84818o = max;
        if (max > 0) {
            this.f84826w.m42513q();
        }
        int max2 = Math.max(m36663a, this.f84819p);
        this.f84819p = max2;
        if (max2 > 0) {
            this.f84826w.m42514p();
        }
        this.f84822s = Math.min(this.f84822s, i);
        this.f84823t = Math.max(this.f84823t, i);
        m36667g0(true);
    }

    @Override // p000.ZD3
    /* renamed from: U */
    public void mo36681U(EnumC47135pt2 loadType, AbstractC46542ot2 loadState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        this.f84826w.m42524f().m73535e(loadType, loadState);
    }

    @Override // p000.C38429bE3.InterfaceC12326a
    /* renamed from: a */
    public void mo36678a(int i, int i2, int i3) {
        m73561N(i, i2);
        m73560O(0, i3);
        this.f84822s += i3;
        this.f84823t += i3;
    }

    @Override // p000.C38429bE3.InterfaceC12326a
    /* renamed from: b */
    public void mo36676b(int i) {
        boolean z = false;
        m73560O(0, i);
        this.f84824u = (m73565H().mo23406c() > 0 || m73565H().mo23405e() > 0) ? true : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        if ((!r0.isEmpty()) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
        if ((!r0.isEmpty()) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    @Override // p000.C40572ep2.InterfaceC20112b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo36674c(EnumC47135pt2 type, AbstractC40818fE3.AbstractC20330b.C20333c<?, V> page) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(page, "page");
        List<? extends V> m41666b = page.m41666b();
        boolean z3 = true;
        if (m73563K() > m73565H().m64789w()) {
            z = true;
        } else {
            z = false;
        }
        if (this.f84825v && m73565H().m64797H(m73548y().f47979e, m73567F(), m41666b.size())) {
            z2 = true;
        } else {
            z2 = false;
        }
        EnumC47135pt2 enumC47135pt2 = EnumC47135pt2.APPEND;
        if (type == enumC47135pt2) {
            if (z2 && !z) {
                this.f84819p = 0;
            } else {
                m73565H().m64793o(page, this);
                int size = this.f84819p - m41666b.size();
                this.f84819p = size;
                if (size > 0) {
                }
            }
            z3 = false;
            if (this.f84825v) {
                if (z) {
                    if (!(this.f84826w.m42524f().m73536c() instanceof AbstractC46542ot2.C27093b) && m73565H().m64794K(this.f84824u, m73548y().f47979e, m73567F(), this)) {
                        this.f84826w.m42524f().m73535e(EnumC47135pt2.PREPEND, AbstractC46542ot2.C27094c.f102709b.m20363b());
                    }
                } else if (!(this.f84826w.m42524f().m73537b() instanceof AbstractC46542ot2.C27093b) && m73565H().m64795J(this.f84824u, m73548y().f47979e, m73567F(), this)) {
                    this.f84826w.m42524f().m73535e(enumC47135pt2, AbstractC46542ot2.C27094c.f102709b.m20363b());
                }
            }
            m36668f0(type, m41666b);
            return z3;
        } else if (type == EnumC47135pt2.PREPEND) {
            if (z2 && z) {
                this.f84818o = 0;
            } else {
                m73565H().m64800E(page, this);
                int size2 = this.f84818o - m41666b.size();
                this.f84818o = size2;
                if (size2 > 0) {
                }
            }
            z3 = false;
            if (this.f84825v) {
            }
            m36668f0(type, m41666b);
            return z3;
        } else {
            throw new IllegalArgumentException("unexpected result type " + type);
        }
    }

    /* renamed from: c0 */
    public final void m36673c0(boolean z, boolean z2, boolean z3) {
        if (this.f84816m != null) {
            if (this.f84822s == Integer.MAX_VALUE) {
                this.f84822s = m73565H().size();
            }
            if (this.f84823t == Integer.MIN_VALUE) {
                this.f84823t = 0;
            }
            if (z || z2 || z3) {
                Z30.m73800d(m73547z(), m73569C(), null, new C22587b(z, this, z2, z3, null), 2, null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
    }

    /* renamed from: d0 */
    public final void m36672d0(boolean z, boolean z2) {
        if (z) {
            ZD3.AbstractC10141a<V> abstractC10141a = this.f84816m;
            Intrinsics.checkNotNull(abstractC10141a);
            abstractC10141a.m73545b(m73565H().m64792s());
        }
        if (z2) {
            ZD3.AbstractC10141a<V> abstractC10141a2 = this.f84816m;
            Intrinsics.checkNotNull(abstractC10141a2);
            abstractC10141a2.m73546a(m73565H().m64790v());
        }
    }

    @Override // p000.C38429bE3.InterfaceC12326a
    /* renamed from: e */
    public void mo36671e(int i, int i2) {
        m73561N(i, i2);
    }

    /* renamed from: e0 */
    public final ZD3.AbstractC10141a<V> m36670e0() {
        return this.f84816m;
    }

    @Override // p000.C38429bE3.InterfaceC12326a
    /* renamed from: f */
    public void mo36669f(int i, int i2) {
        m73559Q(i, i2);
    }

    /* renamed from: f0 */
    public final void m36668f0(EnumC47135pt2 enumC47135pt2, List<? extends V> list) {
        boolean z;
        boolean z2;
        if (this.f84816m != null) {
            boolean z3 = true;
            if (m73565H().size() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && enumC47135pt2 == EnumC47135pt2.PREPEND && list.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || enumC47135pt2 != EnumC47135pt2.APPEND || !list.isEmpty()) {
                z3 = false;
            }
            m36673c0(z, z2, z3);
        }
    }

    /* renamed from: g0 */
    public final void m36667g0(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (this.f84820q && this.f84822s <= m73548y().f47976b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.f84821r || this.f84823t < (size() - 1) - m73548y().f47976b) {
            z3 = false;
        }
        if (!z2 && !z3) {
            return;
        }
        if (z2) {
            this.f84820q = false;
        }
        if (z3) {
            this.f84821r = false;
        }
        if (z) {
            Z30.m73800d(m73547z(), m73569C(), null, new C22588c(this, z2, z3, null), 2, null);
        } else {
            m36672d0(z2, z3);
        }
    }

    @Override // p000.C38429bE3.InterfaceC12326a
    /* renamed from: h */
    public void mo36666h(int i, int i2, int i3) {
        m73561N(i, i2);
        m73560O(i + i2, i3);
    }

    @Override // p000.C40572ep2.InterfaceC20112b
    /* renamed from: j */
    public void mo36665j(EnumC47135pt2 type, AbstractC46542ot2 state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        m73549x(type, state);
    }

    @Override // p000.ZD3
    /* renamed from: w */
    public void mo36664w(Function2<? super EnumC47135pt2, ? super AbstractC46542ot2, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f84826w.m42524f().m73538a(callback);
    }
}
