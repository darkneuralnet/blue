.class public LFY5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFY5;->n(Lgc0;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LCA1<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lgc0;

.field public final synthetic b:LFY5;


# direct methods
.method public constructor <init>(LFY5;Lgc0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LFY5$a;->b:LFY5;

    iput-object p2, p0, LFY5$a;->a:Lgc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 0

    iget-object p1, p0, LFY5$a;->b:LFY5;

    iget-object p1, p1, LFY5;->b:LeX1;

    invoke-interface {p1}, LeX1;->b()V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, LFY5$a;->a:Lgc0;

    invoke-virtual {v0}, Lgc0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Landroidx/camera/core/ImageCaptureException;

    if-eqz v0, :cond_1

    iget-object v0, p0, LFY5$a;->b:LFY5;

    iget-object v0, v0, LFY5;->c:LEX1;

    check-cast p1, Landroidx/camera/core/ImageCaptureException;

    invoke-virtual {v0, p1}, LEX1;->i(Landroidx/camera/core/ImageCaptureException;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LFY5$a;->b:LFY5;

    iget-object v0, v0, LFY5;->c:LEX1;

    new-instance v1, Landroidx/camera/core/ImageCaptureException;

    const/4 v2, 0x2

    const-string v3, "Failed to submit capture request"

    invoke-direct {v1, v2, v3, p1}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, LEX1;->i(Landroidx/camera/core/ImageCaptureException;)V

    :goto_0
    iget-object p1, p0, LFY5$a;->b:LFY5;

    iget-object p1, p1, LFY5;->b:LeX1;

    invoke-interface {p1}, LeX1;->b()V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, LFY5$a;->a(Ljava/lang/Void;)V

    return-void
.end method
