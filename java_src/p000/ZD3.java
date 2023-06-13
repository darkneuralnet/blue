package p000;

import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC40818fE3;
import p000.AbstractC46542ot2;
@Deprecated(message = "PagedList is deprecated and has been replaced by PagingData")
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\b'\u0018\u0000 h*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0005i-39?BA\b\u0000\u0012\u0010\u00101\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000,\u0012\u0006\u00107\u001a\u000202\u0012\u0006\u0010=\u001a\u000208\u0012\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000>\u0012\u0006\u0010I\u001a\u00020D¢\u0006\u0004\bf\u0010gJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\"\u0010\r\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bH'J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H'J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\nH\u0017J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dJ \u0010 \u001a\u00020\u000b2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bJ \u0010\u0002\u001a\u00020\u000b2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bJ \u0010#\u001a\u00020\u000b2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d2\u0006\u0010\f\u001a\u00020\"H\u0007J\u000e\u0010$\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\"J\u000e\u0010%\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\"J\u001f\u0010(\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0000¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0007J\u0018\u0010+\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0007R$\u00101\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000,8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00107\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010=\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010I\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010T\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR \u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0V0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR2\u0010[\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b0V0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010XR\u0014\u0010]\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010SR\u0016\u0010`\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010c\u001a\u00020a8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010bR\u0014\u0010e\u001a\u00020a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010b¨\u0006j"}, m28432d2 = {"LZD3;", "", "T", "Ljava/util/AbstractList;", "Lnd3;", "D", "", "K", "Lkotlin/Function2;", "Lpt2;", "Lot2;", "", "callback", "w", "index", "M", "loadType", "loadState", "U", "Ljava/lang/Runnable;", "refreshRetryCallback", "V", "type", TransferTable.COLUMN_STATE, "x", "(Lpt2;Lot2;)V", "get", "(I)Ljava/lang/Object;", "L", "", "X", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "v", "previousSnapshot", "LZD3$b;", "u", "s", "S", "position", "count", "O", "(II)V", "N", "Q", "LfE3;", "b", "LfE3;", "E", "()LfE3;", "pagingSource", "LZC0;", "c", "LZC0;", "z", "()LZC0;", "coroutineScope", "LSC0;", DateTokenConverter.CONVERTER_KEY, "LSC0;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()LSC0;", "notifyDispatcher", "LbE3;", "e", "LbE3;", "H", "()LbE3;", "storage", "LZD3$d;", "f", "LZD3$d;", "y", "()LZD3$d;", "config", "g", "Ljava/lang/Runnable;", "getRefreshRetryCallback$paging_common", "()Ljava/lang/Runnable;", "setRefreshRetryCallback$paging_common", "(Ljava/lang/Runnable;)V", "h", "I", "F", "()I", "requiredRemainder", "", "Ljava/lang/ref/WeakReference;", "i", "Ljava/util/List;", "callbacks", "j", "loadStateListeners", "G", "size", "A", "()Ljava/lang/Object;", "lastKey", "", "()Z", "isDetached", "J", "isImmutable", "<init>", "(LfE3;LZC0;LSC0;LbE3;LZD3$d;)V", "k", C17296a.f69688o, "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: ZD3 */
/* loaded from: classes.dex */
public abstract class ZD3<T> extends AbstractList<T> {

    /* renamed from: k */
    public static final C10143c f47961k = new C10143c(null);

    /* renamed from: b */
    public final AbstractC40818fE3<?, T> f47962b;

    /* renamed from: c */
    public final ZC0 f47963c;

    /* renamed from: d */
    public final SC0 f47964d;

    /* renamed from: e */
    public final C38429bE3<T> f47965e;

    /* renamed from: f */
    public final C10145d f47966f;

    /* renamed from: g */
    public Runnable f47967g;

    /* renamed from: h */
    public final int f47968h;

    /* renamed from: i */
    public final List<WeakReference<AbstractC10142b>> f47969i;

    /* renamed from: j */
    public final List<WeakReference<Function2<EnumC47135pt2, AbstractC46542ot2, Unit>>> f47970j;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b'\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\u0007¨\u0006\f"}, m28432d2 = {"LZD3$a;", "", "T", "", "c", "itemAtFront", "b", "(Ljava/lang/Object;)V", "itemAtEnd", C17296a.f69688o, "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ZD3$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC10141a<T> {
        /* renamed from: a */
        public void m73546a(T itemAtEnd) {
            Intrinsics.checkNotNullParameter(itemAtEnd, "itemAtEnd");
        }

        /* renamed from: b */
        public void m73545b(T itemAtFront) {
            Intrinsics.checkNotNullParameter(itemAtFront, "itemAtFront");
        }

        /* renamed from: c */
        public void m73544c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u000b"}, m28432d2 = {"LZD3$b;", "", "", "position", "count", "", C17296a.f69688o, "b", "c", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ZD3$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC10142b {
        /* renamed from: a */
        public abstract void mo31832a(int i, int i2);

        /* renamed from: b */
        public abstract void mo31831b(int i, int i2);

        /* renamed from: c */
        public abstract void mo31830c(int i, int i2);
    }

    @Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u008d\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0012\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m28432d2 = {"LZD3$c;", "", "K", "T", "LfE3;", "pagingSource", "LfE3$b$c;", "initialPage", "LZC0;", "coroutineScope", "LSC0;", "notifyDispatcher", "fetchDispatcher", "LZD3$a;", "boundaryCallback", "LZD3$d;", "config", "key", "LZD3;", C17296a.f69688o, "(LfE3;LfE3$b$c;LZC0;LSC0;LSC0;LZD3$a;LZD3$d;Ljava/lang/Object;)LZD3;", "", "currentSize", "snapshotSize", "LZD3$b;", "callback", "", "b", "(IILZD3$b;)V", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ZD3$c */
    /* loaded from: classes.dex */
    public static final class C10143c {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@"}, m28432d2 = {"", "K", "T", "LZC0;", "LfE3$b$c;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        @DebugMetadata(m28419c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", m28418f = "PagedList.kt", m28417i = {}, m28416l = {SyslogConstants.LOG_LOCAL7}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: ZD3$c$a */
        /* loaded from: classes.dex */
        public static final class C10144a extends SuspendLambda implements Function2<ZC0, Continuation<? super AbstractC40818fE3.AbstractC20330b.C20333c<K, T>>, Object> {

            /* renamed from: h */
            public int f47971h;

            /* renamed from: i */
            public final /* synthetic */ AbstractC40818fE3<K, T> f47972i;

            /* renamed from: j */
            public final /* synthetic */ AbstractC40818fE3.AbstractC20325a.C20329d<K> f47973j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10144a(AbstractC40818fE3<K, T> abstractC40818fE3, AbstractC40818fE3.AbstractC20325a.C20329d<K> c20329d, Continuation<? super C10144a> continuation) {
                super(2, continuation);
                this.f47972i = abstractC40818fE3;
                this.f47973j = c20329d;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10144a(this.f47972i, this.f47973j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super AbstractC40818fE3.AbstractC20330b.C20333c<K, T>> continuation) {
                return ((C10144a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f47971h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    AbstractC40818fE3<K, T> abstractC40818fE3 = this.f47972i;
                    Object obj2 = this.f47973j;
                    this.f47971h = 1;
                    obj = abstractC40818fE3.mo40793d(obj2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                AbstractC40818fE3.AbstractC20330b abstractC20330b = (AbstractC40818fE3.AbstractC20330b) obj;
                if (abstractC20330b instanceof AbstractC40818fE3.AbstractC20330b.C20333c) {
                    return (AbstractC40818fE3.AbstractC20330b.C20333c) abstractC20330b;
                }
                if (!(abstractC20330b instanceof AbstractC40818fE3.AbstractC20330b.C20331a)) {
                    if (abstractC20330b instanceof AbstractC40818fE3.AbstractC20330b.C20332b) {
                        throw new IllegalStateException("Failed to create PagedList. The provided PagingSource returned LoadResult.Invalid, but a LoadResult.Page was expected. To use a PagingSource which supports invalidation, use a PagedList builder that accepts a factory method for PagingSource or DataSource.Factory, such as LivePagedList.");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                throw ((AbstractC40818fE3.AbstractC20330b.C20331a) abstractC20330b).m41668a();
            }
        }

        public /* synthetic */ C10143c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final <K, T> ZD3<T> m73543a(AbstractC40818fE3<K, T> pagingSource, AbstractC40818fE3.AbstractC20330b.C20333c<K, T> c20333c, ZC0 coroutineScope, SC0 notifyDispatcher, SC0 fetchDispatcher, AbstractC10141a<T> abstractC10141a, C10145d config, K k) {
            AbstractC40818fE3.AbstractC20330b.C20333c<K, T> c20333c2;
            Object m75794b;
            Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
            Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
            Intrinsics.checkNotNullParameter(config, "config");
            if (c20333c == null) {
                m75794b = Y30.m75794b(null, new C10144a(pagingSource, new AbstractC40818fE3.AbstractC20325a.C20329d(k, config.f47978d, config.f47977c), null), 1, null);
                c20333c2 = (AbstractC40818fE3.AbstractC20330b.C20333c) m75794b;
            } else {
                c20333c2 = c20333c;
            }
            return new C41974hB0(pagingSource, coroutineScope, notifyDispatcher, fetchDispatcher, abstractC10141a, config, c20333c2, k);
        }

        /* renamed from: b */
        public final void m73542b(int i, int i2, AbstractC10142b callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (i2 < i) {
                if (i2 > 0) {
                    callback.mo31832a(0, i2);
                }
                int i3 = i - i2;
                if (i3 > 0) {
                    callback.mo31831b(i2, i3);
                    return;
                }
                return;
            }
            if (i > 0) {
                callback.mo31832a(0, i);
            }
            int i4 = i2 - i;
            if (i4 != 0) {
                callback.mo31830c(i, i4);
            }
        }

        private C10143c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0003\u0006B1\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0013"}, m28432d2 = {"LZD3$d;", "", "", C17296a.f69688o, "I", "pageSize", "b", "prefetchDistance", "", "c", "Z", "enablePlaceholders", DateTokenConverter.CONVERTER_KEY, "initialLoadSizeHint", "e", "maxSize", "<init>", "(IIZII)V", "f", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ZD3$d */
    /* loaded from: classes.dex */
    public static final class C10145d {

        /* renamed from: f */
        public static final C10148b f47974f = new C10148b(null);
        @JvmField

        /* renamed from: a */
        public final int f47975a;
        @JvmField

        /* renamed from: b */
        public final int f47976b;
        @JvmField

        /* renamed from: c */
        public final boolean f47977c;
        @JvmField

        /* renamed from: d */
        public final int f47978d;
        @JvmField

        /* renamed from: e */
        public final int f47979e;

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0014"}, m28432d2 = {"LZD3$d$a;", "", "", "pageSize", "c", "initialLoadSizeHint", "b", "LZD3$d;", C17296a.f69688o, "I", "prefetchDistance", "", DateTokenConverter.CONVERTER_KEY, "Z", "enablePlaceholders", "e", "maxSize", "<init>", "()V", "f", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: ZD3$d$a */
        /* loaded from: classes.dex */
        public static final class C10146a {

            /* renamed from: f */
            public static final C10147a f47980f = new C10147a(null);

            /* renamed from: a */
            public int f47981a = -1;

            /* renamed from: b */
            public int f47982b = -1;

            /* renamed from: c */
            public int f47983c = -1;

            /* renamed from: d */
            public boolean f47984d = true;

            /* renamed from: e */
            public int f47985e = Integer.MAX_VALUE;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LZD3$d$a$a;", "", "", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "I", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
            /* renamed from: ZD3$d$a$a */
            /* loaded from: classes.dex */
            public static final class C10147a {
                public /* synthetic */ C10147a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C10147a() {
                }
            }

            /* renamed from: a */
            public final C10145d m73541a() {
                if (this.f47982b < 0) {
                    this.f47982b = this.f47981a;
                }
                if (this.f47983c < 0) {
                    this.f47983c = this.f47981a * 3;
                }
                if (!this.f47984d && this.f47982b == 0) {
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                int i = this.f47985e;
                if (i != Integer.MAX_VALUE && i < this.f47981a + (this.f47982b * 2)) {
                    throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + this.f47981a + ", prefetchDist=" + this.f47982b + ", maxSize=" + this.f47985e);
                }
                return new C10145d(this.f47981a, this.f47982b, this.f47984d, this.f47983c, this.f47985e);
            }

            /* renamed from: b */
            public final C10146a m73540b(int i) {
                this.f47983c = i;
                return this;
            }

            /* renamed from: c */
            public final C10146a m73539c(int i) {
                if (i >= 1) {
                    this.f47981a = i;
                    return this;
                }
                throw new IllegalArgumentException("Page size must be a positive number");
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28432d2 = {"LZD3$d$b;", "", "", "MAX_SIZE_UNBOUNDED", "I", "getMAX_SIZE_UNBOUNDED$annotations", "()V", "<init>", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: ZD3$d$b */
        /* loaded from: classes.dex */
        public static final class C10148b {
            public /* synthetic */ C10148b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C10148b() {
            }
        }

        public C10145d(int i, int i2, boolean z, int i3, int i4) {
            this.f47975a = i;
            this.f47976b = i2;
            this.f47977c = z;
            this.f47978d = i3;
            this.f47979e = i4;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'J \u0010\u000b\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\tR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006\u001a"}, m28432d2 = {"LZD3$e;", "", "Lpt2;", "type", "Lot2;", TransferTable.COLUMN_STATE, "", "e", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function2;", "callback", C17296a.f69688o, "Lot2;", "getRefreshState", "()Lot2;", "setRefreshState", "(Lot2;)V", "refreshState", "b", "c", "setStartState", "startState", "setEndState", "endState", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: ZD3$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC10149e {

        /* renamed from: a */
        public AbstractC46542ot2 f47986a;

        /* renamed from: b */
        public AbstractC46542ot2 f47987b;

        /* renamed from: c */
        public AbstractC46542ot2 f47988c;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* renamed from: ZD3$e$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C10150a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC47135pt2.values().length];
                iArr[EnumC47135pt2.REFRESH.ordinal()] = 1;
                iArr[EnumC47135pt2.PREPEND.ordinal()] = 2;
                iArr[EnumC47135pt2.APPEND.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AbstractC10149e() {
            AbstractC46542ot2.C27094c.C27095a c27095a = AbstractC46542ot2.C27094c.f102709b;
            this.f47986a = c27095a.m20363b();
            this.f47987b = c27095a.m20363b();
            this.f47988c = c27095a.m20363b();
        }

        /* renamed from: a */
        public final void m73538a(Function2<? super EnumC47135pt2, ? super AbstractC46542ot2, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke(EnumC47135pt2.REFRESH, this.f47986a);
            callback.invoke(EnumC47135pt2.PREPEND, this.f47987b);
            callback.invoke(EnumC47135pt2.APPEND, this.f47988c);
        }

        /* renamed from: b */
        public final AbstractC46542ot2 m73537b() {
            return this.f47988c;
        }

        /* renamed from: c */
        public final AbstractC46542ot2 m73536c() {
            return this.f47987b;
        }

        /* renamed from: d */
        public abstract void mo31833d(EnumC47135pt2 enumC47135pt2, AbstractC46542ot2 abstractC46542ot2);

        /* renamed from: e */
        public final void m73535e(EnumC47135pt2 type, AbstractC46542ot2 state) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            int i = C10150a.$EnumSwitchMapping$0[type.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (Intrinsics.areEqual(this.f47988c, state)) {
                            return;
                        }
                        this.f47988c = state;
                    }
                } else if (Intrinsics.areEqual(this.f47987b, state)) {
                    return;
                } else {
                    this.f47987b = state;
                }
            } else if (Intrinsics.areEqual(this.f47986a, state)) {
                return;
            } else {
                this.f47986a = state;
            }
            mo31833d(type, state);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "LZD3$b;", "it", "", C17296a.f69688o, "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: ZD3$f */
    /* loaded from: classes.dex */
    public static final class C10151f extends Lambda implements Function1<WeakReference<AbstractC10142b>, Boolean> {

        /* renamed from: g */
        public static final C10151f f47989g = new C10151f();

        public C10151f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WeakReference<AbstractC10142b> it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.get() == null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function2;", "Lpt2;", "Lot2;", "", "it", "", C17296a.f69688o, "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: ZD3$g */
    /* loaded from: classes.dex */
    public static final class C10152g extends Lambda implements Function1<WeakReference<Function2<? super EnumC47135pt2, ? super AbstractC46542ot2, ? extends Unit>>, Boolean> {

        /* renamed from: g */
        public static final C10152g f47990g = new C10152g();

        public C10152g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WeakReference<Function2<EnumC47135pt2, AbstractC46542ot2, Unit>> it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.get() == null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, m28432d2 = {"", "T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", m28418f = "PagedList.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: ZD3$h */
    /* loaded from: classes.dex */
    public static final class C10153h extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f47991h;

        /* renamed from: i */
        public final /* synthetic */ ZD3<T> f47992i;

        /* renamed from: j */
        public final /* synthetic */ EnumC47135pt2 f47993j;

        /* renamed from: k */
        public final /* synthetic */ AbstractC46542ot2 f47994k;

        @Metadata(m28433d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function2;", "Lpt2;", "Lot2;", "", "it", "", C17296a.f69688o, "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: ZD3$h$a */
        /* loaded from: classes.dex */
        public static final class C10154a extends Lambda implements Function1<WeakReference<Function2<? super EnumC47135pt2, ? super AbstractC46542ot2, ? extends Unit>>, Boolean> {

            /* renamed from: g */
            public static final C10154a f47995g = new C10154a();

            public C10154a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(WeakReference<Function2<EnumC47135pt2, AbstractC46542ot2, Unit>> it) {
                boolean z;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.get() == null) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10153h(ZD3<T> zd3, EnumC47135pt2 enumC47135pt2, AbstractC46542ot2 abstractC46542ot2, Continuation<? super C10153h> continuation) {
            super(2, continuation);
            this.f47992i = zd3;
            this.f47993j = enumC47135pt2;
            this.f47994k = abstractC46542ot2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10153h(this.f47992i, this.f47993j, this.f47994k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C10153h) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f47991h == 0) {
                ResultKt.throwOnFailure(obj);
                CollectionsKt__MutableCollectionsKt.removeAll(this.f47992i.f47970j, (Function1) C10154a.f47995g);
                EnumC47135pt2 enumC47135pt2 = this.f47993j;
                AbstractC46542ot2 abstractC46542ot2 = this.f47994k;
                for (WeakReference weakReference : this.f47992i.f47970j) {
                    Function2 function2 = (Function2) weakReference.get();
                    if (function2 != null) {
                        function2.invoke(enumC47135pt2, abstractC46542ot2);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "LZD3$b;", "it", "", C17296a.f69688o, "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: ZD3$i */
    /* loaded from: classes.dex */
    public static final class C10155i extends Lambda implements Function1<WeakReference<AbstractC10142b>, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC10142b f47996g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10155i(AbstractC10142b abstractC10142b) {
            super(1);
            this.f47996g = abstractC10142b;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WeakReference<AbstractC10142b> it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.get() != null && it.get() != this.f47996g) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"", "T", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function2;", "Lpt2;", "Lot2;", "", "it", "", C17296a.f69688o, "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: ZD3$j */
    /* loaded from: classes.dex */
    public static final class C10156j extends Lambda implements Function1<WeakReference<Function2<? super EnumC47135pt2, ? super AbstractC46542ot2, ? extends Unit>>, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ Function2<EnumC47135pt2, AbstractC46542ot2, Unit> f47997g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10156j(Function2<? super EnumC47135pt2, ? super AbstractC46542ot2, Unit> function2) {
            super(1);
            this.f47997g = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WeakReference<Function2<EnumC47135pt2, AbstractC46542ot2, Unit>> it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.get() != null && it.get() != this.f47997g) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public ZD3(AbstractC40818fE3<?, T> pagingSource, ZC0 coroutineScope, SC0 notifyDispatcher, C38429bE3<T> storage, C10145d config) {
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f47962b = pagingSource;
        this.f47963c = coroutineScope;
        this.f47964d = notifyDispatcher;
        this.f47965e = storage;
        this.f47966f = config;
        this.f47968h = (config.f47976b * 2) + config.f47975a;
        this.f47969i = new ArrayList();
        this.f47970j = new ArrayList();
    }

    /* renamed from: A */
    public abstract Object mo36685A();

    /* renamed from: C */
    public final SC0 m73569C() {
        return this.f47964d;
    }

    /* renamed from: D */
    public final InterfaceC45790nd3<T> m73568D() {
        return this.f47965e;
    }

    /* renamed from: E */
    public AbstractC40818fE3<?, T> mo36684E() {
        return this.f47962b;
    }

    /* renamed from: F */
    public final int m73567F() {
        return this.f47968h;
    }

    /* renamed from: G */
    public int m73566G() {
        return this.f47965e.size();
    }

    /* renamed from: H */
    public final C38429bE3<T> m73565H() {
        return this.f47965e;
    }

    /* renamed from: I */
    public abstract boolean mo36683I();

    /* renamed from: J */
    public boolean mo73564J() {
        return mo36683I();
    }

    /* renamed from: K */
    public final int m73563K() {
        return this.f47965e.m64791u();
    }

    /* renamed from: L */
    public final void m73562L(int i) {
        if (i >= 0 && i < size()) {
            this.f47965e.m64798G(i);
            mo36682M(i);
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size());
    }

    /* renamed from: M */
    public abstract void mo36682M(int i);

    /* renamed from: N */
    public final void m73561N(int i, int i2) {
        List<WeakReference> reversed;
        if (i2 == 0) {
            return;
        }
        reversed = CollectionsKt___CollectionsKt.reversed(this.f47969i);
        for (WeakReference weakReference : reversed) {
            AbstractC10142b abstractC10142b = (AbstractC10142b) weakReference.get();
            if (abstractC10142b != null) {
                abstractC10142b.mo31832a(i, i2);
            }
        }
    }

    /* renamed from: O */
    public final void m73560O(int i, int i2) {
        List<WeakReference> reversed;
        if (i2 == 0) {
            return;
        }
        reversed = CollectionsKt___CollectionsKt.reversed(this.f47969i);
        for (WeakReference weakReference : reversed) {
            AbstractC10142b abstractC10142b = (AbstractC10142b) weakReference.get();
            if (abstractC10142b != null) {
                abstractC10142b.mo31831b(i, i2);
            }
        }
    }

    /* renamed from: Q */
    public final void m73559Q(int i, int i2) {
        List<WeakReference> reversed;
        if (i2 == 0) {
            return;
        }
        reversed = CollectionsKt___CollectionsKt.reversed(this.f47969i);
        for (WeakReference weakReference : reversed) {
            AbstractC10142b abstractC10142b = (AbstractC10142b) weakReference.get();
            if (abstractC10142b != null) {
                abstractC10142b.mo31830c(i, i2);
            }
        }
    }

    /* renamed from: R */
    public /* bridge */ Object m73558R(int i) {
        return super.remove(i);
    }

    /* renamed from: S */
    public final void m73557S(AbstractC10142b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.f47969i, (Function1) new C10155i(callback));
    }

    /* renamed from: T */
    public final void m73556T(Function2<? super EnumC47135pt2, ? super AbstractC46542ot2, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.f47970j, (Function1) new C10156j(listener));
    }

    /* renamed from: U */
    public void mo36681U(EnumC47135pt2 loadType, AbstractC46542ot2 loadState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
    }

    /* renamed from: V */
    public final void m73555V(Runnable runnable) {
        this.f47967g = runnable;
    }

    /* renamed from: X */
    public final List<T> m73554X() {
        if (mo73564J()) {
            return this;
        }
        return new FM5(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return this.f47965e.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) m73558R(i);
    }

    /* renamed from: s */
    public final void m73552s(AbstractC10142b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.f47969i, (Function1) C10151f.f47989g);
        this.f47969i.add(new WeakReference<>(callback));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return m73566G();
    }

    @Deprecated(message = "Dispatching a diff since snapshot created is behavior that can be instead tracked by attaching a Callback to the PagedList that is mutating, and tracking changes since calling PagedList.snapshot().")
    /* renamed from: u */
    public final void m73551u(List<? extends T> list, AbstractC10142b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (list != null && list != this) {
            f47961k.m73542b(size(), list.size(), callback);
        }
        m73552s(callback);
    }

    /* renamed from: v */
    public final void m73550v(Function2<? super EnumC47135pt2, ? super AbstractC46542ot2, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.f47970j, (Function1) C10152g.f47990g);
        this.f47970j.add(new WeakReference<>(listener));
        mo36664w(listener);
    }

    /* renamed from: w */
    public abstract void mo36664w(Function2<? super EnumC47135pt2, ? super AbstractC46542ot2, Unit> function2);

    /* renamed from: x */
    public final void m73549x(EnumC47135pt2 type, AbstractC46542ot2 state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Z30.m73800d(this.f47963c, this.f47964d, null, new C10153h(this, type, state, null), 2, null);
    }

    /* renamed from: y */
    public final C10145d m73548y() {
        return this.f47966f;
    }

    /* renamed from: z */
    public final ZC0 m73547z() {
        return this.f47963c;
    }
}
