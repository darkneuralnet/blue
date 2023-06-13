.class public Lse5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LC21;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LC21$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LD21;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LD21;",
            "LZ94<",
            "LC21$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lse5;->a:Ljava/util/Map;

    iput-object p2, p0, Lse5;->b:LZ94;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lne5;
    .locals 4

    iget-object v0, p0, Lse5;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC21;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LC21;->a()Lne5;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lse5;->a:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lse5;->a:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC21;

    if-eqz v1, :cond_1

    invoke-interface {v1}, LC21;->a()Lne5;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_1
    iget-object v1, p0, Lse5;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC21$a;

    invoke-interface {v1, p1}, LC21$a;->a(Ljava/lang/String;)LC21$a;

    move-result-object v1

    invoke-interface {v1}, LC21$a;->build()LC21;

    move-result-object v1

    invoke-interface {v1}, LC21;->a()Lne5;

    move-result-object v2

    iget-object v3, p0, Lse5;->a:Ljava/util/Map;

    invoke-interface {v3, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
