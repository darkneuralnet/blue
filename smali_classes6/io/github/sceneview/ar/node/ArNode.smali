.class public Lio/github/sceneview/ar/node/ArNode;
.super Lio/github/sceneview/node/ModelNode;
.source "SourceFile"

# interfaces
.implements Lxm;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010\u0006\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0016\u00a2\u0006\u0004\u0008j\u0010kJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0008\u0010\u0007\u001a\u00020\u0005H\u0016J\u0008\u0010\u0008\u001a\u00020\u0005H\u0016J\u0008\u0010\t\u001a\u00020\u0000H\u0016J\u0010\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\n\u001a\u00020\u0000R\"\u0010\u000f\u001a\u00020\u000c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\"\u0010\u0016\u001a\u00020\u000c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u000e\u001a\u0004\u0008\u0014\u0010\u0010\"\u0004\u0008\u0015\u0010\u0012R\"\u0010\u001a\u001a\u00020\u000c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u000e\u001a\u0004\u0008\u0018\u0010\u0010\"\u0004\u0008\u0019\u0010\u0012R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R(\u0010(\u001a\u0004\u0018\u00010\u00032\u0008\u0010#\u001a\u0004\u0018\u00010\u00038\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R.\u00101\u001a\u0004\u0018\u00010)2\u0008\u0010*\u001a\u0004\u0018\u00010)8\u0016@VX\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R.\u00109\u001a\u0004\u0018\u0001022\u0008\u0010*\u001a\u0004\u0018\u0001028\u0016@VX\u0096\u000e\u00a2\u0006\u0012\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R$\u0010<\u001a\u00020\u000c2\u0006\u0010#\u001a\u00020\u000c8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008:\u0010\u000e\u001a\u0004\u0008;\u0010\u0010RA\u0010F\u001a!\u0012\u0015\u0012\u0013\u0018\u00010)\u00a2\u0006\u000c\u0008>\u0012\u0008\u0008?\u0012\u0004\u0008\u0008(1\u0012\u0004\u0012\u00020\u0005\u0018\u00010=8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010C\"\u0004\u0008D\u0010ERA\u0010J\u001a!\u0012\u0015\u0012\u0013\u0018\u000102\u00a2\u0006\u000c\u0008>\u0012\u0008\u0008?\u0012\u0004\u0008\u0008(9\u0012\u0004\u0012\u00020\u0005\u0018\u00010=8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008G\u0010A\u001a\u0004\u0008H\u0010C\"\u0004\u0008I\u0010ER*\u0010L\u001a\u00020\u000c2\u0006\u0010*\u001a\u00020\u000c8\u0006@BX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008K\u0010\u000e\u001a\u0004\u0008L\u0010\u0010\"\u0004\u0008M\u0010\u0012RH\u0010R\u001a4\u0012\u0013\u0012\u001102\u00a2\u0006\u000c\u0008>\u0012\u0008\u0008?\u0012\u0004\u0008\u0008(9\u0012\u0013\u0012\u00110\u000c\u00a2\u0006\u000c\u0008>\u0012\u0008\u0008?\u0012\u0004\u0008\u0008(O\u0012\u0004\u0012\u00020\u0005\u0018\u00010N8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\"\u0010U\u001a\u00020\u000c8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008S\u0010\u000e\u001a\u0004\u0008T\u0010\u0010\"\u0004\u0008@\u0010\u0012R\"\u0010Y\u001a\u00020\u000c8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008V\u0010\u000e\u001a\u0004\u0008W\u0010\u0010\"\u0004\u0008X\u0010\u0012R\"\u0010]\u001a\u00020\u000c8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008Z\u0010\u000e\u001a\u0004\u0008[\u0010\u0010\"\u0004\u0008\\\u0010\u0012R\u0016\u0010a\u001a\u0004\u0018\u00010^8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008_\u0010`R\u0011\u0010c\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008b\u0010\u0010R\u0011\u0010g\u001a\u00020d8F\u00a2\u0006\u0006\u001a\u0004\u0008e\u0010fR\u0014\u0010i\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008h\u0010\u0010\u00a8\u0006l"
    }
    d2 = {
        "Lio/github/sceneview/ar/node/ArNode;",
        "Lio/github/sceneview/node/ModelNode;",
        "Lxm;",
        "Lrm;",
        "arFrame",
        "",
        "r",
        "n1",
        "N",
        "l1",
        "toNode",
        "m1",
        "",
        "w0",
        "Z",
        "isSmoothPoseEnable",
        "()Z",
        "w1",
        "(Z)V",
        "x0",
        "getApplyPosePosition",
        "t1",
        "applyPosePosition",
        "y0",
        "getApplyPoseRotation",
        "setApplyPoseRotation",
        "applyPoseRotation",
        "",
        "z0",
        "Ljava/lang/Double;",
        "getAnchorPoseUpdateInterval",
        "()Ljava/lang/Double;",
        "setAnchorPoseUpdateInterval",
        "(Ljava/lang/Double;)V",
        "anchorPoseUpdateInterval",
        "<set-?>",
        "A0",
        "Lrm;",
        "getAnchorUpdatedFrame",
        "()Lrm;",
        "anchorUpdatedFrame",
        "Lcom/google/ar/core/Pose;",
        "value",
        "B0",
        "Lcom/google/ar/core/Pose;",
        "getPose",
        "()Lcom/google/ar/core/Pose;",
        "v1",
        "(Lcom/google/ar/core/Pose;)V",
        "pose",
        "Lcom/google/ar/core/Anchor;",
        "C0",
        "Lcom/google/ar/core/Anchor;",
        "o1",
        "()Lcom/google/ar/core/Anchor;",
        "s1",
        "(Lcom/google/ar/core/Anchor;)V",
        "anchor",
        "D0",
        "getCloudAnchorTaskInProgress",
        "cloudAnchorTaskInProgress",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "E0",
        "Lkotlin/jvm/functions/Function1;",
        "getOnPoseChanged",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnPoseChanged",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onPoseChanged",
        "F0",
        "getOnAnchorChanged",
        "setOnAnchorChanged",
        "onAnchorChanged",
        "G0",
        "isCameraTracking",
        "u1",
        "Lkotlin/Function2;",
        "success",
        "H0",
        "Lkotlin/jvm/functions/Function2;",
        "onCloudAnchorTaskCompleted",
        "I0",
        "m0",
        "isSelectable",
        "J0",
        "k0",
        "setRotationEditable",
        "isRotationEditable",
        "K0",
        "l0",
        "setScaleEditable",
        "isScaleEditable",
        "Lio/github/sceneview/ar/ArSceneView;",
        "q1",
        "()Lio/github/sceneview/ar/ArSceneView;",
        "sceneView",
        "r1",
        "isAnchored",
        "Lcom/google/ar/core/Anchor$CloudAnchorState;",
        "p1",
        "()Lcom/google/ar/core/Anchor$CloudAnchorState;",
        "cloudAnchorState",
        "p0",
        "isVisibleInHierarchy",
        "<init>",
        "()V",
        "arsceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public A0:Lrm;

.field public B0:Lcom/google/ar/core/Pose;

.field public C0:Lcom/google/ar/core/Anchor;

.field public D0:Z

.field public E0:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/google/ar/core/Pose;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public F0:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/google/ar/core/Anchor;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public G0:Z

.field public H0:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/google/ar/core/Anchor;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public I0:Z

.field public J0:Z

.field public K0:Z

.field public w0:Z

.field public x0:Z

.field public y0:Z

.field public z0:Ljava/lang/Double;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lio/github/sceneview/node/ModelNode;-><init>(Lhu1;Lhu1;Lhu1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/github/sceneview/ar/node/ArNode;->w0:Z

    iput-boolean v0, p0, Lio/github/sceneview/ar/node/ArNode;->x0:Z

    const-wide v1, 0x3fb999999999999aL    # 0.1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, p0, Lio/github/sceneview/ar/node/ArNode;->z0:Ljava/lang/Double;

    iput-boolean v0, p0, Lio/github/sceneview/ar/node/ArNode;->I0:Z

    iput-boolean v0, p0, Lio/github/sceneview/ar/node/ArNode;->J0:Z

    iput-boolean v0, p0, Lio/github/sceneview/ar/node/ArNode;->K0:Z

    return-void
.end method


# virtual methods
.method public E0(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/github/sceneview/ar/node/ArNode;->I0:Z

    return-void
.end method

.method public F(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->d(Lxm;Ljava/lang/Exception;)V

    return-void
.end method

.method public N()V
    .locals 2

    invoke-virtual {p0}, Lio/github/sceneview/ar/node/ArNode;->o1()Lcom/google/ar/core/Anchor;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/ar/core/Anchor;->detach()V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/github/sceneview/ar/node/ArNode;->s1(Lcom/google/ar/core/Anchor;)V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lio/github/sceneview/ar/node/ArNode;->D0:Z

    iput-object v0, p0, Lio/github/sceneview/ar/node/ArNode;->H0:Lkotlin/jvm/functions/Function2;

    invoke-super {p0}, Lio/github/sceneview/node/ModelNode;->N()V

    return-void
.end method

.method public bridge synthetic b0()Lio/github/sceneview/SceneView;
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/ar/node/ArNode;->q1()Lio/github/sceneview/ar/ArSceneView;

    move-result-object v0

    return-object v0
.end method

.method public c(Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->e(Lxm;Lio/github/sceneview/ar/arcore/ArSession;)V

    return-void
.end method

.method public i(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lxm$a;->b(Lxm;Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V

    return-void
.end method

.method public k0()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/sceneview/ar/node/ArNode;->J0:Z

    return v0
.end method

.method public l0()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/sceneview/ar/node/ArNode;->K0:Z

    return v0
.end method

.method public l1()Lio/github/sceneview/ar/node/ArNode;
    .locals 1

    new-instance v0, Lio/github/sceneview/ar/node/ArNode;

    invoke-direct {v0}, Lio/github/sceneview/ar/node/ArNode;-><init>()V

    invoke-virtual {p0, v0}, Lio/github/sceneview/ar/node/ArNode;->m1(Lio/github/sceneview/ar/node/ArNode;)Lio/github/sceneview/ar/node/ArNode;

    move-result-object v0

    return-object v0
.end method

.method public m(Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->c(Lxm;Lio/github/sceneview/ar/arcore/ArSession;)V

    return-void
.end method

.method public m0()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/sceneview/ar/node/ArNode;->I0:Z

    return v0
.end method

.method public final m1(Lio/github/sceneview/ar/node/ArNode;)Lio/github/sceneview/ar/node/ArNode;
    .locals 1

    const-string v0, "toNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lio/github/sceneview/node/ModelNode;->R0(Lio/github/sceneview/node/ModelNode;)Lio/github/sceneview/node/ModelNode;

    return-object p1
.end method

.method public n1()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/github/sceneview/ar/node/ArNode;->s1(Lcom/google/ar/core/Anchor;)V

    return-void
.end method

.method public o1()Lcom/google/ar/core/Anchor;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/ar/node/ArNode;->C0:Lcom/google/ar/core/Anchor;

    return-object v0
.end method

.method public p0()Z
    .locals 1

    invoke-super {p0}, Lio/github/sceneview/node/Node;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lio/github/sceneview/ar/node/ArNode;->G0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final p1()Lcom/google/ar/core/Anchor$CloudAnchorState;
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/ar/node/ArNode;->o1()Lcom/google/ar/core/Anchor;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/ar/core/Anchor;->getCloudAnchorState()Lcom/google/ar/core/Anchor$CloudAnchorState;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lcom/google/ar/core/Anchor$CloudAnchorState;->NONE:Lcom/google/ar/core/Anchor$CloudAnchorState;

    :cond_1
    return-object v0
.end method

.method public q1()Lio/github/sceneview/ar/ArSceneView;
    .locals 2

    invoke-super {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object v0

    instance-of v1, v0, Lio/github/sceneview/ar/ArSceneView;

    if-eqz v1, :cond_0

    check-cast v0, Lio/github/sceneview/ar/ArSceneView;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public r(Lrm;)V
    .locals 5

    const-string v0, "arFrame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lxm$a;->a(Lxm;Lrm;)V

    invoke-virtual {p1}, Lrm;->b()Lcom/google/ar/core/Camera;

    move-result-object v0

    invoke-static {v0}, LMb0;->a(Lcom/google/ar/core/Camera;)Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/github/sceneview/ar/node/ArNode;->u1(Z)V

    invoke-virtual {p0}, Lio/github/sceneview/ar/node/ArNode;->o1()Lcom/google/ar/core/Anchor;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/google/ar/core/Anchor;->getTrackingState()Lcom/google/ar/core/TrackingState;

    move-result-object v1

    sget-object v2, Lcom/google/ar/core/TrackingState;->TRACKING:Lcom/google/ar/core/TrackingState;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lio/github/sceneview/ar/node/ArNode;->z0:Ljava/lang/Double;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/github/sceneview/ar/node/ArNode;->A0:Lrm;

    invoke-virtual {p1, v1}, Lrm;->o(Lrm;)D

    move-result-wide v1

    iget-object v3, p0, Lio/github/sceneview/ar/node/ArNode;->z0:Ljava/lang/Double;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    cmpl-double v1, v1, v3

    if-ltz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/ar/core/Anchor;->getPose()Lcom/google/ar/core/Pose;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/github/sceneview/ar/node/ArNode;->v1(Lcom/google/ar/core/Pose;)V

    iput-object p1, p0, Lio/github/sceneview/ar/node/ArNode;->A0:Lrm;

    :cond_1
    iget-boolean p1, p0, Lio/github/sceneview/ar/node/ArNode;->D0:Z

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lio/github/sceneview/ar/node/ArNode;->p1()Lcom/google/ar/core/Anchor$CloudAnchorState;

    move-result-object p1

    sget-object v1, Lcom/google/ar/core/Anchor$CloudAnchorState;->NONE:Lcom/google/ar/core/Anchor$CloudAnchorState;

    if-eq p1, v1, :cond_4

    invoke-virtual {p0}, Lio/github/sceneview/ar/node/ArNode;->p1()Lcom/google/ar/core/Anchor$CloudAnchorState;

    move-result-object p1

    sget-object v1, Lcom/google/ar/core/Anchor$CloudAnchorState;->TASK_IN_PROGRESS:Lcom/google/ar/core/Anchor$CloudAnchorState;

    if-eq p1, v1, :cond_4

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/github/sceneview/ar/node/ArNode;->D0:Z

    iget-object v1, p0, Lio/github/sceneview/ar/node/ArNode;->H0:Lkotlin/jvm/functions/Function2;

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lio/github/sceneview/ar/node/ArNode;->p1()Lcom/google/ar/core/Anchor$CloudAnchorState;

    move-result-object v2

    sget-object v3, Lcom/google/ar/core/Anchor$CloudAnchorState;->SUCCESS:Lcom/google/ar/core/Anchor$CloudAnchorState;

    if-ne v2, v3, :cond_2

    const/4 p1, 0x1

    :cond_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/4 p1, 0x0

    iput-object p1, p0, Lio/github/sceneview/ar/node/ArNode;->H0:Lkotlin/jvm/functions/Function2;

    :cond_4
    return-void
.end method

.method public final r1()Z
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/ar/node/ArNode;->o1()Lcom/google/ar/core/Anchor;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public s1(Lcom/google/ar/core/Anchor;)V
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/ar/node/ArNode;->C0:Lcom/google/ar/core/Anchor;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/ar/core/Anchor;->detach()V

    :cond_0
    iput-object p1, p0, Lio/github/sceneview/ar/node/ArNode;->C0:Lcom/google/ar/core/Anchor;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/google/ar/core/Anchor;->getPose()Lcom/google/ar/core/Pose;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lio/github/sceneview/ar/node/ArNode;->v1(Lcom/google/ar/core/Pose;)V

    iget-object v0, p0, Lio/github/sceneview/ar/node/ArNode;->F0:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public final t1(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/github/sceneview/ar/node/ArNode;->x0:Z

    return-void
.end method

.method public final u1(Z)V
    .locals 1

    iget-boolean v0, p0, Lio/github/sceneview/ar/node/ArNode;->G0:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lio/github/sceneview/ar/node/ArNode;->G0:Z

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->N0()V

    :cond_0
    return-void
.end method

.method public v1(Lcom/google/ar/core/Pose;)V
    .locals 10

    iget-object v0, p0, Lio/github/sceneview/ar/node/ArNode;->B0:Lcom/google/ar/core/Pose;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, LCY3;->d(Lcom/google/ar/core/Pose;)LyM2;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1}, LCY3;->d(Lcom/google/ar/core/Pose;)LyM2;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    iput-object p1, p0, Lio/github/sceneview/ar/node/ArNode;->B0:Lcom/google/ar/core/Pose;

    if-eqz p1, :cond_9

    iget-boolean v0, p0, Lio/github/sceneview/ar/node/ArNode;->x0:Z

    if-eqz v0, :cond_2

    move-object v0, p1

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_3

    invoke-static {v0}, LCY3;->b(Lcom/google/ar/core/Pose;)Lhu1;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_3
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->X()Lhu1;

    move-result-object v0

    :cond_4
    move-object v3, v0

    iget-boolean v0, p0, Lio/github/sceneview/ar/node/ArNode;->y0:Z

    if-eqz v0, :cond_5

    move-object v1, p1

    :cond_5
    if-eqz v1, :cond_6

    invoke-static {v1}, LCY3;->c(Lcom/google/ar/core/Pose;)LUc4;

    move-result-object v0

    if-nez v0, :cond_7

    :cond_6
    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->Y()LUc4;

    move-result-object v0

    :cond_7
    move-object v4, v0

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->X()Lhu1;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->Y()LUc4;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    :cond_8
    const/4 v5, 0x0

    iget-boolean v6, p0, Lio/github/sceneview/ar/node/ArNode;->w0:Z

    const/4 v7, 0x0

    const/16 v8, 0x14

    const/4 v9, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v9}, Lio/github/sceneview/node/Node;->M0(Lio/github/sceneview/node/Node;Lhu1;LUc4;Lhu1;ZFILjava/lang/Object;)V

    :cond_9
    iget-object v0, p0, Lio/github/sceneview/ar/node/ArNode;->E0:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_a

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    return-void
.end method

.method public final w1(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/github/sceneview/ar/node/ArNode;->w0:Z

    return-void
.end method
