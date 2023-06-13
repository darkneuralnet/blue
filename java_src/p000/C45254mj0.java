package p000;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.C17156a;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.KN4;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006J+\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006'"}, m28432d2 = {"Lmj0;", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "", DateTokenConverter.CONVERTER_KEY, "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "e", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "startTimestamp", "Lyi1;", "exportFormat", "Landroid/net/Uri;", "f", "(Landroid/content/Context;Ljava/lang/Long;Lyi1;)Landroid/net/Uri;", "", C17296a.f69688o, "Z", "c", "()Z", "setShowNotification", "(Z)V", "showNotification", "LKN4;", "b", "LKN4;", "retentionManager", "Lcom/chuckerteam/chucker/internal/support/a;", "Lcom/chuckerteam/chucker/internal/support/a;", "notificationHelper", "LZC0;", "LZC0;", Action.SCOPE_ATTRIBUTE, "LKN4$b;", "retentionPeriod", "<init>", "(Landroid/content/Context;ZLKN4$b;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45254mj0 {

    /* renamed from: a */
    public boolean f98611a;

    /* renamed from: b */
    public final KN4 f98612b;

    /* renamed from: c */
    public final C17156a f98613c;

    /* renamed from: d */
    public final ZC0 f98614d;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mj0$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C26175a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC52359yi1.values().length];
            try {
                iArr[EnumC52359yi1.LOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC52359yi1.HAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.api.ChuckerCollector$onRequestSent$1", m28418f = "ChuckerCollector.kt", m28417i = {}, m28416l = {50, 57}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: mj0$b */
    /* loaded from: classes5.dex */
    public static final class C26176b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f98615h;

        /* renamed from: j */
        public final /* synthetic */ HttpTransaction f98617j;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "com.chuckerteam.chucker.api.ChuckerCollector$onRequestSent$1$1", m28418f = "ChuckerCollector.kt", m28417i = {}, m28416l = {51}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: mj0$b$a */
        /* loaded from: classes5.dex */
        public static final class C26177a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f98618h;

            /* renamed from: i */
            public final /* synthetic */ HttpTransaction f98619i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26177a(HttpTransaction httpTransaction, Continuation<? super C26177a> continuation) {
                super(2, continuation);
                this.f98619i = httpTransaction;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C26177a(this.f98619i, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C26177a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f98618h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    NN1 m36551b = C42041hI4.f84975a.m36551b();
                    HttpTransaction httpTransaction = this.f98619i;
                    this.f98618h = 1;
                    if (m36551b.mo94005f(httpTransaction, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "com.chuckerteam.chucker.api.ChuckerCollector$onRequestSent$1$2", m28418f = "ChuckerCollector.kt", m28417i = {}, m28416l = {58}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: mj0$b$b */
        /* loaded from: classes5.dex */
        public static final class C26178b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f98620h;

            /* renamed from: i */
            public final /* synthetic */ C45254mj0 f98621i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26178b(C45254mj0 c45254mj0, Continuation<? super C26178b> continuation) {
                super(2, continuation);
                this.f98621i = c45254mj0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C26178b(this.f98621i, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C26178b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f98620h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    KN4 kn4 = this.f98621i.f98612b;
                    this.f98620h = 1;
                    if (kn4.m98951b(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26176b(HttpTransaction httpTransaction, Continuation<? super C26176b> continuation) {
            super(2, continuation);
            this.f98617j = httpTransaction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26176b(this.f98617j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C26176b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f98615h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                SC0 m84377b = T41.m84377b();
                C26177a c26177a = new C26177a(this.f98617j, null);
                this.f98615h = 1;
                if (X30.m77504g(m84377b, c26177a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (C45254mj0.this.m25142c()) {
                C45254mj0.this.f98613c.m52963k(this.f98617j);
            }
            SC0 m84377b2 = T41.m84377b();
            C26178b c26178b = new C26178b(C45254mj0.this, null);
            this.f98615h = 2;
            if (X30.m77504g(m84377b2, c26178b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.api.ChuckerCollector$onResponseReceived$1", m28418f = "ChuckerCollector.kt", m28417i = {}, m28416l = {70}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: mj0$c */
    /* loaded from: classes5.dex */
    public static final class C26179c extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f98622h;

        /* renamed from: j */
        public final /* synthetic */ HttpTransaction f98624j;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "com.chuckerteam.chucker.api.ChuckerCollector$onResponseReceived$1$updated$1", m28418f = "ChuckerCollector.kt", m28417i = {}, m28416l = {71}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: mj0$c$a */
        /* loaded from: classes5.dex */
        public static final class C26180a extends SuspendLambda implements Function2<ZC0, Continuation<? super Integer>, Object> {

            /* renamed from: h */
            public int f98625h;

            /* renamed from: i */
            public final /* synthetic */ HttpTransaction f98626i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26180a(HttpTransaction httpTransaction, Continuation<? super C26180a> continuation) {
                super(2, continuation);
                this.f98626i = httpTransaction;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C26180a(this.f98626i, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Integer> continuation) {
                return ((C26180a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f98625h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    NN1 m36551b = C42041hI4.f84975a.m36551b();
                    HttpTransaction httpTransaction = this.f98626i;
                    this.f98625h = 1;
                    obj = m36551b.mo94007d(httpTransaction, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26179c(HttpTransaction httpTransaction, Continuation<? super C26179c> continuation) {
            super(2, continuation);
            this.f98624j = httpTransaction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26179c(this.f98624j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C26179c) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f98622h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SC0 m84377b = T41.m84377b();
                C26180a c26180a = new C26180a(this.f98624j, null);
                this.f98622h = 1;
                obj = X30.m77504g(m84377b, c26180a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            int intValue = ((Number) obj).intValue();
            if (C45254mj0.this.m25142c() && intValue > 0) {
                C45254mj0.this.f98613c.m52963k(this.f98624j);
            }
            return Unit.INSTANCE;
        }
    }

    @JvmOverloads
    public C45254mj0(Context context, boolean z, KN4.EnumC4413b retentionPeriod) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(retentionPeriod, "retentionPeriod");
        this.f98611a = z;
        this.f98612b = new KN4(context, retentionPeriod);
        this.f98613c = new C17156a(context);
        this.f98614d = C37824aD0.m71789b();
        C42041hI4.f84975a.m36552a(context);
    }

    /* renamed from: c */
    public final boolean m25142c() {
        return this.f98611a;
    }

    /* renamed from: d */
    public final void m25141d(HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Z30.m73800d(this.f98614d, null, null, new C26176b(transaction, null), 3, null);
    }

    /* renamed from: e */
    public final void m25140e(HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Z30.m73800d(this.f98614d, null, null, new C26179c(transaction, null), 3, null);
    }

    /* renamed from: f */
    public final Uri m25139f(Context context, Long l, EnumC52359yi1 exportFormat) {
        InterfaceC33004Fy5 c51427x76;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exportFormat, "exportFormat");
        List<HttpTransaction> mo94002i = C42041hI4.f84975a.m36551b().mo94002i(l);
        if (mo94002i.isEmpty()) {
            return null;
        }
        int i = C26175a.$EnumSwitchMapping$0[exportFormat.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C46153oE1 m26933b = C44653li2.f96593a.m26933b();
                ZE1 ze1 = ZE1.f48010a;
                String string = context.getString(C38145al4.chucker_name);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.chucker_name)");
                String string2 = context.getString(C38145al4.chucker_version);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.chucker_version)");
                String m21545x = m26933b.m21545x(ze1.m73525a(mo94002i, new GE0(string, string2, null, 4, null)));
                Intrinsics.checkNotNullExpressionValue(m21545x, "JsonConverter.nonNullSer…                        )");
                c51427x76 = new A66(m21545x);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            c51427x76 = new C51427x76(mo94002i, false);
        }
        String m2889b = exportFormat.m2889b();
        return C33238Gy5.m104538d(c51427x76, context, "api_transactions." + m2889b);
    }

    public /* synthetic */ C45254mj0(Context context, boolean z, KN4.EnumC4413b enumC4413b, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z, (i & 4) != 0 ? KN4.EnumC4413b.ONE_WEEK : enumC4413b);
    }
}
