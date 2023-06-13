.class public Lcom/google/ar/sceneform/rendering/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/ar/sceneform/rendering/a;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/nio/Buffer;

.field public c:Z

.field public d:Ljava/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Function<",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LQj6;)V
    .locals 0

    return-void
.end method

.method public b(Ljava/nio/FloatBuffer;)V
    .locals 0

    return-void
.end method

.method public c(Lcom/google/android/filament/IndexBuffer;)V
    .locals 0

    return-void
.end method

.method public d()Lcom/google/android/filament/IndexBuffer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Lcom/google/android/filament/VertexBuffer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Ljava/nio/FloatBuffer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public g(Ljava/nio/FloatBuffer;)V
    .locals 0

    return-void
.end method

.method public h(LQj6;)V
    .locals 0

    return-void
.end method

.method public i()LQj6;
    .locals 1

    invoke-static {}, LQj6;->x()LQj6;

    move-result-object v0

    return-object v0
.end method

.method public j()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/google/ar/sceneform/rendering/f$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0
.end method

.method public k()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public l()LQj6;
    .locals 1

    invoke-static {}, LQj6;->x()LQj6;

    move-result-object v0

    return-object v0
.end method

.method public m()LQj6;
    .locals 1

    invoke-static {}, LQj6;->x()LQj6;

    move-result-object v0

    return-object v0
.end method

.method public n(Lcom/google/android/filament/VertexBuffer;)V
    .locals 0

    return-void
.end method

.method public o(Ljava/nio/FloatBuffer;)V
    .locals 0

    return-void
.end method

.method public p(Lox4;I)V
    .locals 0

    return-void
.end method

.method public q()Ljava/nio/FloatBuffer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public r()Ljava/nio/FloatBuffer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public s(Ljava/nio/IntBuffer;)V
    .locals 0

    return-void
.end method

.method public t(Ljava/nio/FloatBuffer;)V
    .locals 0

    return-void
.end method

.method public u()Ljava/nio/FloatBuffer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public v()Ljava/nio/IntBuffer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public w()LQj6;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not Implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
