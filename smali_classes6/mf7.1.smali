.class public final Lmf7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/mlkit/vision/common/internal/a$a;


# instance fields
.field public final a:LHC7;

.field public final b:LSe9;

.field public final c:LIh1;


# direct methods
.method public constructor <init>(LHC7;LIh1;)V
    .locals 1

    const-string v0, "object-detection"

    invoke-static {v0}, Lyg9;->b(Ljava/lang/String;)LSe9;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmf7;->a:LHC7;

    iput-object v0, p0, Lmf7;->b:LSe9;

    iput-object p2, p0, Lmf7;->c:LIh1;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/mlkit/vision/common/internal/a$b;)Lcom/google/mlkit/vision/common/internal/a$c;
    .locals 4

    check-cast p1, LMd3;

    iget-object v0, p0, Lmf7;->b:LSe9;

    new-instance v1, LyW8;

    invoke-direct {v1}, LyW8;-><init>()V

    sget-object v2, LTV8;->e:LTV8;

    invoke-virtual {v1, v2}, LyW8;->e(LTV8;)LyW8;

    new-instance v2, LQ19;

    invoke-direct {v2}, LQ19;-><init>()V

    invoke-static {p1}, LDA8;->b(LMd3;)LX29;

    move-result-object v3

    invoke-virtual {v2, v3}, LQ19;->b(LX29;)LQ19;

    sget-object v3, LcW8;->c:LcW8;

    invoke-virtual {v2, v3}, LQ19;->c(LcW8;)LQ19;

    invoke-virtual {v2}, LQ19;->d()Lk29;

    move-result-object v2

    invoke-virtual {v1, v2}, LyW8;->g(Lk29;)LyW8;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lqf9;->e(LyW8;I)Lqf9;

    move-result-object v1

    sget-object v2, LmW8;->K:LmW8;

    invoke-virtual {v0, v1, v2}, LSe9;->d(Lqf9;LmW8;)V

    iget-object v0, p0, Lmf7;->a:LHC7;

    invoke-virtual {v0, p1}, LKn2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLE2;

    iget-object v1, p0, Lmf7;->c:LIh1;

    invoke-virtual {p1}, LNd3;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {v1, p1}, LIh1;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/mlkit/vision/objects/internal/ObjectDetectorImpl;->f(LLE2;Ljava/util/concurrent/Executor;)Lcom/google/mlkit/vision/objects/internal/ObjectDetectorImpl;

    move-result-object p1

    return-object p1
.end method
