.class public Lcom/google/ar/sceneform/rendering/MaterialParameters$g;
.super Lcom/google/ar/sceneform/rendering/MaterialParameters$m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ar/sceneform/rendering/MaterialParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field public c:F

.field public d:F

.field public e:F

.field public f:F


# direct methods
.method public constructor <init>(Ljava/lang/String;FFFF)V
    .locals 0

    invoke-direct {p0}, Lcom/google/ar/sceneform/rendering/MaterialParameters$m;-><init>()V

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$m;->b:Ljava/lang/String;

    iput p2, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$g;->c:F

    iput p3, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$g;->d:F

    iput p4, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$g;->e:F

    iput p5, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$g;->f:F

    return-void
.end method
