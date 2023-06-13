.class public final Lcom/google/android/gms/internal/places/h;
.super LI38;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LI38<",
        "Lu38;",
        "Lu38;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LI38;-><init>()V

    return-void
.end method

.method public static m(Ljava/lang/Object;Lu38;)V
    .locals 0

    check-cast p0, Lcom/google/android/gms/internal/places/c;

    iput-object p1, p0, Lcom/google/android/gms/internal/places/c;->zzih:Lu38;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;IJ)V
    .locals 0

    check-cast p1, Lu38;

    shl-int/lit8 p2, p2, 0x3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lu38;->f(ILjava/lang/Object;)V

    return-void
.end method

.method public final synthetic b(Ljava/lang/Object;ILjv9;)V
    .locals 0

    check-cast p1, Lu38;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x2

    invoke-virtual {p1, p2, p3}, Lu38;->f(ILjava/lang/Object;)V

    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;Lja8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lu38;

    invoke-virtual {p1, p2}, Lu38;->h(Lja8;)V

    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/places/c;

    iget-object p1, p1, Lcom/google/android/gms/internal/places/c;->zzih:Lu38;

    invoke-virtual {p1}, Lu38;->a()V

    return-void
.end method

.method public final synthetic e(Ljava/lang/Object;Lja8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lu38;

    invoke-virtual {p1, p2}, Lu38;->d(Lja8;)V

    return-void
.end method

.method public final synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lu38;->j()Lu38;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic g(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lu38;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/places/h;->m(Ljava/lang/Object;Lu38;)V

    return-void
.end method

.method public final synthetic h(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lu38;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/places/h;->m(Ljava/lang/Object;Lu38;)V

    return-void
.end method

.method public final synthetic i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lu38;

    check-cast p2, Lu38;

    invoke-static {}, Lu38;->i()Lu38;

    move-result-object v0

    invoke-virtual {p2, v0}, Lu38;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1, p2}, Lu38;->b(Lu38;Lu38;)Lu38;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic j(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lu38;

    invoke-virtual {p1}, Lu38;->e()I

    move-result p1

    return p1
.end method

.method public final synthetic k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/places/c;

    iget-object p1, p1, Lcom/google/android/gms/internal/places/c;->zzih:Lu38;

    return-object p1
.end method

.method public final synthetic l(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lu38;

    invoke-virtual {p1}, Lu38;->k()I

    move-result p1

    return p1
.end method
