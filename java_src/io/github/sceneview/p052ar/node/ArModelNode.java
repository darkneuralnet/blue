package io.github.sceneview.p052ar.node;

import com.facebook.share.internal.C17296a;
import com.google.android.filament.gltfio.FilamentInstance;
import com.google.p034ar.core.Anchor;
import com.google.p034ar.core.HitResult;
import io.github.sceneview.SceneView;
import io.github.sceneview.p052ar.ArSceneView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
@Metadata(m28433d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 q2\u00020\u0001:\u0001rB5\b\u0016\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0016\u0012\f\b\u0002\u0010'\u001a\u00060\u001fj\u0002` \u0012\b\b\u0002\u0010.\u001a\u00020\r\u0012\b\b\u0002\u00102\u001a\u00020\r¢\u0006\u0004\b_\u0010`B\u008f\u0001\b\u0016\u0012\u0006\u0010b\u001a\u00020a\u0012\b\b\u0002\u0010c\u001a\u00020\r\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010d\u0012\u0010\b\u0002\u0010f\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` \u0012)\b\u0002\u0010k\u001a#\u0012\u0017\u0012\u00150hj\u0002`i¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(j\u0012\u0004\u0012\u00020\u0004\u0018\u00010g\u0012)\b\u0002\u0010o\u001a#\u0012\u0017\u0012\u00150lj\u0002`m¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(n\u0012\u0004\u0012\u00020\u0004\u0018\u00010g¢\u0006\u0004\b_\u0010pJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rJ\n\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0016R*\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR2\u0010'\u001a\u00060\u001fj\u0002` 2\n\u0010\u0017\u001a\u00060\u001fj\u0002` 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010.\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00102\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\"\u00106\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+\"\u0004\b5\u0010-R$\u0010=\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R.\u0010A\u001a\u0004\u0018\u00010\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010J\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR(\u0010Q\u001a\u0004\u0018\u00010\u00022\b\u0010J\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010NRT\u0010\\\u001a4\u0012\u0013\u0012\u00110\u0000¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110\u0011¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010+¨\u0006s"}, m28432d2 = {"Lio/github/sceneview/ar/node/ArModelNode;", "Lio/github/sceneview/ar/node/ArNode;", "Lrm;", "arFrame", "", "r", "LkW2;", "detector", "LP83;", "e", "n", "D", "o", "", "plane", "depth", "instant", "Lcom/google/ar/core/HitResult;", "B1", "Lcom/google/ar/core/Anchor;", "y1", "z1", "LYU3;", "value", "L0", "LYU3;", "getPlacementMode", "()LYU3;", "I1", "(LYU3;)V", "placementMode", "Lhu1;", "Lio/github/sceneview/math/Position;", "M0", "Lhu1;", "getHitPosition", "()Lhu1;", "F1", "(Lhu1;)V", "hitPosition", "N0", "Z", "getFollowHitPosition", "()Z", "setFollowHitPosition", "(Z)V", "followHitPosition", "O0", "getInstantAnchor", "H1", "instantAnchor", "P0", "D1", "setPositionEditable", "isPositionEditable", "Q0", "Lcom/google/ar/core/HitResult;", "getLastTrackingHitResult", "()Lcom/google/ar/core/HitResult;", "setLastTrackingHitResult", "(Lcom/google/ar/core/HitResult;)V", "lastTrackingHitResult", "R0", "A1", "G1", "hitResult", "", "S0", "I", "getMaxHitTestPerSecond", "()I", "setMaxHitTestPerSecond", "(I)V", "maxHitTestPerSecond", "<set-?>", "T0", "Lrm;", "getArFrame", "()Lrm;", "U0", "getHitTestFrame", "hitTestFrame", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "node", "V0", "Lkotlin/jvm/functions/Function2;", "getOnHitResult", "()Lkotlin/jvm/functions/Function2;", "setOnHitResult", "(Lkotlin/jvm/functions/Function2;)V", "onHitResult", "E1", "isTracking", "<init>", "(LYU3;Lhu1;ZZ)V", "", "modelGlbFileLocation", "autoAnimate", "", "scaleToUnits", "centerOrigin", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "onError", "Lcom/google/android/filament/gltfio/FilamentInstance;", "Lio/github/sceneview/model/ModelInstance;", "modelInstance", "onLoaded", "(Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "W0", C17296a.f69688o, "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: io.github.sceneview.ar.node.ArModelNode */
/* loaded from: classes6.dex */
public class ArModelNode extends ArNode {

    /* renamed from: W0 */
    public static final C23405a f88033W0 = new C23405a(null);

    /* renamed from: X0 */
    public static final int f88034X0 = 8;

    /* renamed from: Y0 */
    public static final YU3 f88035Y0 = YU3.BEST_AVAILABLE;

    /* renamed from: Z0 */
    public static final float f88036Z0 = 2.0f;

    /* renamed from: a1 */
    public static final C42400hu1 f88037a1 = new C42400hu1(0.0f, 0.0f, -2.0f);

    /* renamed from: L0 */
    public YU3 f88038L0;

    /* renamed from: M0 */
    public C42400hu1 f88039M0;

    /* renamed from: N0 */
    public boolean f88040N0;

    /* renamed from: O0 */
    public boolean f88041O0;

    /* renamed from: P0 */
    public boolean f88042P0;

    /* renamed from: Q0 */
    public HitResult f88043Q0;

    /* renamed from: R0 */
    public HitResult f88044R0;

    /* renamed from: S0 */
    public int f88045S0;

    /* renamed from: T0 */
    public C27991rm f88046T0;

    /* renamed from: U0 */
    public C27991rm f88047U0;

    /* renamed from: V0 */
    public Function2<? super ArModelNode, ? super HitResult, Unit> f88048V0;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"Lio/github/sceneview/ar/node/ArModelNode$a;", "", "", "DEFAULT_PLACEMENT_DISTANCE", "F", C17296a.f69688o, "()F", "<init>", "()V", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.node.ArModelNode$a */
    /* loaded from: classes6.dex */
    public static final class C23405a {
        public /* synthetic */ C23405a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final float m33326a() {
            return ArModelNode.f88036Z0;
        }

        private C23405a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/github/sceneview/SceneView;", "sceneView", "", C17296a.f69688o, "(Lio/github/sceneview/SceneView;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.node.ArModelNode$e */
    /* loaded from: classes6.dex */
    public static final class C23409e extends Lambda implements Function1<SceneView, Unit> {

        /* renamed from: g */
        public final /* synthetic */ YU3 f88049g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23409e(YU3 yu3) {
            super(1);
            this.f88049g = yu3;
        }

        /* renamed from: a */
        public final void m33325a(SceneView sceneView) {
            ArSceneView arSceneView;
            Intrinsics.checkNotNullParameter(sceneView, "sceneView");
            if (sceneView instanceof ArSceneView) {
                arSceneView = (ArSceneView) sceneView;
            } else {
                arSceneView = null;
            }
            if (arSceneView != null) {
                YU3 yu3 = this.f88049g;
                arSceneView.setPlaneFindingMode(yu3.m74993e());
                arSceneView.setDepthEnabled(yu3.m74996b());
                arSceneView.setInstantPlacementEnabled(yu3.m74995c());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SceneView sceneView) {
            m33325a(sceneView);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ArModelNode(YU3 yu3, C42400hu1 c42400hu1, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? f88035Y0 : yu3, (i & 2) != 0 ? f88037a1 : c42400hu1, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2);
    }

    /* renamed from: C1 */
    public static /* synthetic */ HitResult m33334C1(ArModelNode arModelNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = arModelNode.f88038L0.m74994d();
            }
            if ((i & 2) != 0) {
                z2 = arModelNode.f88038L0.m74996b();
            }
            if ((i & 4) != 0) {
                z3 = arModelNode.f88038L0.m74995c();
            }
            return arModelNode.m33335B1(z, z2, z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hitTest");
    }

    /* renamed from: A1 */
    public HitResult mo33301A1() {
        return this.f88044R0;
    }

    /* renamed from: B1 */
    public final HitResult m33335B1(boolean z, boolean z2, boolean z3) {
        ArSceneView mo33227b0 = mo33227b0();
        if (mo33227b0 != null) {
            return mo33227b0.m33408B0(this.f88039M0, z, z2, z3);
        }
        return null;
    }

    @Override // io.github.sceneview.node.Node, p000.C42577iC1.InterfaceC23148b
    /* renamed from: D */
    public void mo33261D(C43944kW2 detector, P83 e) {
        HitResult hitResult;
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        super.mo33261D(detector, e);
        if (m33333D1() && Intrinsics.areEqual(m33239R(), new MutablePropertyReference0Impl(this) { // from class: io.github.sceneview.ar.node.ArModelNode.b
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((ArModelNode) this.receiver).m33233X();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((ArModelNode) this.receiver).m33188z0((C42400hu1) obj);
            }
        })) {
            ArSceneView mo33227b0 = mo33227b0();
            if (mo33227b0 != null) {
                hitResult = ArSceneView.hitTest$default(mo33227b0, e.m90711a().getX(), e.m90711a().getY(), this.f88038L0.m74994d(), this.f88038L0.m74996b(), this.f88038L0.m74995c(), 0.0f, 32, null);
            } else {
                hitResult = null;
            }
            mo33300G1(hitResult);
        }
    }

    /* renamed from: D1 */
    public boolean m33333D1() {
        return this.f88042P0;
    }

    /* renamed from: E1 */
    public boolean m33332E1() {
        HitResult mo33301A1 = mo33301A1();
        return mo33301A1 != null && C43117j66.m31107b(mo33301A1);
    }

    /* renamed from: F1 */
    public final void m33331F1(C42400hu1 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f88039M0 = value;
        m33188z0(new C42400hu1(value));
    }

    /* renamed from: G1 */
    public void mo33300G1(HitResult hitResult) {
        Function2<? super ArModelNode, ? super HitResult, Unit> function2;
        this.f88044R0 = hitResult;
        boolean z = false;
        if (hitResult != null && C43117j66.m31107b(hitResult)) {
            z = true;
        }
        if (z) {
            this.f88043Q0 = hitResult;
            m33314v1(hitResult.getHitPose());
        }
        if (hitResult != null && (function2 = this.f88048V0) != null) {
            function2.invoke(this, hitResult);
        }
    }

    /* renamed from: H1 */
    public final void m33330H1(boolean z) {
        this.f88041O0 = z;
        if (z) {
            m33327y1();
        } else if (m33318r1()) {
            m33322n1();
        }
    }

    /* renamed from: I1 */
    public final void m33329I1(YU3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f88038L0 = value;
        m33241P(new C23409e(value));
    }

    @Override // io.github.sceneview.node.Node, p000.C42577iC1.InterfaceC23148b
    /* renamed from: n */
    public void mo33209n(C43944kW2 detector, P83 e) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        super.mo33209n(detector, e);
        if (m33333D1() && m33239R() == null) {
            m33191x0(new MutablePropertyReference0Impl(this) { // from class: io.github.sceneview.ar.node.ArModelNode.c
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((ArModelNode) this.receiver).m33233X();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public void set(Object obj) {
                    ((ArModelNode) this.receiver).m33188z0((C42400hu1) obj);
                }
            });
            m33322n1();
        }
    }

    @Override // io.github.sceneview.node.Node, p000.C42577iC1.InterfaceC23148b
    /* renamed from: o */
    public void mo33207o(C43944kW2 detector, P83 e) {
        Anchor anchor;
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(e, "e");
        super.mo33207o(detector, e);
        if (m33333D1() && Intrinsics.areEqual(m33239R(), new MutablePropertyReference0Impl(this) { // from class: io.github.sceneview.ar.node.ArModelNode.d
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((ArModelNode) this.receiver).m33233X();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((ArModelNode) this.receiver).m33188z0((C42400hu1) obj);
            }
        })) {
            HitResult hitResult = this.f88043Q0;
            if (hitResult != null) {
                anchor = hitResult.createAnchor();
            } else {
                anchor = null;
            }
            m33317s1(anchor);
            m33191x0(null);
        }
    }

    @Override // io.github.sceneview.p052ar.node.ArNode, p000.InterfaceC30295xm
    /* renamed from: r */
    public void mo4729r(C27991rm arFrame) {
        Intrinsics.checkNotNullParameter(arFrame, "arFrame");
        super.mo4729r(arFrame);
        if (!m33318r1()) {
            if (this.f88041O0) {
                m33327y1();
            } else if (this.f88040N0 && m33239R() == null && arFrame.m15449a(this.f88047U0) <= this.f88045S0) {
                this.f88047U0 = arFrame;
                mo33300G1(m33334C1(this, false, false, false, 7, null));
            }
        }
        this.f88046T0 = arFrame;
    }

    /* renamed from: y1 */
    public Anchor m33327y1() {
        m33317s1(mo33295z1());
        return m33321o1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
        if (r0 == null) goto L12;
     */
    /* renamed from: z1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Anchor mo33295z1() {
        HitResult hitResult = this.f88043Q0;
        if (hitResult != null) {
            if (!C43117j66.m31107b(hitResult)) {
                hitResult = null;
            }
        }
        hitResult = m33334C1(this, false, false, false, 7, null);
        if (hitResult == null || !C43117j66.m31107b(hitResult)) {
            hitResult = null;
        }
        if (hitResult == null) {
            return null;
        }
        return hitResult.createAnchor();
    }

    public ArModelNode(YU3 placementMode, C42400hu1 hitPosition, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(placementMode, "placementMode");
        Intrinsics.checkNotNullParameter(hitPosition, "hitPosition");
        this.f88038L0 = f88035Y0;
        this.f88039M0 = f88037a1;
        this.f88040N0 = true;
        this.f88042P0 = true;
        this.f88045S0 = 10;
        m33329I1(placementMode);
        m33331F1(hitPosition);
        this.f88040N0 = z;
        m33330H1(z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArModelNode(String modelGlbFileLocation, boolean z, Float f, C42400hu1 c42400hu1, Function1<? super Exception, Unit> function1, Function1<? super FilamentInstance, Unit> function12) {
        this((YU3) null, (C42400hu1) null, false, false, 15, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(modelGlbFileLocation, "modelGlbFileLocation");
        m33285Z0(modelGlbFileLocation, z, f, c42400hu1, function1, function12);
    }
}
