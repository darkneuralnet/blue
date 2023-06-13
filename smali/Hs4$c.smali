.class public LHs4$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHs4;->y(LHs4$i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LO80$a;

.field public final synthetic c:LHs4$i;

.field public final synthetic d:LHs4;


# direct methods
.method public constructor <init>(LHs4;LO80$a;LHs4$i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LHs4$c;->d:LHs4;

    iput-object p2, p0, LHs4$c;->b:LO80$a;

    iput-object p3, p0, LHs4$c;->c:LHs4$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgb1;)V
    .locals 3

    iget-object v0, p0, LHs4$c;->d:LHs4;

    iget-object v1, v0, LHs4;->z:Landroid/media/MediaMuxer;

    if-nez v1, :cond_7

    iget-boolean v1, v0, LHs4;->p:Z

    const-string v2, "Recorder"

    if-nez v1, :cond_6

    iget-object v0, v0, LHs4;->T:Lgb1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lgb1;->close()V

    iget-object v0, p0, LHs4$c;->d:LHs4;

    const/4 v1, 0x0

    iput-object v1, v0, LHs4;->T:Lgb1;

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Lgb1;->Z()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, LHs4$c;->d:LHs4;

    iput-object p1, v1, LHs4;->T:Lgb1;

    invoke-virtual {v1}, LHs4;->B()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LHs4$c;->d:LHs4;

    iget-object p1, p1, LHs4;->U:Lmb5;

    invoke-interface {p1}, Lmb5;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    const-string p1, "Replaced cached video keyframe with newer keyframe."

    invoke-static {v2, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const-string p1, "Cached video keyframe while we wait for first audio sample before starting muxer."

    invoke-static {v2, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    :goto_1
    const-string p1, "Received video keyframe. Starting muxer..."

    invoke-static {v2, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LHs4$c;->d:LHs4;

    iget-object v0, p0, LHs4$c;->c:LHs4$i;

    invoke-virtual {p1, v0}, LHs4;->h0(LHs4$i;)V

    goto :goto_2

    :cond_4
    if-eqz v0, :cond_5

    const-string v0, "Dropped cached keyframe since we have new video data and have not yet received audio data."

    invoke-static {v2, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    const-string v0, "Dropped video data since muxer has not yet started and data is not a keyframe."

    invoke-static {v2, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LHs4$c;->d:LHs4;

    iget-object v0, v0, LHs4;->B:Llb1;

    invoke-interface {v0}, Llb1;->e()V

    invoke-interface {p1}, Lgb1;->close()V

    goto :goto_2

    :cond_6
    const-string v0, "Drop video data since recording is stopping."

    invoke-static {v2, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Lgb1;->close()V

    goto :goto_2

    :cond_7
    :try_start_0
    iget-object v1, p0, LHs4$c;->c:LHs4$i;

    invoke-virtual {v0, p1, v1}, LHs4;->t0(Lgb1;LHs4$i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_8

    invoke-interface {p1}, Lgb1;->close()V

    :cond_8
    :goto_2
    return-void

    :catchall_0
    move-exception v0

    if-eqz p1, :cond_9

    :try_start_1
    invoke-interface {p1}, Lgb1;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_9
    :goto_3
    throw v0
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d(Landroidx/camera/video/internal/encoder/EncodeException;)V
    .locals 1

    iget-object v0, p0, LHs4$c;->b:LO80$a;

    invoke-virtual {v0, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, LHs4$c;->b:LO80$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LO80$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public f(LRz3;)V
    .locals 1

    iget-object v0, p0, LHs4$c;->d:LHs4;

    iput-object p1, v0, LHs4;->C:LRz3;

    return-void
.end method
