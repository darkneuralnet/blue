package p000;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32758Ex2;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0002\u000b\u0003B\u001b\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J\u0013\u0010\u0003\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u001b\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"LKN4;", "", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fallback", "c", "time", "h", "threshold", C17296a.f69688o, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "now", "", "f", "e", "LKN4$b;", "period", "g", "J", "cleanupFrequency", "Landroid/content/SharedPreferences;", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()Landroid/content/SharedPreferences;", "prefs", "LSX2;", "LSX2;", "maintenanceMutex", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "retentionPeriod", "<init>", "(Landroid/content/Context;LKN4$b;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRetentionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetentionManager.kt\ncom/chuckerteam/chucker/api/RetentionManager\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,107:1\n107#2,10:108\n39#3,12:118\n*S KotlinDebug\n*F\n+ 1 RetentionManager.kt\ncom/chuckerteam/chucker/api/RetentionManager\n*L\n47#1:108,10\n67#1:118,12\n*E\n"})
/* renamed from: KN4 */
/* loaded from: classes5.dex */
public final class KN4 {

    /* renamed from: e */
    public static final C4412a f19508e = new C4412a(null);

    /* renamed from: f */
    public static long f19509f;

    /* renamed from: a */
    public final long f19510a;

    /* renamed from: b */
    public final long f19511b;

    /* renamed from: c */
    public final Lazy f19512c;

    /* renamed from: d */
    public final SX2 f19513d;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LKN4$a;", "", "", "KEY_LAST_CLEANUP", "Ljava/lang/String;", "PREFS_NAME", "", "lastCleanup", "J", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: KN4$a */
    /* loaded from: classes5.dex */
    public static final class C4412a {
        public /* synthetic */ C4412a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4412a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"LKN4$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: KN4$b */
    /* loaded from: classes5.dex */
    public enum EnumC4413b {
        ONE_HOUR,
        ONE_DAY,
        ONE_WEEK,
        FOREVER
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: KN4$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C4414c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC4413b.values().length];
            try {
                iArr[EnumC4413b.ONE_HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4413b.ONE_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4413b.ONE_WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4413b.FOREVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.api.RetentionManager", m28418f = "RetentionManager.kt", m28417i = {0, 0, 1, 1, 1}, m28416l = {113, 52}, m28415m = "doMaintenance$com_github_ChuckerTeam_Chucker_library", m28414n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "now"}, m28413s = {"L$0", "L$1", "L$0", "L$1", "J$0"})
    /* renamed from: KN4$d */
    /* loaded from: classes5.dex */
    public static final class C4415d extends ContinuationImpl {

        /* renamed from: h */
        public Object f19519h;

        /* renamed from: i */
        public Object f19520i;

        /* renamed from: j */
        public long f19521j;

        /* renamed from: k */
        public /* synthetic */ Object f19522k;

        /* renamed from: m */
        public int f19524m;

        public C4415d(Continuation<? super C4415d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19522k = obj;
            this.f19524m |= Integer.MIN_VALUE;
            return KN4.this.m98951b(this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: KN4$e */
    /* loaded from: classes5.dex */
    public static final class C4416e extends Lambda implements Function0<SharedPreferences> {

        /* renamed from: g */
        public final /* synthetic */ Context f19525g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4416e(Context context) {
            super(0);
            this.f19525g = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return this.f19525g.getSharedPreferences("chucker_preferences", 0);
        }
    }

    @JvmOverloads
    public KN4(Context context, EnumC4413b retentionPeriod) {
        Lazy lazy;
        long millis;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(retentionPeriod, "retentionPeriod");
        this.f19510a = m98946g(retentionPeriod);
        lazy = LazyKt__LazyJVMKt.lazy(new C4416e(context));
        this.f19512c = lazy;
        this.f19513d = UX2.m81380b(false, 1, null);
        if (retentionPeriod == EnumC4413b.ONE_HOUR) {
            millis = TimeUnit.MINUTES.toMillis(30L);
        } else {
            millis = TimeUnit.HOURS.toMillis(2L);
        }
        this.f19511b = millis;
    }

    /* renamed from: a */
    public final Object m98952a(long j, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object mo94008c = C42041hI4.f84975a.m36551b().mo94008c(j, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mo94008c == coroutine_suspended ? mo94008c : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:24:0x0062, B:26:0x006a, B:28:0x0074), top: B:43:0x0062 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m98951b(Continuation<? super Unit> continuation) {
        C4415d c4415d;
        Object coroutine_suspended;
        int i;
        SX2 sx2;
        KN4 kn4;
        SX2 sx22;
        Throwable th;
        KN4 kn42;
        long j;
        try {
            if (continuation instanceof C4415d) {
                c4415d = (C4415d) continuation;
                int i2 = c4415d.f19524m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4415d.f19524m = i2 - Integer.MIN_VALUE;
                    Object obj = c4415d.f19522k;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4415d.f19524m;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                j = c4415d.f19521j;
                                sx22 = (SX2) c4415d.f19520i;
                                kn42 = (KN4) c4415d.f19519h;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    kn42.m98945h(j);
                                    Unit unit = Unit.INSTANCE;
                                    sx22.mo83451b(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sx22.mo83451b(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kn4 = (KN4) c4415d.f19519h;
                        ResultKt.throwOnFailure(obj);
                        sx2 = (SX2) c4415d.f19520i;
                    } else {
                        ResultKt.throwOnFailure(obj);
                        sx2 = this.f19513d;
                        c4415d.f19519h = this;
                        c4415d.f19520i = sx2;
                        c4415d.f19524m = 1;
                        if (sx2.mo83452a(null, c4415d) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kn4 = this;
                    }
                    if (kn4.f19510a > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (kn4.m98947f(currentTimeMillis)) {
                            InterfaceC32758Ex2.C2028b.m108184b(InterfaceC32758Ex2.f8338a, "Performing data retention maintenance...", null, 2, null);
                            long m98948e = kn4.m98948e(currentTimeMillis);
                            c4415d.f19519h = kn4;
                            c4415d.f19520i = sx2;
                            c4415d.f19521j = currentTimeMillis;
                            c4415d.f19524m = 2;
                            if (kn4.m98952a(m98948e, c4415d) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            kn42 = kn4;
                            j = currentTimeMillis;
                            sx22 = sx2;
                            kn42.m98945h(j);
                            Unit unit2 = Unit.INSTANCE;
                            sx22.mo83451b(null);
                            return Unit.INSTANCE;
                        }
                    }
                    sx22 = sx2;
                    Unit unit22 = Unit.INSTANCE;
                    sx22.mo83451b(null);
                    return Unit.INSTANCE;
                }
            }
            if (kn4.f19510a > 0) {
            }
            sx22 = sx2;
            Unit unit222 = Unit.INSTANCE;
            sx22.mo83451b(null);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            sx22 = sx2;
            th = th3;
            sx22.mo83451b(null);
            throw th;
        }
        c4415d = new C4415d(continuation);
        Object obj2 = c4415d.f19522k;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4415d.f19524m;
        if (i == 0) {
        }
    }

    /* renamed from: c */
    public final long m98950c(long j) {
        if (f19509f == 0) {
            f19509f = m98949d().getLong("last_cleanup", j);
        }
        return f19509f;
    }

    /* renamed from: d */
    public final SharedPreferences m98949d() {
        Object value = this.f19512c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-prefs>(...)");
        return (SharedPreferences) value;
    }

    /* renamed from: e */
    public final long m98948e(long j) {
        long j2 = this.f19510a;
        return j2 == 0 ? j : j - j2;
    }

    /* renamed from: f */
    public final boolean m98947f(long j) {
        return j - m98950c(j) > this.f19511b;
    }

    /* renamed from: g */
    public final long m98946g(EnumC4413b enumC4413b) {
        int i = C4414c.$EnumSwitchMapping$0[enumC4413b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return 0L;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return TimeUnit.DAYS.toMillis(7L);
            }
            return TimeUnit.DAYS.toMillis(1L);
        }
        return TimeUnit.HOURS.toMillis(1L);
    }

    /* renamed from: h */
    public final void m98945h(long j) {
        f19509f = j;
        SharedPreferences.Editor editor = m98949d().edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putLong("last_cleanup", j);
        editor.apply();
    }
}
