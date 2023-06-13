package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC46670p61;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001aÑ\u0001\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2>\b\u0002\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000f¢\u0006\u0002\b\u00172>\b\u0002\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000f¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\nø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aë\u0001\u0010\"\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0 2>\b\u0002\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000f¢\u0006\u0002\b\u00172>\b\u0002\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000f¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001af\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0011\u0018\u00010(*\u00020$2\u0018\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\u00000%2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0 0%2\u0006\u0010'\u001a\u00020&2\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aS\u00100\u001a\u00020\n*\u00020$2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aA\u00105\u001a\u00020\n*\u00020$2\u0006\u0010\t\u001a\u00020\b2\u0006\u00103\u001a\u0002022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\u0000H\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a!\u00107\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a!\u00109\u001a\u00020\u0001*\u00020!2\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u00108\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006:"}, m28432d2 = {"Lkotlin/Function1;", "", "", "onDelta", "Lx61;", C17296a.f69688o, "LgV2;", TransferTable.COLUMN_STATE, "LEy3;", "orientation", "", "enabled", "LrX2;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "LZC0;", "LCe3;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "velocity", "onDragStopped", "reverseDirection", "i", "(LgV2;Lx61;LEy3;ZLrX2;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)LgV2;", "LjX3;", "canDrag", "Lkotlin/Function0;", "Lro6;", "j", "(LgV2;Lx61;Lkotlin/jvm/functions/Function1;LEy3;ZLrX2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)LgV2;", "LWu;", "LsP5;", "Lvo6;", "velocityTracker", "Lkotlin/Pair;", "g", "(LWu;LsP5;LsP5;Lvo6;LEy3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startEvent", "initialDelta", "Lys5;", "Lp61;", "channel", "h", "(LWu;LjX3;JLvo6;Lys5;ZLEy3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LiX3;", "pointerId", "onDrag", "m", "(LWu;LEy3;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "(JLEy3;)F", "o", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 5 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,461:1\n25#2:462\n1114#3,6:463\n135#4:469\n658#5,18:470\n676#5,4:497\n680#5,58:508\n581#5,6:566\n615#5,4:572\n619#5,2:585\n621#5,8:594\n588#5,10:602\n116#6,2:488\n33#6,6:490\n118#6:496\n33#6,6:501\n118#6:507\n116#6,2:576\n33#6,6:578\n118#6:584\n33#6,6:587\n118#6:593\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n141#1:462\n141#1:463,6\n209#1:469\n334#1:470,18\n334#1:497,4\n334#1:508,58\n387#1:566,6\n387#1:572,4\n387#1:585,2\n387#1:594,8\n387#1:602,10\n334#1:488,2\n334#1:490,6\n334#1:496\n334#1:501,6\n334#1:507\n387#1:576,2\n387#1:578,6\n387#1:584\n387#1:587,6\n387#1:593\n*E\n"})
/* renamed from: w61  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50819w61 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DraggableKt", m28418f = "Draggable.kt", m28417i = {0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, m28416l = {316, 325, 478, 528}, m28415m = "awaitDownAndSlop", m28414n = {"$this$awaitDownAndSlop", "canDrag", "startDragImmediately", "velocityTracker", "orientation", "$this$awaitDownAndSlop", "velocityTracker", "orientation", "initialDelta", "postPointerSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "initialDelta", "postPointerSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "F$0", "F$1", "F$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "F$0", "F$1", "F$2"})
    /* renamed from: w61$a */
    /* loaded from: classes.dex */
    public static final class C29760a extends ContinuationImpl {

        /* renamed from: h */
        public Object f115272h;

        /* renamed from: i */
        public Object f115273i;

        /* renamed from: j */
        public Object f115274j;

        /* renamed from: k */
        public Object f115275k;

        /* renamed from: l */
        public Object f115276l;

        /* renamed from: m */
        public Object f115277m;

        /* renamed from: n */
        public int f115278n;

        /* renamed from: o */
        public float f115279o;

        /* renamed from: p */
        public float f115280p;

        /* renamed from: q */
        public float f115281q;

        /* renamed from: r */
        public /* synthetic */ Object f115282r;

        /* renamed from: s */
        public int f115283s;

        public C29760a(Continuation<? super C29760a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115282r = obj;
            this.f115283s |= Integer.MIN_VALUE;
            return C50819w61.m7435g(null, null, null, null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LjX3;", "event", "LCe3;", "offset", "", C17296a.f69688o, "(LjX3;J)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: w61$b */
    /* loaded from: classes.dex */
    public static final class C29761b extends Lambda implements Function2<C43361jX3, C32120Ce3, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C50645vo6 f115284g;

        /* renamed from: h */
        public final /* synthetic */ Ref.LongRef f115285h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29761b(C50645vo6 c50645vo6, Ref.LongRef longRef) {
            super(2);
            this.f115284g = c50645vo6;
            this.f115285h = longRef;
        }

        /* renamed from: a */
        public final void m7426a(C43361jX3 event, long j) {
            Intrinsics.checkNotNullParameter(event, "event");
            C51238wo6.m6306c(this.f115284g, event);
            event.m30364a();
            this.f115285h.element = j;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(C43361jX3 c43361jX3, C32120Ce3 c32120Ce3) {
            m7426a(c43361jX3, c32120Ce3.m111935x());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LjX3;", "event", "", C17296a.f69688o, "(LjX3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: w61$c */
    /* loaded from: classes.dex */
    public static final class C29762c extends Lambda implements Function1<C43361jX3, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C50645vo6 f115286g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC52463ys5<AbstractC46670p61> f115287h;

        /* renamed from: i */
        public final /* synthetic */ boolean f115288i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29762c(C50645vo6 c50645vo6, InterfaceC52463ys5<? super AbstractC46670p61> interfaceC52463ys5, boolean z) {
            super(1);
            this.f115286g = c50645vo6;
            this.f115287h = interfaceC52463ys5;
            this.f115288i = z;
        }

        /* renamed from: a */
        public final void m7425a(C43361jX3 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            C51238wo6.m6306c(this.f115286g, event);
            if (!ZW3.m72995d(event)) {
                long m72992g = ZW3.m72992g(event);
                event.m30364a();
                InterfaceC52463ys5<AbstractC46670p61> interfaceC52463ys5 = this.f115287h;
                if (this.f115288i) {
                    m72992g = C32120Ce3.m111938u(m72992g, -1.0f);
                }
                interfaceC52463ys5.mo2349h(new AbstractC46670p61.C27142b(m72992g, null));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43361jX3 c43361jX3) {
            m7425a(c43361jX3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n1#1,170:1\n210#2,11:171\n*E\n"})
    /* renamed from: w61$d */
    /* loaded from: classes.dex */
    public static final class C29763d extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1 f115289g;

        /* renamed from: h */
        public final /* synthetic */ EnumC32768Ey3 f115290h;

        /* renamed from: i */
        public final /* synthetic */ boolean f115291i;

        /* renamed from: j */
        public final /* synthetic */ boolean f115292j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC48104rX2 f115293k;

        /* renamed from: l */
        public final /* synthetic */ Function0 f115294l;

        /* renamed from: m */
        public final /* synthetic */ Function3 f115295m;

        /* renamed from: n */
        public final /* synthetic */ Function3 f115296n;

        /* renamed from: o */
        public final /* synthetic */ InterfaceC51412x61 f115297o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29763d(Function1 function1, EnumC32768Ey3 enumC32768Ey3, boolean z, boolean z2, InterfaceC48104rX2 interfaceC48104rX2, Function0 function0, Function3 function3, Function3 function32, InterfaceC51412x61 interfaceC51412x61) {
            super(1);
            this.f115289g = function1;
            this.f115290h = enumC32768Ey3;
            this.f115291i = z;
            this.f115292j = z2;
            this.f115293k = interfaceC48104rX2;
            this.f115294l = function0;
            this.f115295m = function3;
            this.f115296n = function32;
            this.f115297o = interfaceC51412x61;
        }

        /* renamed from: a */
        public final void m7424a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("draggable");
            s42.m86038a().m104824a("canDrag", this.f115289g);
            s42.m86038a().m104824a("orientation", this.f115290h);
            s42.m86038a().m104824a("enabled", Boolean.valueOf(this.f115291i));
            s42.m86038a().m104824a("reverseDirection", Boolean.valueOf(this.f115292j));
            s42.m86038a().m104824a("interactionSource", this.f115293k);
            s42.m86038a().m104824a("startDragImmediately", this.f115294l);
            s42.m86038a().m104824a("onDragStarted", this.f115295m);
            s42.m86038a().m104824a("onDragStopped", this.f115296n);
            s42.m86038a().m104824a(TransferTable.COLUMN_STATE, this.f115297o);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m7424a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m28432d2 = {"LZC0;", "LCe3;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", m28418f = "Draggable.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: w61$e */
    /* loaded from: classes.dex */
    public static final class C29764e extends SuspendLambda implements Function3<ZC0, C32120Ce3, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f115298h;

        public C29764e(Continuation<? super C29764e> continuation) {
            super(3, continuation);
        }

        /* renamed from: e */
        public final Object m7423e(ZC0 zc0, long j, Continuation<? super Unit> continuation) {
            return new C29764e(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, C32120Ce3 c32120Ce3, Continuation<? super Unit> continuation) {
            return m7423e(zc0, c32120Ce3.m111935x(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f115298h == 0) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m28432d2 = {"LZC0;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", m28418f = "Draggable.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: w61$f */
    /* loaded from: classes.dex */
    public static final class C29765f extends SuspendLambda implements Function3<ZC0, Float, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f115299h;

        public C29765f(Continuation<? super C29765f> continuation) {
            super(3, continuation);
        }

        /* renamed from: e */
        public final Object m7422e(ZC0 zc0, float f, Continuation<? super Unit> continuation) {
            return new C29765f(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Float f, Continuation<? super Unit> continuation) {
            return m7422e(zc0, f.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f115299h == 0) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LjX3;", "it", "", C17296a.f69688o, "(LjX3;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: w61$g */
    /* loaded from: classes.dex */
    public static final class C29766g extends Lambda implements Function1<C43361jX3, Boolean> {

        /* renamed from: g */
        public static final C29766g f115300g = new C29766g();

        public C29766g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C43361jX3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: w61$h */
    /* loaded from: classes.dex */
    public static final class C29767h extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public final /* synthetic */ boolean f115301g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29767h(boolean z) {
            super(0);
            this.f115301g = z;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f115301g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m28432d2 = {"LZC0;", "Lro6;", "velocity", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", m28418f = "Draggable.kt", m28417i = {}, m28416l = {193}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: w61$i */
    /* loaded from: classes.dex */
    public static final class C29768i extends SuspendLambda implements Function3<ZC0, C48275ro6, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f115302h;

        /* renamed from: i */
        public /* synthetic */ Object f115303i;

        /* renamed from: j */
        public /* synthetic */ long f115304j;

        /* renamed from: k */
        public final /* synthetic */ Function3<ZC0, Float, Continuation<? super Unit>, Object> f115305k;

        /* renamed from: l */
        public final /* synthetic */ EnumC32768Ey3 f115306l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29768i(Function3<? super ZC0, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function3, EnumC32768Ey3 enumC32768Ey3, Continuation<? super C29768i> continuation) {
            super(3, continuation);
            this.f115305k = function3;
            this.f115306l = enumC32768Ey3;
        }

        /* renamed from: e */
        public final Object m7420e(ZC0 zc0, long j, Continuation<? super Unit> continuation) {
            C29768i c29768i = new C29768i(this.f115305k, this.f115306l, continuation);
            c29768i.f115303i = zc0;
            c29768i.f115304j = j;
            return c29768i.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, C48275ro6 c48275ro6, Continuation<? super Unit> continuation) {
            return m7420e(zc0, c48275ro6.m15350o(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f115302h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                long j = this.f115304j;
                Function3<ZC0, Float, Continuation<? super Unit>, Object> function3 = this.f115305k;
                Float boxFloat = Boxing.boxFloat(C50819w61.m7427o(j, this.f115306l));
                this.f115302h = 1;
                if (function3.invoke((ZC0) this.f115303i, boxFloat, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m28432d2 = {"LZC0;", "LCe3;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DraggableKt$draggable$6", m28418f = "Draggable.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: w61$j */
    /* loaded from: classes.dex */
    public static final class C29769j extends SuspendLambda implements Function3<ZC0, C32120Ce3, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f115307h;

        public C29769j(Continuation<? super C29769j> continuation) {
            super(3, continuation);
        }

        /* renamed from: e */
        public final Object m7419e(ZC0 zc0, long j, Continuation<? super Unit> continuation) {
            return new C29769j(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, C32120Ce3 c32120Ce3, Continuation<? super Unit> continuation) {
            return m7419e(zc0, c32120Ce3.m111935x(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f115307h == 0) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m28432d2 = {"LZC0;", "Lro6;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DraggableKt$draggable$7", m28418f = "Draggable.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: w61$k */
    /* loaded from: classes.dex */
    public static final class C29770k extends SuspendLambda implements Function3<ZC0, C48275ro6, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f115308h;

        public C29770k(Continuation<? super C29770k> continuation) {
            super(3, continuation);
        }

        /* renamed from: e */
        public final Object m7418e(ZC0 zc0, long j, Continuation<? super Unit> continuation) {
            return new C29770k(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, C48275ro6 c48275ro6, Continuation<? super Unit> continuation) {
            return m7418e(zc0, c48275ro6.m15350o(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f115308h == 0) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", "b", "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,461:1\n25#2:462\n50#2:469\n49#2:470\n25#2:477\n1114#3,6:463\n1114#3,6:471\n1114#3,6:478\n76#4:484\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9\n*L\n222#1:462\n223#1:469\n223#1:470\n231#1:477\n222#1:463,6\n223#1:471,6\n231#1:478,6\n234#1:484\n*E\n"})
    /* renamed from: w61$l */
    /* loaded from: classes.dex */
    public static final class C29771l extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48104rX2 f115309g;

        /* renamed from: h */
        public final /* synthetic */ Function0<Boolean> f115310h;

        /* renamed from: i */
        public final /* synthetic */ Function1<C43361jX3, Boolean> f115311i;

        /* renamed from: j */
        public final /* synthetic */ Function3<ZC0, C32120Ce3, Continuation<? super Unit>, Object> f115312j;

        /* renamed from: k */
        public final /* synthetic */ Function3<ZC0, C48275ro6, Continuation<? super Unit>, Object> f115313k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC51412x61 f115314l;

        /* renamed from: m */
        public final /* synthetic */ EnumC32768Ey3 f115315m;

        /* renamed from: n */
        public final /* synthetic */ boolean f115316n;

        /* renamed from: o */
        public final /* synthetic */ boolean f115317o;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,461:1\n62#2,5:462\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9$1$1\n*L\n224#1:462,5\n*E\n"})
        /* renamed from: w61$l$a */
        /* loaded from: classes.dex */
        public static final class C29772a extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

            /* renamed from: g */
            public final /* synthetic */ EX2<C48448s61> f115318g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC48104rX2 f115319h;

            @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"w61$l$a$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9$1$1\n*L\n1#1,484:1\n225#2,5:485\n*E\n"})
            /* renamed from: w61$l$a$a */
            /* loaded from: classes.dex */
            public static final class C29773a implements InterfaceC44288l51 {

                /* renamed from: a */
                public final /* synthetic */ EX2 f115320a;

                /* renamed from: b */
                public final /* synthetic */ InterfaceC48104rX2 f115321b;

                public C29773a(EX2 ex2, InterfaceC48104rX2 interfaceC48104rX2) {
                    this.f115320a = ex2;
                    this.f115321b = interfaceC48104rX2;
                }

                @Override // p000.InterfaceC44288l51
                public void dispose() {
                    C48448s61 c48448s61 = (C48448s61) this.f115320a.getValue();
                    if (c48448s61 != null) {
                        InterfaceC48104rX2 interfaceC48104rX2 = this.f115321b;
                        if (interfaceC48104rX2 != null) {
                            interfaceC48104rX2.mo14090a(new C47856r61(c48448s61));
                        }
                        this.f115320a.setValue(null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29772a(EX2<C48448s61> ex2, InterfaceC48104rX2 interfaceC48104rX2) {
                super(1);
                this.f115318g = ex2;
                this.f115319h = interfaceC48104rX2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                return new C29773a(this.f115318g, this.f115319h);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", m28418f = "Draggable.kt", m28417i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, m28416l = {239, 241, 243, 251, 253, 257}, m28415m = "invokeSuspend", m28414n = {"$this$LaunchedEffect", "event", "$this$LaunchedEffect", "event", "$this$LaunchedEffect", "event", "$this$LaunchedEffect", "$this$LaunchedEffect", "$this$LaunchedEffect"}, m28413s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
        @SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,461:1\n1#2:462\n*E\n"})
        /* renamed from: w61$l$b */
        /* loaded from: classes.dex */
        public static final class C29774b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public Object f115322h;

            /* renamed from: i */
            public Object f115323i;

            /* renamed from: j */
            public int f115324j;

            /* renamed from: k */
            public /* synthetic */ Object f115325k;

            /* renamed from: l */
            public final /* synthetic */ InterfaceC32846Fh0<AbstractC46670p61> f115326l;

            /* renamed from: m */
            public final /* synthetic */ InterfaceC51412x61 f115327m;

            /* renamed from: n */
            public final /* synthetic */ InterfaceC48627sP5<C49634u61> f115328n;

            /* renamed from: o */
            public final /* synthetic */ EnumC32768Ey3 f115329o;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", m28418f = "Draggable.kt", m28417i = {0}, m28416l = {246}, m28415m = "invokeSuspend", m28414n = {"$this$drag"}, m28413s = {"L$0"})
            @SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,461:1\n1#2:462\n*E\n"})
            /* renamed from: w61$l$b$a */
            /* loaded from: classes.dex */
            public static final class C29775a extends SuspendLambda implements Function2<InterfaceC50226v61, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public Object f115330h;

                /* renamed from: i */
                public int f115331i;

                /* renamed from: j */
                public /* synthetic */ Object f115332j;

                /* renamed from: k */
                public final /* synthetic */ Ref.ObjectRef<AbstractC46670p61> f115333k;

                /* renamed from: l */
                public final /* synthetic */ InterfaceC32846Fh0<AbstractC46670p61> f115334l;

                /* renamed from: m */
                public final /* synthetic */ EnumC32768Ey3 f115335m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C29775a(Ref.ObjectRef<AbstractC46670p61> objectRef, InterfaceC32846Fh0<AbstractC46670p61> interfaceC32846Fh0, EnumC32768Ey3 enumC32768Ey3, Continuation<? super C29775a> continuation) {
                    super(2, continuation);
                    this.f115333k = objectRef;
                    this.f115334l = interfaceC32846Fh0;
                    this.f115335m = enumC32768Ey3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C29775a c29775a = new C29775a(this.f115333k, this.f115334l, this.f115335m, continuation);
                    c29775a.f115332j = obj;
                    return c29775a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: e */
                public final Object invoke(InterfaceC50226v61 interfaceC50226v61, Continuation<? super Unit> continuation) {
                    return ((C29775a) create(interfaceC50226v61, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:23:0x0066). Please submit an issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    InterfaceC50226v61 interfaceC50226v61;
                    C29775a c29775a;
                    AbstractC46670p61 abstractC46670p61;
                    AbstractC46670p61.C27142b c27142b;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f115331i;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                            InterfaceC50226v61 interfaceC50226v612 = (InterfaceC50226v61) this.f115332j;
                            Ref.ObjectRef<AbstractC46670p61> objectRef = (Ref.ObjectRef) this.f115330h;
                            Object obj2 = coroutine_suspended;
                            C29775a c29775a2 = this;
                            T t = obj;
                            objectRef.element = t;
                            c29775a = c29775a2;
                            coroutine_suspended = obj2;
                            interfaceC50226v61 = interfaceC50226v612;
                            abstractC46670p61 = c29775a.f115333k.element;
                            if ((abstractC46670p61 instanceof AbstractC46670p61.C27144d) && !(abstractC46670p61 instanceof AbstractC46670p61.C27141a)) {
                                if (abstractC46670p61 instanceof AbstractC46670p61.C27142b) {
                                    c27142b = (AbstractC46670p61.C27142b) abstractC46670p61;
                                } else {
                                    c27142b = null;
                                }
                                if (c27142b != null) {
                                    interfaceC50226v61.mo9194a(C50819w61.m7428n(c27142b.m19960a(), c29775a.f115335m));
                                }
                                Ref.ObjectRef<AbstractC46670p61> objectRef2 = c29775a.f115333k;
                                InterfaceC32846Fh0<AbstractC46670p61> interfaceC32846Fh0 = c29775a.f115334l;
                                c29775a.f115332j = interfaceC50226v61;
                                c29775a.f115330h = objectRef2;
                                c29775a.f115331i = 1;
                                Object mo28256G = interfaceC32846Fh0.mo28256G(c29775a);
                                if (mo28256G == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                Object obj3 = coroutine_suspended;
                                c29775a2 = c29775a;
                                t = mo28256G;
                                interfaceC50226v612 = interfaceC50226v61;
                                objectRef = objectRef2;
                                obj2 = obj3;
                                objectRef.element = t;
                                c29775a = c29775a2;
                                coroutine_suspended = obj2;
                                interfaceC50226v61 = interfaceC50226v612;
                                abstractC46670p61 = c29775a.f115333k.element;
                                if (abstractC46670p61 instanceof AbstractC46670p61.C27144d) {
                                }
                                return Unit.INSTANCE;
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    interfaceC50226v61 = (InterfaceC50226v61) this.f115332j;
                    c29775a = this;
                    abstractC46670p61 = c29775a.f115333k.element;
                    if (abstractC46670p61 instanceof AbstractC46670p61.C27144d) {
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29774b(InterfaceC32846Fh0<AbstractC46670p61> interfaceC32846Fh0, InterfaceC51412x61 interfaceC51412x61, InterfaceC48627sP5<C49634u61> interfaceC48627sP5, EnumC32768Ey3 enumC32768Ey3, Continuation<? super C29774b> continuation) {
                super(2, continuation);
                this.f115326l = interfaceC32846Fh0;
                this.f115327m = interfaceC51412x61;
                this.f115328n = interfaceC48627sP5;
                this.f115329o = enumC32768Ey3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C29774b c29774b = new C29774b(this.f115326l, this.f115327m, this.f115328n, this.f115329o, continuation);
                c29774b.f115325k = obj;
                return c29774b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C29774b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00cd A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00dc A[Catch: CancellationException -> 0x010d, TryCatch #3 {CancellationException -> 0x010d, blocks: (B:38:0x00d0, B:40:0x00dc, B:45:0x00f7, B:47:0x00fb), top: B:67:0x00d0 }] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00f7 A[Catch: CancellationException -> 0x010d, TryCatch #3 {CancellationException -> 0x010d, blocks: (B:38:0x00d0, B:40:0x00dc, B:45:0x00f7, B:47:0x00fb), top: B:67:0x00d0 }] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0124 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
            /* JADX WARN: Type inference failed for: r11v12, types: [T] */
            /* JADX WARN: Type inference failed for: r11v21 */
            /* JADX WARN: Type inference failed for: r11v29 */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v35 */
            /* JADX WARN: Type inference failed for: r1v43 */
            /* JADX WARN: Type inference failed for: r1v44 */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00f2 -> B:22:0x0068). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0109 -> B:22:0x0068). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0125 -> B:22:0x0068). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0129 -> B:22:0x0068). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                C29774b c29774b;
                ZC0 zc0;
                C49634u61 m7415c;
                ZC0 zc02;
                C29774b c29774b2;
                C29774b c29774b3;
                ZC0 zc03;
                ZC0 zc04;
                Ref.ObjectRef objectRef;
                Object obj2;
                ZC0 zc05;
                InterfaceC51412x61 interfaceC51412x61;
                OX2 ox2;
                C29775a c29775a;
                ?? r11;
                Ref.ObjectRef objectRef2;
                Ref.ObjectRef objectRef3;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ZC0 zc06 = this.f115324j;
                switch (zc06) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        zc02 = (ZC0) this.f115325k;
                        c29774b2 = this;
                        if (C37824aD0.m71785f(zc02)) {
                            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                            InterfaceC32846Fh0<AbstractC46670p61> interfaceC32846Fh0 = c29774b2.f115326l;
                            c29774b2.f115325k = zc02;
                            c29774b2.f115322h = objectRef4;
                            c29774b2.f115323i = objectRef4;
                            c29774b2.f115324j = 1;
                            Object mo28256G = interfaceC32846Fh0.mo28256G(c29774b2);
                            if (mo28256G == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef2 = objectRef4;
                            c29774b = c29774b2;
                            objectRef3 = objectRef2;
                            zc05 = zc02;
                            r11 = mo28256G;
                            objectRef3.element = r11;
                            if (!(objectRef2.element instanceof AbstractC46670p61.C27143c)) {
                                C49634u61 m7415c2 = C29771l.m7415c(c29774b.f115328n);
                                Object obj3 = objectRef2.element;
                                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStarted");
                                c29774b.f115325k = zc05;
                                c29774b.f115322h = objectRef2;
                                c29774b.f115323i = null;
                                c29774b.f115324j = 2;
                                if (m7415c2.m10864b(zc05, (AbstractC46670p61.C27143c) obj3, c29774b) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                objectRef = objectRef2;
                                try {
                                } catch (CancellationException unused) {
                                    zc0 = zc05;
                                    m7415c = C29771l.m7415c(c29774b.f115328n);
                                    c29774b.f115325k = zc0;
                                    c29774b.f115322h = null;
                                    c29774b.f115324j = 6;
                                    if (m7415c.m10865a(zc0, c29774b) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    zc02 = zc0;
                                    c29774b2 = c29774b;
                                    if (C37824aD0.m71785f(zc02)) {
                                    }
                                }
                                interfaceC51412x61 = c29774b.f115327m;
                                ox2 = OX2.UserInput;
                                c29775a = new C29775a(objectRef, c29774b.f115326l, c29774b.f115329o, null);
                                c29774b.f115325k = zc05;
                                c29774b.f115322h = objectRef;
                                c29774b.f115324j = 3;
                                if (interfaceC51412x61.mo5846d(ox2, c29775a, c29774b) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                c29774b3 = c29774b;
                                zc04 = zc05;
                                try {
                                } catch (CancellationException unused2) {
                                    zc0 = zc04;
                                    c29774b = c29774b3;
                                    m7415c = C29771l.m7415c(c29774b.f115328n);
                                    c29774b.f115325k = zc0;
                                    c29774b.f115322h = null;
                                    c29774b.f115324j = 6;
                                    if (m7415c.m10865a(zc0, c29774b) == coroutine_suspended) {
                                    }
                                }
                                C49634u61 m7415c3 = C29771l.m7415c(c29774b3.f115328n);
                                obj2 = objectRef.element;
                                if (obj2 instanceof AbstractC46670p61.C27144d) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                                    c29774b3.f115325k = zc04;
                                    c29774b3.f115322h = null;
                                    c29774b3.f115324j = 4;
                                    if (m7415c3.m10863c(zc04, (AbstractC46670p61.C27144d) obj2, c29774b3) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else if (obj2 instanceof AbstractC46670p61.C27141a) {
                                    c29774b3.f115325k = zc04;
                                    c29774b3.f115322h = null;
                                    c29774b3.f115324j = 5;
                                    if (m7415c3.m10865a(zc04, c29774b3) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    c29774b2 = c29774b3;
                                    zc02 = zc04;
                                    if (C37824aD0.m71785f(zc02)) {
                                        return Unit.INSTANCE;
                                    }
                                }
                                zc03 = zc04;
                                ZC0 zc07 = zc03;
                                c29774b2 = c29774b3;
                                zc02 = zc07;
                                if (C37824aD0.m71785f(zc02)) {
                                }
                            } else {
                                c29774b2 = c29774b;
                                zc02 = zc05;
                                if (C37824aD0.m71785f(zc02)) {
                                }
                            }
                        }
                    case 1:
                        objectRef3 = (Ref.ObjectRef) this.f115323i;
                        zc05 = (ZC0) this.f115325k;
                        ResultKt.throwOnFailure(obj);
                        objectRef2 = (Ref.ObjectRef) this.f115322h;
                        c29774b = this;
                        r11 = obj;
                        objectRef3.element = r11;
                        if (!(objectRef2.element instanceof AbstractC46670p61.C27143c)) {
                        }
                        break;
                    case 2:
                        objectRef = (Ref.ObjectRef) this.f115322h;
                        ResultKt.throwOnFailure(obj);
                        zc05 = (ZC0) this.f115325k;
                        c29774b = this;
                        interfaceC51412x61 = c29774b.f115327m;
                        ox2 = OX2.UserInput;
                        c29775a = new C29775a(objectRef, c29774b.f115326l, c29774b.f115329o, null);
                        c29774b.f115325k = zc05;
                        c29774b.f115322h = objectRef;
                        c29774b.f115324j = 3;
                        if (interfaceC51412x61.mo5846d(ox2, c29775a, c29774b) != coroutine_suspended) {
                        }
                        break;
                    case 3:
                        objectRef = (Ref.ObjectRef) this.f115322h;
                        zc04 = (ZC0) this.f115325k;
                        try {
                            ResultKt.throwOnFailure(obj);
                            c29774b3 = this;
                        } catch (CancellationException unused3) {
                            zc06 = zc04;
                            c29774b = this;
                            zc0 = zc06;
                            m7415c = C29771l.m7415c(c29774b.f115328n);
                            c29774b.f115325k = zc0;
                            c29774b.f115322h = null;
                            c29774b.f115324j = 6;
                            if (m7415c.m10865a(zc0, c29774b) == coroutine_suspended) {
                            }
                        }
                        C49634u61 m7415c32 = C29771l.m7415c(c29774b3.f115328n);
                        obj2 = objectRef.element;
                        if (obj2 instanceof AbstractC46670p61.C27144d) {
                        }
                        zc03 = zc04;
                        ZC0 zc072 = zc03;
                        c29774b2 = c29774b3;
                        zc02 = zc072;
                        if (C37824aD0.m71785f(zc02)) {
                        }
                        break;
                    case 4:
                        ZC0 zc08 = (ZC0) this.f115325k;
                        ResultKt.throwOnFailure(obj);
                        zc06 = zc08;
                        c29774b3 = this;
                        zc03 = zc06;
                        ZC0 zc0722 = zc03;
                        c29774b2 = c29774b3;
                        zc02 = zc0722;
                        if (C37824aD0.m71785f(zc02)) {
                        }
                        break;
                    case 5:
                        ZC0 zc09 = (ZC0) this.f115325k;
                        ResultKt.throwOnFailure(obj);
                        zc06 = zc09;
                        c29774b3 = this;
                        zc03 = zc06;
                        ZC0 zc07222 = zc03;
                        c29774b2 = c29774b3;
                        zc02 = zc07222;
                        if (C37824aD0.m71785f(zc02)) {
                        }
                        break;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        zc02 = (ZC0) this.f115325k;
                        c29774b2 = this;
                        if (C37824aD0.m71785f(zc02)) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", m28418f = "Draggable.kt", m28417i = {}, m28416l = {263}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: w61$l$c */
        /* loaded from: classes.dex */
        public static final class C29776c extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f115336h;

            /* renamed from: i */
            public /* synthetic */ Object f115337i;

            /* renamed from: j */
            public final /* synthetic */ boolean f115338j;

            /* renamed from: k */
            public final /* synthetic */ InterfaceC48627sP5<Function1<C43361jX3, Boolean>> f115339k;

            /* renamed from: l */
            public final /* synthetic */ InterfaceC48627sP5<Function0<Boolean>> f115340l;

            /* renamed from: m */
            public final /* synthetic */ EnumC32768Ey3 f115341m;

            /* renamed from: n */
            public final /* synthetic */ InterfaceC32846Fh0<AbstractC46670p61> f115342n;

            /* renamed from: o */
            public final /* synthetic */ boolean f115343o;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", m28418f = "Draggable.kt", m28417i = {0}, m28416l = {265}, m28415m = "invokeSuspend", m28414n = {"$this$coroutineScope"}, m28413s = {"L$0"})
            /* renamed from: w61$l$c$a */
            /* loaded from: classes.dex */
            public static final class C29777a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f115344h;

                /* renamed from: i */
                public /* synthetic */ Object f115345i;

                /* renamed from: j */
                public final /* synthetic */ InterfaceC49290tX3 f115346j;

                /* renamed from: k */
                public final /* synthetic */ InterfaceC48627sP5<Function1<C43361jX3, Boolean>> f115347k;

                /* renamed from: l */
                public final /* synthetic */ InterfaceC48627sP5<Function0<Boolean>> f115348l;

                /* renamed from: m */
                public final /* synthetic */ EnumC32768Ey3 f115349m;

                /* renamed from: n */
                public final /* synthetic */ InterfaceC32846Fh0<AbstractC46670p61> f115350n;

                /* renamed from: o */
                public final /* synthetic */ boolean f115351o;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", m28418f = "Draggable.kt", m28417i = {0, 0, 1, 1, 1}, m28416l = {268, 276}, m28415m = "invokeSuspend", m28414n = {"$this$awaitPointerEventScope", "velocityTracker", "$this$awaitPointerEventScope", "velocityTracker", "isDragSuccessful"}, m28413s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
                /* renamed from: w61$l$c$a$a */
                /* loaded from: classes.dex */
                public static final class C29778a extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> {

                    /* renamed from: h */
                    public Object f115352h;

                    /* renamed from: i */
                    public Object f115353i;

                    /* renamed from: j */
                    public Object f115354j;

                    /* renamed from: k */
                    public boolean f115355k;

                    /* renamed from: l */
                    public int f115356l;

                    /* renamed from: m */
                    public int f115357m;

                    /* renamed from: n */
                    public /* synthetic */ Object f115358n;

                    /* renamed from: o */
                    public final /* synthetic */ ZC0 f115359o;

                    /* renamed from: p */
                    public final /* synthetic */ InterfaceC48627sP5<Function1<C43361jX3, Boolean>> f115360p;

                    /* renamed from: q */
                    public final /* synthetic */ InterfaceC48627sP5<Function0<Boolean>> f115361q;

                    /* renamed from: r */
                    public final /* synthetic */ EnumC32768Ey3 f115362r;

                    /* renamed from: s */
                    public final /* synthetic */ InterfaceC32846Fh0<AbstractC46670p61> f115363s;

                    /* renamed from: t */
                    public final /* synthetic */ boolean f115364t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C29778a(ZC0 zc0, InterfaceC48627sP5<? extends Function1<? super C43361jX3, Boolean>> interfaceC48627sP5, InterfaceC48627sP5<? extends Function0<Boolean>> interfaceC48627sP52, EnumC32768Ey3 enumC32768Ey3, InterfaceC32846Fh0<AbstractC46670p61> interfaceC32846Fh0, boolean z, Continuation<? super C29778a> continuation) {
                        super(2, continuation);
                        this.f115359o = zc0;
                        this.f115360p = interfaceC48627sP5;
                        this.f115361q = interfaceC48627sP52;
                        this.f115362r = enumC32768Ey3;
                        this.f115363s = interfaceC32846Fh0;
                        this.f115364t = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C29778a c29778a = new C29778a(this.f115359o, this.f115360p, this.f115361q, this.f115362r, this.f115363s, this.f115364t, continuation);
                        c29778a.f115358n = obj;
                        return c29778a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: e */
                    public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
                        return ((C29778a) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Can't wrap try/catch for region: R(9:27|(1:28)|29|(1:31)(1:60)|32|33|34|35|(1:37)(8:38|9|10|(0)(0)|16|17|18|(2:67|68)(0))) */
                    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
                        r0 = th;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:51:0x0117, code lost:
                        r0 = e;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
                        r10 = r20;
                        r12 = r22;
                        r13 = r23;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:58:0x0133, code lost:
                        r14 = r2;
                        r2 = r3;
                        r11 = r19;
                        r10 = r20;
                        r12 = r22;
                        r13 = r23;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
                    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x0143  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x014e A[Catch: all -> 0x014f, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x014f, blocks: (B:59:0x013d, B:63:0x014e), top: B:77:0x013d }] */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
                    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x016d  */
                    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00da -> B:79:0x00e7). Please submit an issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0143 -> B:62:0x0148). Please submit an issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x016d -> B:17:0x005e). Please submit an issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
                        InterfaceC9204Wu interfaceC9204Wu;
                        C29778a c29778a;
                        Throwable th;
                        AbstractC46670p61 abstractC46670p61;
                        float f;
                        C29778a c29778a2;
                        CancellationException e;
                        Object obj2;
                        C50645vo6 c50645vo6;
                        C29778a c29778a3;
                        Object obj3;
                        InterfaceC9204Wu interfaceC9204Wu2;
                        Pair pair;
                        boolean z;
                        InterfaceC32846Fh0<AbstractC46670p61> interfaceC32846Fh0;
                        C50645vo6 c50645vo62;
                        ZC0 zc0;
                        Object obj4;
                        boolean z2;
                        Object m7434h;
                        C29778a c29778a4;
                        InterfaceC32846Fh0<AbstractC46670p61> interfaceC32846Fh02;
                        AbstractC46670p61 abstractC46670p612;
                        float f2;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f115357m;
                        int i2 = 2;
                        int i3 = 0;
                        if (i != 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    int i4 = this.f115356l;
                                    boolean z3 = this.f115355k;
                                    ZC0 zc02 = (ZC0) this.f115354j;
                                    InterfaceC32846Fh0<AbstractC46670p61> interfaceC32846Fh03 = (InterfaceC32846Fh0) this.f115353i;
                                    C50645vo6 c50645vo63 = (C50645vo6) this.f115352h;
                                    InterfaceC9204Wu interfaceC9204Wu3 = (InterfaceC9204Wu) this.f115358n;
                                    try {
                                        ResultKt.throwOnFailure(obj);
                                        m7434h = obj;
                                        interfaceC32846Fh02 = interfaceC32846Fh03;
                                        c29778a4 = this;
                                    } catch (CancellationException e2) {
                                        e = e2;
                                        c29778a2 = this;
                                        try {
                                            if (C37824aD0.m71785f(zc02)) {
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (i3 == 0) {
                                                long m8008b = c50645vo63.m8008b();
                                                if (z3) {
                                                    f = -1.0f;
                                                } else {
                                                    f = 1.0f;
                                                }
                                                abstractC46670p61 = new AbstractC46670p61.C27144d(C48275ro6.m15352m(m8008b, f), null);
                                            } else {
                                                abstractC46670p61 = AbstractC46670p61.C27141a.f103131a;
                                            }
                                            interfaceC32846Fh03.mo2349h(abstractC46670p61);
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i3 = i4;
                                        if (i3 == 0) {
                                        }
                                        interfaceC32846Fh03.mo2349h(abstractC46670p61);
                                        throw th;
                                    }
                                    try {
                                    } catch (CancellationException e3) {
                                        e = e3;
                                        c29778a2 = c29778a4;
                                        interfaceC32846Fh03 = interfaceC32846Fh02;
                                        if (C37824aD0.m71785f(zc02)) {
                                            interfaceC32846Fh03.mo2349h(AbstractC46670p61.C27141a.f103131a);
                                            interfaceC9204Wu = interfaceC9204Wu3;
                                            c29778a = c29778a2;
                                            i2 = 2;
                                            if (C37824aD0.m71785f(c29778a.f115359o)) {
                                            }
                                        } else {
                                            throw e;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        interfaceC32846Fh03 = interfaceC32846Fh02;
                                        i3 = i4;
                                        if (i3 == 0) {
                                        }
                                        interfaceC32846Fh03.mo2349h(abstractC46670p61);
                                        throw th;
                                    }
                                    if (!((Boolean) m7434h).booleanValue()) {
                                        long m8008b2 = c50645vo63.m8008b();
                                        if (z3) {
                                            f2 = -1.0f;
                                        } else {
                                            f2 = 1.0f;
                                        }
                                        abstractC46670p612 = new AbstractC46670p61.C27144d(C48275ro6.m15352m(m8008b2, f2), null);
                                    } else {
                                        abstractC46670p612 = AbstractC46670p61.C27141a.f103131a;
                                    }
                                    interfaceC32846Fh02.mo2349h(abstractC46670p612);
                                    c29778a2 = c29778a4;
                                    interfaceC9204Wu = interfaceC9204Wu3;
                                    c29778a = c29778a2;
                                    i2 = 2;
                                    if (C37824aD0.m71785f(c29778a.f115359o)) {
                                        C50645vo6 c50645vo64 = new C50645vo6();
                                        InterfaceC48627sP5<Function1<C43361jX3, Boolean>> interfaceC48627sP5 = c29778a.f115360p;
                                        InterfaceC48627sP5<Function0<Boolean>> interfaceC48627sP52 = c29778a.f115361q;
                                        EnumC32768Ey3 enumC32768Ey3 = c29778a.f115362r;
                                        c29778a.f115358n = interfaceC9204Wu;
                                        c29778a.f115352h = c50645vo64;
                                        c29778a.f115353i = null;
                                        c29778a.f115354j = null;
                                        c29778a.f115357m = 1;
                                        obj3 = C50819w61.m7435g(interfaceC9204Wu, interfaceC48627sP5, interfaceC48627sP52, c50645vo64, enumC32768Ey3, c29778a);
                                        if (obj3 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        c29778a3 = c29778a;
                                        c50645vo6 = c50645vo64;
                                        obj2 = coroutine_suspended;
                                        interfaceC9204Wu2 = interfaceC9204Wu;
                                        pair = (Pair) obj3;
                                        if (pair == null) {
                                            InterfaceC32846Fh0<AbstractC46670p61> interfaceC32846Fh04 = c29778a3.f115363s;
                                            boolean z4 = c29778a3.f115364t;
                                            EnumC32768Ey3 enumC32768Ey32 = c29778a3.f115362r;
                                            ZC0 zc03 = c29778a3.f115359o;
                                            try {
                                            } catch (CancellationException e4) {
                                                e = e4;
                                                zc0 = zc03;
                                                z = z4;
                                                c29778a2 = c29778a3;
                                                interfaceC32846Fh0 = interfaceC32846Fh04;
                                                c50645vo62 = c50645vo6;
                                                obj4 = obj2;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                z = z4;
                                                interfaceC32846Fh0 = interfaceC32846Fh04;
                                                c50645vo62 = c50645vo6;
                                            }
                                            C43361jX3 c43361jX3 = (C43361jX3) pair.getFirst();
                                            long m111935x = ((C32120Ce3) pair.getSecond()).m111935x();
                                            if (z4) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            c29778a3.f115358n = interfaceC9204Wu2;
                                            c29778a3.f115352h = c50645vo6;
                                            c29778a3.f115353i = interfaceC32846Fh04;
                                            c29778a3.f115354j = zc03;
                                            c29778a3.f115355k = z4;
                                            c29778a3.f115356l = 0;
                                            c29778a3.f115357m = i2;
                                            zc0 = zc03;
                                            z = z4;
                                            c29778a2 = c29778a3;
                                            interfaceC32846Fh0 = interfaceC32846Fh04;
                                            c50645vo62 = c50645vo6;
                                            obj4 = obj2;
                                            m7434h = C50819w61.m7434h(interfaceC9204Wu2, c43361jX3, m111935x, c50645vo6, interfaceC32846Fh0, z2, enumC32768Ey32, c29778a2);
                                            if (m7434h == obj4) {
                                                return obj4;
                                            }
                                            interfaceC9204Wu3 = interfaceC9204Wu2;
                                            coroutine_suspended = obj4;
                                            i4 = 0;
                                            zc02 = zc0;
                                            z3 = z;
                                            c29778a4 = c29778a2;
                                            interfaceC32846Fh02 = interfaceC32846Fh0;
                                            c50645vo63 = c50645vo62;
                                            if (!((Boolean) m7434h).booleanValue()) {
                                            }
                                            interfaceC32846Fh02.mo2349h(abstractC46670p612);
                                            c29778a2 = c29778a4;
                                            interfaceC9204Wu = interfaceC9204Wu3;
                                            c29778a = c29778a2;
                                            i2 = 2;
                                            if (C37824aD0.m71785f(c29778a.f115359o)) {
                                                return Unit.INSTANCE;
                                            }
                                        } else {
                                            interfaceC9204Wu = interfaceC9204Wu2;
                                            coroutine_suspended = obj2;
                                            c29778a = c29778a3;
                                            if (C37824aD0.m71785f(c29778a.f115359o)) {
                                            }
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj);
                                c50645vo6 = (C50645vo6) this.f115352h;
                                c29778a3 = this;
                                obj2 = coroutine_suspended;
                                interfaceC9204Wu2 = (InterfaceC9204Wu) this.f115358n;
                                obj3 = obj;
                                pair = (Pair) obj3;
                                if (pair == null) {
                                }
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            interfaceC9204Wu = (InterfaceC9204Wu) this.f115358n;
                            c29778a = this;
                            if (C37824aD0.m71785f(c29778a.f115359o)) {
                            }
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C29777a(InterfaceC49290tX3 interfaceC49290tX3, InterfaceC48627sP5<? extends Function1<? super C43361jX3, Boolean>> interfaceC48627sP5, InterfaceC48627sP5<? extends Function0<Boolean>> interfaceC48627sP52, EnumC32768Ey3 enumC32768Ey3, InterfaceC32846Fh0<AbstractC46670p61> interfaceC32846Fh0, boolean z, Continuation<? super C29777a> continuation) {
                    super(2, continuation);
                    this.f115346j = interfaceC49290tX3;
                    this.f115347k = interfaceC48627sP5;
                    this.f115348l = interfaceC48627sP52;
                    this.f115349m = enumC32768Ey3;
                    this.f115350n = interfaceC32846Fh0;
                    this.f115351o = z;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C29777a c29777a = new C29777a(this.f115346j, this.f115347k, this.f115348l, this.f115349m, this.f115350n, this.f115351o, continuation);
                    c29777a.f115345i = obj;
                    return c29777a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C29777a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    ZC0 zc0;
                    CancellationException e;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f115344h;
                    if (i != 0) {
                        if (i == 1) {
                            zc0 = (ZC0) this.f115345i;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (CancellationException e2) {
                                e = e2;
                                if (!C37824aD0.m71785f(zc0)) {
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        ZC0 zc02 = (ZC0) this.f115345i;
                        try {
                            InterfaceC49290tX3 interfaceC49290tX3 = this.f115346j;
                            C29778a c29778a = new C29778a(zc02, this.f115347k, this.f115348l, this.f115349m, this.f115350n, this.f115351o, null);
                            this.f115345i = zc02;
                            this.f115344h = 1;
                            if (interfaceC49290tX3.mo3418v0(c29778a, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (CancellationException e3) {
                            zc0 = zc02;
                            e = e3;
                            if (!C37824aD0.m71785f(zc0)) {
                                throw e;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C29776c(boolean z, InterfaceC48627sP5<? extends Function1<? super C43361jX3, Boolean>> interfaceC48627sP5, InterfaceC48627sP5<? extends Function0<Boolean>> interfaceC48627sP52, EnumC32768Ey3 enumC32768Ey3, InterfaceC32846Fh0<AbstractC46670p61> interfaceC32846Fh0, boolean z2, Continuation<? super C29776c> continuation) {
                super(2, continuation);
                this.f115338j = z;
                this.f115339k = interfaceC48627sP5;
                this.f115340l = interfaceC48627sP52;
                this.f115341m = enumC32768Ey3;
                this.f115342n = interfaceC32846Fh0;
                this.f115343o = z2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C29776c c29776c = new C29776c(this.f115338j, this.f115339k, this.f115340l, this.f115341m, this.f115342n, this.f115343o, continuation);
                c29776c.f115337i = obj;
                return c29776c;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
                return ((C29776c) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f115336h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC49290tX3 interfaceC49290tX3 = (InterfaceC49290tX3) this.f115337i;
                    if (!this.f115338j) {
                        return Unit.INSTANCE;
                    }
                    C29777a c29777a = new C29777a(interfaceC49290tX3, this.f115339k, this.f115340l, this.f115341m, this.f115342n, this.f115343o, null);
                    this.f115336h = 1;
                    if (C37824aD0.m71786e(c29777a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29771l(InterfaceC48104rX2 interfaceC48104rX2, Function0<Boolean> function0, Function1<? super C43361jX3, Boolean> function1, Function3<? super ZC0, ? super C32120Ce3, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super ZC0, ? super C48275ro6, ? super Continuation<? super Unit>, ? extends Object> function32, InterfaceC51412x61 interfaceC51412x61, EnumC32768Ey3 enumC32768Ey3, boolean z, boolean z2) {
            super(3);
            this.f115309g = interfaceC48104rX2;
            this.f115310h = function0;
            this.f115311i = function1;
            this.f115312j = function3;
            this.f115313k = function32;
            this.f115314l = interfaceC51412x61;
            this.f115315m = enumC32768Ey3;
            this.f115316n = z;
            this.f115317o = z2;
        }

        /* renamed from: c */
        public static final C49634u61 m7415c(InterfaceC48627sP5<C49634u61> interfaceC48627sP5) {
            return interfaceC48627sP5.getValue();
        }

        /* renamed from: b */
        public final InterfaceC41563gV2 m7416b(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(597193710);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(597193710, i, -1, "androidx.compose.foundation.gestures.draggable.<anonymous> (Draggable.kt:220)");
            }
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                mo89635G = LM5.m97025e(null, null, 2, null);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            EX2 ex2 = (EX2) mo89635G;
            InterfaceC48104rX2 interfaceC48104rX2 = this.f115309g;
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(ex2) | interfaceC32720Et0.mo89539n(interfaceC48104rX2);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = new C29772a(ex2, interfaceC48104rX2);
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            Y91.m75536c(interfaceC48104rX2, (Function1) mo89635G2, interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G3 = interfaceC32720Et0.mo89635G();
            if (mo89635G3 == c2012a.m108267a()) {
                mo89635G3 = C35186Ph0.m89918b(Integer.MAX_VALUE, null, null, 6, null);
                interfaceC32720Et0.mo89503z(mo89635G3);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC32846Fh0 interfaceC32846Fh0 = (InterfaceC32846Fh0) mo89635G3;
            InterfaceC48627sP5 m105193n = GM5.m105193n(this.f115310h, interfaceC32720Et0, 0);
            InterfaceC48627sP5 m105193n2 = GM5.m105193n(this.f115311i, interfaceC32720Et0, 0);
            InterfaceC48627sP5 m105193n3 = GM5.m105193n(new C49634u61(this.f115312j, this.f115313k, ex2, this.f115309g), interfaceC32720Et0, 8);
            InterfaceC51412x61 interfaceC51412x61 = this.f115314l;
            Y91.m75533f(interfaceC51412x61, new C29774b(interfaceC32846Fh0, interfaceC51412x61, m105193n3, this.f115315m, null), interfaceC32720Et0, 64);
            InterfaceC41563gV2 m1269d = C52840zW5.m1269d(InterfaceC41563gV2.f82354b0, new Object[]{this.f115315m, Boolean.valueOf(this.f115316n), Boolean.valueOf(this.f115317o)}, new C29776c(this.f115316n, m105193n2, m105193n, this.f115315m, interfaceC32846Fh0, this.f115317o, null));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m1269d;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m7416b(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DraggableKt", m28418f = "Draggable.kt", m28417i = {0, 0, 0, 0, 0}, m28416l = {470}, m28415m = "onDragOrUp-Axegvzg", m28414n = {"onDrag", "motionFromChange", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: w61$m */
    /* loaded from: classes.dex */
    public static final class C29779m extends ContinuationImpl {

        /* renamed from: h */
        public Object f115365h;

        /* renamed from: i */
        public Object f115366i;

        /* renamed from: j */
        public Object f115367j;

        /* renamed from: k */
        public Object f115368k;

        /* renamed from: l */
        public Object f115369l;

        /* renamed from: m */
        public /* synthetic */ Object f115370m;

        /* renamed from: n */
        public int f115371n;

        public C29779m(Continuation<? super C29779m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115370m = obj;
            this.f115371n |= Integer.MIN_VALUE;
            return C50819w61.m7429m(null, null, 0L, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LjX3;", "it", "", C17296a.f69688o, "(LjX3;)Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: w61$n */
    /* loaded from: classes.dex */
    public static final class C29780n extends Lambda implements Function1<C43361jX3, Float> {

        /* renamed from: g */
        public static final C29780n f115372g = new C29780n();

        public C29780n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Float invoke(C43361jX3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(C32120Ce3.m111943p(ZW3.m72991h(it)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LjX3;", "it", "", C17296a.f69688o, "(LjX3;)Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: w61$o */
    /* loaded from: classes.dex */
    public static final class C29781o extends Lambda implements Function1<C43361jX3, Float> {

        /* renamed from: g */
        public static final C29781o f115373g = new C29781o();

        public C29781o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Float invoke(C43361jX3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(C32120Ce3.m111944o(ZW3.m72991h(it)));
        }
    }

    /* renamed from: a */
    public static final InterfaceC51412x61 m7441a(Function1<? super Float, Unit> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        return new WW0(onDelta);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ed A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v17, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r5v21, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0234 -> B:81:0x02a9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x029a -> B:77:0x029f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x02ef -> B:81:0x02a9). Please submit an issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7435g(InterfaceC9204Wu interfaceC9204Wu, InterfaceC48627sP5<? extends Function1<? super C43361jX3, Boolean>> interfaceC48627sP5, InterfaceC48627sP5<? extends Function0<Boolean>> interfaceC48627sP52, C50645vo6 c50645vo6, EnumC32768Ey3 enumC32768Ey3, Continuation<? super Pair<C43361jX3, C32120Ce3>> continuation) {
        C29760a c29760a;
        Object coroutine_suspended;
        int i;
        InterfaceC48627sP5<? extends Function1<? super C43361jX3, Boolean>> interfaceC48627sP53;
        InterfaceC48627sP5<? extends Function0<Boolean>> interfaceC48627sP54;
        C50645vo6 c50645vo62;
        EnumC32768Ey3 enumC32768Ey32;
        C43361jX3 c43361jX3;
        InterfaceC9204Wu interfaceC9204Wu2;
        C50645vo6 c50645vo63;
        EnumC32768Ey3 enumC32768Ey33;
        Ref.LongRef longRef;
        long m30360e;
        XW3 m18177j;
        Ref.LongRef longRef2;
        C29761b c29761b;
        int i2;
        float f;
        InterfaceC9204Wu interfaceC9204Wu3;
        Ref.LongRef longRef3;
        Object obj;
        C29760a c29760a2;
        float f2;
        float f3;
        C43361jX3 c43361jX32;
        int i3;
        C29761b c29761b2;
        InterfaceC9204Wu interfaceC9204Wu4;
        Ref.LongRef longRef4;
        float f4;
        float f5;
        int size;
        int i4;
        C29761b c29761b3;
        InterfaceC9204Wu interfaceC9204Wu5;
        C29761b c29761b4;
        int i5;
        C43361jX3 c43361jX33;
        float m111946m;
        long m111940s;
        C43361jX3 c43361jX34;
        Object m77725U;
        InterfaceC9204Wu interfaceC9204Wu6 = interfaceC9204Wu;
        if (continuation instanceof C29760a) {
            c29760a = (C29760a) continuation;
            int i6 = c29760a.f115283s;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c29760a.f115283s = i6 - Integer.MIN_VALUE;
                Object obj2 = c29760a.f115282r;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29760a.f115283s;
                int i7 = 1;
                EnumC38007aX3 enumC38007aX3 = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    EnumC38007aX3 enumC38007aX32 = EnumC38007aX3.Initial;
                    c29760a.f115272h = interfaceC9204Wu6;
                    interfaceC48627sP53 = interfaceC48627sP5;
                    c29760a.f115273i = interfaceC48627sP53;
                    interfaceC48627sP54 = interfaceC48627sP52;
                    c29760a.f115274j = interfaceC48627sP54;
                    c50645vo62 = c50645vo6;
                    c29760a.f115275k = c50645vo62;
                    enumC32768Ey32 = enumC32768Ey3;
                    c29760a.f115276l = enumC32768Ey32;
                    c29760a.f115283s = 1;
                    obj2 = KY5.m98774d(interfaceC9204Wu6, false, enumC38007aX32, c29760a);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    interfaceC48627sP54 = (InterfaceC48627sP5) c29760a.f115274j;
                    InterfaceC48627sP5<? extends Function1<? super C43361jX3, Boolean>> interfaceC48627sP55 = (InterfaceC48627sP5) c29760a.f115273i;
                    InterfaceC9204Wu interfaceC9204Wu7 = (InterfaceC9204Wu) c29760a.f115272h;
                    ResultKt.throwOnFailure(obj2);
                    enumC32768Ey32 = (EnumC32768Ey3) c29760a.f115276l;
                    interfaceC9204Wu6 = interfaceC9204Wu7;
                    c50645vo62 = (C50645vo6) c29760a.f115275k;
                    interfaceC48627sP53 = interfaceC48627sP55;
                } else if (i == 2) {
                    enumC32768Ey33 = (EnumC32768Ey3) c29760a.f115274j;
                    c50645vo63 = (C50645vo6) c29760a.f115273i;
                    interfaceC9204Wu2 = (InterfaceC9204Wu) c29760a.f115272h;
                    ResultKt.throwOnFailure(obj2);
                    C43361jX3 c43361jX35 = (C43361jX3) obj2;
                    C51238wo6.m6306c(c50645vo63, c43361jX35);
                    longRef = new Ref.LongRef();
                    longRef.element = C32120Ce3.f4427b.m111932c();
                    C29761b c29761b5 = new C29761b(c50645vo63, longRef);
                    m30360e = c43361jX35.m30360e();
                    int m30353l = c43361jX35.m30353l();
                    m18177j = C47263q61.m18177j(enumC32768Ey33);
                    if (C47263q61.m18186a(interfaceC9204Wu2.mo3414M0(), m30360e)) {
                        float m18178i = C47263q61.m18178i(interfaceC9204Wu2.mo3400s(), m30353l);
                        Ref.LongRef longRef5 = new Ref.LongRef();
                        longRef5.element = m30360e;
                        longRef2 = longRef;
                        c29761b = c29761b5;
                        i2 = 1;
                        f = 0.0f;
                        interfaceC9204Wu3 = interfaceC9204Wu2;
                        longRef3 = longRef5;
                        obj = coroutine_suspended;
                        c29760a2 = c29760a;
                        f2 = m18178i;
                        f3 = 0.0f;
                        c29760a2.f115272h = longRef2;
                        c29760a2.f115273i = c29761b;
                        c29760a2.f115274j = interfaceC9204Wu3;
                        c29760a2.f115275k = m18177j;
                        c29760a2.f115276l = longRef3;
                        c29760a2.f115277m = enumC38007aX3;
                        c29760a2.f115278n = i2;
                        c29760a2.f115279o = f2;
                        c29760a2.f115280p = f;
                        c29760a2.f115281q = f3;
                        c29760a2.f115283s = 3;
                        m77725U = InterfaceC9204Wu.m77725U(interfaceC9204Wu3, enumC38007aX3, c29760a2, i7, enumC38007aX3);
                        if (m77725U != obj) {
                        }
                    } else {
                        c43361jX32 = null;
                        if (c43361jX32 == null) {
                        }
                    }
                } else if (i == 3) {
                    float f6 = c29760a.f115281q;
                    float f7 = c29760a.f115280p;
                    f4 = c29760a.f115279o;
                    int i8 = c29760a.f115278n;
                    longRef4 = (Ref.LongRef) c29760a.f115276l;
                    interfaceC9204Wu4 = (InterfaceC9204Wu) c29760a.f115274j;
                    ResultKt.throwOnFailure(obj2);
                    i3 = i8;
                    f = f7;
                    obj = coroutine_suspended;
                    c29760a2 = c29760a;
                    f5 = f6;
                    m18177j = (XW3) c29760a.f115275k;
                    longRef2 = (Ref.LongRef) c29760a.f115272h;
                    c29761b2 = (Function2) c29760a.f115273i;
                    YW3 yw3 = (YW3) obj2;
                    List<C43361jX3> m74945c = yw3.m74945c();
                    size = m74945c.size();
                    i4 = 0;
                    c29761b3 = c29761b2;
                    while (true) {
                        if (i4 < size) {
                        }
                        i4++;
                        i3 = i5;
                        c29761b3 = c29761b4;
                        interfaceC9204Wu4 = interfaceC9204Wu5;
                    }
                    c43361jX32 = c43361jX33;
                    if (c43361jX32 != null) {
                        if (!ZW3.m72995d(c43361jX32)) {
                        }
                        i7 = 1;
                        enumC38007aX3 = null;
                        c29760a2.f115272h = longRef2;
                        c29760a2.f115273i = c29761b;
                        c29760a2.f115274j = interfaceC9204Wu3;
                        c29760a2.f115275k = m18177j;
                        c29760a2.f115276l = longRef3;
                        c29760a2.f115277m = enumC38007aX3;
                        c29760a2.f115278n = i2;
                        c29760a2.f115279o = f2;
                        c29760a2.f115280p = f;
                        c29760a2.f115281q = f3;
                        c29760a2.f115283s = 3;
                        m77725U = InterfaceC9204Wu.m77725U(interfaceC9204Wu3, enumC38007aX3, c29760a2, i7, enumC38007aX3);
                        if (m77725U != obj) {
                        }
                    }
                    longRef = longRef2;
                    c43361jX32 = null;
                    if (c43361jX32 == null) {
                    }
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    float f8 = c29760a.f115281q;
                    float f9 = c29760a.f115280p;
                    float f10 = c29760a.f115279o;
                    int i9 = c29760a.f115278n;
                    c43361jX32 = (C43361jX3) c29760a.f115277m;
                    ResultKt.throwOnFailure(obj2);
                    f3 = f8;
                    int i10 = i9;
                    m18177j = (XW3) c29760a.f115275k;
                    c29761b = (Function2) c29760a.f115273i;
                    longRef3 = (Ref.LongRef) c29760a.f115276l;
                    c29760a2 = c29760a;
                    f2 = f10;
                    interfaceC9204Wu3 = (InterfaceC9204Wu) c29760a.f115274j;
                    longRef2 = (Ref.LongRef) c29760a.f115272h;
                    f = f9;
                    obj = coroutine_suspended;
                    if (!c43361jX32.m30351n()) {
                        i2 = i10;
                        i7 = 1;
                        enumC38007aX3 = null;
                        c29760a2.f115272h = longRef2;
                        c29760a2.f115273i = c29761b;
                        c29760a2.f115274j = interfaceC9204Wu3;
                        c29760a2.f115275k = m18177j;
                        c29760a2.f115276l = longRef3;
                        c29760a2.f115277m = enumC38007aX3;
                        c29760a2.f115278n = i2;
                        c29760a2.f115279o = f2;
                        c29760a2.f115280p = f;
                        c29760a2.f115281q = f3;
                        c29760a2.f115283s = 3;
                        m77725U = InterfaceC9204Wu.m77725U(interfaceC9204Wu3, enumC38007aX3, c29760a2, i7, enumC38007aX3);
                        if (m77725U != obj) {
                            return obj;
                        }
                        float f11 = f2;
                        f5 = f3;
                        obj2 = m77725U;
                        i3 = i2;
                        c29761b2 = c29761b;
                        interfaceC9204Wu4 = interfaceC9204Wu3;
                        longRef4 = longRef3;
                        f4 = f11;
                        YW3 yw32 = (YW3) obj2;
                        List<C43361jX3> m74945c2 = yw32.m74945c();
                        size = m74945c2.size();
                        i4 = 0;
                        c29761b3 = c29761b2;
                        while (true) {
                            if (i4 < size) {
                                interfaceC9204Wu5 = interfaceC9204Wu4;
                                c29761b4 = c29761b3;
                                i5 = i3;
                                c43361jX33 = null;
                                break;
                            }
                            c43361jX33 = m74945c2.get(i4);
                            i5 = i3;
                            interfaceC9204Wu5 = interfaceC9204Wu4;
                            c29761b4 = c29761b3;
                            if (C42768iX3.m33834d(c43361jX33.m30360e(), longRef4.element)) {
                                break;
                            }
                            i4++;
                            i3 = i5;
                            c29761b3 = c29761b4;
                            interfaceC9204Wu4 = interfaceC9204Wu5;
                        }
                        c43361jX32 = c43361jX33;
                        if (c43361jX32 != null && !c43361jX32.m30351n()) {
                            if (!ZW3.m72995d(c43361jX32)) {
                                List<C43361jX3> m74945c3 = yw32.m74945c();
                                int size2 = m74945c3.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= size2) {
                                        c43361jX34 = null;
                                        break;
                                    }
                                    c43361jX34 = m74945c3.get(i11);
                                    if (c43361jX34.m30358g()) {
                                        break;
                                    }
                                    i11++;
                                }
                                C43361jX3 c43361jX36 = c43361jX34;
                                if (c43361jX36 != null) {
                                    longRef4.element = c43361jX36.m30360e();
                                    i2 = i5;
                                    c29761b = c29761b4;
                                    f3 = f5;
                                    f2 = f4;
                                    longRef3 = longRef4;
                                    interfaceC9204Wu3 = interfaceC9204Wu5;
                                }
                            } else {
                                long m30359f = c43361jX32.m30359f();
                                long m30356i = c43361jX32.m30356i();
                                float mo18176a = (m18177j.mo18176a(m30359f) - m18177j.mo18176a(m30356i)) + f;
                                float mo18174c = f5 + (m18177j.mo18174c(m30359f) - m18177j.mo18174c(m30356i));
                                if (i5 != 0) {
                                    m111946m = Math.abs(mo18176a);
                                } else {
                                    m111946m = C32120Ce3.m111946m(m18177j.mo18175b(mo18176a, mo18174c));
                                }
                                if (m111946m < f4) {
                                    EnumC38007aX3 enumC38007aX33 = EnumC38007aX3.Final;
                                    c29760a2.f115272h = longRef2;
                                    c29761b = c29761b4;
                                    c29760a2.f115273i = c29761b;
                                    InterfaceC9204Wu interfaceC9204Wu8 = interfaceC9204Wu5;
                                    c29760a2.f115274j = interfaceC9204Wu8;
                                    c29760a2.f115275k = m18177j;
                                    c29760a2.f115276l = longRef4;
                                    c29760a2.f115277m = c43361jX32;
                                    i10 = i5;
                                    c29760a2.f115278n = i10;
                                    c29760a2.f115279o = f4;
                                    c29760a2.f115280p = mo18176a;
                                    c29760a2.f115281q = mo18174c;
                                    c29760a2.f115283s = 4;
                                    if (interfaceC9204Wu8.mo3401r0(enumC38007aX33, c29760a2) == obj) {
                                        return obj;
                                    }
                                    f = mo18176a;
                                    f3 = mo18174c;
                                    f2 = f4;
                                    longRef3 = longRef4;
                                    interfaceC9204Wu3 = interfaceC9204Wu8;
                                    if (!c43361jX32.m30351n()) {
                                    }
                                } else {
                                    int i12 = i5;
                                    c29761b = c29761b4;
                                    InterfaceC9204Wu interfaceC9204Wu9 = interfaceC9204Wu5;
                                    if (i12 != 0) {
                                        m111940s = m18177j.mo18175b(mo18176a - (Math.signum(mo18176a) * f4), mo18174c);
                                    } else {
                                        long mo18175b = m18177j.mo18175b(mo18176a, mo18174c);
                                        m111940s = C32120Ce3.m111940s(mo18175b, C32120Ce3.m111938u(C32120Ce3.m111949j(mo18175b, m111946m), f4));
                                    }
                                    c29761b.invoke(c43361jX32, C32120Ce3.m111955d(m111940s));
                                    if (c43361jX32.m30351n()) {
                                        longRef = longRef2;
                                        if (c43361jX32 == null) {
                                            return TuplesKt.m28425to(c43361jX32, C32120Ce3.m111955d(longRef.element));
                                        }
                                        return null;
                                    }
                                    f2 = f4;
                                    longRef3 = longRef4;
                                    interfaceC9204Wu3 = interfaceC9204Wu9;
                                    i2 = i12;
                                    f3 = 0.0f;
                                    f = 0.0f;
                                }
                            }
                            i7 = 1;
                            enumC38007aX3 = null;
                            c29760a2.f115272h = longRef2;
                            c29760a2.f115273i = c29761b;
                            c29760a2.f115274j = interfaceC9204Wu3;
                            c29760a2.f115275k = m18177j;
                            c29760a2.f115276l = longRef3;
                            c29760a2.f115277m = enumC38007aX3;
                            c29760a2.f115278n = i2;
                            c29760a2.f115279o = f2;
                            c29760a2.f115280p = f;
                            c29760a2.f115281q = f3;
                            c29760a2.f115283s = 3;
                            m77725U = InterfaceC9204Wu.m77725U(interfaceC9204Wu3, enumC38007aX3, c29760a2, i7, enumC38007aX3);
                            if (m77725U != obj) {
                            }
                        }
                    }
                    longRef = longRef2;
                    c43361jX32 = null;
                    if (c43361jX32 == null) {
                    }
                }
                c43361jX3 = (C43361jX3) obj2;
                if (interfaceC48627sP53.getValue().invoke(c43361jX3).booleanValue()) {
                    return null;
                }
                if (interfaceC48627sP54.getValue().invoke().booleanValue()) {
                    c43361jX3.m30364a();
                    C51238wo6.m6306c(c50645vo62, c43361jX3);
                    return TuplesKt.m28425to(c43361jX3, C32120Ce3.m111955d(C32120Ce3.f4427b.m111932c()));
                }
                c29760a.f115272h = interfaceC9204Wu6;
                c29760a.f115273i = c50645vo62;
                c29760a.f115274j = enumC32768Ey32;
                c29760a.f115275k = null;
                c29760a.f115276l = null;
                c29760a.f115283s = 2;
                obj2 = KY5.m98773e(interfaceC9204Wu6, false, null, c29760a, 2, null);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC9204Wu2 = interfaceC9204Wu6;
                c50645vo63 = c50645vo62;
                enumC32768Ey33 = enumC32768Ey32;
                C43361jX3 c43361jX352 = (C43361jX3) obj2;
                C51238wo6.m6306c(c50645vo63, c43361jX352);
                longRef = new Ref.LongRef();
                longRef.element = C32120Ce3.f4427b.m111932c();
                C29761b c29761b52 = new C29761b(c50645vo63, longRef);
                m30360e = c43361jX352.m30360e();
                int m30353l2 = c43361jX352.m30353l();
                m18177j = C47263q61.m18177j(enumC32768Ey33);
                if (C47263q61.m18186a(interfaceC9204Wu2.mo3414M0(), m30360e)) {
                }
            }
        }
        c29760a = new C29760a(continuation);
        Object obj22 = c29760a.f115282r;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c29760a.f115283s;
        int i72 = 1;
        EnumC38007aX3 enumC38007aX34 = null;
        if (i != 0) {
        }
        c43361jX3 = (C43361jX3) obj22;
        if (interfaceC48627sP53.getValue().invoke(c43361jX3).booleanValue()) {
        }
    }

    /* renamed from: h */
    public static final Object m7434h(InterfaceC9204Wu interfaceC9204Wu, C43361jX3 c43361jX3, long j, C50645vo6 c50645vo6, InterfaceC52463ys5<? super AbstractC46670p61> interfaceC52463ys5, boolean z, EnumC32768Ey3 enumC32768Ey3, Continuation<? super Boolean> continuation) {
        long j2;
        interfaceC52463ys5.mo2349h(new AbstractC46670p61.C27143c(C32120Ce3.m111940s(c43361jX3.m30359f(), C33056Ge3.m104938a(C32120Ce3.m111944o(j) * Math.signum(C32120Ce3.m111944o(c43361jX3.m30359f())), C32120Ce3.m111943p(j) * Math.signum(C32120Ce3.m111943p(c43361jX3.m30359f())))), null));
        if (z) {
            j2 = C32120Ce3.m111938u(j, -1.0f);
        } else {
            j2 = j;
        }
        interfaceC52463ys5.mo2349h(new AbstractC46670p61.C27142b(j2, null));
        return m7429m(interfaceC9204Wu, enumC32768Ey3, c43361jX3.m30360e(), new C29762c(c50645vo6, interfaceC52463ys5, z), continuation);
    }

    /* renamed from: i */
    public static final InterfaceC41563gV2 m7433i(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC51412x61 state, EnumC32768Ey3 orientation, boolean z, InterfaceC48104rX2 interfaceC48104rX2, boolean z2, Function3<? super ZC0, ? super C32120Ce3, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, Function3<? super ZC0, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z3) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return m7432j(interfaceC41563gV2, state, C29766g.f115300g, orientation, z, interfaceC48104rX2, new C29767h(z2), onDragStarted, new C29768i(onDragStopped, orientation, null), z3);
    }

    /* renamed from: j */
    public static final InterfaceC41563gV2 m7432j(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC51412x61 state, Function1<? super C43361jX3, Boolean> canDrag, EnumC32768Ey3 orientation, boolean z, InterfaceC48104rX2 interfaceC48104rX2, Function0<Boolean> startDragImmediately, Function3<? super ZC0, ? super C32120Ce3, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, Function3<? super ZC0, ? super C48275ro6, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z2) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(startDragImmediately, "startDragImmediately");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        if (K32.m99301c()) {
            m99303a = new C29763d(canDrag, orientation, z, z2, interfaceC48104rX2, startDragImmediately, onDragStarted, onDragStopped, state);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, new C29771l(interfaceC48104rX2, startDragImmediately, canDrag, onDragStarted, onDragStopped, state, orientation, z, z2));
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC41563gV2 m7431k(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC51412x61 interfaceC51412x61, EnumC32768Ey3 enumC32768Ey3, boolean z, InterfaceC48104rX2 interfaceC48104rX2, boolean z2, Function3 function3, Function3 function32, boolean z3, int i, Object obj) {
        boolean z4;
        InterfaceC48104rX2 interfaceC48104rX22;
        boolean z5;
        C29764e c29764e;
        C29765f c29765f;
        boolean z6;
        if ((i & 4) != 0) {
            z4 = true;
        } else {
            z4 = z;
        }
        if ((i & 8) != 0) {
            interfaceC48104rX22 = null;
        } else {
            interfaceC48104rX22 = interfaceC48104rX2;
        }
        if ((i & 16) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & 32) != 0) {
            c29764e = new C29764e(null);
        } else {
            c29764e = function3;
        }
        if ((i & 64) != 0) {
            c29765f = new C29765f(null);
        } else {
            c29765f = function32;
        }
        if ((i & 128) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        return m7433i(interfaceC41563gV2, interfaceC51412x61, enumC32768Ey3, z4, interfaceC48104rX22, z5, c29764e, c29765f, z6);
    }

    /* renamed from: l */
    public static /* synthetic */ InterfaceC41563gV2 m7430l(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC51412x61 interfaceC51412x61, Function1 function1, EnumC32768Ey3 enumC32768Ey3, boolean z, InterfaceC48104rX2 interfaceC48104rX2, Function0 function0, Function3 function3, Function3 function32, boolean z2, int i, Object obj) {
        boolean z3;
        InterfaceC48104rX2 interfaceC48104rX22;
        C29769j c29769j;
        C29770k c29770k;
        boolean z4;
        if ((i & 8) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i & 16) != 0) {
            interfaceC48104rX22 = null;
        } else {
            interfaceC48104rX22 = interfaceC48104rX2;
        }
        if ((i & 64) != 0) {
            c29769j = new C29769j(null);
        } else {
            c29769j = function3;
        }
        if ((i & 128) != 0) {
            c29770k = new C29770k(null);
        } else {
            c29770k = function32;
        }
        if ((i & 256) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        return m7432j(interfaceC41563gV2, interfaceC51412x61, function1, enumC32768Ey3, z3, interfaceC48104rX22, function0, c29769j, c29770k, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
        if ((!r0) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0095 -> B:27:0x009a). Please submit an issue!!! */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7429m(InterfaceC9204Wu interfaceC9204Wu, EnumC32768Ey3 enumC32768Ey3, long j, Function1<? super C43361jX3, Unit> function1, Continuation<? super Boolean> continuation) {
        C29779m c29779m;
        Object coroutine_suspended;
        int i;
        Function1 function12;
        long j2;
        C29779m c29779m2;
        Object obj;
        Function1<? super C43361jX3, Unit> function13;
        Function1 function14;
        InterfaceC9204Wu interfaceC9204Wu2;
        boolean z;
        C43361jX3 c43361jX3;
        Ref.LongRef longRef;
        Function1 function15;
        InterfaceC9204Wu interfaceC9204Wu3;
        Object m77725U;
        Unit unit;
        InterfaceC9204Wu interfaceC9204Wu4;
        C43361jX3 c43361jX32;
        boolean z2;
        int i2;
        C43361jX3 c43361jX33;
        if (continuation instanceof C29779m) {
            c29779m = (C29779m) continuation;
            int i3 = c29779m.f115371n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c29779m.f115371n = i3 - Integer.MIN_VALUE;
                Object obj2 = c29779m.f115370m;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29779m.f115371n;
                int i4 = 1;
                EnumC38007aX3 enumC38007aX3 = null;
                if (i == 0) {
                    if (i == 1) {
                        Ref.LongRef longRef2 = (Ref.LongRef) c29779m.f115369l;
                        interfaceC9204Wu3 = (InterfaceC9204Wu) c29779m.f115368k;
                        InterfaceC9204Wu interfaceC9204Wu5 = (InterfaceC9204Wu) c29779m.f115367j;
                        function15 = (Function1) c29779m.f115366i;
                        ResultKt.throwOnFailure(obj2);
                        c29779m2 = c29779m;
                        function13 = (Function1) c29779m.f115365h;
                        longRef = longRef2;
                        YW3 yw3 = (YW3) obj2;
                        List<C43361jX3> m74945c = yw3.m74945c();
                        int size = m74945c.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size) {
                                c43361jX32 = m74945c.get(i5);
                                interfaceC9204Wu4 = interfaceC9204Wu3;
                                if (C42768iX3.m33834d(c43361jX32.m30360e(), longRef.element)) {
                                    break;
                                }
                                i5++;
                                interfaceC9204Wu3 = interfaceC9204Wu4;
                            } else {
                                interfaceC9204Wu4 = interfaceC9204Wu3;
                                c43361jX32 = null;
                                break;
                            }
                        }
                        c43361jX3 = c43361jX32;
                        if (c43361jX3 == null) {
                            if (ZW3.m72995d(c43361jX3)) {
                                List<C43361jX3> m74945c2 = yw3.m74945c();
                                int size2 = m74945c2.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 < size2) {
                                        c43361jX33 = m74945c2.get(i6);
                                        if (c43361jX33.m30358g()) {
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        c43361jX33 = null;
                                        break;
                                    }
                                }
                                C43361jX3 c43361jX34 = c43361jX33;
                                if (c43361jX34 == null) {
                                    z = true;
                                } else {
                                    longRef.element = c43361jX34.m30360e();
                                    i2 = 1;
                                    interfaceC9204Wu3 = interfaceC9204Wu4;
                                    i4 = i2;
                                    interfaceC9204Wu2 = interfaceC9204Wu5;
                                    enumC38007aX3 = null;
                                    c29779m2.f115365h = function13;
                                    c29779m2.f115366i = function15;
                                    c29779m2.f115367j = interfaceC9204Wu2;
                                    c29779m2.f115368k = interfaceC9204Wu3;
                                    c29779m2.f115369l = longRef;
                                    c29779m2.f115371n = i4;
                                    m77725U = InterfaceC9204Wu.m77725U(interfaceC9204Wu3, enumC38007aX3, c29779m2, i4, enumC38007aX3);
                                    if (m77725U == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    interfaceC9204Wu5 = interfaceC9204Wu2;
                                    obj2 = m77725U;
                                }
                            } else {
                                if (((Number) function15.invoke(c43361jX3)).floatValue() == 0.0f) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                z = true;
                                i2 = 1;
                            }
                            YW3 yw32 = (YW3) obj2;
                            List<C43361jX3> m74945c3 = yw32.m74945c();
                            int size3 = m74945c3.size();
                            int i52 = 0;
                            while (true) {
                                if (i52 >= size3) {
                                }
                                i52++;
                                interfaceC9204Wu3 = interfaceC9204Wu4;
                            }
                            c43361jX3 = c43361jX32;
                            if (c43361jX3 == null) {
                                z = true;
                                c43361jX3 = null;
                            }
                        }
                        if (c43361jX3 == null || c43361jX3.m30351n()) {
                            c43361jX3 = null;
                        } else if (!ZW3.m72995d(c43361jX3)) {
                            function13.invoke(c43361jX3);
                            interfaceC9204Wu2 = interfaceC9204Wu5;
                            j2 = c43361jX3.m30360e();
                            enumC38007aX3 = null;
                            i4 = z ? 1 : 0;
                            Function1 function16 = function15;
                            obj = coroutine_suspended;
                            function14 = function16;
                            longRef = new Ref.LongRef();
                            longRef.element = j2;
                            interfaceC9204Wu3 = interfaceC9204Wu2;
                            Object obj3 = obj;
                            function15 = function14;
                            coroutine_suspended = obj3;
                            c29779m2.f115365h = function13;
                            c29779m2.f115366i = function15;
                            c29779m2.f115367j = interfaceC9204Wu2;
                            c29779m2.f115368k = interfaceC9204Wu3;
                            c29779m2.f115369l = longRef;
                            c29779m2.f115371n = i4;
                            m77725U = InterfaceC9204Wu.m77725U(interfaceC9204Wu3, enumC38007aX3, c29779m2, i4, enumC38007aX3);
                            if (m77725U == coroutine_suspended) {
                            }
                        }
                        if (c43361jX3 == null) {
                            function13.invoke(c43361jX3);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            z = false;
                        }
                        return Boxing.boxBoolean(z);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
                if (enumC32768Ey3 == EnumC32768Ey3.Vertical) {
                    function12 = C29780n.f115372g;
                } else {
                    function12 = C29781o.f115373g;
                }
                j2 = j;
                if (C47263q61.m18186a(interfaceC9204Wu.mo3414M0(), j2)) {
                    function13 = function1;
                    z = true;
                    c43361jX3 = null;
                    if (c43361jX3 == null) {
                    }
                    if (unit == null) {
                    }
                    return Boxing.boxBoolean(z);
                }
                c29779m2 = c29779m;
                obj = coroutine_suspended;
                function13 = function1;
                function14 = function12;
                interfaceC9204Wu2 = interfaceC9204Wu;
                longRef = new Ref.LongRef();
                longRef.element = j2;
                interfaceC9204Wu3 = interfaceC9204Wu2;
                Object obj32 = obj;
                function15 = function14;
                coroutine_suspended = obj32;
                c29779m2.f115365h = function13;
                c29779m2.f115366i = function15;
                c29779m2.f115367j = interfaceC9204Wu2;
                c29779m2.f115368k = interfaceC9204Wu3;
                c29779m2.f115369l = longRef;
                c29779m2.f115371n = i4;
                m77725U = InterfaceC9204Wu.m77725U(interfaceC9204Wu3, enumC38007aX3, c29779m2, i4, enumC38007aX3);
                if (m77725U == coroutine_suspended) {
                }
            }
        }
        c29779m = new C29779m(continuation);
        Object obj22 = c29779m.f115370m;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c29779m.f115371n;
        int i42 = 1;
        EnumC38007aX3 enumC38007aX32 = null;
        if (i == 0) {
        }
    }

    /* renamed from: n */
    public static final float m7428n(long j, EnumC32768Ey3 enumC32768Ey3) {
        return enumC32768Ey3 == EnumC32768Ey3.Vertical ? C32120Ce3.m111943p(j) : C32120Ce3.m111944o(j);
    }

    /* renamed from: o */
    public static final float m7427o(long j, EnumC32768Ey3 enumC32768Ey3) {
        return enumC32768Ey3 == EnumC32768Ey3.Vertical ? C48275ro6.m15356i(j) : C48275ro6.m15357h(j);
    }
}
