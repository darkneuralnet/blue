.class public Lcom/google/ar/sceneform/ArCameraNode;
.super Lcom/google/ar/sceneform/CameraNode;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/ar/sceneform/CameraNode;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public U0()V
    .locals 0

    return-void
.end method

.method public X0(Lcom/google/ar/core/Camera;)V
    .locals 4

    const-string v0, "Parameter \"camera\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/ar/sceneform/CameraNode;->P:LjN2;

    iget-object v0, v0, LjN2;->a:[F

    iget v1, p0, Lcom/google/ar/sceneform/CameraNode;->R:F

    iget v2, p0, Lcom/google/ar/sceneform/CameraNode;->S:F

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v3, v1, v2}, Lcom/google/ar/core/Camera;->getProjectionMatrix([FIFF)V

    invoke-virtual {p0}, Lcom/google/ar/sceneform/CameraNode;->S0()LjN2;

    move-result-object v0

    iget-object v0, v0, LjN2;->a:[F

    invoke-virtual {p1, v0, v3}, Lcom/google/ar/core/Camera;->getViewMatrix([FI)V

    invoke-virtual {p1}, Lcom/google/ar/core/Camera;->getDisplayOrientedPose()Lcom/google/ar/core/Pose;

    move-result-object p1

    invoke-static {p1}, LCY3;->b(Lcom/google/ar/core/Pose;)Lhu1;

    move-result-object v0

    invoke-super {p0, v0}, Lio/github/sceneview/node/Node;->z0(Lhu1;)V

    invoke-static {p1}, LCY3;->c(Lcom/google/ar/core/Pose;)LUc4;

    move-result-object p1

    invoke-super {p0, p1}, Lio/github/sceneview/node/Node;->A0(LUc4;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/ar/sceneform/CameraNode;->W:Z

    return-void
.end method
