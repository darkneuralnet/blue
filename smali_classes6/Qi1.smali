.class public LQi1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/SurfaceTexture;

.field public final b:Landroid/view/Surface;

.field public c:Lcom/google/android/filament/Texture;

.field public d:Lcom/google/android/filament/Stream;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/SurfaceTexture;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->detachFromGLContext()V

    iput-object v0, p0, LQi1;->a:Landroid/graphics/SurfaceTexture;

    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v1, p0, LQi1;->b:Landroid/view/Surface;

    new-instance v1, Lcom/google/android/filament/Stream$Builder;

    invoke-direct {v1}, Lcom/google/android/filament/Stream$Builder;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/android/filament/Stream$Builder;->stream(Ljava/lang/Object;)Lcom/google/android/filament/Stream$Builder;

    move-result-object v0

    invoke-static {v0}, LvR5;->a(Lcom/google/android/filament/Stream$Builder;)Lcom/google/android/filament/Stream;

    move-result-object v0

    invoke-virtual {p0, v0}, LQi1;->e(Lcom/google/android/filament/Stream;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/filament/Stream;
    .locals 1

    iget-object v0, p0, LQi1;->d:Lcom/google/android/filament/Stream;

    invoke-static {v0}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/filament/Stream;

    return-object v0
.end method

.method public b()Lcom/google/android/filament/Texture;
    .locals 1

    iget-object v0, p0, LQi1;->c:Lcom/google/android/filament/Texture;

    invoke-static {v0}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/filament/Texture;

    return-object v0
.end method

.method public c()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, LQi1;->b:Landroid/view/Surface;

    invoke-static {v0}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Surface;

    return-object v0
.end method

.method public d()Landroid/graphics/SurfaceTexture;
    .locals 1

    iget-object v0, p0, LQi1;->a:Landroid/graphics/SurfaceTexture;

    invoke-static {v0}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/SurfaceTexture;

    return-object v0
.end method

.method public final e(Lcom/google/android/filament/Stream;)V
    .locals 2

    iget-object v0, p0, LQi1;->c:Lcom/google/android/filament/Texture;

    if-nez v0, :cond_0

    iput-object p1, p0, LQi1;->d:Lcom/google/android/filament/Stream;

    new-instance v0, Lcom/google/android/filament/Texture$Builder;

    invoke-direct {v0}, Lcom/google/android/filament/Texture$Builder;-><init>()V

    sget-object v1, Lcom/google/android/filament/Texture$Sampler;->SAMPLER_EXTERNAL:Lcom/google/android/filament/Texture$Sampler;

    invoke-virtual {v0, v1}, Lcom/google/android/filament/Texture$Builder;->sampler(Lcom/google/android/filament/Texture$Sampler;)Lcom/google/android/filament/Texture$Builder;

    move-result-object v0

    sget-object v1, Lcom/google/android/filament/Texture$InternalFormat;->RGB8:Lcom/google/android/filament/Texture$InternalFormat;

    invoke-virtual {v0, v1}, Lcom/google/android/filament/Texture$Builder;->format(Lcom/google/android/filament/Texture$InternalFormat;)Lcom/google/android/filament/Texture$Builder;

    move-result-object v0

    invoke-static {v0}, Le36;->a(Lcom/google/android/filament/Texture$Builder;)Lcom/google/android/filament/Texture;

    move-result-object v0

    iput-object v0, p0, LQi1;->c:Lcom/google/android/filament/Texture;

    invoke-static {v0, p1}, Le36;->c(Lcom/google/android/filament/Texture;Lcom/google/android/filament/Stream;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Stream was initialized twice"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
