.class public final LSN8;
.super Len7;
.source "SourceFile"


# instance fields
.field public final d:LOg7;


# direct methods
.method public constructor <init>(LOg7;)V
    .locals 1

    const-string v0, "internal.eventLogger"

    invoke-direct {p0, v0}, Len7;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LSN8;->d:LOg7;

    return-void
.end method


# virtual methods
.method public final d(Lam8;Ljava/util/List;)LXs7;
    .locals 4

    iget-object v0, p0, Len7;->b:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-static {v0, v1, p2}, Lbt8;->h(Ljava/lang/String;ILjava/util/List;)V

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-virtual {p1, v0}, Lam8;->b(LXs7;)LXs7;

    move-result-object v0

    invoke-interface {v0}, LXs7;->zzi()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXs7;

    invoke-virtual {p1, v1}, Lam8;->b(LXs7;)LXs7;

    move-result-object v1

    invoke-interface {v1}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Lbt8;->a(D)D

    move-result-wide v1

    double-to-long v1, v1

    const/4 v3, 0x2

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LXs7;

    invoke-virtual {p1, p2}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    instance-of p2, p1, Lzq7;

    if-eqz p2, :cond_0

    check-cast p1, Lzq7;

    invoke-static {p1}, Lbt8;->g(Lzq7;)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :goto_0
    iget-object p2, p0, LSN8;->d:LOg7;

    invoke-virtual {p2, v0, v1, v2, p1}, LOg7;->e(Ljava/lang/String;JLjava/util/Map;)V

    sget-object p1, LXs7;->h0:LXs7;

    return-object p1
.end method
