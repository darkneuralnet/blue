.class public final LKM6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LHK6;

.field public final b:LoM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoM6<",
            "LfP6;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LpM6;

.field public final d:LoM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoM6<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LxL6;

.field public final f:LPJ6;


# direct methods
.method public constructor <init>(LHK6;LoM6;LpM6;LoM6;LxL6;LPJ6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHK6;",
            "LoM6<",
            "LfP6;",
            ">;",
            "LpM6;",
            "LoM6<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "LxL6;",
            "LPJ6;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKM6;->a:LHK6;

    iput-object p2, p0, LKM6;->b:LoM6;

    iput-object p3, p0, LKM6;->c:LpM6;

    iput-object p4, p0, LKM6;->d:LoM6;

    iput-object p5, p0, LKM6;->e:LxL6;

    iput-object p6, p0, LKM6;->f:LPJ6;

    return-void
.end method


# virtual methods
.method public final a(LHM6;)V
    .locals 7

    iget-object v0, p0, LKM6;->a:LHK6;

    iget-object v1, p1, LtM6;->b:Ljava/lang/String;

    iget v2, p1, LHM6;->c:I

    iget-wide v3, p1, LHM6;->d:J

    invoke-virtual {v0, v1, v2, v3, v4}, LHK6;->x(Ljava/lang/String;IJ)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, LKM6;->a:LHK6;

    iget-object v2, p1, LtM6;->b:Ljava/lang/String;

    iget v3, p1, LHM6;->c:I

    iget-wide v4, p1, LHM6;->d:J

    invoke-virtual {v1, v2, v3, v4, v5}, LHK6;->D(Ljava/lang/String;IJ)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, LKM6;->a:LHK6;

    iget-object v3, p1, LtM6;->b:Ljava/lang/String;

    iget v4, p1, LHM6;->c:I

    iget-wide v5, p1, LHM6;->d:J

    invoke-virtual {v2, v3, v4, v5, v6}, LHK6;->t(Ljava/lang/String;IJ)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    invoke-virtual {v0, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LKM6;->a:LHK6;

    iget-object v2, p1, LtM6;->b:Ljava/lang/String;

    iget v3, p1, LHM6;->c:I

    iget-wide v4, p1, LHM6;->d:J

    new-instance v6, Ljava/io/File;

    invoke-virtual {v0, v2, v3, v4, v5}, LHK6;->t(Ljava/lang/String;IJ)Ljava/io/File;

    move-result-object v0

    const-string v2, "merge.tmp"

    invoke-direct {v6, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    iget-object v0, p0, LKM6;->a:LHK6;

    iget-object v2, p1, LtM6;->b:Ljava/lang/String;

    iget v3, p1, LHM6;->c:I

    iget-wide v4, p1, LHM6;->d:J

    invoke-virtual {v0, v2, v3, v4, v5}, LHK6;->u(Ljava/lang/String;IJ)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LKM6;->f:LPJ6;

    invoke-virtual {v0}, LPJ6;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LKM6;->d:LoM6;

    invoke-interface {v0}, LoM6;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    new-instance v1, LIM6;

    invoke-direct {v1, p0, p1}, LIM6;-><init>(LKM6;LHM6;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LKM6;->d:LoM6;

    invoke-interface {v0}, LoM6;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, LKM6;->a:LHK6;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, LJM6;->a(LHK6;)Ljava/lang/Runnable;

    move-result-object v1

    :goto_0
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, LKM6;->c:LpM6;

    iget-object v1, p1, LtM6;->b:Ljava/lang/String;

    iget v2, p1, LHM6;->c:I

    iget-wide v3, p1, LHM6;->d:J

    invoke-virtual {v0, v1, v2, v3, v4}, LpM6;->f(Ljava/lang/String;IJ)V

    iget-object v0, p0, LKM6;->e:LxL6;

    iget-object v1, p1, LtM6;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, LxL6;->a(Ljava/lang/String;)V

    iget-object v0, p0, LKM6;->b:LoM6;

    invoke-interface {v0}, LoM6;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LfP6;

    iget v1, p1, LtM6;->a:I

    iget-object p1, p1, LtM6;->b:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, LfP6;->c(ILjava/lang/String;)V

    return-void

    :cond_1
    new-instance v0, LtL6;

    const-string v1, "Cannot move metadata files to final location."

    iget p1, p1, LtM6;->a:I

    invoke-direct {v0, v1, p1}, LtL6;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_2
    new-instance v0, LtL6;

    const-string v1, "Cannot move merged pack files to final location."

    iget p1, p1, LtM6;->a:I

    invoke-direct {v0, v1, p1}, LtL6;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_3
    new-instance v0, LtL6;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p1, LtM6;->b:Ljava/lang/String;

    aput-object v3, v1, v2

    const-string v2, "Cannot find pack files to move for pack %s."

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget p1, p1, LtM6;->a:I

    invoke-direct {v0, v1, p1}, LtL6;-><init>(Ljava/lang/String;I)V

    throw v0
.end method

.method public final synthetic b(LHM6;)V
    .locals 5

    iget-object v0, p0, LKM6;->a:LHK6;

    iget-object v1, p1, LtM6;->b:Ljava/lang/String;

    iget v2, p1, LHM6;->c:I

    iget-wide v3, p1, LHM6;->d:J

    invoke-virtual {v0, v1, v2, v3, v4}, LHK6;->E(Ljava/lang/String;IJ)V

    return-void
.end method
