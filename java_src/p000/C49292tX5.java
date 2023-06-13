package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    */
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000 J*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001(B\u0081\u0001\u0012\u0006\u0010h\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e\u0012#\b\u0002\u0010,\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u000e0$\u0012.\b\u0002\u00104\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00030-¢\u0006\u0002\b/\u0012\b\b\u0002\u00109\u001a\u000205ø\u0001\u0000¢\u0006\u0004\bi\u0010jJ'\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\u000b\u001a\u00020\u0003J#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R5\u0010,\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u000e0$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R@\u00104\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00030-¢\u0006\u0002\b/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R#\u00109\u001a\u0002058\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b6\u0010\u0016\u001a\u0004\b7\u00108R+\u0010\u0005\u001a\u00028\u00002\u0006\u0010:\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001b\u0010\u0014\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010>R/\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010:\u001a\u0004\u0018\u00010\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010<\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001b\u0010I\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bH\u00108R+\u0010M\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010<\u001a\u0004\bJ\u00108\"\u0004\bK\u0010LR\u001b\u0010P\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u00108R\u001b\u0010R\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010A\u001a\u0004\bQ\u00108R/\u0010U\u001a\u0004\u0018\u00018\u00002\b\u0010:\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010<\u001a\u0004\bS\u0010>\"\u0004\bT\u0010@R\u001a\u0010Z\u001a\u00020V8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010W\u001a\u0004\bX\u0010YRC\u0010^\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\f2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010<\u001a\u0004\bN\u0010[\"\u0004\b\\\u0010]R$\u0010d\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0011\u0010g\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, m28432d2 = {"LtX5;", "T", "", "", "offset", "currentValue", "velocity", "h", "(FLjava/lang/Object;F)Ljava/lang/Object;", "Lg01;", "w", "x", "", "newAnchors", "", "G", "(Ljava/util/Map;)Z", "value", "u", "(Ljava/lang/Object;)Z", "targetValue", "", "F", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "i", "Llf;", C17296a.f69688o, "Llf;", "k", "()Llf;", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "b", "Lkotlin/jvm/functions/Function1;", "m", "()Lkotlin/jvm/functions/Function1;", "confirmValueChange", "Lkotlin/Function2;", "totalDistance", "Lkotlin/ExtensionFunctionType;", "c", "Lkotlin/jvm/functions/Function2;", "getPositionalThreshold$material_release", "()Lkotlin/jvm/functions/Function2;", "positionalThreshold", "Lk61;", DateTokenConverter.CONVERTER_KEY, "getVelocityThreshold-D9Ej5fM$material_release", "()F", "velocityThreshold", "<set-?>", "e", "LEX2;", "n", "()Ljava/lang/Object;", "A", "(Ljava/lang/Object;)V", "LsP5;", "t", "g", "s", "()Ljava/lang/Float;", "D", "(Ljava/lang/Float;)V", "getProgress", "progress", "p", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(F)V", "lastVelocity", "j", "r", "minOffset", "q", "maxOffset", "l", "z", "animationTarget", "Lx61;", "Lx61;", "o", "()Lx61;", "draggableState", "()Ljava/util/Map;", "y", "(Ljava/util/Map;)V", "anchors", "Lg01;", "getDensity$material_release", "()Lg01;", "B", "(Lg01;)V", "density", "v", "()Z", "isAnimationRunning", "initialValue", "<init>", "(Ljava/lang/Object;Llf;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2State\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n76#2:656\n102#2,2:657\n76#2:659\n76#2:660\n102#2,2:661\n76#2:663\n76#2:664\n102#2,2:665\n76#2:667\n76#2:668\n76#2:669\n102#2,2:670\n76#2:672\n102#2,2:673\n288#3,2:675\n1#4:677\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2State\n*L\n169#1:656\n169#1:657,2\n177#1:659\n200#1:660\n200#1:661,2\n223#1:663\n240#1:664\n240#1:665,2\n247#1:667\n253#1:668\n255#1:669\n255#1:670,2\n260#1:672\n260#1:673,2\n354#1:675,2\n*E\n"})
/* renamed from: tX5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49292tX5<T> {

    /* renamed from: p */
    public static final C28763b f110627p = new C28763b(null);

    /* renamed from: a */
    public final InterfaceC25753lf<Float> f110628a;

    /* renamed from: b */
    public final Function1<T, Boolean> f110629b;

    /* renamed from: c */
    public final Function2<InterfaceC41273g01, Float, Float> f110630c;

    /* renamed from: d */
    public final float f110631d;

    /* renamed from: e */
    public final EX2 f110632e;

    /* renamed from: f */
    public final InterfaceC48627sP5 f110633f;

    /* renamed from: g */
    public final EX2 f110634g;

    /* renamed from: h */
    public final InterfaceC48627sP5 f110635h;

    /* renamed from: i */
    public final EX2 f110636i;

    /* renamed from: j */
    public final InterfaceC48627sP5 f110637j;

    /* renamed from: k */
    public final InterfaceC48627sP5 f110638k;

    /* renamed from: l */
    public final EX2 f110639l;

    /* renamed from: m */
    public final InterfaceC51412x61 f110640m;

    /* renamed from: n */
    public final EX2 f110641n;

    /* renamed from: o */
    public InterfaceC41273g01 f110642o;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tX5$a */
    /* loaded from: classes.dex */
    public static final class C28762a extends Lambda implements Function1<T, Boolean> {

        /* renamed from: g */
        public static final C28762a f110643g = new C28762a();

        public C28762a() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(T t) {
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((C28762a) obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LtX5$b;", "", "<init>", "()V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: tX5$b */
    /* loaded from: classes.dex */
    public static final class C28763b {
        public /* synthetic */ C28763b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28763b() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.material.SwipeableV2State", m28418f = "SwipeableV2.kt", m28417i = {0}, m28416l = {335}, m28415m = "animateTo", m28414n = {"this"}, m28413s = {"L$0"})
    /* renamed from: tX5$c */
    /* loaded from: classes.dex */
    public static final class C28764c extends ContinuationImpl {

        /* renamed from: h */
        public Object f110644h;

        /* renamed from: i */
        public /* synthetic */ Object f110645i;

        /* renamed from: j */
        public final /* synthetic */ C49292tX5<T> f110646j;

        /* renamed from: k */
        public int f110647k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28764c(C49292tX5<T> c49292tX5, Continuation<? super C28764c> continuation) {
            super(continuation);
            this.f110646j = c49292tX5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110645i = obj;
            this.f110647k |= Integer.MIN_VALUE;
            return this.f110646j.m12130f(null, 0.0f, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "Lv61;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.material.SwipeableV2State$animateTo$2", m28418f = "SwipeableV2.kt", m28417i = {}, m28416l = {338}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: tX5$d */
    /* loaded from: classes.dex */
    public static final class C28765d extends SuspendLambda implements Function2<InterfaceC50226v61, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f110648h;

        /* renamed from: i */
        public final /* synthetic */ C49292tX5<T> f110649i;

        /* renamed from: j */
        public final /* synthetic */ T f110650j;

        /* renamed from: k */
        public final /* synthetic */ Float f110651k;

        /* renamed from: l */
        public final /* synthetic */ float f110652l;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "", "value", "velocity", "", C17296a.f69688o, "(FF)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tX5$d$a */
        /* loaded from: classes.dex */
        public static final class C28766a extends Lambda implements Function2<Float, Float, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C49292tX5<T> f110653g;

            /* renamed from: h */
            public final /* synthetic */ Ref.FloatRef f110654h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28766a(C49292tX5<T> c49292tX5, Ref.FloatRef floatRef) {
                super(2);
                this.f110653g = c49292tX5;
                this.f110654h = floatRef;
            }

            /* renamed from: a */
            public final void m12108a(float f, float f2) {
                this.f110653g.m12139D(Float.valueOf(f));
                this.f110654h.element = f;
                this.f110653g.m12140C(f2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
                m12108a(f.floatValue(), f2.floatValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28765d(C49292tX5<T> c49292tX5, T t, Float f, float f2, Continuation<? super C28765d> continuation) {
            super(2, continuation);
            this.f110649i = c49292tX5;
            this.f110650j = t;
            this.f110651k = f;
            this.f110652l = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C28765d(this.f110649i, this.f110650j, this.f110651k, this.f110652l, continuation);
        }

        /* renamed from: e */
        public final Object m12109e(InterfaceC50226v61 interfaceC50226v61, Continuation<? super Unit> continuation) {
            return ((C28765d) create(interfaceC50226v61, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC50226v61 interfaceC50226v61, Continuation<? super Unit> continuation) {
            return m12109e(interfaceC50226v61, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            float f;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f110648h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f110649i.m12110z(this.f110650j);
                Ref.FloatRef floatRef = new Ref.FloatRef();
                Float m12117s = this.f110649i.m12117s();
                if (m12117s != null) {
                    f = m12117s.floatValue();
                } else {
                    f = 0.0f;
                }
                floatRef.element = f;
                float floatValue = this.f110651k.floatValue();
                float f2 = this.f110652l;
                InterfaceC25753lf<Float> m12125k = this.f110649i.m12125k();
                C28766a c28766a = new C28766a(this.f110649i, floatRef);
                this.f110648h = 1;
                if (C49876uW5.m10140b(f, floatValue, f2, m12125k, c28766a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f110649i.m12140C(0.0f);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "", "it", "", C17296a.f69688o, "(F)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tX5$e */
    /* loaded from: classes.dex */
    public static final class C28767e extends Lambda implements Function1<Float, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49292tX5<T> f110655g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28767e(C49292tX5<T> c49292tX5) {
            super(1);
            this.f110655g = c49292tX5;
        }

        /* renamed from: a */
        public final void m12107a(float f) {
            float coerceIn;
            C49292tX5<T> c49292tX5 = this.f110655g;
            Float m12117s = c49292tX5.m12117s();
            coerceIn = RangesKt___RangesKt.coerceIn((m12117s != null ? m12117s.floatValue() : 0.0f) + f, this.f110655g.m12118r(), this.f110655g.m12119q());
            c49292tX5.m12139D(Float.valueOf(coerceIn));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            m12107a(f.floatValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"T", "", "b", "()Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tX5$f */
    /* loaded from: classes.dex */
    public static final class C28768f extends Lambda implements Function0<Float> {

        /* renamed from: g */
        public final /* synthetic */ C49292tX5<T> f110656g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28768f(C49292tX5<T> c49292tX5) {
            super(0);
            this.f110656g = c49292tX5;
        }

        /* renamed from: b */
        public final Float m12106b() {
            Float m14074b = C48699sX5.m14074b(this.f110656g.m12126j());
            return Float.valueOf(m14074b != null ? m14074b.floatValue() : Float.POSITIVE_INFINITY);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return m12106b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"T", "", "b", "()Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tX5$g */
    /* loaded from: classes.dex */
    public static final class C28769g extends Lambda implements Function0<Float> {

        /* renamed from: g */
        public final /* synthetic */ C49292tX5<T> f110657g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28769g(C49292tX5<T> c49292tX5) {
            super(0);
            this.f110657g = c49292tX5;
        }

        /* renamed from: b */
        public final Float m12105b() {
            Float m14073c = C48699sX5.m14073c(this.f110657g.m12126j());
            return Float.valueOf(m14073c != null ? m14073c.floatValue() : Float.NEGATIVE_INFINITY);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return m12105b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"T", "", "b", "()Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tX5$h */
    /* loaded from: classes.dex */
    public static final class C28770h extends Lambda implements Function0<Float> {

        /* renamed from: g */
        public final /* synthetic */ C49292tX5<T> f110658g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28770h(C49292tX5<T> c49292tX5) {
            super(0);
            this.f110658g = c49292tX5;
        }

        /* renamed from: b */
        public final Float m12104b() {
            float f;
            float f2;
            Float f3 = this.f110658g.m12126j().get(this.f110658g.m12122n());
            float f4 = 0.0f;
            if (f3 != null) {
                f = f3.floatValue();
            } else {
                f = 0.0f;
            }
            Float f5 = this.f110658g.m12126j().get(this.f110658g.m12116t());
            if (f5 != null) {
                f2 = f5.floatValue();
            } else {
                f2 = 0.0f;
            }
            float f6 = f2 - f;
            if (Math.abs(f6) > 1.0E-6f) {
                float m12112x = (this.f110658g.m12112x() - f) / f6;
                if (m12112x >= 1.0E-6f) {
                    if (m12112x <= 0.999999f) {
                        f4 = m12112x;
                    }
                }
                return Float.valueOf(f4);
            }
            f4 = 1.0f;
            return Float.valueOf(f4);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return m12104b();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.material.SwipeableV2State", m28418f = "SwipeableV2.kt", m28417i = {0, 0}, m28416l = {304}, m28415m = "snapTo", m28414n = {"this", "targetValue"}, m28413s = {"L$0", "L$1"})
    /* renamed from: tX5$i */
    /* loaded from: classes.dex */
    public static final class C28771i extends ContinuationImpl {

        /* renamed from: h */
        public Object f110659h;

        /* renamed from: i */
        public Object f110660i;

        /* renamed from: j */
        public /* synthetic */ Object f110661j;

        /* renamed from: k */
        public final /* synthetic */ C49292tX5<T> f110662k;

        /* renamed from: l */
        public int f110663l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28771i(C49292tX5<T> c49292tX5, Continuation<? super C28771i> continuation) {
            super(continuation);
            this.f110662k = c49292tX5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110661j = obj;
            this.f110663l |= Integer.MIN_VALUE;
            return this.f110662k.m12137F(null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "Lv61;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.material.SwipeableV2State$snapTo$2", m28418f = "SwipeableV2.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: tX5$j */
    /* loaded from: classes.dex */
    public static final class C28772j extends SuspendLambda implements Function2<InterfaceC50226v61, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f110664h;

        /* renamed from: i */
        public /* synthetic */ Object f110665i;

        /* renamed from: j */
        public final /* synthetic */ C49292tX5<T> f110666j;

        /* renamed from: k */
        public final /* synthetic */ T f110667k;

        /* renamed from: l */
        public final /* synthetic */ Float f110668l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28772j(C49292tX5<T> c49292tX5, T t, Float f, Continuation<? super C28772j> continuation) {
            super(2, continuation);
            this.f110666j = c49292tX5;
            this.f110667k = t;
            this.f110668l = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C28772j c28772j = new C28772j(this.f110666j, this.f110667k, this.f110668l, continuation);
            c28772j.f110665i = obj;
            return c28772j;
        }

        /* renamed from: e */
        public final Object m12103e(InterfaceC50226v61 interfaceC50226v61, Continuation<? super Unit> continuation) {
            return ((C28772j) create(interfaceC50226v61, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC50226v61 interfaceC50226v61, Continuation<? super Unit> continuation) {
            return m12103e(interfaceC50226v61, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f110664h == 0) {
                ResultKt.throwOnFailure(obj);
                this.f110666j.m12110z(this.f110667k);
                ((InterfaceC50226v61) this.f110665i).mo9194a(this.f110668l.floatValue() - this.f110666j.m12112x());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tX5$k */
    /* loaded from: classes.dex */
    public static final class C28773k extends Lambda implements Function0<T> {

        /* renamed from: g */
        public final /* synthetic */ C49292tX5<T> f110669g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28773k(C49292tX5<T> c49292tX5) {
            super(0);
            this.f110669g = c49292tX5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            T t = (T) this.f110669g.m12124l();
            if (t == null) {
                C49292tX5<T> c49292tX5 = this.f110669g;
                Float m12117s = c49292tX5.m12117s();
                if (m12117s != null) {
                    return (T) c49292tX5.m12128h(m12117s.floatValue(), c49292tX5.m12122n(), 0.0f);
                }
                return c49292tX5.m12122n();
            }
            return t;
        }
    }

    static {
    }

    public /* synthetic */ C49292tX5(Object obj, InterfaceC25753lf interfaceC25753lf, Function1 function1, Function2 function2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, interfaceC25753lf, function1, function2, f);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m12129g(C49292tX5 c49292tX5, Object obj, float f, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = c49292tX5.m12120p();
        }
        return c49292tX5.m12130f(obj, f, continuation);
    }

    /* renamed from: A */
    public final void m12142A(T t) {
        this.f110632e.setValue(t);
    }

    /* renamed from: B */
    public final void m12141B(InterfaceC41273g01 interfaceC41273g01) {
        this.f110642o = interfaceC41273g01;
    }

    /* renamed from: C */
    public final void m12140C(float f) {
        this.f110636i.setValue(Float.valueOf(f));
    }

    /* renamed from: D */
    public final void m12139D(Float f) {
        this.f110634g.setValue(f);
    }

    /* renamed from: E */
    public final Object m12138E(float f, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        T m12122n = m12122n();
        T m12128h = m12128h(m12112x(), m12122n, f);
        if (this.f110629b.invoke(m12128h).booleanValue()) {
            Object m12130f = m12130f(m12128h, f, continuation);
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m12130f == coroutine_suspended2) {
                return m12130f;
            }
            return Unit.INSTANCE;
        }
        Object m12130f2 = m12130f(m12122n, f, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m12130f2 == coroutine_suspended) {
            return m12130f2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m12137F(T t, Continuation<? super Unit> continuation) {
        C28771i c28771i;
        Object coroutine_suspended;
        int i;
        C49292tX5<T> c49292tX5;
        if (continuation instanceof C28771i) {
            c28771i = (C28771i) continuation;
            int i2 = c28771i.f110663l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28771i.f110663l = i2 - Integer.MIN_VALUE;
                C28771i c28771i22 = c28771i;
                Object obj2 = c28771i22.f110661j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c28771i22.f110663l;
                if (i == 0) {
                    if (i == 1) {
                        t = (T) c28771i22.f110660i;
                        c49292tX5 = (C49292tX5) c28771i22.f110659h;
                        try {
                            ResultKt.throwOnFailure(obj2);
                        } catch (Throwable th) {
                            th = th;
                            c49292tX5.m12110z(null);
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj2);
                    Float f = m12126j().get(t);
                    if (f != null) {
                        try {
                            InterfaceC51412x61 interfaceC51412x61 = this.f110640m;
                            C28772j c28772j = new C28772j(this, t, f, null);
                            c28771i22.f110659h = this;
                            c28771i22.f110660i = t;
                            c28771i22.f110663l = 1;
                            if (InterfaceC51412x61.m5847c(interfaceC51412x61, null, c28772j, c28771i22, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c49292tX5 = this;
                        } catch (Throwable th2) {
                            th = th2;
                            c49292tX5 = this;
                            c49292tX5.m12110z(null);
                            throw th;
                        }
                    } else {
                        m12142A(t);
                        return Unit.INSTANCE;
                    }
                }
                c49292tX5.m12142A(t);
                c49292tX5.m12110z(null);
                return Unit.INSTANCE;
            }
        }
        c28771i = new C28771i(this, continuation);
        C28771i c28771i222 = c28771i;
        Object obj22 = c28771i222.f110661j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c28771i222.f110663l;
        if (i == 0) {
        }
        c49292tX5.m12142A(t);
        c49292tX5.m12110z(null);
        return Unit.INSTANCE;
    }

    /* renamed from: G */
    public final boolean m12136G(Map<T, Float> newAnchors) {
        boolean z;
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        boolean isEmpty = m12126j().isEmpty();
        m12111y(newAnchors);
        if (isEmpty) {
            Float f = m12126j().get(m12122n());
            if (f != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m12139D(f);
            }
        } else {
            z = true;
        }
        if (z && isEmpty) {
            return false;
        }
        return true;
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:666)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:524)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:282)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:252)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:365)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0106 A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m12130f(T r18, float r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C49292tX5.m12130f(java.lang.Object, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: h */
    public final T m12128h(float f, T t, float f2) {
        Object m14075a;
        Object value;
        Object value2;
        Map<T, Float> m12126j = m12126j();
        Float f3 = m12126j.get(t);
        InterfaceC41273g01 m12113w = m12113w();
        float mo3411T0 = m12113w.mo3411T0(this.f110631d);
        if (!Intrinsics.areEqual(f3, f) && f3 != null) {
            if (f3.floatValue() < f) {
                if (f2 >= mo3411T0) {
                    return (T) C48699sX5.m14075a(m12126j, f, true);
                }
                m14075a = C48699sX5.m14075a(m12126j, f, true);
                value2 = MapsKt__MapsKt.getValue(m12126j, m14075a);
                if (f < Math.abs(f3.floatValue() + Math.abs(this.f110630c.invoke(m12113w, Float.valueOf(Math.abs(((Number) value2).floatValue() - f3.floatValue()))).floatValue()))) {
                    return t;
                }
            } else if (f2 <= (-mo3411T0)) {
                return (T) C48699sX5.m14075a(m12126j, f, false);
            } else {
                m14075a = C48699sX5.m14075a(m12126j, f, false);
                float floatValue = f3.floatValue();
                value = MapsKt__MapsKt.getValue(m12126j, m14075a);
                float abs = Math.abs(f3.floatValue() - Math.abs(this.f110630c.invoke(m12113w, Float.valueOf(Math.abs(floatValue - ((Number) value).floatValue()))).floatValue()));
                if (f < 0.0f) {
                    if (Math.abs(f) < abs) {
                        return t;
                    }
                } else if (f > abs) {
                    return t;
                }
            }
            return (T) m14075a;
        }
        return t;
    }

    /* renamed from: i */
    public final float m12127i(float f) {
        float f2;
        float coerceIn;
        Float m12117s = m12117s();
        if (m12117s != null) {
            f2 = m12117s.floatValue();
        } else {
            f2 = 0.0f;
        }
        coerceIn = RangesKt___RangesKt.coerceIn(f + f2, m12118r(), m12119q());
        float f3 = coerceIn - f2;
        if (Math.abs(f3) > 0.0f) {
            this.f110640m.mo5848b(f3);
        }
        return f3;
    }

    /* renamed from: j */
    public final Map<T, Float> m12126j() {
        return (Map) this.f110641n.getValue();
    }

    /* renamed from: k */
    public final InterfaceC25753lf<Float> m12125k() {
        return this.f110628a;
    }

    /* renamed from: l */
    public final T m12124l() {
        return this.f110639l.getValue();
    }

    /* renamed from: m */
    public final Function1<T, Boolean> m12123m() {
        return this.f110629b;
    }

    /* renamed from: n */
    public final T m12122n() {
        return this.f110632e.getValue();
    }

    /* renamed from: o */
    public final InterfaceC51412x61 m12121o() {
        return this.f110640m;
    }

    /* renamed from: p */
    public final float m12120p() {
        return ((Number) this.f110636i.getValue()).floatValue();
    }

    /* renamed from: q */
    public final float m12119q() {
        return ((Number) this.f110638k.getValue()).floatValue();
    }

    /* renamed from: r */
    public final float m12118r() {
        return ((Number) this.f110637j.getValue()).floatValue();
    }

    /* renamed from: s */
    public final Float m12117s() {
        return (Float) this.f110634g.getValue();
    }

    /* renamed from: t */
    public final T m12116t() {
        return (T) this.f110633f.getValue();
    }

    /* renamed from: u */
    public final boolean m12115u(T t) {
        return m12126j().containsKey(t);
    }

    /* renamed from: v */
    public final boolean m12114v() {
        return m12124l() != null;
    }

    /* renamed from: w */
    public final InterfaceC41273g01 m12113w() {
        InterfaceC41273g01 interfaceC41273g01 = this.f110642o;
        if (interfaceC41273g01 != null) {
            return interfaceC41273g01;
        }
        throw new IllegalArgumentException(("SwipeableState did not have a density attached. Are you using Modifier.swipeable with this=" + this + " SwipeableState?").toString());
    }

    /* renamed from: x */
    public final float m12112x() {
        Float m12117s = m12117s();
        if (m12117s != null) {
            return m12117s.floatValue();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    /* renamed from: y */
    public final void m12111y(Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f110641n.setValue(map);
    }

    /* renamed from: z */
    public final void m12110z(T t) {
        this.f110639l.setValue(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49292tX5(T t, InterfaceC25753lf<Float> interfaceC25753lf, Function1<? super T, Boolean> function1, Function2<? super InterfaceC41273g01, ? super Float, Float> function2, float f) {
        EX2 m97025e;
        EX2 m97025e2;
        EX2 m97025e3;
        EX2 m97025e4;
        Map emptyMap;
        EX2 m97025e5;
        this.f110628a = interfaceC25753lf;
        this.f110629b = function1;
        this.f110630c = function2;
        this.f110631d = f;
        m97025e = LM5.m97025e(t, null, 2, null);
        this.f110632e = m97025e;
        this.f110633f = GM5.m105204c(new C28773k(this));
        m97025e2 = LM5.m97025e(null, null, 2, null);
        this.f110634g = m97025e2;
        this.f110635h = GM5.m105204c(new C28770h(this));
        m97025e3 = LM5.m97025e(Float.valueOf(0.0f), null, 2, null);
        this.f110636i = m97025e3;
        this.f110637j = GM5.m105204c(new C28769g(this));
        this.f110638k = GM5.m105204c(new C28768f(this));
        m97025e4 = LM5.m97025e(null, null, 2, null);
        this.f110639l = m97025e4;
        this.f110640m = C50819w61.m7441a(new C28767e(this));
        emptyMap = MapsKt__MapsKt.emptyMap();
        m97025e5 = LM5.m97025e(emptyMap, null, 2, null);
        this.f110641n = m97025e5;
    }

    public /* synthetic */ C49292tX5(Object obj, InterfaceC25753lf interfaceC25753lf, Function1 function1, Function2<InterfaceC41273g01, Float, Float> function2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? C48107rX5.f107247a.m15808a() : interfaceC25753lf, (i & 4) != 0 ? C28762a.f110643g : function1, (i & 8) != 0 ? C48107rX5.f107247a.m15807b() : function2, (i & 16) != 0 ? C48107rX5.f107247a.m15806c() : f, null);
    }
}
