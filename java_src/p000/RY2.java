package p000;

import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.p003ui.platform.C11411h;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C53061zt0;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aN\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m28432d2 = {"LOY2;", "navController", "", "startDestination", "LgV2;", "modifier", "route", "Lkotlin/Function1;", "LKY2;", "", "Lkotlin/ExtensionFunctionType;", "builder", "b", "(LOY2;Ljava/lang/String;LgV2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LEt0;II)V", "LJY2;", "graph", C17296a.f69688o, "(LOY2;LJY2;LgV2;LEt0;II)V", "navigation-compose_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: RY2 */
/* loaded from: classes.dex */
public final class RY2 {

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: RY2$a */
    /* loaded from: classes.dex */
    public static final class C7191a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OY2 f32163g;

        /* renamed from: h */
        public final /* synthetic */ String f32164h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f32165i;

        /* renamed from: j */
        public final /* synthetic */ String f32166j;

        /* renamed from: k */
        public final /* synthetic */ Function1<KY2, Unit> f32167k;

        /* renamed from: l */
        public final /* synthetic */ int f32168l;

        /* renamed from: m */
        public final /* synthetic */ int f32169m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7191a(OY2 oy2, String str, InterfaceC41563gV2 interfaceC41563gV2, String str2, Function1<? super KY2, Unit> function1, int i, int i2) {
            super(2);
            this.f32163g = oy2;
            this.f32164h = str;
            this.f32165i = interfaceC41563gV2;
            this.f32166j = str2;
            this.f32167k = function1;
            this.f32168l = i;
            this.f32169m = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            RY2.m86626b(this.f32163g, this.f32164h, this.f32165i, this.f32166j, this.f32167k, interfaceC32720Et0, this.f32168l | 1, this.f32169m);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: RY2$b */
    /* loaded from: classes.dex */
    public static final class C7192b extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ OY2 f32170g;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"RY2$b$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
        /* renamed from: RY2$b$a */
        /* loaded from: classes.dex */
        public static final class C7193a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ OY2 f32171a;

            public C7193a(OY2 oy2) {
                this.f32171a = oy2;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f32171a.mo92018r(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7192b(OY2 oy2) {
            super(1);
            this.f32170g = oy2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f32170g.mo92018r(true);
            return new C7193a(this.f32170g);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: RY2$c */
    /* loaded from: classes.dex */
    public static final class C7194c extends Lambda implements Function3<String, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EX2<Boolean> f32172g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48627sP5<List<AY2>> f32173h;

        /* renamed from: i */
        public final /* synthetic */ C53061zt0 f32174i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC32626Ei5 f32175j;

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: RY2$c$a */
        /* loaded from: classes.dex */
        public static final class C7195a extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

            /* renamed from: g */
            public final /* synthetic */ EX2<Boolean> f32176g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC48627sP5<List<AY2>> f32177h;

            /* renamed from: i */
            public final /* synthetic */ C53061zt0 f32178i;

            @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"RY2$c$a$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 6, 0})
            /* renamed from: RY2$c$a$a */
            /* loaded from: classes.dex */
            public static final class C7196a implements InterfaceC44288l51 {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC48627sP5 f32179a;

                /* renamed from: b */
                public final /* synthetic */ C53061zt0 f32180b;

                public C7196a(InterfaceC48627sP5 interfaceC48627sP5, C53061zt0 c53061zt0) {
                    this.f32179a = interfaceC48627sP5;
                    this.f32180b = c53061zt0;
                }

                @Override // p000.InterfaceC44288l51
                public void dispose() {
                    for (AY2 ay2 : RY2.m86625c(this.f32179a)) {
                        this.f32180b.m169m(ay2);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C7195a(EX2<Boolean> ex2, InterfaceC48627sP5<? extends List<AY2>> interfaceC48627sP5, C53061zt0 c53061zt0) {
                super(1);
                this.f32176g = ex2;
                this.f32177h = interfaceC48627sP5;
                this.f32178i = c53061zt0;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                if (RY2.m86624d(this.f32176g)) {
                    C53061zt0 c53061zt0 = this.f32178i;
                    for (AY2 ay2 : RY2.m86625c(this.f32177h)) {
                        c53061zt0.m169m(ay2);
                    }
                    RY2.m86623e(this.f32176g, false);
                }
                return new C7196a(this.f32177h, this.f32178i);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: RY2$c$b */
        /* loaded from: classes.dex */
        public static final class C7197b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AY2 f32181g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7197b(AY2 ay2) {
                super(2);
                this.f32181g = ay2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                } else {
                    ((C53061zt0.C31587b) this.f32181g.m115582f()).m168F().invoke(this.f32181g, interfaceC32720Et0, 8);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7194c(EX2<Boolean> ex2, InterfaceC48627sP5<? extends List<AY2>> interfaceC48627sP5, C53061zt0 c53061zt0, InterfaceC32626Ei5 interfaceC32626Ei5) {
            super(3);
            this.f32172g = ex2;
            this.f32173h = interfaceC48627sP5;
            this.f32174i = c53061zt0;
            this.f32175j = interfaceC32626Ei5;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(str, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(String it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Object obj;
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 14) == 0) {
                i |= interfaceC32720Et0.mo89539n(it) ? 4 : 2;
            }
            if ((i & 91) == 18 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            List m86625c = RY2.m86625c(this.f32173h);
            ListIterator listIterator = m86625c.listIterator(m86625c.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (Intrinsics.areEqual(it, ((AY2) obj).m115581g())) {
                    break;
                }
            }
            AY2 ay2 = (AY2) obj;
            Unit unit = Unit.INSTANCE;
            EX2<Boolean> ex2 = this.f32172g;
            InterfaceC48627sP5<List<AY2>> interfaceC48627sP5 = this.f32173h;
            C53061zt0 c53061zt0 = this.f32174i;
            interfaceC32720Et0.mo89638F(-3686095);
            boolean mo89539n = interfaceC32720Et0.mo89539n(ex2) | interfaceC32720Et0.mo89539n(interfaceC48627sP5) | interfaceC32720Et0.mo89539n(c53061zt0);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C7195a(ex2, interfaceC48627sP5, c53061zt0);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            Y91.m75536c(unit, (Function1) mo89635G, interfaceC32720Et0, 0);
            if (ay2 == null) {
                return;
            }
            BY2.m113878a(ay2, this.f32175j, C43575jt0.m29791b(interfaceC32720Et0, -631736544, true, new C7197b(ay2)), interfaceC32720Et0, 456);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: RY2$d */
    /* loaded from: classes.dex */
    public static final class C7198d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OY2 f32182g;

        /* renamed from: h */
        public final /* synthetic */ JY2 f32183h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f32184i;

        /* renamed from: j */
        public final /* synthetic */ int f32185j;

        /* renamed from: k */
        public final /* synthetic */ int f32186k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7198d(OY2 oy2, JY2 jy2, InterfaceC41563gV2 interfaceC41563gV2, int i, int i2) {
            super(2);
            this.f32182g = oy2;
            this.f32183h = jy2;
            this.f32184i = interfaceC41563gV2;
            this.f32185j = i;
            this.f32186k = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            RY2.m86627a(this.f32182g, this.f32183h, this.f32184i, interfaceC32720Et0, this.f32185j | 1, this.f32186k);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: RY2$e */
    /* loaded from: classes.dex */
    public static final class C7199e extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OY2 f32187g;

        /* renamed from: h */
        public final /* synthetic */ JY2 f32188h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f32189i;

        /* renamed from: j */
        public final /* synthetic */ int f32190j;

        /* renamed from: k */
        public final /* synthetic */ int f32191k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7199e(OY2 oy2, JY2 jy2, InterfaceC41563gV2 interfaceC41563gV2, int i, int i2) {
            super(2);
            this.f32187g = oy2;
            this.f32188h = jy2;
            this.f32189i = interfaceC41563gV2;
            this.f32190j = i;
            this.f32191k = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            RY2.m86627a(this.f32187g, this.f32188h, this.f32189i, interfaceC32720Et0, this.f32190j | 1, this.f32191k);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: RY2$f */
    /* loaded from: classes.dex */
    public static final class C7200f extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OY2 f32192g;

        /* renamed from: h */
        public final /* synthetic */ JY2 f32193h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f32194i;

        /* renamed from: j */
        public final /* synthetic */ int f32195j;

        /* renamed from: k */
        public final /* synthetic */ int f32196k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7200f(OY2 oy2, JY2 jy2, InterfaceC41563gV2 interfaceC41563gV2, int i, int i2) {
            super(2);
            this.f32192g = oy2;
            this.f32193h = jy2;
            this.f32194i = interfaceC41563gV2;
            this.f32195j = i;
            this.f32196k = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            RY2.m86627a(this.f32192g, this.f32193h, this.f32194i, interfaceC32720Et0, this.f32195j | 1, this.f32196k);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: RY2$g */
    /* loaded from: classes.dex */
    public static final class C7201g implements InterfaceC32730Eu1<List<? extends AY2>> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f32197b;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: RY2$g$a */
        /* loaded from: classes.dex */
        public static final class C7202a<T> implements InterfaceC33198Gu1, SuspendFunction {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f32198b;

            @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "androidx.navigation.compose.NavHostKt$NavHost$lambda-4$$inlined$map$1$2", m28418f = "NavHost.kt", m28417i = {}, m28416l = {224}, m28415m = "emit", m28414n = {}, m28413s = {})
            /* renamed from: RY2$g$a$a */
            /* loaded from: classes.dex */
            public static final class C7203a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f32199h;

                /* renamed from: i */
                public int f32200i;

                public C7203a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f32199h = obj;
                    this.f32200i |= Integer.MIN_VALUE;
                    return C7202a.this.emit(null, this);
                }
            }

            public C7202a(InterfaceC33198Gu1 interfaceC33198Gu1) {
                this.f32198b = interfaceC33198Gu1;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C7203a c7203a;
                Object coroutine_suspended;
                int i;
                if (continuation instanceof C7203a) {
                    c7203a = (C7203a) continuation;
                    int i2 = c7203a.f32200i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c7203a.f32200i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c7203a.f32199h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c7203a.f32200i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f32198b;
                            ArrayList arrayList = new ArrayList();
                            for (T t : (List) obj) {
                                if (Intrinsics.areEqual(((AY2) t).m115582f().m103773u(), "composable")) {
                                    arrayList.add(t);
                                }
                            }
                            c7203a.f32200i = 1;
                            if (interfaceC33198Gu1.emit(arrayList, c7203a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c7203a = new C7203a(continuation);
                Object obj22 = c7203a.f32199h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c7203a.f32200i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C7201g(InterfaceC32730Eu1 interfaceC32730Eu1) {
            this.f32197b = interfaceC32730Eu1;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1<? super List<? extends AY2>> interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f32197b.collect(new C7202a(interfaceC33198Gu1), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final void m86627a(OY2 navController, JY2 graph, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        C53061zt0 c53061zt0;
        List emptyList;
        Object lastOrNull;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(graph, "graph");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-957014592);
        if ((i2 & 4) != 0) {
            interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) mo89518u.mo89572c(C11411h.m68322i());
        InterfaceC37154Xr6 m18429a = C47155pv2.f104319a.m18429a(mo89518u, 8);
        if (m18429a != null) {
            InterfaceC39270cf3 m31645a = C43004iv2.f91709a.m31645a(mo89518u, 8);
            C51382x31 c51382x31 = null;
            if (m31645a != null) {
                onBackPressedDispatcher = m31645a.getOnBackPressedDispatcher();
            } else {
                onBackPressedDispatcher = null;
            }
            navController.mo92021h0(lifecycleOwner);
            C36920Wr6 viewModelStore = m18429a.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStoreOwner.viewModelStore");
            navController.mo92019j0(viewModelStore);
            if (onBackPressedDispatcher != null) {
                navController.mo92020i0(onBackPressedDispatcher);
            }
            Y91.m75536c(navController, new C7192b(navController), mo89518u, 8);
            navController.m110224f0(graph);
            InterfaceC32626Ei5 m104873a = C33094Gi5.m104873a(mo89518u, 0);
            AbstractC39507d13 m35381e = navController.m110257E().m35381e("composable");
            if (m35381e instanceof C53061zt0) {
                c53061zt0 = (C53061zt0) m35381e;
            } else {
                c53061zt0 = null;
            }
            if (c53061zt0 == null) {
                InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new C7199e(navController, graph, interfaceC41563gV2, i, i2));
                    return;
                }
                return;
            }
            InterfaceC49220tP5<List<AY2>> m110255G = navController.m110255G();
            mo89518u.mo89638F(-3686930);
            boolean mo89539n = mo89518u.mo89539n(m110255G);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C7201g(navController.m110255G());
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            InterfaceC48627sP5 m105206a = GM5.m105206a((InterfaceC32730Eu1) mo89635G, emptyList, null, mo89518u, 8, 2);
            lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) m86625c(m105206a));
            AY2 ay2 = (AY2) lastOrNull;
            mo89518u.mo89638F(-3687241);
            Object mo89635G2 = mo89518u.mo89635G();
            if (mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G2 = LM5.m97025e(Boolean.TRUE, null, 2, null);
                mo89518u.mo89503z(mo89635G2);
            }
            mo89518u.mo89605Q();
            EX2 ex2 = (EX2) mo89635G2;
            mo89518u.mo89638F(1822173528);
            if (ay2 != null) {
                SE0.m85819b(ay2.m115581g(), interfaceC41563gV2, null, C43575jt0.m29791b(mo89518u, 1319254703, true, new C7194c(ex2, m105206a, c53061zt0, m104873a)), mo89518u, ((i >> 3) & 112) | 3072, 4);
            }
            mo89518u.mo89605Q();
            AbstractC39507d13 m35381e2 = navController.m110257E().m35381e("dialog");
            if (m35381e2 instanceof C51382x31) {
                c51382x31 = (C51382x31) m35381e2;
            }
            if (c51382x31 == null) {
                InterfaceC36874Wm5 mo89512w2 = mo89518u.mo89512w();
                if (mo89512w2 != null) {
                    mo89512w2.mo20405a(new C7200f(navController, graph, interfaceC41563gV2, i, i2));
                    return;
                }
                return;
            }
            C47826r31.m16565a(c51382x31, mo89518u, 0);
            InterfaceC36874Wm5 mo89512w3 = mo89518u.mo89512w();
            if (mo89512w3 != null) {
                mo89512w3.mo20405a(new C7198d(navController, graph, interfaceC41563gV2, i, i2));
                return;
            }
            return;
        }
        throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString());
    }

    /* renamed from: b */
    public static final void m86626b(OY2 navController, String startDestination, InterfaceC41563gV2 interfaceC41563gV2, String str, Function1<? super KY2, Unit> builder, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        InterfaceC41563gV2 interfaceC41563gV22;
        String str2;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(141827520);
        if ((i2 & 4) != 0) {
            interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
        } else {
            interfaceC41563gV22 = interfaceC41563gV2;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        mo89518u.mo89638F(-3686095);
        boolean mo89539n = mo89518u.mo89539n(str2) | mo89518u.mo89539n(startDestination) | mo89518u.mo89539n(builder);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            KY2 ky2 = new KY2(navController.m110257E(), startDestination, str2);
            builder.invoke(ky2);
            mo89635G = ky2.m98781d();
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        m86627a(navController, (JY2) mo89635G, interfaceC41563gV22, mo89518u, (i & 896) | 72, 0);
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C7191a(navController, startDestination, interfaceC41563gV22, str2, builder, i, i2));
        }
    }

    /* renamed from: c */
    public static final List<AY2> m86625c(InterfaceC48627sP5<? extends List<AY2>> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    /* renamed from: d */
    public static final boolean m86624d(EX2<Boolean> ex2) {
        return ex2.getValue().booleanValue();
    }

    /* renamed from: e */
    public static final void m86623e(EX2<Boolean> ex2, boolean z) {
        ex2.setValue(Boolean.valueOf(z));
    }
}
