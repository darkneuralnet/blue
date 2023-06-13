.class public final LSN4$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSN4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation
.end field

.field public c:Lio/reactivex/functions/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/q<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lio/reactivex/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/k<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lcom/github/davidmoten/guavamini/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/github/davidmoten/guavamini/Optional<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lcom/github/davidmoten/guavamini/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/github/davidmoten/guavamini/Optional<",
            "Lio/reactivex/E;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lio/reactivex/functions/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/g<",
            "-",
            "LSN4$g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LSN4$f;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LSN4$f;->b:Ljava/util/List;

    invoke-static {}, Lio/reactivex/internal/functions/a;->c()Lio/reactivex/functions/q;

    move-result-object v0

    iput-object v0, p0, LSN4$f;->c:Lio/reactivex/functions/q;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/k;->o0(Ljava/lang/Object;)Lio/reactivex/k;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/k;->G0()Lio/reactivex/k;

    move-result-object v0

    iput-object v0, p0, LSN4$f;->d:Lio/reactivex/k;

    invoke-static {}, Lcom/github/davidmoten/guavamini/Optional;->a()Lcom/github/davidmoten/guavamini/Optional;

    move-result-object v0

    iput-object v0, p0, LSN4$f;->e:Lcom/github/davidmoten/guavamini/Optional;

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-static {v0}, Lcom/github/davidmoten/guavamini/Optional;->d(Ljava/lang/Object;)Lcom/github/davidmoten/guavamini/Optional;

    move-result-object v0

    iput-object v0, p0, LSN4$f;->f:Lcom/github/davidmoten/guavamini/Optional;

    invoke-static {}, Lsz0;->a()Lio/reactivex/functions/g;

    move-result-object v0

    iput-object v0, p0, LSN4$f;->g:Lio/reactivex/functions/g;

    return-void
.end method

.method public synthetic constructor <init>(LSN4$a;)V
    .locals 0

    invoke-direct {p0}, LSN4$f;-><init>()V

    return-void
.end method

.method public static j(Ljava/util/concurrent/TimeUnit;)Lio/reactivex/functions/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lio/reactivex/functions/o<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    new-instance v0, LSN4$f$a;

    invoke-direct {v0, p0}, LSN4$f$a;-><init>(Ljava/util/concurrent/TimeUnit;)V

    return-object v0
.end method


# virtual methods
.method public a()Lio/reactivex/functions/o;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/functions/o<",
            "Lio/reactivex/k<",
            "+",
            "Ljava/lang/Throwable;",
            ">;",
            "Lio/reactivex/k<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LSN4$f;->d:Lio/reactivex/k;

    invoke-static {v0}, LAZ3;->a(Ljava/lang/Object;)V

    iget-object v0, p0, LSN4$f;->e:Lcom/github/davidmoten/guavamini/Optional;

    invoke-virtual {v0}, Lcom/github/davidmoten/guavamini/Optional;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LSN4$f;->d:Lio/reactivex/k;

    iget-object v1, p0, LSN4$f;->e:Lcom/github/davidmoten/guavamini/Optional;

    invoke-virtual {v1}, Lcom/github/davidmoten/guavamini/Optional;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lio/reactivex/k;->g1(J)Lio/reactivex/k;

    move-result-object v0

    iput-object v0, p0, LSN4$f;->d:Lio/reactivex/k;

    :cond_0
    iget-object v1, p0, LSN4$f;->d:Lio/reactivex/k;

    iget-object v0, p0, LSN4$f;->f:Lcom/github/davidmoten/guavamini/Optional;

    invoke-virtual {v0}, Lcom/github/davidmoten/guavamini/Optional;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lio/reactivex/E;

    iget-object v3, p0, LSN4$f;->g:Lio/reactivex/functions/g;

    iget-object v4, p0, LSN4$f;->a:Ljava/util/List;

    iget-object v5, p0, LSN4$f;->b:Ljava/util/List;

    iget-object v6, p0, LSN4$f;->c:Lio/reactivex/functions/q;

    invoke-static/range {v1 .. v6}, LSN4;->d(Lio/reactivex/k;Lio/reactivex/E;Lio/reactivex/functions/g;Ljava/util/List;Ljava/util/List;Lio/reactivex/functions/q;)Lio/reactivex/functions/o;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;)LSN4$f;
    .locals 0

    invoke-static {p1}, Lio/reactivex/k;->o0(Ljava/lang/Object;)Lio/reactivex/k;

    move-result-object p1

    invoke-static {p2}, LSN4$f;->j(Ljava/util/concurrent/TimeUnit;)Lio/reactivex/functions/o;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/k;->q0(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/k;->G0()Lio/reactivex/k;

    move-result-object p1

    iput-object p1, p0, LSN4$f;->d:Lio/reactivex/k;

    return-object p0
.end method

.method public c(JJLjava/util/concurrent/TimeUnit;D)LSN4$f;
    .locals 12

    move-object v9, p0

    const/4 v0, 0x1

    const v1, 0x7fffffff

    invoke-static {v0, v1}, Lio/reactivex/k;->F0(II)Lio/reactivex/k;

    move-result-object v10

    new-instance v11, LSN4$f$b;

    move-object v0, v11

    move-object v1, p0

    move-wide/from16 v2, p6

    move-object/from16 v4, p5

    move-wide v5, p1

    move-wide v7, p3

    invoke-direct/range {v0 .. v8}, LSN4$f$b;-><init>(LSN4$f;DLjava/util/concurrent/TimeUnit;JJ)V

    invoke-virtual {v10, v11}, Lio/reactivex/k;->q0(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object v0

    iput-object v0, v9, LSN4$f;->d:Lio/reactivex/k;

    return-object v9
.end method

.method public d(JLjava/util/concurrent/TimeUnit;)LSN4$f;
    .locals 6

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, LSN4$f;->e(JLjava/util/concurrent/TimeUnit;D)LSN4$f;

    move-result-object p1

    return-object p1
.end method

.method public e(JLjava/util/concurrent/TimeUnit;D)LSN4$f;
    .locals 8

    const-wide/16 v3, -0x1

    move-object v0, p0

    move-wide v1, p1

    move-object v5, p3

    move-wide v6, p4

    invoke-virtual/range {v0 .. v7}, LSN4$f;->c(JJLjava/util/concurrent/TimeUnit;D)LSN4$f;

    move-result-object p1

    return-object p1
.end method

.method public varargs f([Ljava/lang/Class;)LSN4$f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "LSN4$f;"
        }
    .end annotation

    iget-object v0, p0, LSN4$f;->b:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public g(I)LSN4$f;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lcom/github/davidmoten/guavamini/Optional;->d(Ljava/lang/Object;)Lcom/github/davidmoten/guavamini/Optional;

    move-result-object p1

    iput-object p1, p0, LSN4$f;->e:Lcom/github/davidmoten/guavamini/Optional;

    return-object p0
.end method

.method public h(Lio/reactivex/functions/q;)LSN4$f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/q<",
            "Ljava/lang/Throwable;",
            ">;)",
            "LSN4$f;"
        }
    .end annotation

    iput-object p1, p0, LSN4$f;->c:Lio/reactivex/functions/q;

    return-object p0
.end method

.method public varargs i([Ljava/lang/Class;)LSN4$f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "LSN4$f;"
        }
    .end annotation

    iget-object v0, p0, LSN4$f;->a:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method
