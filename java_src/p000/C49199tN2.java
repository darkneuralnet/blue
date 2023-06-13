package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a3\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\u000e\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0001\u0010\u000b*\u00020\n*\u00028\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aY\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\f\"\u000e\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0001\u0010\u000b*\u00020\n\"\u0004\b\u0002\u0010\u000f*\u00028\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aM\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\f\"\u000e\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0001\u0010\u000b*\u00020\n\"\u0004\b\u0002\u0010\u0016*\u00028\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/activity/ComponentActivity;", "f", "Landroid/view/View;", "view", "Landroidx/fragment/app/Fragment;", "g", "LRN2;", "VM", "LAN2;", "S", "LsP5;", "b", "(LRN2;LEt0;I)LsP5;", "O", "", "key", "Lkotlin/Function1;", "mapper", "c", "(LRN2;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;", "A", "Lkotlin/reflect/KProperty1;", "prop1", DateTokenConverter.CONVERTER_KEY, "(LRN2;Lkotlin/reflect/KProperty1;LEt0;I)LsP5;", "mvrx-compose_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: tN2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49199tN2 {

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: tN2$a */
    /* loaded from: classes2.dex */
    public static final class C28686a extends Lambda implements Function1<S, S> {

        /* renamed from: g */
        public static final C28686a f110346g = new C28686a();

        public C28686a() {
            super(1);
        }

        /* JADX WARN: Incorrect return type in method signature: (TS;)TS; */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AN2 invoke(AN2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: tN2$b */
    /* loaded from: classes2.dex */
    public static final class C28687b extends Lambda implements Function1<S, O> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48627sP5<Function1<S, O>> f110347g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28687b(InterfaceC48627sP5<? extends Function1<? super S, ? extends O>> interfaceC48627sP5) {
            super(1);
            this.f110347g = interfaceC48627sP5;
        }

        /* JADX WARN: Incorrect types in method signature: (TS;)TO; */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(AN2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C49199tN2.m12478e(this.f110347g).invoke(it);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: tN2$c */
    /* loaded from: classes2.dex */
    public static final class C28688c extends Lambda implements Function1<S, A> {

        /* renamed from: g */
        public final /* synthetic */ KProperty1<S, A> f110348g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28688c(KProperty1<S, ? extends A> kProperty1) {
            super(1);
            this.f110348g = kProperty1;
        }

        /* JADX WARN: Incorrect types in method signature: (TS;)TA; */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(AN2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f110348g.get(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: tN2$d */
    /* loaded from: classes2.dex */
    public static final class C28689d implements InterfaceC32730Eu1<O> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f110349b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC48627sP5 f110350c;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: tN2$d$a */
        /* loaded from: classes2.dex */
        public static final class C28690a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f110351b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC48627sP5 f110352c;

            @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
            @DebugMetadata(m28419c = "com.airbnb.mvrx.compose.MavericksComposeExtensionsKt$collectAsState$lambda-6$$inlined$map$1$2", m28418f = "MavericksComposeExtensions.kt", m28417i = {}, m28416l = {224}, m28415m = "emit", m28414n = {}, m28413s = {})
            /* renamed from: tN2$d$a$a */
            /* loaded from: classes2.dex */
            public static final class C28691a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f110353h;

                /* renamed from: i */
                public int f110354i;

                public C28691a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f110353h = obj;
                    this.f110354i |= Integer.MIN_VALUE;
                    return C28690a.this.emit(null, this);
                }
            }

            public C28690a(InterfaceC33198Gu1 interfaceC33198Gu1, InterfaceC48627sP5 interfaceC48627sP5) {
                this.f110351b = interfaceC33198Gu1;
                this.f110352c = interfaceC48627sP5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C28691a c28691a;
                Object coroutine_suspended;
                int i;
                if (continuation instanceof C28691a) {
                    c28691a = (C28691a) continuation;
                    int i2 = c28691a.f110354i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c28691a.f110354i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c28691a.f110353h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c28691a.f110354i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f110351b;
                            Object invoke = C49199tN2.m12478e(this.f110352c).invoke((AN2) obj);
                            c28691a.f110354i = 1;
                            if (interfaceC33198Gu1.emit(invoke, c28691a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c28691a = new C28691a(continuation);
                Object obj22 = c28691a.f110353h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c28691a.f110354i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C28689d(InterfaceC32730Eu1 interfaceC32730Eu1, InterfaceC48627sP5 interfaceC48627sP5) {
            this.f110349b = interfaceC32730Eu1;
            this.f110350c = interfaceC48627sP5;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f110349b.collect(new C28690a(interfaceC33198Gu1, this.f110350c), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: tN2$e */
    /* loaded from: classes2.dex */
    public static final class C28692e implements InterfaceC32730Eu1<A> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f110356b;

        /* renamed from: c */
        public final /* synthetic */ KProperty1 f110357c;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: tN2$e$a */
        /* loaded from: classes2.dex */
        public static final class C28693a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC33198Gu1 f110358b;

            /* renamed from: c */
            public final /* synthetic */ KProperty1 f110359c;

            @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
            @DebugMetadata(m28419c = "com.airbnb.mvrx.compose.MavericksComposeExtensionsKt$collectAsState$lambda-9$$inlined$map$1$2", m28418f = "MavericksComposeExtensions.kt", m28417i = {}, m28416l = {224}, m28415m = "emit", m28414n = {}, m28413s = {})
            /* renamed from: tN2$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C28694a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f110360h;

                /* renamed from: i */
                public int f110361i;

                public C28694a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f110360h = obj;
                    this.f110361i |= Integer.MIN_VALUE;
                    return C28693a.this.emit(null, this);
                }
            }

            public C28693a(InterfaceC33198Gu1 interfaceC33198Gu1, KProperty1 kProperty1) {
                this.f110358b = interfaceC33198Gu1;
                this.f110359c = kProperty1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // p000.InterfaceC33198Gu1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C28694a c28694a;
                Object coroutine_suspended;
                int i;
                if (continuation instanceof C28694a) {
                    c28694a = (C28694a) continuation;
                    int i2 = c28694a.f110361i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c28694a.f110361i = i2 - Integer.MIN_VALUE;
                        Object obj2 = c28694a.f110360h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c28694a.f110361i;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC33198Gu1 interfaceC33198Gu1 = this.f110358b;
                            Object obj3 = this.f110359c.get((AN2) obj);
                            c28694a.f110361i = 1;
                            if (interfaceC33198Gu1.emit(obj3, c28694a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c28694a = new C28694a(continuation);
                Object obj22 = c28694a.f110360h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c28694a.f110361i;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C28692e(InterfaceC32730Eu1 interfaceC32730Eu1, KProperty1 kProperty1) {
            this.f110356b = interfaceC32730Eu1;
            this.f110357c = kProperty1;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f110356b.collect(new C28693a(interfaceC33198Gu1, this.f110357c), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public static final <VM extends RN2<S>, S extends AN2> InterfaceC48627sP5<S> m12481b(VM vm, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(vm, "<this>");
        interfaceC32720Et0.mo89638F(-743162186);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-743162186, i, -1, "com.airbnb.mvrx.compose.collectAsState (MavericksComposeExtensions.kt:137)");
        }
        InterfaceC48627sP5<S> m105206a = GM5.m105206a(vm.getStateFlow(), C36686Vr6.m79329a(vm, C28686a.f110346g), null, interfaceC32720Et0, 8, 2);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105206a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Et0] */
    /* renamed from: c */
    public static final <VM extends RN2<S>, S extends AN2, O> InterfaceC48627sP5<O> m12480c(VM vm, Object obj, Function1<? super S, ? extends O> mapper, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(vm, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        interfaceC32720Et0.mo89638F(117312913);
        if ((i2 & 1) != 0) {
            obj = Unit.INSTANCE;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(117312913, i, -1, "com.airbnb.mvrx.compose.collectAsState (MavericksComposeExtensions.kt:151)");
        }
        InterfaceC48627sP5 m105193n = GM5.m105193n(mapper, interfaceC32720Et0, (i >> 6) & 14);
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(obj);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = C36708Vu1.m79255p(new C28689d(vm.getStateFlow(), m105193n));
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC32730Eu1 interfaceC32730Eu1 = mo89635G;
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n2 = interfaceC32720Et0.mo89539n(m105193n);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new C28687b(m105193n);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC48627sP5<O> m105206a = GM5.m105206a(interfaceC32730Eu1, C36686Vr6.m79329a(vm, (Function1) mo89635G2), null, interfaceC32720Et0, 8, 2);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105206a;
    }

    /* renamed from: d */
    public static final <VM extends RN2<S>, S extends AN2, A> InterfaceC48627sP5<A> m12479d(VM vm, KProperty1<S, ? extends A> prop1, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(vm, "<this>");
        Intrinsics.checkNotNullParameter(prop1, "prop1");
        interfaceC32720Et0.mo89638F(-1063268123);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1063268123, i, -1, "com.airbnb.mvrx.compose.collectAsState (MavericksComposeExtensions.kt:163)");
        }
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(prop1);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = C36708Vu1.m79255p(new C28692e(vm.getStateFlow(), prop1));
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC48627sP5<A> m105206a = GM5.m105206a((InterfaceC32730Eu1) mo89635G, C36686Vr6.m79329a(vm, new C28688c(prop1)), null, interfaceC32720Et0, 8, 2);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105206a;
    }

    /* renamed from: e */
    public static final <S extends AN2, O> Function1<S, O> m12478e(InterfaceC48627sP5<? extends Function1<? super S, ? extends O>> interfaceC48627sP5) {
        return (Function1) ((Function1<? super S, ? extends O>) interfaceC48627sP5.getValue());
    }

    /* renamed from: f */
    public static final ComponentActivity m12477f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context instanceof ComponentActivity) {
            return (ComponentActivity) context;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                return (ComponentActivity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "currentContext.baseContext");
        }
        return null;
    }

    /* renamed from: g */
    public static final Fragment m12476g(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            return FragmentManager.m67328k0(view);
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
