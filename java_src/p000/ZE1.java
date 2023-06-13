package p000;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"LZE1;", "", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transactions", "", "name", "version", "b", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LGE0;", "creator", "LYE1;", C17296a.f69688o, "(Ljava/util/List;LGE0;)LYE1;", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZE1 */
/* loaded from: classes5.dex */
public final class ZE1 {

    /* renamed from: a */
    public static final ZE1 f48010a = new ZE1();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.support.HarUtils", m28418f = "HarUtils.kt", m28417i = {}, m28416l = {16}, m28415m = "harStringFromTransactions", m28414n = {}, m28413s = {})
    /* renamed from: ZE1$a */
    /* loaded from: classes5.dex */
    public static final class C10159a extends ContinuationImpl {

        /* renamed from: h */
        public /* synthetic */ Object f48011h;

        /* renamed from: j */
        public int f48013j;

        public C10159a(Continuation<? super C10159a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f48011h = obj;
            this.f48013j |= Integer.MIN_VALUE;
            return ZE1.this.m73524b(null, null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "kotlin.jvm.PlatformType", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.support.HarUtils$harStringFromTransactions$2", m28418f = "HarUtils.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: ZE1$b */
    /* loaded from: classes5.dex */
    public static final class C10160b extends SuspendLambda implements Function2<ZC0, Continuation<? super String>, Object> {

        /* renamed from: h */
        public int f48014h;

        /* renamed from: i */
        public final /* synthetic */ List<HttpTransaction> f48015i;

        /* renamed from: j */
        public final /* synthetic */ String f48016j;

        /* renamed from: k */
        public final /* synthetic */ String f48017k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10160b(List<HttpTransaction> list, String str, String str2, Continuation<? super C10160b> continuation) {
            super(2, continuation);
            this.f48015i = list;
            this.f48016j = str;
            this.f48017k = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10160b(this.f48015i, this.f48016j, this.f48017k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super String> continuation) {
            return ((C10160b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f48014h == 0) {
                ResultKt.throwOnFailure(obj);
                return C44653li2.f96593a.m26933b().m21545x(ZE1.f48010a.m73525a(this.f48015i, new GE0(this.f48016j, this.f48017k, null, 4, null)));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private ZE1() {
    }

    /* renamed from: a */
    public final YE1 m73525a(List<HttpTransaction> transactions, GE0 creator) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(creator, "creator");
        return new YE1(transactions, creator);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m73524b(List<HttpTransaction> list, String str, String str2, Continuation<? super String> continuation) {
        C10159a c10159a;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof C10159a) {
            c10159a = (C10159a) continuation;
            int i2 = c10159a.f48013j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c10159a.f48013j = i2 - Integer.MIN_VALUE;
                Object obj = c10159a.f48011h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c10159a.f48013j;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    SC0 m84378a = T41.m84378a();
                    C10160b c10160b = new C10160b(list, str, str2, null);
                    c10159a.f48013j = 1;
                    obj = X30.m77504g(m84378a, c10160b, c10159a);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Intrinsics.checkNotNullExpressionValue(obj, "transactions: List<HttpT…or(name, version)))\n    }");
                return obj;
            }
        }
        c10159a = new C10159a(continuation);
        Object obj2 = c10159a.f48011h;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c10159a.f48013j;
        if (i == 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "transactions: List<HttpT…or(name, version)))\n    }");
        return obj2;
    }
}
