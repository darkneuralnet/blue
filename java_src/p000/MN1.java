package p000;

import androidx.lifecycle.LiveData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.chuckerteam.chucker.internal.data.entity.C17147a;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%J$\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u0016J\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0010J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, m28432d2 = {"LMN1;", "LNN1;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "path", "Landroidx/lifecycle/LiveData;", "", "Lcom/chuckerteam/chucker/internal/data/entity/a;", "e", "", "transactionId", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "g", C17296a.f69688o, "", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transaction", "f", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", DateTokenConverter.CONVERTER_KEY, "threshold", "c", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "minTimestamp", "i", "(Ljava/lang/Long;)Ljava/util/List;", "Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;", "Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;", "database", "LKN1;", "j", "()LKN1;", "transactionDao", "<init>", "(Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: MN1 */
/* loaded from: classes5.dex */
public final class MN1 implements NN1 {

    /* renamed from: a */
    public final ChuckerDatabase f23016a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "old", "new", "", C17296a.f69688o, "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: MN1$a */
    /* loaded from: classes5.dex */
    public static final class C5279a extends Lambda implements Function2<HttpTransaction, HttpTransaction, Boolean> {

        /* renamed from: g */
        public static final C5279a f23017g = new C5279a();

        public C5279a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(HttpTransaction httpTransaction, HttpTransaction httpTransaction2) {
            boolean z = false;
            if (httpTransaction != null && !httpTransaction.hasTheSameContent(httpTransaction2)) {
                z = true;
            }
            return Boolean.valueOf(!z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.data.repository.HttpTransactionDatabaseRepository", m28418f = "HttpTransactionDatabaseRepository.kt", m28417i = {0}, m28416l = {40}, m28415m = "insertTransaction", m28414n = {"transaction"}, m28413s = {"L$0"})
    /* renamed from: MN1$b */
    /* loaded from: classes5.dex */
    public static final class C5280b extends ContinuationImpl {

        /* renamed from: h */
        public Object f23018h;

        /* renamed from: i */
        public /* synthetic */ Object f23019i;

        /* renamed from: k */
        public int f23021k;

        public C5280b(Continuation<? super C5280b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23019i = obj;
            this.f23021k |= Integer.MIN_VALUE;
            return MN1.this.mo94005f(null, this);
        }
    }

    public MN1(ChuckerDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f23016a = database;
    }

    @Override // p000.NN1
    /* renamed from: a */
    public LiveData<List<C17147a>> mo94010a() {
        return m95395j().mo97019c();
    }

    @Override // p000.NN1
    /* renamed from: b */
    public Object mo94009b(Continuation<? super List<HttpTransaction>> continuation) {
        return m95395j().mo97017e(continuation);
    }

    @Override // p000.NN1
    /* renamed from: c */
    public Object mo94008c(long j, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object mo97018d = m95395j().mo97018d(j, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mo97018d == coroutine_suspended ? mo97018d : Unit.INSTANCE;
    }

    @Override // p000.NN1
    /* renamed from: d */
    public Object mo94007d(HttpTransaction httpTransaction, Continuation<? super Integer> continuation) {
        return m95395j().mo97014h(httpTransaction, continuation);
    }

    @Override // p000.NN1
    /* renamed from: e */
    public LiveData<List<C17147a>> mo94006e(String code, String path) {
        boolean z;
        String str;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(path, "path");
        if (path.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = "%";
        } else {
            str = "%" + path + "%";
        }
        return m95395j().mo97021a(code + "%", str, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // p000.NN1
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo94005f(HttpTransaction httpTransaction, Continuation<? super Unit> continuation) {
        C5280b c5280b;
        Object coroutine_suspended;
        int i;
        Long l;
        long j;
        if (continuation instanceof C5280b) {
            c5280b = (C5280b) continuation;
            int i2 = c5280b.f23021k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c5280b.f23021k = i2 - Integer.MIN_VALUE;
                Object obj = c5280b.f23019i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c5280b.f23021k;
                if (i == 0) {
                    if (i == 1) {
                        httpTransaction = (HttpTransaction) c5280b.f23018h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    KN1 m95395j = m95395j();
                    c5280b.f23018h = httpTransaction;
                    c5280b.f23021k = 1;
                    obj = m95395j.mo97016f(httpTransaction, c5280b);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                l = (Long) obj;
                if (l == null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                httpTransaction.setId(j);
                return Unit.INSTANCE;
            }
        }
        c5280b = new C5280b(continuation);
        Object obj2 = c5280b.f23019i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c5280b.f23021k;
        if (i == 0) {
        }
        l = (Long) obj2;
        if (l == null) {
        }
        httpTransaction.setId(j);
        return Unit.INSTANCE;
    }

    @Override // p000.NN1
    /* renamed from: g */
    public LiveData<HttpTransaction> mo94004g(long j) {
        return C37159Xs2.m76188e(m95395j().mo97015g(j), null, C5279a.f23017g, 1, null);
    }

    @Override // p000.NN1
    /* renamed from: h */
    public Object mo94003h(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object mo97013i = m95395j().mo97013i(continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mo97013i == coroutine_suspended ? mo97013i : Unit.INSTANCE;
    }

    @Override // p000.NN1
    /* renamed from: i */
    public List<HttpTransaction> mo94002i(Long l) {
        long j;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        return m95395j().mo97020b(j);
    }

    /* renamed from: j */
    public final KN1 m95395j() {
        return this.f23016a.mo53009C();
    }
}
