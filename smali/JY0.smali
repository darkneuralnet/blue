.class public final synthetic LJY0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrz0;


# instance fields
.field public final synthetic a:LLY0;

.field public final synthetic b:Landroid/graphics/SurfaceTexture;

.field public final synthetic c:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(LLY0;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJY0;->a:LLY0;

    iput-object p2, p0, LJY0;->b:Landroid/graphics/SurfaceTexture;

    iput-object p3, p0, LJY0;->c:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, LJY0;->a:LLY0;

    iget-object v1, p0, LJY0;->b:Landroid/graphics/SurfaceTexture;

    iget-object v2, p0, LJY0;->c:Landroid/view/Surface;

    check-cast p1, Landroidx/camera/core/o$g;

    invoke-static {v0, v1, v2, p1}, LLY0;->f(LLY0;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;Landroidx/camera/core/o$g;)V

    return-void
.end method
