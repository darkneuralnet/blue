package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\u0006"}, m28432d2 = {"LgV2;", "LrX2;", "interactionSource", "", "enabled", C17296a.f69688o, "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,116:1\n135#2:117\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt\n*L\n50#1:117\n*E\n"})
/* renamed from: mN1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45048mN1 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Hoverable.kt\nandroidx/compose/foundation/HoverableKt\n*L\n1#1,170:1\n51#2,4:171\n*E\n"})
    /* renamed from: mN1$a */
    /* loaded from: classes.dex */
    public static final class C26048a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48104rX2 f97859g;

        /* renamed from: h */
        public final /* synthetic */ boolean f97860h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26048a(InterfaceC48104rX2 interfaceC48104rX2, boolean z) {
            super(1);
            this.f97859g = interfaceC48104rX2;
            this.f97860h = z;
        }

        /* renamed from: a */
        public final void m25793a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("hoverable");
            s42.m86038a().m104824a("interactionSource", this.f97859g);
            s42.m86038a().m104824a("enabled", Boolean.valueOf(this.f97860h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m25793a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", DateTokenConverter.CONVERTER_KEY, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,116:1\n474#2,4:117\n478#2,2:125\n482#2:131\n25#3:121\n25#3:132\n50#3:139\n49#3:140\n67#3,3:147\n66#3:150\n1114#4,3:122\n1117#4,3:128\n1114#4,6:133\n1114#4,6:141\n1114#4,6:151\n474#5:127\n76#6:157\n102#6,2:158\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2\n*L\n56#1:117,4\n56#1:125,2\n56#1:131\n56#1:121\n57#1:132\n83#1:139\n83#1:140\n86#1:147,3\n86#1:150\n56#1:122,3\n56#1:128,3\n57#1:133,6\n83#1:141,6\n86#1:151,6\n56#1:127\n57#1:157\n57#1:158,2\n*E\n"})
    /* renamed from: mN1$b */
    /* loaded from: classes.dex */
    public static final class C26049b extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48104rX2 f97861g;

        /* renamed from: h */
        public final /* synthetic */ boolean f97862h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,116:1\n62#2,5:117\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$1$1\n*L\n84#1:117,5\n*E\n"})
        /* renamed from: mN1$b$a */
        /* loaded from: classes.dex */
        public static final class C26050a extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

            /* renamed from: g */
            public final /* synthetic */ EX2<C43269jN1> f97863g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC48104rX2 f97864h;

            @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"mN1$b$a$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$1$1\n*L\n1#1,484:1\n84#2:485\n*E\n"})
            /* renamed from: mN1$b$a$a */
            /* loaded from: classes.dex */
            public static final class C26051a implements InterfaceC44288l51 {

                /* renamed from: a */
                public final /* synthetic */ EX2 f97865a;

                /* renamed from: b */
                public final /* synthetic */ InterfaceC48104rX2 f97866b;

                public C26051a(EX2 ex2, InterfaceC48104rX2 interfaceC48104rX2) {
                    this.f97865a = ex2;
                    this.f97866b = interfaceC48104rX2;
                }

                @Override // p000.InterfaceC44288l51
                public void dispose() {
                    C26049b.m25784i(this.f97865a, this.f97866b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26050a(EX2<C43269jN1> ex2, InterfaceC48104rX2 interfaceC48104rX2) {
                super(1);
                this.f97863g = ex2;
                this.f97864h = interfaceC48104rX2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                return new C26051a(this.f97863g, this.f97864h);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.foundation.HoverableKt$hoverable$2$2$1", m28418f = "Hoverable.kt", m28417i = {}, m28416l = {88}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: mN1$b$b */
        /* loaded from: classes.dex */
        public static final class C26052b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f97867h;

            /* renamed from: i */
            public final /* synthetic */ boolean f97868i;

            /* renamed from: j */
            public final /* synthetic */ EX2<C43269jN1> f97869j;

            /* renamed from: k */
            public final /* synthetic */ InterfaceC48104rX2 f97870k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26052b(boolean z, EX2<C43269jN1> ex2, InterfaceC48104rX2 interfaceC48104rX2, Continuation<? super C26052b> continuation) {
                super(2, continuation);
                this.f97868i = z;
                this.f97869j = ex2;
                this.f97870k = interfaceC48104rX2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C26052b(this.f97868i, this.f97869j, this.f97870k, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C26052b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f97867h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (!this.f97868i) {
                        EX2<C43269jN1> ex2 = this.f97869j;
                        InterfaceC48104rX2 interfaceC48104rX2 = this.f97870k;
                        this.f97867h = 1;
                        if (C26049b.m25787f(ex2, interfaceC48104rX2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", m28418f = "Hoverable.kt", m28417i = {}, m28416l = {102}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        @SourceDebugExtension({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$3\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,116:1\n329#2:117\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$3\n*L\n101#1:117\n*E\n"})
        /* renamed from: mN1$b$c */
        /* loaded from: classes.dex */
        public static final class C26053c extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f97871h;

            /* renamed from: i */
            public /* synthetic */ Object f97872i;

            /* renamed from: j */
            public final /* synthetic */ ZC0 f97873j;

            /* renamed from: k */
            public final /* synthetic */ InterfaceC48104rX2 f97874k;

            /* renamed from: l */
            public final /* synthetic */ EX2<C43269jN1> f97875l;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1", m28418f = "Hoverable.kt", m28417i = {0}, m28416l = {104}, m28415m = "invokeSuspend", m28414n = {"$this$awaitPointerEventScope"}, m28413s = {"L$0"})
            /* renamed from: mN1$b$c$a */
            /* loaded from: classes.dex */
            public static final class C26054a extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f97876h;

                /* renamed from: i */
                public /* synthetic */ Object f97877i;

                /* renamed from: j */
                public final /* synthetic */ CoroutineContext f97878j;

                /* renamed from: k */
                public final /* synthetic */ ZC0 f97879k;

                /* renamed from: l */
                public final /* synthetic */ InterfaceC48104rX2 f97880l;

                /* renamed from: m */
                public final /* synthetic */ EX2<C43269jN1> f97881m;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1", m28418f = "Hoverable.kt", m28417i = {}, m28416l = {106}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                /* renamed from: mN1$b$c$a$a */
                /* loaded from: classes.dex */
                public static final class C26055a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                    /* renamed from: h */
                    public int f97882h;

                    /* renamed from: i */
                    public final /* synthetic */ InterfaceC48104rX2 f97883i;

                    /* renamed from: j */
                    public final /* synthetic */ EX2<C43269jN1> f97884j;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C26055a(InterfaceC48104rX2 interfaceC48104rX2, EX2<C43269jN1> ex2, Continuation<? super C26055a> continuation) {
                        super(2, continuation);
                        this.f97883i = interfaceC48104rX2;
                        this.f97884j = ex2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C26055a(this.f97883i, this.f97884j, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                        return ((C26055a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f97882h;
                        if (i != 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            InterfaceC48104rX2 interfaceC48104rX2 = this.f97883i;
                            EX2<C43269jN1> ex2 = this.f97884j;
                            this.f97882h = 1;
                            if (C26049b.m25788e(interfaceC48104rX2, ex2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2", m28418f = "Hoverable.kt", m28417i = {}, m28416l = {107}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                /* renamed from: mN1$b$c$a$b */
                /* loaded from: classes.dex */
                public static final class C26056b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                    /* renamed from: h */
                    public int f97885h;

                    /* renamed from: i */
                    public final /* synthetic */ EX2<C43269jN1> f97886i;

                    /* renamed from: j */
                    public final /* synthetic */ InterfaceC48104rX2 f97887j;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C26056b(EX2<C43269jN1> ex2, InterfaceC48104rX2 interfaceC48104rX2, Continuation<? super C26056b> continuation) {
                        super(2, continuation);
                        this.f97886i = ex2;
                        this.f97887j = interfaceC48104rX2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C26056b(this.f97886i, this.f97887j, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                        return ((C26056b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f97885h;
                        if (i != 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            EX2<C43269jN1> ex2 = this.f97886i;
                            InterfaceC48104rX2 interfaceC48104rX2 = this.f97887j;
                            this.f97885h = 1;
                            if (C26049b.m25787f(ex2, interfaceC48104rX2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C26054a(CoroutineContext coroutineContext, ZC0 zc0, InterfaceC48104rX2 interfaceC48104rX2, EX2<C43269jN1> ex2, Continuation<? super C26054a> continuation) {
                    super(2, continuation);
                    this.f97878j = coroutineContext;
                    this.f97879k = zc0;
                    this.f97880l = interfaceC48104rX2;
                    this.f97881m = ex2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C26054a c26054a = new C26054a(this.f97878j, this.f97879k, this.f97880l, this.f97881m, continuation);
                    c26054a.f97877i = obj;
                    return c26054a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: e */
                public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
                    return ((C26054a) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003b -> B:15:0x0040). Please submit an issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    InterfaceC9204Wu interfaceC9204Wu;
                    C26054a c26054a;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f97876h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                            InterfaceC9204Wu interfaceC9204Wu2 = (InterfaceC9204Wu) this.f97877i;
                            Object obj2 = coroutine_suspended;
                            C26054a c26054a2 = this;
                            int m74942f = ((YW3) obj).m74942f();
                            C38600bX3.C12404a c12404a = C38600bX3.f57620a;
                            if (C38600bX3.m64474i(m74942f, c12404a.m64473a())) {
                                Z30.m73800d(c26054a2.f97879k, null, null, new C26055a(c26054a2.f97880l, c26054a2.f97881m, null), 3, null);
                            } else if (C38600bX3.m64474i(m74942f, c12404a.m64472b())) {
                                Z30.m73800d(c26054a2.f97879k, null, null, new C26056b(c26054a2.f97881m, c26054a2.f97880l, null), 3, null);
                            }
                            c26054a = c26054a2;
                            coroutine_suspended = obj2;
                            interfaceC9204Wu = interfaceC9204Wu2;
                            if (C34018Kh2.m98497o(c26054a.f97878j)) {
                                c26054a.f97877i = interfaceC9204Wu;
                                c26054a.f97876h = 1;
                                Object m77725U = InterfaceC9204Wu.m77725U(interfaceC9204Wu, null, c26054a, 1, null);
                                if (m77725U == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                Object obj3 = coroutine_suspended;
                                c26054a2 = c26054a;
                                obj = m77725U;
                                interfaceC9204Wu2 = interfaceC9204Wu;
                                obj2 = obj3;
                                int m74942f2 = ((YW3) obj).m74942f();
                                C38600bX3.C12404a c12404a2 = C38600bX3.f57620a;
                                if (C38600bX3.m64474i(m74942f2, c12404a2.m64473a())) {
                                }
                                c26054a = c26054a2;
                                coroutine_suspended = obj2;
                                interfaceC9204Wu = interfaceC9204Wu2;
                                if (C34018Kh2.m98497o(c26054a.f97878j)) {
                                    return Unit.INSTANCE;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        interfaceC9204Wu = (InterfaceC9204Wu) this.f97877i;
                        c26054a = this;
                        if (C34018Kh2.m98497o(c26054a.f97878j)) {
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26053c(ZC0 zc0, InterfaceC48104rX2 interfaceC48104rX2, EX2<C43269jN1> ex2, Continuation<? super C26053c> continuation) {
                super(2, continuation);
                this.f97873j = zc0;
                this.f97874k = interfaceC48104rX2;
                this.f97875l = ex2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C26053c c26053c = new C26053c(this.f97873j, this.f97874k, this.f97875l, continuation);
                c26053c.f97872i = obj;
                return c26053c;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
                return ((C26053c) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f97871h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C26054a c26054a = new C26054a(getContext(), this.f97873j, this.f97874k, this.f97875l, null);
                    this.f97871h = 1;
                    if (((InterfaceC49290tX3) this.f97872i).mo3418v0(c26054a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.foundation.HoverableKt$hoverable$2", m28418f = "Hoverable.kt", m28417i = {0, 0}, m28416l = {62}, m28415m = "invoke$emitEnter", m28414n = {"hoverInteraction$delegate", "interaction"}, m28413s = {"L$0", "L$1"})
        /* renamed from: mN1$b$d */
        /* loaded from: classes.dex */
        public static final class C26057d extends ContinuationImpl {

            /* renamed from: h */
            public Object f97888h;

            /* renamed from: i */
            public Object f97889i;

            /* renamed from: j */
            public /* synthetic */ Object f97890j;

            /* renamed from: k */
            public int f97891k;

            public C26057d(Continuation<? super C26057d> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f97890j = obj;
                this.f97891k |= Integer.MIN_VALUE;
                return C26049b.m25788e(null, null, this);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.foundation.HoverableKt$hoverable$2", m28418f = "Hoverable.kt", m28417i = {0}, m28416l = {70}, m28415m = "invoke$emitExit", m28414n = {"hoverInteraction$delegate"}, m28413s = {"L$0"})
        /* renamed from: mN1$b$e */
        /* loaded from: classes.dex */
        public static final class C26058e extends ContinuationImpl {

            /* renamed from: h */
            public Object f97892h;

            /* renamed from: i */
            public /* synthetic */ Object f97893i;

            /* renamed from: j */
            public int f97894j;

            public C26058e(Continuation<? super C26058e> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f97893i = obj;
                this.f97894j |= Integer.MIN_VALUE;
                return C26049b.m25787f(null, null, this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26049b(InterfaceC48104rX2 interfaceC48104rX2, boolean z) {
            super(3);
            this.f97861g = interfaceC48104rX2;
            this.f97862h = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object m25788e(InterfaceC48104rX2 interfaceC48104rX2, EX2<C43269jN1> ex2, Continuation<? super Unit> continuation) {
            C26057d c26057d;
            Object coroutine_suspended;
            int i;
            C43269jN1 c43269jN1;
            if (continuation instanceof C26057d) {
                c26057d = (C26057d) continuation;
                int i2 = c26057d.f97891k;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c26057d.f97891k = i2 - Integer.MIN_VALUE;
                    Object obj = c26057d.f97890j;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c26057d.f97891k;
                    if (i == 0) {
                        if (i == 1) {
                            c43269jN1 = (C43269jN1) c26057d.f97889i;
                            ex2 = (EX2) c26057d.f97888h;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        if (m25786g(ex2) == null) {
                            InterfaceC39556d62 c43269jN12 = new C43269jN1();
                            c26057d.f97888h = ex2;
                            c26057d.f97889i = c43269jN12;
                            c26057d.f97891k = 1;
                            if (interfaceC48104rX2.mo14088c(c43269jN12, c26057d) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c43269jN1 = c43269jN12;
                        }
                        return Unit.INSTANCE;
                    }
                    m25785h(ex2, c43269jN1);
                    return Unit.INSTANCE;
                }
            }
            c26057d = new C26057d(continuation);
            Object obj2 = c26057d.f97890j;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c26057d.f97891k;
            if (i == 0) {
            }
            m25785h(ex2, c43269jN1);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object m25787f(EX2<C43269jN1> ex2, InterfaceC48104rX2 interfaceC48104rX2, Continuation<? super Unit> continuation) {
            C26058e c26058e;
            Object coroutine_suspended;
            int i;
            if (continuation instanceof C26058e) {
                c26058e = (C26058e) continuation;
                int i2 = c26058e.f97894j;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c26058e.f97894j = i2 - Integer.MIN_VALUE;
                    Object obj = c26058e.f97893i;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c26058e.f97894j;
                    if (i == 0) {
                        if (i == 1) {
                            ex2 = (EX2) c26058e.f97892h;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        C43269jN1 m25786g = m25786g(ex2);
                        if (m25786g != null) {
                            InterfaceC39556d62 c43862kN1 = new C43862kN1(m25786g);
                            c26058e.f97892h = ex2;
                            c26058e.f97894j = 1;
                            if (interfaceC48104rX2.mo14088c(c43862kN1, c26058e) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    m25785h(ex2, null);
                    return Unit.INSTANCE;
                }
            }
            c26058e = new C26058e(continuation);
            Object obj2 = c26058e.f97893i;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c26058e.f97894j;
            if (i == 0) {
            }
            m25785h(ex2, null);
            return Unit.INSTANCE;
        }

        /* renamed from: g */
        public static final C43269jN1 m25786g(EX2<C43269jN1> ex2) {
            return ex2.getValue();
        }

        /* renamed from: h */
        public static final void m25785h(EX2<C43269jN1> ex2, C43269jN1 c43269jN1) {
            ex2.setValue(c43269jN1);
        }

        /* renamed from: i */
        public static final void m25784i(EX2<C43269jN1> ex2, InterfaceC48104rX2 interfaceC48104rX2) {
            C43269jN1 m25786g = m25786g(ex2);
            if (m25786g != null) {
                interfaceC48104rX2.mo14090a(new C43862kN1(m25786g));
                m25785h(ex2, null);
            }
        }

        /* renamed from: d */
        public final InterfaceC41563gV2 m25789d(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            InterfaceC41563gV2 interfaceC41563gV2;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(1294013553);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1294013553, i, -1, "androidx.compose.foundation.hoverable.<anonymous> (Hoverable.kt:54)");
            }
            interfaceC32720Et0.mo89638F(773894976);
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                Object c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, interfaceC32720Et0));
                interfaceC32720Et0.mo89503z(c42992iu0);
                mo89635G = c42992iu0;
            }
            interfaceC32720Et0.mo89605Q();
            ZC0 m31665a = ((C42992iu0) mo89635G).m31665a();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = LM5.m97025e(null, null, 2, null);
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            EX2 ex2 = (EX2) mo89635G2;
            InterfaceC48104rX2 interfaceC48104rX2 = this.f97861g;
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(ex2) | interfaceC32720Et0.mo89539n(interfaceC48104rX2);
            Object mo89635G3 = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G3 == c2012a.m108267a()) {
                mo89635G3 = new C26050a(ex2, interfaceC48104rX2);
                interfaceC32720Et0.mo89503z(mo89635G3);
            }
            interfaceC32720Et0.mo89605Q();
            Y91.m75536c(interfaceC48104rX2, (Function1) mo89635G3, interfaceC32720Et0, 0);
            Boolean valueOf = Boolean.valueOf(this.f97862h);
            Object valueOf2 = Boolean.valueOf(this.f97862h);
            InterfaceC48104rX2 interfaceC48104rX22 = this.f97861g;
            boolean z = this.f97862h;
            interfaceC32720Et0.mo89638F(1618982084);
            boolean mo89539n2 = interfaceC32720Et0.mo89539n(valueOf2) | interfaceC32720Et0.mo89539n(ex2) | interfaceC32720Et0.mo89539n(interfaceC48104rX22);
            Object mo89635G4 = interfaceC32720Et0.mo89635G();
            if (mo89539n2 || mo89635G4 == c2012a.m108267a()) {
                mo89635G4 = new C26052b(z, ex2, interfaceC48104rX22, null);
                interfaceC32720Et0.mo89503z(mo89635G4);
            }
            interfaceC32720Et0.mo89605Q();
            Y91.m75533f(valueOf, (Function2) mo89635G4, interfaceC32720Et0, 64);
            if (this.f97862h) {
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                InterfaceC48104rX2 interfaceC48104rX23 = this.f97861g;
                interfaceC41563gV2 = C52840zW5.m1270c(c20912a, interfaceC48104rX23, new C26053c(m31665a, interfaceC48104rX23, ex2, null));
            } else {
                interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return interfaceC41563gV2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m25789d(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m25794a(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC48104rX2 interactionSource, boolean z) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        if (K32.m99301c()) {
            m99303a = new C26048a(interactionSource, z);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, new C26049b(interactionSource, z));
    }
}
