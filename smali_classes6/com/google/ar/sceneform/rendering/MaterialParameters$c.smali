.class public Lcom/google/ar/sceneform/rendering/MaterialParameters$c;
.super Lcom/google/ar/sceneform/rendering/MaterialParameters$m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ar/sceneform/rendering/MaterialParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZZZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/ar/sceneform/rendering/MaterialParameters$m;-><init>()V

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$m;->b:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$c;->c:Z

    iput-boolean p3, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$c;->d:Z

    iput-boolean p4, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$c;->e:Z

    iput-boolean p5, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$c;->f:Z

    return-void
.end method
