.class public final synthetic Ltc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrz0;


# instance fields
.field public final synthetic a:Landroid/view/Surface;

.field public final synthetic b:Landroid/graphics/SurfaceTexture;


# direct methods
.method public synthetic constructor <init>(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltc0;->a:Landroid/view/Surface;

    iput-object p2, p0, Ltc0;->b:Landroid/graphics/SurfaceTexture;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ltc0;->a:Landroid/view/Surface;

    iget-object v1, p0, Ltc0;->b:Landroid/graphics/SurfaceTexture;

    check-cast p1, Landroidx/camera/core/o$g;

    invoke-static {v0, v1, p1}, Landroidx/camera/core/internal/CameraUseCaseAdapter;->g(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;Landroidx/camera/core/o$g;)V

    return-void
.end method
