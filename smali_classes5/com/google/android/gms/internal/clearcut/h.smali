.class public final Lcom/google/android/gms/internal/clearcut/h;
.super LEd8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LEd8<",
        "LRd8;",
        "LRd8;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LEd8;-><init>()V

    return-void
.end method

.method public static m(Ljava/lang/Object;LRd8;)V
    .locals 0

    check-cast p0, Lcom/google/android/gms/internal/clearcut/c;

    iput-object p1, p0, Lcom/google/android/gms/internal/clearcut/c;->zzjp:LRd8;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;IJ)V
    .locals 0

    check-cast p1, LRd8;

    shl-int/lit8 p2, p2, 0x3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LRd8;->e(ILjava/lang/Object;)V

    return-void
.end method

.method public final synthetic b(Ljava/lang/Object;ILTD7;)V
    .locals 0

    check-cast p1, LRd8;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x2

    invoke-virtual {p1, p2, p3}, LRd8;->e(ILjava/lang/Object;)V

    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;LPj8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, LRd8;

    invoke-virtual {p1, p2}, LRd8;->g(LPj8;)V

    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/clearcut/c;

    iget-object p1, p1, Lcom/google/android/gms/internal/clearcut/c;->zzjp:LRd8;

    invoke-virtual {p1}, LRd8;->k()V

    return-void
.end method

.method public final synthetic e(Ljava/lang/Object;LPj8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, LRd8;

    invoke-virtual {p1, p2}, LRd8;->c(LPj8;)V

    return-void
.end method

.method public final synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-static {}, LRd8;->i()LRd8;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic g(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LRd8;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/clearcut/h;->m(Ljava/lang/Object;LRd8;)V

    return-void
.end method

.method public final synthetic h(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LRd8;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/clearcut/h;->m(Ljava/lang/Object;LRd8;)V

    return-void
.end method

.method public final synthetic i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, LRd8;

    check-cast p2, LRd8;

    invoke-static {}, LRd8;->h()LRd8;

    move-result-object v0

    invoke-virtual {p2, v0}, LRd8;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1, p2}, LRd8;->a(LRd8;LRd8;)LRd8;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic j(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LRd8;

    invoke-virtual {p1}, LRd8;->d()I

    move-result p1

    return p1
.end method

.method public final synthetic k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/clearcut/c;

    iget-object p1, p1, Lcom/google/android/gms/internal/clearcut/c;->zzjp:LRd8;

    return-object p1
.end method

.method public final synthetic l(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LRd8;

    invoke-virtual {p1}, LRd8;->j()I

    move-result p1

    return p1
.end method
