package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m28432d2 = {"LtX3;", "LZ06;", "observer", "", DateTokenConverter.CONVERTER_KEY, "(LtX3;LZ06;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "f", "e", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: kz2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44230kz2 {

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lzh2;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", m28418f = "LongPressTextDragObserver.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: kz2$a */
    /* loaded from: classes.dex */
    public static final class C25568a extends SuspendLambda implements Function2<ZC0, Continuation<? super InterfaceC52943zh2>, Object> {

        /* renamed from: h */
        public int f95307h;

        /* renamed from: i */
        public /* synthetic */ Object f95308i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC49290tX3 f95309j;

        /* renamed from: k */
        public final /* synthetic */ Z06 f95310k;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", m28418f = "LongPressTextDragObserver.kt", m28417i = {}, m28416l = {82}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: kz2$a$a */
        /* loaded from: classes.dex */
        public static final class C25569a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f95311h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC49290tX3 f95312i;

            /* renamed from: j */
            public final /* synthetic */ Z06 f95313j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25569a(InterfaceC49290tX3 interfaceC49290tX3, Z06 z06, Continuation<? super C25569a> continuation) {
                super(2, continuation);
                this.f95312i = interfaceC49290tX3;
                this.f95313j = z06;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C25569a(this.f95312i, this.f95313j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C25569a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f95311h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC49290tX3 interfaceC49290tX3 = this.f95312i;
                    Z06 z06 = this.f95313j;
                    this.f95311h = 1;
                    if (C44230kz2.m28047f(interfaceC49290tX3, z06, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", m28418f = "LongPressTextDragObserver.kt", m28417i = {}, m28416l = {85}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: kz2$a$b */
        /* loaded from: classes.dex */
        public static final class C25570b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f95314h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC49290tX3 f95315i;

            /* renamed from: j */
            public final /* synthetic */ Z06 f95316j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25570b(InterfaceC49290tX3 interfaceC49290tX3, Z06 z06, Continuation<? super C25570b> continuation) {
                super(2, continuation);
                this.f95315i = interfaceC49290tX3;
                this.f95316j = z06;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C25570b(this.f95315i, this.f95316j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C25570b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f95314h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC49290tX3 interfaceC49290tX3 = this.f95315i;
                    Z06 z06 = this.f95316j;
                    this.f95314h = 1;
                    if (C44230kz2.m28048e(interfaceC49290tX3, z06, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25568a(InterfaceC49290tX3 interfaceC49290tX3, Z06 z06, Continuation<? super C25568a> continuation) {
            super(2, continuation);
            this.f95309j = interfaceC49290tX3;
            this.f95310k = z06;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25568a c25568a = new C25568a(this.f95309j, this.f95310k, continuation);
            c25568a.f95308i = obj;
            return c25568a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super InterfaceC52943zh2> continuation) {
            return ((C25568a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC52943zh2 m73800d;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f95307h == 0) {
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = (ZC0) this.f95308i;
                Z30.m73800d(zc0, null, null, new C25569a(this.f95309j, this.f95310k, null), 3, null);
                m73800d = Z30.m73800d(zc0, null, null, new C25570b(this.f95309j, this.f95310k, null), 3, null);
                return m73800d;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LCe3;", "it", "", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kz2$b */
    /* loaded from: classes.dex */
    public static final class C25571b extends Lambda implements Function1<C32120Ce3, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Z06 f95317g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25571b(Z06 z06) {
            super(1);
            this.f95317g = z06;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C32120Ce3 c32120Ce3) {
            m118302invokek4lQ0M(c32120Ce3.m111935x());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
        public final void m118302invokek4lQ0M(long j) {
            this.f95317g.mo5919d(j);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: kz2$c */
    /* loaded from: classes.dex */
    public static final class C25572c extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ Z06 f95318g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25572c(Z06 z06) {
            super(0);
            this.f95318g = z06;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f95318g.onStop();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: kz2$d */
    /* loaded from: classes.dex */
    public static final class C25573d extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ Z06 f95319g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25573d(Z06 z06) {
            super(0);
            this.f95319g = z06;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f95319g.mo5922a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LjX3;", "<anonymous parameter 0>", "LCe3;", "offset", "", C17296a.f69688o, "(LjX3;J)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kz2$e */
    /* loaded from: classes.dex */
    public static final class C25574e extends Lambda implements Function2<C43361jX3, C32120Ce3, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Z06 f95320g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25574e(Z06 z06) {
            super(2);
            this.f95320g = z06;
        }

        /* renamed from: a */
        public final void m28046a(C43361jX3 c43361jX3, long j) {
            Intrinsics.checkNotNullParameter(c43361jX3, "<anonymous parameter 0>");
            this.f95320g.mo5920c(j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(C43361jX3 c43361jX3, C32120Ce3 c32120Ce3) {
            m28046a(c43361jX3, c32120Ce3.m111935x());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LCe3;", "it", "", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kz2$f */
    /* loaded from: classes.dex */
    public static final class C25575f extends Lambda implements Function1<C32120Ce3, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Z06 f95321g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25575f(Z06 z06) {
            super(1);
            this.f95321g = z06;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C32120Ce3 c32120Ce3) {
            m118303invokek4lQ0M(c32120Ce3.m111935x());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
        public final void m118303invokek4lQ0M(long j) {
            this.f95321g.mo5919d(j);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: kz2$g */
    /* loaded from: classes.dex */
    public static final class C25576g extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ Z06 f95322g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25576g(Z06 z06) {
            super(0);
            this.f95322g = z06;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f95322g.onStop();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: kz2$h */
    /* loaded from: classes.dex */
    public static final class C25577h extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ Z06 f95323g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25577h(Z06 z06) {
            super(0);
            this.f95323g = z06;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f95323g.mo5922a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LjX3;", "<anonymous parameter 0>", "LCe3;", "offset", "", C17296a.f69688o, "(LjX3;J)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kz2$i */
    /* loaded from: classes.dex */
    public static final class C25578i extends Lambda implements Function2<C43361jX3, C32120Ce3, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Z06 f95324g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25578i(Z06 z06) {
            super(2);
            this.f95324g = z06;
        }

        /* renamed from: a */
        public final void m28045a(C43361jX3 c43361jX3, long j) {
            Intrinsics.checkNotNullParameter(c43361jX3, "<anonymous parameter 0>");
            this.f95324g.mo5920c(j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(C43361jX3 c43361jX3, C32120Ce3 c32120Ce3) {
            m28045a(c43361jX3, c32120Ce3.m111935x());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWu;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", m28418f = "LongPressTextDragObserver.kt", m28417i = {0, 1, 1}, m28416l = {98, 102}, m28415m = "invokeSuspend", m28414n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, m28413s = {"L$0", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nLongPressTextDragObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,124:1\n101#2,2:125\n33#2,6:127\n103#2:133\n*S KotlinDebug\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n*L\n103#1:125,2\n103#1:127,6\n103#1:133\n*E\n"})
    /* renamed from: kz2$j */
    /* loaded from: classes.dex */
    public static final class C25579j extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f95325h;

        /* renamed from: i */
        public int f95326i;

        /* renamed from: j */
        public /* synthetic */ Object f95327j;

        /* renamed from: k */
        public final /* synthetic */ Z06 f95328k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25579j(Z06 z06, Continuation<? super C25579j> continuation) {
            super(2, continuation);
            this.f95328k = z06;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25579j c25579j = new C25579j(this.f95328k, continuation);
            c25579j.f95327j = obj;
            return c25579j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
            return ((C25579j) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[EDGE_INSN: B:32:0x0099->B:28:0x0099 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:17:0x0067). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r6 = r16
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r6.f95326i
                r8 = 2
                r9 = 1
                if (r0 == 0) goto L32
                if (r0 == r9) goto L27
                if (r0 != r8) goto L1f
                java.lang.Object r0 = r6.f95325h
                jX3 r0 = (p000.C43361jX3) r0
                java.lang.Object r1 = r6.f95327j
                Wu r1 = (p000.InterfaceC9204Wu) r1
                kotlin.ResultKt.throwOnFailure(r17)
                r3 = r17
                r2 = r6
                goto L67
            L1f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L27:
                java.lang.Object r0 = r6.f95327j
                Wu r0 = (p000.InterfaceC9204Wu) r0
                kotlin.ResultKt.throwOnFailure(r17)
                r10 = r0
                r0 = r17
                goto L4c
            L32:
                kotlin.ResultKt.throwOnFailure(r17)
                java.lang.Object r0 = r6.f95327j
                r10 = r0
                Wu r10 = (p000.InterfaceC9204Wu) r10
                r1 = 0
                r2 = 0
                r4 = 3
                r5 = 0
                r6.f95327j = r10
                r6.f95326i = r9
                r0 = r10
                r3 = r16
                java.lang.Object r0 = p000.KY5.m98773e(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L4c
                return r7
            L4c:
                jX3 r0 = (p000.C43361jX3) r0
                Z06 r1 = r6.f95328k
                long r2 = r0.m30359f()
                r1.mo5921b(r2)
                r2 = r6
                r1 = r10
            L59:
                r2.f95327j = r1
                r2.f95325h = r0
                r2.f95326i = r8
                r3 = 0
                java.lang.Object r3 = p000.InterfaceC9204Wu.m77725U(r1, r3, r2, r9, r3)
                if (r3 != r7) goto L67
                return r7
            L67:
                YW3 r3 = (p000.YW3) r3
                java.util.List r3 = r3.m74945c()
                int r4 = r3.size()
                r5 = 0
                r10 = r5
            L73:
                if (r10 >= r4) goto L99
                java.lang.Object r11 = r3.get(r10)
                jX3 r11 = (p000.C43361jX3) r11
                long r12 = r11.m30360e()
                long r14 = r0.m30360e()
                boolean r12 = p000.C42768iX3.m33834d(r12, r14)
                if (r12 == 0) goto L91
                boolean r11 = r11.m30358g()
                if (r11 == 0) goto L91
                r11 = r9
                goto L92
            L91:
                r11 = r5
            L92:
                if (r11 == 0) goto L96
                r5 = r9
                goto L99
            L96:
                int r10 = r10 + 1
                goto L73
            L99:
                if (r5 != 0) goto L59
                Z06 r0 = r2.f95328k
                r0.mo5918e()
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C44230kz2.C25579j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: c */
    public static final Object m28050c(InterfaceC49290tX3 interfaceC49290tX3, Z06 z06, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m71786e = C37824aD0.m71786e(new C25568a(interfaceC49290tX3, z06, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m71786e == coroutine_suspended ? m71786e : Unit.INSTANCE;
    }

    /* renamed from: d */
    public static final Object m28049d(InterfaceC49290tX3 interfaceC49290tX3, Z06 z06, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m18182e = C47263q61.m18182e(interfaceC49290tX3, new C25571b(z06), new C25572c(z06), new C25573d(z06), new C25574e(z06), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m18182e == coroutine_suspended ? m18182e : Unit.INSTANCE;
    }

    /* renamed from: e */
    public static final Object m28048e(InterfaceC49290tX3 interfaceC49290tX3, Z06 z06, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m18183d = C47263q61.m18183d(interfaceC49290tX3, new C25575f(z06), new C25576g(z06), new C25577h(z06), new C25578i(z06), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m18183d == coroutine_suspended ? m18183d : Unit.INSTANCE;
    }

    /* renamed from: f */
    public static final Object m28047f(InterfaceC49290tX3 interfaceC49290tX3, Z06 z06, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m94550c = C34620Mw1.m94550c(interfaceC49290tX3, new C25579j(z06, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m94550c == coroutine_suspended ? m94550c : Unit.INSTANCE;
    }
}
