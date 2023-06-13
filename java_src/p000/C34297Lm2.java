package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.C46390oe0;
@Metadata(m28433d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010f\u001a\u00020c¢\u0006\u0004\bw\u0010xJt\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\\\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJR\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJz\u0010(\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010'\u001a\u00020&H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)Jn\u00103\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104JP\u00107\u001a\u00020\u00152\u0006\u00106\u001a\u0002052\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108JP\u00109\u001a\u00020\u00152\u0006\u00106\u001a\u0002052\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:J\\\u0010;\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\\\u0010=\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>Jf\u0010A\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010BJf\u0010C\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010DJ\u001a\u0010G\u001a\u00020F*\u00020EH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJ\u001a\u0010J\u001a\u00020F*\u00020IH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010KJ\u001d\u0010L\u001a\u00020E*\u00020\u0005H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ\u001d\u0010N\u001a\u00020E*\u00020FH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010OJ\u001a\u0010Q\u001a\u00020P*\u00020\fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u0010RJ\u001a\u0010S\u001a\u00020\u0005*\u00020EH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010MJ\u001a\u0010T\u001a\u00020\u0005*\u00020IH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010UJ\u001a\u0010V\u001a\u00020\f*\u00020PH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010RJ\u001a\u0010W\u001a\u00020I*\u00020EH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010XJ\b\u0010Y\u001a\u00020\u0015H\u0016J\u0012\u0010]\u001a\u00020\u0015*\u00020Z2\u0006\u0010\\\u001a\u00020[J5\u0010a\u001a\u00020\u00152\u0006\u0010\\\u001a\u00020[2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020ZH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010`\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010gR\u001d\u0010\u0019\u001a\u00020\n8VX\u0096\u0005ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bd\u0010jR\u0014\u0010o\u001a\u00020l8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bp\u0010jR\u0014\u0010u\u001a\u00020r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bs\u0010tR\u001d\u0010\r\u001a\u00020\f8VX\u0096\u0005ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bv\u0010i\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006y"}, m28432d2 = {"LLm2;", "LI61;", "LiA0;", "Lpm0;", "color", "", "startAngle", "sweepAngle", "", "useCenter", "LCe3;", "topLeft", "LxB5;", "size", "alpha", "LJ61;", "style", "Lsm0;", "colorFilter", "LLW;", "blendMode", "", AbstractC26684u0.f100690q, "(JFFZJJFLJ61;Lsm0;I)V", "radius", "center", "I", "(JFJFLJ61;Lsm0;I)V", "LMW1;", Entry.TYPE_IMAGE, "i0", "(LMW1;JFLJ61;Lsm0;I)V", "LA52;", "srcOffset", "LG52;", "srcSize", "dstOffset", "dstSize", "LRl1;", "filterQuality", "N0", "(LMW1;JJJJFLJ61;Lsm0;II)V", "La30;", "brush", "start", "end", "strokeWidth", "LLS5;", "cap", "LiJ3;", "pathEffect", "K", "(La30;JJFILiJ3;FLsm0;I)V", "LcJ3;", "path", "j0", "(LcJ3;La30;FLJ61;Lsm0;I)V", "Z", "(LcJ3;JFLJ61;Lsm0;I)V", "m0", "(La30;JJFLJ61;Lsm0;I)V", "k0", "(JJJFLJ61;Lsm0;I)V", "LLC0;", "cornerRadius", "R", "(La30;JJJFLJ61;Lsm0;I)V", "W0", "(JJJJLJ61;FLsm0;I)V", "Lk61;", "", "F0", "(F)I", "LM26;", "V0", "(J)I", "x", "(F)F", "w", "(I)F", "Lo61;", "j", "(J)J", "T0", "I0", "(J)F", "z", "s0", "(F)J", "n0", "LE61;", "Lme0;", "canvas", DateTokenConverter.CONVERTER_KEY, "LH83;", "coordinator", "drawNode", "c", "(Lme0;JLH83;LE61;)V", "Loe0;", "b", "Loe0;", "canvasDrawScope", "LE61;", "l0", "()J", "()F", "density", "LC61;", "d0", "()LC61;", "drawContext", "R0", "fontScale", "Lpm2;", "getLayoutDirection", "()Lpm2;", "layoutDirection", "h", "<init>", "(Loe0;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,114:1\n245#2:115\n71#3:116\n71#3:117\n558#4,17:118\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n*L\n46#1:115\n59#1:116\n71#1:117\n85#1:118,17\n*E\n"})
/* renamed from: Lm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34297Lm2 implements I61, InterfaceC42558iA0 {

    /* renamed from: b */
    public final C46390oe0 f22044b;

    /* renamed from: c */
    public E61 f22045c;

    public C34297Lm2() {
        this(null, 1, null);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: F0 */
    public int mo3416F0(float f) {
        return this.f22044b.mo3416F0(f);
    }

    @Override // p000.I61
    /* renamed from: I */
    public void mo20758I(long j, float f, long j2, float f2, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f22044b.mo20758I(j, f, j2, f2, style, c48841sm0, i);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: I0 */
    public float mo3415I0(long j) {
        return this.f22044b.mo3415I0(j);
    }

    @Override // p000.I61
    /* renamed from: K */
    public void mo20757K(AbstractC37727a30 brush, long j, long j2, float f, int i, InterfaceC42642iJ3 interfaceC42642iJ3, float f2, C48841sm0 c48841sm0, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.f22044b.mo20757K(brush, j, j2, f, i, interfaceC42642iJ3, f2, c48841sm0, i2);
    }

    @Override // p000.I61
    /* renamed from: N0 */
    public void mo20756N0(MW1 image, long j, long j2, long j3, long j4, float f, J61 style, C48841sm0 c48841sm0, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f22044b.mo20756N0(image, j, j2, j3, j4, f, style, c48841sm0, i, i2);
    }

    @Override // p000.I61
    /* renamed from: R */
    public void mo20755R(AbstractC37727a30 brush, long j, long j2, long j3, float f, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f22044b.mo20755R(brush, j, j2, j3, f, style, c48841sm0, i);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: R0 */
    public float mo3412R0() {
        return this.f22044b.mo3412R0();
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: T0 */
    public float mo3411T0(float f) {
        return this.f22044b.mo3411T0(f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: V0 */
    public int mo3410V0(long j) {
        return this.f22044b.mo3410V0(j);
    }

    @Override // p000.I61
    /* renamed from: W0 */
    public void mo20754W0(long j, long j2, long j3, long j4, J61 style, float f, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f22044b.mo20754W0(j, j2, j3, j4, style, f, c48841sm0, i);
    }

    @Override // p000.I61
    /* renamed from: Z */
    public void mo20753Z(InterfaceC39067cJ3 path, long j, float f, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f22044b.mo20753Z(path, j, f, style, c48841sm0, i);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: b */
    public float mo3408b() {
        return this.f22044b.mo3408b();
    }

    /* renamed from: c */
    public final void m96362c(InterfaceC45204me0 canvas, long j, H83 coordinator, E61 drawNode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(drawNode, "drawNode");
        E61 e61 = this.f22045c;
        this.f22045c = drawNode;
        C46390oe0 c46390oe0 = this.f22044b;
        EnumC47065pm2 layoutDirection = coordinator.getLayoutDirection();
        C46390oe0.C27018a m20741o = c46390oe0.m20741o();
        InterfaceC41273g01 m20736a = m20741o.m20736a();
        EnumC47065pm2 m20735b = m20741o.m20735b();
        InterfaceC45204me0 m20734c = m20741o.m20734c();
        long m20733d = m20741o.m20733d();
        C46390oe0.C27018a m20741o2 = c46390oe0.m20741o();
        m20741o2.m20727j(coordinator);
        m20741o2.m20726k(layoutDirection);
        m20741o2.m20728i(canvas);
        m20741o2.m20725l(j);
        canvas.mo25245v();
        drawNode.mo4144y(this);
        canvas.mo25251p();
        C46390oe0.C27018a m20741o3 = c46390oe0.m20741o();
        m20741o3.m20727j(m20736a);
        m20741o3.m20726k(m20735b);
        m20741o3.m20728i(m20734c);
        m20741o3.m20725l(m20733d);
        this.f22045c = e61;
    }

    /* renamed from: d */
    public final void m96361d(E61 e61, InterfaceC45204me0 canvas) {
        Intrinsics.checkNotNullParameter(e61, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        H83 m6662g = C51083wZ0.m6662g(e61, K83.m99169a(4));
        m6662g.mo84222r1().m99783d0().m96362c(canvas, H52.m104428c(m6662g.mo23186a()), m6662g, e61);
    }

    @Override // p000.I61
    /* renamed from: d0 */
    public C61 mo20750d0() {
        return this.f22044b.mo20750d0();
    }

    @Override // p000.I61
    public EnumC47065pm2 getLayoutDirection() {
        return this.f22044b.getLayoutDirection();
    }

    @Override // p000.I61
    /* renamed from: h */
    public long mo96360h() {
        return this.f22044b.mo96360h();
    }

    @Override // p000.I61
    /* renamed from: i0 */
    public void mo20746i0(MW1 image, long j, float f, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f22044b.mo20746i0(image, j, f, style, c48841sm0, i);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: j */
    public long mo3403j(long j) {
        return this.f22044b.mo3403j(j);
    }

    @Override // p000.I61
    /* renamed from: j0 */
    public void mo20745j0(InterfaceC39067cJ3 path, AbstractC37727a30 brush, float f, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f22044b.mo20745j0(path, brush, f, style, c48841sm0, i);
    }

    @Override // p000.I61
    /* renamed from: k0 */
    public void mo20744k0(long j, long j2, long j3, float f, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f22044b.mo20744k0(j, j2, j3, f, style, c48841sm0, i);
    }

    @Override // p000.I61
    /* renamed from: l0 */
    public long mo96359l0() {
        return this.f22044b.mo96359l0();
    }

    @Override // p000.I61
    /* renamed from: m0 */
    public void mo20743m0(AbstractC37727a30 brush, long j, long j2, float f, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f22044b.mo20743m0(brush, j, j2, f, style, c48841sm0, i);
    }

    @Override // p000.InterfaceC42558iA0
    /* renamed from: n0 */
    public void mo34387n0() {
        E61 m94880b;
        InterfaceC45204me0 mo20724a = mo20750d0().mo20724a();
        E61 e61 = this.f22045c;
        Intrinsics.checkNotNull(e61);
        m94880b = C34531Mm2.m94880b(e61);
        if (m94880b != null) {
            m96361d(m94880b, mo20724a);
            return;
        }
        H83 m6662g = C51083wZ0.m6662g(e61, K83.m99169a(4));
        if (m6662g.mo94436h2() == e61) {
            m6662g = m6662g.m104310i2();
            Intrinsics.checkNotNull(m6662g);
        }
        m6662g.mo94438F2(mo20724a);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: s0 */
    public long mo3399s0(float f) {
        return this.f22044b.mo3399s0(f);
    }

    @Override // p000.I61
    /* renamed from: u0 */
    public void mo20739u0(long j, float f, float f2, boolean z, long j2, long j3, float f3, J61 style, C48841sm0 c48841sm0, int i) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f22044b.mo20739u0(j, f, f2, z, j2, j3, f3, style, c48841sm0, i);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: w */
    public float mo3398w(int i) {
        return this.f22044b.mo3398w(i);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: x */
    public float mo3397x(float f) {
        return this.f22044b.mo3397x(f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: z */
    public long mo3395z(long j) {
        return this.f22044b.mo3395z(j);
    }

    public C34297Lm2(C46390oe0 canvasDrawScope) {
        Intrinsics.checkNotNullParameter(canvasDrawScope, "canvasDrawScope");
        this.f22044b = canvasDrawScope;
    }

    public /* synthetic */ C34297Lm2(C46390oe0 c46390oe0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C46390oe0() : c46390oe0);
    }
}
