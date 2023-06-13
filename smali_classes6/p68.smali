.class public Lp68;
.super Lns8;
.source "SourceFile"


# direct methods
.method public constructor <init>(LPn8;)V
    .locals 0

    invoke-direct {p0, p1}, Lns8;-><init>(LPn8;)V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e()V
    .locals 1

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    return-void
.end method
