.class public LHs4$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHs4;->X(Lrp6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LCA1<",
        "Llb1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lrp6;

.field public final synthetic b:LHs4;


# direct methods
.method public constructor <init>(LHs4;Lrp6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LHs4$b;->b:LHs4;

    iput-object p2, p0, LHs4$b;->a:Lrp6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Llb1;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VideoEncoder can be released: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LHs4$b;->b:LHs4;

    iget-object v0, v0, LHs4;->Y:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LHs4$b;->b:LHs4;

    iget-object v0, v0, LHs4;->B:Llb1;

    if-eqz v0, :cond_1

    if-ne v0, p1, :cond_1

    invoke-static {v0}, LHs4;->P(Llb1;)V

    :cond_1
    iget-object p1, p0, LHs4$b;->b:LHs4;

    iget-object v0, p0, LHs4$b;->a:Lrp6;

    iput-object v0, p1, LHs4;->b0:Lrp6;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LHs4;->e0(Landroid/view/Surface;)V

    iget-object p1, p0, LHs4$b;->b:LHs4;

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, LHs4;->Z(ILjava/lang/Throwable;)V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error in ReadyToReleaseFuture: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Recorder"

    invoke-static {v0, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Llb1;

    invoke-virtual {p0, p1}, LHs4$b;->a(Llb1;)V

    return-void
.end method
