package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010k\u001a\u00020j\u0012\u0006\u00102\u001a\u00020/¢\u0006\u0004\bl\u0010mJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J \u0010\f\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J \u0010\u000e\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\r\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J \u0010\u0010\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u001d\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001cJ%\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001cJ%\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ9\u0010$\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%JE\u0010,\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0)\u0012\u0006\u0012\u0004\u0018\u00010*0(H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\n\u0010.\u001a\u00020\u0011*\u00020\u0004R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R!\u00105\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00106R\u0014\u00108\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00106R\u0014\u0010:\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u0014\u0010<\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00106R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00106R\u0014\u0010D\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00106R\u0014\u0010F\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00106R\u0014\u0010H\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u00106R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00110I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR(\u0010U\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bM\u0010N\u0012\u0004\bS\u0010T\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0016\u0010W\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010NR\u001f\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bY\u0010ZR#\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u00110\"8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b]\u0010^R!\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010h\u001a\u00020d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\b3\u0010gR\u0014\u0010i\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010P\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006n"}, m28432d2 = {"LEc;", "LDA3;", "", "F", "LI61;", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "v", "top", "y", "right", "x", "bottom", "u", "", "z", "t", "LCe3;", "delta", "E", "(J)Z", "scroll", "displacement", "", "D", "(JJ)F", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LH43;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lkotlin/Function1;", "performScroll", "c", "(JILkotlin/jvm/functions/Function1;)J", "Lro6;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "performFling", DateTokenConverter.CONVERTER_KEY, "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w", "LBA3;", C17296a.f69688o, "LBA3;", "overscrollConfig", "b", "LCe3;", "pointerPosition", "Landroid/widget/EdgeEffect;", "topEffect", "bottomEffect", "e", "leftEffect", "f", "rightEffect", "", "g", "Ljava/util/List;", "allEffects", "h", "topEffectNegation", "i", "bottomEffectNegation", "j", "leftEffectNegation", "k", "rightEffectNegation", "LEX2;", "l", "LEX2;", "redrawSignal", "m", "Z", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "()V", "invalidationEnabled", "n", "scrollCycleInProgress", "LxB5;", "o", "J", "containerSize", "LG52;", "p", "Lkotlin/jvm/functions/Function1;", "onNewSize", "LiX3;", "q", "LiX3;", "pointerId", "LgV2;", "r", "LgV2;", "()LgV2;", "effectModifier", "isInProgress", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;LBA3;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,589:1\n33#2,6:590\n101#2,2:597\n33#2,6:599\n103#2:605\n33#2,6:607\n135#3:596\n245#4:606\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n123#1:590,6\n266#1:597,2\n266#1:599,6\n266#1:605\n445#1:607,6\n341#1:596\n351#1:606\n*E\n"})
/* renamed from: Ec */
/* loaded from: classes.dex */
public final class C1906Ec implements DA3 {

    /* renamed from: a */
    public final BA3 f7815a;

    /* renamed from: b */
    public C32120Ce3 f7816b;

    /* renamed from: c */
    public final EdgeEffect f7817c;

    /* renamed from: d */
    public final EdgeEffect f7818d;

    /* renamed from: e */
    public final EdgeEffect f7819e;

    /* renamed from: f */
    public final EdgeEffect f7820f;

    /* renamed from: g */
    public final List<EdgeEffect> f7821g;

    /* renamed from: h */
    public final EdgeEffect f7822h;

    /* renamed from: i */
    public final EdgeEffect f7823i;

    /* renamed from: j */
    public final EdgeEffect f7824j;

    /* renamed from: k */
    public final EdgeEffect f7825k;

    /* renamed from: l */
    public final EX2<Unit> f7826l;

    /* renamed from: m */
    public boolean f7827m;

    /* renamed from: n */
    public boolean f7828n;

    /* renamed from: o */
    public long f7829o;

    /* renamed from: p */
    public final Function1<G52, Unit> f7830p;

    /* renamed from: q */
    public C42768iX3 f7831q;

    /* renamed from: r */
    public final InterfaceC41563gV2 f7832r;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", m28418f = "AndroidOverscroll.kt", m28417i = {1, 1}, m28416l = {219, 244}, m28415m = "applyToFling-BMRW4eQ", m28414n = {"this", "remainingVelocity"}, m28413s = {"L$0", "J$0"})
    /* renamed from: Ec$a */
    /* loaded from: classes.dex */
    public static final class C1907a extends ContinuationImpl {

        /* renamed from: h */
        public Object f7833h;

        /* renamed from: i */
        public long f7834i;

        /* renamed from: j */
        public /* synthetic */ Object f7835j;

        /* renamed from: l */
        public int f7837l;

        public C1907a(Continuation<? super C1907a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7835j = obj;
            this.f7837l |= Integer.MIN_VALUE;
            return C1906Ec.this.mo7358d(0L, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LtX3;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", m28418f = "AndroidOverscroll.kt", m28417i = {}, m28416l = {316}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Ec$b */
    /* loaded from: classes.dex */
    public static final class C1908b extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f7838h;

        /* renamed from: i */
        public /* synthetic */ Object f7839i;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWu;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", m28418f = "AndroidOverscroll.kt", m28417i = {0, 1}, m28416l = {317, 321}, m28415m = "invokeSuspend", m28414n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, m28413s = {"L$0", "L$0"})
        @SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$effectModifier$1$1\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,589:1\n36#2,3:590\n39#2,2:597\n41#2:600\n33#3,4:593\n38#3:599\n116#3,2:601\n33#3,6:603\n118#3:609\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$effectModifier$1$1\n*L\n321#1:590,3\n321#1:597,2\n321#1:600\n321#1:593,4\n321#1:599\n325#1:601,2\n325#1:603,6\n325#1:609\n*E\n"})
        /* renamed from: Ec$b$a */
        /* loaded from: classes.dex */
        public static final class C1909a extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f7841h;

            /* renamed from: i */
            public /* synthetic */ Object f7842i;

            /* renamed from: j */
            public final /* synthetic */ C1906Ec f7843j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1909a(C1906Ec c1906Ec, Continuation<? super C1909a> continuation) {
                super(2, continuation);
                this.f7843j = c1906Ec;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C1909a c1909a = new C1909a(this.f7843j, continuation);
                c1909a.f7842i = obj;
                return c1909a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: e */
            public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
                return ((C1909a) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00bb A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006b -> B:18:0x0070). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                InterfaceC9204Wu interfaceC9204Wu;
                C1909a c1909a;
                Object m77725U;
                Object obj2;
                Object firstOrNull;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7841h;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            InterfaceC9204Wu interfaceC9204Wu2 = (InterfaceC9204Wu) this.f7842i;
                            Object obj3 = coroutine_suspended;
                            C1909a c1909a2 = this;
                            List<C43361jX3> m74945c = ((YW3) obj).m74945c();
                            ArrayList arrayList = new ArrayList(m74945c.size());
                            int size = m74945c.size();
                            int i2 = 0;
                            for (int i3 = 0; i3 < size; i3++) {
                                C43361jX3 c43361jX3 = m74945c.get(i3);
                                if (c43361jX3.m30358g()) {
                                    arrayList.add(c43361jX3);
                                }
                            }
                            C1906Ec c1906Ec = c1909a2.f7843j;
                            int size2 = arrayList.size();
                            while (true) {
                                if (i2 >= size2) {
                                    obj2 = arrayList.get(i2);
                                    if (C42768iX3.m33835c(((C43361jX3) obj2).m30360e(), c1906Ec.f7831q)) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            C43361jX3 c43361jX32 = (C43361jX3) obj2;
                            if (c43361jX32 == null) {
                                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
                                c43361jX32 = (C43361jX3) firstOrNull;
                            }
                            if (c43361jX32 != null) {
                                c1909a2.f7843j.f7831q = C42768iX3.m33837a(c43361jX32.m30360e());
                                c1909a2.f7843j.f7816b = C32120Ce3.m111955d(c43361jX32.m30359f());
                            }
                            if (!arrayList.isEmpty()) {
                                c1909a2.f7843j.f7831q = null;
                                return Unit.INSTANCE;
                            }
                            c1909a = c1909a2;
                            coroutine_suspended = obj3;
                            interfaceC9204Wu = interfaceC9204Wu2;
                            c1909a.f7842i = interfaceC9204Wu;
                            c1909a.f7841h = 2;
                            m77725U = InterfaceC9204Wu.m77725U(interfaceC9204Wu, null, c1909a, 1, null);
                            if (m77725U != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Object obj4 = coroutine_suspended;
                            c1909a2 = c1909a;
                            obj = m77725U;
                            interfaceC9204Wu2 = interfaceC9204Wu;
                            obj3 = obj4;
                            List<C43361jX3> m74945c2 = ((YW3) obj).m74945c();
                            ArrayList arrayList2 = new ArrayList(m74945c2.size());
                            int size3 = m74945c2.size();
                            int i22 = 0;
                            while (i3 < size3) {
                            }
                            C1906Ec c1906Ec2 = c1909a2.f7843j;
                            int size22 = arrayList2.size();
                            while (true) {
                                if (i22 >= size22) {
                                }
                                i22++;
                            }
                            C43361jX3 c43361jX322 = (C43361jX3) obj2;
                            if (c43361jX322 == null) {
                            }
                            if (c43361jX322 != null) {
                            }
                            if (!arrayList2.isEmpty()) {
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        interfaceC9204Wu = (InterfaceC9204Wu) this.f7842i;
                        ResultKt.throwOnFailure(obj);
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    interfaceC9204Wu = (InterfaceC9204Wu) this.f7842i;
                    this.f7842i = interfaceC9204Wu;
                    this.f7841h = 1;
                    obj = KY5.m98773e(interfaceC9204Wu, false, null, this, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                C43361jX3 c43361jX33 = (C43361jX3) obj;
                this.f7843j.f7831q = C42768iX3.m33837a(c43361jX33.m30360e());
                this.f7843j.f7816b = C32120Ce3.m111955d(c43361jX33.m30359f());
                c1909a = this;
                c1909a.f7842i = interfaceC9204Wu;
                c1909a.f7841h = 2;
                m77725U = InterfaceC9204Wu.m77725U(interfaceC9204Wu, null, c1909a, 1, null);
                if (m77725U != coroutine_suspended) {
                }
            }
        }

        public C1908b(Continuation<? super C1908b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1908b c1908b = new C1908b(continuation);
            c1908b.f7839i = obj;
            return c1908b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
            return ((C1908b) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7838h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C1909a c1909a = new C1909a(C1906Ec.this, null);
                this.f7838h = 1;
                if (C34620Mw1.m94550c((InterfaceC49290tX3) this.f7839i, c1909a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LG52;", "size", "", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ec$c */
    /* loaded from: classes.dex */
    public static final class C1910c extends Lambda implements Function1<G52, Unit> {
        public C1910c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(G52 g52) {
            m116221invokeozmzZPI(g52.m105826j());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-ozmzZPI  reason: not valid java name */
        public final void m116221invokeozmzZPI(long j) {
            boolean z = !C51465xB5.m5733f(H52.m104428c(j), C1906Ec.this.f7829o);
            C1906Ec.this.f7829o = H52.m104428c(j);
            if (z) {
                C1906Ec.this.f7817c.setSize(G52.m105829g(j), G52.m105830f(j));
                C1906Ec.this.f7818d.setSize(G52.m105829g(j), G52.m105830f(j));
                C1906Ec.this.f7819e.setSize(G52.m105830f(j), G52.m105829g(j));
                C1906Ec.this.f7820f.setSize(G52.m105830f(j), G52.m105829g(j));
                C1906Ec.this.f7822h.setSize(G52.m105829g(j), G52.m105830f(j));
                C1906Ec.this.f7823i.setSize(G52.m105829g(j), G52.m105830f(j));
                C1906Ec.this.f7824j.setSize(G52.m105830f(j), G52.m105829g(j));
                C1906Ec.this.f7825k.setSize(G52.m105830f(j), G52.m105829g(j));
            }
            if (z) {
                C1906Ec.this.m108662z();
                C1906Ec.this.m108668t();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n1#1,170:1\n342#2,3:171\n*E\n"})
    /* renamed from: Ec$d */
    /* loaded from: classes.dex */
    public static final class C1911d extends Lambda implements Function1<S42, Unit> {
        public C1911d() {
            super(1);
        }

        /* renamed from: a */
        public final void m108660a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("overscroll");
            s42.m86036c(C1906Ec.this);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m108660a(s42);
            return Unit.INSTANCE;
        }
    }

    public C1906Ec(Context context, BA3 overscrollConfig) {
        List<EdgeEffect> listOf;
        InterfaceC41563gV2 interfaceC41563gV2;
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overscrollConfig, "overscrollConfig");
        this.f7815a = overscrollConfig;
        C49664u91 c49664u91 = C49664u91.f111813a;
        EdgeEffect m10782a = c49664u91.m10782a(context, null);
        this.f7817c = m10782a;
        EdgeEffect m10782a2 = c49664u91.m10782a(context, null);
        this.f7818d = m10782a2;
        EdgeEffect m10782a3 = c49664u91.m10782a(context, null);
        this.f7819e = m10782a3;
        EdgeEffect m10782a4 = c49664u91.m10782a(context, null);
        this.f7820f = m10782a4;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EdgeEffect[]{m10782a3, m10782a, m10782a4, m10782a2});
        this.f7821g = listOf;
        this.f7822h = c49664u91.m10782a(context, null);
        this.f7823i = c49664u91.m10782a(context, null);
        this.f7824j = c49664u91.m10782a(context, null);
        this.f7825k = c49664u91.m10782a(context, null);
        int size = listOf.size();
        for (int i = 0; i < size; i++) {
            listOf.get(i).setColor(C50619vm0.m8173h(this.f7815a.m114312b()));
        }
        Unit unit = Unit.INSTANCE;
        this.f7826l = GM5.m105200g(unit, GM5.m105198i());
        this.f7827m = true;
        this.f7829o = C51465xB5.f117175b.m5723b();
        C1910c c1910c = new C1910c();
        this.f7830p = c1910c;
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        interfaceC41563gV2 = C20475fd.f80367a;
        InterfaceC41563gV2 m36095a = C42272hh3.m36095a(C52840zW5.m1270c(c20912a.mo39266t0(interfaceC41563gV2), unit, new C1908b(null)), c1910c);
        if (K32.m99301c()) {
            m99303a = new C1911d();
        } else {
            m99303a = K32.m99303a();
        }
        this.f7832r = m36095a.mo39266t0(new G61(this, m99303a));
    }

    /* renamed from: A */
    public final float m108689A(long j, long j2) {
        float m111944o = C32120Ce3.m111944o(j2) / C51465xB5.m5730i(this.f7829o);
        float m111943p = C32120Ce3.m111943p(j) / C51465xB5.m5732g(this.f7829o);
        C49664u91 c49664u91 = C49664u91.f111813a;
        boolean z = true;
        float m5732g = (-c49664u91.m10779d(this.f7818d, -m111943p, 1 - m111944o)) * C51465xB5.m5732g(this.f7829o);
        if (c49664u91.m10781b(this.f7818d) != 0.0f) {
            z = false;
        }
        if (!z) {
            return C32120Ce3.m111943p(j);
        }
        return m5732g;
    }

    /* renamed from: B */
    public final float m108688B(long j, long j2) {
        float m111943p = C32120Ce3.m111943p(j2) / C51465xB5.m5732g(this.f7829o);
        float m111944o = C32120Ce3.m111944o(j) / C51465xB5.m5730i(this.f7829o);
        C49664u91 c49664u91 = C49664u91.f111813a;
        boolean z = true;
        float m10779d = c49664u91.m10779d(this.f7819e, m111944o, 1 - m111943p) * C51465xB5.m5730i(this.f7829o);
        if (c49664u91.m10781b(this.f7819e) != 0.0f) {
            z = false;
        }
        if (!z) {
            return C32120Ce3.m111944o(j);
        }
        return m10779d;
    }

    /* renamed from: C */
    public final float m108687C(long j, long j2) {
        boolean z;
        float m111943p = C32120Ce3.m111943p(j2) / C51465xB5.m5732g(this.f7829o);
        float m111944o = C32120Ce3.m111944o(j) / C51465xB5.m5730i(this.f7829o);
        C49664u91 c49664u91 = C49664u91.f111813a;
        float m5730i = (-c49664u91.m10779d(this.f7820f, -m111944o, m111943p)) * C51465xB5.m5730i(this.f7829o);
        if (c49664u91.m10781b(this.f7820f) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return C32120Ce3.m111944o(j);
        }
        return m5730i;
    }

    /* renamed from: D */
    public final float m108686D(long j, long j2) {
        boolean z;
        float m111944o = C32120Ce3.m111944o(j2) / C51465xB5.m5730i(this.f7829o);
        float m111943p = C32120Ce3.m111943p(j) / C51465xB5.m5732g(this.f7829o);
        C49664u91 c49664u91 = C49664u91.f111813a;
        float m10779d = c49664u91.m10779d(this.f7817c, m111943p, m111944o) * C51465xB5.m5732g(this.f7829o);
        if (c49664u91.m10781b(this.f7817c) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return C32120Ce3.m111943p(j);
        }
        return m10779d;
    }

    /* renamed from: E */
    public final boolean m108685E(long j) {
        boolean z;
        boolean z2 = false;
        if (!this.f7819e.isFinished() && C32120Ce3.m111944o(j) < 0.0f) {
            C49664u91.f111813a.m10778e(this.f7819e, C32120Ce3.m111944o(j));
            z = this.f7819e.isFinished();
        } else {
            z = false;
        }
        if (!this.f7820f.isFinished() && C32120Ce3.m111944o(j) > 0.0f) {
            C49664u91.f111813a.m10778e(this.f7820f, C32120Ce3.m111944o(j));
            if (!z && !this.f7820f.isFinished()) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!this.f7817c.isFinished() && C32120Ce3.m111943p(j) < 0.0f) {
            C49664u91.f111813a.m10778e(this.f7817c, C32120Ce3.m111943p(j));
            if (!z && !this.f7817c.isFinished()) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!this.f7818d.isFinished() && C32120Ce3.m111943p(j) > 0.0f) {
            C49664u91.f111813a.m10778e(this.f7818d, C32120Ce3.m111943p(j));
            if (z || this.f7818d.isFinished()) {
                z2 = true;
            }
            return z2;
        }
        return z;
    }

    /* renamed from: F */
    public final boolean m108684F() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long m112662b = CB5.m112662b(this.f7829o);
        C49664u91 c49664u91 = C49664u91.f111813a;
        boolean z5 = false;
        if (c49664u91.m10781b(this.f7819e) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m108688B(C32120Ce3.f4427b.m111932c(), m112662b);
            z2 = true;
        } else {
            z2 = false;
        }
        if (c49664u91.m10781b(this.f7820f) == 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            m108687C(C32120Ce3.f4427b.m111932c(), m112662b);
            z2 = true;
        }
        if (c49664u91.m10781b(this.f7817c) == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            m108686D(C32120Ce3.f4427b.m111932c(), m112662b);
            z2 = true;
        }
        if (c49664u91.m10781b(this.f7818d) == 0.0f) {
            z5 = true;
        }
        if (!z5) {
            m108689A(C32120Ce3.f4427b.m111932c(), m112662b);
            return true;
        }
        return z2;
    }

    @Override // p000.DA3
    /* renamed from: a */
    public boolean mo7361a() {
        boolean z;
        List<EdgeEffect> list = this.f7821g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (C49664u91.f111813a.m10781b(list.get(i)) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.DA3
    /* renamed from: b */
    public InterfaceC41563gV2 mo7360b() {
        return this.f7832r;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017a A[ADDED_TO_REGION] */
    @Override // p000.DA3
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo7359c(long j, int i, Function1<? super C32120Ce3, C32120Ce3> performScroll) {
        long m112662b;
        boolean z;
        boolean z2;
        boolean z3;
        float m108689A;
        boolean z4;
        boolean z5;
        boolean z6;
        long m104938a;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        float m108687C;
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(performScroll, "performScroll");
        if (C51465xB5.m5728k(this.f7829o)) {
            return performScroll.invoke(C32120Ce3.m111955d(j)).m111935x();
        }
        boolean z14 = true;
        if (!this.f7828n) {
            m108684F();
            this.f7828n = true;
        }
        C32120Ce3 c32120Ce3 = this.f7816b;
        if (c32120Ce3 != null) {
            m112662b = c32120Ce3.m111935x();
        } else {
            m112662b = CB5.m112662b(this.f7829o);
        }
        float f = 0.0f;
        if (C32120Ce3.m111943p(j) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C49664u91 c49664u91 = C49664u91.f111813a;
            if (c49664u91.m10781b(this.f7817c) == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                m108689A = m108686D(j, m112662b);
                if (c49664u91.m10781b(this.f7817c) == 0.0f) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    this.f7817c.onRelease();
                }
            } else {
                if (c49664u91.m10781b(this.f7818d) == 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    m108689A = m108689A(j, m112662b);
                    if (c49664u91.m10781b(this.f7818d) == 0.0f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        this.f7818d.onRelease();
                    }
                }
            }
            if (C32120Ce3.m111944o(j) != 0.0f) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                C49664u91 c49664u912 = C49664u91.f111813a;
                if (c49664u912.m10781b(this.f7819e) == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    m108687C = m108688B(j, m112662b);
                    if (c49664u912.m10781b(this.f7819e) == 0.0f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        this.f7819e.onRelease();
                    }
                } else {
                    if (c49664u912.m10781b(this.f7820f) == 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        m108687C = m108687C(j, m112662b);
                        if (c49664u912.m10781b(this.f7820f) == 0.0f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            this.f7820f.onRelease();
                        }
                    }
                }
                f = m108687C;
            }
            m104938a = C33056Ge3.m104938a(f, m108689A);
            if (!C32120Ce3.m111947l(m104938a, C32120Ce3.f4427b.m111932c())) {
                m108662z();
            }
            long m111940s = C32120Ce3.m111940s(j, m104938a);
            long m111935x = performScroll.invoke(C32120Ce3.m111955d(m111940s)).m111935x();
            long m111940s2 = C32120Ce3.m111940s(m111940s, m111935x);
            if (H43.m104445d(i, H43.f12808a.m104444a())) {
                if (C32120Ce3.m111944o(m111940s2) > 0.5f) {
                    m108688B(m111940s2, m112662b);
                } else if (C32120Ce3.m111944o(m111940s2) < -0.5f) {
                    m108687C(m111940s2, m112662b);
                } else {
                    z8 = false;
                    if (C32120Ce3.m111943p(m111940s2) <= 0.5f) {
                        m108686D(m111940s2, m112662b);
                    } else if (C32120Ce3.m111943p(m111940s2) < -0.5f) {
                        m108689A(m111940s2, m112662b);
                    } else {
                        z9 = false;
                        if (!z8 || z9) {
                            z7 = true;
                            if (!m108685E(j) && !z7) {
                                z14 = false;
                            }
                            if (z14) {
                                m108662z();
                            }
                            return C32120Ce3.m111939t(m104938a, m111935x);
                        }
                    }
                    z9 = true;
                    if (!z8) {
                    }
                    z7 = true;
                    if (!m108685E(j)) {
                        z14 = false;
                    }
                    if (z14) {
                    }
                    return C32120Ce3.m111939t(m104938a, m111935x);
                }
                z8 = true;
                if (C32120Ce3.m111943p(m111940s2) <= 0.5f) {
                }
                z9 = true;
                if (!z8) {
                }
                z7 = true;
                if (!m108685E(j)) {
                }
                if (z14) {
                }
                return C32120Ce3.m111939t(m104938a, m111935x);
            }
            z7 = false;
            if (!m108685E(j)) {
            }
            if (z14) {
            }
            return C32120Ce3.m111939t(m104938a, m111935x);
        }
        m108689A = 0.0f;
        if (C32120Ce3.m111944o(j) != 0.0f) {
        }
        if (!z6) {
        }
        m104938a = C33056Ge3.m104938a(f, m108689A);
        if (!C32120Ce3.m111947l(m104938a, C32120Ce3.f4427b.m111932c())) {
        }
        long m111940s3 = C32120Ce3.m111940s(j, m104938a);
        long m111935x2 = performScroll.invoke(C32120Ce3.m111955d(m111940s3)).m111935x();
        long m111940s22 = C32120Ce3.m111940s(m111940s3, m111935x2);
        if (H43.m104445d(i, H43.f12808a.m104444a())) {
        }
        z7 = false;
        if (!m108685E(j)) {
        }
        if (z14) {
        }
        return C32120Ce3.m111939t(m104938a, m111935x2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ac  */
    @Override // p000.DA3
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7358d(long j, Function2<? super C48275ro6, ? super Continuation<? super C48275ro6>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        C1907a c1907a;
        Object coroutine_suspended;
        int i;
        float f;
        boolean z;
        int roundToInt;
        float f2;
        int roundToInt2;
        long m13616a;
        long m15354k;
        C1906Ec c1906Ec;
        boolean z2;
        int roundToInt3;
        boolean z3;
        int roundToInt4;
        long m15354k2;
        int roundToInt5;
        int roundToInt6;
        int roundToInt7;
        int roundToInt8;
        if (continuation instanceof C1907a) {
            c1907a = (C1907a) continuation;
            int i2 = c1907a.f7837l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1907a.f7837l = i2 - Integer.MIN_VALUE;
                Object obj = c1907a.f7835j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1907a.f7837l;
                boolean z4 = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            m15354k = c1907a.f7834i;
                            c1906Ec = (C1906Ec) c1907a.f7833h;
                            ResultKt.throwOnFailure(obj);
                            m15354k2 = C48275ro6.m15354k(m15354k, ((C48275ro6) obj).m15350o());
                            c1906Ec.f7828n = false;
                            if (C48275ro6.m15357h(m15354k2) <= 0.0f) {
                                C49664u91 c49664u91 = C49664u91.f111813a;
                                EdgeEffect edgeEffect = c1906Ec.f7819e;
                                roundToInt8 = MathKt__MathJVMKt.roundToInt(C48275ro6.m15357h(m15354k2));
                                c49664u91.m10780c(edgeEffect, roundToInt8);
                            } else if (C48275ro6.m15357h(m15354k2) < 0.0f) {
                                C49664u91 c49664u912 = C49664u91.f111813a;
                                EdgeEffect edgeEffect2 = c1906Ec.f7820f;
                                roundToInt5 = MathKt__MathJVMKt.roundToInt(C48275ro6.m15357h(m15354k2));
                                c49664u912.m10780c(edgeEffect2, -roundToInt5);
                            }
                            if (C48275ro6.m15356i(m15354k2) <= 0.0f) {
                                C49664u91 c49664u913 = C49664u91.f111813a;
                                EdgeEffect edgeEffect3 = c1906Ec.f7817c;
                                roundToInt7 = MathKt__MathJVMKt.roundToInt(C48275ro6.m15356i(m15354k2));
                                c49664u913.m10780c(edgeEffect3, roundToInt7);
                            } else if (C48275ro6.m15356i(m15354k2) < 0.0f) {
                                C49664u91 c49664u914 = C49664u91.f111813a;
                                EdgeEffect edgeEffect4 = c1906Ec.f7818d;
                                roundToInt6 = MathKt__MathJVMKt.roundToInt(C48275ro6.m15356i(m15354k2));
                                c49664u914.m10780c(edgeEffect4, -roundToInt6);
                            }
                            if (!C48275ro6.m15358g(m15354k2, C48275ro6.f107663b.m15349a())) {
                                c1906Ec.m108662z();
                            }
                            c1906Ec.m108668t();
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                if (C51465xB5.m5728k(this.f7829o)) {
                    C48275ro6 m15363b = C48275ro6.m15363b(j);
                    c1907a.f7837l = 1;
                    if (function2.invoke(m15363b, c1907a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (C48275ro6.m15357h(j) > 0.0f) {
                    C49664u91 c49664u915 = C49664u91.f111813a;
                    if (c49664u915.m10781b(this.f7819e) == 0.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        EdgeEffect edgeEffect5 = this.f7819e;
                        roundToInt4 = MathKt__MathJVMKt.roundToInt(C48275ro6.m15357h(j));
                        c49664u915.m10780c(edgeEffect5, roundToInt4);
                        f = C48275ro6.m15357h(j);
                        if (C48275ro6.m15356i(j) > 0.0f) {
                            C49664u91 c49664u916 = C49664u91.f111813a;
                            if (c49664u916.m10781b(this.f7817c) == 0.0f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                EdgeEffect edgeEffect6 = this.f7817c;
                                roundToInt3 = MathKt__MathJVMKt.roundToInt(C48275ro6.m15356i(j));
                                c49664u916.m10780c(edgeEffect6, roundToInt3);
                                f2 = C48275ro6.m15356i(j);
                                m13616a = C48867so6.m13616a(f, f2);
                                if (!C48275ro6.m15358g(m13616a, C48275ro6.f107663b.m15349a())) {
                                    m108662z();
                                }
                                m15354k = C48275ro6.m15354k(j, m13616a);
                                C48275ro6 m15363b2 = C48275ro6.m15363b(m15354k);
                                c1907a.f7833h = this;
                                c1907a.f7834i = m15354k;
                                c1907a.f7837l = 2;
                                obj = function2.invoke(m15363b2, c1907a);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                c1906Ec = this;
                                m15354k2 = C48275ro6.m15354k(m15354k, ((C48275ro6) obj).m15350o());
                                c1906Ec.f7828n = false;
                                if (C48275ro6.m15357h(m15354k2) <= 0.0f) {
                                }
                                if (C48275ro6.m15356i(m15354k2) <= 0.0f) {
                                }
                                if (!C48275ro6.m15358g(m15354k2, C48275ro6.f107663b.m15349a())) {
                                }
                                c1906Ec.m108668t();
                                return Unit.INSTANCE;
                            }
                        }
                        if (C48275ro6.m15356i(j) < 0.0f) {
                            C49664u91 c49664u917 = C49664u91.f111813a;
                            if (c49664u917.m10781b(this.f7818d) != 0.0f) {
                                z4 = false;
                            }
                            if (!z4) {
                                EdgeEffect edgeEffect7 = this.f7818d;
                                roundToInt2 = MathKt__MathJVMKt.roundToInt(C48275ro6.m15356i(j));
                                c49664u917.m10780c(edgeEffect7, -roundToInt2);
                                f2 = C48275ro6.m15356i(j);
                                m13616a = C48867so6.m13616a(f, f2);
                                if (!C48275ro6.m15358g(m13616a, C48275ro6.f107663b.m15349a())) {
                                }
                                m15354k = C48275ro6.m15354k(j, m13616a);
                                C48275ro6 m15363b22 = C48275ro6.m15363b(m15354k);
                                c1907a.f7833h = this;
                                c1907a.f7834i = m15354k;
                                c1907a.f7837l = 2;
                                obj = function2.invoke(m15363b22, c1907a);
                                if (obj == coroutine_suspended) {
                                }
                            }
                        }
                        f2 = 0.0f;
                        m13616a = C48867so6.m13616a(f, f2);
                        if (!C48275ro6.m15358g(m13616a, C48275ro6.f107663b.m15349a())) {
                        }
                        m15354k = C48275ro6.m15354k(j, m13616a);
                        C48275ro6 m15363b222 = C48275ro6.m15363b(m15354k);
                        c1907a.f7833h = this;
                        c1907a.f7834i = m15354k;
                        c1907a.f7837l = 2;
                        obj = function2.invoke(m15363b222, c1907a);
                        if (obj == coroutine_suspended) {
                        }
                    }
                }
                if (C48275ro6.m15357h(j) < 0.0f) {
                    C49664u91 c49664u918 = C49664u91.f111813a;
                    if (c49664u918.m10781b(this.f7820f) == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        EdgeEffect edgeEffect8 = this.f7820f;
                        roundToInt = MathKt__MathJVMKt.roundToInt(C48275ro6.m15357h(j));
                        c49664u918.m10780c(edgeEffect8, -roundToInt);
                        f = C48275ro6.m15357h(j);
                        if (C48275ro6.m15356i(j) > 0.0f) {
                        }
                        if (C48275ro6.m15356i(j) < 0.0f) {
                        }
                        f2 = 0.0f;
                        m13616a = C48867so6.m13616a(f, f2);
                        if (!C48275ro6.m15358g(m13616a, C48275ro6.f107663b.m15349a())) {
                        }
                        m15354k = C48275ro6.m15354k(j, m13616a);
                        C48275ro6 m15363b2222 = C48275ro6.m15363b(m15354k);
                        c1907a.f7833h = this;
                        c1907a.f7834i = m15354k;
                        c1907a.f7837l = 2;
                        obj = function2.invoke(m15363b2222, c1907a);
                        if (obj == coroutine_suspended) {
                        }
                    }
                }
                f = 0.0f;
                if (C48275ro6.m15356i(j) > 0.0f) {
                }
                if (C48275ro6.m15356i(j) < 0.0f) {
                }
                f2 = 0.0f;
                m13616a = C48867so6.m13616a(f, f2);
                if (!C48275ro6.m15358g(m13616a, C48275ro6.f107663b.m15349a())) {
                }
                m15354k = C48275ro6.m15354k(j, m13616a);
                C48275ro6 m15363b22222 = C48275ro6.m15363b(m15354k);
                c1907a.f7833h = this;
                c1907a.f7834i = m15354k;
                c1907a.f7837l = 2;
                obj = function2.invoke(m15363b22222, c1907a);
                if (obj == coroutine_suspended) {
                }
            }
        }
        c1907a = new C1907a(continuation);
        Object obj2 = c1907a.f7835j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c1907a.f7837l;
        boolean z42 = true;
        if (i == 0) {
        }
    }

    /* renamed from: t */
    public final void m108668t() {
        List<EdgeEffect> list = this.f7821g;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            edgeEffect.onRelease();
            if (!edgeEffect.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            m108662z();
        }
    }

    /* renamed from: u */
    public final boolean m108667u(I61 i61, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-C51465xB5.m5730i(this.f7829o), (-C51465xB5.m5732g(this.f7829o)) + i61.mo3411T0(this.f7815a.m114313a().mo88735a()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: v */
    public final boolean m108666v(I61 i61, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-C51465xB5.m5732g(this.f7829o), i61.mo3411T0(this.f7815a.m114313a().mo88734b(i61.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: w */
    public final void m108665w(I61 i61) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(i61, "<this>");
        if (C51465xB5.m5728k(this.f7829o)) {
            return;
        }
        InterfaceC45204me0 mo20724a = i61.mo20750d0().mo20724a();
        this.f7826l.getValue();
        Canvas m64279c = C12455bc.m64279c(mo20724a);
        C49664u91 c49664u91 = C49664u91.f111813a;
        boolean z6 = true;
        if (c49664u91.m10781b(this.f7824j) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m108664x(i61, this.f7824j, m64279c);
            this.f7824j.finish();
        }
        if (!this.f7819e.isFinished()) {
            z2 = m108666v(i61, this.f7819e, m64279c);
            c49664u91.m10779d(this.f7824j, c49664u91.m10781b(this.f7819e), 0.0f);
        } else {
            z2 = false;
        }
        if (c49664u91.m10781b(this.f7822h) == 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            m108667u(i61, this.f7822h, m64279c);
            this.f7822h.finish();
        }
        if (!this.f7817c.isFinished()) {
            if (!m108663y(i61, this.f7817c, m64279c) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
            c49664u91.m10779d(this.f7822h, c49664u91.m10781b(this.f7817c), 0.0f);
        }
        if (c49664u91.m10781b(this.f7825k) == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            m108666v(i61, this.f7825k, m64279c);
            this.f7825k.finish();
        }
        if (!this.f7820f.isFinished()) {
            if (!m108664x(i61, this.f7820f, m64279c) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
            c49664u91.m10779d(this.f7825k, c49664u91.m10781b(this.f7820f), 0.0f);
        }
        if (c49664u91.m10781b(this.f7823i) == 0.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            m108663y(i61, this.f7823i, m64279c);
            this.f7823i.finish();
        }
        if (!this.f7818d.isFinished()) {
            if (!m108667u(i61, this.f7818d, m64279c) && !z2) {
                z6 = false;
            }
            c49664u91.m10779d(this.f7823i, c49664u91.m10781b(this.f7818d), 0.0f);
            z2 = z6;
        }
        if (z2) {
            m108662z();
        }
    }

    /* renamed from: x */
    public final boolean m108664x(I61 i61, EdgeEffect edgeEffect, Canvas canvas) {
        int roundToInt;
        int save = canvas.save();
        roundToInt = MathKt__MathJVMKt.roundToInt(C51465xB5.m5730i(this.f7829o));
        float mo88733c = this.f7815a.m114313a().mo88733c(i61.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-roundToInt) + i61.mo3411T0(mo88733c));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: y */
    public final boolean m108663y(I61 i61, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, i61.mo3411T0(this.f7815a.m114313a().mo88732d()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: z */
    public final void m108662z() {
        if (this.f7827m) {
            this.f7826l.setValue(Unit.INSTANCE);
        }
    }
}
