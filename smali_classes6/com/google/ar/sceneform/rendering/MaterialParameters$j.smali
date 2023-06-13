.class public Lcom/google/ar/sceneform/rendering/MaterialParameters$j;
.super Lcom/google/ar/sceneform/rendering/MaterialParameters$m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ar/sceneform/rendering/MaterialParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# instance fields
.field public c:I

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0

    invoke-direct {p0}, Lcom/google/ar/sceneform/rendering/MaterialParameters$m;-><init>()V

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$m;->b:Ljava/lang/String;

    iput p2, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$j;->c:I

    iput p3, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$j;->d:I

    iput p4, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$j;->e:I

    return-void
.end method
