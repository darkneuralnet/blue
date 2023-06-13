.class public final LgT8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic c:LhV8;


# direct methods
.method public constructor <init>(LhV8;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 0

    iput-object p1, p0, LgT8;->c:LhV8;

    iput-object p2, p0, LgT8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LgT8;->c:LhV8;

    iget-object v1, p0, LgT8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, LhV8;->V(Ljava/lang/String;)LXm7;

    move-result-object v0

    sget-object v1, Lcm7;->d:Lcm7;

    invoke-virtual {v0, v1}, LXm7;->i(Lcm7;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LgT8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzq;->w:Ljava/lang/String;

    invoke-static {v0}, LXm7;->b(Ljava/lang/String;)LXm7;

    move-result-object v0

    invoke-virtual {v0, v1}, LXm7;->i(Lcm7;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LgT8;->c:LhV8;

    iget-object v1, p0, LgT8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v0, v1}, LhV8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;

    move-result-object v0

    invoke-virtual {v0}, Lpt8;->j0()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, LgT8;->c:LhV8;

    invoke-virtual {v0}, LhV8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "Analytics storage consent denied. Returning null app instance id"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method
