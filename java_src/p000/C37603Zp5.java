package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.List;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
import p000.PV2;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aF\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u001aR\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007\u001aQ\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\"\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u001a\u0017\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\" \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u001a\u0010/\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, m28432d2 = {"LgV2;", "Laq5;", TransferTable.COLUMN_STATE, "LEy3;", "orientation", "", "enabled", "reverseDirection", "Lcu1;", "flingBehavior", "LrX2;", "interactionSource", "k", "LDA3;", "overscrollEffect", "j", "controller", "i", "(LgV2;LrX2;LEy3;ZLaq5;Lcu1;LDA3;ZLEt0;I)LgV2;", "LsP5;", "Ldq5;", "scrollingLogicState", "LRp5;", "mouseWheelScrollConfig", "h", "LWu;", "LYW3;", "e", "(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollLogic", "LB43;", "m", "LWp5;", C17296a.f69688o, "LWp5;", "NoOpScrollScope", "LV94;", "b", "LV94;", "g", "()LV94;", "ModifierLocalScrollableContainer", "LPV2;", "c", "LPV2;", "f", "()LPV2;", "DefaultScrollMotionDurationScale", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,579:1\n135#2:580\n25#3:581\n36#3:588\n25#3:595\n36#3:602\n50#3:609\n49#3:610\n1114#4,6:582\n1114#4,6:589\n1114#4,6:596\n1114#4,6:603\n1114#4,6:611\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n*L\n146#1:580\n252#1:581\n263#1:588\n266#1:595\n275#1:602\n276#1:609\n276#1:610\n252#1:582,6\n263#1:589,6\n266#1:596,6\n275#1:603,6\n276#1:611,6\n*E\n"})
/* renamed from: Zp5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37603Zp5 {

    /* renamed from: a */
    public static final InterfaceC36901Wp5 f49320a = new C10403c();

    /* renamed from: b */
    public static final V94<Boolean> f49321b = C43342jV2.m30425a(C10402b.f49323g);

    /* renamed from: c */
    public static final PV2 f49322c = new C10401a();

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m28432d2 = {"Zp5$a", "LPV2;", "", "I", "()F", "scaleFactor", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Zp5$a */
    /* loaded from: classes.dex */
    public static final class C10401a implements PV2 {
        @Override // p000.PV2
        /* renamed from: I */
        public float mo40807I() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) PV2.C6383a.m90183a(this, r, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
            return (E) PV2.C6383a.m90182b(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
            return PV2.C6383a.m90181c(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public CoroutineContext plus(CoroutineContext coroutineContext) {
            return PV2.C6383a.m90180d(this, coroutineContext);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zp5$b */
    /* loaded from: classes.dex */
    public static final class C10402b extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public static final C10402b f49323g = new C10402b();

        public C10402b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, m28432d2 = {"Zp5$c", "LWp5;", "", "pixels", C17296a.f69688o, "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Zp5$c */
    /* loaded from: classes.dex */
    public static final class C10403c implements InterfaceC36901Wp5 {
        @Override // p000.InterfaceC36901Wp5
        /* renamed from: a */
        public float mo43646a(float f) {
            return f;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ScrollableKt", m28418f = "Scrollable.kt", m28417i = {0}, m28416l = {313}, m28415m = "awaitScrollEvent", m28414n = {"$this$awaitScrollEvent"}, m28413s = {"L$0"})
    /* renamed from: Zp5$d */
    /* loaded from: classes.dex */
    public static final class C10404d extends ContinuationImpl {

        /* renamed from: h */
        public Object f49324h;

        /* renamed from: i */
        public /* synthetic */ Object f49325i;

        /* renamed from: j */
        public int f49326j;

        public C10404d(Continuation<? super C10404d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49325i = obj;
            this.f49326j |= Integer.MIN_VALUE;
            return C37603Zp5.m72425e(null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LtX3;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", m28418f = "Scrollable.kt", m28417i = {}, m28416l = {291}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Zp5$e */
    /* loaded from: classes.dex */
    public static final class C10405e extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f49327h;

        /* renamed from: i */
        public /* synthetic */ Object f49328i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC35731Rp5 f49329j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC48627sP5<C39992dq5> f49330k;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWu;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", m28418f = "Scrollable.kt", m28417i = {0}, m28416l = {293}, m28415m = "invokeSuspend", m28414n = {"$this$awaitPointerEventScope"}, m28413s = {"L$0"})
        @SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$mouseWheelScroll$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,579:1\n86#2,2:580\n33#2,6:582\n88#2:588\n33#2,6:589\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$mouseWheelScroll$1$1\n*L\n294#1:580,2\n294#1:582,6\n294#1:588\n301#1:589,6\n*E\n"})
        /* renamed from: Zp5$e$a */
        /* loaded from: classes.dex */
        public static final class C10406a extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f49331h;

            /* renamed from: i */
            public /* synthetic */ Object f49332i;

            /* renamed from: j */
            public final /* synthetic */ InterfaceC35731Rp5 f49333j;

            /* renamed from: k */
            public final /* synthetic */ InterfaceC48627sP5<C39992dq5> f49334k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10406a(InterfaceC35731Rp5 interfaceC35731Rp5, InterfaceC48627sP5<C39992dq5> interfaceC48627sP5, Continuation<? super C10406a> continuation) {
                super(2, continuation);
                this.f49333j = interfaceC35731Rp5;
                this.f49334k = interfaceC48627sP5;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10406a c10406a = new C10406a(this.f49333j, this.f49334k, continuation);
                c10406a.f49332i = obj;
                return c10406a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: e */
            public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
                return ((C10406a) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:13:0x0037). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                InterfaceC9204Wu interfaceC9204Wu;
                C10406a c10406a;
                Object m72425e;
                List<C43361jX3> m74945c;
                boolean z;
                boolean z2;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f49331h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC9204Wu interfaceC9204Wu2 = (InterfaceC9204Wu) this.f49332i;
                        Object obj2 = coroutine_suspended;
                        C10406a c10406a2 = this;
                        YW3 yw3 = (YW3) obj;
                        int size = yw3.m74945c().size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                if (!(!m74945c.get(i2).m30351n())) {
                                    z = false;
                                    break;
                                }
                                i2++;
                            } else {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            InterfaceC35731Rp5 interfaceC35731Rp5 = c10406a2.f49333j;
                            InterfaceC48627sP5<C39992dq5> interfaceC48627sP5 = c10406a2.f49334k;
                            long mo3191a = interfaceC35731Rp5.mo3191a(interfaceC9204Wu2, yw3, interfaceC9204Wu2.mo3409a());
                            C39992dq5 value = interfaceC48627sP5.getValue();
                            if (value.m43663e().mo11048b(value.m43658j(value.m43652p(mo3191a))) == 0.0f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                List<C43361jX3> m74945c2 = yw3.m74945c();
                                int size2 = m74945c2.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    m74945c2.get(i3).m30364a();
                                }
                            }
                        }
                        c10406a = c10406a2;
                        coroutine_suspended = obj2;
                        interfaceC9204Wu = interfaceC9204Wu2;
                        c10406a.f49332i = interfaceC9204Wu;
                        c10406a.f49331h = 1;
                        m72425e = C37603Zp5.m72425e(interfaceC9204Wu, c10406a);
                        if (m72425e == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Object obj3 = coroutine_suspended;
                        c10406a2 = c10406a;
                        obj = m72425e;
                        interfaceC9204Wu2 = interfaceC9204Wu;
                        obj2 = obj3;
                        YW3 yw32 = (YW3) obj;
                        int size3 = yw32.m74945c().size();
                        int i22 = 0;
                        while (true) {
                            if (i22 < size3) {
                            }
                            i22++;
                        }
                        if (z) {
                        }
                        c10406a = c10406a2;
                        coroutine_suspended = obj2;
                        interfaceC9204Wu = interfaceC9204Wu2;
                        c10406a.f49332i = interfaceC9204Wu;
                        c10406a.f49331h = 1;
                        m72425e = C37603Zp5.m72425e(interfaceC9204Wu, c10406a);
                        if (m72425e == coroutine_suspended) {
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    interfaceC9204Wu = (InterfaceC9204Wu) this.f49332i;
                    c10406a = this;
                    c10406a.f49332i = interfaceC9204Wu;
                    c10406a.f49331h = 1;
                    m72425e = C37603Zp5.m72425e(interfaceC9204Wu, c10406a);
                    if (m72425e == coroutine_suspended) {
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10405e(InterfaceC35731Rp5 interfaceC35731Rp5, InterfaceC48627sP5<C39992dq5> interfaceC48627sP5, Continuation<? super C10405e> continuation) {
            super(2, continuation);
            this.f49329j = interfaceC35731Rp5;
            this.f49330k = interfaceC48627sP5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10405e c10405e = new C10405e(this.f49329j, this.f49330k, continuation);
            c10405e.f49328i = obj;
            return c10405e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
            return ((C10405e) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f49327h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C10406a c10406a = new C10406a(this.f49329j, this.f49330k, null);
                this.f49327h = 1;
                if (((InterfaceC49290tX3) this.f49328i).mo3418v0(c10406a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zp5$f */
    /* loaded from: classes.dex */
    public static final class C10407f extends Lambda implements Function1<C43361jX3, Boolean> {

        /* renamed from: g */
        public static final C10407f f49335g = new C10407f();

        public C10407f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C43361jX3 down) {
            Intrinsics.checkNotNullParameter(down, "down");
            return Boolean.valueOf(!C52254yX3.m3355g(down.m30353l(), C52254yX3.f119686a.m3351b()));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zp5$g */
    /* loaded from: classes.dex */
    public static final class C10408g extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48627sP5<C39992dq5> f49336g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10408g(InterfaceC48627sP5<C39992dq5> interfaceC48627sP5) {
            super(0);
            this.f49336g = interfaceC48627sP5;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f49336g.getValue().m43656l());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1", m28418f = "Scrollable.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Zp5$h */
    /* loaded from: classes.dex */
    public static final class C10409h extends SuspendLambda implements Function3<ZC0, C48275ro6, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f49337h;

        /* renamed from: i */
        public /* synthetic */ long f49338i;

        /* renamed from: j */
        public final /* synthetic */ EX2<C43> f49339j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC48627sP5<C39992dq5> f49340k;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1", m28418f = "Scrollable.kt", m28417i = {}, m28416l = {278}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: Zp5$h$a */
        /* loaded from: classes.dex */
        public static final class C10410a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f49341h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC48627sP5<C39992dq5> f49342i;

            /* renamed from: j */
            public final /* synthetic */ long f49343j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10410a(InterfaceC48627sP5<C39992dq5> interfaceC48627sP5, long j, Continuation<? super C10410a> continuation) {
                super(2, continuation);
                this.f49342i = interfaceC48627sP5;
                this.f49343j = j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10410a(this.f49342i, this.f49343j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C10410a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f49341h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    long j = this.f49343j;
                    this.f49341h = 1;
                    if (this.f49342i.getValue().m43661g(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10409h(EX2<C43> ex2, InterfaceC48627sP5<C39992dq5> interfaceC48627sP5, Continuation<? super C10409h> continuation) {
            super(3, continuation);
            this.f49339j = ex2;
            this.f49340k = interfaceC48627sP5;
        }

        /* renamed from: e */
        public final Object m72414e(ZC0 zc0, long j, Continuation<? super Unit> continuation) {
            C10409h c10409h = new C10409h(this.f49339j, this.f49340k, continuation);
            c10409h.f49338i = j;
            return c10409h.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, C48275ro6 c48275ro6, Continuation<? super Unit> continuation) {
            return m72414e(zc0, c48275ro6.m15350o(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f49337h == 0) {
                ResultKt.throwOnFailure(obj);
                Z30.m73800d(this.f49339j.getValue().m112916e(), null, null, new C10410a(this.f49340k, this.f49338i, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n*L\n1#1,170:1\n147#2,9:171\n*E\n"})
    /* renamed from: Zp5$i */
    /* loaded from: classes.dex */
    public static final class C10411i extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EnumC32768Ey3 f49344g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC38196aq5 f49345h;

        /* renamed from: i */
        public final /* synthetic */ DA3 f49346i;

        /* renamed from: j */
        public final /* synthetic */ boolean f49347j;

        /* renamed from: k */
        public final /* synthetic */ boolean f49348k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC39436cu1 f49349l;

        /* renamed from: m */
        public final /* synthetic */ InterfaceC48104rX2 f49350m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10411i(EnumC32768Ey3 enumC32768Ey3, InterfaceC38196aq5 interfaceC38196aq5, DA3 da3, boolean z, boolean z2, InterfaceC39436cu1 interfaceC39436cu1, InterfaceC48104rX2 interfaceC48104rX2) {
            super(1);
            this.f49344g = enumC32768Ey3;
            this.f49345h = interfaceC38196aq5;
            this.f49346i = da3;
            this.f49347j = z;
            this.f49348k = z2;
            this.f49349l = interfaceC39436cu1;
            this.f49350m = interfaceC48104rX2;
        }

        /* renamed from: a */
        public final void m72413a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("scrollable");
            s42.m86038a().m104824a("orientation", this.f49344g);
            s42.m86038a().m104824a(TransferTable.COLUMN_STATE, this.f49345h);
            s42.m86038a().m104824a("overscrollEffect", this.f49346i);
            s42.m86038a().m104824a("enabled", Boolean.valueOf(this.f49347j));
            s42.m86038a().m104824a("reverseDirection", Boolean.valueOf(this.f49348k));
            s42.m86038a().m104824a("flingBehavior", this.f49349l);
            s42.m86038a().m104824a("interactionSource", this.f49350m);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m72413a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$scrollable$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,579:1\n474#2,4:580\n478#2,2:588\n482#2:594\n25#3:584\n83#3,3:595\n1114#4,3:585\n1117#4,3:591\n1114#4,6:598\n474#5:590\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$scrollable$2\n*L\n157#1:580,4\n157#1:588,2\n157#1:594\n157#1:584\n159#1:595,3\n157#1:585,3\n157#1:591,3\n159#1:598,6\n157#1:590\n*E\n"})
    /* renamed from: Zp5$j */
    /* loaded from: classes.dex */
    public static final class C10412j extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ EnumC32768Ey3 f49351g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC38196aq5 f49352h;

        /* renamed from: i */
        public final /* synthetic */ boolean f49353i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC48104rX2 f49354j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC39436cu1 f49355k;

        /* renamed from: l */
        public final /* synthetic */ DA3 f49356l;

        /* renamed from: m */
        public final /* synthetic */ boolean f49357m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10412j(EnumC32768Ey3 enumC32768Ey3, InterfaceC38196aq5 interfaceC38196aq5, boolean z, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC39436cu1 interfaceC39436cu1, DA3 da3, boolean z2) {
            super(3);
            this.f49351g = enumC32768Ey3;
            this.f49352h = interfaceC38196aq5;
            this.f49353i = z;
            this.f49354j = interfaceC48104rX2;
            this.f49355k = interfaceC39436cu1;
            this.f49356l = da3;
            this.f49357m = z2;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m72412a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(-629830927);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-629830927, i, -1, "androidx.compose.foundation.gestures.scrollable.<anonymous> (Scrollable.kt:155)");
            }
            interfaceC32720Et0.mo89638F(773894976);
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                Object c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, interfaceC32720Et0));
                interfaceC32720Et0.mo89503z(c42992iu0);
                mo89635G = c42992iu0;
            }
            interfaceC32720Et0.mo89605Q();
            ZC0 m31665a = ((C42992iu0) mo89635G).m31665a();
            interfaceC32720Et0.mo89605Q();
            Object[] objArr = {m31665a, this.f49351g, this.f49352h, Boolean.valueOf(this.f49353i)};
            EnumC32768Ey3 enumC32768Ey3 = this.f49351g;
            InterfaceC38196aq5 interfaceC38196aq5 = this.f49352h;
            boolean z = this.f49353i;
            interfaceC32720Et0.mo89638F(-568225417);
            boolean z2 = false;
            for (int i2 = 0; i2 < 4; i2++) {
                z2 |= interfaceC32720Et0.mo89539n(objArr[i2]);
            }
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (z2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G2 = new C43744kA0(m31665a, enumC32768Ey3, interfaceC38196aq5, z);
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m72421i = C37603Zp5.m72421i(C38252aw1.m65237a(interfaceC41563gV2).mo39266t0(((C43744kA0) mo89635G2).m29232J()), this.f49354j, this.f49351g, this.f49353i, this.f49352h, this.f49355k, this.f49356l, this.f49357m, interfaceC32720Et0, 0);
            if (this.f49357m) {
                interfaceC41563gV2 = C47493qV2.f105352b;
            }
            InterfaceC41563gV2 mo39266t0 = m72421i.mo39266t0(interfaceC41563gV2);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return mo39266t0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m72412a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"Zp5$k", "LB43;", "LCe3;", "available", "LH43;", Stripe3ds2AuthParams.FIELD_SOURCE, "k", "(JI)J", "consumed", "h", "(JJI)J", "Lro6;", C17296a.f69688o, "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Zp5$k */
    /* loaded from: classes.dex */
    public static final class C10413k implements B43 {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC48627sP5<C39992dq5> f49358b;

        /* renamed from: c */
        public final /* synthetic */ boolean f49359c;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", m28418f = "Scrollable.kt", m28417i = {0, 0}, m28416l = {516}, m28415m = "onPostFling-RZ2iAVY", m28414n = {"this", "available"}, m28413s = {"L$0", "J$0"})
        /* renamed from: Zp5$k$a */
        /* loaded from: classes.dex */
        public static final class C10414a extends ContinuationImpl {

            /* renamed from: h */
            public Object f49360h;

            /* renamed from: i */
            public long f49361i;

            /* renamed from: j */
            public /* synthetic */ Object f49362j;

            /* renamed from: l */
            public int f49364l;

            public C10414a(Continuation<? super C10414a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f49362j = obj;
                this.f49364l |= Integer.MIN_VALUE;
                return C10413k.this.mo72411a(0L, 0L, this);
            }
        }

        public C10413k(InterfaceC48627sP5<C39992dq5> interfaceC48627sP5, boolean z) {
            this.f49358b = interfaceC48627sP5;
            this.f49359c = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        @Override // p000.B43
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo72411a(long j, long j2, Continuation<? super C48275ro6> continuation) {
            C10414a c10414a;
            Object coroutine_suspended;
            int i;
            long m15349a;
            C10413k c10413k;
            if (continuation instanceof C10414a) {
                c10414a = (C10414a) continuation;
                int i2 = c10414a.f49364l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c10414a.f49364l = i2 - Integer.MIN_VALUE;
                    Object obj = c10414a.f49362j;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c10414a.f49364l;
                    if (i == 0) {
                        if (i == 1) {
                            j2 = c10414a.f49361i;
                            c10413k = (C10413k) c10414a.f49360h;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        if (this.f49359c) {
                            c10414a.f49360h = this;
                            c10414a.f49361i = j2;
                            c10414a.f49364l = 1;
                            obj = this.f49358b.getValue().m43666b(j2, c10414a);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c10413k = this;
                        } else {
                            m15349a = C48275ro6.f107663b.m15349a();
                            c10413k = this;
                            C48275ro6 m15363b = C48275ro6.m15363b(m15349a);
                            InterfaceC48627sP5<C39992dq5> interfaceC48627sP5 = c10413k.f49358b;
                            m15363b.m15350o();
                            interfaceC48627sP5.getValue().m43659i(false);
                            return m15363b;
                        }
                    }
                    m15349a = C48275ro6.m15354k(j2, ((C48275ro6) obj).m15350o());
                    C48275ro6 m15363b2 = C48275ro6.m15363b(m15349a);
                    InterfaceC48627sP5<C39992dq5> interfaceC48627sP52 = c10413k.f49358b;
                    m15363b2.m15350o();
                    interfaceC48627sP52.getValue().m43659i(false);
                    return m15363b2;
                }
            }
            c10414a = new C10414a(continuation);
            Object obj2 = c10414a.f49362j;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c10414a.f49364l;
            if (i == 0) {
            }
            m15349a = C48275ro6.m15354k(j2, ((C48275ro6) obj2).m15350o());
            C48275ro6 m15363b22 = C48275ro6.m15363b(m15349a);
            InterfaceC48627sP5<C39992dq5> interfaceC48627sP522 = c10413k.f49358b;
            m15363b22.m15350o();
            interfaceC48627sP522.getValue().m43659i(false);
            return m15363b22;
        }

        @Override // p000.B43
        /* renamed from: h */
        public long mo72410h(long j, long j2, int i) {
            if (this.f49359c) {
                return this.f49358b.getValue().m43660h(j2);
            }
            return C32120Ce3.f4427b.m111932c();
        }

        @Override // p000.B43
        /* renamed from: k */
        public long mo72409k(long j, int i) {
            if (H43.m104445d(i, H43.f12808a.m104443b())) {
                this.f49358b.getValue().m43659i(true);
            }
            return C32120Ce3.f4427b.m111932c();
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please submit an issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m72425e(p000.InterfaceC9204Wu r5, kotlin.coroutines.Continuation<? super p000.YW3> r6) {
        /*
            boolean r0 = r6 instanceof p000.C37603Zp5.C10404d
            if (r0 == 0) goto L13
            r0 = r6
            Zp5$d r0 = (p000.C37603Zp5.C10404d) r0
            int r1 = r0.f49326j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49326j = r1
            goto L18
        L13:
            Zp5$d r0 = new Zp5$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f49325i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49326j
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f49324h
            Wu r5 = (p000.InterfaceC9204Wu) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
        L38:
            r0.f49324h = r5
            r0.f49326j = r3
            r6 = 0
            java.lang.Object r6 = p000.InterfaceC9204Wu.m77725U(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L44
            return r1
        L44:
            YW3 r6 = (p000.YW3) r6
            int r2 = r6.m74942f()
            bX3$a r4 = p000.C38600bX3.f57620a
            int r4 = r4.m64468f()
            boolean r2 = p000.C38600bX3.m64474i(r2, r4)
            if (r2 == 0) goto L38
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C37603Zp5.m72425e(Wu, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: f */
    public static final PV2 m72424f() {
        return f49322c;
    }

    /* renamed from: g */
    public static final V94<Boolean> m72423g() {
        return f49321b;
    }

    /* renamed from: h */
    public static final InterfaceC41563gV2 m72422h(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC48627sP5<C39992dq5> interfaceC48627sP5, InterfaceC35731Rp5 interfaceC35731Rp5) {
        return C52840zW5.m1271b(interfaceC41563gV2, interfaceC48627sP5, interfaceC35731Rp5, new C10405e(interfaceC35731Rp5, interfaceC48627sP5, null));
    }

    /* renamed from: i */
    public static final InterfaceC41563gV2 m72421i(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC48104rX2 interfaceC48104rX2, EnumC32768Ey3 enumC32768Ey3, boolean z, InterfaceC38196aq5 interfaceC38196aq5, InterfaceC39436cu1 interfaceC39436cu1, DA3 da3, boolean z2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC39436cu1 interfaceC39436cu12;
        interfaceC32720Et0.mo89638F(-2012025036);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-2012025036, i, -1, "androidx.compose.foundation.gestures.pointerScrollable (Scrollable.kt:241)");
        }
        interfaceC32720Et0.mo89638F(-1730186281);
        if (interfaceC39436cu1 == null) {
            interfaceC39436cu12 = C37369Yp5.f47422a.m74177a(interfaceC32720Et0, 6);
        } else {
            interfaceC39436cu12 = interfaceC39436cu1;
        }
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
            mo89635G = LM5.m97025e(new C43(), null, 2, null);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        EX2 ex2 = (EX2) mo89635G;
        InterfaceC48627sP5 m105193n = GM5.m105193n(new C39992dq5(enumC32768Ey3, z, ex2, interfaceC38196aq5, interfaceC39436cu12, da3), interfaceC32720Et0, 0);
        Object valueOf = Boolean.valueOf(z2);
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(valueOf);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G2 == c2012a.m108267a()) {
            mo89635G2 = m72417m(m105193n, z2);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        B43 b43 = (B43) mo89635G2;
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G3 = interfaceC32720Et0.mo89635G();
        if (mo89635G3 == c2012a.m108267a()) {
            mo89635G3 = new C35965Sp5(m105193n);
            interfaceC32720Et0.mo89503z(mo89635G3);
        }
        interfaceC32720Et0.mo89605Q();
        C35965Sp5 c35965Sp5 = (C35965Sp5) mo89635G3;
        InterfaceC35731Rp5 m98648a = C4507Kd.m98648a(interfaceC32720Et0, 0);
        C10407f c10407f = C10407f.f49335g;
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n2 = interfaceC32720Et0.mo89539n(m105193n);
        Object mo89635G4 = interfaceC32720Et0.mo89635G();
        if (mo89539n2 || mo89635G4 == c2012a.m108267a()) {
            mo89635G4 = new C10408g(m105193n);
            interfaceC32720Et0.mo89503z(mo89635G4);
        }
        interfaceC32720Et0.mo89605Q();
        Function0 function0 = (Function0) mo89635G4;
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n3 = interfaceC32720Et0.mo89539n(ex2) | interfaceC32720Et0.mo89539n(m105193n);
        Object mo89635G5 = interfaceC32720Et0.mo89635G();
        if (mo89539n3 || mo89635G5 == c2012a.m108267a()) {
            mo89635G5 = new C10409h(ex2, m105193n, null);
            interfaceC32720Et0.mo89503z(mo89635G5);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC41563gV2 m109419a = E43.m109419a(m72422h(C50819w61.m7430l(interfaceC41563gV2, c35965Sp5, c10407f, enumC32768Ey3, z2, interfaceC48104rX2, function0, null, (Function3) mo89635G5, false, 64, null), m105193n, m98648a), b43, (C43) ex2.getValue());
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m109419a;
    }

    /* renamed from: j */
    public static final InterfaceC41563gV2 m72420j(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC38196aq5 state, EnumC32768Ey3 orientation, DA3 da3, boolean z, boolean z2, InterfaceC39436cu1 interfaceC39436cu1, InterfaceC48104rX2 interfaceC48104rX2) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (K32.m99301c()) {
            m99303a = new C10411i(orientation, state, da3, z, z2, interfaceC39436cu1, interfaceC48104rX2);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, new C10412j(orientation, state, z2, interfaceC48104rX2, interfaceC39436cu1, da3, z));
    }

    /* renamed from: k */
    public static final InterfaceC41563gV2 m72419k(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC38196aq5 state, EnumC32768Ey3 orientation, boolean z, boolean z2, InterfaceC39436cu1 interfaceC39436cu1, InterfaceC48104rX2 interfaceC48104rX2) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return m72420j(interfaceC41563gV2, state, orientation, null, z, z2, interfaceC39436cu1, interfaceC48104rX2);
    }

    /* renamed from: l */
    public static /* synthetic */ InterfaceC41563gV2 m72418l(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC38196aq5 interfaceC38196aq5, EnumC32768Ey3 enumC32768Ey3, boolean z, boolean z2, InterfaceC39436cu1 interfaceC39436cu1, InterfaceC48104rX2 interfaceC48104rX2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        return m72419k(interfaceC41563gV2, interfaceC38196aq5, enumC32768Ey3, z3, z2, (i & 16) != 0 ? null : interfaceC39436cu1, (i & 32) != 0 ? null : interfaceC48104rX2);
    }

    /* renamed from: m */
    public static final B43 m72417m(InterfaceC48627sP5<C39992dq5> interfaceC48627sP5, boolean z) {
        return new C10413k(interfaceC48627sP5, z);
    }
}
