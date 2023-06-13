package p000;

import androidx.compose.p003ui.platform.C11447m;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33829Jm2;
import p000.InterfaceC38566bT5;
import p000.ZS5;
@Metadata(m28433d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u000225B\u0017\u0012\u0006\u00104\u001a\u00020\u0002\u0012\u0006\u0010D\u001a\u00020<¢\u0006\u0004\b^\u0010_J/\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J7\u0010\u0013\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\"\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u0015H\u0002J+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b \u0010!J\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0015J\u0006\u0010$\u001a\u00020\u0006J(\u0010,\u001a\u00020+2\u001d\u0010*\u001a\u0019\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0%¢\u0006\u0002\b)ø\u0001\u0000J%\u0010.\u001a\u00020-2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b.\u0010/J\u0006\u00100\u001a\u00020\u0006J\u0006\u00101\u001a\u00020\u0006R\u0014\u00104\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u0010;\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010D\u001a\u00020<2\u0006\u0010=\u001a\u00020<8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0016\u0010G\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010M\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010JR\u0018\u0010Q\u001a\u00060NR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\"\u0010S\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010JR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010FR\u0016\u0010Z\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010FR\u0014\u0010]\u001a\u00020[8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\\\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006`"}, m28432d2 = {"LQm2;", "", "LJm2;", "node", "slotId", "Lkotlin/Function0;", "", "content", "y", "(LJm2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "LQm2$a;", "nodeState", "x", "LXt0;", "existing", "container", "LYt0;", "parent", "composable", "z", "(LXt0;LJm2;LYt0;Lkotlin/jvm/functions/Function2;)LXt0;", "", "index", "p", "A", "l", "from", "to", "count", "r", "", "LvO2;", "w", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "startIndex", "n", "q", "Lkotlin/Function2;", "LaT5;", "Lkz0;", "LyO2;", "Lkotlin/ExtensionFunctionType;", "block", "LxO2;", "k", "LZS5$a;", "t", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)LZS5$a;", "o", "m", C17296a.f69688o, "LJm2;", "root", "b", "LYt0;", "getCompositionContext", "()LYt0;", "u", "(LYt0;)V", "compositionContext", "LbT5;", "value", "c", "LbT5;", "getSlotReusePolicy", "()LbT5;", "v", "(LbT5;)V", "slotReusePolicy", DateTokenConverter.CONVERTER_KEY, "I", "currentIndex", "", "e", "Ljava/util/Map;", "nodeToNodeState", "f", "slotIdToNode", "LQm2$b;", "g", "LQm2$b;", Action.SCOPE_ATTRIBUTE, "h", "precomposeMap", "LbT5$a;", "i", "LbT5$a;", "reusableSlotIdsSet", "j", "reusableCount", "precomposedCount", "", "Ljava/lang/String;", "NoIntrinsicsMessage", "<init>", "(LJm2;LbT5;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,774:1\n707#1:796\n707#1:810\n707#1:826\n707#1:831\n361#2,7:775\n361#2,7:782\n361#2,7:817\n480#3,4:789\n485#3:802\n480#3,4:803\n485#3:816\n122#4,3:793\n126#4:801\n122#4,3:807\n126#4:815\n1114#5,4:797\n1114#5,4:811\n1114#5,4:827\n1114#5,4:832\n1114#5,4:836\n1114#5,2:840\n1116#5,2:844\n215#6,2:824\n1855#7,2:842\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n437#1:796\n502#1:810\n695#1:826\n701#1:831\n398#1:775,7\n424#1:782,7\n630#1:817,7\n436#1:789,4\n436#1:802\n489#1:803,4\n489#1:816\n436#1:793,3\n436#1:801\n489#1:807,3\n489#1:815\n437#1:797,4\n502#1:811,4\n695#1:827,4\n701#1:832,4\n707#1:836,4\n710#1:840,2\n710#1:844,2\n686#1:824,2\n711#1:842,2\n*E\n"})
/* renamed from: Qm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35467Qm2 {

    /* renamed from: a */
    public final C33829Jm2 f30892a;

    /* renamed from: b */
    public AbstractC37400Yt0 f30893b;

    /* renamed from: c */
    public InterfaceC38566bT5 f30894c;

    /* renamed from: d */
    public int f30895d;

    /* renamed from: e */
    public final Map<C33829Jm2, C6893a> f30896e;

    /* renamed from: f */
    public final Map<Object, C33829Jm2> f30897f;

    /* renamed from: g */
    public final C6894b f30898g;

    /* renamed from: h */
    public final Map<Object, C33829Jm2> f30899h;

    /* renamed from: i */
    public final InterfaceC38566bT5.C12396a f30900i;

    /* renamed from: j */
    public int f30901j;

    /* renamed from: k */
    public int f30902k;

    /* renamed from: l */
    public final String f30903l;

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\f\u0010\u0016\"\u0004\b\u0014\u0010\u0017R\"\u0010\u001b\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u0019\u0010\u0017¨\u0006\u001e"}, m28432d2 = {"LQm2$b;", "LaT5;", "", "slotId", "Lkotlin/Function0;", "", "content", "", "LvO2;", "q0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "Lpm2;", "b", "Lpm2;", "getLayoutDirection", "()Lpm2;", "e", "(Lpm2;)V", "layoutDirection", "", "c", "F", "()F", "(F)V", "density", DateTokenConverter.CONVERTER_KEY, "R0", "fontScale", "<init>", "(LQm2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Qm2$b */
    /* loaded from: classes.dex */
    public final class C6894b implements InterfaceC37973aT5 {

        /* renamed from: b */
        public EnumC47065pm2 f30909b = EnumC47065pm2.Rtl;

        /* renamed from: c */
        public float f30910c;

        /* renamed from: d */
        public float f30911d;

        public C6894b() {
        }

        @Override // p000.InterfaceC41273g01
        /* renamed from: R0 */
        public float mo3412R0() {
            return this.f30911d;
        }

        @Override // p000.InterfaceC41273g01
        /* renamed from: b */
        public float mo3408b() {
            return this.f30910c;
        }

        /* renamed from: c */
        public void m87951c(float f) {
            this.f30910c = f;
        }

        /* renamed from: d */
        public void m87950d(float f) {
            this.f30911d = f;
        }

        /* renamed from: e */
        public void m87949e(EnumC47065pm2 enumC47065pm2) {
            Intrinsics.checkNotNullParameter(enumC47065pm2, "<set-?>");
            this.f30909b = enumC47065pm2;
        }

        @Override // p000.Z62
        public EnumC47065pm2 getLayoutDirection() {
            return this.f30909b;
        }

        @Override // p000.InterfaceC37973aT5
        /* renamed from: q0 */
        public List<InterfaceC50393vO2> mo71334q0(Object obj, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return C35467Qm2.this.m87965w(obj, content);
        }
    }

    @Metadata(m28433d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"Qm2$c", "LJm2$f;", "LzO2;", "", "LvO2;", "measurables", "Lkz0;", "constraints", "LyO2;", C17296a.f69688o, "(LzO2;Ljava/util/List;J)LyO2;", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Qm2$c */
    /* loaded from: classes.dex */
    public static final class C6895c extends C33829Jm2.AbstractC4229f {

        /* renamed from: c */
        public final /* synthetic */ Function2<InterfaceC37973aT5, C44228kz0, InterfaceC52172yO2> f30914c;

        @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m28432d2 = {"Qm2$c$a", "LyO2;", "", "c", "", "getWidth", "()I", "width", "getHeight", "height", "", "LL9;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "alignmentLines", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Qm2$c$a */
        /* loaded from: classes.dex */
        public static final class C6896a implements InterfaceC52172yO2 {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC52172yO2 f30915a;

            /* renamed from: b */
            public final /* synthetic */ C35467Qm2 f30916b;

            /* renamed from: c */
            public final /* synthetic */ int f30917c;

            public C6896a(InterfaceC52172yO2 interfaceC52172yO2, C35467Qm2 c35467Qm2, int i) {
                this.f30915a = interfaceC52172yO2;
                this.f30916b = c35467Qm2;
                this.f30917c = i;
            }

            @Override // p000.InterfaceC52172yO2
            /* renamed from: c */
            public void mo1429c() {
                this.f30916b.f30895d = this.f30917c;
                this.f30915a.mo1429c();
                C35467Qm2 c35467Qm2 = this.f30916b;
                c35467Qm2.m87974n(c35467Qm2.f30895d);
            }

            @Override // p000.InterfaceC52172yO2
            /* renamed from: d */
            public Map<AbstractC4750L9, Integer> mo1428d() {
                return this.f30915a.mo1428d();
            }

            @Override // p000.InterfaceC52172yO2
            public int getHeight() {
                return this.f30915a.getHeight();
            }

            @Override // p000.InterfaceC52172yO2
            public int getWidth() {
                return this.f30915a.getWidth();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6895c(Function2<? super InterfaceC37973aT5, ? super C44228kz0, ? extends InterfaceC52172yO2> function2, String str) {
            super(str);
            this.f30914c = function2;
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: a */
        public InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 measure, List<? extends InterfaceC50393vO2> measurables, long j) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            C35467Qm2.this.f30898g.m87949e(measure.getLayoutDirection());
            C35467Qm2.this.f30898g.m87951c(measure.mo3408b());
            C35467Qm2.this.f30898g.m87950d(measure.mo3412R0());
            C35467Qm2.this.f30895d = 0;
            return new C6896a(this.f30914c.invoke(C35467Qm2.this.f30898g, C44228kz0.m28075b(j)), C35467Qm2.this, C35467Qm2.this.f30895d);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"Qm2$d", "LZS5$a;", "", "dispose", "", "index", "Lkz0;", "constraints", "b", "(IJ)V", C17296a.f69688o, "()I", "placeablesCount", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$1\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,774:1\n1114#2,4:775\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$1\n*L\n677#1:775,4\n*E\n"})
    /* renamed from: Qm2$d */
    /* loaded from: classes.dex */
    public static final class C6897d implements ZS5.InterfaceC10277a {

        /* renamed from: b */
        public final /* synthetic */ Object f30919b;

        public C6897d(Object obj) {
            this.f30919b = obj;
        }

        @Override // p000.ZS5.InterfaceC10277a
        /* renamed from: a */
        public int mo73078a() {
            List<C33829Jm2> m99818M;
            C33829Jm2 c33829Jm2 = (C33829Jm2) C35467Qm2.this.f30899h.get(this.f30919b);
            if (c33829Jm2 == null || (m99818M = c33829Jm2.m99818M()) == null) {
                return 0;
            }
            return m99818M.size();
        }

        @Override // p000.ZS5.InterfaceC10277a
        /* renamed from: b */
        public void mo73077b(int i, long j) {
            C33829Jm2 c33829Jm2 = (C33829Jm2) C35467Qm2.this.f30899h.get(this.f30919b);
            if (c33829Jm2 != null && c33829Jm2.m99822J0()) {
                int size = c33829Jm2.m99818M().size();
                if (i >= 0 && i < size) {
                    if (!c33829Jm2.mo8156n()) {
                        C33829Jm2 c33829Jm22 = C35467Qm2.this.f30892a;
                        c33829Jm22.f18175l = true;
                        C34765Nm2.m93440a(c33829Jm2).mo31004O(c33829Jm2.m99818M().get(i), j);
                        c33829Jm22.f18175l = false;
                        return;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + size + CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }

        @Override // p000.ZS5.InterfaceC10277a
        public void dispose() {
            boolean z;
            C35467Qm2.this.m87971q();
            C33829Jm2 c33829Jm2 = (C33829Jm2) C35467Qm2.this.f30899h.remove(this.f30919b);
            if (c33829Jm2 != null) {
                boolean z2 = false;
                if (C35467Qm2.this.f30902k > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int indexOf = C35467Qm2.this.f30892a.m99812P().indexOf(c33829Jm2);
                    if (indexOf >= C35467Qm2.this.f30892a.m99812P().size() - C35467Qm2.this.f30902k) {
                        z2 = true;
                    }
                    if (z2) {
                        C35467Qm2.this.f30901j++;
                        C35467Qm2 c35467Qm2 = C35467Qm2.this;
                        c35467Qm2.f30902k--;
                        int size = (C35467Qm2.this.f30892a.m99812P().size() - C35467Qm2.this.f30902k) - C35467Qm2.this.f30901j;
                        C35467Qm2.this.m87970r(indexOf, size, 1);
                        C35467Qm2.this.m87974n(size);
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$3$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,774:1\n169#2,9:775\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$3$1$1\n*L\n447#1:775,9\n*E\n"})
    /* renamed from: Qm2$e */
    /* loaded from: classes.dex */
    public static final class C6898e extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C6893a f30920g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f30921h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6898e(C6893a c6893a, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
            super(2);
            this.f30920g = c6893a;
            this.f30921h = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-34810602, i, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:445)");
            }
            boolean m87961a = this.f30920g.m87961a();
            Function2<InterfaceC32720Et0, Integer, Unit> function2 = this.f30921h;
            interfaceC32720Et0.mo89551j(207, Boolean.valueOf(m87961a));
            boolean mo89536o = interfaceC32720Et0.mo89536o(m87961a);
            if (m87961a) {
                function2.invoke(interfaceC32720Et0, 0);
            } else {
                interfaceC32720Et0.mo89578a(mo89536o);
            }
            interfaceC32720Et0.mo89641E();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    public C35467Qm2(C33829Jm2 root, InterfaceC38566bT5 slotReusePolicy) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(slotReusePolicy, "slotReusePolicy");
        this.f30892a = root;
        this.f30894c = slotReusePolicy;
        this.f30896e = new LinkedHashMap();
        this.f30897f = new LinkedHashMap();
        this.f30898g = new C6894b();
        this.f30899h = new LinkedHashMap();
        this.f30900i = new InterfaceC38566bT5.C12396a(null, 1, null);
        this.f30903l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* renamed from: s */
    public static /* synthetic */ void m87969s(C35467Qm2 c35467Qm2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        c35467Qm2.m87970r(i, i2, i3);
    }

    /* renamed from: A */
    public final C33829Jm2 m87988A(Object obj) {
        int i;
        if (this.f30901j == 0) {
            return null;
        }
        int size = this.f30892a.m99812P().size() - this.f30902k;
        int i2 = size - this.f30901j;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 >= i2) {
                if (Intrinsics.areEqual(m87972p(i4), obj)) {
                    i = i4;
                    break;
                }
                i4--;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            while (true) {
                if (i3 >= i2) {
                    C6893a c6893a = this.f30896e.get(this.f30892a.m99812P().get(i3));
                    Intrinsics.checkNotNull(c6893a);
                    C6893a c6893a2 = c6893a;
                    if (this.f30894c.mo4079b(obj, c6893a2.m87957e())) {
                        c6893a2.m87952j(obj);
                        i4 = i3;
                        i = i4;
                        break;
                    }
                    i3--;
                } else {
                    i4 = i3;
                    break;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            m87970r(i4, i2, 1);
        }
        this.f30901j--;
        C33829Jm2 c33829Jm2 = this.f30892a.m99812P().get(i2);
        C6893a c6893a3 = this.f30896e.get(c33829Jm2);
        Intrinsics.checkNotNull(c6893a3);
        C6893a c6893a4 = c6893a3;
        c6893a4.m87956f(true);
        c6893a4.m87953i(true);
        AbstractC48600sM5.f108670e.m14275g();
        return c33829Jm2;
    }

    /* renamed from: k */
    public final InterfaceC51579xO2 m87977k(Function2<? super InterfaceC37973aT5, ? super C44228kz0, ? extends InterfaceC52172yO2> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new C6895c(block, this.f30903l);
    }

    /* renamed from: l */
    public final C33829Jm2 m87976l(int i) {
        C33829Jm2 c33829Jm2 = new C33829Jm2(true, 0, 2, null);
        C33829Jm2 c33829Jm22 = this.f30892a;
        c33829Jm22.f18175l = true;
        this.f30892a.m99840B0(i, c33829Jm2);
        c33829Jm22.f18175l = false;
        return c33829Jm2;
    }

    /* renamed from: m */
    public final void m87975m() {
        C33829Jm2 c33829Jm2 = this.f30892a;
        c33829Jm2.f18175l = true;
        for (C6893a c6893a : this.f30896e.values()) {
            InterfaceC37166Xt0 m87960b = c6893a.m87960b();
            if (m87960b != null) {
                m87960b.dispose();
            }
        }
        this.f30892a.m99782d1();
        c33829Jm2.f18175l = false;
        this.f30896e.clear();
        this.f30897f.clear();
        this.f30902k = 0;
        this.f30901j = 0;
        this.f30899h.clear();
        m87971q();
    }

    /* renamed from: n */
    public final void m87974n(int i) {
        boolean z = false;
        this.f30901j = 0;
        int size = (this.f30892a.m99812P().size() - this.f30902k) - 1;
        if (i <= size) {
            this.f30900i.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.f30900i.add(m87972p(i2));
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
            this.f30894c.mo4080a(this.f30900i);
            AbstractC48600sM5 m14281a = AbstractC48600sM5.f108670e.m14281a();
            try {
                AbstractC48600sM5 m14295k = m14281a.m14295k();
                boolean z2 = false;
                while (size >= i) {
                    C33829Jm2 c33829Jm2 = this.f30892a.m99812P().get(size);
                    C6893a c6893a = this.f30896e.get(c33829Jm2);
                    Intrinsics.checkNotNull(c6893a);
                    C6893a c6893a2 = c6893a;
                    Object m87957e = c6893a2.m87957e();
                    if (this.f30900i.contains(m87957e)) {
                        c33829Jm2.m99735w1(C33829Jm2.EnumC4230g.NotUsed);
                        this.f30901j++;
                        if (c6893a2.m87961a()) {
                            c6893a2.m87956f(false);
                            z2 = true;
                        }
                    } else {
                        C33829Jm2 c33829Jm22 = this.f30892a;
                        c33829Jm22.f18175l = true;
                        this.f30896e.remove(c33829Jm2);
                        InterfaceC37166Xt0 m87960b = c6893a2.m87960b();
                        if (m87960b != null) {
                            m87960b.dispose();
                        }
                        this.f30892a.m99780e1(size, 1);
                        c33829Jm22.f18175l = false;
                    }
                    this.f30897f.remove(m87957e);
                    size--;
                }
                Unit unit = Unit.INSTANCE;
                m14281a.m14288r(m14295k);
                m14281a.mo1848d();
                z = z2;
            } catch (Throwable th) {
                m14281a.mo1848d();
                throw th;
            }
        }
        if (z) {
            AbstractC48600sM5.f108670e.m14275g();
        }
        m87971q();
    }

    /* renamed from: o */
    public final void m87973o() {
        for (Map.Entry<C33829Jm2, C6893a> entry : this.f30896e.entrySet()) {
            entry.getValue().m87953i(true);
        }
        if (!this.f30892a.m99777g0()) {
            C33829Jm2.m99761n1(this.f30892a, false, 1, null);
        }
    }

    /* renamed from: p */
    public final Object m87972p(int i) {
        C6893a c6893a = this.f30896e.get(this.f30892a.m99812P().get(i));
        Intrinsics.checkNotNull(c6893a);
        return c6893a.m87957e();
    }

    /* renamed from: q */
    public final void m87971q() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f30896e.size() == this.f30892a.m99812P().size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((this.f30892a.m99812P().size() - this.f30901j) - this.f30902k >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.f30899h.size() != this.f30902k) {
                    z3 = false;
                }
                if (z3) {
                    return;
                }
                throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f30902k + ". Map size " + this.f30899h.size()).toString());
            }
            throw new IllegalArgumentException(("Incorrect state. Total children " + this.f30892a.m99812P().size() + ". Reusable children " + this.f30901j + ". Precomposed children " + this.f30902k).toString());
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f30896e.size() + ") and the children count on the SubcomposeLayout (" + this.f30892a.m99812P().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    /* renamed from: r */
    public final void m87970r(int i, int i2, int i3) {
        C33829Jm2 c33829Jm2 = this.f30892a;
        c33829Jm2.f18175l = true;
        this.f30892a.m99801U0(i, i2, i3);
        c33829Jm2.f18175l = false;
    }

    /* renamed from: t */
    public final ZS5.InterfaceC10277a m87968t(Object obj, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        m87971q();
        if (!this.f30897f.containsKey(obj)) {
            Map<Object, C33829Jm2> map = this.f30899h;
            C33829Jm2 c33829Jm2 = map.get(obj);
            if (c33829Jm2 == null) {
                c33829Jm2 = m87988A(obj);
                if (c33829Jm2 != null) {
                    m87970r(this.f30892a.m99812P().indexOf(c33829Jm2), this.f30892a.m99812P().size(), 1);
                    this.f30902k++;
                } else {
                    c33829Jm2 = m87976l(this.f30892a.m99812P().size());
                    this.f30902k++;
                }
                map.put(obj, c33829Jm2);
            }
            m87963y(c33829Jm2, obj, content);
        }
        return new C6897d(obj);
    }

    /* renamed from: u */
    public final void m87967u(AbstractC37400Yt0 abstractC37400Yt0) {
        this.f30893b = abstractC37400Yt0;
    }

    /* renamed from: v */
    public final void m87966v(InterfaceC38566bT5 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f30894c != value) {
            this.f30894c = value;
            m87974n(0);
        }
    }

    /* renamed from: w */
    public final List<InterfaceC50393vO2> m87965w(Object obj, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(content, "content");
        m87971q();
        C33829Jm2.EnumC4228e m99792Z = this.f30892a.m99792Z();
        boolean z3 = false;
        if (m99792Z != C33829Jm2.EnumC4228e.Measuring && m99792Z != C33829Jm2.EnumC4228e.LayingOut) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Map<Object, C33829Jm2> map = this.f30897f;
            C33829Jm2 c33829Jm2 = map.get(obj);
            if (c33829Jm2 == null) {
                c33829Jm2 = this.f30899h.remove(obj);
                if (c33829Jm2 != null) {
                    int i = this.f30902k;
                    if (i > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        this.f30902k = i - 1;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    c33829Jm2 = m87988A(obj);
                    if (c33829Jm2 == null) {
                        c33829Jm2 = m87976l(this.f30895d);
                    }
                }
                map.put(obj, c33829Jm2);
            }
            C33829Jm2 c33829Jm22 = c33829Jm2;
            int indexOf = this.f30892a.m99812P().indexOf(c33829Jm22);
            int i2 = this.f30895d;
            if (indexOf >= i2) {
                z3 = true;
            }
            if (z3) {
                if (i2 != indexOf) {
                    m87969s(this, indexOf, i2, 0, 4, null);
                }
                this.f30895d++;
                m87963y(c33829Jm22, obj, content);
                return c33829Jm22.m99821K();
            }
            throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
        }
        throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
    }

    /* renamed from: x */
    public final void m87964x(C33829Jm2 c33829Jm2, C6893a c6893a) {
        AbstractC48600sM5 m14281a = AbstractC48600sM5.f108670e.m14281a();
        try {
            AbstractC48600sM5 m14295k = m14281a.m14295k();
            C33829Jm2 c33829Jm22 = this.f30892a;
            c33829Jm22.f18175l = true;
            Function2<InterfaceC32720Et0, Integer, Unit> m87959c = c6893a.m87959c();
            InterfaceC37166Xt0 m87960b = c6893a.m87960b();
            AbstractC37400Yt0 abstractC37400Yt0 = this.f30893b;
            if (abstractC37400Yt0 != null) {
                c6893a.m87955g(m87962z(m87960b, c33829Jm2, abstractC37400Yt0, C43575jt0.m29790c(-34810602, true, new C6898e(c6893a, m87959c))));
                c33829Jm22.f18175l = false;
                Unit unit = Unit.INSTANCE;
                m14281a.m14288r(m14295k);
                return;
            }
            throw new IllegalStateException("parent composition reference not set".toString());
        } finally {
            m14281a.mo1848d();
        }
    }

    /* renamed from: y */
    public final void m87963y(C33829Jm2 c33829Jm2, Object obj, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
        boolean z;
        Map<C33829Jm2, C6893a> map = this.f30896e;
        C6893a c6893a = map.get(c33829Jm2);
        if (c6893a == null) {
            c6893a = new C6893a(obj, C51282wt0.f116712a.m6189a(), null, 4, null);
            map.put(c33829Jm2, c6893a);
        }
        C6893a c6893a2 = c6893a;
        InterfaceC37166Xt0 m87960b = c6893a2.m87960b();
        if (m87960b != null) {
            z = m87960b.mo44870w();
        } else {
            z = true;
        }
        if (c6893a2.m87959c() != function2 || z || c6893a2.m87958d()) {
            c6893a2.m87954h(function2);
            m87964x(c33829Jm2, c6893a2);
            c6893a2.m87953i(false);
        }
    }

    /* renamed from: z */
    public final InterfaceC37166Xt0 m87962z(InterfaceC37166Xt0 interfaceC37166Xt0, C33829Jm2 c33829Jm2, AbstractC37400Yt0 abstractC37400Yt0, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
        if (interfaceC37166Xt0 == null || interfaceC37166Xt0.mo44877e()) {
            interfaceC37166Xt0 = C11447m.m68287a(c33829Jm2, abstractC37400Yt0);
        }
        interfaceC37166Xt0.mo44876f(function2);
        return interfaceC37166Xt0;
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B+\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b#\u0010$R$\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010\"\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b\u0002\u0010\u001b\"\u0004\b!\u0010\u001d¨\u0006%"}, m28432d2 = {"LQm2$a;", "", C17296a.f69688o, "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "j", "(Ljava/lang/Object;)V", "slotId", "Lkotlin/Function0;", "", "b", "Lkotlin/jvm/functions/Function2;", "c", "()Lkotlin/jvm/functions/Function2;", "h", "(Lkotlin/jvm/functions/Function2;)V", "content", "LXt0;", "LXt0;", "()LXt0;", "g", "(LXt0;)V", "composition", "", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "i", "(Z)V", "forceRecompose", "<set-?>", "LEX2;", "f", "active", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LXt0;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,774:1\n76#2:775\n102#2,2:776\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState\n*L\n730#1:775\n730#1:776,2\n*E\n"})
    /* renamed from: Qm2$a */
    /* loaded from: classes.dex */
    public static final class C6893a {

        /* renamed from: a */
        public Object f30904a;

        /* renamed from: b */
        public Function2<? super InterfaceC32720Et0, ? super Integer, Unit> f30905b;

        /* renamed from: c */
        public InterfaceC37166Xt0 f30906c;

        /* renamed from: d */
        public boolean f30907d;

        /* renamed from: e */
        public final EX2 f30908e;

        public C6893a(Object obj, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC37166Xt0 interfaceC37166Xt0) {
            EX2 m97025e;
            Intrinsics.checkNotNullParameter(content, "content");
            this.f30904a = obj;
            this.f30905b = content;
            this.f30906c = interfaceC37166Xt0;
            m97025e = LM5.m97025e(Boolean.TRUE, null, 2, null);
            this.f30908e = m97025e;
        }

        /* renamed from: a */
        public final boolean m87961a() {
            return ((Boolean) this.f30908e.getValue()).booleanValue();
        }

        /* renamed from: b */
        public final InterfaceC37166Xt0 m87960b() {
            return this.f30906c;
        }

        /* renamed from: c */
        public final Function2<InterfaceC32720Et0, Integer, Unit> m87959c() {
            return this.f30905b;
        }

        /* renamed from: d */
        public final boolean m87958d() {
            return this.f30907d;
        }

        /* renamed from: e */
        public final Object m87957e() {
            return this.f30904a;
        }

        /* renamed from: f */
        public final void m87956f(boolean z) {
            this.f30908e.setValue(Boolean.valueOf(z));
        }

        /* renamed from: g */
        public final void m87955g(InterfaceC37166Xt0 interfaceC37166Xt0) {
            this.f30906c = interfaceC37166Xt0;
        }

        /* renamed from: h */
        public final void m87954h(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
            Intrinsics.checkNotNullParameter(function2, "<set-?>");
            this.f30905b = function2;
        }

        /* renamed from: i */
        public final void m87953i(boolean z) {
            this.f30907d = z;
        }

        /* renamed from: j */
        public final void m87952j(Object obj) {
            this.f30904a = obj;
        }

        public /* synthetic */ C6893a(Object obj, Function2 function2, InterfaceC37166Xt0 interfaceC37166Xt0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, function2, (i & 4) != 0 ? null : interfaceC37166Xt0);
        }
    }
}
