package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.ConnectionResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0017\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0017\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010\t\"\u0017\u0010\u000e\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"Lcn2;", "", "index", "scrollOffset", "", DateTokenConverter.CONVERTER_KEY, "(Lcn2;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lk61;", C17296a.f69688o, "F", "TargetDistance", "b", "BoundDistance", "c", "MinimumDistance", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,264:1\n154#2:265\n154#2:266\n154#2:267\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n34#1:265\n35#1:266\n36#1:267\n*E\n"})
/* renamed from: bn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38756bn2 {

    /* renamed from: a */
    public static final float f58132a = C43705k61.m29303g(2500);

    /* renamed from: b */
    public static final float f58133b = C43705k61.m29303g((float) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);

    /* renamed from: c */
    public static final float f58134c = C43705k61.m29303g(50);

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWp5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", m28418f = "LazyAnimateScroll.kt", m28417i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, m28416l = {137, 233}, m28415m = "invokeSuspend", m28414n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
    @SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,264:1\n1#2:265\n40#3,4:266\n40#3,4:270\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n*L\n129#1:266,4\n230#1:270,4\n*E\n"})
    /* renamed from: bn2$a */
    /* loaded from: classes.dex */
    public static final class C12497a extends SuspendLambda implements Function2<InterfaceC36901Wp5, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f58135h;

        /* renamed from: i */
        public Object f58136i;

        /* renamed from: j */
        public Object f58137j;

        /* renamed from: k */
        public float f58138k;

        /* renamed from: l */
        public float f58139l;

        /* renamed from: m */
        public float f58140m;

        /* renamed from: n */
        public int f58141n;

        /* renamed from: o */
        public int f58142o;

        /* renamed from: p */
        public /* synthetic */ Object f58143p;

        /* renamed from: q */
        public final /* synthetic */ int f58144q;

        /* renamed from: r */
        public final /* synthetic */ InterfaceC39349cn2 f58145r;

        /* renamed from: s */
        public final /* synthetic */ int f58146s;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lkf;", "", "Lsf;", "", C17296a.f69688o, "(Lkf;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n+ 2 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,264:1\n40#2,4:265\n40#2,4:269\n40#2,4:273\n40#2,4:277\n40#2,4:281\n40#2,4:285\n40#2,4:289\n40#2,4:293\n40#2,4:297\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n*L\n152#1:265,4\n159#1:269,4\n162#1:273,4\n170#1:277,4\n175#1:281,4\n186#1:285,4\n198#1:289,4\n211#1:293,4\n217#1:297,4\n*E\n"})
        /* renamed from: bn2$a$a */
        /* loaded from: classes.dex */
        public static final class C12498a extends Lambda implements Function1<C25201kf<Float, C28366sf>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC39349cn2 f58147g;

            /* renamed from: h */
            public final /* synthetic */ int f58148h;

            /* renamed from: i */
            public final /* synthetic */ float f58149i;

            /* renamed from: j */
            public final /* synthetic */ Ref.FloatRef f58150j;

            /* renamed from: k */
            public final /* synthetic */ InterfaceC36901Wp5 f58151k;

            /* renamed from: l */
            public final /* synthetic */ Ref.BooleanRef f58152l;

            /* renamed from: m */
            public final /* synthetic */ boolean f58153m;

            /* renamed from: n */
            public final /* synthetic */ float f58154n;

            /* renamed from: o */
            public final /* synthetic */ Ref.IntRef f58155o;

            /* renamed from: p */
            public final /* synthetic */ int f58156p;

            /* renamed from: q */
            public final /* synthetic */ Ref.ObjectRef<C26565nf<Float, C28366sf>> f58157q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12498a(InterfaceC39349cn2 interfaceC39349cn2, int i, float f, Ref.FloatRef floatRef, InterfaceC36901Wp5 interfaceC36901Wp5, Ref.BooleanRef booleanRef, boolean z, float f2, Ref.IntRef intRef, int i2, Ref.ObjectRef<C26565nf<Float, C28366sf>> objectRef) {
                super(1);
                this.f58147g = interfaceC39349cn2;
                this.f58148h = i;
                this.f58149i = f;
                this.f58150j = floatRef;
                this.f58151k = interfaceC36901Wp5;
                this.f58152l = booleanRef;
                this.f58153m = z;
                this.f58154n = f2;
                this.f58155o = intRef;
                this.f58156p = i2;
                this.f58157q = objectRef;
            }

            /* renamed from: a */
            public final void m63980a(C25201kf<Float, C28366sf> animateTo) {
                boolean z;
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                Integer mo33491e = this.f58147g.mo33491e(this.f58148h);
                if (mo33491e == null) {
                    float coerceAtMost = (this.f58149i > 0.0f ? RangesKt___RangesKt.coerceAtMost(animateTo.m28697e().floatValue(), this.f58149i) : RangesKt___RangesKt.coerceAtLeast(animateTo.m28697e().floatValue(), this.f58149i)) - this.f58150j.element;
                    float mo43646a = this.f58151k.mo43646a(coerceAtMost);
                    Integer mo33491e2 = this.f58147g.mo33491e(this.f58148h);
                    if (mo33491e2 == null && !C12497a.m63981g(this.f58153m, this.f58147g, this.f58148h, this.f58156p)) {
                        if (coerceAtMost == mo43646a) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            animateTo.m28701a();
                            this.f58152l.element = false;
                            return;
                        }
                        this.f58150j.element += coerceAtMost;
                        if (this.f58153m) {
                            if (animateTo.m28697e().floatValue() > this.f58154n) {
                                animateTo.m28701a();
                            }
                        } else if (animateTo.m28697e().floatValue() < (-this.f58154n)) {
                            animateTo.m28701a();
                        }
                        if (this.f58153m) {
                            if (this.f58155o.element >= 2 && this.f58148h - this.f58147g.mo33492d() > this.f58147g.mo33488h()) {
                                InterfaceC39349cn2 interfaceC39349cn2 = this.f58147g;
                                interfaceC39349cn2.mo33490f(this.f58151k, this.f58148h - interfaceC39349cn2.mo33488h(), 0);
                            }
                        } else if (this.f58155o.element >= 2 && this.f58147g.mo33493c() - this.f58148h > this.f58147g.mo33488h()) {
                            InterfaceC39349cn2 interfaceC39349cn22 = this.f58147g;
                            interfaceC39349cn22.mo33490f(this.f58151k, this.f58148h + interfaceC39349cn22.mo33488h(), 0);
                        }
                    }
                    mo33491e = mo33491e2;
                }
                if (C12497a.m63981g(this.f58153m, this.f58147g, this.f58148h, this.f58156p)) {
                    this.f58147g.mo33490f(this.f58151k, this.f58148h, this.f58156p);
                    this.f58152l.element = false;
                    animateTo.m28701a();
                } else if (mo33491e == null) {
                } else {
                    throw new C40442ec2(mo33491e.intValue(), this.f58157q.element);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C25201kf<Float, C28366sf> c25201kf) {
                m63980a(c25201kf);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lkf;", "", "Lsf;", "", C17296a.f69688o, "(Lkf;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$5\n+ 2 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,264:1\n40#2,4:265\n40#2,4:269\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$5\n*L\n243#1:265,4\n248#1:269,4\n*E\n"})
        /* renamed from: bn2$a$b */
        /* loaded from: classes.dex */
        public static final class C12499b extends Lambda implements Function1<C25201kf<Float, C28366sf>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ float f58158g;

            /* renamed from: h */
            public final /* synthetic */ Ref.FloatRef f58159h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC36901Wp5 f58160i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12499b(float f, Ref.FloatRef floatRef, InterfaceC36901Wp5 interfaceC36901Wp5) {
                super(1);
                this.f58158g = f;
                this.f58159h = floatRef;
                this.f58160i = interfaceC36901Wp5;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
                if (r3 == false) goto L15;
             */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m63979a(C25201kf<Float, C28366sf> animateTo) {
                boolean z;
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                float f = this.f58158g;
                float f2 = 0.0f;
                if (f > 0.0f) {
                    f2 = RangesKt___RangesKt.coerceAtMost(animateTo.m28697e().floatValue(), this.f58158g);
                } else if (f < 0.0f) {
                    f2 = RangesKt___RangesKt.coerceAtLeast(animateTo.m28697e().floatValue(), this.f58158g);
                }
                float f3 = f2 - this.f58159h.element;
                boolean z2 = true;
                if (f3 == this.f58160i.mo43646a(f3)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (f2 != animateTo.m28697e().floatValue()) {
                        z2 = false;
                    }
                }
                animateTo.m28701a();
                this.f58159h.element += f3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C25201kf<Float, C28366sf> c25201kf) {
                m63979a(c25201kf);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12497a(int i, InterfaceC39349cn2 interfaceC39349cn2, int i2, Continuation<? super C12497a> continuation) {
            super(2, continuation);
            this.f58144q = i;
            this.f58145r = interfaceC39349cn2;
            this.f58146s = i2;
        }

        /* renamed from: g */
        public static final boolean m63981g(boolean z, InterfaceC39349cn2 interfaceC39349cn2, int i, int i2) {
            if (z) {
                if (interfaceC39349cn2.mo33493c() <= i && (interfaceC39349cn2.mo33493c() != i || interfaceC39349cn2.mo33487i() <= i2)) {
                    return false;
                }
            } else if (interfaceC39349cn2.mo33493c() >= i && (interfaceC39349cn2.mo33493c() != i || interfaceC39349cn2.mo33487i() >= i2)) {
                return false;
            }
            return true;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12497a c12497a = new C12497a(this.f58144q, this.f58145r, this.f58146s, continuation);
            c12497a.f58143p = obj;
            return c12497a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: f */
        public final Object invoke(InterfaceC36901Wp5 interfaceC36901Wp5, Continuation<? super Unit> continuation) {
            return ((C12497a) create(interfaceC36901Wp5, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00d7 A[Catch: ec2 -> 0x01d3, TryCatch #5 {ec2 -> 0x01d3, blocks: (B:27:0x00d3, B:29:0x00d7, B:31:0x00df, B:41:0x0103, B:48:0x014a, B:52:0x0157), top: B:98:0x00d3 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f1 A[Catch: ec2 -> 0x01c4, TRY_ENTER, TRY_LEAVE, TryCatch #4 {ec2 -> 0x01c4, blocks: (B:61:0x01b7, B:34:0x00f1), top: B:96:0x01b7 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01ae A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0249 A[RETURN] */
        /* JADX WARN: Type inference failed for: r12v1, types: [T, nf] */
        /* JADX WARN: Type inference failed for: r5v8, types: [T, nf] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01af -> B:96:0x01b7). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            boolean z;
            C40442ec2 c40442ec2;
            InterfaceC36901Wp5 interfaceC36901Wp5;
            float mo3411T0;
            float mo3411T02;
            float mo3411T03;
            Ref.BooleanRef booleanRef;
            Ref.ObjectRef objectRef;
            Integer mo33491e;
            int i;
            Ref.IntRef intRef;
            float f;
            float f2;
            int i2;
            Ref.ObjectRef objectRef2;
            Ref.BooleanRef booleanRef2;
            InterfaceC36901Wp5 interfaceC36901Wp52;
            float f3;
            C12497a c12497a;
            C26565nf m20695e;
            Float boxFloat;
            boolean z2;
            C12499b c12499b;
            InterfaceC36901Wp5 interfaceC36901Wp53;
            float f4;
            boolean z3;
            boolean z4;
            boolean z5;
            InterfaceC36901Wp5 interfaceC36901Wp54;
            Ref.BooleanRef booleanRef3;
            Ref.ObjectRef objectRef3;
            Ref.IntRef intRef2;
            Object obj2;
            float f5;
            float f6;
            C12497a c12497a2 = this;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = c12497a2.f58142o;
            float f7 = 0.0f;
            boolean z6 = true;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        interfaceC36901Wp5 = (InterfaceC36901Wp5) c12497a2.f58143p;
                        ResultKt.throwOnFailure(obj);
                        c12497a2.f58145r.mo33490f(interfaceC36901Wp5, c12497a2.f58144q, c12497a2.f58146s);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = c12497a2.f58141n;
                f3 = c12497a2.f58140m;
                float f8 = c12497a2.f58139l;
                float f9 = c12497a2.f58138k;
                Ref.IntRef intRef3 = (Ref.IntRef) c12497a2.f58137j;
                Ref.ObjectRef objectRef4 = (Ref.ObjectRef) c12497a2.f58136i;
                Ref.BooleanRef booleanRef4 = (Ref.BooleanRef) c12497a2.f58135h;
                InterfaceC36901Wp5 interfaceC36901Wp55 = (InterfaceC36901Wp5) c12497a2.f58143p;
                try {
                    ResultKt.throwOnFailure(obj);
                    f2 = f8;
                    f = f9;
                    c12497a = c12497a2;
                    intRef = intRef3;
                    interfaceC36901Wp52 = interfaceC36901Wp55;
                    objectRef2 = objectRef4;
                    booleanRef2 = booleanRef4;
                    try {
                        try {
                            intRef.element++;
                            if (booleanRef2.element && c12497a.f58145r.getItemCount() > 0) {
                                try {
                                    try {
                                        float mo33495a = c12497a.f58145r.mo33495a(c12497a.f58144q, c12497a.f58146s);
                                        if (Math.abs(mo33495a) < f) {
                                            f4 = Math.max(Math.abs(mo33495a), f3);
                                            if (i2 == 0) {
                                                f4 = -f4;
                                            }
                                        } else if (i2 != 0) {
                                            f4 = f;
                                        } else {
                                            f4 = -f;
                                        }
                                        objectRef2.element = C27022of.m20695e((C26565nf) objectRef2.element, 0.0f, 0.0f, 0L, 0L, false, 30, null);
                                        Ref.FloatRef floatRef = new Ref.FloatRef();
                                        C26565nf c26565nf = (C26565nf) objectRef2.element;
                                        Float boxFloat2 = Boxing.boxFloat(f4);
                                        if (((Number) ((C26565nf) objectRef2.element).m23359h()).floatValue() != f7) {
                                            z3 = z6;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            z4 = z6;
                                        } else {
                                            z4 = false;
                                        }
                                        InterfaceC39349cn2 interfaceC39349cn2 = c12497a.f58145r;
                                        int i4 = c12497a.f58144q;
                                        if (i2 == 0) {
                                            z5 = z6;
                                        } else {
                                            z5 = false;
                                        }
                                        C12498a c12498a = new C12498a(interfaceC39349cn2, i4, r11, floatRef, interfaceC36901Wp54, booleanRef3, z5, f6, intRef2, c12497a.f58146s, objectRef3);
                                        c12497a2.f58143p = interfaceC36901Wp53;
                                        c12497a2.f58135h = booleanRef3;
                                        c12497a2.f58136i = objectRef3;
                                        c12497a2.f58137j = intRef2;
                                        c12497a2.f58138k = f5;
                                        c12497a2.f58139l = f6;
                                        c12497a2.f58140m = f3;
                                        c12497a2.f58141n = i2;
                                        c12497a2.f58142o = 1;
                                        if (C49876uW5.m10132j(c26565nf, boxFloat2, null, z4, c12498a, c12497a2, 2, null) != obj2) {
                                            return obj2;
                                        }
                                        f = f5;
                                        objectRef2 = objectRef3;
                                        booleanRef2 = booleanRef3;
                                        intRef = intRef2;
                                        coroutine_suspended = obj2;
                                        f2 = f6;
                                        interfaceC36901Wp52 = interfaceC36901Wp53;
                                        c12497a = c12497a2;
                                        intRef.element++;
                                        f7 = 0.0f;
                                        z6 = true;
                                        if (booleanRef2.element) {
                                            float mo33495a2 = c12497a.f58145r.mo33495a(c12497a.f58144q, c12497a.f58146s);
                                            if (Math.abs(mo33495a2) < f) {
                                            }
                                            objectRef2.element = C27022of.m20695e((C26565nf) objectRef2.element, 0.0f, 0.0f, 0L, 0L, false, 30, null);
                                            Ref.FloatRef floatRef2 = new Ref.FloatRef();
                                            C26565nf c26565nf2 = (C26565nf) objectRef2.element;
                                            Float boxFloat22 = Boxing.boxFloat(f4);
                                            if (((Number) ((C26565nf) objectRef2.element).m23359h()).floatValue() != f7) {
                                            }
                                            if (z3) {
                                            }
                                            InterfaceC39349cn2 interfaceC39349cn22 = c12497a.f58145r;
                                            int i42 = c12497a.f58144q;
                                            if (i2 == 0) {
                                            }
                                            c12497a2 = c12497a;
                                            interfaceC36901Wp54 = interfaceC36901Wp52;
                                            booleanRef3 = booleanRef2;
                                            float f10 = f4;
                                            objectRef3 = objectRef2;
                                            intRef2 = intRef;
                                            obj2 = coroutine_suspended;
                                            f5 = f;
                                            f6 = f2;
                                            C12498a c12498a2 = new C12498a(interfaceC39349cn22, i42, f10, floatRef2, interfaceC36901Wp54, booleanRef3, z5, f6, intRef2, c12497a.f58146s, objectRef3);
                                            interfaceC36901Wp53 = interfaceC36901Wp54;
                                            c12497a2.f58143p = interfaceC36901Wp53;
                                            c12497a2.f58135h = booleanRef3;
                                            c12497a2.f58136i = objectRef3;
                                            c12497a2.f58137j = intRef2;
                                            c12497a2.f58138k = f5;
                                            c12497a2.f58139l = f6;
                                            c12497a2.f58140m = f3;
                                            c12497a2.f58141n = i2;
                                            c12497a2.f58142o = 1;
                                            if (C49876uW5.m10132j(c26565nf2, boxFloat22, null, z4, c12498a2, c12497a2, 2, null) != obj2) {
                                            }
                                        }
                                    } catch (C40442ec2 e) {
                                        e = e;
                                        interfaceC36901Wp53 = interfaceC36901Wp54;
                                    }
                                    c12497a2 = c12497a;
                                    interfaceC36901Wp54 = interfaceC36901Wp52;
                                    booleanRef3 = booleanRef2;
                                    float f102 = f4;
                                    objectRef3 = objectRef2;
                                    intRef2 = intRef;
                                    obj2 = coroutine_suspended;
                                    f5 = f;
                                    f6 = f2;
                                } catch (C40442ec2 e2) {
                                    e = e2;
                                    c40442ec2 = e;
                                    coroutine_suspended = obj2;
                                    interfaceC36901Wp5 = interfaceC36901Wp53;
                                    m20695e = C27022of.m20695e(c40442ec2.m42723b(), 0.0f, 0.0f, 0L, 0L, false, 30, null);
                                    float m42724a = c40442ec2.m42724a() + c12497a2.f58146s;
                                    Ref.FloatRef floatRef3 = new Ref.FloatRef();
                                    boxFloat = Boxing.boxFloat(m42724a);
                                    if (((Number) m20695e.m23359h()).floatValue() != 0.0f) {
                                    }
                                    c12499b = new C12499b(m42724a, floatRef3, interfaceC36901Wp5);
                                    c12497a2.f58143p = interfaceC36901Wp5;
                                    c12497a2.f58135h = null;
                                    c12497a2.f58136i = null;
                                    c12497a2.f58137j = null;
                                    c12497a2.f58142o = 2;
                                    if (C49876uW5.m10132j(m20695e, boxFloat, null, !z2, c12499b, c12497a2, 2, null) == coroutine_suspended) {
                                    }
                                    c12497a2.f58145r.mo33490f(interfaceC36901Wp5, c12497a2.f58144q, c12497a2.f58146s);
                                    return Unit.INSTANCE;
                                }
                                interfaceC36901Wp53 = interfaceC36901Wp54;
                            }
                        } catch (C40442ec2 e3) {
                            c40442ec2 = e3;
                            c12497a2 = c12497a;
                            interfaceC36901Wp5 = interfaceC36901Wp52;
                        }
                    } catch (C40442ec2 e4) {
                        c12497a2 = c12497a;
                        interfaceC36901Wp53 = interfaceC36901Wp52;
                        c40442ec2 = e4;
                    }
                    f7 = 0.0f;
                    z6 = true;
                } catch (C40442ec2 e5) {
                    c40442ec2 = e5;
                    interfaceC36901Wp5 = interfaceC36901Wp55;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC36901Wp5 interfaceC36901Wp56 = (InterfaceC36901Wp5) c12497a2.f58143p;
            int i5 = c12497a2.f58144q;
            if (i5 >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    mo3411T0 = c12497a2.f58145r.mo33494b().mo3411T0(C38756bn2.f58132a);
                    mo3411T02 = c12497a2.f58145r.mo33494b().mo3411T0(C38756bn2.f58133b);
                    mo3411T03 = c12497a2.f58145r.mo33494b().mo3411T0(C38756bn2.f58134c);
                    booleanRef = new Ref.BooleanRef();
                    booleanRef.element = true;
                    objectRef = new Ref.ObjectRef();
                    objectRef.element = C27022of.m20698b(0.0f, 0.0f, 0L, 0L, false, 30, null);
                    mo33491e = c12497a2.f58145r.mo33491e(c12497a2.f58144q);
                } catch (C40442ec2 e6) {
                    c12497a2 = this;
                    c40442ec2 = e6;
                    interfaceC36901Wp5 = interfaceC36901Wp56;
                }
                if (mo33491e == null) {
                    if (c12497a2.f58144q > c12497a2.f58145r.mo33493c()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    intRef = new Ref.IntRef();
                    intRef.element = 1;
                    f = mo3411T0;
                    f2 = mo3411T02;
                    i2 = i;
                    objectRef2 = objectRef;
                    booleanRef2 = booleanRef;
                    interfaceC36901Wp52 = interfaceC36901Wp56;
                    f3 = mo3411T03;
                    c12497a = c12497a2;
                    if (booleanRef2.element) {
                    }
                    return Unit.INSTANCE;
                }
                throw new C40442ec2(mo33491e.intValue(), (C26565nf) objectRef.element);
            }
            throw new IllegalArgumentException(("Index should be non-negative (" + i5 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
            m20695e = C27022of.m20695e(c40442ec2.m42723b(), 0.0f, 0.0f, 0L, 0L, false, 30, null);
            float m42724a2 = c40442ec2.m42724a() + c12497a2.f58146s;
            Ref.FloatRef floatRef32 = new Ref.FloatRef();
            boxFloat = Boxing.boxFloat(m42724a2);
            if (((Number) m20695e.m23359h()).floatValue() != 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            c12499b = new C12499b(m42724a2, floatRef32, interfaceC36901Wp5);
            c12497a2.f58143p = interfaceC36901Wp5;
            c12497a2.f58135h = null;
            c12497a2.f58136i = null;
            c12497a2.f58137j = null;
            c12497a2.f58142o = 2;
            if (C49876uW5.m10132j(m20695e, boxFloat, null, !z2, c12499b, c12497a2, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c12497a2.f58145r.mo33490f(interfaceC36901Wp5, c12497a2.f58144q, c12497a2.f58146s);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: d */
    public static final Object m63984d(InterfaceC39349cn2 interfaceC39349cn2, int i, int i2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object mo33489g = interfaceC39349cn2.mo33489g(new C12497a(i, interfaceC39349cn2, i2, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mo33489g == coroutine_suspended ? mo33489g : Unit.INSTANCE;
    }
}
