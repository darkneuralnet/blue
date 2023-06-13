package p000;

import androidx.compose.p003ui.input.pointer.PointerEventTimeoutCancellationException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.DurationKt;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0093\u0001\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u0003*\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0014\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001ac\u0010\u0016\u001a\u00020\u0003*\u00020\u00002/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001c\u001a\u00020\u0012*\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001e\u001a\u0004\u0018\u00010\u0012*\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"A\u0010\"\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"LtX3;", "Lkotlin/Function1;", "LCe3;", "", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "LN14;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onPress", "onTap", "i", "(LtX3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LWu;", "g", "(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LjX3;", "firstUp", "f", "(LWu;LjX3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "(LtX3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requireUnconsumed", "LaX3;", "pass", DateTokenConverter.CONVERTER_KEY, "(LWu;ZLaX3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "(LWu;LaX3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", C17296a.f69688o, "Lkotlin/jvm/functions/Function3;", "NoPressGesture", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,376:1\n33#2,6:377\n101#2,2:383\n33#2,6:385\n103#2:391\n86#2,2:392\n33#2,6:394\n88#2:400\n86#2,2:401\n33#2,6:403\n88#2:409\n101#2,2:410\n33#2,6:412\n103#2:418\n101#2,2:419\n33#2,6:421\n103#2:427\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n*L\n196#1:377,6\n197#1:383,2\n197#1:385,6\n197#1:391\n281#1:392,2\n281#1:394,6\n281#1:400\n306#1:401,2\n306#1:403,6\n306#1:409\n311#1:410,2\n311#1:412,6\n311#1:418\n321#1:419,2\n321#1:421,6\n321#1:427\n*E\n"})
/* renamed from: KY5 */
/* loaded from: classes.dex */
public final class KY5 {

    /* renamed from: a */
    public static final Function3<N14, C32120Ce3, Continuation<? super Unit>, Object> f19762a = new C4465a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m28432d2 = {"LN14;", "LCe3;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: KY5$a */
    /* loaded from: classes.dex */
    public static final class C4465a extends SuspendLambda implements Function3<N14, C32120Ce3, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f19763h;

        public C4465a(Continuation<? super C4465a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(N14 n14, C32120Ce3 c32120Ce3, Continuation<? super Unit> continuation) {
            return m116226invoked4ec7I(n14, c32120Ce3.m111935x(), continuation);
        }

        /* renamed from: invoke-d-4ec7I */
        public final Object m116226invoked4ec7I(N14 n14, long j, Continuation<? super Unit> continuation) {
            return new C4465a(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f19763h == 0) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m28418f = "TapGestureDetector.kt", m28417i = {0, 0, 0}, m28416l = {279}, m28415m = "awaitFirstDown", m28414n = {"$this$awaitFirstDown", "pass", "requireUnconsumed"}, m28413s = {"L$0", "L$1", "Z$0"})
    /* renamed from: KY5$b */
    /* loaded from: classes.dex */
    public static final class C4466b extends ContinuationImpl {

        /* renamed from: h */
        public Object f19764h;

        /* renamed from: i */
        public Object f19765i;

        /* renamed from: j */
        public boolean f19766j;

        /* renamed from: k */
        public /* synthetic */ Object f19767k;

        /* renamed from: l */
        public int f19768l;

        public C4466b(Continuation<? super C4466b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19767k = obj;
            this.f19768l |= Integer.MIN_VALUE;
            return KY5.m98774d(null, false, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWu;", "LjX3;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", m28418f = "TapGestureDetector.kt", m28417i = {0, 0}, m28416l = {212}, m28415m = "invokeSuspend", m28414n = {"$this$withTimeoutOrNull", "minUptime"}, m28413s = {"L$0", "J$0"})
    /* renamed from: KY5$c */
    /* loaded from: classes.dex */
    public static final class C4467c extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super C43361jX3>, Object> {

        /* renamed from: h */
        public long f19769h;

        /* renamed from: i */
        public int f19770i;

        /* renamed from: j */
        public /* synthetic */ Object f19771j;

        /* renamed from: k */
        public final /* synthetic */ C43361jX3 f19772k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4467c(C43361jX3 c43361jX3, Continuation<? super C4467c> continuation) {
            super(2, continuation);
            this.f19772k = c43361jX3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C4467c c4467c = new C4467c(this.f19772k, continuation);
            c4467c.f19771j = obj;
            return c4467c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super C43361jX3> continuation) {
            return ((C4467c) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x004d -> B:30:0x0052). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC9204Wu interfaceC9204Wu;
            long m30352m;
            C4467c c4467c;
            Object m98773e;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f19770i;
            if (i != 0) {
                if (i == 1) {
                    long j = this.f19769h;
                    ResultKt.throwOnFailure(obj);
                    m30352m = j;
                    InterfaceC9204Wu interfaceC9204Wu2 = (InterfaceC9204Wu) this.f19771j;
                    Object obj2 = coroutine_suspended;
                    C4467c c4467c2 = this;
                    C43361jX3 c43361jX3 = (C43361jX3) obj;
                    if (c43361jX3.m30352m() < m30352m) {
                        return c43361jX3;
                    }
                    c4467c = c4467c2;
                    coroutine_suspended = obj2;
                    interfaceC9204Wu = interfaceC9204Wu2;
                    c4467c.f19771j = interfaceC9204Wu;
                    c4467c.f19769h = m30352m;
                    c4467c.f19770i = 1;
                    m98773e = KY5.m98773e(interfaceC9204Wu, false, null, c4467c, 3, null);
                    if (m98773e != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Object obj3 = coroutine_suspended;
                    c4467c2 = c4467c;
                    obj = m98773e;
                    interfaceC9204Wu2 = interfaceC9204Wu;
                    obj2 = obj3;
                    C43361jX3 c43361jX32 = (C43361jX3) obj;
                    if (c43361jX32.m30352m() < m30352m) {
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC9204Wu interfaceC9204Wu3 = (InterfaceC9204Wu) this.f19771j;
                interfaceC9204Wu = interfaceC9204Wu3;
                m30352m = this.f19772k.m30352m() + interfaceC9204Wu3.mo3400s().mo42676a();
                c4467c = this;
                c4467c.f19771j = interfaceC9204Wu;
                c4467c.f19769h = m30352m;
                c4467c.f19770i = 1;
                m98773e = KY5.m98773e(interfaceC9204Wu, false, null, c4467c, 3, null);
                if (m98773e != coroutine_suspended) {
                }
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m28418f = "TapGestureDetector.kt", m28417i = {0}, m28416l = {195}, m28415m = "consumeUntilUp", m28414n = {"$this$consumeUntilUp"}, m28413s = {"L$0"})
    /* renamed from: KY5$d */
    /* loaded from: classes.dex */
    public static final class C4468d extends ContinuationImpl {

        /* renamed from: h */
        public Object f19773h;

        /* renamed from: i */
        public /* synthetic */ Object f19774i;

        /* renamed from: j */
        public int f19775j;

        public C4468d(Continuation<? super C4468d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19774i = obj;
            this.f19775j |= Integer.MIN_VALUE;
            return KY5.m98771g(null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {232}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: KY5$e */
    /* loaded from: classes.dex */
    public static final class C4469e extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f19776h;

        /* renamed from: i */
        public /* synthetic */ Object f19777i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC49290tX3 f19778j;

        /* renamed from: k */
        public final /* synthetic */ Function3<N14, C32120Ce3, Continuation<? super Unit>, Object> f19779k;

        /* renamed from: l */
        public final /* synthetic */ Function1<C32120Ce3, Unit> f19780l;

        /* renamed from: m */
        public final /* synthetic */ O14 f19781m;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWu;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", m28418f = "TapGestureDetector.kt", m28417i = {0}, m28416l = {237, 245}, m28415m = "invokeSuspend", m28414n = {"$this$awaitEachGesture"}, m28413s = {"L$0"})
        @SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
        /* renamed from: KY5$e$a */
        /* loaded from: classes.dex */
        public static final class C4470a extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f19782h;

            /* renamed from: i */
            public /* synthetic */ Object f19783i;

            /* renamed from: j */
            public final /* synthetic */ ZC0 f19784j;

            /* renamed from: k */
            public final /* synthetic */ Function3<N14, C32120Ce3, Continuation<? super Unit>, Object> f19785k;

            /* renamed from: l */
            public final /* synthetic */ Function1<C32120Ce3, Unit> f19786l;

            /* renamed from: m */
            public final /* synthetic */ O14 f19787m;

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {234}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: KY5$e$a$a */
            /* loaded from: classes.dex */
            public static final class C4471a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f19788h;

                /* renamed from: i */
                public final /* synthetic */ O14 f19789i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4471a(O14 o14, Continuation<? super C4471a> continuation) {
                    super(2, continuation);
                    this.f19789i = o14;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C4471a(this.f19789i, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C4471a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f19788h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        O14 o14 = this.f19789i;
                        this.f19788h = 1;
                        if (o14.m92992e(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {241}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: KY5$e$a$b */
            /* loaded from: classes.dex */
            public static final class C4472b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f19790h;

                /* renamed from: i */
                public final /* synthetic */ Function3<N14, C32120Ce3, Continuation<? super Unit>, Object> f19791i;

                /* renamed from: j */
                public final /* synthetic */ O14 f19792j;

                /* renamed from: k */
                public final /* synthetic */ C43361jX3 f19793k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C4472b(Function3<? super N14, ? super C32120Ce3, ? super Continuation<? super Unit>, ? extends Object> function3, O14 o14, C43361jX3 c43361jX3, Continuation<? super C4472b> continuation) {
                    super(2, continuation);
                    this.f19791i = function3;
                    this.f19792j = o14;
                    this.f19793k = c43361jX3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C4472b(this.f19791i, this.f19792j, this.f19793k, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C4472b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f19790h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Function3<N14, C32120Ce3, Continuation<? super Unit>, Object> function3 = this.f19791i;
                        O14 o14 = this.f19792j;
                        C32120Ce3 m111955d = C32120Ce3.m111955d(this.f19793k.m30359f());
                        this.f19790h = 1;
                        if (function3.invoke(o14, m111955d, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: KY5$e$a$c */
            /* loaded from: classes.dex */
            public static final class C4473c extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f19794h;

                /* renamed from: i */
                public final /* synthetic */ O14 f19795i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4473c(O14 o14, Continuation<? super C4473c> continuation) {
                    super(2, continuation);
                    this.f19795i = o14;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C4473c(this.f19795i, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C4473c) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f19794h == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f19795i.m92994c();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: KY5$e$a$d */
            /* loaded from: classes.dex */
            public static final class C4474d extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f19796h;

                /* renamed from: i */
                public final /* synthetic */ O14 f19797i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4474d(O14 o14, Continuation<? super C4474d> continuation) {
                    super(2, continuation);
                    this.f19797i = o14;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C4474d(this.f19797i, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C4474d) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f19796h == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f19797i.m92993d();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4470a(ZC0 zc0, Function3<? super N14, ? super C32120Ce3, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super C32120Ce3, Unit> function1, O14 o14, Continuation<? super C4470a> continuation) {
                super(2, continuation);
                this.f19784j = zc0;
                this.f19785k = function3;
                this.f19786l = function1;
                this.f19787m = o14;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C4470a c4470a = new C4470a(this.f19784j, this.f19785k, this.f19786l, this.f19787m, continuation);
                c4470a.f19783i = obj;
                return c4470a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: e */
            public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
                return ((C4470a) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                InterfaceC9204Wu interfaceC9204Wu;
                Object m98773e;
                Object m98766l;
                C43361jX3 c43361jX3;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f19782h;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            m98766l = obj;
                            c43361jX3 = (C43361jX3) m98766l;
                            if (c43361jX3 != null) {
                                Z30.m73800d(this.f19784j, null, null, new C4473c(this.f19787m, null), 3, null);
                            } else {
                                c43361jX3.m30364a();
                                Z30.m73800d(this.f19784j, null, null, new C4474d(this.f19787m, null), 3, null);
                                Function1<C32120Ce3, Unit> function1 = this.f19786l;
                                if (function1 != null) {
                                    function1.invoke(C32120Ce3.m111955d(c43361jX3.m30359f()));
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    interfaceC9204Wu = (InterfaceC9204Wu) this.f19783i;
                    m98773e = obj;
                } else {
                    ResultKt.throwOnFailure(obj);
                    interfaceC9204Wu = (InterfaceC9204Wu) this.f19783i;
                    Z30.m73800d(this.f19784j, null, null, new C4471a(this.f19787m, null), 3, null);
                    this.f19783i = interfaceC9204Wu;
                    this.f19782h = 1;
                    m98773e = KY5.m98773e(interfaceC9204Wu, false, null, this, 3, null);
                    if (m98773e == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                C43361jX3 c43361jX32 = (C43361jX3) m98773e;
                c43361jX32.m30364a();
                if (this.f19785k != KY5.f19762a) {
                    Z30.m73800d(this.f19784j, null, null, new C4472b(this.f19785k, this.f19787m, c43361jX32, null), 3, null);
                }
                this.f19783i = null;
                this.f19782h = 2;
                m98766l = KY5.m98766l(interfaceC9204Wu, null, this, 1, null);
                if (m98766l == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c43361jX3 = (C43361jX3) m98766l;
                if (c43361jX3 != null) {
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4469e(InterfaceC49290tX3 interfaceC49290tX3, Function3<? super N14, ? super C32120Ce3, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super C32120Ce3, Unit> function1, O14 o14, Continuation<? super C4469e> continuation) {
            super(2, continuation);
            this.f19778j = interfaceC49290tX3;
            this.f19779k = function3;
            this.f19780l = function1;
            this.f19781m = o14;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C4469e c4469e = new C4469e(this.f19778j, this.f19779k, this.f19780l, this.f19781m, continuation);
            c4469e.f19777i = obj;
            return c4469e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C4469e) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f19776h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = (ZC0) this.f19777i;
                InterfaceC49290tX3 interfaceC49290tX3 = this.f19778j;
                C4470a c4470a = new C4470a(zc0, this.f19779k, this.f19780l, this.f19781m, null);
                this.f19776h = 1;
                if (C34620Mw1.m94550c(interfaceC49290tX3, c4470a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {99}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: KY5$f */
    /* loaded from: classes.dex */
    public static final class C4475f extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f19798h;

        /* renamed from: i */
        public /* synthetic */ Object f19799i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC49290tX3 f19800j;

        /* renamed from: k */
        public final /* synthetic */ Function3<N14, C32120Ce3, Continuation<? super Unit>, Object> f19801k;

        /* renamed from: l */
        public final /* synthetic */ Function1<C32120Ce3, Unit> f19802l;

        /* renamed from: m */
        public final /* synthetic */ Function1<C32120Ce3, Unit> f19803m;

        /* renamed from: n */
        public final /* synthetic */ Function1<C32120Ce3, Unit> f19804n;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWu;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", m28418f = "TapGestureDetector.kt", m28417i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, m28416l = {100, 114, 129, 141, 156, 178}, m28415m = "invokeSuspend", m28414n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "secondDown"}, m28413s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
        /* renamed from: KY5$f$a */
        /* loaded from: classes.dex */
        public static final class C4476a extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public Object f19805h;

            /* renamed from: i */
            public Object f19806i;

            /* renamed from: j */
            public Object f19807j;

            /* renamed from: k */
            public long f19808k;

            /* renamed from: l */
            public int f19809l;

            /* renamed from: m */
            public /* synthetic */ Object f19810m;

            /* renamed from: n */
            public final /* synthetic */ ZC0 f19811n;

            /* renamed from: o */
            public final /* synthetic */ Function3<N14, C32120Ce3, Continuation<? super Unit>, Object> f19812o;

            /* renamed from: p */
            public final /* synthetic */ Function1<C32120Ce3, Unit> f19813p;

            /* renamed from: q */
            public final /* synthetic */ Function1<C32120Ce3, Unit> f19814q;

            /* renamed from: r */
            public final /* synthetic */ Function1<C32120Ce3, Unit> f19815r;

            /* renamed from: s */
            public final /* synthetic */ O14 f19816s;

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: KY5$f$a$a */
            /* loaded from: classes.dex */
            public static final class C4477a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f19817h;

                /* renamed from: i */
                public final /* synthetic */ O14 f19818i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4477a(O14 o14, Continuation<? super C4477a> continuation) {
                    super(2, continuation);
                    this.f19818i = o14;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C4477a(this.f19818i, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C4477a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f19817h == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f19818i.m92993d();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {103}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: KY5$f$a$b */
            /* loaded from: classes.dex */
            public static final class C4478b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f19819h;

                /* renamed from: i */
                public final /* synthetic */ O14 f19820i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4478b(O14 o14, Continuation<? super C4478b> continuation) {
                    super(2, continuation);
                    this.f19820i = o14;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C4478b(this.f19820i, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C4478b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f19819h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        O14 o14 = this.f19820i;
                        this.f19819h = 1;
                        if (o14.m92992e(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {106}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: KY5$f$a$c */
            /* loaded from: classes.dex */
            public static final class C4479c extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f19821h;

                /* renamed from: i */
                public final /* synthetic */ Function3<N14, C32120Ce3, Continuation<? super Unit>, Object> f19822i;

                /* renamed from: j */
                public final /* synthetic */ O14 f19823j;

                /* renamed from: k */
                public final /* synthetic */ C43361jX3 f19824k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C4479c(Function3<? super N14, ? super C32120Ce3, ? super Continuation<? super Unit>, ? extends Object> function3, O14 o14, C43361jX3 c43361jX3, Continuation<? super C4479c> continuation) {
                    super(2, continuation);
                    this.f19822i = function3;
                    this.f19823j = o14;
                    this.f19824k = c43361jX3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C4479c(this.f19822i, this.f19823j, this.f19824k, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C4479c) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f19821h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Function3<N14, C32120Ce3, Continuation<? super Unit>, Object> function3 = this.f19822i;
                        O14 o14 = this.f19823j;
                        C32120Ce3 m111955d = C32120Ce3.m111955d(this.f19824k.m30359f());
                        this.f19821h = 1;
                        if (function3.invoke(o14, m111955d, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWu;", "LjX3;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {115}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: KY5$f$a$d */
            /* loaded from: classes.dex */
            public static final class C4480d extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super C43361jX3>, Object> {

                /* renamed from: h */
                public int f19825h;

                /* renamed from: i */
                public /* synthetic */ Object f19826i;

                public C4480d(Continuation<? super C4480d> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C4480d c4480d = new C4480d(continuation);
                    c4480d.f19826i = obj;
                    return c4480d;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: e */
                public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super C43361jX3> continuation) {
                    return ((C4480d) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f19825h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        this.f19825h = 1;
                        obj = KY5.m98766l((InterfaceC9204Wu) this.f19826i, null, this, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return obj;
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: KY5$f$a$e */
            /* loaded from: classes.dex */
            public static final class C4481e extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f19827h;

                /* renamed from: i */
                public final /* synthetic */ O14 f19828i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4481e(O14 o14, Continuation<? super C4481e> continuation) {
                    super(2, continuation);
                    this.f19828i = o14;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C4481e(this.f19828i, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C4481e) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f19827h == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f19828i.m92994c();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: KY5$f$a$f */
            /* loaded from: classes.dex */
            public static final class C4482f extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f19829h;

                /* renamed from: i */
                public final /* synthetic */ O14 f19830i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4482f(O14 o14, Continuation<? super C4482f> continuation) {
                    super(2, continuation);
                    this.f19830i = o14;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C4482f(this.f19830i, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C4482f) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f19829h == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f19830i.m92993d();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: KY5$f$a$g */
            /* loaded from: classes.dex */
            public static final class C4483g extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f19831h;

                /* renamed from: i */
                public final /* synthetic */ O14 f19832i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4483g(O14 o14, Continuation<? super C4483g> continuation) {
                    super(2, continuation);
                    this.f19832i = o14;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C4483g(this.f19832i, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C4483g) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f19831h == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f19832i.m92993d();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {148}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: KY5$f$a$h */
            /* loaded from: classes.dex */
            public static final class C4484h extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f19833h;

                /* renamed from: i */
                public final /* synthetic */ O14 f19834i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4484h(O14 o14, Continuation<? super C4484h> continuation) {
                    super(2, continuation);
                    this.f19834i = o14;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C4484h(this.f19834i, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C4484h) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f19833h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        O14 o14 = this.f19834i;
                        this.f19833h = 1;
                        if (o14.m92992e(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {151}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: KY5$f$a$i */
            /* loaded from: classes.dex */
            public static final class C4485i extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f19835h;

                /* renamed from: i */
                public final /* synthetic */ Function3<N14, C32120Ce3, Continuation<? super Unit>, Object> f19836i;

                /* renamed from: j */
                public final /* synthetic */ O14 f19837j;

                /* renamed from: k */
                public final /* synthetic */ C43361jX3 f19838k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C4485i(Function3<? super N14, ? super C32120Ce3, ? super Continuation<? super Unit>, ? extends Object> function3, O14 o14, C43361jX3 c43361jX3, Continuation<? super C4485i> continuation) {
                    super(2, continuation);
                    this.f19836i = function3;
                    this.f19837j = o14;
                    this.f19838k = c43361jX3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C4485i(this.f19836i, this.f19837j, this.f19838k, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C4485i) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f19835h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Function3<N14, C32120Ce3, Continuation<? super Unit>, Object> function3 = this.f19836i;
                        O14 o14 = this.f19837j;
                        C32120Ce3 m111955d = C32120Ce3.m111955d(this.f19838k.m30359f());
                        this.f19835h = 1;
                        if (function3.invoke(o14, m111955d, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWu;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {157}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: KY5$f$a$j */
            /* loaded from: classes.dex */
            public static final class C4486j extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f19839h;

                /* renamed from: i */
                public /* synthetic */ Object f19840i;

                /* renamed from: j */
                public final /* synthetic */ ZC0 f19841j;

                /* renamed from: k */
                public final /* synthetic */ Function1<C32120Ce3, Unit> f19842k;

                /* renamed from: l */
                public final /* synthetic */ Function1<C32120Ce3, Unit> f19843l;

                /* renamed from: m */
                public final /* synthetic */ Ref.ObjectRef<C43361jX3> f19844m;

                /* renamed from: n */
                public final /* synthetic */ O14 f19845n;

                @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                /* renamed from: KY5$f$a$j$a */
                /* loaded from: classes.dex */
                public static final class C4487a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                    /* renamed from: h */
                    public int f19846h;

                    /* renamed from: i */
                    public final /* synthetic */ O14 f19847i;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C4487a(O14 o14, Continuation<? super C4487a> continuation) {
                        super(2, continuation);
                        this.f19847i = o14;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C4487a(this.f19847i, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                        return ((C4487a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.f19846h == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.f19847i.m92993d();
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", m28418f = "TapGestureDetector.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                /* renamed from: KY5$f$a$j$b */
                /* loaded from: classes.dex */
                public static final class C4488b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                    /* renamed from: h */
                    public int f19848h;

                    /* renamed from: i */
                    public final /* synthetic */ O14 f19849i;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C4488b(O14 o14, Continuation<? super C4488b> continuation) {
                        super(2, continuation);
                        this.f19849i = o14;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C4488b(this.f19849i, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                        return ((C4488b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.f19848h == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.f19849i.m92994c();
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C4486j(ZC0 zc0, Function1<? super C32120Ce3, Unit> function1, Function1<? super C32120Ce3, Unit> function12, Ref.ObjectRef<C43361jX3> objectRef, O14 o14, Continuation<? super C4486j> continuation) {
                    super(2, continuation);
                    this.f19841j = zc0;
                    this.f19842k = function1;
                    this.f19843l = function12;
                    this.f19844m = objectRef;
                    this.f19845n = o14;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C4486j c4486j = new C4486j(this.f19841j, this.f19842k, this.f19843l, this.f19844m, this.f19845n, continuation);
                    c4486j.f19840i = obj;
                    return c4486j;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: e */
                public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
                    return ((C4486j) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f19839h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        this.f19839h = 1;
                        obj = KY5.m98766l((InterfaceC9204Wu) this.f19840i, null, this, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    C43361jX3 c43361jX3 = (C43361jX3) obj;
                    if (c43361jX3 != null) {
                        c43361jX3.m30364a();
                        Z30.m73800d(this.f19841j, null, null, new C4487a(this.f19845n, null), 3, null);
                        this.f19842k.invoke(C32120Ce3.m111955d(c43361jX3.m30359f()));
                        return Unit.INSTANCE;
                    }
                    Z30.m73800d(this.f19841j, null, null, new C4488b(this.f19845n, null), 3, null);
                    Function1<C32120Ce3, Unit> function1 = this.f19843l;
                    if (function1 == null) {
                        return null;
                    }
                    function1.invoke(C32120Ce3.m111955d(this.f19844m.element.m30359f()));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4476a(ZC0 zc0, Function3<? super N14, ? super C32120Ce3, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super C32120Ce3, Unit> function1, Function1<? super C32120Ce3, Unit> function12, Function1<? super C32120Ce3, Unit> function13, O14 o14, Continuation<? super C4476a> continuation) {
                super(2, continuation);
                this.f19811n = zc0;
                this.f19812o = function3;
                this.f19813p = function1;
                this.f19814q = function12;
                this.f19815r = function13;
                this.f19816s = o14;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C4476a c4476a = new C4476a(this.f19811n, this.f19812o, this.f19813p, this.f19814q, this.f19815r, this.f19816s, continuation);
                c4476a.f19810m = obj;
                return c4476a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: e */
            public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
                return ((C4476a) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:119:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:122:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x00cf  */
            /* JADX WARN: Removed duplicated region for block: B:127:0x00f1 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:128:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:131:0x00fb A[Catch: PointerEventTimeoutCancellationException -> 0x0122, TryCatch #2 {PointerEventTimeoutCancellationException -> 0x0122, blocks: (B:129:0x00f5, B:131:0x00fb, B:132:0x010c), top: B:184:0x00f5 }] */
            /* JADX WARN: Removed duplicated region for block: B:132:0x010c A[Catch: PointerEventTimeoutCancellationException -> 0x0122, TRY_LEAVE, TryCatch #2 {PointerEventTimeoutCancellationException -> 0x0122, blocks: (B:129:0x00f5, B:131:0x00fb, B:132:0x010c), top: B:184:0x00f5 }] */
            /* JADX WARN: Removed duplicated region for block: B:137:0x0129  */
            /* JADX WARN: Removed duplicated region for block: B:140:0x0147 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:144:0x015e  */
            /* JADX WARN: Removed duplicated region for block: B:155:0x0190  */
            /* JADX WARN: Removed duplicated region for block: B:158:0x01a5  */
            /* JADX WARN: Removed duplicated region for block: B:167:0x01f6  */
            /* JADX WARN: Removed duplicated region for block: B:170:0x0209  */
            /* JADX WARN: Removed duplicated region for block: B:173:0x0223 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                Object m98773e;
                InterfaceC9204Wu interfaceC9204Wu;
                C43361jX3 c43361jX3;
                long j;
                Ref.ObjectRef objectRef;
                Object mo3413Q;
                InterfaceC9204Wu interfaceC9204Wu2;
                C43361jX3 c43361jX32;
                Ref.ObjectRef objectRef2;
                InterfaceC9204Wu interfaceC9204Wu3;
                Function1<C32120Ce3, Unit> function1;
                T t;
                Object obj2;
                Object obj3;
                Object m98772f;
                InterfaceC9204Wu interfaceC9204Wu4;
                C43361jX3 c43361jX33;
                C43361jX3 c43361jX34;
                InterfaceC9204Wu interfaceC9204Wu5;
                Ref.ObjectRef objectRef3;
                Function1<C32120Ce3, Unit> function12;
                Function1<C32120Ce3, Unit> function13;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.f19809l) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        InterfaceC9204Wu interfaceC9204Wu6 = (InterfaceC9204Wu) this.f19810m;
                        this.f19810m = interfaceC9204Wu6;
                        this.f19809l = 1;
                        m98773e = KY5.m98773e(interfaceC9204Wu6, false, null, this, 3, null);
                        if (m98773e == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        interfaceC9204Wu = interfaceC9204Wu6;
                        c43361jX3 = (C43361jX3) m98773e;
                        c43361jX3.m30364a();
                        Z30.m73800d(this.f19811n, null, null, new C4478b(this.f19816s, null), 3, null);
                        if (this.f19812o != KY5.f19762a) {
                            Z30.m73800d(this.f19811n, null, null, new C4479c(this.f19812o, this.f19816s, c43361jX3, null), 3, null);
                        }
                        if (this.f19813p == null) {
                            j = interfaceC9204Wu.mo3400s().mo42673d();
                        } else {
                            j = DurationKt.MAX_MILLIS;
                        }
                        objectRef = new Ref.ObjectRef();
                        try {
                            C4480d c4480d = new C4480d(null);
                            this.f19810m = interfaceC9204Wu;
                            this.f19805h = c43361jX3;
                            this.f19806i = objectRef;
                            this.f19807j = objectRef;
                            this.f19808k = j;
                            this.f19809l = 2;
                            mo3413Q = interfaceC9204Wu.mo3413Q(j, c4480d, this);
                        } catch (PointerEventTimeoutCancellationException unused) {
                            interfaceC9204Wu3 = interfaceC9204Wu;
                            function1 = this.f19813p;
                            if (function1 != null) {
                                function1.invoke(C32120Ce3.m111955d(c43361jX3.m30359f()));
                            }
                            this.f19810m = interfaceC9204Wu3;
                            this.f19805h = objectRef;
                            this.f19806i = null;
                            this.f19807j = null;
                            this.f19808k = j;
                            this.f19809l = 3;
                            if (KY5.m98771g(interfaceC9204Wu3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Z30.m73800d(this.f19811n, null, null, new C4483g(this.f19816s, null), 3, null);
                            objectRef2 = objectRef;
                            interfaceC9204Wu2 = interfaceC9204Wu3;
                            obj3 = objectRef2.element;
                            if (obj3 != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (mo3413Q != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        interfaceC9204Wu2 = interfaceC9204Wu;
                        c43361jX32 = c43361jX3;
                        objectRef2 = objectRef;
                        t = mo3413Q;
                        try {
                            objectRef.element = t;
                            obj2 = objectRef2.element;
                            if (obj2 != null) {
                                Z30.m73800d(this.f19811n, null, null, new C4481e(this.f19816s, null), 3, null);
                            } else {
                                ((C43361jX3) obj2).m30364a();
                                Z30.m73800d(this.f19811n, null, null, new C4482f(this.f19816s, null), 3, null);
                            }
                        } catch (PointerEventTimeoutCancellationException unused2) {
                            objectRef = objectRef2;
                            c43361jX3 = c43361jX32;
                            interfaceC9204Wu3 = interfaceC9204Wu2;
                            function1 = this.f19813p;
                            if (function1 != null) {
                            }
                            this.f19810m = interfaceC9204Wu3;
                            this.f19805h = objectRef;
                            this.f19806i = null;
                            this.f19807j = null;
                            this.f19808k = j;
                            this.f19809l = 3;
                            if (KY5.m98771g(interfaceC9204Wu3, this) == coroutine_suspended) {
                            }
                            Z30.m73800d(this.f19811n, null, null, new C4483g(this.f19816s, null), 3, null);
                            objectRef2 = objectRef;
                            interfaceC9204Wu2 = interfaceC9204Wu3;
                            obj3 = objectRef2.element;
                            if (obj3 != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        obj3 = objectRef2.element;
                        if (obj3 != null) {
                            if (this.f19814q == null) {
                                Function1<C32120Ce3, Unit> function14 = this.f19815r;
                                if (function14 != null) {
                                    function14.invoke(C32120Ce3.m111955d(((C43361jX3) obj3).m30359f()));
                                }
                            } else {
                                this.f19810m = interfaceC9204Wu2;
                                this.f19805h = objectRef2;
                                this.f19806i = null;
                                this.f19807j = null;
                                this.f19808k = j;
                                this.f19809l = 4;
                                m98772f = KY5.m98772f(interfaceC9204Wu2, (C43361jX3) obj3, this);
                                if (m98772f == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                interfaceC9204Wu4 = interfaceC9204Wu2;
                                c43361jX33 = (C43361jX3) m98772f;
                                if (c43361jX33 != null) {
                                    Function1<C32120Ce3, Unit> function15 = this.f19815r;
                                    if (function15 != null) {
                                        function15.invoke(C32120Ce3.m111955d(((C43361jX3) objectRef2.element).m30359f()));
                                    }
                                } else {
                                    Z30.m73800d(this.f19811n, null, null, new C4484h(this.f19816s, null), 3, null);
                                    if (this.f19812o != KY5.f19762a) {
                                        Z30.m73800d(this.f19811n, null, null, new C4485i(this.f19812o, this.f19816s, c43361jX33, null), 3, null);
                                    }
                                    try {
                                        C4486j c4486j = new C4486j(this.f19811n, this.f19814q, this.f19815r, objectRef2, this.f19816s, null);
                                        this.f19810m = interfaceC9204Wu4;
                                        this.f19805h = objectRef2;
                                        this.f19806i = c43361jX33;
                                        this.f19809l = 5;
                                        if (interfaceC9204Wu4.mo3413Q(j, c4486j, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } catch (PointerEventTimeoutCancellationException unused3) {
                                        c43361jX34 = c43361jX33;
                                        interfaceC9204Wu5 = interfaceC9204Wu4;
                                        objectRef3 = objectRef2;
                                        function12 = this.f19815r;
                                        if (function12 != null) {
                                        }
                                        function13 = this.f19813p;
                                        if (function13 != null) {
                                        }
                                        this.f19810m = null;
                                        this.f19805h = null;
                                        this.f19806i = null;
                                        this.f19809l = 6;
                                        if (KY5.m98771g(interfaceC9204Wu5, this) == coroutine_suspended) {
                                        }
                                        Z30.m73800d(this.f19811n, null, null, new C4477a(this.f19816s, null), 3, null);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        ResultKt.throwOnFailure(obj);
                        interfaceC9204Wu = (InterfaceC9204Wu) this.f19810m;
                        m98773e = obj;
                        c43361jX3 = (C43361jX3) m98773e;
                        c43361jX3.m30364a();
                        Z30.m73800d(this.f19811n, null, null, new C4478b(this.f19816s, null), 3, null);
                        if (this.f19812o != KY5.f19762a) {
                        }
                        if (this.f19813p == null) {
                        }
                        objectRef = new Ref.ObjectRef();
                        C4480d c4480d2 = new C4480d(null);
                        this.f19810m = interfaceC9204Wu;
                        this.f19805h = c43361jX3;
                        this.f19806i = objectRef;
                        this.f19807j = objectRef;
                        this.f19808k = j;
                        this.f19809l = 2;
                        mo3413Q = interfaceC9204Wu.mo3413Q(j, c4480d2, this);
                        if (mo3413Q != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        j = this.f19808k;
                        objectRef = (Ref.ObjectRef) this.f19807j;
                        Ref.ObjectRef objectRef4 = (Ref.ObjectRef) this.f19806i;
                        c43361jX3 = (C43361jX3) this.f19805h;
                        interfaceC9204Wu = (InterfaceC9204Wu) this.f19810m;
                        try {
                            ResultKt.throwOnFailure(obj);
                            interfaceC9204Wu2 = interfaceC9204Wu;
                            c43361jX32 = c43361jX3;
                            objectRef2 = objectRef4;
                            t = obj;
                            objectRef.element = t;
                            obj2 = objectRef2.element;
                            if (obj2 != null) {
                            }
                        } catch (PointerEventTimeoutCancellationException unused4) {
                            objectRef = objectRef4;
                            interfaceC9204Wu3 = interfaceC9204Wu;
                            function1 = this.f19813p;
                            if (function1 != null) {
                            }
                            this.f19810m = interfaceC9204Wu3;
                            this.f19805h = objectRef;
                            this.f19806i = null;
                            this.f19807j = null;
                            this.f19808k = j;
                            this.f19809l = 3;
                            if (KY5.m98771g(interfaceC9204Wu3, this) == coroutine_suspended) {
                            }
                            Z30.m73800d(this.f19811n, null, null, new C4483g(this.f19816s, null), 3, null);
                            objectRef2 = objectRef;
                            interfaceC9204Wu2 = interfaceC9204Wu3;
                            obj3 = objectRef2.element;
                            if (obj3 != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        obj3 = objectRef2.element;
                        if (obj3 != null) {
                        }
                        return Unit.INSTANCE;
                    case 3:
                        j = this.f19808k;
                        objectRef = (Ref.ObjectRef) this.f19805h;
                        interfaceC9204Wu3 = (InterfaceC9204Wu) this.f19810m;
                        ResultKt.throwOnFailure(obj);
                        Z30.m73800d(this.f19811n, null, null, new C4483g(this.f19816s, null), 3, null);
                        objectRef2 = objectRef;
                        interfaceC9204Wu2 = interfaceC9204Wu3;
                        obj3 = objectRef2.element;
                        if (obj3 != null) {
                        }
                        return Unit.INSTANCE;
                    case 4:
                        j = this.f19808k;
                        interfaceC9204Wu4 = (InterfaceC9204Wu) this.f19810m;
                        ResultKt.throwOnFailure(obj);
                        objectRef2 = (Ref.ObjectRef) this.f19805h;
                        m98772f = obj;
                        c43361jX33 = (C43361jX3) m98772f;
                        if (c43361jX33 != null) {
                        }
                        return Unit.INSTANCE;
                    case 5:
                        c43361jX34 = (C43361jX3) this.f19806i;
                        objectRef3 = (Ref.ObjectRef) this.f19805h;
                        interfaceC9204Wu5 = (InterfaceC9204Wu) this.f19810m;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (PointerEventTimeoutCancellationException unused5) {
                            function12 = this.f19815r;
                            if (function12 != null) {
                                function12.invoke(C32120Ce3.m111955d(((C43361jX3) objectRef3.element).m30359f()));
                            }
                            function13 = this.f19813p;
                            if (function13 != null) {
                                function13.invoke(C32120Ce3.m111955d(c43361jX34.m30359f()));
                            }
                            this.f19810m = null;
                            this.f19805h = null;
                            this.f19806i = null;
                            this.f19809l = 6;
                            if (KY5.m98771g(interfaceC9204Wu5, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Z30.m73800d(this.f19811n, null, null, new C4477a(this.f19816s, null), 3, null);
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        Z30.m73800d(this.f19811n, null, null, new C4477a(this.f19816s, null), 3, null);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4475f(InterfaceC49290tX3 interfaceC49290tX3, Function3<? super N14, ? super C32120Ce3, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super C32120Ce3, Unit> function1, Function1<? super C32120Ce3, Unit> function12, Function1<? super C32120Ce3, Unit> function13, Continuation<? super C4475f> continuation) {
            super(2, continuation);
            this.f19800j = interfaceC49290tX3;
            this.f19801k = function3;
            this.f19802l = function1;
            this.f19803m = function12;
            this.f19804n = function13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C4475f c4475f = new C4475f(this.f19800j, this.f19801k, this.f19802l, this.f19803m, this.f19804n, continuation);
            c4475f.f19799i = obj;
            return c4475f;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C4475f) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f19798h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = (ZC0) this.f19799i;
                O14 o14 = new O14(this.f19800j);
                InterfaceC49290tX3 interfaceC49290tX3 = this.f19800j;
                C4476a c4476a = new C4476a(zc0, this.f19801k, this.f19802l, this.f19803m, this.f19804n, o14, null);
                this.f19798h = 1;
                if (C34620Mw1.m94550c(interfaceC49290tX3, c4476a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", m28418f = "TapGestureDetector.kt", m28417i = {0, 0, 1, 1}, m28416l = {305, 320}, m28415m = "waitForUpOrCancellation", m28414n = {"$this$waitForUpOrCancellation", "pass", "$this$waitForUpOrCancellation", "pass"}, m28413s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: KY5$g */
    /* loaded from: classes.dex */
    public static final class C4489g extends ContinuationImpl {

        /* renamed from: h */
        public Object f19850h;

        /* renamed from: i */
        public Object f19851i;

        /* renamed from: j */
        public /* synthetic */ Object f19852j;

        /* renamed from: k */
        public int f19853k;

        public C4489g(Continuation<? super C4489g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19852j = obj;
            this.f19853k |= Integer.MIN_VALUE;
            return KY5.m98767k(null, null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x004e -> B:51:0x0051). Please submit an issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m98774d(p000.InterfaceC9204Wu r9, boolean r10, p000.EnumC38007aX3 r11, kotlin.coroutines.Continuation<? super p000.C43361jX3> r12) {
        /*
            boolean r0 = r12 instanceof p000.KY5.C4466b
            if (r0 == 0) goto L13
            r0 = r12
            KY5$b r0 = (p000.KY5.C4466b) r0
            int r1 = r0.f19768l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19768l = r1
            goto L18
        L13:
            KY5$b r0 = new KY5$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f19767k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f19768l
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r9 = r0.f19766j
            java.lang.Object r10 = r0.f19765i
            aX3 r10 = (p000.EnumC38007aX3) r10
            java.lang.Object r11 = r0.f19764h
            Wu r11 = (p000.InterfaceC9204Wu) r11
            kotlin.ResultKt.throwOnFailure(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L51
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            kotlin.ResultKt.throwOnFailure(r12)
        L42:
            r0.f19764h = r9
            r0.f19765i = r11
            r0.f19766j = r10
            r0.f19768l = r3
            java.lang.Object r12 = r9.mo3401r0(r11, r0)
            if (r12 != r1) goto L51
            return r1
        L51:
            YW3 r12 = (p000.YW3) r12
            java.util.List r2 = r12.m74945c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5d:
            if (r6 >= r4) goto L77
            java.lang.Object r7 = r2.get(r6)
            jX3 r7 = (p000.C43361jX3) r7
            if (r10 == 0) goto L6c
            boolean r7 = p000.ZW3.m72998a(r7)
            goto L70
        L6c:
            boolean r7 = p000.ZW3.m72997b(r7)
        L70:
            if (r7 != 0) goto L74
            r2 = r5
            goto L78
        L74:
            int r6 = r6 + 1
            goto L5d
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto L42
            java.util.List r9 = r12.m74945c()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.KY5.m98774d(Wu, boolean, aX3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: e */
    public static /* synthetic */ Object m98773e(InterfaceC9204Wu interfaceC9204Wu, boolean z, EnumC38007aX3 enumC38007aX3, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            enumC38007aX3 = EnumC38007aX3.Main;
        }
        return m98774d(interfaceC9204Wu, z, enumC38007aX3, continuation);
    }

    /* renamed from: f */
    public static final Object m98772f(InterfaceC9204Wu interfaceC9204Wu, C43361jX3 c43361jX3, Continuation<? super C43361jX3> continuation) {
        return interfaceC9204Wu.mo3396x0(interfaceC9204Wu.mo3400s().mo42674c(), new C4467c(c43361jX3, null), continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0052 A[LOOP:0: B:52:0x0050->B:53:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[EDGE_INSN: B:65:0x007a->B:60:0x007a ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0041 -> B:51:0x0044). Please submit an issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m98771g(p000.InterfaceC9204Wu r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof p000.KY5.C4468d
            if (r0 == 0) goto L13
            r0 = r9
            KY5$d r0 = (p000.KY5.C4468d) r0
            int r1 = r0.f19775j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19775j = r1
            goto L18
        L13:
            KY5$d r0 = new KY5$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19774i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f19775j
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f19773h
            Wu r8 = (p000.InterfaceC9204Wu) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.throwOnFailure(r9)
        L38:
            r0.f19773h = r8
            r0.f19775j = r3
            r9 = 0
            java.lang.Object r9 = p000.InterfaceC9204Wu.m77725U(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            YW3 r9 = (p000.YW3) r9
            java.util.List r2 = r9.m74945c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            jX3 r7 = (p000.C43361jX3) r7
            r7.m30364a()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.m74945c()
            int r2 = r9.size()
            r4 = r5
        L67:
            if (r4 >= r2) goto L7a
            java.lang.Object r6 = r9.get(r4)
            jX3 r6 = (p000.C43361jX3) r6
            boolean r6 = r6.m30358g()
            if (r6 == 0) goto L77
            r5 = r3
            goto L7a
        L77:
            int r4 = r4 + 1
            goto L67
        L7a:
            if (r5 != 0) goto L38
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.KY5.m98771g(Wu, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: h */
    public static final Object m98770h(InterfaceC49290tX3 interfaceC49290tX3, Function3<? super N14, ? super C32120Ce3, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super C32120Ce3, Unit> function1, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m71786e = C37824aD0.m71786e(new C4469e(interfaceC49290tX3, function3, function1, new O14(interfaceC49290tX3), null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m71786e == coroutine_suspended) {
            return m71786e;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Object m98769i(InterfaceC49290tX3 interfaceC49290tX3, Function1<? super C32120Ce3, Unit> function1, Function1<? super C32120Ce3, Unit> function12, Function3<? super N14, ? super C32120Ce3, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super C32120Ce3, Unit> function13, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m71786e = C37824aD0.m71786e(new C4475f(interfaceC49290tX3, function3, function12, function1, function13, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m71786e == coroutine_suspended ? m71786e : Unit.INSTANCE;
    }

    /* renamed from: j */
    public static /* synthetic */ Object m98768j(InterfaceC49290tX3 interfaceC49290tX3, Function1 function1, Function1 function12, Function3 function3, Function1 function13, Continuation continuation, int i, Object obj) {
        Function1 function14;
        Function1 function15;
        Function1 function16;
        if ((i & 1) != 0) {
            function14 = null;
        } else {
            function14 = function1;
        }
        if ((i & 2) != 0) {
            function15 = null;
        } else {
            function15 = function12;
        }
        if ((i & 4) != 0) {
            function3 = f19762a;
        }
        Function3 function32 = function3;
        if ((i & 8) != 0) {
            function16 = null;
        } else {
            function16 = function13;
        }
        return m98769i(interfaceC49290tX3, function14, function15, function32, function16, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x00de -> B:79:0x0037). Please submit an issue!!! */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m98767k(InterfaceC9204Wu interfaceC9204Wu, EnumC38007aX3 enumC38007aX3, Continuation<? super C43361jX3> continuation) {
        C4489g c4489g;
        Object coroutine_suspended;
        int i;
        InterfaceC9204Wu interfaceC9204Wu2;
        Object obj;
        C4489g c4489g2;
        EnumC38007aX3 enumC38007aX32;
        InterfaceC9204Wu interfaceC9204Wu3;
        EnumC38007aX3 enumC38007aX33;
        int size;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        Object mo3401r0;
        boolean z4;
        if (continuation instanceof C4489g) {
            c4489g = (C4489g) continuation;
            int i3 = c4489g.f19853k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c4489g.f19853k = i3 - Integer.MIN_VALUE;
                Object obj2 = c4489g.f19852j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4489g.f19853k;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            enumC38007aX33 = (EnumC38007aX3) c4489g.f19851i;
                            interfaceC9204Wu3 = (InterfaceC9204Wu) c4489g.f19850h;
                            ResultKt.throwOnFailure(obj2);
                            Object obj3 = coroutine_suspended;
                            c4489g2 = c4489g;
                            enumC38007aX32 = enumC38007aX33;
                            obj = obj3;
                            List<C43361jX3> m74945c = ((YW3) obj2).m74945c();
                            int size2 = m74945c.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size2) {
                                    if (m74945c.get(i4).m30351n()) {
                                        z4 = true;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    z4 = false;
                                    break;
                                }
                            }
                            if (!z4) {
                                return null;
                            }
                            interfaceC9204Wu2 = interfaceC9204Wu3;
                            c4489g2.f19850h = interfaceC9204Wu2;
                            c4489g2.f19851i = enumC38007aX32;
                            c4489g2.f19853k = 1;
                            mo3401r0 = interfaceC9204Wu2.mo3401r0(enumC38007aX32, c4489g2);
                            if (mo3401r0 != obj) {
                                return obj;
                            }
                            interfaceC9204Wu3 = interfaceC9204Wu2;
                            obj2 = mo3401r0;
                            Object obj4 = obj;
                            enumC38007aX33 = enumC38007aX32;
                            c4489g = c4489g2;
                            coroutine_suspended = obj4;
                            YW3 yw3 = (YW3) obj2;
                            List<C43361jX3> m74945c2 = yw3.m74945c();
                            size = m74945c2.size();
                            i2 = 0;
                            while (true) {
                                if (i2 < size) {
                                    if (!ZW3.m72996c(m74945c2.get(i2))) {
                                        z = false;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (!z) {
                                return yw3.m74945c().get(0);
                            }
                            List<C43361jX3> m74945c3 = yw3.m74945c();
                            int size3 = m74945c3.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 < size3) {
                                    C43361jX3 c43361jX3 = m74945c3.get(i5);
                                    if (!c43361jX3.m30351n() && !ZW3.m72993f(c43361jX3, interfaceC9204Wu3.mo3409a(), interfaceC9204Wu3.mo3417C0())) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        z2 = true;
                                        break;
                                    }
                                    i5++;
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            if (z2) {
                                return null;
                            }
                            EnumC38007aX3 enumC38007aX34 = EnumC38007aX3.Final;
                            c4489g.f19850h = interfaceC9204Wu3;
                            c4489g.f19851i = enumC38007aX33;
                            c4489g.f19853k = 2;
                            obj2 = interfaceC9204Wu3.mo3401r0(enumC38007aX34, c4489g);
                            if (obj2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Object obj32 = coroutine_suspended;
                            c4489g2 = c4489g;
                            enumC38007aX32 = enumC38007aX33;
                            obj = obj32;
                            List<C43361jX3> m74945c4 = ((YW3) obj2).m74945c();
                            int size22 = m74945c4.size();
                            int i42 = 0;
                            while (true) {
                                if (i42 < size22) {
                                }
                                i42++;
                            }
                            if (!z4) {
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        enumC38007aX33 = (EnumC38007aX3) c4489g.f19851i;
                        interfaceC9204Wu3 = (InterfaceC9204Wu) c4489g.f19850h;
                        ResultKt.throwOnFailure(obj2);
                        YW3 yw32 = (YW3) obj2;
                        List<C43361jX3> m74945c22 = yw32.m74945c();
                        size = m74945c22.size();
                        i2 = 0;
                        while (true) {
                            if (i2 < size) {
                            }
                            i2++;
                        }
                        if (!z) {
                        }
                    }
                } else {
                    ResultKt.throwOnFailure(obj2);
                    interfaceC9204Wu2 = interfaceC9204Wu;
                    obj = coroutine_suspended;
                    c4489g2 = c4489g;
                    enumC38007aX32 = enumC38007aX3;
                    c4489g2.f19850h = interfaceC9204Wu2;
                    c4489g2.f19851i = enumC38007aX32;
                    c4489g2.f19853k = 1;
                    mo3401r0 = interfaceC9204Wu2.mo3401r0(enumC38007aX32, c4489g2);
                    if (mo3401r0 != obj) {
                    }
                }
            }
        }
        c4489g = new C4489g(continuation);
        Object obj22 = c4489g.f19852j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4489g.f19853k;
        if (i == 0) {
        }
    }

    /* renamed from: l */
    public static /* synthetic */ Object m98766l(InterfaceC9204Wu interfaceC9204Wu, EnumC38007aX3 enumC38007aX3, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC38007aX3 = EnumC38007aX3.Main;
        }
        return m98767k(interfaceC9204Wu, enumC38007aX3, continuation);
    }
}
