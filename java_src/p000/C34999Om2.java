package p000;

import androidx.compose.p003ui.graphics.InterfaceC11328c;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33829Jm2;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0018\u001dB\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b_\u0010`J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\fJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0007J\u0006\u0010\u0015\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u0007J\u0006\u0010\u0017\u001a\u00020\u0007R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010&\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010)\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u0016\u0010+\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010#R$\u0010.\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R$\u00101\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%R\u0016\u00103\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010#R*\u00109\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u00108R*\u0010@\u001a\u00020:2\u0006\u00104\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0012\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010F\u001a\u00060AR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER0\u0010L\u001a\b\u0018\u00010GR\u00020\u00002\f\u0010\u001c\u001a\b\u0018\u00010GR\u00020\u00008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0011\u0010P\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001c\u0010S\u001a\u0004\u0018\u00010\u00058Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u001c\u0010U\u001a\u0004\u0018\u00010\u00058Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bT\u0010RR\u0014\u0010W\u001a\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010=R\u0014\u0010Y\u001a\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010=R\u0014\u0010\\\u001a\u00020Z8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010[R\u0016\u0010^\u001a\u0004\u0018\u00010Z8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010[\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006a"}, m28432d2 = {"LOm2;", "", "LJm2;", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lkz0;", "constraints", "", "K", "(J)V", "J", "E", "()V", "H", "F", "G", "LXC2;", "newScope", "I", "(LXC2;)V", "O", "B", "L", "D", C17296a.f69688o, "LJm2;", "layoutNode", "LJm2$e;", "<set-?>", "b", "LJm2$e;", "s", "()LJm2$e;", "layoutState", "c", "Z", "y", "()Z", "measurePending", DateTokenConverter.CONVERTER_KEY, "r", "layoutPending", "e", "layoutPendingForAlignment", "f", "v", "lookaheadMeasurePending", "g", "u", "lookaheadLayoutPending", "h", "lookaheadLayoutPendingForAlignment", "value", "i", "n", "N", "(Z)V", "coordinatesAccessedDuringPlacement", "", "j", "m", "()I", "M", "(I)V", "childrenAccessingCoordinatesDuringPlacement", "LOm2$b;", "k", "LOm2$b;", "x", "()LOm2$b;", "measurePassDelegate", "LOm2$a;", "l", "LOm2$a;", "w", "()LOm2$a;", "lookaheadPassDelegate", "LH83;", "z", "()LH83;", "outerCoordinator", "p", "()Lkz0;", "lastConstraints", "q", "lastLookaheadConstraints", "o", "height", "A", "width", "LQ9;", "()LQ9;", "alignmentLinesOwner", "t", "lookaheadAlignmentLinesOwner", "<init>", "(LJm2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1237:1\n1#2:1238\n*E\n"})
/* renamed from: Om2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34999Om2 {

    /* renamed from: a */
    public final C33829Jm2 f27212a;

    /* renamed from: b */
    public C33829Jm2.EnumC4228e f27213b;

    /* renamed from: c */
    public boolean f27214c;

    /* renamed from: d */
    public boolean f27215d;

    /* renamed from: e */
    public boolean f27216e;

    /* renamed from: f */
    public boolean f27217f;

    /* renamed from: g */
    public boolean f27218g;

    /* renamed from: h */
    public boolean f27219h;

    /* renamed from: i */
    public boolean f27220i;

    /* renamed from: j */
    public int f27221j;

    /* renamed from: k */
    public final C6119b f27222k;

    /* renamed from: l */
    public C6111a f27223l;

    @Metadata(m28433d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u00107\u001a\u000204¢\u0006\u0004\bw\u0010xJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\u001c\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0006\u0010\u0015\u001a\u00020\u0004J\u001d\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010$\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0019\u0010#\u001a\u0015\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010¢\u0006\u0002\b\"H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0011\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\rH\u0096\u0002J\u0010\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000eH\u0016J\u0010\u0010*\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000eH\u0016J\u0010\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000eH\u0016J\u0010\u0010-\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000eH\u0016J\u000e\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001aJ\u0006\u00100\u001a\u00020\u0004J\u0006\u00101\u001a\u00020\u001aJ\u0006\u00102\u001a\u00020\u0004J\u0006\u00103\u001a\u00020\u0004R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010>\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00109R\u0016\u0010B\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00109R!\u0010E\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bC\u0010DR\u001f\u0010H\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010L\u001a\u00020\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bI\u00109\u001a\u0004\bJ\u0010;\"\u0004\bK\u0010=R\u0016\u0010N\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00109R\u001a\u0010S\u001a\u00020O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010UR\"\u0010Z\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u00109\u001a\u0004\bX\u0010;\"\u0004\bY\u0010=R\u0016\u0010\\\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u00109R(\u0010c\u001a\u0004\u0018\u00010]2\b\u0010^\u001a\u0004\u0018\u00010]8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001c\u0010f\u001a\u0004\u0018\u00010\u00168Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00020k8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0016\u0010q\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010t\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010v\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010s\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006y"}, m28432d2 = {"LOm2$a;", "LOU3;", "LvO2;", "LQ9;", "", "t1", "LJm2;", "D1", "w1", "A1", "v1", "S", "", "LL9;", "", "o", "Lkotlin/Function1;", "block", "Y0", "requestLayout", "A", "u1", "Lkz0;", "constraints", "P0", "(J)LOU3;", "", "y1", "(J)Z", "LA52;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/c;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "j1", "(JFLkotlin/jvm/functions/Function1;)V", "alignmentLine", "v", "height", "p0", "t0", "width", "g0", "B", "forceRequest", "r1", "s1", "E1", "x1", "z1", "LXC2;", "f", "LXC2;", "lookaheadScope", "g", "Z", "getDuringAlignmentLinesQuery$ui_release", "()Z", "setDuringAlignmentLinesQuery$ui_release", "(Z)V", "duringAlignmentLinesQuery", "h", "placedOnce", "i", "measuredOnce", "j", "Lkz0;", "lookaheadConstraints", "k", "J", "lastPosition", "l", "n", "C1", "isPlaced", "m", "isPreviouslyPlaced", "LP9;", "LP9;", DateTokenConverter.CONVERTER_KEY, "()LP9;", "alignmentLines", "LLX2;", "LLX2;", "_childMeasurables", "p", "getChildMeasurablesDirty$ui_release", "B1", "childMeasurablesDirty", "q", "parentDataDirty", "", "<set-?>", "r", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "parentData", "q1", "()Lkz0;", "lastConstraints", "LH83;", "o0", "()LH83;", "innerCoordinator", "", "p1", "()Ljava/util/List;", "childMeasurables", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()LQ9;", "parentAlignmentLinesOwner", "g1", "()I", "measuredWidth", "e1", "measuredHeight", "<init>", "(LOm2;LXC2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1237:1\n685#1:1252\n686#1,2:1261\n1161#2,2:1238\n163#3:1240\n163#3:1253\n163#3:1279\n163#3:1291\n460#4,11:1241\n460#4,7:1254\n467#4,4:1263\n460#4,11:1280\n460#4,11:1292\n33#5,6:1267\n33#5,6:1273\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n*L\n750#1:1252\n750#1:1261,2\n668#1:1238,2\n685#1:1240\n750#1:1253\n1020#1:1279\n1049#1:1291\n685#1:1241,11\n750#1:1254,7\n750#1:1263,4\n1020#1:1280,11\n1049#1:1292,11\n776#1:1267,6\n802#1:1273,6\n*E\n"})
    /* renamed from: Om2$a */
    /* loaded from: classes.dex */
    public final class C6111a extends OU3 implements InterfaceC50393vO2, InterfaceC6687Q9 {

        /* renamed from: f */
        public final XC2 f27224f;

        /* renamed from: g */
        public boolean f27225g;

        /* renamed from: h */
        public boolean f27226h;

        /* renamed from: i */
        public boolean f27227i;

        /* renamed from: j */
        public C44228kz0 f27228j;

        /* renamed from: k */
        public long f27229k;

        /* renamed from: l */
        public boolean f27230l;

        /* renamed from: m */
        public boolean f27231m;

        /* renamed from: n */
        public final AbstractC6277P9 f27232n;

        /* renamed from: o */
        public final LX2<InterfaceC50393vO2> f27233o;

        /* renamed from: p */
        public boolean f27234p;

        /* renamed from: q */
        public boolean f27235q;

        /* renamed from: r */
        public Object f27236r;

        /* renamed from: s */
        public final /* synthetic */ C34999Om2 f27237s;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Om2$a$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C6112a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[C33829Jm2.EnumC4228e.values().length];
                try {
                    iArr[C33829Jm2.EnumC4228e.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C33829Jm2.EnumC4228e.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C33829Jm2.EnumC4228e.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[C33829Jm2.EnumC4228e.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[C33829Jm2.EnumC4230g.values().length];
                try {
                    iArr2[C33829Jm2.EnumC4230g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[C33829Jm2.EnumC4230g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "it", "LvO2;", C17296a.f69688o, "(LJm2;)LvO2;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Om2$a$b */
        /* loaded from: classes.dex */
        public static final class C6113b extends Lambda implements Function1<C33829Jm2, InterfaceC50393vO2> {

            /* renamed from: g */
            public static final C6113b f27238g = new C6113b();

            public C6113b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC50393vO2 invoke(C33829Jm2 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C6111a m91506w = it.m99796X().m91506w();
                Intrinsics.checkNotNull(m91506w);
                return m91506w;
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1\n+ 2 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1237:1\n685#2:1238\n686#2,2:1247\n685#2:1265\n686#2,2:1274\n163#3:1239\n163#3:1253\n163#3:1266\n460#4,7:1240\n467#4,4:1249\n460#4,11:1254\n460#4,7:1267\n467#4,4:1276\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1\n*L\n707#1:1238\n707#1:1247,2\n729#1:1265\n729#1:1274,2\n707#1:1239\n711#1:1253\n729#1:1266\n707#1:1240,7\n707#1:1249,4\n711#1:1254,11\n729#1:1267,7\n729#1:1276,4\n*E\n"})
        /* renamed from: Om2$a$c */
        /* loaded from: classes.dex */
        public static final class C6114c extends Lambda implements Function0<Unit> {

            /* renamed from: h */
            public final /* synthetic */ C34999Om2 f27240h;

            /* renamed from: i */
            public final /* synthetic */ TC2 f27241i;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LQ9;", "child", "", C17296a.f69688o, "(LQ9;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Om2$a$c$a */
            /* loaded from: classes.dex */
            public static final class C6115a extends Lambda implements Function1<InterfaceC6687Q9, Unit> {

                /* renamed from: g */
                public static final C6115a f27242g = new C6115a();

                public C6115a() {
                    super(1);
                }

                /* renamed from: a */
                public final void m91483a(InterfaceC6687Q9 child) {
                    Intrinsics.checkNotNullParameter(child, "child");
                    child.mo88870d().m90682t(false);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6687Q9 interfaceC6687Q9) {
                    m91483a(interfaceC6687Q9);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LQ9;", "child", "", C17296a.f69688o, "(LQ9;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Om2$a$c$b */
            /* loaded from: classes.dex */
            public static final class C6116b extends Lambda implements Function1<InterfaceC6687Q9, Unit> {

                /* renamed from: g */
                public static final C6116b f27243g = new C6116b();

                public C6116b() {
                    super(1);
                }

                /* renamed from: a */
                public final void m91482a(InterfaceC6687Q9 child) {
                    Intrinsics.checkNotNullParameter(child, "child");
                    child.mo88870d().m90685q(child.mo88870d().m90690l());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6687Q9 interfaceC6687Q9) {
                    m91482a(interfaceC6687Q9);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6114c(C34999Om2 c34999Om2, TC2 tc2) {
                super(0);
                this.f27240h = c34999Om2;
                this.f27241i = tc2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a8 A[ORIG_RETURN, RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke2() {
                int m96690u;
                int m96690u2;
                LX2<C33829Jm2> m99736w0 = C6111a.this.f27237s.f27212a.m99736w0();
                int m96690u3 = m99736w0.m96690u();
                int i = 0;
                if (m96690u3 > 0) {
                    C33829Jm2[] m96691s = m99736w0.m96691s();
                    int i2 = 0;
                    do {
                        C6111a m91506w = m96691s[i2].m99796X().m91506w();
                        Intrinsics.checkNotNull(m91506w);
                        m91506w.f27231m = m91506w.mo88869n();
                        m91506w.m91500C1(false);
                        i2++;
                    } while (i2 < m96690u3);
                    LX2<C33829Jm2> m99736w02 = this.f27240h.f27212a.m99736w0();
                    m96690u = m99736w02.m96690u();
                    if (m96690u <= 0) {
                        C33829Jm2[] m96691s2 = m99736w02.m96691s();
                        int i3 = 0;
                        do {
                            C33829Jm2 c33829Jm2 = m96691s2[i3];
                            if (c33829Jm2.m99771j0() == C33829Jm2.EnumC4230g.InLayoutBlock) {
                                c33829Jm2.m99732x1(C33829Jm2.EnumC4230g.NotUsed);
                            }
                            i3++;
                        } while (i3 < m96690u);
                        C6111a.this.mo88871Y0(C6115a.f27242g);
                        this.f27241i.mo84221s1().mo1429c();
                        C6111a.this.mo88871Y0(C6116b.f27243g);
                        LX2<C33829Jm2> m99736w03 = C6111a.this.f27237s.f27212a.m99736w0();
                        m96690u2 = m99736w03.m96690u();
                        if (m96690u2 <= 0) {
                            C33829Jm2[] m96691s3 = m99736w03.m96691s();
                            do {
                                C6111a m91506w2 = m96691s3[i].m99796X().m91506w();
                                Intrinsics.checkNotNull(m91506w2);
                                if (!m91506w2.mo88869n()) {
                                    m91506w2.m91491t1();
                                }
                                i++;
                            } while (i < m96690u2);
                            return;
                        }
                        return;
                    }
                    C6111a.this.mo88871Y0(C6115a.f27242g);
                    this.f27241i.mo84221s1().mo1429c();
                    C6111a.this.mo88871Y0(C6116b.f27243g);
                    LX2<C33829Jm2> m99736w032 = C6111a.this.f27237s.f27212a.m99736w0();
                    m96690u2 = m99736w032.m96690u();
                    if (m96690u2 <= 0) {
                    }
                } else {
                    LX2<C33829Jm2> m99736w022 = this.f27240h.f27212a.m99736w0();
                    m96690u = m99736w022.m96690u();
                    if (m96690u <= 0) {
                    }
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Om2$a$d */
        /* loaded from: classes.dex */
        public static final class C6117d extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C34999Om2 f27244g;

            /* renamed from: h */
            public final /* synthetic */ long f27245h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6117d(C34999Om2 c34999Om2, long j) {
                super(0);
                this.f27244g = c34999Om2;
                this.f27245h = j;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                OU3.AbstractC6015a.C6016a c6016a = OU3.AbstractC6015a.f26640a;
                C34999Om2 c34999Om2 = this.f27244g;
                long j = this.f27245h;
                TC2 m104314d2 = c34999Om2.m91503z().m104314d2();
                Intrinsics.checkNotNull(m104314d2);
                OU3.AbstractC6015a.m92207p(c6016a, m104314d2, j, 0.0f, 2, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LQ9;", "it", "", C17296a.f69688o, "(LQ9;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Om2$a$e */
        /* loaded from: classes.dex */
        public static final class C6118e extends Lambda implements Function1<InterfaceC6687Q9, Unit> {

            /* renamed from: g */
            public static final C6118e f27246g = new C6118e();

            public C6118e() {
                super(1);
            }

            /* renamed from: a */
            public final void m91481a(InterfaceC6687Q9 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.mo88870d().m90681u(false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6687Q9 interfaceC6687Q9) {
                m91481a(interfaceC6687Q9);
                return Unit.INSTANCE;
            }
        }

        public C6111a(C34999Om2 c34999Om2, XC2 lookaheadScope) {
            Intrinsics.checkNotNullParameter(lookaheadScope, "lookaheadScope");
            this.f27237s = c34999Om2;
            this.f27224f = lookaheadScope;
            this.f27229k = A52.f130b.m116106a();
            this.f27230l = true;
            this.f27232n = new RC2(this);
            this.f27233o = new LX2<>(new InterfaceC50393vO2[16], 0);
            this.f27234p = true;
            this.f27235q = true;
            this.f27236r = c34999Om2.m91505x().mo77401c();
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: A */
        public void mo88874A() {
            C33829Jm2.m99770j1(this.f27237s.f27212a, false, 1, null);
        }

        /* renamed from: A1 */
        public final void m91502A1() {
            LX2<C33829Jm2> m99736w0 = this.f27237s.f27212a.m99736w0();
            int m96690u = m99736w0.m96690u();
            if (m96690u > 0) {
                C33829Jm2[] m96691s = m99736w0.m96691s();
                int i = 0;
                do {
                    C33829Jm2 c33829Jm2 = m96691s[i];
                    c33829Jm2.m99758o1(c33829Jm2);
                    C6111a m91506w = c33829Jm2.m99796X().m91506w();
                    Intrinsics.checkNotNull(m91506w);
                    m91506w.m91502A1();
                    i++;
                } while (i < m96690u);
            }
        }

        @Override // p000.X62
        /* renamed from: B */
        public int mo77402B(int i) {
            m91488w1();
            TC2 m104314d2 = this.f27237s.m91503z().m104314d2();
            Intrinsics.checkNotNull(m104314d2);
            return m104314d2.mo77402B(i);
        }

        /* renamed from: B1 */
        public final void m91501B1(boolean z) {
            this.f27234p = z;
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: C */
        public InterfaceC6687Q9 mo88873C() {
            C34999Om2 m99796X;
            C33829Jm2 m99756p0 = this.f27237s.f27212a.m99756p0();
            if (m99756p0 == null || (m99796X = m99756p0.m99796X()) == null) {
                return null;
            }
            return m99796X.m91509t();
        }

        /* renamed from: C1 */
        public void m91500C1(boolean z) {
            this.f27230l = z;
        }

        /* renamed from: D1 */
        public final void m91499D1(C33829Jm2 c33829Jm2) {
            boolean z;
            C33829Jm2.EnumC4230g enumC4230g;
            C33829Jm2 m99756p0 = c33829Jm2.m99756p0();
            if (m99756p0 != null) {
                if (c33829Jm2.m99771j0() != C33829Jm2.EnumC4230g.NotUsed && !c33829Jm2.m99825I()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    int i = C6112a.$EnumSwitchMapping$0[m99756p0.m99792Z().ordinal()];
                    if (i != 1 && i != 2) {
                        if (i != 3 && i != 4) {
                            throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + m99756p0.m99792Z());
                        }
                        enumC4230g = C33829Jm2.EnumC4230g.InLayoutBlock;
                    } else {
                        enumC4230g = C33829Jm2.EnumC4230g.InMeasureBlock;
                    }
                    c33829Jm2.m99732x1(enumC4230g);
                    return;
                }
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + c33829Jm2.m99771j0() + ". Parent state " + m99756p0.m99792Z() + CoreConstants.DOT).toString());
            }
            c33829Jm2.m99732x1(C33829Jm2.EnumC4230g.NotUsed);
        }

        /* renamed from: E1 */
        public final boolean m91498E1() {
            if (!this.f27235q) {
                return false;
            }
            this.f27235q = false;
            Object mo77401c = mo77401c();
            TC2 m104314d2 = this.f27237s.m91503z().m104314d2();
            Intrinsics.checkNotNull(m104314d2);
            boolean z = !Intrinsics.areEqual(mo77401c, m104314d2.mo77401c());
            TC2 m104314d22 = this.f27237s.m91503z().m104314d2();
            Intrinsics.checkNotNull(m104314d22);
            this.f27236r = m104314d22.mo77401c();
            return z;
        }

        @Override // p000.InterfaceC50393vO2
        /* renamed from: P0 */
        public OU3 mo8763P0(long j) {
            m91499D1(this.f27237s.f27212a);
            if (this.f27237s.f27212a.m99798W() == C33829Jm2.EnumC4230g.NotUsed) {
                this.f27237s.f27212a.m99844A();
            }
            m91486y1(j);
            return this;
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: S */
        public void mo88872S() {
            mo88870d().m90687o();
            if (this.f27237s.m91508u()) {
                m91489v1();
            }
            TC2 m104314d2 = mo88867o0().m104314d2();
            Intrinsics.checkNotNull(m104314d2);
            if (this.f27237s.f27219h || (!this.f27225g && !m104314d2.m85844w1() && this.f27237s.m91508u())) {
                this.f27237s.f27218g = false;
                C33829Jm2.EnumC4228e m91510s = this.f27237s.m91510s();
                this.f27237s.f27213b = C33829Jm2.EnumC4228e.LookaheadLayingOut;
                C44960mD3.m26013e(C34765Nm2.m93440a(this.f27237s.f27212a).mo30989l(), this.f27237s.f27212a, false, new C6114c(this.f27237s, m104314d2), 2, null);
                this.f27237s.f27213b = m91510s;
                if (this.f27237s.m91515n() && m104314d2.m85844w1()) {
                    requestLayout();
                }
                this.f27237s.f27219h = false;
            }
            if (mo88870d().m90690l()) {
                mo88870d().m90685q(true);
            }
            if (mo88870d().m90694g() && mo88870d().m90691k()) {
                mo88870d().m90688n();
            }
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: Y0 */
        public void mo88871Y0(Function1<? super InterfaceC6687Q9, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            List<C33829Jm2> m99818M = this.f27237s.f27212a.m99818M();
            int size = m99818M.size();
            for (int i = 0; i < size; i++) {
                InterfaceC6687Q9 m91509t = m99818M.get(i).m99796X().m91509t();
                Intrinsics.checkNotNull(m91509t);
                block.invoke(m91509t);
            }
        }

        @Override // p000.AO2, p000.X62
        /* renamed from: c */
        public Object mo77401c() {
            return this.f27236r;
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: d */
        public AbstractC6277P9 mo88870d() {
            return this.f27232n;
        }

        @Override // p000.OU3
        /* renamed from: e1 */
        public int mo91480e1() {
            TC2 m104314d2 = this.f27237s.m91503z().m104314d2();
            Intrinsics.checkNotNull(m104314d2);
            return m104314d2.mo91480e1();
        }

        @Override // p000.X62
        /* renamed from: g0 */
        public int mo77400g0(int i) {
            m91488w1();
            TC2 m104314d2 = this.f27237s.m91503z().m104314d2();
            Intrinsics.checkNotNull(m104314d2);
            return m104314d2.mo77400g0(i);
        }

        @Override // p000.OU3
        /* renamed from: g1 */
        public int mo91479g1() {
            TC2 m104314d2 = this.f27237s.m91503z().m104314d2();
            Intrinsics.checkNotNull(m104314d2);
            return m104314d2.mo91479g1();
        }

        @Override // p000.OU3
        /* renamed from: j1 */
        public void mo35855j1(long j, float f, Function1<? super InterfaceC11328c, Unit> function1) {
            this.f27237s.f27213b = C33829Jm2.EnumC4228e.LookaheadLayingOut;
            this.f27226h = true;
            if (!A52.m116112i(j, this.f27229k)) {
                m91490u1();
            }
            mo88870d().m90684r(false);
            InterfaceC43181jD3 m93440a = C34765Nm2.m93440a(this.f27237s.f27212a);
            this.f27237s.m91530N(false);
            C44960mD3.m26015c(m93440a.mo30989l(), this.f27237s.f27212a, false, new C6117d(this.f27237s, j), 2, null);
            this.f27229k = j;
            this.f27237s.f27213b = C33829Jm2.EnumC4228e.Idle;
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: n */
        public boolean mo88869n() {
            return this.f27230l;
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: o */
        public Map<AbstractC4750L9, Integer> mo88868o() {
            if (!this.f27225g) {
                if (this.f27237s.m91510s() == C33829Jm2.EnumC4228e.LookaheadMeasuring) {
                    mo88870d().m90683s(true);
                    if (mo88870d().m90694g()) {
                        this.f27237s.m91538F();
                    }
                } else {
                    mo88870d().m90684r(true);
                }
            }
            TC2 m104314d2 = mo88867o0().m104314d2();
            if (m104314d2 != null) {
                m104314d2.m85842z1(true);
            }
            mo88872S();
            TC2 m104314d22 = mo88867o0().m104314d2();
            if (m104314d22 != null) {
                m104314d22.m85842z1(false);
            }
            return mo88870d().m90693h();
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: o0 */
        public H83 mo88867o0() {
            return this.f27237s.f27212a.m99806S();
        }

        @Override // p000.X62
        /* renamed from: p0 */
        public int mo77399p0(int i) {
            m91488w1();
            TC2 m104314d2 = this.f27237s.m91503z().m104314d2();
            Intrinsics.checkNotNull(m104314d2);
            return m104314d2.mo77399p0(i);
        }

        /* renamed from: p1 */
        public final List<InterfaceC50393vO2> m91495p1() {
            this.f27237s.f27212a.m99818M();
            if (!this.f27234p) {
                return this.f27233o.m96697g();
            }
            C35233Pm2.m89797a(this.f27237s.f27212a, this.f27233o, C6113b.f27238g);
            this.f27234p = false;
            return this.f27233o.m96697g();
        }

        /* renamed from: q1 */
        public final C44228kz0 m91494q1() {
            return this.f27228j;
        }

        /* renamed from: r1 */
        public final void m91493r1(boolean z) {
            C33829Jm2 m99756p0;
            C33829Jm2 m99756p02 = this.f27237s.f27212a.m99756p0();
            C33829Jm2.EnumC4230g m99798W = this.f27237s.f27212a.m99798W();
            if (m99756p02 != null && m99798W != C33829Jm2.EnumC4230g.NotUsed) {
                while (m99756p02.m99798W() == m99798W && (m99756p0 = m99756p02.m99756p0()) != null) {
                    m99756p02 = m99756p0;
                }
                int i = C6112a.$EnumSwitchMapping$1[m99798W.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        m99756p02.m99776g1(z);
                        return;
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                m99756p02.m99772i1(z);
            }
        }

        @Override // p000.InterfaceC6687Q9
        public void requestLayout() {
            C33829Jm2.m99774h1(this.f27237s.f27212a, false, 1, null);
        }

        /* renamed from: s1 */
        public final void m91492s1() {
            this.f27235q = true;
        }

        @Override // p000.X62
        /* renamed from: t0 */
        public int mo77398t0(int i) {
            m91488w1();
            TC2 m104314d2 = this.f27237s.m91503z().m104314d2();
            Intrinsics.checkNotNull(m104314d2);
            return m104314d2.mo77398t0(i);
        }

        /* renamed from: t1 */
        public final void m91491t1() {
            int i = 0;
            m91500C1(false);
            LX2<C33829Jm2> m99736w0 = this.f27237s.f27212a.m99736w0();
            int m96690u = m99736w0.m96690u();
            if (m96690u > 0) {
                C33829Jm2[] m96691s = m99736w0.m96691s();
                do {
                    C6111a m91506w = m96691s[i].m99796X().m91506w();
                    Intrinsics.checkNotNull(m91506w);
                    m91506w.m91491t1();
                    i++;
                } while (i < m96690u);
            }
        }

        /* renamed from: u1 */
        public final void m91490u1() {
            if (this.f27237s.m91516m() > 0) {
                List<C33829Jm2> m99818M = this.f27237s.f27212a.m99818M();
                int size = m99818M.size();
                for (int i = 0; i < size; i++) {
                    C33829Jm2 c33829Jm2 = m99818M.get(i);
                    C34999Om2 m99796X = c33829Jm2.m99796X();
                    if (m99796X.m91515n() && !m99796X.m91511r()) {
                        C33829Jm2.m99774h1(c33829Jm2, false, 1, null);
                    }
                    C6111a m91506w = m99796X.m91506w();
                    if (m91506w != null) {
                        m91506w.m91490u1();
                    }
                }
            }
        }

        @Override // p000.AO2
        /* renamed from: v */
        public int mo35854v(AbstractC4750L9 alignmentLine) {
            C33829Jm2.EnumC4228e enumC4228e;
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            C33829Jm2 m99756p0 = this.f27237s.f27212a.m99756p0();
            C33829Jm2.EnumC4228e enumC4228e2 = null;
            if (m99756p0 != null) {
                enumC4228e = m99756p0.m99792Z();
            } else {
                enumC4228e = null;
            }
            if (enumC4228e == C33829Jm2.EnumC4228e.LookaheadMeasuring) {
                mo88870d().m90681u(true);
            } else {
                C33829Jm2 m99756p02 = this.f27237s.f27212a.m99756p0();
                if (m99756p02 != null) {
                    enumC4228e2 = m99756p02.m99792Z();
                }
                if (enumC4228e2 == C33829Jm2.EnumC4228e.LookaheadLayingOut) {
                    mo88870d().m90682t(true);
                }
            }
            this.f27225g = true;
            TC2 m104314d2 = this.f27237s.m91503z().m104314d2();
            Intrinsics.checkNotNull(m104314d2);
            int mo35854v = m104314d2.mo35854v(alignmentLine);
            this.f27225g = false;
            return mo35854v;
        }

        /* renamed from: v1 */
        public final void m91489v1() {
            C33829Jm2 c33829Jm2 = this.f27237s.f27212a;
            C34999Om2 c34999Om2 = this.f27237s;
            LX2<C33829Jm2> m99736w0 = c33829Jm2.m99736w0();
            int m96690u = m99736w0.m96690u();
            if (m96690u > 0) {
                C33829Jm2[] m96691s = m99736w0.m96691s();
                int i = 0;
                do {
                    C33829Jm2 c33829Jm22 = m96691s[i];
                    if (c33829Jm22.m99787b0() && c33829Jm22.m99771j0() == C33829Jm2.EnumC4230g.InMeasureBlock) {
                        C6111a m91506w = c33829Jm22.m99796X().m91506w();
                        Intrinsics.checkNotNull(m91506w);
                        C44228kz0 m91494q1 = m91494q1();
                        Intrinsics.checkNotNull(m91494q1);
                        if (m91506w.m91486y1(m91494q1.m28058s())) {
                            C33829Jm2.m99770j1(c34999Om2.f27212a, false, 1, null);
                        }
                    }
                    i++;
                } while (i < m96690u);
            }
        }

        /* renamed from: w1 */
        public final void m91488w1() {
            C33829Jm2.EnumC4230g enumC4230g;
            C33829Jm2.m99770j1(this.f27237s.f27212a, false, 1, null);
            C33829Jm2 m99756p0 = this.f27237s.f27212a.m99756p0();
            if (m99756p0 != null && this.f27237s.f27212a.m99798W() == C33829Jm2.EnumC4230g.NotUsed) {
                C33829Jm2 c33829Jm2 = this.f27237s.f27212a;
                int i = C6112a.$EnumSwitchMapping$0[m99756p0.m99792Z().ordinal()];
                if (i != 2) {
                    if (i != 3) {
                        enumC4230g = m99756p0.m99798W();
                    } else {
                        enumC4230g = C33829Jm2.EnumC4230g.InLayoutBlock;
                    }
                } else {
                    enumC4230g = C33829Jm2.EnumC4230g.InMeasureBlock;
                }
                c33829Jm2.m99740u1(enumC4230g);
            }
        }

        /* renamed from: x1 */
        public final void m91487x1() {
            if (!mo88869n()) {
                m91500C1(true);
                if (!this.f27231m) {
                    m91502A1();
                }
            }
        }

        /* renamed from: y1 */
        public final boolean m91486y1(long j) {
            boolean z;
            boolean z2;
            boolean m28070g;
            C33829Jm2 m99756p0 = this.f27237s.f27212a.m99756p0();
            C33829Jm2 c33829Jm2 = this.f27237s.f27212a;
            if (!this.f27237s.f27212a.m99825I() && (m99756p0 == null || !m99756p0.m99825I())) {
                z = false;
            } else {
                z = true;
            }
            c33829Jm2.m99749r1(z);
            if (!this.f27237s.f27212a.m99787b0()) {
                C44228kz0 c44228kz0 = this.f27228j;
                if (c44228kz0 == null) {
                    m28070g = false;
                } else {
                    m28070g = C44228kz0.m28070g(c44228kz0.m28058s(), j);
                }
                if (m28070g) {
                    return false;
                }
            }
            this.f27228j = C44228kz0.m28075b(j);
            mo88870d().m90683s(false);
            mo88871Y0(C6118e.f27246g);
            this.f27227i = true;
            TC2 m104314d2 = this.f27237s.m91503z().m104314d2();
            if (m104314d2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long m104430a = H52.m104430a(m104314d2.m92226i1(), m104314d2.m92229d1());
                this.f27237s.m91534J(j);
                m92224l1(H52.m104430a(m104314d2.m92226i1(), m104314d2.m92229d1()));
                if (G52.m105829g(m104430a) != m104314d2.m92226i1() || G52.m105830f(m104430a) != m104314d2.m92229d1()) {
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
        }

        /* renamed from: z1 */
        public final void m91485z1() {
            if (this.f27226h) {
                mo35855j1(this.f27229k, 0.0f, null);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\bp\u0010qJ\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002J@\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0002\b\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u001d\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0002J@\u0010\u001f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0002\b\rH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0010J\u0006\u0010 \u001a\u00020\u0005J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001dH\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001dH\u0016J\u0006\u0010'\u001a\u00020\u0005J\u0006\u0010(\u001a\u00020\u0018J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0)H\u0016J\u001c\u0010,\u001a\u00020\u00052\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\u0006\u0010/\u001a\u00020\u0005J\u000e\u00101\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0018R\u0016\u00104\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\"\u0010<\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00103\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001f\u0010?\u001a\u00020\u00078\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b=\u0010>R)\u0010B\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0002\b\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00103R(\u0010N\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010H8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010T\u001a\u00020O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00010U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010VR\"\u0010[\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u00103\u001a\u0004\bY\u00109\"\u0004\bZ\u0010;R\u001c\u0010^\u001a\u0004\u0018\u00010\u00148Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u00109R\u0014\u0010c\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00010d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010j\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010iR\u0016\u0010o\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006r"}, m28432d2 = {"LOm2$b;", "LvO2;", "LOU3;", "LQ9;", "LJm2;", "", "y1", "LA52;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "u1", "(JFLkotlin/jvm/functions/Function1;)V", "t1", "s1", "S", "Lkz0;", "constraints", "P0", "(J)LOU3;", "", "v1", "(J)Z", "LL9;", "alignmentLine", "", "v", "j1", "w1", "height", "p0", "t0", "width", "g0", "B", "q1", "z1", "", "o", "block", "Y0", "requestLayout", "A", "r1", "forceRequest", "p1", "f", "Z", "measuredOnce", "g", "placedOnce", "h", "getDuringAlignmentLinesQuery$ui_release", "()Z", "setDuringAlignmentLinesQuery$ui_release", "(Z)V", "duringAlignmentLinesQuery", "i", "J", "lastPosition", "j", "Lkotlin/jvm/functions/Function1;", "lastLayerBlock", "k", "F", "lastZIndex", "l", "parentDataDirty", "", "<set-?>", "m", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "parentData", "LP9;", "n", "LP9;", DateTokenConverter.CONVERTER_KEY, "()LP9;", "alignmentLines", "LLX2;", "LLX2;", "_childMeasurables", "p", "getChildMeasurablesDirty$ui_release", "x1", "childMeasurablesDirty", "o1", "()Lkz0;", "lastConstraints", "isPlaced", "LH83;", "o0", "()LH83;", "innerCoordinator", "", "n1", "()Ljava/util/List;", "childMeasurables", "g1", "()I", "measuredWidth", "e1", "measuredHeight", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()LQ9;", "parentAlignmentLinesOwner", "<init>", "(LOm2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1237:1\n1161#2,2:1238\n33#3,6:1240\n33#3,6:1246\n163#4:1252\n460#5,11:1253\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n*L\n235#1:1238,2\n548#1:1240,6\n574#1:1246,6\n609#1:1252\n609#1:1253,11\n*E\n"})
    /* renamed from: Om2$b */
    /* loaded from: classes.dex */
    public final class C6119b extends OU3 implements InterfaceC50393vO2, InterfaceC6687Q9 {

        /* renamed from: f */
        public boolean f27247f;

        /* renamed from: g */
        public boolean f27248g;

        /* renamed from: h */
        public boolean f27249h;

        /* renamed from: j */
        public Function1<? super InterfaceC11328c, Unit> f27251j;

        /* renamed from: k */
        public float f27252k;

        /* renamed from: m */
        public Object f27254m;

        /* renamed from: i */
        public long f27250i = A52.f130b.m116106a();

        /* renamed from: l */
        public boolean f27253l = true;

        /* renamed from: n */
        public final AbstractC6277P9 f27255n = new C34063Km2(this);

        /* renamed from: o */
        public final LX2<InterfaceC50393vO2> f27256o = new LX2<>(new InterfaceC50393vO2[16], 0);

        /* renamed from: p */
        public boolean f27257p = true;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Om2$b$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C6120a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[C33829Jm2.EnumC4228e.values().length];
                try {
                    iArr[C33829Jm2.EnumC4228e.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C33829Jm2.EnumC4228e.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[C33829Jm2.EnumC4230g.values().length];
                try {
                    iArr2[C33829Jm2.EnumC4230g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[C33829Jm2.EnumC4230g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJm2;", "it", "LvO2;", C17296a.f69688o, "(LJm2;)LvO2;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Om2$b$b */
        /* loaded from: classes.dex */
        public static final class C6121b extends Lambda implements Function1<C33829Jm2, InterfaceC50393vO2> {

            /* renamed from: g */
            public static final C6121b f27259g = new C6121b();

            public C6121b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC50393vO2 invoke(C33829Jm2 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.m99796X().m91505x();
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Om2$b$c */
        /* loaded from: classes.dex */
        public static final class C6122c extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C34999Om2 f27260g;

            /* renamed from: h */
            public final /* synthetic */ C6119b f27261h;

            /* renamed from: i */
            public final /* synthetic */ C33829Jm2 f27262i;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LQ9;", "it", "", C17296a.f69688o, "(LQ9;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Om2$b$c$a */
            /* loaded from: classes.dex */
            public static final class C6123a extends Lambda implements Function1<InterfaceC6687Q9, Unit> {

                /* renamed from: g */
                public static final C6123a f27263g = new C6123a();

                public C6123a() {
                    super(1);
                }

                /* renamed from: a */
                public final void m91464a(InterfaceC6687Q9 it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.mo88870d().m90690l();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6687Q9 interfaceC6687Q9) {
                    m91464a(interfaceC6687Q9);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LQ9;", "it", "", C17296a.f69688o, "(LQ9;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Om2$b$c$b */
            /* loaded from: classes.dex */
            public static final class C6124b extends Lambda implements Function1<InterfaceC6687Q9, Unit> {

                /* renamed from: g */
                public static final C6124b f27264g = new C6124b();

                public C6124b() {
                    super(1);
                }

                /* renamed from: a */
                public final void m91463a(InterfaceC6687Q9 it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.mo88870d().m90685q(it.mo88870d().m90690l());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6687Q9 interfaceC6687Q9) {
                    m91463a(interfaceC6687Q9);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6122c(C34999Om2 c34999Om2, C6119b c6119b, C33829Jm2 c33829Jm2) {
                super(0);
                this.f27260g = c34999Om2;
                this.f27261h = c6119b;
                this.f27262i = c33829Jm2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f27260g.f27212a.m99728z();
                this.f27261h.mo88871Y0(C6123a.f27263g);
                this.f27262i.m99806S().mo84221s1().mo1429c();
                this.f27260g.f27212a.m99731y();
                this.f27261h.mo88871Y0(C6124b.f27264g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Om2$b$d */
        /* loaded from: classes.dex */
        public static final class C6125d extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ Function1<InterfaceC11328c, Unit> f27265g;

            /* renamed from: h */
            public final /* synthetic */ C34999Om2 f27266h;

            /* renamed from: i */
            public final /* synthetic */ long f27267i;

            /* renamed from: j */
            public final /* synthetic */ float f27268j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C6125d(Function1<? super InterfaceC11328c, Unit> function1, C34999Om2 c34999Om2, long j, float f) {
                super(0);
                this.f27265g = function1;
                this.f27266h = c34999Om2;
                this.f27267i = j;
                this.f27268j = f;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                OU3.AbstractC6015a.C6016a c6016a = OU3.AbstractC6015a.f26640a;
                Function1<InterfaceC11328c, Unit> function1 = this.f27265g;
                C34999Om2 c34999Om2 = this.f27266h;
                long j = this.f27267i;
                float f = this.f27268j;
                if (function1 == null) {
                    c6016a.m92208o(c34999Om2.m91503z(), j, f);
                } else {
                    c6016a.m92222A(c34999Om2.m91503z(), j, f, function1);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LQ9;", "it", "", C17296a.f69688o, "(LQ9;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Om2$b$e */
        /* loaded from: classes.dex */
        public static final class C6126e extends Lambda implements Function1<InterfaceC6687Q9, Unit> {

            /* renamed from: g */
            public static final C6126e f27269g = new C6126e();

            public C6126e() {
                super(1);
            }

            /* renamed from: a */
            public final void m91462a(InterfaceC6687Q9 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.mo88870d().m90681u(false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6687Q9 interfaceC6687Q9) {
                m91462a(interfaceC6687Q9);
                return Unit.INSTANCE;
            }
        }

        public C6119b() {
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: A */
        public void mo88874A() {
            C33829Jm2.m99761n1(C34999Om2.this.f27212a, false, 1, null);
        }

        @Override // p000.X62
        /* renamed from: B */
        public int mo77402B(int i) {
            m91472t1();
            return C34999Om2.this.m91503z().mo77402B(i);
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: C */
        public InterfaceC6687Q9 mo88873C() {
            C34999Om2 m99796X;
            C33829Jm2 m99756p0 = C34999Om2.this.f27212a.m99756p0();
            if (m99756p0 == null || (m99796X = m99756p0.m99796X()) == null) {
                return null;
            }
            return m99796X.m91517l();
        }

        @Override // p000.InterfaceC50393vO2
        /* renamed from: P0 */
        public OU3 mo8763P0(long j) {
            C33829Jm2.EnumC4230g m99798W = C34999Om2.this.f27212a.m99798W();
            C33829Jm2.EnumC4230g enumC4230g = C33829Jm2.EnumC4230g.NotUsed;
            if (m99798W == enumC4230g) {
                C34999Om2.this.f27212a.m99844A();
            }
            C34999Om2 c34999Om2 = C34999Om2.this;
            if (c34999Om2.m91541C(c34999Om2.f27212a)) {
                this.f27247f = true;
                m92223m1(j);
                C34999Om2.this.f27212a.m99732x1(enumC4230g);
                C6111a m91506w = C34999Om2.this.m91506w();
                Intrinsics.checkNotNull(m91506w);
                m91506w.mo8763P0(j);
            }
            m91467y1(C34999Om2.this.f27212a);
            m91470v1(j);
            return this;
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: S */
        public void mo88872S() {
            mo88870d().m90687o();
            if (C34999Om2.this.m91511r()) {
                m91473s1();
            }
            if (C34999Om2.this.f27216e || (!this.f27249h && !mo88867o0().m85844w1() && C34999Om2.this.m91511r())) {
                C34999Om2.this.f27215d = false;
                C33829Jm2.EnumC4228e m91510s = C34999Om2.this.m91510s();
                C34999Om2.this.f27213b = C33829Jm2.EnumC4228e.LayingOut;
                C33829Jm2 c33829Jm2 = C34999Om2.this.f27212a;
                C34765Nm2.m93440a(c33829Jm2).mo30989l().m26014d(c33829Jm2, false, new C6122c(C34999Om2.this, this, c33829Jm2));
                C34999Om2.this.f27213b = m91510s;
                if (mo88867o0().m85844w1() && C34999Om2.this.m91515n()) {
                    requestLayout();
                }
                C34999Om2.this.f27216e = false;
            }
            if (mo88870d().m90690l()) {
                mo88870d().m90685q(true);
            }
            if (mo88870d().m90694g() && mo88870d().m90691k()) {
                mo88870d().m90688n();
            }
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: Y0 */
        public void mo88871Y0(Function1<? super InterfaceC6687Q9, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            List<C33829Jm2> m99818M = C34999Om2.this.f27212a.m99818M();
            int size = m99818M.size();
            for (int i = 0; i < size; i++) {
                block.invoke(m99818M.get(i).m99796X().m91517l());
            }
        }

        @Override // p000.AO2, p000.X62
        /* renamed from: c */
        public Object mo77401c() {
            return this.f27254m;
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: d */
        public AbstractC6277P9 mo88870d() {
            return this.f27255n;
        }

        @Override // p000.OU3
        /* renamed from: e1 */
        public int mo91480e1() {
            return C34999Om2.this.m91503z().mo91480e1();
        }

        @Override // p000.X62
        /* renamed from: g0 */
        public int mo77400g0(int i) {
            m91472t1();
            return C34999Om2.this.m91503z().mo77400g0(i);
        }

        @Override // p000.OU3
        /* renamed from: g1 */
        public int mo91479g1() {
            return C34999Om2.this.m91503z().mo91479g1();
        }

        @Override // p000.OU3
        /* renamed from: j1 */
        public void mo35855j1(long j, float f, Function1<? super InterfaceC11328c, Unit> function1) {
            if (!A52.m116112i(j, this.f27250i)) {
                m91474r1();
            }
            C34999Om2 c34999Om2 = C34999Om2.this;
            if (c34999Om2.m91541C(c34999Om2.f27212a)) {
                OU3.AbstractC6015a.C6016a c6016a = OU3.AbstractC6015a.f26640a;
                C6111a m91506w = C34999Om2.this.m91506w();
                Intrinsics.checkNotNull(m91506w);
                OU3.AbstractC6015a.m92209n(c6016a, m91506w, A52.m116111j(j), A52.m116110k(j), 0.0f, 4, null);
            }
            C34999Om2.this.f27213b = C33829Jm2.EnumC4228e.LayingOut;
            m91471u1(j, f, function1);
            C34999Om2.this.f27213b = C33829Jm2.EnumC4228e.Idle;
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: n */
        public boolean mo88869n() {
            return C34999Om2.this.f27212a.mo8156n();
        }

        /* renamed from: n1 */
        public final List<InterfaceC50393vO2> m91478n1() {
            C34999Om2.this.f27212a.m99836C1();
            if (!this.f27257p) {
                return this.f27256o.m96697g();
            }
            C35233Pm2.m89797a(C34999Om2.this.f27212a, this.f27256o, C6121b.f27259g);
            this.f27257p = false;
            return this.f27256o.m96697g();
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: o */
        public Map<AbstractC4750L9, Integer> mo88868o() {
            if (!this.f27249h) {
                if (C34999Om2.this.m91510s() == C33829Jm2.EnumC4228e.Measuring) {
                    mo88870d().m90683s(true);
                    if (mo88870d().m90694g()) {
                        C34999Om2.this.m91539E();
                    }
                } else {
                    mo88870d().m90684r(true);
                }
            }
            mo88867o0().m85842z1(true);
            mo88872S();
            mo88867o0().m85842z1(false);
            return mo88870d().m90693h();
        }

        @Override // p000.InterfaceC6687Q9
        /* renamed from: o0 */
        public H83 mo88867o0() {
            return C34999Om2.this.f27212a.m99806S();
        }

        /* renamed from: o1 */
        public final C44228kz0 m91477o1() {
            if (this.f27247f) {
                return C44228kz0.m28075b(m92227h1());
            }
            return null;
        }

        @Override // p000.X62
        /* renamed from: p0 */
        public int mo77399p0(int i) {
            m91472t1();
            return C34999Om2.this.m91503z().mo77399p0(i);
        }

        /* renamed from: p1 */
        public final void m91476p1(boolean z) {
            C33829Jm2 m99756p0;
            C33829Jm2 m99756p02 = C34999Om2.this.f27212a.m99756p0();
            C33829Jm2.EnumC4230g m99798W = C34999Om2.this.f27212a.m99798W();
            if (m99756p02 != null && m99798W != C33829Jm2.EnumC4230g.NotUsed) {
                while (m99756p02.m99798W() == m99798W && (m99756p0 = m99756p02.m99756p0()) != null) {
                    m99756p02 = m99756p0;
                }
                int i = C6120a.$EnumSwitchMapping$1[m99798W.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        m99756p02.m99767k1(z);
                        return;
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                m99756p02.m99763m1(z);
            }
        }

        /* renamed from: q1 */
        public final void m91475q1() {
            this.f27253l = true;
        }

        /* renamed from: r1 */
        public final void m91474r1() {
            if (C34999Om2.this.m91516m() > 0) {
                List<C33829Jm2> m99818M = C34999Om2.this.f27212a.m99818M();
                int size = m99818M.size();
                for (int i = 0; i < size; i++) {
                    C33829Jm2 c33829Jm2 = m99818M.get(i);
                    C34999Om2 m99796X = c33829Jm2.m99796X();
                    if (m99796X.m91515n() && !m99796X.m91511r()) {
                        C33829Jm2.m99765l1(c33829Jm2, false, 1, null);
                    }
                    m99796X.m91505x().m91474r1();
                }
            }
        }

        @Override // p000.InterfaceC6687Q9
        public void requestLayout() {
            C33829Jm2.m99765l1(C34999Om2.this.f27212a, false, 1, null);
        }

        /* renamed from: s1 */
        public final void m91473s1() {
            C33829Jm2 c33829Jm2 = C34999Om2.this.f27212a;
            C34999Om2 c34999Om2 = C34999Om2.this;
            LX2<C33829Jm2> m99736w0 = c33829Jm2.m99736w0();
            int m96690u = m99736w0.m96690u();
            if (m96690u > 0) {
                C33829Jm2[] m96691s = m99736w0.m96691s();
                int i = 0;
                do {
                    C33829Jm2 c33829Jm22 = m96691s[i];
                    if (c33829Jm22.m99777g0() && c33829Jm22.m99773i0() == C33829Jm2.EnumC4230g.InMeasureBlock && C33829Jm2.m99784c1(c33829Jm22, null, 1, null)) {
                        C33829Jm2.m99761n1(c34999Om2.f27212a, false, 1, null);
                    }
                    i++;
                } while (i < m96690u);
            }
        }

        @Override // p000.X62
        /* renamed from: t0 */
        public int mo77398t0(int i) {
            m91472t1();
            return C34999Om2.this.m91503z().mo77398t0(i);
        }

        /* renamed from: t1 */
        public final void m91472t1() {
            C33829Jm2.EnumC4230g enumC4230g;
            C33829Jm2.m99761n1(C34999Om2.this.f27212a, false, 1, null);
            C33829Jm2 m99756p0 = C34999Om2.this.f27212a.m99756p0();
            if (m99756p0 != null && C34999Om2.this.f27212a.m99798W() == C33829Jm2.EnumC4230g.NotUsed) {
                C33829Jm2 c33829Jm2 = C34999Om2.this.f27212a;
                int i = C6120a.$EnumSwitchMapping$0[m99756p0.m99792Z().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        enumC4230g = m99756p0.m99798W();
                    } else {
                        enumC4230g = C33829Jm2.EnumC4230g.InLayoutBlock;
                    }
                } else {
                    enumC4230g = C33829Jm2.EnumC4230g.InMeasureBlock;
                }
                c33829Jm2.m99740u1(enumC4230g);
            }
        }

        /* renamed from: u1 */
        public final void m91471u1(long j, float f, Function1<? super InterfaceC11328c, Unit> function1) {
            this.f27250i = j;
            this.f27252k = f;
            this.f27251j = function1;
            this.f27248g = true;
            mo88870d().m90684r(false);
            C34999Om2.this.m91530N(false);
            C34765Nm2.m93440a(C34999Om2.this.f27212a).mo30989l().m26016b(C34999Om2.this.f27212a, false, new C6125d(function1, C34999Om2.this, j, f));
        }

        @Override // p000.AO2
        /* renamed from: v */
        public int mo35854v(AbstractC4750L9 alignmentLine) {
            C33829Jm2.EnumC4228e enumC4228e;
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            C33829Jm2 m99756p0 = C34999Om2.this.f27212a.m99756p0();
            C33829Jm2.EnumC4228e enumC4228e2 = null;
            if (m99756p0 != null) {
                enumC4228e = m99756p0.m99792Z();
            } else {
                enumC4228e = null;
            }
            if (enumC4228e == C33829Jm2.EnumC4228e.Measuring) {
                mo88870d().m90681u(true);
            } else {
                C33829Jm2 m99756p02 = C34999Om2.this.f27212a.m99756p0();
                if (m99756p02 != null) {
                    enumC4228e2 = m99756p02.m99792Z();
                }
                if (enumC4228e2 == C33829Jm2.EnumC4228e.LayingOut) {
                    mo88870d().m90682t(true);
                }
            }
            this.f27249h = true;
            int mo35854v = C34999Om2.this.m91503z().mo35854v(alignmentLine);
            this.f27249h = false;
            return mo35854v;
        }

        /* renamed from: v1 */
        public final boolean m91470v1(long j) {
            boolean z;
            InterfaceC43181jD3 m93440a = C34765Nm2.m93440a(C34999Om2.this.f27212a);
            C33829Jm2 m99756p0 = C34999Om2.this.f27212a.m99756p0();
            C33829Jm2 c33829Jm2 = C34999Om2.this.f27212a;
            boolean z2 = true;
            if (!C34999Om2.this.f27212a.m99825I() && (m99756p0 == null || !m99756p0.m99825I())) {
                z = false;
            } else {
                z = true;
            }
            c33829Jm2.m99749r1(z);
            if (!C34999Om2.this.f27212a.m99777g0() && C44228kz0.m28070g(m92227h1(), j)) {
                m93440a.mo31005N(C34999Om2.this.f27212a);
                C34999Om2.this.f27212a.m99752q1();
                return false;
            }
            mo88870d().m90683s(false);
            mo88871Y0(C6126e.f27269g);
            this.f27247f = true;
            long mo23186a = C34999Om2.this.m91503z().mo23186a();
            m92223m1(j);
            C34999Om2.this.m91533K(j);
            if (G52.m105831e(C34999Om2.this.m91503z().mo23186a(), mo23186a) && C34999Om2.this.m91503z().m92226i1() == m92226i1() && C34999Om2.this.m91503z().m92229d1() == m92229d1()) {
                z2 = false;
            }
            m92224l1(H52.m104430a(C34999Om2.this.m91503z().m92226i1(), C34999Om2.this.m91503z().m92229d1()));
            return z2;
        }

        /* renamed from: w1 */
        public final void m91469w1() {
            if (this.f27248g) {
                m91471u1(this.f27250i, this.f27252k, this.f27251j);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        /* renamed from: x1 */
        public final void m91468x1(boolean z) {
            this.f27257p = z;
        }

        /* renamed from: y1 */
        public final void m91467y1(C33829Jm2 c33829Jm2) {
            boolean z;
            C33829Jm2.EnumC4230g enumC4230g;
            C33829Jm2 m99756p0 = c33829Jm2.m99756p0();
            if (m99756p0 != null) {
                if (c33829Jm2.m99773i0() != C33829Jm2.EnumC4230g.NotUsed && !c33829Jm2.m99825I()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    int i = C6120a.$EnumSwitchMapping$0[m99756p0.m99792Z().ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            enumC4230g = C33829Jm2.EnumC4230g.InLayoutBlock;
                        } else {
                            throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + m99756p0.m99792Z());
                        }
                    } else {
                        enumC4230g = C33829Jm2.EnumC4230g.InMeasureBlock;
                    }
                    c33829Jm2.m99735w1(enumC4230g);
                    return;
                }
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + c33829Jm2.m99773i0() + ". Parent state " + m99756p0.m99792Z() + CoreConstants.DOT).toString());
            }
            c33829Jm2.m99735w1(C33829Jm2.EnumC4230g.NotUsed);
        }

        /* renamed from: z1 */
        public final boolean m91466z1() {
            if (!this.f27253l) {
                return false;
            }
            this.f27253l = false;
            boolean z = !Intrinsics.areEqual(mo77401c(), C34999Om2.this.m91503z().mo77401c());
            this.f27254m = C34999Om2.this.m91503z().mo77401c();
            return z;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Om2$c */
    /* loaded from: classes.dex */
    public static final class C6127c extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ long f27271h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6127c(long j) {
            super(0);
            this.f27271h = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TC2 m104314d2 = C34999Om2.this.m91503z().m104314d2();
            Intrinsics.checkNotNull(m104314d2);
            m104314d2.mo8763P0(this.f27271h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Om2$d */
    /* loaded from: classes.dex */
    public static final class C6128d extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ long f27273h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6128d(long j) {
            super(0);
            this.f27273h = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C34999Om2.this.m91503z().mo8763P0(this.f27273h);
        }
    }

    public C34999Om2(C33829Jm2 layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f27212a = layoutNode;
        this.f27213b = C33829Jm2.EnumC4228e.Idle;
        this.f27222k = new C6119b();
    }

    /* renamed from: A */
    public final int m91543A() {
        return this.f27222k.m92226i1();
    }

    /* renamed from: B */
    public final void m91542B() {
        this.f27222k.m91475q1();
        C6111a c6111a = this.f27223l;
        if (c6111a != null) {
            c6111a.m91492s1();
        }
    }

    /* renamed from: C */
    public final boolean m91541C(C33829Jm2 c33829Jm2) {
        XC2 m99781e0 = c33829Jm2.m99781e0();
        return Intrinsics.areEqual(m99781e0 != null ? m99781e0.m77188a() : null, c33829Jm2);
    }

    /* renamed from: D */
    public final void m91540D() {
        this.f27222k.m91468x1(true);
        C6111a c6111a = this.f27223l;
        if (c6111a != null) {
            c6111a.m91501B1(true);
        }
    }

    /* renamed from: E */
    public final void m91539E() {
        this.f27215d = true;
        this.f27216e = true;
    }

    /* renamed from: F */
    public final void m91538F() {
        this.f27218g = true;
        this.f27219h = true;
    }

    /* renamed from: G */
    public final void m91537G() {
        this.f27217f = true;
    }

    /* renamed from: H */
    public final void m91536H() {
        this.f27214c = true;
    }

    /* renamed from: I */
    public final void m91535I(XC2 xc2) {
        C6111a c6111a;
        if (xc2 != null) {
            c6111a = new C6111a(this, xc2);
        } else {
            c6111a = null;
        }
        this.f27223l = c6111a;
    }

    /* renamed from: J */
    public final void m91534J(long j) {
        this.f27213b = C33829Jm2.EnumC4228e.LookaheadMeasuring;
        this.f27217f = false;
        C44960mD3.m26011g(C34765Nm2.m93440a(this.f27212a).mo30989l(), this.f27212a, false, new C6127c(j), 2, null);
        m91538F();
        if (m91541C(this.f27212a)) {
            m91539E();
        } else {
            m91536H();
        }
        this.f27213b = C33829Jm2.EnumC4228e.Idle;
    }

    /* renamed from: K */
    public final void m91533K(long j) {
        boolean z;
        C33829Jm2.EnumC4228e enumC4228e = this.f27213b;
        C33829Jm2.EnumC4228e enumC4228e2 = C33829Jm2.EnumC4228e.Idle;
        if (enumC4228e == enumC4228e2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C33829Jm2.EnumC4228e enumC4228e3 = C33829Jm2.EnumC4228e.Measuring;
            this.f27213b = enumC4228e3;
            this.f27214c = false;
            C34765Nm2.m93440a(this.f27212a).mo30989l().m26012f(this.f27212a, false, new C6128d(j));
            if (this.f27213b == enumC4228e3) {
                m91539E();
                this.f27213b = enumC4228e2;
                return;
            }
            return;
        }
        throw new IllegalStateException("layout state is not idle before measure starts".toString());
    }

    /* renamed from: L */
    public final void m91532L() {
        AbstractC6277P9 mo88870d;
        this.f27222k.mo88870d().m90686p();
        C6111a c6111a = this.f27223l;
        if (c6111a != null && (mo88870d = c6111a.mo88870d()) != null) {
            mo88870d.m90686p();
        }
    }

    /* renamed from: M */
    public final void m91531M(int i) {
        boolean z;
        C34999Om2 c34999Om2;
        int i2 = this.f27221j;
        this.f27221j = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            C33829Jm2 m99756p0 = this.f27212a.m99756p0();
            if (m99756p0 != null) {
                c34999Om2 = m99756p0.m99796X();
            } else {
                c34999Om2 = null;
            }
            if (c34999Om2 != null) {
                if (i == 0) {
                    c34999Om2.m91531M(c34999Om2.f27221j - 1);
                } else {
                    c34999Om2.m91531M(c34999Om2.f27221j + 1);
                }
            }
        }
    }

    /* renamed from: N */
    public final void m91530N(boolean z) {
        if (this.f27220i != z) {
            this.f27220i = z;
            if (z) {
                m91531M(this.f27221j + 1);
            } else {
                m91531M(this.f27221j - 1);
            }
        }
    }

    /* renamed from: O */
    public final void m91529O() {
        boolean z;
        C33829Jm2 m99756p0;
        if (this.f27222k.m91466z1() && (m99756p0 = this.f27212a.m99756p0()) != null) {
            C33829Jm2.m99761n1(m99756p0, false, 1, null);
        }
        C6111a c6111a = this.f27223l;
        if (c6111a != null && c6111a.m91498E1()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (m91541C(this.f27212a)) {
                C33829Jm2 m99756p02 = this.f27212a.m99756p0();
                if (m99756p02 != null) {
                    C33829Jm2.m99761n1(m99756p02, false, 1, null);
                    return;
                }
                return;
            }
            C33829Jm2 m99756p03 = this.f27212a.m99756p0();
            if (m99756p03 != null) {
                C33829Jm2.m99770j1(m99756p03, false, 1, null);
            }
        }
    }

    /* renamed from: l */
    public final InterfaceC6687Q9 m91517l() {
        return this.f27222k;
    }

    /* renamed from: m */
    public final int m91516m() {
        return this.f27221j;
    }

    /* renamed from: n */
    public final boolean m91515n() {
        return this.f27220i;
    }

    /* renamed from: o */
    public final int m91514o() {
        return this.f27222k.m92229d1();
    }

    /* renamed from: p */
    public final C44228kz0 m91513p() {
        return this.f27222k.m91477o1();
    }

    /* renamed from: q */
    public final C44228kz0 m91512q() {
        C6111a c6111a = this.f27223l;
        if (c6111a != null) {
            return c6111a.m91494q1();
        }
        return null;
    }

    /* renamed from: r */
    public final boolean m91511r() {
        return this.f27215d;
    }

    /* renamed from: s */
    public final C33829Jm2.EnumC4228e m91510s() {
        return this.f27213b;
    }

    /* renamed from: t */
    public final InterfaceC6687Q9 m91509t() {
        return this.f27223l;
    }

    /* renamed from: u */
    public final boolean m91508u() {
        return this.f27218g;
    }

    /* renamed from: v */
    public final boolean m91507v() {
        return this.f27217f;
    }

    /* renamed from: w */
    public final C6111a m91506w() {
        return this.f27223l;
    }

    /* renamed from: x */
    public final C6119b m91505x() {
        return this.f27222k;
    }

    /* renamed from: y */
    public final boolean m91504y() {
        return this.f27214c;
    }

    /* renamed from: z */
    public final H83 m91503z() {
        return this.f27212a.m99764m0().m107675n();
    }
}
