.class public final synthetic LC90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/view/Surface;

.field public final synthetic c:Landroid/graphics/SurfaceTexture;


# direct methods
.method public synthetic constructor <init>(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC90;->b:Landroid/view/Surface;

    iput-object p2, p0, LC90;->c:Landroid/graphics/SurfaceTexture;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LC90;->b:Landroid/view/Surface;

    iget-object v1, p0, LC90;->c:Landroid/graphics/SurfaceTexture;

    invoke-static {v0, v1}, LF90;->w(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    return-void
.end method
