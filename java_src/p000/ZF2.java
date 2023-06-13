package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.compose.p003ui.draw.C11289a;
import androidx.compose.p003ui.platform.C11411h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ao\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0001H\u0007ø\u0001\u0000\u001ao\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0001ø\u0001\u0000\u001a\u0012\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0001\")\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00170\u00168\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m28432d2 = {"LgV2;", "Lkotlin/Function1;", "Lg01;", "LCe3;", "Lkotlin/ExtensionFunctionType;", "sourceCenter", "magnifierCenter", "", "zoom", "LaG2;", "style", "Lo61;", "", "onSizeChanged", DateTokenConverter.CONVERTER_KEY, "LFV3;", "platformMagnifierFactory", "e", "", "sdkVersion", "", "b", "Lrs5;", "Lkotlin/Function0;", C17296a.f69688o, "Lrs5;", "()Lrs5;", "MagnifierPositionInRoot", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,394:1\n135#2:395\n146#2:396\n*S KotlinDebug\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n*L\n233#1:395\n231#1:396\n*E\n"})
/* renamed from: ZF2 */
/* loaded from: classes.dex */
public final class ZF2 {

    /* renamed from: a */
    public static final C48314rs5<Function0<C32120Ce3>> f48028a = new C48314rs5<>("MagnifierPositionInRoot", null, 2, null);

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n*L\n1#1,170:1\n234#2,6:171\n*E\n"})
    /* renamed from: ZF2$a */
    /* loaded from: classes.dex */
    public static final class C10164a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1 f48029g;

        /* renamed from: h */
        public final /* synthetic */ Function1 f48030h;

        /* renamed from: i */
        public final /* synthetic */ float f48031i;

        /* renamed from: j */
        public final /* synthetic */ C37853aG2 f48032j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10164a(Function1 function1, Function1 function12, float f, C37853aG2 c37853aG2) {
            super(1);
            this.f48029g = function1;
            this.f48030h = function12;
            this.f48031i = f;
            this.f48032j = c37853aG2;
        }

        /* renamed from: a */
        public final void m73511a(S42 s42) {
            String str;
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            if (ZF2.m73515c(0, 1, null)) {
                str = "magnifier";
            } else {
                str = "magnifier (not supported)";
            }
            s42.m86037b(str);
            s42.m86038a().m104824a("sourceCenter", this.f48029g);
            s42.m86038a().m104824a("magnifierCenter", this.f48030h);
            s42.m86038a().m104824a("zoom", Float.valueOf(this.f48031i));
            s42.m86038a().m104824a("style", this.f48032j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m73511a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lg01;", "LCe3;", C17296a.f69688o, "(Lg01;)J"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZF2$b */
    /* loaded from: classes.dex */
    public static final class C10165b extends Lambda implements Function1<InterfaceC41273g01, C32120Ce3> {

        /* renamed from: g */
        public static final C10165b f48033g = new C10165b();

        public C10165b() {
            super(1);
        }

        /* renamed from: a */
        public final long m73510a(InterfaceC41273g01 interfaceC41273g01) {
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "$this$null");
            return C32120Ce3.f4427b.m111933b();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C32120Ce3 invoke(InterfaceC41273g01 interfaceC41273g01) {
            return C32120Ce3.m111955d(m73510a(interfaceC41273g01));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", "i", "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt$magnifier$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,394:1\n76#2:395\n76#2:396\n25#3:397\n25#3:404\n25#3:411\n25#3:418\n36#3:425\n36#3:432\n1114#4,6:398\n1114#4,6:405\n1114#4,6:412\n1114#4,6:419\n1114#4,6:426\n1114#4,6:433\n76#5:439\n102#5,2:440\n76#5:442\n76#5:443\n76#5:444\n76#5:445\n76#5:446\n76#5:447\n*S KotlinDebug\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt$magnifier$4\n*L\n274#1:395\n275#1:396\n276#1:397\n281#1:404\n291#1:411\n296#1:418\n374#1:425\n386#1:432\n276#1:398,6\n281#1:405,6\n291#1:412,6\n296#1:419,6\n374#1:426,6\n386#1:433,6\n276#1:439\n276#1:440,2\n277#1:442\n278#1:443\n279#1:444\n280#1:445\n281#1:446\n291#1:447\n*E\n"})
    /* renamed from: ZF2$c */
    /* loaded from: classes.dex */
    public static final class C10166c extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ Function1<InterfaceC41273g01, C32120Ce3> f48034g;

        /* renamed from: h */
        public final /* synthetic */ Function1<InterfaceC41273g01, C32120Ce3> f48035h;

        /* renamed from: i */
        public final /* synthetic */ float f48036i;

        /* renamed from: j */
        public final /* synthetic */ Function1<C46077o61, Unit> f48037j;

        /* renamed from: k */
        public final /* synthetic */ FV3 f48038k;

        /* renamed from: l */
        public final /* synthetic */ C37853aG2 f48039l;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", m28418f = "Magnifier.kt", m28417i = {0}, m28416l = {365}, m28415m = "invokeSuspend", m28414n = {"magnifier"}, m28413s = {"L$0"})
        /* renamed from: ZF2$c$a */
        /* loaded from: classes.dex */
        public static final class C10167a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f48040h;

            /* renamed from: i */
            public /* synthetic */ Object f48041i;

            /* renamed from: j */
            public final /* synthetic */ FV3 f48042j;

            /* renamed from: k */
            public final /* synthetic */ C37853aG2 f48043k;

            /* renamed from: l */
            public final /* synthetic */ View f48044l;

            /* renamed from: m */
            public final /* synthetic */ InterfaceC41273g01 f48045m;

            /* renamed from: n */
            public final /* synthetic */ float f48046n;

            /* renamed from: o */
            public final /* synthetic */ BX2<Unit> f48047o;

            /* renamed from: p */
            public final /* synthetic */ InterfaceC48627sP5<Function1<C46077o61, Unit>> f48048p;

            /* renamed from: q */
            public final /* synthetic */ InterfaceC48627sP5<Boolean> f48049q;

            /* renamed from: r */
            public final /* synthetic */ InterfaceC48627sP5<C32120Ce3> f48050r;

            /* renamed from: s */
            public final /* synthetic */ InterfaceC48627sP5<Function1<InterfaceC41273g01, C32120Ce3>> f48051s;

            /* renamed from: t */
            public final /* synthetic */ EX2<C32120Ce3> f48052t;

            /* renamed from: u */
            public final /* synthetic */ InterfaceC48627sP5<Float> f48053u;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", m28418f = "Magnifier.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: ZF2$c$a$a */
            /* loaded from: classes.dex */
            public static final class C10168a extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f48054h;

                /* renamed from: i */
                public final /* synthetic */ EV3 f48055i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10168a(EV3 ev3, Continuation<? super C10168a> continuation) {
                    super(2, continuation);
                    this.f48055i = ev3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10168a(this.f48055i, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: e */
                public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return ((C10168a) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f48054h == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f48055i.mo93840c();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: ZF2$c$a$b */
            /* loaded from: classes.dex */
            public static final class C10169b extends Lambda implements Function0<Unit> {

                /* renamed from: g */
                public final /* synthetic */ EV3 f48056g;

                /* renamed from: h */
                public final /* synthetic */ InterfaceC41273g01 f48057h;

                /* renamed from: i */
                public final /* synthetic */ InterfaceC48627sP5<Boolean> f48058i;

                /* renamed from: j */
                public final /* synthetic */ InterfaceC48627sP5<C32120Ce3> f48059j;

                /* renamed from: k */
                public final /* synthetic */ InterfaceC48627sP5<Function1<InterfaceC41273g01, C32120Ce3>> f48060k;

                /* renamed from: l */
                public final /* synthetic */ EX2<C32120Ce3> f48061l;

                /* renamed from: m */
                public final /* synthetic */ InterfaceC48627sP5<Float> f48062m;

                /* renamed from: n */
                public final /* synthetic */ Ref.LongRef f48063n;

                /* renamed from: o */
                public final /* synthetic */ InterfaceC48627sP5<Function1<C46077o61, Unit>> f48064o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C10169b(EV3 ev3, InterfaceC41273g01 interfaceC41273g01, InterfaceC48627sP5<Boolean> interfaceC48627sP5, InterfaceC48627sP5<C32120Ce3> interfaceC48627sP52, InterfaceC48627sP5<? extends Function1<? super InterfaceC41273g01, C32120Ce3>> interfaceC48627sP53, EX2<C32120Ce3> ex2, InterfaceC48627sP5<Float> interfaceC48627sP54, Ref.LongRef longRef, InterfaceC48627sP5<? extends Function1<? super C46077o61, Unit>> interfaceC48627sP55) {
                    super(0);
                    this.f48056g = ev3;
                    this.f48057h = interfaceC41273g01;
                    this.f48058i = interfaceC48627sP5;
                    this.f48059j = interfaceC48627sP52;
                    this.f48060k = interfaceC48627sP53;
                    this.f48061l = ex2;
                    this.f48062m = interfaceC48627sP54;
                    this.f48063n = longRef;
                    this.f48064o = interfaceC48627sP55;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    long m111933b;
                    if (C10166c.m73499k(this.f48058i)) {
                        EV3 ev3 = this.f48056g;
                        long m73493q = C10166c.m73493q(this.f48059j);
                        Object invoke = C10166c.m73496n(this.f48060k).invoke(this.f48057h);
                        EX2<C32120Ce3> ex2 = this.f48061l;
                        long m111935x = ((C32120Ce3) invoke).m111935x();
                        if (C33056Ge3.m104936c(m111935x)) {
                            m111933b = C32120Ce3.m111939t(C10166c.m73500j(ex2), m111935x);
                        } else {
                            m111933b = C32120Ce3.f4427b.m111933b();
                        }
                        ev3.mo74969b(m73493q, m111933b, C10166c.m73495o(this.f48062m));
                        long mo93841a = this.f48056g.mo93841a();
                        Ref.LongRef longRef = this.f48063n;
                        InterfaceC41273g01 interfaceC41273g01 = this.f48057h;
                        InterfaceC48627sP5<Function1<C46077o61, Unit>> interfaceC48627sP5 = this.f48064o;
                        if (G52.m105831e(mo93841a, longRef.element)) {
                            return;
                        }
                        longRef.element = mo93841a;
                        Function1 m73494p = C10166c.m73494p(interfaceC48627sP5);
                        if (m73494p != null) {
                            m73494p.invoke(C46077o61.m21793c(interfaceC41273g01.mo3403j(H52.m104428c(mo93841a))));
                            return;
                        }
                        return;
                    }
                    this.f48056g.dismiss();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C10167a(FV3 fv3, C37853aG2 c37853aG2, View view, InterfaceC41273g01 interfaceC41273g01, float f, BX2<Unit> bx2, InterfaceC48627sP5<? extends Function1<? super C46077o61, Unit>> interfaceC48627sP5, InterfaceC48627sP5<Boolean> interfaceC48627sP52, InterfaceC48627sP5<C32120Ce3> interfaceC48627sP53, InterfaceC48627sP5<? extends Function1<? super InterfaceC41273g01, C32120Ce3>> interfaceC48627sP54, EX2<C32120Ce3> ex2, InterfaceC48627sP5<Float> interfaceC48627sP55, Continuation<? super C10167a> continuation) {
                super(2, continuation);
                this.f48042j = fv3;
                this.f48043k = c37853aG2;
                this.f48044l = view;
                this.f48045m = interfaceC41273g01;
                this.f48046n = f;
                this.f48047o = bx2;
                this.f48048p = interfaceC48627sP5;
                this.f48049q = interfaceC48627sP52;
                this.f48050r = interfaceC48627sP53;
                this.f48051s = interfaceC48627sP54;
                this.f48052t = ex2;
                this.f48053u = interfaceC48627sP55;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10167a c10167a = new C10167a(this.f48042j, this.f48043k, this.f48044l, this.f48045m, this.f48046n, this.f48047o, this.f48048p, this.f48049q, this.f48050r, this.f48051s, this.f48052t, this.f48053u, continuation);
                c10167a.f48041i = obj;
                return c10167a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C10167a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                EV3 ev3;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f48040h;
                if (i != 0) {
                    if (i == 1) {
                        ev3 = (EV3) this.f48041i;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th) {
                            th = th;
                            ev3.dismiss();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ZC0 zc0 = (ZC0) this.f48041i;
                    EV3 mo74972a = this.f48042j.mo74972a(this.f48043k, this.f48044l, this.f48045m, this.f48046n);
                    Ref.LongRef longRef = new Ref.LongRef();
                    long mo93841a = mo74972a.mo93841a();
                    InterfaceC41273g01 interfaceC41273g01 = this.f48045m;
                    Function1 m73494p = C10166c.m73494p(this.f48048p);
                    if (m73494p != null) {
                        m73494p.invoke(C46077o61.m21793c(interfaceC41273g01.mo3403j(H52.m104428c(mo93841a))));
                    }
                    longRef.element = mo93841a;
                    C36708Vu1.m79279I(C36708Vu1.m79276L(this.f48047o, new C10168a(mo74972a, null)), zc0);
                    try {
                        InterfaceC32730Eu1 m105192o = GM5.m105192o(new C10169b(mo74972a, this.f48045m, this.f48049q, this.f48050r, this.f48051s, this.f48052t, this.f48053u, longRef, this.f48048p));
                        this.f48041i = mo74972a;
                        this.f48040h = 1;
                        if (C36708Vu1.m79262i(m105192o, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ev3 = mo74972a;
                    } catch (Throwable th2) {
                        th = th2;
                        ev3 = mo74972a;
                        ev3.dismiss();
                        throw th;
                    }
                }
                ev3.dismiss();
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ZF2$c$b */
        /* loaded from: classes.dex */
        public static final class C10170b extends Lambda implements Function1<InterfaceC45879nm2, Unit> {

            /* renamed from: g */
            public final /* synthetic */ EX2<C32120Ce3> f48065g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10170b(EX2<C32120Ce3> ex2) {
                super(1);
                this.f48065g = ex2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC45879nm2 interfaceC45879nm2) {
                invoke2(interfaceC45879nm2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC45879nm2 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C10166c.m73498l(this.f48065g, C46472om2.m20516e(it));
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ZF2$c$c */
        /* loaded from: classes.dex */
        public static final class C10171c extends Lambda implements Function1<I61, Unit> {

            /* renamed from: g */
            public final /* synthetic */ BX2<Unit> f48066g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10171c(BX2<Unit> bx2) {
                super(1);
                this.f48066g = bx2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(I61 i61) {
                invoke2(i61);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(I61 drawBehind) {
                Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                this.f48066g.mo10357b(Unit.INSTANCE);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ZF2$c$d */
        /* loaded from: classes.dex */
        public static final class C10172d extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC48627sP5<C32120Ce3> f48067g;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: ZF2$c$d$a */
            /* loaded from: classes.dex */
            public static final class C10173a extends Lambda implements Function0<C32120Ce3> {

                /* renamed from: g */
                public final /* synthetic */ InterfaceC48627sP5<C32120Ce3> f48068g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10173a(InterfaceC48627sP5<C32120Ce3> interfaceC48627sP5) {
                    super(0);
                    this.f48068g = interfaceC48627sP5;
                }

                /* renamed from: b */
                public final long m73491b() {
                    return C10166c.m73493q(this.f48068g);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ C32120Ce3 invoke() {
                    return C32120Ce3.m111955d(m73491b());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10172d(InterfaceC48627sP5<C32120Ce3> interfaceC48627sP5) {
                super(1);
                this.f48067g = interfaceC48627sP5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
                invoke2(interfaceC48906ss5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC48906ss5 semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                semantics.mo13560a(ZF2.m73517a(), new C10173a(this.f48067g));
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ZF2$c$e */
        /* loaded from: classes.dex */
        public static final class C10174e extends Lambda implements Function0<Boolean> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC48627sP5<C32120Ce3> f48069g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10174e(InterfaceC48627sP5<C32120Ce3> interfaceC48627sP5) {
                super(0);
                this.f48069g = interfaceC48627sP5;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(C33056Ge3.m104936c(C10166c.m73493q(this.f48069g)));
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ZF2$c$f */
        /* loaded from: classes.dex */
        public static final class C10175f extends Lambda implements Function0<C32120Ce3> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC41273g01 f48070g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC48627sP5<Function1<InterfaceC41273g01, C32120Ce3>> f48071h;

            /* renamed from: i */
            public final /* synthetic */ EX2<C32120Ce3> f48072i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C10175f(InterfaceC41273g01 interfaceC41273g01, InterfaceC48627sP5<? extends Function1<? super InterfaceC41273g01, C32120Ce3>> interfaceC48627sP5, EX2<C32120Ce3> ex2) {
                super(0);
                this.f48070g = interfaceC41273g01;
                this.f48071h = interfaceC48627sP5;
                this.f48072i = ex2;
            }

            /* renamed from: b */
            public final long m73490b() {
                long m111935x = ((C32120Ce3) C10166c.m73497m(this.f48071h).invoke(this.f48070g)).m111935x();
                if (C33056Ge3.m104936c(C10166c.m73500j(this.f48072i)) && C33056Ge3.m104936c(m111935x)) {
                    return C32120Ce3.m111939t(C10166c.m73500j(this.f48072i), m111935x);
                }
                return C32120Ce3.f4427b.m111933b();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ C32120Ce3 invoke() {
                return C32120Ce3.m111955d(m73490b());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10166c(Function1<? super InterfaceC41273g01, C32120Ce3> function1, Function1<? super InterfaceC41273g01, C32120Ce3> function12, float f, Function1<? super C46077o61, Unit> function13, FV3 fv3, C37853aG2 c37853aG2) {
            super(3);
            this.f48034g = function1;
            this.f48035h = function12;
            this.f48036i = f;
            this.f48037j = function13;
            this.f48038k = fv3;
            this.f48039l = c37853aG2;
        }

        /* renamed from: j */
        public static final long m73500j(EX2<C32120Ce3> ex2) {
            return ex2.getValue().m111935x();
        }

        /* renamed from: k */
        public static final boolean m73499k(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
            return interfaceC48627sP5.getValue().booleanValue();
        }

        /* renamed from: l */
        public static final void m73498l(EX2<C32120Ce3> ex2, long j) {
            ex2.setValue(C32120Ce3.m111955d(j));
        }

        /* renamed from: m */
        public static final Function1<InterfaceC41273g01, C32120Ce3> m73497m(InterfaceC48627sP5<? extends Function1<? super InterfaceC41273g01, C32120Ce3>> interfaceC48627sP5) {
            return (Function1) interfaceC48627sP5.getValue();
        }

        /* renamed from: n */
        public static final Function1<InterfaceC41273g01, C32120Ce3> m73496n(InterfaceC48627sP5<? extends Function1<? super InterfaceC41273g01, C32120Ce3>> interfaceC48627sP5) {
            return (Function1) interfaceC48627sP5.getValue();
        }

        /* renamed from: o */
        public static final float m73495o(InterfaceC48627sP5<Float> interfaceC48627sP5) {
            return interfaceC48627sP5.getValue().floatValue();
        }

        /* renamed from: p */
        public static final Function1<C46077o61, Unit> m73494p(InterfaceC48627sP5<? extends Function1<? super C46077o61, Unit>> interfaceC48627sP5) {
            return (Function1) interfaceC48627sP5.getValue();
        }

        /* renamed from: q */
        public static final long m73493q(InterfaceC48627sP5<C32120Ce3> interfaceC48627sP5) {
            return interfaceC48627sP5.getValue().m111935x();
        }

        /* renamed from: i */
        public final InterfaceC41563gV2 m73501i(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            float f;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(-454877003);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-454877003, i, -1, "androidx.compose.foundation.magnifier.<anonymous> (Magnifier.kt:272)");
            }
            View view = (View) interfaceC32720Et0.mo89572c(C11411h.m68320k());
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                mo89635G = LM5.m97025e(C32120Ce3.m111955d(C32120Ce3.f4427b.m111933b()), null, 2, null);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            EX2 ex2 = (EX2) mo89635G;
            InterfaceC48627sP5 m105193n = GM5.m105193n(this.f48034g, interfaceC32720Et0, 0);
            InterfaceC48627sP5 m105193n2 = GM5.m105193n(this.f48035h, interfaceC32720Et0, 0);
            InterfaceC48627sP5 m105193n3 = GM5.m105193n(Float.valueOf(this.f48036i), interfaceC32720Et0, 0);
            InterfaceC48627sP5 m105193n4 = GM5.m105193n(this.f48037j, interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = GM5.m105204c(new C10175f(interfaceC41273g01, m105193n, ex2));
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC48627sP5 interfaceC48627sP5 = (InterfaceC48627sP5) mo89635G2;
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G3 = interfaceC32720Et0.mo89635G();
            if (mo89635G3 == c2012a.m108267a()) {
                mo89635G3 = GM5.m105204c(new C10174e(interfaceC48627sP5));
                interfaceC32720Et0.mo89503z(mo89635G3);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC48627sP5 interfaceC48627sP52 = (InterfaceC48627sP5) mo89635G3;
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G4 = interfaceC32720Et0.mo89635G();
            if (mo89635G4 == c2012a.m108267a()) {
                mo89635G4 = C36748Vy5.m79031b(1, 0, EnumC43674k30.DROP_OLDEST, 2, null);
                interfaceC32720Et0.mo89503z(mo89635G4);
            }
            interfaceC32720Et0.mo89605Q();
            BX2 bx2 = (BX2) mo89635G4;
            if (this.f48038k.mo74971b()) {
                f = 0.0f;
            } else {
                f = this.f48036i;
            }
            C37853aG2 c37853aG2 = this.f48039l;
            Y91.m75532g(new Object[]{view, interfaceC41273g01, Float.valueOf(f), c37853aG2, Boolean.valueOf(Intrinsics.areEqual(c37853aG2, C37853aG2.f50192g.m71723b()))}, new C10167a(this.f48038k, this.f48039l, view, interfaceC41273g01, this.f48036i, bx2, m105193n4, interfaceC48627sP52, interfaceC48627sP5, m105193n2, ex2, m105193n3, null), interfaceC32720Et0, 72);
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(ex2);
            Object mo89635G5 = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G5 == c2012a.m108267a()) {
                mo89635G5 = new C10170b(ex2);
                interfaceC32720Et0.mo89503z(mo89635G5);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 m68867a = C11289a.m68867a(C36116Tg3.m83186a(composed, (Function1) mo89635G5), new C10171c(bx2));
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n2 = interfaceC32720Et0.mo89539n(interfaceC48627sP5);
            Object mo89635G6 = interfaceC32720Et0.mo89635G();
            if (mo89539n2 || mo89635G6 == c2012a.m108267a()) {
                mo89635G6 = new C10172d(interfaceC48627sP5);
                interfaceC32720Et0.mo89503z(mo89635G6);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 m40620b = C41198fs5.m40620b(m68867a, false, (Function1) mo89635G6, 1, null);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m40620b;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m73501i(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: a */
    public static final C48314rs5<Function0<C32120Ce3>> m73517a() {
        return f48028a;
    }

    /* renamed from: b */
    public static final boolean m73516b(int i) {
        return i >= 28;
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m73515c(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Build.VERSION.SDK_INT;
        }
        return m73516b(i);
    }

    /* renamed from: d */
    public static final InterfaceC41563gV2 m73514d(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super InterfaceC41273g01, C32120Ce3> sourceCenter, Function1<? super InterfaceC41273g01, C32120Ce3> magnifierCenter, float f, C37853aG2 style, Function1<? super C46077o61, Unit> function1) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        if (K32.m99301c()) {
            m99303a = new C10164a(sourceCenter, magnifierCenter, f, style);
        } else {
            m99303a = K32.m99303a();
        }
        InterfaceC41563gV2 interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
        if (m73515c(0, 1, null)) {
            interfaceC41563gV22 = m73513e(interfaceC41563gV22, sourceCenter, magnifierCenter, f, style, function1, FV3.f9526a.m107073a());
        }
        return K32.m99302b(interfaceC41563gV2, m99303a, interfaceC41563gV22);
    }

    @SuppressLint({"ModifierInspectorInfo"})
    /* renamed from: e */
    public static final InterfaceC41563gV2 m73513e(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super InterfaceC41273g01, C32120Ce3> sourceCenter, Function1<? super InterfaceC41273g01, C32120Ce3> magnifierCenter, float f, C37853aG2 style, Function1<? super C46077o61, Unit> function1, FV3 platformMagnifierFactory) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(sourceCenter, "sourceCenter");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(platformMagnifierFactory, "platformMagnifierFactory");
        return C32486Dt0.m109807b(interfaceC41563gV2, null, new C10166c(sourceCenter, magnifierCenter, f, function1, platformMagnifierFactory, style), 1, null);
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC41563gV2 m73512f(InterfaceC41563gV2 interfaceC41563gV2, Function1 function1, Function1 function12, float f, C37853aG2 c37853aG2, Function1 function13, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = C10165b.f48033g;
        }
        Function1 function14 = function12;
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            c37853aG2 = C37853aG2.f50192g.m71724a();
        }
        C37853aG2 c37853aG22 = c37853aG2;
        if ((i & 16) != 0) {
            function13 = null;
        }
        return m73514d(interfaceC41563gV2, function1, function14, f2, c37853aG22, function13);
    }
}
