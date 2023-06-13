.class public final LWp8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic c:Lcs8;


# direct methods
.method public constructor <init>(Lcs8;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 0

    iput-object p1, p0, LWp8;->c:Lcs8;

    iput-object p2, p0, LWp8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LWp8;->c:Lcs8;

    invoke-static {v0}, Lcs8;->f5(Lcs8;)LhV8;

    move-result-object v0

    invoke-virtual {v0}, LhV8;->b()V

    iget-object v0, p0, LWp8;->c:Lcs8;

    invoke-static {v0}, Lcs8;->f5(Lcs8;)LhV8;

    move-result-object v0

    iget-object v1, p0, LWp8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v0}, LhV8;->c()Ldn8;

    move-result-object v2

    invoke-virtual {v2}, Lns8;->e()V

    invoke-virtual {v0}, LhV8;->d()V

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzq;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0, v1}, LhV8;->S(Lcom/google/android/gms/measurement/internal/zzq;)Lpt8;

    return-void
.end method
