.class public final synthetic Ld74;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lf74;

.field public final synthetic c:Landroidx/camera/core/ImageCaptureException;


# direct methods
.method public synthetic constructor <init>(Lf74;Landroidx/camera/core/ImageCaptureException;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld74;->b:Lf74;

    iput-object p2, p0, Ld74;->c:Landroidx/camera/core/ImageCaptureException;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ld74;->b:Lf74;

    iget-object v1, p0, Ld74;->c:Landroidx/camera/core/ImageCaptureException;

    invoke-static {v0, v1}, Le74;->e(Lf74;Landroidx/camera/core/ImageCaptureException;)V

    return-void
.end method
