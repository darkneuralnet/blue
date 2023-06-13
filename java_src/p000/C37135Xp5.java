package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u0000 82\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u00106\u001a\u00020\u0010¢\u0006\u0004\b7\u0010\u0017JD\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010 \u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0013R\u0016\u0010&\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0012\u0010-R\u001b\u00100\u001a\u00020*8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b'\u0010-R$\u00104\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00108F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R\u0014\u00105\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, m28432d2 = {"LXp5;", "Laq5;", "LOX2;", "scrollPriority", "Lkotlin/Function2;", "LWp5;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(LOX2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "b", "", "<set-?>", C17296a.f69688o, "LEX2;", "m", "()I", "o", "(I)V", "value", "getViewportSize$foundation_release", "p", "viewportSize", "LrX2;", "LrX2;", "k", "()LrX2;", "internalInteractionSource", "LEX2;", DateTokenConverter.CONVERTER_KEY, "_maxValueState", "e", "F", "accumulator", "f", "Laq5;", "scrollableState", "", "g", "LsP5;", "()Z", "canScrollForward", "h", "canScrollBackward", "newMax", "l", "n", "maxValue", "isScrollInProgress", "initial", "<init>", "i", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,410:1\n76#2:411\n102#2,2:412\n76#2:414\n102#2,2:415\n76#2:417\n76#2:418\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n*L\n96#1:411\n96#1:412,2\n114#1:414\n114#1:415,2\n157#1:417\n159#1:418\n*E\n"})
/* renamed from: Xp5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37135Xp5 implements InterfaceC38196aq5 {

    /* renamed from: i */
    public static final C9525c f44028i = new C9525c(null);

    /* renamed from: j */
    public static final InterfaceC35668Ri5<C37135Xp5, ?> f44029j = C35902Si5.m85006a(C9523a.f44038g, C9524b.f44039g);

    /* renamed from: a */
    public final EX2 f44030a;

    /* renamed from: e */
    public float f44034e;

    /* renamed from: b */
    public final EX2 f44031b = GM5.m105200g(0, GM5.m105191p());

    /* renamed from: c */
    public final InterfaceC48104rX2 f44032c = C40741f62.m42091a();

    /* renamed from: d */
    public EX2<Integer> f44033d = GM5.m105200g(Integer.MAX_VALUE, GM5.m105191p());

    /* renamed from: f */
    public final InterfaceC38196aq5 f44035f = C38789bq5.m62556a(new C9528f());

    /* renamed from: g */
    public final InterfaceC48627sP5 f44036g = GM5.m105204c(new C9527e());

    /* renamed from: h */
    public final InterfaceC48627sP5 f44037h = GM5.m105204c(new C9526d());

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LXp5;", "it", "", C17296a.f69688o, "(LTi5;LXp5;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xp5$a */
    /* loaded from: classes.dex */
    public static final class C9523a extends Lambda implements Function2<InterfaceC36136Ti5, C37135Xp5, Integer> {

        /* renamed from: g */
        public static final C9523a f44038g = new C9523a();

        public C9523a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Integer invoke(InterfaceC36136Ti5 Saver, C37135Xp5 it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.m76237m());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "LXp5;", "b", "(I)LXp5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xp5$b */
    /* loaded from: classes.dex */
    public static final class C9524b extends Lambda implements Function1<Integer, C37135Xp5> {

        /* renamed from: g */
        public static final C9524b f44039g = new C9524b();

        public C9524b() {
            super(1);
        }

        /* renamed from: b */
        public final C37135Xp5 m76232b(int i) {
            return new C37135Xp5(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C37135Xp5 invoke(Integer num) {
            return m76232b(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR!\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LXp5$c;", "", "LRi5;", "LXp5;", "Saver", "LRi5;", C17296a.f69688o, "()LRi5;", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Xp5$c */
    /* loaded from: classes.dex */
    public static final class C9525c {
        public /* synthetic */ C9525c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC35668Ri5<C37135Xp5, ?> m76231a() {
            return C37135Xp5.f44029j;
        }

        private C9525c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xp5$d */
    /* loaded from: classes.dex */
    public static final class C9526d extends Lambda implements Function0<Boolean> {
        public C9526d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C37135Xp5.this.m76237m() > 0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xp5$e */
    /* loaded from: classes.dex */
    public static final class C9527e extends Lambda implements Function0<Boolean> {
        public C9527e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C37135Xp5.this.m76237m() < C37135Xp5.this.m76238l());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xp5$f */
    /* loaded from: classes.dex */
    public static final class C9528f extends Lambda implements Function1<Float, Float> {
        public C9528f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }

        public final Float invoke(float f) {
            float coerceIn;
            int roundToInt;
            float m76237m = C37135Xp5.this.m76237m() + f + C37135Xp5.this.f44034e;
            coerceIn = RangesKt___RangesKt.coerceIn(m76237m, 0.0f, C37135Xp5.this.m76238l());
            boolean z = !(m76237m == coerceIn);
            float m76237m2 = coerceIn - C37135Xp5.this.m76237m();
            roundToInt = MathKt__MathJVMKt.roundToInt(m76237m2);
            C37135Xp5 c37135Xp5 = C37135Xp5.this;
            c37135Xp5.m76235o(c37135Xp5.m76237m() + roundToInt);
            C37135Xp5.this.f44034e = m76237m2 - roundToInt;
            if (z) {
                f = m76237m2;
            }
            return Float.valueOf(f);
        }
    }

    public C37135Xp5(int i) {
        this.f44030a = GM5.m105200g(Integer.valueOf(i), GM5.m105191p());
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: a */
    public boolean mo11049a() {
        return ((Boolean) this.f44036g.getValue()).booleanValue();
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: b */
    public float mo11048b(float f) {
        return this.f44035f.mo11048b(f);
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: c */
    public Object mo11047c(OX2 ox2, Function2<? super InterfaceC36901Wp5, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object mo11047c = this.f44035f.mo11047c(ox2, function2, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mo11047c == coroutine_suspended ? mo11047c : Unit.INSTANCE;
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: e */
    public boolean mo11046e() {
        return this.f44035f.mo11046e();
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: f */
    public boolean mo11045f() {
        return ((Boolean) this.f44037h.getValue()).booleanValue();
    }

    /* renamed from: k */
    public final InterfaceC48104rX2 m76239k() {
        return this.f44032c;
    }

    /* renamed from: l */
    public final int m76238l() {
        return this.f44033d.getValue().intValue();
    }

    /* renamed from: m */
    public final int m76237m() {
        return ((Number) this.f44030a.getValue()).intValue();
    }

    /* renamed from: n */
    public final void m76236n(int i) {
        this.f44033d.setValue(Integer.valueOf(i));
        if (m76237m() > i) {
            m76235o(i);
        }
    }

    /* renamed from: o */
    public final void m76235o(int i) {
        this.f44030a.setValue(Integer.valueOf(i));
    }

    /* renamed from: p */
    public final void m76234p(int i) {
        this.f44031b.setValue(Integer.valueOf(i));
    }
}
