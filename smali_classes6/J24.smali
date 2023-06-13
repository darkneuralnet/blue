.class public final LJ24;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ24$b;,
        LJ24$d;,
        LJ24$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "LJ24$d;",
            "Ljava/util/List<",
            "LJ24$c<",
            "TP;>;>;>;"
        }
    .end annotation
.end field

.field public b:LJ24$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJ24$c<",
            "TP;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation
.end field

.field public final d:LxV2;

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ConcurrentMap;LJ24$c;LxV2;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentMap<",
            "LJ24$d;",
            "Ljava/util/List<",
            "LJ24$c<",
            "TP;>;>;>;",
            "LJ24$c<",
            "TP;>;",
            "LxV2;",
            "Ljava/lang/Class<",
            "TP;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ24;->a:Ljava/util/concurrent/ConcurrentMap;

    iput-object p2, p0, LJ24;->b:LJ24$c;

    iput-object p4, p0, LJ24;->c:Ljava/lang/Class;

    iput-object p3, p0, LJ24;->d:LxV2;

    const/4 p1, 0x0

    iput-boolean p1, p0, LJ24;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/ConcurrentMap;LJ24$c;LxV2;Ljava/lang/Class;LJ24$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LJ24;-><init>(Ljava/util/concurrent/ConcurrentMap;LJ24$c;LxV2;Ljava/lang/Class;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Lkl2$c;Ljava/util/concurrent/ConcurrentMap;)LJ24$c;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {p0, p1, p2}, LJ24;->b(Ljava/lang/Object;Lkl2$c;Ljava/util/concurrent/ConcurrentMap;)LJ24$c;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Object;Lkl2$c;Ljava/util/concurrent/ConcurrentMap;)LJ24$c;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(TP;",
            "Lkl2$c;",
            "Ljava/util/concurrent/ConcurrentMap<",
            "LJ24$d;",
            "Ljava/util/List<",
            "LJ24$c<",
            "TP;>;>;>;)",
            "LJ24$c<",
            "TP;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-virtual {p1}, Lkl2$c;->L()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Lkl2$c;->M()LeA3;

    move-result-object v1

    sget-object v2, LeA3;->f:LeA3;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    move-object v0, v3

    :cond_0
    invoke-static {}, LAX2;->a()LAX2;

    move-result-object v1

    invoke-virtual {p1}, Lkl2$c;->K()Lhk2;

    move-result-object v2

    invoke-virtual {v2}, Lhk2;->L()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkl2$c;->K()Lhk2;

    move-result-object v4

    invoke-virtual {v4}, Lhk2;->M()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object v4

    invoke-virtual {p1}, Lkl2$c;->K()Lhk2;

    move-result-object v5

    invoke-virtual {v5}, Lhk2;->K()Lhk2$c;

    move-result-object v5

    invoke-virtual {p1}, Lkl2$c;->M()LeA3;

    move-result-object v6

    invoke-static {v2, v4, v5, v6, v0}, LG94;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/g;Lhk2$c;LeA3;Ljava/lang/Integer;)LG94;

    move-result-object v0

    invoke-static {}, LA32;->a()LMq5;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, LAX2;->c(LG94;LMq5;)Lbk2;

    move-result-object v10

    new-instance v0, LJ24$c;

    invoke-static {p1}, LTE0;->a(Lkl2$c;)[B

    move-result-object v6

    invoke-virtual {p1}, Lkl2$c;->N()LIk2;

    move-result-object v7

    invoke-virtual {p1}, Lkl2$c;->M()LeA3;

    move-result-object v8

    invoke-virtual {p1}, Lkl2$c;->L()I

    move-result v9

    move-object v4, v0

    move-object v5, p0

    invoke-direct/range {v4 .. v10}, LJ24$c;-><init>(Ljava/lang/Object;[BLIk2;LeA3;ILbk2;)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, LJ24$d;

    invoke-virtual {v0}, LJ24$c;->a()[B

    move-result-object v1

    invoke-direct {p1, v1, v3}, LJ24$d;-><init>([BLJ24$a;)V

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p2, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    if-eqz p0, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p2, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public static j(Ljava/lang/Class;)LJ24$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TP;>;)",
            "LJ24$b<",
            "TP;>;"
        }
    .end annotation

    new-instance v0, LJ24$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LJ24$b;-><init>(Ljava/lang/Class;LJ24$a;)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/util/List<",
            "LJ24$c<",
            "TP;>;>;>;"
        }
    .end annotation

    iget-object v0, p0, LJ24;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public d()LxV2;
    .locals 1

    iget-object v0, p0, LJ24;->d:LxV2;

    return-object v0
.end method

.method public e()LJ24$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LJ24$c<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, LJ24;->b:LJ24$c;

    return-object v0
.end method

.method public f([B)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "LJ24$c<",
            "TP;>;>;"
        }
    .end annotation

    iget-object v0, p0, LJ24;->a:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, LJ24$d;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, LJ24$d;-><init>([BLJ24$a;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public g()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, LJ24;->c:Ljava/lang/Class;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LJ24$c<",
            "TP;>;>;"
        }
    .end annotation

    sget-object v0, LTE0;->a:[B

    invoke-virtual {p0, v0}, LJ24;->f([B)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, LJ24;->d:LxV2;

    invoke-virtual {v0}, LxV2;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
