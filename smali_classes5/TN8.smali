.class public LTN8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "LTN8;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:LQl9;

.field public final b:LLt8;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LNA8;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LQl9;Lcom/google/android/gms/common/util/Clock;)V
    .locals 0
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LTN8;->a:LQl9;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LTN8;->c:Ljava/util/List;

    new-instance p1, LLt8;

    invoke-direct {p1, p0, p2}, LLt8;-><init>(LTN8;Lcom/google/android/gms/common/util/Clock;)V

    invoke-virtual {p1}, LLt8;->h()V

    iput-object p1, p0, LTN8;->b:LLt8;

    return-void
.end method


# virtual methods
.method public a(LLt8;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final b()LQl9;
    .locals 1

    iget-object v0, p0, LTN8;->a:LQl9;

    return-object v0
.end method

.method public final c(LLt8;)V
    .locals 1

    iget-object p1, p0, LTN8;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNA8;

    invoke-interface {v0}, LNA8;->zza()V

    goto :goto_0

    :cond_0
    return-void
.end method
