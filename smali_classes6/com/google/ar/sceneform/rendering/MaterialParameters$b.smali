.class public Lcom/google/ar/sceneform/rendering/MaterialParameters$b;
.super Lcom/google/ar/sceneform/rendering/MaterialParameters$m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ar/sceneform/rendering/MaterialParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public c:Z

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/ar/sceneform/rendering/MaterialParameters$m;-><init>()V

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$m;->b:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$b;->c:Z

    iput-boolean p3, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$b;->d:Z

    iput-boolean p4, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$b;->e:Z

    return-void
.end method
