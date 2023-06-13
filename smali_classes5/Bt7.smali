.class public final LBt7;
.super LAt7;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LAt7;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map$Entry;)I
    .locals 0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcu7;

    const/4 p1, 0x0

    throw p1
.end method

.method public final b(Ljava/lang/Object;)LEt7;
    .locals 0

    check-cast p1, Lbu7;

    iget-object p1, p1, Lbu7;->zzb:LEt7;

    return-object p1
.end method

.method public final c(Ljava/lang/Object;)LEt7;
    .locals 0

    check-cast p1, Lbu7;

    invoke-virtual {p1}, Lbu7;->D()LEt7;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lzt7;Lfv7;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1, p2, p3}, Lzt7;->c(Lfv7;I)Ldu7;

    move-result-object p1

    return-object p1
.end method

.method public final e(LIv7;Ljava/lang/Object;Lzt7;LEt7;Ljava/lang/Object;Lsw7;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lbu7;

    iget-object p1, p1, Lbu7;->zzb:LEt7;

    invoke-virtual {p1}, LEt7;->i()V

    return-void
.end method

.method public final g(LIv7;Ljava/lang/Object;Lzt7;LEt7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method

.method public final h(Lkt7;Ljava/lang/Object;Lzt7;LEt7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method

.method public final i(LKw7;Ljava/util/Map$Entry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcu7;

    const/4 p1, 0x0

    throw p1
.end method

.method public final j(Lfv7;)Z
    .locals 0

    instance-of p1, p1, Lbu7;

    return p1
.end method
