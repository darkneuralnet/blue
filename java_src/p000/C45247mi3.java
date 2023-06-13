package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireActivityLogShift;
import co.bird.android.model.wire.WireOperatorActivityLogDetails;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR3\u0010\u0013\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e0\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R:\u0010\u0018\u001a(\u0012$\u0012\"\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000bj\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r`\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R+\u0010\u001e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R$\u0010 \u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017¨\u0006'"}, m28432d2 = {"Lmi3;", "Lji3;", "Lgl;", C17296a.f69688o, "Lgl;", "preference", "Lom3;", "b", "Lom3;", "operatorManager", "LZ84;", "Ljava/util/HashMap;", "", "Lco/bird/android/model/wire/WireOperatorActivityLogDetails;", "Lco/bird/android/coreinterface/manager/ActivityLogDetailsMap;", "c", "Lkotlin/Lazy;", "getOperatorPerformanceActivityDetails", "()LZ84;", "operatorPerformanceActivityDetails", "La94;", "Lkotlin/collections/HashMap;", DateTokenConverter.CONVERTER_KEY, "La94;", "mutableDetailsRelay", "Ljava/util/ArrayList;", "Lco/bird/android/model/wire/WireActivityLogShift;", "Lco/bird/android/coreinterface/manager/ActivityLogHistoryList;", "e", "getOperatorPerformanceActivityShiftHistory", "operatorPerformanceActivityShiftHistory", "f", "mutableShiftHistoryRelay", "LRh6;", "userStream", "LTq4;", "reactiveConfig", "<init>", "(Lgl;Lom3;LRh6;LTq4;)V", "contractor_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorActivityLogManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorActivityLogManagerImpl.kt\nco/bird/android/manager/contractor/OperatorActivityLogManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,99:1\n180#2:100\n*S KotlinDebug\n*F\n+ 1 OperatorActivityLogManagerImpl.kt\nco/bird/android/manager/contractor/OperatorActivityLogManagerImpl\n*L\n42#1:100\n*E\n"})
/* renamed from: mi3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45247mi3 implements InterfaceC43468ji3 {

    /* renamed from: a */
    public final C22454gl f98586a;

    /* renamed from: b */
    public final InterfaceC46473om3 f98587b;

    /* renamed from: c */
    public final Lazy f98588c;

    /* renamed from: d */
    public final C37791a94<HashMap<String, WireOperatorActivityLogDetails>> f98589d;

    /* renamed from: e */
    public final Lazy f98590e;

    /* renamed from: f */
    public final C37791a94<ArrayList<WireActivityLogShift>> f98591f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mi3$a */
    /* loaded from: classes4.dex */
    public static final class C26170a extends Lambda implements Function1<User, Unit> {
        public C26170a() {
            super(1);
        }

        /* renamed from: a */
        public final void m25149a(User user) {
            C45247mi3.this.f98589d.m71836j();
            C45247mi3.this.f98591f.m71836j();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m25149a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mi3$b */
    /* loaded from: classes4.dex */
    public static final class C26171b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C26171b f98593g = new C26171b();

        public C26171b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aR\u0012N\u0012L\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003 \u0005*&\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00040\u0001j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003`\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LZ84;", "Ljava/util/HashMap;", "", "Lco/bird/android/model/wire/WireOperatorActivityLogDetails;", "Lkotlin/collections/HashMap;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mi3$c */
    /* loaded from: classes4.dex */
    public static final class C26172c extends Lambda implements Function0<Z84<HashMap<String, WireOperatorActivityLogDetails>>> {
        public C26172c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<HashMap<String, WireOperatorActivityLogDetails>> invoke() {
            return Z84.f47888d.m73663b(C45247mi3.this.f98589d);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a&\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0002 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\u0004\u0018\u0001`\u00030\u0001j\u0002`\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZ84;", "Ljava/util/ArrayList;", "Lco/bird/android/model/wire/WireActivityLogShift;", "Lco/bird/android/coreinterface/manager/ActivityLogHistoryList;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mi3$d */
    /* loaded from: classes4.dex */
    public static final class C26173d extends Lambda implements Function0<Z84<ArrayList<WireActivityLogShift>>> {
        public C26173d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<ArrayList<WireActivityLogShift>> invoke() {
            return Z84.f47888d.m73663b(C45247mi3.this.f98591f);
        }
    }

    public C45247mi3(C22454gl preference, InterfaceC46473om3 operatorManager, InterfaceC35660Rh6 userStream, C36207Tq4 reactiveConfig) {
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f98586a = preference;
        this.f98587b = operatorManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C26172c());
        this.f98588c = lazy;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        this.f98589d = C37791a94.C10586a.create$default(c10586a, new HashMap(), null, 2, null);
        lazy2 = LazyKt__LazyJVMKt.lazy(new C26173d());
        this.f98590e = lazy2;
        this.f98591f = C37791a94.C10586a.create$default(c10586a, new ArrayList(), null, 2, null);
        Observable<User> mo76576i = userStream.mo76576i();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26170a c26170a = new C26170a();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ki3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45247mi3.m25151c(Function1.this, obj);
            }
        };
        final C26171b c26171b = C26171b.f98593g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: li3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45247mi3.m25150d(Function1.this, obj);
            }
        });
    }

    /* renamed from: c */
    public static final void m25151c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d */
    public static final void m25150d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}
