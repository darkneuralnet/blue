.class public Lcom/google/ar/sceneform/rendering/MaterialParameters$k;
.super Lcom/google/ar/sceneform/rendering/MaterialParameters$m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ar/sceneform/rendering/MaterialParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "k"
.end annotation


# instance fields
.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IIII)V
    .locals 0

    invoke-direct {p0}, Lcom/google/ar/sceneform/rendering/MaterialParameters$m;-><init>()V

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$m;->b:Ljava/lang/String;

    iput p2, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$k;->c:I

    iput p3, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$k;->d:I

    iput p4, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$k;->e:I

    iput p5, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$k;->f:I

    return-void
.end method
