.class public abstract Llf0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llf0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# instance fields
.field public a:Lpa0;

.field public b:Landroidx/camera/core/impl/DeferrableSurface;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static g(Landroid/util/Size;I)Llf0$b;
    .locals 3

    new-instance v0, Lqt;

    new-instance v1, Ls91;

    invoke-direct {v1}, Ls91;-><init>()V

    new-instance v2, Ls91;

    invoke-direct {v2}, Ls91;-><init>()V

    invoke-direct {v0, p0, p1, v1, v2}, Lqt;-><init>(Landroid/util/Size;ILs91;Ls91;)V

    return-object v0
.end method


# virtual methods
.method public a()Lpa0;
    .locals 1

    iget-object v0, p0, Llf0$b;->a:Lpa0;

    return-object v0
.end method

.method public abstract b()Ls91;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls91<",
            "Landroidx/camera/core/ImageCaptureException;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c()I
.end method

.method public abstract d()Ls91;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls91<",
            "Lf74;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e()Landroid/util/Size;
.end method

.method public f()Landroidx/camera/core/impl/DeferrableSurface;
    .locals 1

    iget-object v0, p0, Llf0$b;->b:Landroidx/camera/core/impl/DeferrableSurface;

    return-object v0
.end method

.method public h(Lpa0;)V
    .locals 0

    iput-object p1, p0, Llf0$b;->a:Lpa0;

    return-void
.end method

.method public i(Landroid/view/Surface;)V
    .locals 3

    iget-object v0, p0, Llf0$b;->b:Landroidx/camera/core/impl/DeferrableSurface;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The surface is already set."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    new-instance v0, LNY1;

    invoke-virtual {p0}, Llf0$b;->e()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {p0}, Llf0$b;->c()I

    move-result v2

    invoke-direct {v0, p1, v1, v2}, LNY1;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    iput-object v0, p0, Llf0$b;->b:Landroidx/camera/core/impl/DeferrableSurface;

    return-void
.end method
