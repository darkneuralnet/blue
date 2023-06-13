package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C38600bX3;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, m28432d2 = {"LgV2;", "LdX3;", "icon", "", "overrideDescendants", C17296a.f69688o, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,101:1\n135#2:102\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n*L\n74#1:102\n*E\n"})
/* renamed from: fX3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40989fX3 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n*L\n1#1,170:1\n75#2,4:171\n*E\n"})
    /* renamed from: fX3$a */
    /* loaded from: classes.dex */
    public static final class C20442a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC39804dX3 f80263g;

        /* renamed from: h */
        public final /* synthetic */ boolean f80264h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20442a(InterfaceC39804dX3 interfaceC39804dX3, boolean z) {
            super(1);
            this.f80263g = interfaceC39804dX3;
            this.f80264h = z;
        }

        /* renamed from: a */
        public final void m41251a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("pointerHoverIcon");
            s42.m86038a().m104824a("icon", this.f80263g);
            s42.m86038a().m104824a("overrideDescendants", Boolean.valueOf(this.f80264h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m41251a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt$pointerHoverIcon$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,101:1\n76#2:102\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt$pointerHoverIcon$2\n*L\n80#1:102\n*E\n"})
    /* renamed from: fX3$b */
    /* loaded from: classes.dex */
    public static final class C20443b extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC39804dX3 f80265g;

        /* renamed from: h */
        public final /* synthetic */ boolean f80266h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", m28418f = "PointerIcon.kt", m28417i = {}, m28416l = {85}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: fX3$b$a */
        /* loaded from: classes.dex */
        public static final class C20444a extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f80267h;

            /* renamed from: i */
            public /* synthetic */ Object f80268i;

            /* renamed from: j */
            public final /* synthetic */ boolean f80269j;

            /* renamed from: k */
            public final /* synthetic */ InterfaceC41582gX3 f80270k;

            /* renamed from: l */
            public final /* synthetic */ InterfaceC39804dX3 f80271l;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1", m28418f = "PointerIcon.kt", m28417i = {0}, m28416l = {91}, m28415m = "invokeSuspend", m28414n = {"$this$awaitPointerEventScope"}, m28413s = {"L$0"})
            /* renamed from: fX3$b$a$a */
            /* loaded from: classes.dex */
            public static final class C20445a extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f80272h;

                /* renamed from: i */
                public /* synthetic */ Object f80273i;

                /* renamed from: j */
                public final /* synthetic */ boolean f80274j;

                /* renamed from: k */
                public final /* synthetic */ InterfaceC41582gX3 f80275k;

                /* renamed from: l */
                public final /* synthetic */ InterfaceC39804dX3 f80276l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C20445a(boolean z, InterfaceC41582gX3 interfaceC41582gX3, InterfaceC39804dX3 interfaceC39804dX3, Continuation<? super C20445a> continuation) {
                    super(2, continuation);
                    this.f80274j = z;
                    this.f80275k = interfaceC41582gX3;
                    this.f80276l = interfaceC39804dX3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C20445a c20445a = new C20445a(this.f80274j, this.f80275k, this.f80276l, continuation);
                    c20445a.f80273i = obj;
                    return c20445a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: e */
                public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
                    return ((C20445a) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:17:0x0040). Please submit an issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    InterfaceC9204Wu interfaceC9204Wu;
                    C20445a c20445a;
                    EnumC38007aX3 enumC38007aX3;
                    Object mo3401r0;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f80272h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                            InterfaceC9204Wu interfaceC9204Wu2 = (InterfaceC9204Wu) this.f80273i;
                            Object obj2 = coroutine_suspended;
                            C20445a c20445a2 = this;
                            YW3 yw3 = (YW3) obj;
                            int m74942f = yw3.m74942f();
                            C38600bX3.C12404a c12404a = C38600bX3.f57620a;
                            boolean z = false;
                            if (C38600bX3.m64474i(m74942f, c12404a.m64469e()) && ZW3.m72993f(yw3.m74945c().get(0), interfaceC9204Wu2.mo3409a(), C51465xB5.f117175b.m5723b())) {
                                z = true;
                            }
                            if (!C38600bX3.m64474i(yw3.m74942f(), c12404a.m64472b()) && !z) {
                                c20445a2.f80275k.mo39187a(c20445a2.f80276l);
                            }
                            c20445a = c20445a2;
                            coroutine_suspended = obj2;
                            interfaceC9204Wu = interfaceC9204Wu2;
                            if (c20445a.f80274j) {
                                enumC38007aX3 = EnumC38007aX3.Main;
                            } else {
                                enumC38007aX3 = EnumC38007aX3.Initial;
                            }
                            c20445a.f80273i = interfaceC9204Wu;
                            c20445a.f80272h = 1;
                            mo3401r0 = interfaceC9204Wu.mo3401r0(enumC38007aX3, c20445a);
                            if (mo3401r0 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Object obj3 = coroutine_suspended;
                            c20445a2 = c20445a;
                            obj = mo3401r0;
                            interfaceC9204Wu2 = interfaceC9204Wu;
                            obj2 = obj3;
                            YW3 yw32 = (YW3) obj;
                            int m74942f2 = yw32.m74942f();
                            C38600bX3.C12404a c12404a2 = C38600bX3.f57620a;
                            boolean z2 = false;
                            if (C38600bX3.m64474i(m74942f2, c12404a2.m64469e())) {
                                z2 = true;
                            }
                            if (!C38600bX3.m64474i(yw32.m74942f(), c12404a2.m64472b())) {
                                c20445a2.f80275k.mo39187a(c20445a2.f80276l);
                            }
                            c20445a = c20445a2;
                            coroutine_suspended = obj2;
                            interfaceC9204Wu = interfaceC9204Wu2;
                            if (c20445a.f80274j) {
                            }
                            c20445a.f80273i = interfaceC9204Wu;
                            c20445a.f80272h = 1;
                            mo3401r0 = interfaceC9204Wu.mo3401r0(enumC38007aX3, c20445a);
                            if (mo3401r0 == coroutine_suspended) {
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        interfaceC9204Wu = (InterfaceC9204Wu) this.f80273i;
                        c20445a = this;
                        if (c20445a.f80274j) {
                        }
                        c20445a.f80273i = interfaceC9204Wu;
                        c20445a.f80272h = 1;
                        mo3401r0 = interfaceC9204Wu.mo3401r0(enumC38007aX3, c20445a);
                        if (mo3401r0 == coroutine_suspended) {
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20444a(boolean z, InterfaceC41582gX3 interfaceC41582gX3, InterfaceC39804dX3 interfaceC39804dX3, Continuation<? super C20444a> continuation) {
                super(2, continuation);
                this.f80269j = z;
                this.f80270k = interfaceC41582gX3;
                this.f80271l = interfaceC39804dX3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C20444a c20444a = new C20444a(this.f80269j, this.f80270k, this.f80271l, continuation);
                c20444a.f80268i = obj;
                return c20444a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
                return ((C20444a) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f80267h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C20445a c20445a = new C20445a(this.f80269j, this.f80270k, this.f80271l, null);
                    this.f80267h = 1;
                    if (((InterfaceC49290tX3) this.f80268i).mo3418v0(c20445a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20443b(InterfaceC39804dX3 interfaceC39804dX3, boolean z) {
            super(3);
            this.f80265g = interfaceC39804dX3;
            this.f80266h = z;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m41250a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            InterfaceC41563gV2 m1271b;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(811087536);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(811087536, i, -1, "androidx.compose.ui.input.pointer.pointerHoverIcon.<anonymous> (PointerIcon.kt:78)");
            }
            InterfaceC41582gX3 interfaceC41582gX3 = (InterfaceC41582gX3) interfaceC32720Et0.mo89572c(C42399hu0.m35606m());
            if (interfaceC41582gX3 == null) {
                m1271b = InterfaceC41563gV2.f82354b0;
            } else {
                m1271b = C52840zW5.m1271b(composed, this.f80265g, Boolean.valueOf(this.f80266h), new C20444a(this.f80266h, interfaceC41582gX3, this.f80265g, null));
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m1271b;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m41250a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m41253a(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC39804dX3 icon, boolean z) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(icon, "icon");
        if (K32.m99301c()) {
            m99303a = new C20442a(icon, z);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, new C20443b(icon, z));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC41563gV2 m41252b(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC39804dX3 interfaceC39804dX3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m41253a(interfaceC41563gV2, interfaceC39804dX3, z);
    }
}
