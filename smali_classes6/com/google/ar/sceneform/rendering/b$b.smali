.class public final Lcom/google/ar/sceneform/rendering/b$b;
.super Lcom/google/ar/sceneform/rendering/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ar/sceneform/rendering/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/ar/sceneform/rendering/d$a<",
        "Lcom/google/ar/sceneform/rendering/b;",
        "Lcom/google/ar/sceneform/rendering/b$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/ar/sceneform/rendering/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public j()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/google/ar/sceneform/rendering/b;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/google/ar/sceneform/rendering/b;

    return-object v0
.end method

.method public k()LrM4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LrM4<",
            "Lcom/google/ar/sceneform/rendering/b;",
            ">;"
        }
    .end annotation

    invoke-static {}, LnM4;->d()LnM4;

    move-result-object v0

    invoke-virtual {v0}, LnM4;->e()LrM4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Lcom/google/ar/sceneform/rendering/d$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/b$b;->t()Lcom/google/ar/sceneform/rendering/b$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic r()Lcom/google/ar/sceneform/rendering/d;
    .locals 1

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/b$b;->u()Lcom/google/ar/sceneform/rendering/b;

    move-result-object v0

    return-object v0
.end method

.method public t()Lcom/google/ar/sceneform/rendering/b$b;
    .locals 0

    return-object p0
.end method

.method public u()Lcom/google/ar/sceneform/rendering/b;
    .locals 2

    new-instance v0, Lcom/google/ar/sceneform/rendering/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/ar/sceneform/rendering/b;-><init>(Lcom/google/ar/sceneform/rendering/b$b;Lcom/google/ar/sceneform/rendering/b$a;)V

    return-object v0
.end method
