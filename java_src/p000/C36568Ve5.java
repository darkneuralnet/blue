package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23483f;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC40818fE3;
import p000.AbstractC46542ot2;
import p000.C36568Ve5;
import p000.InterfaceC52943zh2;
import p000.WS0;
import p000.ZD3;
@Deprecated(message = "PagedList is deprecated and has been replaced by PagingData")
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001\u0010B%\b\u0017\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b,\u0010-J#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007J\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u000eR(\u0010\u0014\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u0012\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR$\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\f\u0010\u001f\u0012\u0004\b \u0010\u001bR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010#R\u0018\u0010+\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010&¨\u0006."}, m28432d2 = {"LVe5;", "", "Key", "Value", "key", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)LVe5;", "LZD3$a;", "boundaryCallback", "b", "Lio/reactivex/E;", "scheduler", "e", "c", "Lio/reactivex/Observable;", "LZD3;", C17296a.f69688o, "Lkotlin/Function0;", "LfE3;", "Lkotlin/jvm/functions/Function0;", "pagingSourceFactory", "LWS0$c;", "LWS0$c;", "dataSourceFactory", "LZD3$d;", "LZD3$d;", "getConfig$annotations", "()V", "config", "Ljava/lang/Object;", "initialLoadKey", "LZD3$a;", "getBoundaryCallback$annotations", "LSC0;", "f", "LSC0;", "notifyDispatcher", "g", "Lio/reactivex/E;", "notifyScheduler", "h", "fetchDispatcher", "i", "fetchScheduler", "<init>", "(LWS0$c;LZD3$d;)V", "paging-rxjava2_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Ve5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36568Ve5<Key, Value> {

    /* renamed from: a */
    public final Function0<AbstractC40818fE3<Key, Value>> f39383a;

    /* renamed from: b */
    public final WS0.AbstractC9025c<Key, Value> f39384b;

    /* renamed from: c */
    public final ZD3.C10145d f39385c;

    /* renamed from: d */
    public Key f39386d;

    /* renamed from: e */
    public ZD3.AbstractC10141a<Value> f39387e;

    /* renamed from: f */
    public SC0 f39388f;

    /* renamed from: g */
    public AbstractC23437E f39389g;

    /* renamed from: h */
    public SC0 f39390h;

    /* renamed from: i */
    public AbstractC23437E f39391i;

    @Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00050\u00042\u00020\u0006BS\u0012\b\u00107\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0016\u0012\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u001b0\u001a\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\u001f¢\u0006\u0004\b8\u00109J\u001c\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00050\u0007H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002J$\u0010\u0011\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00030\u0005H\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00030\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00050\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001dR\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u0006:"}, m28432d2 = {"LVe5$a;", "", "Key", "Value", "Lio/reactivex/z;", "LZD3;", "Lio/reactivex/functions/f;", "Lio/reactivex/y;", "emitter", "", "subscribe", "cancel", "", "force", "m", "previous", "next", "n", "LZD3$d;", "b", "LZD3$d;", "config", "LZD3$a;", "c", "LZD3$a;", "boundaryCallback", "Lkotlin/Function0;", "LfE3;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function0;", "pagingSourceFactory", "LSC0;", "e", "LSC0;", "notifyDispatcher", "f", "fetchDispatcher", "g", "Z", "firstSubscribe", "h", "LZD3;", "currentData", "Lzh2;", "i", "Lzh2;", "currentJob", "j", "Lio/reactivex/y;", "k", "callback", "Ljava/lang/Runnable;", "l", "Ljava/lang/Runnable;", "refreshRetryCallback", "initialLoadKey", "<init>", "(Ljava/lang/Object;LZD3$d;LZD3$a;Lkotlin/jvm/functions/Function0;LSC0;LSC0;)V", "paging-rxjava2_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Ve5$a */
    /* loaded from: classes.dex */
    public static final class C8712a<Key, Value> implements InterfaceC24579z<ZD3<Value>>, InterfaceC23483f {

        /* renamed from: b */
        public final ZD3.C10145d f39392b;

        /* renamed from: c */
        public final ZD3.AbstractC10141a<Value> f39393c;

        /* renamed from: d */
        public final Function0<AbstractC40818fE3<Key, Value>> f39394d;

        /* renamed from: e */
        public final SC0 f39395e;

        /* renamed from: f */
        public final SC0 f39396f;

        /* renamed from: g */
        public boolean f39397g;

        /* renamed from: h */
        public ZD3<Value> f39398h;

        /* renamed from: i */
        public InterfaceC52943zh2 f39399i;

        /* renamed from: j */
        public InterfaceC24578y<ZD3<Value>> f39400j;

        /* renamed from: k */
        public final Function0<Unit> f39401k;

        /* renamed from: l */
        public final Runnable f39402l;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0002*\u00020\u0003\"\b\b\u0003\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* renamed from: Ve5$a$a */
        /* loaded from: classes.dex */
        public static final class C8713a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C8712a<Key, Value> f39403g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8713a(C8712a<Key, Value> c8712a) {
                super(0);
                this.f39403g = c8712a;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f39403g.m79600m(true);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0001*\u00020\u0000\"\b\b\u0003\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@"}, m28432d2 = {"", "Key", "Value", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        @DebugMetadata(m28419c = "androidx.paging.RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1", m28418f = "RxPagedListBuilder.kt", m28417i = {0, 1, 1}, m28416l = {398, 405}, m28415m = "invokeSuspend", m28414n = {"pagingSource", "pagingSource", "lastKey"}, m28413s = {"L$0", "L$0", "L$1"})
        /* renamed from: Ve5$a$b */
        /* loaded from: classes.dex */
        public static final class C8714b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public Object f39404h;

            /* renamed from: i */
            public Object f39405i;

            /* renamed from: j */
            public int f39406j;

            /* renamed from: k */
            public final /* synthetic */ C8712a<Key, Value> f39407k;

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0001*\u00020\u0000\"\b\b\u0003\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@"}, m28432d2 = {"", "Key", "Value", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
            @DebugMetadata(m28419c = "androidx.paging.RxPagedListBuilder$PagingObservableOnSubscribe$invalidate$1$1", m28418f = "RxPagedListBuilder.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: Ve5$a$b$a */
            /* loaded from: classes.dex */
            public static final class C8715a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f39408h;

                /* renamed from: i */
                public final /* synthetic */ C8712a<Key, Value> f39409i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8715a(C8712a<Key, Value> c8712a, Continuation<? super C8715a> continuation) {
                    super(2, continuation);
                    this.f39409i = c8712a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C8715a(this.f39409i, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C8715a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f39408h == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f39409i.f39398h.mo36681U(EnumC47135pt2.REFRESH, AbstractC46542ot2.C27093b.f102708b);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8714b(C8712a<Key, Value> c8712a, Continuation<? super C8714b> continuation) {
                super(2, continuation);
                this.f39407k = c8712a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C8714b(this.f39407k, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C8714b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                AbstractC40818fE3 abstractC40818fE3;
                Object obj2;
                AbstractC40818fE3 abstractC40818fE32;
                AbstractC40818fE3.AbstractC20330b abstractC20330b;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f39406j;
                InterfaceC24578y interfaceC24578y = null;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            Object obj3 = this.f39405i;
                            ResultKt.throwOnFailure(obj);
                            obj2 = obj3;
                            abstractC40818fE32 = (AbstractC40818fE3) this.f39404h;
                            abstractC20330b = (AbstractC40818fE3.AbstractC20330b) obj;
                            if (!(abstractC20330b instanceof AbstractC40818fE3.AbstractC20330b.C20332b)) {
                                this.f39407k.f39398h.mo36681U(EnumC47135pt2.REFRESH, new AbstractC46542ot2.C27094c(false));
                                abstractC40818fE32.m41674c();
                            } else if (abstractC20330b instanceof AbstractC40818fE3.AbstractC20330b.C20331a) {
                                this.f39407k.f39398h.mo36681U(EnumC47135pt2.REFRESH, new AbstractC46542ot2.C27092a(((AbstractC40818fE3.AbstractC20330b.C20331a) abstractC20330b).m41668a()));
                            } else if (abstractC20330b instanceof AbstractC40818fE3.AbstractC20330b.C20333c) {
                                ZD3 m73543a = ZD3.f47961k.m73543a(abstractC40818fE32, (AbstractC40818fE3.AbstractC20330b.C20333c) abstractC20330b, VC1.f38731b, this.f39407k.f39395e, this.f39407k.f39396f, this.f39407k.f39393c, this.f39407k.f39392b, obj2);
                                C8712a<Key, Value> c8712a = this.f39407k;
                                c8712a.m79599n(c8712a.f39398h, m73543a);
                                this.f39407k.f39398h = m73543a;
                                InterfaceC24578y interfaceC24578y2 = this.f39407k.f39400j;
                                if (interfaceC24578y2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("emitter");
                                } else {
                                    interfaceC24578y = interfaceC24578y2;
                                }
                                interfaceC24578y.onNext(m73543a);
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC40818fE3 = (AbstractC40818fE3) this.f39404h;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.f39407k.f39398h.mo36684E().m41672f(this.f39407k.f39401k);
                    AbstractC40818fE3 abstractC40818fE33 = (AbstractC40818fE3) this.f39407k.f39394d.invoke();
                    abstractC40818fE33.m41673e(this.f39407k.f39401k);
                    if (abstractC40818fE33 instanceof C41165fp2) {
                        ((C41165fp2) abstractC40818fE33).m40790i(this.f39407k.f39392b.f47975a);
                    }
                    SC0 sc0 = this.f39407k.f39395e;
                    C8715a c8715a = new C8715a(this.f39407k, null);
                    this.f39404h = abstractC40818fE33;
                    this.f39406j = 1;
                    if (X30.m77504g(sc0, c8715a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    abstractC40818fE3 = abstractC40818fE33;
                }
                Object mo36685A = this.f39407k.f39398h.mo36685A();
                AbstractC40818fE3.AbstractC20325a<Key> m39820a = C41411gE3.m39820a(this.f39407k.f39392b, mo36685A);
                this.f39404h = abstractC40818fE3;
                this.f39405i = mo36685A;
                this.f39406j = 2;
                Object mo40793d = abstractC40818fE3.mo40793d(m39820a, this);
                if (mo40793d == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = mo36685A;
                abstractC40818fE32 = abstractC40818fE3;
                obj = mo40793d;
                abstractC20330b = (AbstractC40818fE3.AbstractC20330b) obj;
                if (!(abstractC20330b instanceof AbstractC40818fE3.AbstractC20330b.C20332b)) {
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C8712a(Key key, ZD3.C10145d config, ZD3.AbstractC10141a<Value> abstractC10141a, Function0<? extends AbstractC40818fE3<Key, Value>> pagingSourceFactory, SC0 notifyDispatcher, SC0 fetchDispatcher) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
            Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
            Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
            this.f39392b = config;
            this.f39393c = abstractC10141a;
            this.f39394d = pagingSourceFactory;
            this.f39395e = notifyDispatcher;
            this.f39396f = fetchDispatcher;
            this.f39397g = true;
            this.f39401k = new C8713a(this);
            Runnable runnable = new Runnable() { // from class: Ue5
                @Override // java.lang.Runnable
                public final void run() {
                    C36568Ve5.C8712a.m79598o(C36568Ve5.C8712a.this);
                }
            };
            this.f39402l = runnable;
            C47224q22 c47224q22 = new C47224q22(VC1.f38731b, notifyDispatcher, fetchDispatcher, config, key);
            this.f39398h = c47224q22;
            c47224q22.m73555V(runnable);
        }

        /* renamed from: o */
        public static final void m79598o(C8712a this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m79600m(true);
        }

        @Override // io.reactivex.functions.InterfaceC23483f
        public void cancel() {
            this.f39398h.mo36684E().m41672f(this.f39401k);
        }

        /* renamed from: m */
        public final void m79600m(boolean z) {
            InterfaceC52943zh2 m73800d;
            InterfaceC52943zh2 interfaceC52943zh2 = this.f39399i;
            if (interfaceC52943zh2 != null && !z) {
                return;
            }
            if (interfaceC52943zh2 != null) {
                InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
            }
            m73800d = Z30.m73800d(VC1.f38731b, this.f39396f, null, new C8714b(this, null), 2, null);
            this.f39399i = m73800d;
        }

        /* renamed from: n */
        public final void m79599n(ZD3<Value> zd3, ZD3<Value> zd32) {
            zd3.m73555V(null);
            zd32.m73555V(this.f39402l);
        }

        @Override // io.reactivex.InterfaceC24579z
        public void subscribe(InterfaceC24578y<ZD3<Value>> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            this.f39400j = emitter;
            emitter.mo11916a(this);
            if (this.f39397g) {
                emitter.onNext(this.f39398h);
                this.f39397g = false;
            }
            m79600m(false);
        }
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "Pager(\n                config = PagingConfig(\n                    config.pageSize,\n                    config.prefetchDistance,\n                    config.enablePlaceholders,\n                    config.initialLoadSizeHint,\n                    config.maxSize\n                ),\n                initialKey = null,\n                pagingSourceFactory = dataSourceFactory.asPagingSourceFactory(Dispatchers.IO)\n            ).flowable", imports = {"androidx.paging.PagingConfig", "androidx.paging.Pager", "androidx.paging.rxjava2.getFlowable", "kotlinx.coroutines.Dispatchers"}))
    public C36568Ve5(WS0.AbstractC9025c<Key, Value> dataSourceFactory, ZD3.C10145d config) {
        Intrinsics.checkNotNullParameter(dataSourceFactory, "dataSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f39383a = null;
        this.f39384b = dataSourceFactory;
        this.f39385c = config;
    }

    /* renamed from: a */
    public final Observable<ZD3<Value>> m79617a() {
        boolean z;
        AbstractC23437E abstractC23437E = this.f39389g;
        if (abstractC23437E == null) {
            Executor m108395i = C1988Em.m108395i();
            Intrinsics.checkNotNullExpressionValue(m108395i, "getMainThreadExecutor()");
            abstractC23437E = new ExecutorC50624vm5(m108395i);
        }
        SC0 sc0 = this.f39388f;
        if (sc0 == null) {
            sc0 = C38679bf5.m64197d(abstractC23437E);
        }
        SC0 sc02 = sc0;
        AbstractC23437E abstractC23437E2 = this.f39391i;
        if (abstractC23437E2 == null) {
            Executor m108397g = C1988Em.m108397g();
            Intrinsics.checkNotNullExpressionValue(m108397g, "getIOThreadExecutor()");
            abstractC23437E2 = new ExecutorC50624vm5(m108397g);
        }
        SC0 sc03 = this.f39390h;
        if (sc03 == null) {
            sc03 = C38679bf5.m64197d(abstractC23437E2);
        }
        SC0 sc04 = sc03;
        Function0<AbstractC40818fE3<Key, Value>> function0 = this.f39383a;
        if (function0 == null) {
            WS0.AbstractC9025c<Key, Value> abstractC9025c = this.f39384b;
            if (abstractC9025c != null) {
                function0 = abstractC9025c.m78418c(sc04);
            } else {
                function0 = null;
            }
        }
        Function0<AbstractC40818fE3<Key, Value>> function02 = function0;
        if (function02 != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Observable<ZD3<Value>> subscribeOn = Observable.create(new C8712a(this.f39386d, this.f39385c, this.f39387e, function02, sc02, sc04)).observeOn(abstractC23437E).subscribeOn(abstractC23437E2);
            Intrinsics.checkNotNullExpressionValue(subscribeOn, "create(\n                …bscribeOn(fetchScheduler)");
            return subscribeOn;
        }
        throw new IllegalStateException("RxPagedList cannot be built without a PagingSourceFactory or DataSource.Factory".toString());
    }

    /* renamed from: b */
    public final C36568Ve5<Key, Value> m79616b(ZD3.AbstractC10141a<Value> abstractC10141a) {
        this.f39387e = abstractC10141a;
        return this;
    }

    /* renamed from: c */
    public final C36568Ve5<Key, Value> m79615c(AbstractC23437E scheduler) {
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.f39391i = scheduler;
        this.f39390h = C38679bf5.m64197d(scheduler);
        return this;
    }

    /* renamed from: d */
    public final C36568Ve5<Key, Value> m79614d(Key key) {
        this.f39386d = key;
        return this;
    }

    /* renamed from: e */
    public final C36568Ve5<Key, Value> m79613e(AbstractC23437E scheduler) {
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.f39389g = scheduler;
        this.f39388f = C38679bf5.m64197d(scheduler);
        return this;
    }
}
