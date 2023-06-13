.class public Lcom/google/android/gms/clearcut/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/clearcut/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:LMn8;

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/android/gms/phenotype/ExperimentTokens;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "[B>;"
        }
    .end annotation
.end field

.field public k:Z

.field public final l:LQt8;

.field public m:Z

.field public final synthetic n:Lcom/google/android/gms/clearcut/a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/clearcut/a;[B)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/clearcut/a$a;-><init>(Lcom/google/android/gms/clearcut/a;[BLcom/google/android/gms/clearcut/a$c;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/clearcut/a;[BLCe7;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/clearcut/a$a;-><init>(Lcom/google/android/gms/clearcut/a;[B)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/clearcut/a;[BLcom/google/android/gms/clearcut/a$c;)V
    .locals 3

    iput-object p1, p0, Lcom/google/android/gms/clearcut/a$a;->n:Lcom/google/android/gms/clearcut/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/clearcut/a;->c(Lcom/google/android/gms/clearcut/a;)I

    move-result p3

    iput p3, p0, Lcom/google/android/gms/clearcut/a$a;->a:I

    invoke-static {p1}, Lcom/google/android/gms/clearcut/a;->e(Lcom/google/android/gms/clearcut/a;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/clearcut/a$a;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/clearcut/a;->g(Lcom/google/android/gms/clearcut/a;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/clearcut/a$a;->c:Ljava/lang/String;

    const/4 p3, 0x0

    iput-object p3, p0, Lcom/google/android/gms/clearcut/a$a;->d:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/clearcut/a;->h(Lcom/google/android/gms/clearcut/a;)LMn8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/clearcut/a$a;->e:LMn8;

    iput-object p3, p0, Lcom/google/android/gms/clearcut/a$a;->f:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/google/android/gms/clearcut/a$a;->g:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/google/android/gms/clearcut/a$a;->h:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/google/android/gms/clearcut/a$a;->i:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/google/android/gms/clearcut/a$a;->j:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/clearcut/a$a;->k:Z

    new-instance v0, LQt8;

    invoke-direct {v0}, LQt8;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/clearcut/a$a;->l:LQt8;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/clearcut/a$a;->m:Z

    invoke-static {p1}, Lcom/google/android/gms/clearcut/a;->g(Lcom/google/android/gms/clearcut/a;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/clearcut/a$a;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/clearcut/a$a;->d:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/clearcut/a;->i(Lcom/google/android/gms/clearcut/a;)Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, LMf7;->a(Landroid/content/Context;)Z

    move-result p3

    iput-boolean p3, v0, LQt8;->B:Z

    invoke-static {p1}, Lcom/google/android/gms/clearcut/a;->j(Lcom/google/android/gms/clearcut/a;)Lcom/google/android/gms/common/util/Clock;

    move-result-object p3

    invoke-interface {p3}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, LQt8;->d:J

    invoke-static {p1}, Lcom/google/android/gms/clearcut/a;->j(Lcom/google/android/gms/clearcut/a;)Lcom/google/android/gms/common/util/Clock;

    move-result-object p3

    invoke-interface {p3}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, v0, LQt8;->e:J

    invoke-static {p1}, Lcom/google/android/gms/clearcut/a;->k(Lcom/google/android/gms/clearcut/a;)Lcom/google/android/gms/clearcut/a$d;

    iget-wide v1, v0, LQt8;->d:J

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Ljava/util/TimeZone;->getOffset(J)I

    move-result p1

    div-int/lit16 p1, p1, 0x3e8

    int-to-long v1, p1

    iput-wide v1, v0, LQt8;->t:J

    if-eqz p2, :cond_0

    iput-object p2, v0, LQt8;->o:[B

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 14
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/clearcut/a$a;->m:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/clearcut/a$a;->m:Z

    new-instance v0, Lcom/google/android/gms/clearcut/zze;

    new-instance v10, Lcom/google/android/gms/internal/clearcut/zzr;

    iget-object v1, p0, Lcom/google/android/gms/clearcut/a$a;->n:Lcom/google/android/gms/clearcut/a;

    invoke-static {v1}, Lcom/google/android/gms/clearcut/a;->m(Lcom/google/android/gms/clearcut/a;)Ljava/lang/String;

    move-result-object v2

    iget-object v1, p0, Lcom/google/android/gms/clearcut/a$a;->n:Lcom/google/android/gms/clearcut/a;

    invoke-static {v1}, Lcom/google/android/gms/clearcut/a;->n(Lcom/google/android/gms/clearcut/a;)I

    move-result v3

    iget v4, p0, Lcom/google/android/gms/clearcut/a$a;->a:I

    iget-object v5, p0, Lcom/google/android/gms/clearcut/a$a;->b:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/clearcut/a$a;->c:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/android/gms/clearcut/a$a;->d:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/clearcut/a$a;->n:Lcom/google/android/gms/clearcut/a;

    invoke-static {v1}, Lcom/google/android/gms/clearcut/a;->l(Lcom/google/android/gms/clearcut/a;)Z

    move-result v8

    iget-object v9, p0, Lcom/google/android/gms/clearcut/a$a;->e:LMn8;

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/clearcut/zzr;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLMn8;)V

    iget-object v3, p0, Lcom/google/android/gms/clearcut/a$a;->l:LQt8;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v12, 0x0

    invoke-static {v12}, Lcom/google/android/gms/clearcut/a;->f(Ljava/util/ArrayList;)[I

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v12}, Lcom/google/android/gms/clearcut/a;->f(Ljava/util/ArrayList;)[I

    move-result-object v8

    const/4 v9, 0x0

    const/4 v11, 0x0

    iget-boolean v13, p0, Lcom/google/android/gms/clearcut/a$a;->k:Z

    move-object v1, v0

    move-object v2, v10

    move-object v10, v11

    move v11, v13

    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/clearcut/zze;-><init>(Lcom/google/android/gms/internal/clearcut/zzr;LQt8;Lcom/google/android/gms/clearcut/a$c;Lcom/google/android/gms/clearcut/a$c;[I[Ljava/lang/String;[I[[B[Lcom/google/android/gms/phenotype/ExperimentTokens;Z)V

    iget-object v1, p0, Lcom/google/android/gms/clearcut/a$a;->n:Lcom/google/android/gms/clearcut/a;

    invoke-static {v1}, Lcom/google/android/gms/clearcut/a;->o(Lcom/google/android/gms/clearcut/a;)Lcom/google/android/gms/clearcut/a$b;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/clearcut/a$b;->a(Lcom/google/android/gms/clearcut/zze;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/clearcut/a$a;->n:Lcom/google/android/gms/clearcut/a;

    invoke-static {v1}, Lcom/google/android/gms/clearcut/a;->p(Lcom/google/android/gms/clearcut/a;)LYB7;

    move-result-object v1

    invoke-interface {v1, v0}, LYB7;->d(Lcom/google/android/gms/clearcut/zze;)Lcom/google/android/gms/common/api/PendingResult;

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->RESULT_SUCCESS:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0, v12}, Lcom/google/android/gms/common/api/PendingResults;->immediatePendingResult(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "do not reuse LogEventBuilder"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(I)Lcom/google/android/gms/clearcut/a$a;
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/clearcut/a$a;->l:LQt8;

    iput p1, v0, LQt8;->h:I

    return-object p0
.end method
