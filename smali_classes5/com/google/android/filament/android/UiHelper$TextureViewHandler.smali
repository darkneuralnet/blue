.class Lcom/google/android/filament/android/UiHelper$TextureViewHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/filament/android/UiHelper$RenderSurface;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/android/UiHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TextureViewHandler"
.end annotation


# instance fields
.field private mSurface:Landroid/view/Surface;

.field private mTextureView:Landroid/view/TextureView;

.field final synthetic this$0:Lcom/google/android/filament/android/UiHelper;


# direct methods
.method public constructor <init>(Lcom/google/android/filament/android/UiHelper;Landroid/view/TextureView;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/filament/android/UiHelper$TextureViewHandler;->this$0:Lcom/google/android/filament/android/UiHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/filament/android/UiHelper$TextureViewHandler;->mTextureView:Landroid/view/TextureView;

    return-void
.end method


# virtual methods
.method public detach()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/android/UiHelper$TextureViewHandler;->setSurface(Landroid/view/Surface;)V

    return-void
.end method

.method public resize(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/android/UiHelper$TextureViewHandler;->mTextureView:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    iget-object v0, p0, Lcom/google/android/filament/android/UiHelper$TextureViewHandler;->this$0:Lcom/google/android/filament/android/UiHelper;

    invoke-static {v0}, Lcom/google/android/filament/android/UiHelper;->access$000(Lcom/google/android/filament/android/UiHelper;)Lcom/google/android/filament/android/UiHelper$RendererCallback;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/android/filament/android/UiHelper$RendererCallback;->onResized(II)V

    return-void
.end method

.method public setSurface(Landroid/view/Surface;)V
    .locals 1

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/google/android/filament/android/UiHelper$TextureViewHandler;->mSurface:Landroid/view/Surface;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    :cond_0
    iput-object p1, p0, Lcom/google/android/filament/android/UiHelper$TextureViewHandler;->mSurface:Landroid/view/Surface;

    return-void
.end method
