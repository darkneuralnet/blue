.class public final LVq9;
.super Len7;
.source "SourceFile"


# instance fields
.field public final d:LNl9;


# direct methods
.method public constructor <init>(LNl9;)V
    .locals 5

    const-string v0, "internal.logger"

    invoke-direct {p0, v0}, Len7;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LVq9;->d:LNl9;

    iget-object p1, p0, Len7;->c:Ljava/util/Map;

    new-instance v0, LWo9;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v2}, LWo9;-><init>(LVq9;ZZ)V

    const-string v3, "log"

    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Len7;->c:Ljava/util/Map;

    new-instance v0, LCd9;

    const-string v4, "silent"

    invoke-direct {v0, p0, v4}, LCd9;-><init>(LVq9;Ljava/lang/String;)V

    invoke-interface {p1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Len7;->c:Ljava/util/Map;

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Len7;

    new-instance v0, LWo9;

    invoke-direct {v0, p0, v2, v2}, LWo9;-><init>(LVq9;ZZ)V

    invoke-virtual {p1, v3, v0}, Len7;->c(Ljava/lang/String;LXs7;)V

    iget-object p1, p0, Len7;->c:Ljava/util/Map;

    new-instance v0, LTh9;

    const-string v2, "unmonitored"

    invoke-direct {v0, p0, v2}, LTh9;-><init>(LVq9;Ljava/lang/String;)V

    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Len7;->c:Ljava/util/Map;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Len7;

    new-instance v0, LWo9;

    invoke-direct {v0, p0, v1, v1}, LWo9;-><init>(LVq9;ZZ)V

    invoke-virtual {p1, v3, v0}, Len7;->c(Ljava/lang/String;LXs7;)V

    return-void
.end method

.method public static bridge synthetic f(LVq9;)LNl9;
    .locals 0

    iget-object p0, p0, LVq9;->d:LNl9;

    return-object p0
.end method


# virtual methods
.method public final d(Lam8;Ljava/util/List;)LXs7;
    .locals 0

    sget-object p1, LXs7;->h0:LXs7;

    return-object p1
.end method
