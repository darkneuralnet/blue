package p000;

import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\\\u0010\u0010\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aj\u0010\u0014\u001a\u00020\r\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001ah\u0010\u0017\u001a\u00020\r\"\u0004\b\u0000\u0010\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u001b\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0019\u001a\u00028\u0000H\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m28432d2 = {"LPm0;", "", "visible", "LgV2;", "modifier", "LZe1;", "enter", "Lgi1;", "exit", "", "label", "Lkotlin/Function1;", "LTe;", "", "Lkotlin/ExtensionFunctionType;", "content", "b", "(LPm0;ZLgV2;LZe1;Lgi1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;LEt0;II)V", "T", "LF96;", "c", "(LF96;Lkotlin/jvm/functions/Function1;LgV2;LZe1;Lgi1;Lkotlin/jvm/functions/Function3;LEt0;II)V", "transition", C17296a.f69688o, "(LF96;Lkotlin/jvm/functions/Function1;LgV2;LZe1;Lgi1;Lkotlin/jvm/functions/Function3;LEt0;I)V", "targetState", "LXe1;", "e", "(LF96;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;LEt0;I)LXe1;", "animation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,863:1\n775#1,4:898\n781#1,2:909\n779#1:912\n780#1:939\n785#1:944\n25#2:864\n36#2:872\n36#2:880\n50#2:890\n49#2:891\n36#2:902\n25#2:911\n460#2,13:926\n473#2,3:940\n36#2:945\n25#2:952\n460#2,16:972\n25#2:989\n1057#3,6:865\n1057#3,6:873\n1057#3,6:881\n1057#3,6:892\n1057#3,6:903\n1057#3,6:946\n1057#3,6:953\n1057#3,6:990\n1#4:871\n786#5:879\n787#5,3:887\n75#6:913\n76#6,11:915\n89#6:943\n75#6:959\n76#6,11:961\n89#6:988\n76#7:914\n76#7:960\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n*L\n753#1:898,4\n753#1:909,2\n753#1:912\n753#1:939\n753#1:944\n710#1:864\n735#1:872\n740#1:880\n744#1:890\n744#1:891\n753#1:902\n753#1:911\n753#1:926,13\n753#1:940,3\n778#1:945\n782#1:952\n779#1:972,16\n847#1:989\n710#1:865,6\n735#1:873,6\n740#1:881,6\n744#1:892,6\n753#1:903,6\n778#1:946,6\n782#1:953,6\n847#1:990,6\n740#1:879\n740#1:887,3\n753#1:913\n753#1:915,11\n753#1:943\n779#1:959\n779#1:961,11\n779#1:988\n753#1:914\n779#1:960\n*E\n"})
/* renamed from: Se */
/* loaded from: classes.dex */
public final class C7489Se {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", m28418f = "AnimatedVisibility.kt", m28417i = {}, m28416l = {748}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Se$a */
    /* loaded from: classes.dex */
    public static final class C7490a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f33985h;

        /* renamed from: i */
        public final /* synthetic */ F96<EnumC37032Xe1> f33986i;

        /* renamed from: j */
        public final /* synthetic */ EX2<Boolean> f33987j;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Se$a$a */
        /* loaded from: classes.dex */
        public static final class C7491a extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ F96<EnumC37032Xe1> f33988g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7491a(F96<EnumC37032Xe1> f96) {
                super(0);
                this.f33988g = f96;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                EnumC37032Xe1 m107535g = this.f33988g.m107535g();
                EnumC37032Xe1 enumC37032Xe1 = EnumC37032Xe1.Visible;
                return Boolean.valueOf(m107535g == enumC37032Xe1 || this.f33988g.m107529m() == enumC37032Xe1);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Se$a$b */
        /* loaded from: classes.dex */
        public static final class C7492b implements InterfaceC33198Gu1<Boolean> {

            /* renamed from: b */
            public final /* synthetic */ EX2<Boolean> f33989b;

            public C7492b(EX2<Boolean> ex2) {
                this.f33989b = ex2;
            }

            /* renamed from: c */
            public final Object m85169c(boolean z, Continuation<? super Unit> continuation) {
                this.f33989b.setValue(Boxing.boxBoolean(z));
                return Unit.INSTANCE;
            }

            @Override // p000.InterfaceC33198Gu1
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                return m85169c(bool.booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7490a(F96<EnumC37032Xe1> f96, EX2<Boolean> ex2, Continuation<? super C7490a> continuation) {
            super(2, continuation);
            this.f33986i = f96;
            this.f33987j = ex2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C7490a(this.f33986i, this.f33987j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C7490a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f33985h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC32730Eu1 m105192o = GM5.m105192o(new C7491a(this.f33986i));
                C7492b c7492b = new C7492b(this.f33987j);
                this.f33985h = 1;
                if (m105192o.collect(c7492b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Se$b */
    /* loaded from: classes.dex */
    public static final class C7493b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ F96<T> f33990g;

        /* renamed from: h */
        public final /* synthetic */ Function1<T, Boolean> f33991h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f33992i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC37500Ze1 f33993j;

        /* renamed from: k */
        public final /* synthetic */ AbstractC41687gi1 f33994k;

        /* renamed from: l */
        public final /* synthetic */ Function3<InterfaceC7907Te, InterfaceC32720Et0, Integer, Unit> f33995l;

        /* renamed from: m */
        public final /* synthetic */ int f33996m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7493b(F96<T> f96, Function1<? super T, Boolean> function1, InterfaceC41563gV2 interfaceC41563gV2, AbstractC37500Ze1 abstractC37500Ze1, AbstractC41687gi1 abstractC41687gi1, Function3<? super InterfaceC7907Te, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
            super(2);
            this.f33990g = f96;
            this.f33991h = function1;
            this.f33992i = interfaceC41563gV2;
            this.f33993j = abstractC37500Ze1;
            this.f33994k = abstractC41687gi1;
            this.f33995l = function3;
            this.f33996m = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C7489Se.m85174a(this.f33990g, this.f33991h, this.f33992i, this.f33993j, this.f33994k, this.f33995l, interfaceC32720Et0, this.f33996m | 1);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Se$c */
    /* loaded from: classes.dex */
    public static final class C7494c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ F96<T> f33997g;

        /* renamed from: h */
        public final /* synthetic */ Function1<T, Boolean> f33998h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f33999i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC37500Ze1 f34000j;

        /* renamed from: k */
        public final /* synthetic */ AbstractC41687gi1 f34001k;

        /* renamed from: l */
        public final /* synthetic */ Function3<InterfaceC7907Te, InterfaceC32720Et0, Integer, Unit> f34002l;

        /* renamed from: m */
        public final /* synthetic */ int f34003m;

        /* renamed from: n */
        public final /* synthetic */ int f34004n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7494c(F96<T> f96, Function1<? super T, Boolean> function1, InterfaceC41563gV2 interfaceC41563gV2, AbstractC37500Ze1 abstractC37500Ze1, AbstractC41687gi1 abstractC41687gi1, Function3<? super InterfaceC7907Te, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f33997g = f96;
            this.f33998h = function1;
            this.f33999i = interfaceC41563gV2;
            this.f34000j = abstractC37500Ze1;
            this.f34001k = abstractC41687gi1;
            this.f34002l = function3;
            this.f34003m = i;
            this.f34004n = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C7489Se.m85172c(this.f33997g, this.f33998h, this.f33999i, this.f34000j, this.f34001k, this.f34002l, interfaceC32720Et0, this.f34003m | 1, this.f34004n);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Se$d */
    /* loaded from: classes.dex */
    public static final class C7495d extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C7495d f34005g = new C7495d();

        public C7495d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean m85168a(boolean z) {
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return m85168a(bool.booleanValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Se$e */
    /* loaded from: classes.dex */
    public static final class C7496e extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC35231Pm0 f34006g;

        /* renamed from: h */
        public final /* synthetic */ boolean f34007h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC41563gV2 f34008i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC37500Ze1 f34009j;

        /* renamed from: k */
        public final /* synthetic */ AbstractC41687gi1 f34010k;

        /* renamed from: l */
        public final /* synthetic */ String f34011l;

        /* renamed from: m */
        public final /* synthetic */ Function3<InterfaceC7907Te, InterfaceC32720Et0, Integer, Unit> f34012m;

        /* renamed from: n */
        public final /* synthetic */ int f34013n;

        /* renamed from: o */
        public final /* synthetic */ int f34014o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7496e(InterfaceC35231Pm0 interfaceC35231Pm0, boolean z, InterfaceC41563gV2 interfaceC41563gV2, AbstractC37500Ze1 abstractC37500Ze1, AbstractC41687gi1 abstractC41687gi1, String str, Function3<? super InterfaceC7907Te, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f34006g = interfaceC35231Pm0;
            this.f34007h = z;
            this.f34008i = interfaceC41563gV2;
            this.f34009j = abstractC37500Ze1;
            this.f34010k = abstractC41687gi1;
            this.f34011l = str;
            this.f34012m = function3;
            this.f34013n = i;
            this.f34014o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C7489Se.m85173b(this.f34006g, this.f34007h, this.f34008i, this.f34009j, this.f34010k, this.f34011l, this.f34012m, interfaceC32720Et0, this.f34013n | 1, this.f34014o);
        }
    }

    /* renamed from: a */
    public static final <T> void m85174a(F96<T> f96, Function1<? super T, Boolean> function1, InterfaceC41563gV2 interfaceC41563gV2, AbstractC37500Ze1 abstractC37500Ze1, AbstractC41687gi1 abstractC41687gi1, Function3<? super InterfaceC7907Te, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(808253933);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(f96)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(function1)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(interfaceC41563gV2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(abstractC37500Ze1)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 57344) == 0) {
            if (mo89518u.mo89539n(abstractC41687gi1)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (mo89518u.mo89539n(function3)) {
                i3 = DateUtils.FORMAT_NUMERIC_DATE;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if ((374491 & i9) == 74898 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(808253933, i9, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:726)");
            }
            int i10 = i9 & 14;
            mo89518u.mo89638F(1157296644);
            boolean mo89539n = mo89518u.mo89539n(f96);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = LM5.m97025e(function1.invoke(f96.m107535g()), null, 2, null);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            EX2 ex2 = (EX2) mo89635G;
            if (!function1.invoke(f96.m107529m()).booleanValue() && !((Boolean) ex2.getValue()).booleanValue() && !f96.m107525q()) {
                interfaceC32720Et02 = mo89518u;
            } else {
                int i11 = i10 | 48;
                mo89518u.mo89638F(1215497572);
                int i12 = i11 & 14;
                mo89518u.mo89638F(1157296644);
                boolean mo89539n2 = mo89518u.mo89539n(f96);
                Object mo89635G2 = mo89518u.mo89635G();
                if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G2 = f96.m107535g();
                    mo89518u.mo89503z(mo89635G2);
                }
                mo89518u.mo89605Q();
                if (f96.m107525q()) {
                    mo89635G2 = f96.m107535g();
                }
                int i13 = (i11 >> 3) & 112;
                mo89518u.mo89638F(-1220581778);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1220581778, i13, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                int i14 = i10 | (i9 & 112) | ((i13 << 6) & 896);
                EnumC37032Xe1 m85170e = m85170e(f96, function1, mo89635G2, mo89518u, i14);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                mo89518u.mo89605Q();
                T m107529m = f96.m107529m();
                mo89518u.mo89638F(-1220581778);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1220581778, i13, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                EnumC37032Xe1 m85170e2 = m85170e(f96, function1, m107529m, mo89518u, i14);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                mo89518u.mo89605Q();
                F96 m101075a = J96.m101075a(f96, m85170e, m85170e2, "EnterExitTransition", mo89518u, i12 | ((i11 << 6) & 7168));
                mo89518u.mo89605Q();
                mo89518u.mo89638F(511388516);
                boolean mo89539n3 = mo89518u.mo89539n(m101075a) | mo89518u.mo89539n(ex2);
                Object mo89635G3 = mo89518u.mo89635G();
                if (mo89539n3 || mo89635G3 == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G3 = new C7490a(m101075a, ex2, null);
                    mo89518u.mo89503z(mo89635G3);
                }
                mo89518u.mo89605Q();
                Y91.m75533f(m101075a, (Function2) mo89635G3, mo89518u, 64);
                int i15 = i9 >> 3;
                int i16 = (i15 & 57344) | (i15 & 112) | (i15 & 896) | (i15 & 7168);
                mo89518u.mo89638F(-1967270694);
                Object m107535g = m101075a.m107535g();
                EnumC37032Xe1 enumC37032Xe1 = EnumC37032Xe1.Visible;
                if (m107535g != enumC37032Xe1 && m101075a.m107529m() != enumC37032Xe1) {
                    interfaceC32720Et02 = mo89518u;
                } else {
                    int i17 = i16 & 14;
                    mo89518u.mo89638F(1157296644);
                    boolean mo89539n4 = mo89518u.mo89539n(m101075a);
                    Object mo89635G4 = mo89518u.mo89635G();
                    if (mo89539n4 || mo89635G4 == InterfaceC32720Et0.f8257a.m108267a()) {
                        mo89635G4 = new C8338Ue(m101075a);
                        mo89518u.mo89503z(mo89635G4);
                    }
                    mo89518u.mo89605Q();
                    C8338Ue c8338Ue = (C8338Ue) mo89635G4;
                    int i18 = i16 >> 3;
                    interfaceC32720Et02 = mo89518u;
                    InterfaceC41563gV2 mo39266t0 = interfaceC41563gV2.mo39266t0(C37266Ye1.m74644g(m101075a, abstractC37500Ze1, abstractC41687gi1, "Built-in", mo89518u, i17 | 3072 | (i18 & 112) | (i18 & 896)));
                    interfaceC32720Et02.mo89638F(-492369756);
                    Object mo89635G5 = interfaceC32720Et02.mo89635G();
                    if (mo89635G5 == InterfaceC32720Et0.f8257a.m108267a()) {
                        mo89635G5 = new C6414Pe(c8338Ue);
                        interfaceC32720Et02.mo89503z(mo89635G5);
                    }
                    interfaceC32720Et02.mo89605Q();
                    InterfaceC51579xO2 interfaceC51579xO2 = (InterfaceC51579xO2) mo89635G5;
                    interfaceC32720Et02.mo89638F(-1323940314);
                    InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et02.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et02.mo89572c(C42399hu0.m35602q());
                    InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                    Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                    Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(mo39266t0);
                    if (!(interfaceC32720Et02.mo89515v() instanceof InterfaceC25773lm)) {
                        C52468yt0.m2335c();
                    }
                    interfaceC32720Et02.mo89557h();
                    if (interfaceC32720Et02.mo89521t()) {
                        interfaceC32720Et02.mo89617M(m113415a);
                    } else {
                        interfaceC32720Et02.mo89566e();
                    }
                    interfaceC32720Et02.mo89620L();
                    InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et02);
                    C38680bf6.m64191b(m64192a, interfaceC51579xO2, c0757a.m113412d());
                    C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                    C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                    C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                    interfaceC32720Et02.mo89530q();
                    m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et02)), interfaceC32720Et02, 0);
                    interfaceC32720Et02.mo89638F(2058660585);
                    function3.invoke(c8338Ue, interfaceC32720Et02, Integer.valueOf(((i16 >> 9) & 112) | 8));
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89563f();
                    interfaceC32720Et02.mo89605Q();
                }
                interfaceC32720Et02.mo89605Q();
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C7493b(f96, function1, interfaceC41563gV2, abstractC37500Ze1, abstractC41687gi1, function3, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m85173b(InterfaceC35231Pm0 interfaceC35231Pm0, boolean z, InterfaceC41563gV2 interfaceC41563gV2, AbstractC37500Ze1 abstractC37500Ze1, AbstractC41687gi1 abstractC41687gi1, String str, Function3<? super InterfaceC7907Te, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        Object obj2;
        int i7;
        int i8;
        Object obj3;
        int i9;
        int i10;
        Object obj4;
        int i11;
        int i12;
        InterfaceC41563gV2.C20912a c20912a;
        AbstractC37500Ze1 abstractC37500Ze12;
        AbstractC41687gi1 abstractC41687gi12;
        String str2;
        AbstractC37500Ze1 abstractC37500Ze13;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(interfaceC35231Pm0, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1766503102);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89536o(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
            i6 = i2 & 4;
            if (i6 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                obj2 = abstractC37500Ze1;
                if (mo89518u.mo89539n(obj2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
                i8 = i2 & 8;
                if (i8 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    obj3 = abstractC41687gi1;
                    if (mo89518u.mo89539n(obj3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                    i10 = i2 & 16;
                    if (i10 == 0) {
                        i3 |= ImageMetadata.EDGE_MODE;
                        obj4 = str;
                    } else {
                        obj4 = str;
                        if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                            if (mo89518u.mo89539n(obj4)) {
                                i11 = DateUtils.FORMAT_NUMERIC_DATE;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                    }
                    if ((i2 & 32) == 0) {
                        i12 = 1572864;
                    } else {
                        if ((i & 3670016) == 0) {
                            if (mo89518u.mo89539n(content)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                        }
                        if ((i3 & 2995921) != 599184 && mo89518u.mo89575b()) {
                            mo89518u.mo89548k();
                            abstractC37500Ze13 = obj2;
                            abstractC41687gi12 = obj3;
                            str2 = obj4;
                        } else {
                            if (i13 != 0) {
                                c20912a = InterfaceC41563gV2.f82354b0;
                            } else {
                                c20912a = obj;
                            }
                            if (i6 != 0) {
                                abstractC37500Ze12 = C37266Ye1.m74631t(null, 0.0f, 3, null).m72831c(C37266Ye1.m74633r(null, null, false, null, 15, null));
                            } else {
                                abstractC37500Ze12 = obj2;
                            }
                            if (i8 != 0) {
                                obj3 = C37266Ye1.m74629v(null, 0.0f, 3, null).m37887c(C37266Ye1.m74653C(null, null, false, null, 15, null));
                            }
                            if (i10 != 0) {
                                obj4 = "AnimatedVisibility";
                            }
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(1766503102, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                            }
                            int i14 = i3 >> 3;
                            m85174a(J96.m101071e(Boolean.valueOf(z), obj4, mo89518u, (i14 & 14) | ((i3 >> 12) & 112), 0), C7495d.f34005g, c20912a, abstractC37500Ze12, obj3, content, mo89518u, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i14 & ImageMetadata.JPEG_GPS_COORDINATES));
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            abstractC41687gi12 = obj3;
                            str2 = obj4;
                            obj = c20912a;
                            abstractC37500Ze13 = abstractC37500Ze12;
                        }
                        mo89512w = mo89518u.mo89512w();
                        if (mo89512w != null) {
                            mo89512w.mo20405a(new C7496e(interfaceC35231Pm0, z, obj, abstractC37500Ze13, abstractC41687gi12, str2, content, i, i2));
                            return;
                        }
                        return;
                    }
                    i3 |= i12;
                    if ((i3 & 2995921) != 599184) {
                    }
                    if (i13 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    int i142 = i3 >> 3;
                    m85174a(J96.m101071e(Boolean.valueOf(z), obj4, mo89518u, (i142 & 14) | ((i3 >> 12) & 112), 0), C7495d.f34005g, c20912a, abstractC37500Ze12, obj3, content, mo89518u, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i142 & ImageMetadata.JPEG_GPS_COORDINATES));
                    if (C35528Qt0.m87827O()) {
                    }
                    abstractC41687gi12 = obj3;
                    str2 = obj4;
                    obj = c20912a;
                    abstractC37500Ze13 = abstractC37500Ze12;
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w != null) {
                    }
                }
                obj3 = abstractC41687gi1;
                i10 = i2 & 16;
                if (i10 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                i3 |= i12;
                if ((i3 & 2995921) != 599184) {
                }
                if (i13 != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                int i1422 = i3 >> 3;
                m85174a(J96.m101071e(Boolean.valueOf(z), obj4, mo89518u, (i1422 & 14) | ((i3 >> 12) & 112), 0), C7495d.f34005g, c20912a, abstractC37500Ze12, obj3, content, mo89518u, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1422 & ImageMetadata.JPEG_GPS_COORDINATES));
                if (C35528Qt0.m87827O()) {
                }
                abstractC41687gi12 = obj3;
                str2 = obj4;
                obj = c20912a;
                abstractC37500Ze13 = abstractC37500Ze12;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                }
            }
            obj2 = abstractC37500Ze1;
            i8 = i2 & 8;
            if (i8 != 0) {
            }
            obj3 = abstractC41687gi1;
            i10 = i2 & 16;
            if (i10 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            i3 |= i12;
            if ((i3 & 2995921) != 599184) {
            }
            if (i13 != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            int i14222 = i3 >> 3;
            m85174a(J96.m101071e(Boolean.valueOf(z), obj4, mo89518u, (i14222 & 14) | ((i3 >> 12) & 112), 0), C7495d.f34005g, c20912a, abstractC37500Ze12, obj3, content, mo89518u, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i14222 & ImageMetadata.JPEG_GPS_COORDINATES));
            if (C35528Qt0.m87827O()) {
            }
            abstractC41687gi12 = obj3;
            str2 = obj4;
            obj = c20912a;
            abstractC37500Ze13 = abstractC37500Ze12;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        obj = interfaceC41563gV2;
        i6 = i2 & 4;
        if (i6 == 0) {
        }
        obj2 = abstractC37500Ze1;
        i8 = i2 & 8;
        if (i8 != 0) {
        }
        obj3 = abstractC41687gi1;
        i10 = i2 & 16;
        if (i10 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i3 |= i12;
        if ((i3 & 2995921) != 599184) {
        }
        if (i13 != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        int i142222 = i3 >> 3;
        m85174a(J96.m101071e(Boolean.valueOf(z), obj4, mo89518u, (i142222 & 14) | ((i3 >> 12) & 112), 0), C7495d.f34005g, c20912a, abstractC37500Ze12, obj3, content, mo89518u, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i142222 & ImageMetadata.JPEG_GPS_COORDINATES));
        if (C35528Qt0.m87827O()) {
        }
        abstractC41687gi12 = obj3;
        str2 = obj4;
        obj = c20912a;
        abstractC37500Ze13 = abstractC37500Ze12;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void m85172c(F96<T> f96, Function1<? super T, Boolean> visible, InterfaceC41563gV2 interfaceC41563gV2, AbstractC37500Ze1 abstractC37500Ze1, AbstractC41687gi1 abstractC41687gi1, Function3<? super InterfaceC7907Te, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        int i7;
        Object obj2;
        int i8;
        int i9;
        Object obj3;
        int i10;
        int i11;
        InterfaceC41563gV2.C20912a c20912a;
        AbstractC37500Ze1 abstractC37500Ze12;
        AbstractC41687gi1 abstractC41687gi12;
        AbstractC37500Ze1 abstractC37500Ze13;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(f96, "<this>");
        Intrinsics.checkNotNullParameter(visible, "visible");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1031950689);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(f96)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(visible)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
            i7 = i2 & 4;
            if (i7 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                obj2 = abstractC37500Ze1;
                if (mo89518u.mo89539n(obj2)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
                i9 = i2 & 8;
                if (i9 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    obj3 = abstractC41687gi1;
                    if (mo89518u.mo89539n(obj3)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i3 |= i10;
                    if ((i2 & 16) == 0) {
                        i11 = ImageMetadata.EDGE_MODE;
                    } else {
                        if ((i & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                            if (mo89518u.mo89539n(content)) {
                                i11 = DateUtils.FORMAT_NUMERIC_DATE;
                            } else {
                                i11 = 65536;
                            }
                        }
                        if ((374491 & i3) != 74898 && mo89518u.mo89575b()) {
                            mo89518u.mo89548k();
                            abstractC37500Ze13 = obj2;
                            abstractC41687gi12 = obj3;
                        } else {
                            if (i12 != 0) {
                                c20912a = InterfaceC41563gV2.f82354b0;
                            } else {
                                c20912a = obj;
                            }
                            if (i7 != 0) {
                                abstractC37500Ze12 = C37266Ye1.m74631t(null, 0.0f, 3, null).m72831c(C37266Ye1.m74635p(null, null, false, null, 15, null));
                            } else {
                                abstractC37500Ze12 = obj2;
                            }
                            if (i9 != 0) {
                                obj3 = C37266Ye1.m74655A(null, null, false, null, 15, null).m37887c(C37266Ye1.m74629v(null, 0.0f, 3, null));
                            }
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(1031950689, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                            }
                            m85174a(f96, visible, c20912a, abstractC37500Ze12, obj3, content, mo89518u, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & ImageMetadata.JPEG_GPS_COORDINATES));
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            abstractC41687gi12 = obj3;
                            obj = c20912a;
                            abstractC37500Ze13 = abstractC37500Ze12;
                        }
                        mo89512w = mo89518u.mo89512w();
                        if (mo89512w != null) {
                            mo89512w.mo20405a(new C7494c(f96, visible, obj, abstractC37500Ze13, abstractC41687gi12, content, i, i2));
                            return;
                        }
                        return;
                    }
                    i3 |= i11;
                    if ((374491 & i3) != 74898) {
                    }
                    if (i12 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    m85174a(f96, visible, c20912a, abstractC37500Ze12, obj3, content, mo89518u, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & ImageMetadata.JPEG_GPS_COORDINATES));
                    if (C35528Qt0.m87827O()) {
                    }
                    abstractC41687gi12 = obj3;
                    obj = c20912a;
                    abstractC37500Ze13 = abstractC37500Ze12;
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w != null) {
                    }
                }
                obj3 = abstractC41687gi1;
                if ((i2 & 16) == 0) {
                }
                i3 |= i11;
                if ((374491 & i3) != 74898) {
                }
                if (i12 != 0) {
                }
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                m85174a(f96, visible, c20912a, abstractC37500Ze12, obj3, content, mo89518u, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & ImageMetadata.JPEG_GPS_COORDINATES));
                if (C35528Qt0.m87827O()) {
                }
                abstractC41687gi12 = obj3;
                obj = c20912a;
                abstractC37500Ze13 = abstractC37500Ze12;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                }
            }
            obj2 = abstractC37500Ze1;
            i9 = i2 & 8;
            if (i9 != 0) {
            }
            obj3 = abstractC41687gi1;
            if ((i2 & 16) == 0) {
            }
            i3 |= i11;
            if ((374491 & i3) != 74898) {
            }
            if (i12 != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            m85174a(f96, visible, c20912a, abstractC37500Ze12, obj3, content, mo89518u, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & ImageMetadata.JPEG_GPS_COORDINATES));
            if (C35528Qt0.m87827O()) {
            }
            abstractC41687gi12 = obj3;
            obj = c20912a;
            abstractC37500Ze13 = abstractC37500Ze12;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        obj = interfaceC41563gV2;
        i7 = i2 & 4;
        if (i7 == 0) {
        }
        obj2 = abstractC37500Ze1;
        i9 = i2 & 8;
        if (i9 != 0) {
        }
        obj3 = abstractC41687gi1;
        if ((i2 & 16) == 0) {
        }
        i3 |= i11;
        if ((374491 & i3) != 74898) {
        }
        if (i12 != 0) {
        }
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        m85174a(f96, visible, c20912a, abstractC37500Ze12, obj3, content, mo89518u, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & ImageMetadata.JPEG_GPS_COORDINATES));
        if (C35528Qt0.m87827O()) {
        }
        abstractC41687gi12 = obj3;
        obj = c20912a;
        abstractC37500Ze13 = abstractC37500Ze12;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static final <T> EnumC37032Xe1 m85170e(F96<T> f96, Function1<? super T, Boolean> function1, T t, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        EnumC37032Xe1 enumC37032Xe1;
        interfaceC32720Et0.mo89638F(361571134);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(361571134, i, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:830)");
        }
        interfaceC32720Et0.mo89623K(-721837504, f96);
        if (f96.m107525q()) {
            if (function1.invoke(t).booleanValue()) {
                enumC37032Xe1 = EnumC37032Xe1.Visible;
            } else if (function1.invoke(f96.m107535g()).booleanValue()) {
                enumC37032Xe1 = EnumC37032Xe1.PostExit;
            } else {
                enumC37032Xe1 = EnumC37032Xe1.PreEnter;
            }
        } else {
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = LM5.m97025e(Boolean.FALSE, null, 2, null);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            EX2 ex2 = (EX2) mo89635G;
            if (function1.invoke(f96.m107535g()).booleanValue()) {
                ex2.setValue(Boolean.TRUE);
            }
            if (function1.invoke(t).booleanValue()) {
                enumC37032Xe1 = EnumC37032Xe1.Visible;
            } else if (((Boolean) ex2.getValue()).booleanValue()) {
                enumC37032Xe1 = EnumC37032Xe1.PostExit;
            } else {
                enumC37032Xe1 = EnumC37032Xe1.PreEnter;
            }
        }
        interfaceC32720Et0.mo89608P();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return enumC37032Xe1;
    }
}
