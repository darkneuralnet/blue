package io.github.sceneview.p052ar.node;

import com.google.p034ar.core.Anchor;
import com.google.p034ar.core.Config;
import com.google.p034ar.core.Pose;
import com.google.p034ar.core.TrackingState;
import io.github.sceneview.SceneView;
import io.github.sceneview.node.ModelNode;
import io.github.sceneview.node.Node;
import io.github.sceneview.p052ar.ArSceneView;
import io.github.sceneview.p052ar.arcore.ArSession;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC30295xm;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\bj\u0010kJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0000H\u0016J\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0000R\"\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u001a\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010(\u001a\u0004\u0018\u00010\u00032\b\u0010#\u001a\u0004\u0018\u00010\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R.\u00101\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R.\u00109\u001a\u0004\u0018\u0001022\b\u0010*\u001a\u0004\u0018\u0001028\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010<\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b:\u0010\u000e\u001a\u0004\b;\u0010\u0010RA\u0010F\u001a!\u0012\u0015\u0012\u0013\u0018\u00010)¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u0005\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ERA\u0010J\u001a!\u0012\u0015\u0012\u0013\u0018\u000102¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u0005\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010A\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER*\u0010L\u001a\u00020\f2\u0006\u0010*\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u000e\u001a\u0004\bL\u0010\u0010\"\u0004\bM\u0010\u0012RH\u0010R\u001a4\u0012\u0013\u0012\u001102¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(9\u0012\u0013\u0012\u00110\f¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(O\u0012\u0004\u0012\u00020\u0005\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\"\u0010U\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010\u000e\u001a\u0004\bT\u0010\u0010\"\u0004\b@\u0010\u0012R\"\u0010Y\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010\u000e\u001a\u0004\bW\u0010\u0010\"\u0004\bX\u0010\u0012R\"\u0010]\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u000e\u001a\u0004\b[\u0010\u0010\"\u0004\b\\\u0010\u0012R\u0016\u0010a\u001a\u0004\u0018\u00010^8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0011\u0010c\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bb\u0010\u0010R\u0011\u0010g\u001a\u00020d8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010i\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\u0010¨\u0006l"}, m28432d2 = {"Lio/github/sceneview/ar/node/ArNode;", "Lio/github/sceneview/node/ModelNode;", "Lxm;", "Lrm;", "arFrame", "", "r", "n1", "N", "l1", "toNode", "m1", "", "w0", "Z", "isSmoothPoseEnable", "()Z", "w1", "(Z)V", "x0", "getApplyPosePosition", "t1", "applyPosePosition", "y0", "getApplyPoseRotation", "setApplyPoseRotation", "applyPoseRotation", "", "z0", "Ljava/lang/Double;", "getAnchorPoseUpdateInterval", "()Ljava/lang/Double;", "setAnchorPoseUpdateInterval", "(Ljava/lang/Double;)V", "anchorPoseUpdateInterval", "<set-?>", "A0", "Lrm;", "getAnchorUpdatedFrame", "()Lrm;", "anchorUpdatedFrame", "Lcom/google/ar/core/Pose;", "value", "B0", "Lcom/google/ar/core/Pose;", "getPose", "()Lcom/google/ar/core/Pose;", "v1", "(Lcom/google/ar/core/Pose;)V", "pose", "Lcom/google/ar/core/Anchor;", "C0", "Lcom/google/ar/core/Anchor;", "o1", "()Lcom/google/ar/core/Anchor;", "s1", "(Lcom/google/ar/core/Anchor;)V", "anchor", "D0", "getCloudAnchorTaskInProgress", "cloudAnchorTaskInProgress", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "E0", "Lkotlin/jvm/functions/Function1;", "getOnPoseChanged", "()Lkotlin/jvm/functions/Function1;", "setOnPoseChanged", "(Lkotlin/jvm/functions/Function1;)V", "onPoseChanged", "F0", "getOnAnchorChanged", "setOnAnchorChanged", "onAnchorChanged", "G0", "isCameraTracking", "u1", "Lkotlin/Function2;", "success", "H0", "Lkotlin/jvm/functions/Function2;", "onCloudAnchorTaskCompleted", "I0", "m0", "isSelectable", "J0", "k0", "setRotationEditable", "isRotationEditable", "K0", "l0", "setScaleEditable", "isScaleEditable", "Lio/github/sceneview/ar/ArSceneView;", "q1", "()Lio/github/sceneview/ar/ArSceneView;", "sceneView", "r1", "isAnchored", "Lcom/google/ar/core/Anchor$CloudAnchorState;", "p1", "()Lcom/google/ar/core/Anchor$CloudAnchorState;", "cloudAnchorState", "p0", "isVisibleInHierarchy", "<init>", "()V", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: io.github.sceneview.ar.node.ArNode */
/* loaded from: classes6.dex */
public class ArNode extends ModelNode implements InterfaceC30295xm {

    /* renamed from: A0 */
    public C27991rm f88050A0;

    /* renamed from: B0 */
    public Pose f88051B0;

    /* renamed from: C0 */
    public Anchor f88052C0;

    /* renamed from: D0 */
    public boolean f88053D0;

    /* renamed from: E0 */
    public Function1<? super Pose, Unit> f88054E0;

    /* renamed from: F0 */
    public Function1<? super Anchor, Unit> f88055F0;

    /* renamed from: G0 */
    public boolean f88056G0;

    /* renamed from: H0 */
    public Function2<? super Anchor, ? super Boolean, Unit> f88057H0;

    /* renamed from: I0 */
    public boolean f88058I0;

    /* renamed from: J0 */
    public boolean f88059J0;

    /* renamed from: K0 */
    public boolean f88060K0;

    /* renamed from: w0 */
    public boolean f88061w0;

    /* renamed from: x0 */
    public boolean f88062x0;

    /* renamed from: y0 */
    public boolean f88063y0;

    /* renamed from: z0 */
    public Double f88064z0;

    public ArNode() {
        super(null, null, null, 7, null);
        this.f88061w0 = true;
        this.f88062x0 = true;
        this.f88064z0 = Double.valueOf(0.1d);
        this.f88058I0 = true;
        this.f88059J0 = true;
        this.f88060K0 = true;
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: E0 */
    public void mo33258E0(boolean z) {
        this.f88058I0 = z;
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: F */
    public void mo4733F(Exception exc) {
        InterfaceC30295xm.C30296a.m4725d(this, exc);
    }

    @Override // io.github.sceneview.node.ModelNode, io.github.sceneview.node.Node
    /* renamed from: N */
    public void mo33178N() {
        Anchor m33321o1 = m33321o1();
        if (m33321o1 != null) {
            m33321o1.detach();
        }
        m33317s1(null);
        this.f88053D0 = false;
        this.f88057H0 = null;
        super.mo33178N();
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: c */
    public void mo4732c(ArSession arSession) {
        InterfaceC30295xm.C30296a.m4724e(this, arSession);
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: i */
    public void mo4731i(ArSession arSession, Config config) {
        InterfaceC30295xm.C30296a.m4727b(this, arSession, config);
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: k0 */
    public boolean mo33213k0() {
        return this.f88059J0;
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: l0 */
    public boolean mo33211l0() {
        return this.f88060K0;
    }

    /* renamed from: l1 */
    public ArNode m33324l1() {
        return m33323m1(new ArNode());
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: m */
    public void mo4730m(ArSession arSession) {
        InterfaceC30295xm.C30296a.m4726c(this, arSession);
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: m0 */
    public boolean mo33210m0() {
        return this.f88058I0;
    }

    /* renamed from: m1 */
    public final ArNode m33323m1(ArNode toNode) {
        Intrinsics.checkNotNullParameter(toNode, "toNode");
        super.m33293R0(toNode);
        return toNode;
    }

    /* renamed from: n1 */
    public void m33322n1() {
        m33317s1(null);
    }

    /* renamed from: o1 */
    public Anchor m33321o1() {
        return this.f88052C0;
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: p0 */
    public boolean mo33204p0() {
        return super.mo33204p0() && this.f88056G0;
    }

    /* renamed from: p1 */
    public final Anchor.CloudAnchorState m33320p1() {
        Anchor m33321o1 = m33321o1();
        Anchor.CloudAnchorState cloudAnchorState = m33321o1 != null ? m33321o1.getCloudAnchorState() : null;
        return cloudAnchorState == null ? Anchor.CloudAnchorState.NONE : cloudAnchorState;
    }

    @Override // io.github.sceneview.node.Node
    /* renamed from: q1 */
    public ArSceneView mo33227b0() {
        SceneView mo33227b0 = super.mo33227b0();
        if (mo33227b0 instanceof ArSceneView) {
            return (ArSceneView) mo33227b0;
        }
        return null;
    }

    /* renamed from: r */
    public void mo4729r(C27991rm arFrame) {
        Intrinsics.checkNotNullParameter(arFrame, "arFrame");
        InterfaceC30295xm.C30296a.m4728a(this, arFrame);
        m33315u1(C34430Mb0.m95150a(arFrame.m15448b()));
        Anchor m33321o1 = m33321o1();
        if (m33321o1 == null) {
            return;
        }
        if (m33321o1.getTrackingState() == TrackingState.TRACKING && this.f88064z0 != null) {
            double m15435o = arFrame.m15435o(this.f88050A0);
            Double d = this.f88064z0;
            Intrinsics.checkNotNull(d);
            if (m15435o >= d.doubleValue()) {
                m33314v1(m33321o1.getPose());
                this.f88050A0 = arFrame;
            }
        }
        if (this.f88053D0 && m33320p1() != Anchor.CloudAnchorState.NONE && m33320p1() != Anchor.CloudAnchorState.TASK_IN_PROGRESS) {
            boolean z = false;
            this.f88053D0 = false;
            Function2<? super Anchor, ? super Boolean, Unit> function2 = this.f88057H0;
            if (function2 != null) {
                if (m33320p1() == Anchor.CloudAnchorState.SUCCESS) {
                    z = true;
                }
                function2.invoke(m33321o1, Boolean.valueOf(z));
            }
            this.f88057H0 = null;
        }
    }

    /* renamed from: r1 */
    public final boolean m33318r1() {
        return m33321o1() != null;
    }

    /* renamed from: s1 */
    public void m33317s1(Anchor anchor) {
        Pose pose;
        Anchor anchor2 = this.f88052C0;
        if (anchor2 != null) {
            anchor2.detach();
        }
        this.f88052C0 = anchor;
        if (anchor != null) {
            pose = anchor.getPose();
        } else {
            pose = null;
        }
        m33314v1(pose);
        Function1<? super Anchor, Unit> function1 = this.f88055F0;
        if (function1 != null) {
            function1.invoke(anchor);
        }
    }

    /* renamed from: t1 */
    public final void m33316t1(boolean z) {
        this.f88062x0 = z;
    }

    /* renamed from: u1 */
    public final void m33315u1(boolean z) {
        if (this.f88056G0 != z) {
            this.f88056G0 = z;
            m33243N0();
        }
    }

    /* renamed from: v1 */
    public void m33314v1(Pose pose) {
        C52154yM2 c52154yM2;
        C52154yM2 c52154yM22;
        Pose pose2;
        C42400hu1 m33233X;
        C36315Uc4 m33232Y;
        Pose pose3 = this.f88051B0;
        Pose pose4 = null;
        if (pose3 != null) {
            c52154yM2 = CY3.m112146d(pose3);
        } else {
            c52154yM2 = null;
        }
        if (pose != null) {
            c52154yM22 = CY3.m112146d(pose);
        } else {
            c52154yM22 = null;
        }
        if (!Intrinsics.areEqual(c52154yM2, c52154yM22)) {
            this.f88051B0 = pose;
            if (pose != null) {
                if (this.f88062x0) {
                    pose2 = pose;
                } else {
                    pose2 = null;
                }
                if (pose2 == null || (m33233X = CY3.m112148b(pose2)) == null) {
                    m33233X = m33233X();
                }
                C42400hu1 c42400hu1 = m33233X;
                if (this.f88063y0) {
                    pose4 = pose;
                }
                if (pose4 == null || (m33232Y = CY3.m112147c(pose4)) == null) {
                    m33232Y = m33232Y();
                }
                C36315Uc4 c36315Uc4 = m33232Y;
                if (!Intrinsics.areEqual(m33233X(), c42400hu1) || !Intrinsics.areEqual(m33232Y(), c36315Uc4)) {
                    Node.m33244M0(this, c42400hu1, c36315Uc4, null, this.f88061w0, 0.0f, 20, null);
                }
            }
            Function1<? super Pose, Unit> function1 = this.f88054E0;
            if (function1 != null) {
                function1.invoke(pose);
            }
        }
    }

    /* renamed from: w1 */
    public final void m33313w1(boolean z) {
        this.f88061w0 = z;
    }
}
