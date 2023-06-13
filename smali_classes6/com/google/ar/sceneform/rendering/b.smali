.class public Lcom/google/ar/sceneform/rendering/b;
.super Lcom/google/ar/sceneform/rendering/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/ar/sceneform/rendering/b$b;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/ar/sceneform/rendering/b$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/ar/sceneform/rendering/d;-><init>(Lcom/google/ar/sceneform/rendering/d$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/ar/sceneform/rendering/b$b;Lcom/google/ar/sceneform/rendering/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/ar/sceneform/rendering/b;-><init>(Lcom/google/ar/sceneform/rendering/b$b;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/ar/sceneform/rendering/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/ar/sceneform/rendering/d;-><init>(Lcom/google/ar/sceneform/rendering/d;)V

    invoke-virtual {p0, p1}, Lcom/google/ar/sceneform/rendering/b;->v(Lcom/google/ar/sceneform/rendering/b;)V

    return-void
.end method

.method public static u()Lcom/google/ar/sceneform/rendering/b$b;
    .locals 1

    invoke-static {}, Lzd;->b()V

    new-instance v0, Lcom/google/ar/sceneform/rendering/b$b;

    invoke-direct {v0}, Lcom/google/ar/sceneform/rendering/b$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic p()Lcom/google/ar/sceneform/rendering/d;
    .locals 1

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/b;->w()Lcom/google/ar/sceneform/rendering/b;

    move-result-object v0

    return-object v0
.end method

.method public final v(Lcom/google/ar/sceneform/rendering/b;)V
    .locals 0

    return-void
.end method

.method public w()Lcom/google/ar/sceneform/rendering/b;
    .locals 1

    new-instance v0, Lcom/google/ar/sceneform/rendering/b;

    invoke-direct {v0, p0}, Lcom/google/ar/sceneform/rendering/b;-><init>(Lcom/google/ar/sceneform/rendering/b;)V

    return-object v0
.end method
