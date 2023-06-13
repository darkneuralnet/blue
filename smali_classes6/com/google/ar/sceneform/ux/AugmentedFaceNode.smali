.class public Lcom/google/ar/sceneform/ux/AugmentedFaceNode;
.super Lio/github/sceneview/ar/node/ArNode;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/github/sceneview/ar/node/ArNode;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-super {p0}, Lio/github/sceneview/ar/node/ArNode;->l1()Lio/github/sceneview/ar/node/ArNode;

    move-result-object v0

    return-object v0
.end method
