package p000;

import androidx.compose.p003ui.draw.C11289a;
import androidx.compose.p003ui.graphics.C11327b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import p000.C32120Ce3;
import p000.InterfaceC41563gV2;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b3\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0013\u001a\u00020\u0012*\u00020\u0012H\u0003J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010)\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010*R$\u00100\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00128\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010/R\u0016\u00101\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0011\u00102\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b-\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, m28432d2 = {"LQ06;", "LPv4;", "LVr5;", "selectionRegistrar", "", "l", "LT06;", "textDelegate", "k", "onRemembered", "onForgotten", "onAbandoned", "LCe3;", "start", "end", "", "i", "(JJ)Z", "LgV2;", DateTokenConverter.CONVERTER_KEY, "LDf;", Entry.TYPE_TEXT, "c", "LF26;", "b", "LF26;", "h", "()LF26;", TransferTable.COLUMN_STATE, "LVr5;", "LZ06;", "LZ06;", "e", "()LZ06;", "j", "(LZ06;)V", "longPressDragObserver", "LxO2;", "LxO2;", "f", "()LxO2;", "measurePolicy", "LgV2;", "coreModifiers", "<set-?>", "g", "getSemanticsModifier$foundation_release", "()LgV2;", "semanticsModifier", "selectionModifiers", "modifiers", "<init>", "(LF26;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n1#2:703\n*E\n"})
/* renamed from: Q06 */
/* loaded from: classes.dex */
public final class Q06 implements InterfaceC35316Pv4 {

    /* renamed from: b */
    public final F26 f29625b;

    /* renamed from: c */
    public InterfaceC36685Vr5 f29626c;

    /* renamed from: d */
    public Z06 f29627d;

    /* renamed from: e */
    public final InterfaceC51579xO2 f29628e;

    /* renamed from: f */
    public final InterfaceC41563gV2 f29629f;

    /* renamed from: g */
    public InterfaceC41563gV2 f29630g;

    /* renamed from: h */
    public InterfaceC41563gV2 f29631h;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lnm2;", "it", "", "invoke", "(Lnm2;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Q06$a */
    /* loaded from: classes.dex */
    public static final class C6619a extends Lambda implements Function1<InterfaceC45879nm2, Unit> {
        public C6619a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC45879nm2 interfaceC45879nm2) {
            invoke2(interfaceC45879nm2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC45879nm2 it) {
            InterfaceC36685Vr5 interfaceC36685Vr5;
            Intrinsics.checkNotNullParameter(it, "it");
            Q06.this.m89144h().m108074k(it);
            if (C36919Wr5.m77781b(Q06.this.f29626c, Q06.this.m89144h().m108077h())) {
                long m20515f = C46472om2.m20515f(it);
                if (!C32120Ce3.m111947l(m20515f, Q06.this.m89144h().m108079f()) && (interfaceC36685Vr5 = Q06.this.f29626c) != null) {
                    interfaceC36685Vr5.m79337c(Q06.this.m89144h().m108077h());
                }
                Q06.this.m89144h().m108070o(m20515f);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lss5;", "", "invoke", "(Lss5;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Q06$b */
    /* loaded from: classes.dex */
    public static final class C6620b extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C1577Df f29633g;

        /* renamed from: h */
        public final /* synthetic */ Q06 f29634h;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Li26;", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Q06$b$a */
        /* loaded from: classes.dex */
        public static final class C6621a extends Lambda implements Function1<List<C42484i26>, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ Q06 f29635g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6621a(Q06 q06) {
                super(1);
                this.f29635g = q06;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(List<C42484i26> it) {
                boolean z;
                Intrinsics.checkNotNullParameter(it, "it");
                if (this.f29635g.m89144h().m108081d() != null) {
                    C42484i26 m108081d = this.f29635g.m89144h().m108081d();
                    Intrinsics.checkNotNull(m108081d);
                    it.add(m108081d);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6620b(C1577Df c1577Df, Q06 q06) {
            super(1);
            this.f29633g = c1577Df;
            this.f29634h = q06;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            C47128ps5.m18604V(semantics, this.f29633g);
            C47128ps5.m18584o(semantics, null, new C6621a(this.f29634h), 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LI61;", "", "invoke", "(LI61;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$drawTextAndSelectionBehind$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,702:1\n214#2,8:703\n261#2,11:711\n245#2:722\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$drawTextAndSelectionBehind$1\n*L\n463#1:703,8\n463#1:711,11\n469#1:722\n*E\n"})
    /* renamed from: Q06$c */
    /* loaded from: classes.dex */
    public static final class C6622c extends Lambda implements Function1<I61, Unit> {
        public C6622c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(I61 i61) {
            invoke2(i61);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(I61 drawBehind) {
            Map<Long, C34813Nr5> m79333g;
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            C42484i26 m108081d = Q06.this.m89144h().m108081d();
            if (m108081d != null) {
                Q06 q06 = Q06.this;
                q06.m89144h().m108084a();
                InterfaceC36685Vr5 interfaceC36685Vr5 = q06.f29626c;
                C34813Nr5 c34813Nr5 = (interfaceC36685Vr5 == null || (m79333g = interfaceC36685Vr5.m79333g()) == null) ? null : m79333g.get(Long.valueOf(q06.m89144h().m108077h()));
                InterfaceC32941Fr5 m108078g = q06.m89144h().m108078g();
                if (m108078g != null) {
                    m108078g.mo42809a();
                }
                if (c34813Nr5 != null) {
                    if (!c34813Nr5.m93278b()) {
                        c34813Nr5.m93277c();
                        throw null;
                    } else {
                        c34813Nr5.m93279a();
                        throw null;
                    }
                }
                T06.f34610l.m84429a(drawBehind.mo20750d0().mo20724a(), m108081d);
            }
        }
    }

    @Metadata(m28433d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0011\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016J\"\u0010\u0012\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, m28432d2 = {"Q06$d", "LxO2;", "LzO2;", "", "LvO2;", "measurables", "Lkz0;", "constraints", "LyO2;", C17296a.f69688o, "(LzO2;Ljava/util/List;J)LyO2;", "LZ62;", "LX62;", "", "height", "c", "width", "e", "b", DateTokenConverter.CONVERTER_KEY, "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$measurePolicy$1\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n80#2,3:703\n83#2:710\n84#2:712\n85#2:714\n69#3,4:706\n74#3:713\n1#4:711\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$measurePolicy$1\n*L\n343#1:703,3\n343#1:710\n343#1:712\n343#1:714\n343#1:706,4\n343#1:713\n343#1:711\n*E\n"})
    /* renamed from: Q06$d */
    /* loaded from: classes.dex */
    public static final class C6623d implements InterfaceC51579xO2 {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$measurePolicy$1$measure$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,702:1\n33#2,6:703\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$measurePolicy$1$measure$2\n*L\n378#1:703,6\n*E\n"})
        /* renamed from: Q06$d$a */
        /* loaded from: classes.dex */
        public static final class C6624a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public final /* synthetic */ List<Pair<OU3, A52>> f29638g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C6624a(List<? extends Pair<? extends OU3, A52>> list) {
                super(1);
                this.f29638g = list;
            }

            /* renamed from: a */
            public final void m89139a(OU3.AbstractC6015a layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                List<Pair<OU3, A52>> list = this.f29638g;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Pair<OU3, A52> pair = list.get(i);
                    OU3.AbstractC6015a.m92207p(layout, pair.component1(), pair.component2().m116107n(), 0.0f, 2, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m89139a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        public C6623d() {
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: a */
        public InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 measure, List<? extends InterfaceC50393vO2> measurables, long j) {
            boolean z;
            int roundToInt;
            int roundToInt2;
            Map<AbstractC4750L9, Integer> mapOf;
            int i;
            Pair pair;
            int roundToInt3;
            int roundToInt4;
            InterfaceC36685Vr5 interfaceC36685Vr5;
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            Q06.this.m89144h().m108082c();
            C42484i26 m108081d = Q06.this.m89144h().m108081d();
            C42484i26 m84433m = Q06.this.m89144h().m108076i().m84433m(j, measure.getLayoutDirection(), m108081d);
            if (!Intrinsics.areEqual(m108081d, m84433m)) {
                Q06.this.m89144h().m108080e().invoke(m84433m);
                if (m108081d != null) {
                    Q06 q06 = Q06.this;
                    if (!Intrinsics.areEqual(m108081d.m34597k().m40259j(), m84433m.m34597k().m40259j()) && (interfaceC36685Vr5 = q06.f29626c) != null) {
                        interfaceC36685Vr5.m79331i(q06.m89144h().m108077h());
                    }
                }
            }
            Q06.this.m89144h().m108072m(m84433m);
            if (measurables.size() >= m84433m.m34582z().size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                List<C35055Os4> m34582z = m84433m.m34582z();
                ArrayList arrayList = new ArrayList(m34582z.size());
                int size = m34582z.size();
                int i2 = 0;
                while (i2 < size) {
                    C35055Os4 c35055Os4 = m34582z.get(i2);
                    if (c35055Os4 != null) {
                        i = size;
                        OU3 mo8763P0 = measurables.get(i2).mo8763P0(C46007nz0.m22042b(0, (int) Math.floor(c35055Os4.m91252o()), 0, (int) Math.floor(c35055Os4.m91259h()), 5, null));
                        roundToInt3 = MathKt__MathJVMKt.roundToInt(c35055Os4.m91258i());
                        roundToInt4 = MathKt__MathJVMKt.roundToInt(c35055Os4.m91255l());
                        pair = new Pair(mo8763P0, A52.m116119b(B52.m114704a(roundToInt3, roundToInt4)));
                    } else {
                        i = size;
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i2++;
                    size = i;
                }
                int m105829g = G52.m105829g(m84433m.m34609A());
                int m105830f = G52.m105830f(m84433m.m34609A());
                YM1 m94314a = C5482N9.m94314a();
                roundToInt = MathKt__MathJVMKt.roundToInt(m84433m.m34601g());
                YM1 m94313b = C5482N9.m94313b();
                roundToInt2 = MathKt__MathJVMKt.roundToInt(m84433m.m34598j());
                mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(m94314a, Integer.valueOf(roundToInt)), TuplesKt.m28425to(m94313b, Integer.valueOf(roundToInt2)));
                return measure.mo1431O0(m105829g, m105830f, mapOf, new C6624a(arrayList));
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: b */
        public int mo5313b(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            Q06.this.m89144h().m108076i().m84431o(z62.getLayoutDirection());
            return Q06.this.m89144h().m108076i().m84443c();
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: c */
        public int mo5312c(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            Q06.this.m89144h().m108076i().m84431o(z62.getLayoutDirection());
            return Q06.this.m89144h().m108076i().m84441e();
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: d */
        public int mo5311d(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return G52.m105830f(T06.m84432n(Q06.this.m89144h().m108076i(), C46007nz0.m22043a(0, i, 0, Integer.MAX_VALUE), z62.getLayoutDirection(), null, 4, null).m34609A());
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: e */
        public int mo5310e(Z62 z62, List<? extends X62> measurables, int i) {
            Intrinsics.checkNotNullParameter(z62, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return G52.m105830f(T06.m84432n(Q06.this.m89144h().m108076i(), C46007nz0.m22043a(0, i, 0, Integer.MAX_VALUE), z62.getLayoutDirection(), null, 4, null).m34609A());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lnm2;", "b", "()Lnm2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Q06$e */
    /* loaded from: classes.dex */
    public static final class C6625e extends Lambda implements Function0<InterfaceC45879nm2> {
        public C6625e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC45879nm2 invoke() {
            return Q06.this.m89144h().m108083b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Li26;", "b", "()Li26;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Q06$f */
    /* loaded from: classes.dex */
    public static final class C6626f extends Lambda implements Function0<C42484i26> {
        public C6626f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C42484i26 invoke() {
            return Q06.this.m89144h().m108081d();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R+\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006R+\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0006\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0016"}, m28432d2 = {"Q06$g", "LZ06;", "LCe3;", "point", "", "b", "(J)V", "e", "startPoint", DateTokenConverter.CONVERTER_KEY, "delta", "c", "onStop", C17296a.f69688o, "J", "getLastPosition", "()J", "setLastPosition", "lastPosition", "getDragTotalDistance", "setDragTotalDistance", "dragTotalDistance", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Q06$g */
    /* loaded from: classes.dex */
    public static final class C6627g implements Z06 {

        /* renamed from: a */
        public long f29641a;

        /* renamed from: b */
        public long f29642b;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC36685Vr5 f29644d;

        public C6627g(InterfaceC36685Vr5 interfaceC36685Vr5) {
            this.f29644d = interfaceC36685Vr5;
            C32120Ce3.C1110a c1110a = C32120Ce3.f4427b;
            this.f29641a = c1110a.m111932c();
            this.f29642b = c1110a.m111932c();
        }

        @Override // p000.Z06
        /* renamed from: a */
        public void mo5922a() {
            if (C36919Wr5.m77781b(this.f29644d, Q06.this.m89144h().m108077h())) {
                this.f29644d.m79335e();
            }
        }

        @Override // p000.Z06
        /* renamed from: b */
        public void mo5921b(long j) {
        }

        @Override // p000.Z06
        /* renamed from: c */
        public void mo5920c(long j) {
            InterfaceC45879nm2 m108083b = Q06.this.m89144h().m108083b();
            if (m108083b != null) {
                InterfaceC36685Vr5 interfaceC36685Vr5 = this.f29644d;
                Q06 q06 = Q06.this;
                if (!m108083b.mo23189F() || !C36919Wr5.m77781b(interfaceC36685Vr5, q06.m89144h().m108077h())) {
                    return;
                }
                long m111939t = C32120Ce3.m111939t(this.f29642b, j);
                this.f29642b = m111939t;
                long m111939t2 = C32120Ce3.m111939t(this.f29641a, m111939t);
                if (!q06.m89143i(this.f29641a, m111939t2) && interfaceC36685Vr5.m79339a(m108083b, m111939t2, this.f29641a, false, InterfaceC35281Pr5.f29167a.m89692d())) {
                    this.f29641a = m111939t2;
                    this.f29642b = C32120Ce3.f4427b.m111932c();
                }
            }
        }

        @Override // p000.Z06
        /* renamed from: d */
        public void mo5919d(long j) {
            InterfaceC45879nm2 m108083b = Q06.this.m89144h().m108083b();
            if (m108083b != null) {
                Q06 q06 = Q06.this;
                InterfaceC36685Vr5 interfaceC36685Vr5 = this.f29644d;
                if (!m108083b.mo23189F()) {
                    return;
                }
                if (q06.m89143i(j, j)) {
                    interfaceC36685Vr5.m79330j(q06.m89144h().m108077h());
                } else {
                    interfaceC36685Vr5.m79338b(m108083b, j, InterfaceC35281Pr5.f29167a.m89689g());
                }
                this.f29641a = j;
            }
            if (!C36919Wr5.m77781b(this.f29644d, Q06.this.m89144h().m108077h())) {
                return;
            }
            this.f29642b = C32120Ce3.f4427b.m111932c();
        }

        @Override // p000.Z06
        /* renamed from: e */
        public void mo5918e() {
        }

        @Override // p000.Z06
        public void onStop() {
            if (C36919Wr5.m77781b(this.f29644d, Q06.this.m89144h().m108077h())) {
                this.f29644d.m79335e();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LtX3;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.text.TextController$update$2", m28418f = "CoreText.kt", m28417i = {}, m28416l = {192}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Q06$h */
    /* loaded from: classes.dex */
    public static final class C6628h extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f29645h;

        /* renamed from: i */
        public /* synthetic */ Object f29646i;

        public C6628h(Continuation<? super C6628h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C6628h c6628h = new C6628h(continuation);
            c6628h.f29646i = obj;
            return c6628h;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
            return ((C6628h) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f29645h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Z06 m89147e = Q06.this.m89147e();
                this.f29645h = 1;
                if (C44230kz2.m28049d((InterfaceC49290tX3) this.f29646i, m89147e, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LtX3;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.text.TextController$update$3", m28418f = "CoreText.kt", m28417i = {}, m28416l = {283}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Q06$i */
    /* loaded from: classes.dex */
    public static final class C6629i extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f29648h;

        /* renamed from: i */
        public /* synthetic */ Object f29649i;

        /* renamed from: j */
        public final /* synthetic */ C6630j f29650j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6629i(C6630j c6630j, Continuation<? super C6629i> continuation) {
            super(2, continuation);
            this.f29650j = c6630j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C6629i c6629i = new C6629i(this.f29650j, continuation);
            c6629i.f29649i = obj;
            return c6629i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
            return ((C6629i) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f29648h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C6630j c6630j = this.f29650j;
                this.f29648h = 1;
                if (E26.m109481c((InterfaceC49290tX3) this.f29649i, c6630j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\fR+\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, m28432d2 = {"Q06$j", "LgW2;", "LCe3;", "downPosition", "", DateTokenConverter.CONVERTER_KEY, "(J)Z", "dragPosition", "c", "LPr5;", "adjustment", C17296a.f69688o, "(JLPr5;)Z", "b", "J", "getLastPosition", "()J", "setLastPosition", "(J)V", "lastPosition", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Q06$j */
    /* loaded from: classes.dex */
    public static final class C6630j implements InterfaceC41572gW2 {

        /* renamed from: a */
        public long f29651a = C32120Ce3.f4427b.m111932c();

        /* renamed from: c */
        public final /* synthetic */ InterfaceC36685Vr5 f29653c;

        public C6630j(InterfaceC36685Vr5 interfaceC36685Vr5) {
            this.f29653c = interfaceC36685Vr5;
        }

        @Override // p000.InterfaceC41572gW2
        /* renamed from: a */
        public boolean mo5926a(long j, InterfaceC35281Pr5 adjustment) {
            Intrinsics.checkNotNullParameter(adjustment, "adjustment");
            InterfaceC45879nm2 m108083b = Q06.this.m89144h().m108083b();
            if (m108083b == null) {
                return false;
            }
            InterfaceC36685Vr5 interfaceC36685Vr5 = this.f29653c;
            Q06 q06 = Q06.this;
            if (!m108083b.mo23189F()) {
                return false;
            }
            interfaceC36685Vr5.m79338b(m108083b, j, adjustment);
            this.f29651a = j;
            return C36919Wr5.m77781b(interfaceC36685Vr5, q06.m89144h().m108077h());
        }

        @Override // p000.InterfaceC41572gW2
        /* renamed from: b */
        public boolean mo5925b(long j, InterfaceC35281Pr5 adjustment) {
            Intrinsics.checkNotNullParameter(adjustment, "adjustment");
            InterfaceC45879nm2 m108083b = Q06.this.m89144h().m108083b();
            if (m108083b != null) {
                InterfaceC36685Vr5 interfaceC36685Vr5 = this.f29653c;
                Q06 q06 = Q06.this;
                if (!m108083b.mo23189F() || !C36919Wr5.m77781b(interfaceC36685Vr5, q06.m89144h().m108077h())) {
                    return false;
                }
                if (interfaceC36685Vr5.m79339a(m108083b, j, this.f29651a, false, adjustment)) {
                    this.f29651a = j;
                }
            }
            return true;
        }

        @Override // p000.InterfaceC41572gW2
        /* renamed from: c */
        public boolean mo5924c(long j) {
            InterfaceC45879nm2 m108083b = Q06.this.m89144h().m108083b();
            if (m108083b != null) {
                InterfaceC36685Vr5 interfaceC36685Vr5 = this.f29653c;
                Q06 q06 = Q06.this;
                if (!m108083b.mo23189F() || !C36919Wr5.m77781b(interfaceC36685Vr5, q06.m89144h().m108077h())) {
                    return false;
                }
                if (interfaceC36685Vr5.m79339a(m108083b, j, this.f29651a, false, InterfaceC35281Pr5.f29167a.m89691e())) {
                    this.f29651a = j;
                    return true;
                }
                return true;
            }
            return true;
        }

        @Override // p000.InterfaceC41572gW2
        /* renamed from: d */
        public boolean mo5923d(long j) {
            InterfaceC45879nm2 m108083b = Q06.this.m89144h().m108083b();
            if (m108083b == null) {
                return false;
            }
            InterfaceC36685Vr5 interfaceC36685Vr5 = this.f29653c;
            Q06 q06 = Q06.this;
            if (!m108083b.mo23189F()) {
                return false;
            }
            if (interfaceC36685Vr5.m79339a(m108083b, j, this.f29651a, false, InterfaceC35281Pr5.f29167a.m89691e())) {
                this.f29651a = j;
            }
            return C36919Wr5.m77781b(interfaceC36685Vr5, q06.m89144h().m108077h());
        }
    }

    public Q06(F26 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f29625b = state;
        this.f29628e = new C6623d();
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        this.f29629f = C36116Tg3.m83186a(m89148d(c20912a), new C6619a());
        this.f29630g = m89149c(state.m108076i().m84434l());
        this.f29631h = c20912a;
    }

    /* renamed from: c */
    public final InterfaceC41563gV2 m89149c(C1577Df c1577Df) {
        return C41198fs5.m40620b(InterfaceC41563gV2.f82354b0, false, new C6620b(c1577Df, this), 1, null);
    }

    /* renamed from: d */
    public final InterfaceC41563gV2 m89148d(InterfaceC41563gV2 interfaceC41563gV2) {
        return C11289a.m68867a(C11327b.m68712c(interfaceC41563gV2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null), new C6622c());
    }

    /* renamed from: e */
    public final Z06 m89147e() {
        Z06 z06 = this.f29627d;
        if (z06 != null) {
            return z06;
        }
        Intrinsics.throwUninitializedPropertyAccessException("longPressDragObserver");
        return null;
    }

    /* renamed from: f */
    public final InterfaceC51579xO2 m89146f() {
        return this.f29628e;
    }

    /* renamed from: g */
    public final InterfaceC41563gV2 m89145g() {
        return EI1.m109243b(this.f29629f, this.f29625b.m108076i().m84435k(), this.f29625b.m108076i().m84440f(), 0, 4, null).mo39266t0(this.f29630g).mo39266t0(this.f29631h);
    }

    /* renamed from: h */
    public final F26 m89144h() {
        return this.f29625b;
    }

    /* renamed from: i */
    public final boolean m89143i(long j, long j2) {
        C42484i26 m108081d = this.f29625b.m108081d();
        if (m108081d == null) {
            return false;
        }
        int length = m108081d.m34597k().m40259j().m110052j().length();
        int m34585w = m108081d.m34585w(j);
        int m34585w2 = m108081d.m34585w(j2);
        int i = length - 1;
        if ((m34585w < i || m34585w2 < i) && (m34585w >= 0 || m34585w2 >= 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void m89142j(Z06 z06) {
        Intrinsics.checkNotNullParameter(z06, "<set-?>");
        this.f29627d = z06;
    }

    /* renamed from: k */
    public final void m89141k(T06 textDelegate) {
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        if (this.f29625b.m108076i() == textDelegate) {
            return;
        }
        this.f29625b.m108067r(textDelegate);
        this.f29630g = m89149c(this.f29625b.m108076i().m84434l());
    }

    /* renamed from: l */
    public final void m89140l(InterfaceC36685Vr5 interfaceC36685Vr5) {
        InterfaceC41563gV2 interfaceC41563gV2;
        this.f29626c = interfaceC36685Vr5;
        if (interfaceC36685Vr5 != null) {
            if (Y56.m75752a()) {
                m89142j(new C6627g(interfaceC36685Vr5));
                interfaceC41563gV2 = C52840zW5.m1270c(InterfaceC41563gV2.f82354b0, m89147e(), new C6628h(null));
            } else {
                C6630j c6630j = new C6630j(interfaceC36685Vr5);
                interfaceC41563gV2 = C40989fX3.m41252b(C52840zW5.m1270c(InterfaceC41563gV2.f82354b0, c6630j, new C6629i(c6630j, null)), C47228q26.m18273a(), false, 2, null);
            }
        } else {
            interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
        }
        this.f29631h = interfaceC41563gV2;
    }

    @Override // p000.InterfaceC35316Pv4
    public void onAbandoned() {
        InterfaceC36685Vr5 interfaceC36685Vr5;
        InterfaceC32941Fr5 m108078g = this.f29625b.m108078g();
        if (m108078g == null || (interfaceC36685Vr5 = this.f29626c) == null) {
            return;
        }
        interfaceC36685Vr5.m79332h(m108078g);
    }

    @Override // p000.InterfaceC35316Pv4
    public void onForgotten() {
        InterfaceC36685Vr5 interfaceC36685Vr5;
        InterfaceC32941Fr5 m108078g = this.f29625b.m108078g();
        if (m108078g == null || (interfaceC36685Vr5 = this.f29626c) == null) {
            return;
        }
        interfaceC36685Vr5.m79332h(m108078g);
    }

    @Override // p000.InterfaceC35316Pv4
    public void onRemembered() {
        InterfaceC36685Vr5 interfaceC36685Vr5 = this.f29626c;
        if (interfaceC36685Vr5 != null) {
            F26 f26 = this.f29625b;
            f26.m108069p(interfaceC36685Vr5.m79336d(new C40395eX2(f26.m108077h(), new C6625e(), new C6626f())));
        }
    }
}
