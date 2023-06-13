.class public Lcom/google/ar/sceneform/rendering/MaterialParameters$n;
.super Lcom/google/ar/sceneform/rendering/MaterialParameters$m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ar/sceneform/rendering/MaterialParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "n"
.end annotation


# instance fields
.field public final c:Lcom/google/ar/sceneform/rendering/Texture;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/ar/sceneform/rendering/Texture;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/ar/sceneform/rendering/MaterialParameters$m;-><init>()V

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$m;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$n;->c:Lcom/google/ar/sceneform/rendering/Texture;

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

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/MaterialParameters$n;->d()Lcom/google/ar/sceneform/rendering/MaterialParameters$m;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/ar/sceneform/rendering/MaterialParameters$m;
    .locals 3

    new-instance v0, Lcom/google/ar/sceneform/rendering/MaterialParameters$n;

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$m;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters$n;->c:Lcom/google/ar/sceneform/rendering/Texture;

    invoke-direct {v0, v1, v2}, Lcom/google/ar/sceneform/rendering/MaterialParameters$n;-><init>(Ljava/lang/String;Lcom/google/ar/sceneform/rendering/Texture;)V

    return-object v0
.end method
