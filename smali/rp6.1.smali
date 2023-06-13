.class public final Lrp6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrp6$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lwb1;

.field public d:Llb1;

.field public e:Landroid/view/Surface;

.field public f:Landroidx/camera/core/o;

.field public g:Ljava/util/concurrent/Executor;

.field public h:Llb1$b$a;

.field public i:Lrp6$c;

.field public j:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public k:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Llb1;",
            ">;"
        }
    .end annotation
.end field

.field public m:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Llb1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwb1;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lrp6;->d:Llb1;

    iput-object v0, p0, Lrp6;->e:Landroid/view/Surface;

    iput-object v0, p0, Lrp6;->f:Landroidx/camera/core/o;

    iput-object v0, p0, Lrp6;->g:Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lrp6;->h:Llb1$b$a;

    sget-object v1, Lrp6$c;->b:Lrp6$c;

    iput-object v1, p0, Lrp6;->i:Lrp6$c;

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot close the encoder before configuring."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    iput-object v1, p0, Lrp6;->j:Lcom/google/common/util/concurrent/ListenableFuture;

    iput-object v0, p0, Lrp6;->k:LO80$a;

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    iput-object v1, p0, Lrp6;->l:Lcom/google/common/util/concurrent/ListenableFuture;

    iput-object v0, p0, Lrp6;->m:LO80$a;

    iput-object p3, p0, Lrp6;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lrp6;->b:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lrp6;->c:Lwb1;

    return-void
.end method

.method public static synthetic a(Lrp6;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lrp6;->p(LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lrp6;Landroidx/camera/core/o$g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lrp6;->u(Landroidx/camera/core/o$g;)V

    return-void
.end method

.method public static synthetic c(Lrp6;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0, p1}, Lrp6;->r(Landroid/view/Surface;)V

    return-void
.end method

.method public static synthetic d(Lrp6;Landroidx/camera/core/o;Lr46;Lyp6;LFP2;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lrp6;->q(Landroidx/camera/core/o;Lr46;Lyp6;LFP2;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lrp6;LO80$a;Landroidx/camera/core/o;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lrp6;->s(LO80$a;Landroidx/camera/core/o;Landroid/view/Surface;)V

    return-void
.end method

.method public static synthetic f(Lrp6;)V
    .locals 0

    invoke-direct {p0}, Lrp6;->t()V

    return-void
.end method

.method public static synthetic g(Lrp6;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lrp6;->o(LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic o(LO80$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iput-object p1, p0, Lrp6;->k:LO80$a;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ReleasedFuture "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private synthetic p(LO80$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iput-object p1, p0, Lrp6;->m:LO80$a;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ReadyToReleaseFuture "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private synthetic q(Landroidx/camera/core/o;Lr46;Lyp6;LFP2;LO80$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual/range {p0 .. p5}, Lrp6;->j(Landroidx/camera/core/o;Lr46;Lyp6;LFP2;LO80$a;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "ConfigureVideoEncoderFuture "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private synthetic r(Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, Lrp6;->h:Llb1$b$a;

    invoke-interface {v0, p1}, Llb1$b$a;->a(Landroid/view/Surface;)V

    return-void
.end method

.method private synthetic s(LO80$a;Landroidx/camera/core/o;Landroid/view/Surface;)V
    .locals 4

    sget-object v0, Lrp6$b;->a:[I

    iget-object v1, p0, Lrp6;->i:Lrp6$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "VideoEncoderSession"

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 p2, 0x3

    if-eq v0, p2, :cond_1

    const/4 p2, 0x4

    if-eq v0, p2, :cond_5

    const/4 p2, 0x5

    if-ne v0, p2, :cond_0

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "State "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lrp6;->i:Lrp6$c;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " is not handled"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, p0, Lrp6;->h:Llb1$b$a;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lrp6;->g:Ljava/util/concurrent/Executor;

    if-eqz p1, :cond_2

    new-instance p2, Llp6;

    invoke-direct {p2, p0, p3}, Llp6;-><init>(Lrp6;Landroid/view/Surface;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Surface is updated in READY state: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Landroidx/camera/core/o;->q()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Not provide surface, "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "EMPTY"

    invoke-static {p2, v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " is already serviced."

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v3, p2}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, LO80$a;->c(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lrp6;->h()V

    goto :goto_1

    :cond_4
    iput-object p3, p0, Lrp6;->e:Landroid/view/Surface;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "provide surface: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lrp6;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lkp6;

    invoke-direct {v1, p0}, Lkp6;-><init>(Lrp6;)V

    invoke-virtual {p2, p3, v0, v1}, Landroidx/camera/core/o;->A(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lrz0;)V

    sget-object p2, Lrp6$c;->e:Lrp6$c;

    iput-object p2, p0, Lrp6;->i:Lrp6$c;

    iget-object p2, p0, Lrp6;->d:Llb1;

    invoke-virtual {p1, p2}, LO80$a;->c(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Not provide surface in "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lrp6;->i:Lrp6$c;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v3, p2}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, LO80$a;->c(Ljava/lang/Object;)Z

    :goto_1
    return-void
.end method

.method private synthetic t()V
    .locals 2

    iget-object v0, p0, Lrp6;->k:LO80$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LO80$a;->c(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final h()V
    .locals 3

    sget-object v0, Lrp6$b;->a:[I

    iget-object v1, p0, Lrp6;->i:Lrp6$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    const-string v2, "VideoEncoderSession"

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const-string v0, "closeInternal in RELEASED state, No-op"

    invoke-static {v2, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "State "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lrp6;->i:Lrp6$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is not handled"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "closeInternal in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrp6;->i:Lrp6$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " state"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lrp6$c;->d:Lrp6$c;

    iput-object v0, p0, Lrp6;->i:Lrp6$c;

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lrp6;->x()V

    :goto_0
    return-void
.end method

.method public i(Landroidx/camera/core/o;Lr46;LFP2;Lyp6;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/o;",
            "Lr46;",
            "LFP2;",
            "Lyp6;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Llb1;",
            ">;"
        }
    .end annotation

    sget-object v0, Lrp6$b;->a:[I

    iget-object v1, p0, Lrp6;->i:Lrp6$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "configure() shouldn\'t be called in "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lrp6;->i:Lrp6$c;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lrp6$c;->c:Lrp6$c;

    iput-object v0, p0, Lrp6;->i:Lrp6$c;

    iput-object p1, p0, Lrp6;->f:Landroidx/camera/core/o;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Create VideoEncoderSession: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "VideoEncoderSession"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lnp6;

    invoke-direct {v0, p0}, Lnp6;-><init>(Lrp6;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    iput-object v0, p0, Lrp6;->j:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance v0, Lop6;

    invoke-direct {v0, p0}, Lop6;-><init>(Lrp6;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    iput-object v0, p0, Lrp6;->l:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance v0, Lpp6;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p4

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lpp6;-><init>(Lrp6;Landroidx/camera/core/o;Lr46;Lyp6;LFP2;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    new-instance p2, Lrp6$a;

    invoke-direct {p2, p0}, Lrp6$a;-><init>(Lrp6;)V

    iget-object p3, p0, Lrp6;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    invoke-static {p1}, LIA1;->j(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public final j(Landroidx/camera/core/o;Lr46;Lyp6;LFP2;LO80$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/o;",
            "Lr46;",
            "Lyp6;",
            "LFP2;",
            "LO80$a<",
            "Llb1;",
            ">;)V"
        }
    .end annotation

    invoke-static {p4, p3}, LZo6;->c(LFP2;Lyp6;)LmU2;

    move-result-object p3

    invoke-virtual {p4}, LFP2;->d()Lwp6;

    move-result-object p4

    invoke-virtual {p1}, Landroidx/camera/core/o;->n()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/o;->m()Landroid/util/Range;

    move-result-object v1

    invoke-static {p3, p2, p4, v0, v1}, LZo6;->b(LmU2;Lr46;Lwp6;Landroid/util/Size;Landroid/util/Range;)Ldp6;

    move-result-object p2

    :try_start_0
    iget-object p3, p0, Lrp6;->c:Lwb1;

    iget-object p4, p0, Lrp6;->a:Ljava/util/concurrent/Executor;

    invoke-interface {p3, p4, p2}, Lwb1;->a(Ljava/util/concurrent/Executor;Lub1;)Llb1;

    move-result-object p2

    iput-object p2, p0, Lrp6;->d:Llb1;
    :try_end_0
    .catch Landroidx/camera/video/internal/encoder/InvalidConfigException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {p2}, Llb1;->c()Llb1$a;

    move-result-object p2

    instance-of p3, p2, Llb1$b;

    if-nez p3, :cond_0

    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "The EncoderInput of video isn\'t a SurfaceInput."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p5, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    return-void

    :cond_0
    check-cast p2, Llb1$b;

    iget-object p3, p0, Lrp6;->b:Ljava/util/concurrent/Executor;

    new-instance p4, Lqp6;

    invoke-direct {p4, p0, p5, p1}, Lqp6;-><init>(Lrp6;LO80$a;Landroidx/camera/core/o;)V

    invoke-interface {p2, p3, p4}, Llb1$b;->a(Ljava/util/concurrent/Executor;Llb1$b$a;)V

    return-void

    :catch_0
    move-exception p1

    const-string p2, "VideoEncoderSession"

    const-string p3, "Unable to initialize video encoder."

    invoke-static {p2, p3, p1}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p5, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public k()Landroid/view/Surface;
    .locals 2

    iget-object v0, p0, Lrp6;->i:Lrp6$c;

    sget-object v1, Lrp6$c;->e:Lrp6$c;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lrp6;->e:Landroid/view/Surface;

    return-object v0
.end method

.method public l()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Llb1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrp6;->l:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-static {v0}, LIA1;->j(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public m()Llb1;
    .locals 1

    iget-object v0, p0, Lrp6;->d:Llb1;

    return-object v0
.end method

.method public n(Landroidx/camera/core/o;)Z
    .locals 4

    sget-object v0, Lrp6$b;->a:[I

    iget-object v1, p0, Lrp6;->i:Lrp6$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 p1, 0x4

    if-eq v0, p1, :cond_2

    const/4 p1, 0x5

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "State "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrp6;->i:Lrp6$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is not handled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lrp6;->f:Landroidx/camera/core/o;

    if-ne v0, p1, :cond_2

    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VideoEncoderSession@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrp6;->f:Landroidx/camera/core/o;

    const-string v2, "SURFACE_REQUEST_NOT_CONFIGURED"

    invoke-static {v1, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Landroidx/camera/core/o$g;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Surface can be closed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroidx/camera/core/o$g;->b()Landroid/view/Surface;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "VideoEncoderSession"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/camera/core/o$g;->b()Landroid/view/Surface;

    move-result-object p1

    iget-object v0, p0, Lrp6;->e:Landroid/view/Surface;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lrp6;->e:Landroid/view/Surface;

    iget-object p1, p0, Lrp6;->m:LO80$a;

    iget-object v0, p0, Lrp6;->d:Llb1;

    invoke-virtual {p1, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lrp6;->h()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    :goto_0
    return-void
.end method

.method public v(Ljava/util/concurrent/Executor;Llb1$b$a;)V
    .locals 0

    iput-object p1, p0, Lrp6;->g:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lrp6;->h:Llb1$b$a;

    return-void
.end method

.method public w()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lrp6;->h()V

    iget-object v0, p0, Lrp6;->j:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-static {v0}, LIA1;->j(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public x()V
    .locals 4

    sget-object v0, Lrp6$b;->a:[I

    iget-object v1, p0, Lrp6;->i:Lrp6$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    const-string v2, "VideoEncoderSession"

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "terminateNow in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrp6;->i:Lrp6$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", No-op"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "State "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lrp6;->i:Lrp6$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is not handled"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object v0, Lrp6$c;->f:Lrp6$c;

    iput-object v0, p0, Lrp6;->i:Lrp6$c;

    iget-object v0, p0, Lrp6;->m:LO80$a;

    iget-object v1, p0, Lrp6;->d:Llb1;

    invoke-virtual {v0, v1}, LO80$a;->c(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lrp6;->f:Landroidx/camera/core/o;

    iget-object v1, p0, Lrp6;->d:Llb1;

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "VideoEncoder is releasing: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lrp6;->d:Llb1;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lrp6;->d:Llb1;

    invoke-interface {v1}, Llb1;->release()V

    iget-object v1, p0, Lrp6;->d:Llb1;

    invoke-interface {v1}, Llb1;->d()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    new-instance v2, Lmp6;

    invoke-direct {v2, p0}, Lmp6;-><init>(Lrp6;)V

    iget-object v3, p0, Lrp6;->b:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v2, v3}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Lrp6;->d:Llb1;

    goto :goto_0

    :cond_2
    const-string v1, "There\'s no VideoEncoder to release! Finish release completer."

    invoke-static {v2, v1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lrp6;->k:LO80$a;

    invoke-virtual {v1, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    :goto_0
    return-void

    :cond_3
    sget-object v0, Lrp6$c;->f:Lrp6$c;

    iput-object v0, p0, Lrp6;->i:Lrp6$c;

    return-void
.end method
