.class public Lns8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQs8;


# instance fields
.field public final a:LPn8;


# direct methods
.method public constructor <init>(LPn8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lns8;->a:LPn8;

    return-void
.end method


# virtual methods
.method public final A()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final C()LFg7;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final a()LFc8;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final c()Ldn8;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->d()V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    return-void
.end method

.method public final z()Landroid/content/Context;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
