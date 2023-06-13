package p000;

import androidx.compose.p003ui.focus.InterfaceC11302e;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25554kw;
import p000.InterfaceC41563gV2;
import p000.InterfaceC43181jD3;
@Metadata(m28433d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u0010B\u0010\u0012\u0006\u0010\u0018\u001a\u00020S¢\u0006\u0005\b\u0088\u0001\u0010ZJ\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0014\u0010\u0019\u001a\u00020\u00112\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u000f\u0010\u001d\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0011J)\u0010&\u001a\u00020%*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001c\u0010,\u001a\u00020**\u00020(2\u0006\u0010\"\u001a\u00020)2\u0006\u0010+\u001a\u00020*H\u0016J\u001c\u0010.\u001a\u00020**\u00020(2\u0006\u0010\"\u001a\u00020)2\u0006\u0010-\u001a\u00020*H\u0016J\u001c\u0010/\u001a\u00020**\u00020(2\u0006\u0010\"\u001a\u00020)2\u0006\u0010+\u001a\u00020*H\u0016J\u001c\u00100\u001a\u00020**\u00020(2\u0006\u0010\"\u001a\u00020)2\u0006\u0010-\u001a\u00020*H\u0016J\f\u00102\u001a\u00020\u0011*\u000201H\u0016J-\u00109\u001a\u00020\u00112\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:J\b\u0010;\u001a\u00020\u0011H\u0016J\b\u0010<\u001a\u00020\u0013H\u0016J\b\u0010=\u001a\u00020\u0013H\u0016J\u0018\u0010A\u001a\u0004\u0018\u00010?*\u00020>2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010D\u001a\u00020\u00112\u0006\u0010C\u001a\u00020BH\u0016J\u0010\u0010F\u001a\u00020\u00112\u0006\u0010C\u001a\u00020EH\u0016J\u001d\u0010H\u001a\u00020\u00112\u0006\u0010G\u001a\u000207H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u00112\u0006\u0010C\u001a\u00020BH\u0016J\u0010\u0010M\u001a\u00020\u00112\u0006\u0010L\u001a\u00020KH\u0016J\u0010\u0010P\u001a\u00020\u00112\u0006\u0010O\u001a\u00020NH\u0016J\b\u0010R\u001a\u00020QH\u0016R*\u0010\u0018\u001a\u00020S2\u0006\u0010T\u001a\u00020S8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R:\u0010i\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030b0aj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030b`c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0018\u0010k\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010jR\u0014\u0010n\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u001d\u0010G\u001a\u00020s8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010y\u001a\u00020v8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR$\u0010}\u001a\u00028\u0000\"\u0004\b\u0000\u0010z*\b\u0012\u0004\u0012\u00028\u00000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0015\u0010\u0080\u0001\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR0\u0010\u0083\u0001\u001a\u0002072\u0006\u0010T\u001a\u0002078V@VX\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010u\"\u0005\b\u0082\u0001\u0010IR\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0089\u0001"}, m28432d2 = {"Ljw;", "LDm2;", "Ll62;", "LE61;", "Lgs5;", "LrX3;", "LmV2;", "LpV2;", "LTE3;", "Lkm2;", "LTC1;", "Lvv1;", "LRv1;", "LUv1;", "LlD3;", "LW30;", "LgV2$c;", "", "k0", "", "duringAttach", "h0", "l0", "LoV2;", "element", "n0", "R", "S", "p", "i0", "()V", "m0", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", "f", "(LzO2;LvO2;J)LyO2;", "LZ62;", "LX62;", "", "height", "c", "width", "e", "i", DateTokenConverter.CONVERTER_KEY, "LiA0;", "y", "LYW3;", "pointerEvent", "LaX3;", "pass", "LG52;", "bounds", "q", "(LYW3;LaX3;J)V", "o", "x", "j", "Lg01;", "", "parentData", "B", "Lnm2;", "coordinates", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LUC2;", "D", "size", "A", "(J)V", "t", "LWv1;", "focusState", "F", "Landroidx/compose/ui/focus/e;", "focusProperties", "m", "", "toString", "LgV2$b;", "value", "l", "LgV2$b;", "f0", "()LgV2$b;", "j0", "(LgV2$b;)V", "Z", "invalidateCache", "Liw;", "n", "Liw;", "_providedValues", "Ljava/util/HashSet;", "LhV2;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "g0", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "readValues", "Lnm2;", "lastOnPlacedCoordinates", "b", "()Lg01;", "density", "Lpm2;", "getLayoutDirection", "()Lpm2;", "layoutDirection", "LxB5;", "h", "()J", "LlV2;", "k", "()LlV2;", "providedValues", "T", C17296a.f69688o, "(LhV2;)Ljava/lang/Object;", "current", "L", "()Z", "isValidOwnerScope", "getTargetSize-YbymL2g", "v", "targetSize", "Lbs5;", "H", "()Lbs5;", "semanticsConfiguration", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,471:1\n77#2:472\n73#2:474\n77#2:478\n71#2:480\n69#2:482\n81#2:484\n83#2:486\n75#2:490\n73#2:492\n81#2:494\n77#2:495\n196#3:473\n196#3:475\n196#3:479\n196#3:481\n196#3:483\n196#3:485\n196#3:487\n196#3:491\n196#3:493\n735#4,2:476\n728#4,2:488\n314#5:496\n78#5,17:497\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n*L\n120#1:472\n130#1:474\n141#1:478\n152#1:480\n160#1:482\n176#1:484\n201#1:486\n214#1:490\n219#1:492\n229#1:494\n265#1:495\n120#1:473\n130#1:475\n141#1:479\n152#1:481\n160#1:483\n176#1:485\n201#1:487\n214#1:491\n219#1:493\n134#1:476,2\n212#1:488,2\n265#1:496\n265#1:497,17\n*E\n"})
/* renamed from: jw */
/* loaded from: classes.dex */
public final class C25040jw extends InterfaceC41563gV2.AbstractC20914c implements InterfaceC32425Dm2, InterfaceC44299l62, E61, InterfaceC41791gs5, InterfaceC48105rX3, InterfaceC45121mV2, InterfaceC46900pV2, TE3, InterfaceC44100km2, TC1, InterfaceC50710vv1, InterfaceC35781Rv1, InterfaceC36483Uv1, InterfaceC44367lD3, W30 {

    /* renamed from: l */
    public InterfaceC41563gV2.InterfaceC20913b f93542l;

    /* renamed from: m */
    public boolean f93543m;

    /* renamed from: n */
    public C24644iw f93544n;

    /* renamed from: o */
    public HashSet<AbstractC42156hV2<?>> f93545o;

    /* renamed from: p */
    public InterfaceC45879nm2 f93546p;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jw$a */
    /* loaded from: classes.dex */
    public static final class C25041a extends Lambda implements Function0<Unit> {
        public C25041a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C25040jw.this.m29726m0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"jw$b", "LjD3$b;", "", "m", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$2\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,471:1\n81#2:472\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$2\n*L\n193#1:472\n*E\n"})
    /* renamed from: jw$b */
    /* loaded from: classes.dex */
    public static final class C25042b implements InterfaceC43181jD3.InterfaceC24738b {
        public C25042b() {
        }

        @Override // p000.InterfaceC43181jD3.InterfaceC24738b
        /* renamed from: m */
        public void mo29723m() {
            if (C25040jw.this.f93546p == null) {
                C25040jw c25040jw = C25040jw.this;
                c25040jw.mo28464t(C51083wZ0.m6662g(c25040jw, K83.m99169a(128)));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jw$c */
    /* loaded from: classes.dex */
    public static final class C25043c extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2.InterfaceC20913b f93549g;

        /* renamed from: h */
        public final /* synthetic */ C25040jw f93550h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25043c(InterfaceC41563gV2.InterfaceC20913b interfaceC20913b, C25040jw c25040jw) {
            super(0);
            this.f93549g = interfaceC20913b;
            this.f93550h = c25040jw;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((A61) this.f93549g).mo114359X(this.f93550h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jw$d */
    /* loaded from: classes.dex */
    public static final class C25044d extends Lambda implements Function0<Unit> {
        public C25044d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InterfaceC41563gV2.InterfaceC20913b m29735f0 = C25040jw.this.m29735f0();
            Intrinsics.checkNotNull(m29735f0, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((InterfaceC42749iV2) m29735f0).mo33854o0(C25040jw.this);
        }
    }

    public C25040jw(InterfaceC41563gV2.InterfaceC20913b element) {
        Intrinsics.checkNotNullParameter(element, "element");
        m39248Y(L83.m97663e(element));
        this.f93542l = element;
        this.f93543m = true;
        this.f93545o = new HashSet<>();
    }

    @Override // p000.InterfaceC44100km2
    /* renamed from: A */
    public void mo28466A(long j) {
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        if (interfaceC20913b instanceof InterfaceC41679gh3) {
            ((InterfaceC41679gh3) interfaceC20913b).mo26980A(j);
        }
    }

    @Override // p000.TE3
    /* renamed from: B */
    public Object mo15408B(InterfaceC41273g01 interfaceC41273g01, Object obj) {
        Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        Intrinsics.checkNotNull(interfaceC20913b, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((SE3) interfaceC20913b).mo62029B(interfaceC41273g01, obj);
    }

    @Override // p000.TC1
    /* renamed from: C */
    public void mo29741C(InterfaceC45879nm2 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        Intrinsics.checkNotNull(interfaceC20913b, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((InterfaceC35648Rg3) interfaceC20913b).mo44810C(coordinates);
    }

    @Override // p000.InterfaceC44100km2
    /* renamed from: D */
    public void mo28465D(UC2 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        if (interfaceC20913b instanceof WC2) {
            ((WC2) interfaceC20913b).m78730a(coordinates);
        }
    }

    @Override // p000.InterfaceC50710vv1
    /* renamed from: F */
    public void mo7774F(InterfaceC36951Wv1 focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        if (interfaceC20913b instanceof InterfaceC50118uv1) {
            ((InterfaceC50118uv1) interfaceC20913b).m9497F(focusState);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // p000.InterfaceC41791gs5
    /* renamed from: H */
    public C38809bs5 mo29740H() {
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        Intrinsics.checkNotNull(interfaceC20913b, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        return ((InterfaceC40012ds5) interfaceC20913b).mo42474H();
    }

    @Override // p000.InterfaceC44367lD3
    /* renamed from: L */
    public boolean mo14142L() {
        return m39254Q();
    }

    @Override // p000.InterfaceC41563gV2.AbstractC20914c
    /* renamed from: R */
    public void mo29739R() {
        m29732h0(true);
    }

    @Override // p000.InterfaceC41563gV2.AbstractC20914c
    /* renamed from: S */
    public void mo29738S() {
        m29729k0();
    }

    @Override // p000.InterfaceC45121mV2, p000.InterfaceC46900pV2
    /* renamed from: a */
    public <T> T mo19176a(AbstractC42156hV2<T> abstractC42156hV2) {
        F83 m99764m0;
        Intrinsics.checkNotNullParameter(abstractC42156hV2, "<this>");
        this.f93545o.add(abstractC42156hV2);
        int m99169a = K83.m99169a(32);
        if (mo8445r().m39254Q()) {
            InterfaceC41563gV2.AbstractC20914c m39256O = mo8445r().m39256O();
            C33829Jm2 m6661h = C51083wZ0.m6661h(this);
            while (m6661h != null) {
                if ((m6661h.m99764m0().m107677l().m39262G() & m99169a) != 0) {
                    while (m39256O != null) {
                        if ((m39256O.m39258M() & m99169a) != 0 && (m39256O instanceof InterfaceC45121mV2)) {
                            InterfaceC45121mV2 interfaceC45121mV2 = (InterfaceC45121mV2) m39256O;
                            if (interfaceC45121mV2.mo25501k().mo27215a(abstractC42156hV2)) {
                                return (T) interfaceC45121mV2.mo25501k().mo27214b(abstractC42156hV2);
                            }
                        }
                        m39256O = m39256O.m39256O();
                    }
                }
                m6661h = m6661h.m99756p0();
                if (m6661h != null && (m99764m0 = m6661h.m99764m0()) != null) {
                    m39256O = m99764m0.m107674o();
                } else {
                    m39256O = null;
                }
            }
            return abstractC42156hV2.m36342a().invoke();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // p000.W30
    /* renamed from: b */
    public InterfaceC41273g01 mo29737b() {
        return C51083wZ0.m6661h(this).m99816N();
    }

    @Override // p000.InterfaceC32425Dm2
    /* renamed from: c */
    public int mo21528c(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        Intrinsics.checkNotNull(interfaceC20913b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC31957Bm2) interfaceC20913b).mo44975c(z62, measurable, i);
    }

    @Override // p000.InterfaceC32425Dm2
    /* renamed from: d */
    public int mo21527d(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        Intrinsics.checkNotNull(interfaceC20913b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC31957Bm2) interfaceC20913b).mo44974d(z62, measurable, i);
    }

    @Override // p000.InterfaceC32425Dm2
    /* renamed from: e */
    public int mo21526e(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        Intrinsics.checkNotNull(interfaceC20913b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC31957Bm2) interfaceC20913b).mo44973e(z62, measurable, i);
    }

    @Override // p000.InterfaceC32425Dm2
    /* renamed from: f */
    public InterfaceC52172yO2 mo21524f(InterfaceC52765zO2 measure, InterfaceC50393vO2 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        Intrinsics.checkNotNull(interfaceC20913b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC31957Bm2) interfaceC20913b).mo3871f(measure, measurable, j);
    }

    /* renamed from: f0 */
    public final InterfaceC41563gV2.InterfaceC20913b m29735f0() {
        return this.f93542l;
    }

    /* renamed from: g0 */
    public final HashSet<AbstractC42156hV2<?>> m29734g0() {
        return this.f93545o;
    }

    @Override // p000.W30
    public EnumC47065pm2 getLayoutDirection() {
        return C51083wZ0.m6661h(this).getLayoutDirection();
    }

    @Override // p000.W30
    /* renamed from: h */
    public long mo29733h() {
        return H52.m104428c(C51083wZ0.m6662g(this, K83.m99169a(128)).mo23186a());
    }

    /* renamed from: h0 */
    public final void m29732h0(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (m39254Q()) {
            InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
            boolean z8 = false;
            if ((K83.m99169a(32) & m39258M()) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (interfaceC20913b instanceof InterfaceC46307oV2) {
                    m29725n0((InterfaceC46307oV2) interfaceC20913b);
                }
                if (interfaceC20913b instanceof InterfaceC42749iV2) {
                    if (z) {
                        m29726m0();
                    } else {
                        m39244c0(new C25041a());
                    }
                }
            }
            if ((K83.m99169a(4) & m39258M()) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (interfaceC20913b instanceof A61) {
                    this.f93543m = true;
                }
                if (!z) {
                    C33127Gm2.m104766a(this);
                }
            }
            if ((K83.m99169a(2) & m39258M()) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (C51083wZ0.m6661h(this).m99764m0().m107674o().m39254Q()) {
                    H83 m39260J = m39260J();
                    Intrinsics.checkNotNull(m39260J);
                    ((C32659Em2) m39260J).m108390Y2(this);
                    m39260J.mo104294z2();
                }
                if (!z) {
                    C33127Gm2.m104766a(this);
                    C51083wZ0.m6661h(this).m99828G0();
                }
            }
            if (interfaceC20913b instanceof InterfaceC34848Nv4) {
                ((InterfaceC34848Nv4) interfaceC20913b).mo93192S(this);
            }
            if ((K83.m99169a(128) & m39258M()) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if ((interfaceC20913b instanceof InterfaceC41679gh3) && C51083wZ0.m6661h(this).m99764m0().m107674o().m39254Q()) {
                    C51083wZ0.m6661h(this).m99828G0();
                }
                if (interfaceC20913b instanceof InterfaceC39290ch3) {
                    this.f93546p = null;
                    if (C51083wZ0.m6661h(this).m99764m0().m107674o().m39254Q()) {
                        C51083wZ0.m6660i(this).mo31012E(new C25042b());
                    }
                }
            }
            if ((K83.m99169a(256) & m39258M()) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 && (interfaceC20913b instanceof InterfaceC35648Rg3) && C51083wZ0.m6661h(this).m99764m0().m107674o().m39254Q()) {
                C51083wZ0.m6661h(this).m99828G0();
            }
            if (interfaceC20913b instanceof InterfaceC36249Tv1) {
                ((InterfaceC36249Tv1) interfaceC20913b).m82243L().m68780d().m96701b(this);
            }
            if ((K83.m99169a(16) & m39258M()) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 && (interfaceC20913b instanceof InterfaceC47512qX3)) {
                ((InterfaceC47512qX3) interfaceC20913b).mo3429P0().m19132f1(m39260J());
            }
            if ((K83.m99169a(8) & m39258M()) != 0) {
                z8 = true;
            }
            if (z8) {
                C51083wZ0.m6660i(this).mo30998V();
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // p000.InterfaceC32425Dm2
    /* renamed from: i */
    public int mo21520i(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        Intrinsics.checkNotNull(interfaceC20913b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC31957Bm2) interfaceC20913b).mo21011i(z62, measurable, i);
    }

    /* renamed from: i0 */
    public final void m29731i0() {
        this.f93543m = true;
        F61.m107744a(this);
    }

    @Override // p000.InterfaceC48105rX3
    /* renamed from: j */
    public boolean mo15818j() {
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        Intrinsics.checkNotNull(interfaceC20913b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((InterfaceC47512qX3) interfaceC20913b).mo3429P0().mo3428a1();
    }

    /* renamed from: j0 */
    public final void m29730j0(InterfaceC41563gV2.InterfaceC20913b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (m39254Q()) {
            m29729k0();
        }
        this.f93542l = value;
        m39248Y(L83.m97663e(value));
        if (m39254Q()) {
            m29732h0(false);
        }
    }

    @Override // p000.InterfaceC45121mV2
    /* renamed from: k */
    public AbstractC44528lV2 mo25501k() {
        C24644iw c24644iw = this.f93544n;
        return c24644iw != null ? c24644iw : C45714nV2.m23605a();
    }

    /* renamed from: k0 */
    public final void m29729k0() {
        boolean z;
        C25554kw.C25555a c25555a;
        if (m39254Q()) {
            InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
            boolean z2 = true;
            if ((K83.m99169a(32) & m39258M()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (interfaceC20913b instanceof InterfaceC46307oV2) {
                    C51083wZ0.m6660i(this).mo30987o().m28908d(this, ((InterfaceC46307oV2) interfaceC20913b).getKey());
                }
                if (interfaceC20913b instanceof InterfaceC42749iV2) {
                    c25555a = C25554kw.f95221a;
                    ((InterfaceC42749iV2) interfaceC20913b).mo33854o0(c25555a);
                }
            }
            if ((K83.m99169a(8) & m39258M()) == 0) {
                z2 = false;
            }
            if (z2) {
                C51083wZ0.m6660i(this).mo30998V();
            }
            if (interfaceC20913b instanceof InterfaceC36249Tv1) {
                ((InterfaceC36249Tv1) interfaceC20913b).m82243L().m68780d().m96709A(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: l0 */
    public final void m29728l0() {
        Function1 function1;
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        if (interfaceC20913b instanceof A61) {
            C44960mD3 mo30989l = C51083wZ0.m6660i(this).mo30989l();
            function1 = C25554kw.f95222b;
            mo30989l.m26010h(this, function1, new C25043c(interfaceC20913b, this));
        }
        this.f93543m = false;
    }

    @Override // p000.InterfaceC35781Rv1
    /* renamed from: m */
    public void mo29727m(InterfaceC11302e focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        if (interfaceC20913b instanceof InterfaceC35079Ov1) {
            new C35313Pv1((InterfaceC35079Ov1) interfaceC20913b).invoke(focusProperties);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: m0 */
    public final void m29726m0() {
        Function1 function1;
        if (m39254Q()) {
            this.f93545o.clear();
            C44960mD3 mo30989l = C51083wZ0.m6660i(this).mo30989l();
            function1 = C25554kw.f95223c;
            mo30989l.m26010h(this, function1, new C25044d());
        }
    }

    /* renamed from: n0 */
    public final void m29725n0(InterfaceC46307oV2<?> interfaceC46307oV2) {
        C24644iw c24644iw = this.f93544n;
        if (c24644iw != null && c24644iw.mo27215a(interfaceC46307oV2.getKey())) {
            c24644iw.m31601c(interfaceC46307oV2);
            C51083wZ0.m6660i(this).mo30987o().m28906f(this, interfaceC46307oV2.getKey());
            return;
        }
        this.f93544n = new C24644iw(interfaceC46307oV2);
        if (C51083wZ0.m6661h(this).m99764m0().m107674o().m39254Q()) {
            C51083wZ0.m6660i(this).mo30987o().m28911a(this, interfaceC46307oV2.getKey());
        }
    }

    @Override // p000.InterfaceC48105rX3
    /* renamed from: o */
    public void mo15817o() {
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        Intrinsics.checkNotNull(interfaceC20913b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((InterfaceC47512qX3) interfaceC20913b).mo3429P0().mo3427d1();
    }

    @Override // p000.E61
    /* renamed from: p */
    public void mo29724p() {
        this.f93543m = true;
        F61.m107744a(this);
    }

    @Override // p000.InterfaceC48105rX3
    /* renamed from: q */
    public void mo15816q(YW3 pointerEvent, EnumC38007aX3 pass, long j) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        Intrinsics.checkNotNull(interfaceC20913b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((InterfaceC47512qX3) interfaceC20913b).mo3429P0().mo3426e1(pointerEvent, pass, j);
    }

    @Override // p000.InterfaceC44100km2
    /* renamed from: t */
    public void mo28464t(InterfaceC45879nm2 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f93546p = coordinates;
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        if (interfaceC20913b instanceof InterfaceC39290ch3) {
            ((InterfaceC39290ch3) interfaceC20913b).mo29214t(coordinates);
        }
    }

    public String toString() {
        return this.f93542l.toString();
    }

    @Override // p000.InterfaceC44299l62
    /* renamed from: v */
    public void mo27868v(long j) {
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        Intrinsics.checkNotNull(interfaceC20913b, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        ((InterfaceC43706k62) interfaceC20913b).m29294v(j);
    }

    @Override // p000.InterfaceC48105rX3
    /* renamed from: x */
    public boolean mo15815x() {
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        Intrinsics.checkNotNull(interfaceC20913b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((InterfaceC47512qX3) interfaceC20913b).mo3429P0().mo10105c1();
    }

    @Override // p000.E61
    /* renamed from: y */
    public void mo4144y(InterfaceC42558iA0 interfaceC42558iA0) {
        Intrinsics.checkNotNullParameter(interfaceC42558iA0, "<this>");
        InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = this.f93542l;
        Intrinsics.checkNotNull(interfaceC20913b, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        D61 d61 = (D61) interfaceC20913b;
        if (this.f93543m && (interfaceC20913b instanceof A61)) {
            m29728l0();
        }
        d61.mo72302y(interfaceC42558iA0);
    }
}
