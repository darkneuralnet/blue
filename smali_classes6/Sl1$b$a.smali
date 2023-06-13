.class public LSl1$b$a;
.super LoX2$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSl1$b;->entrySet()Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LoX2$c<",
        "TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LSl1$b;


# direct methods
.method public constructor <init>(LSl1$b;)V
    .locals 0

    iput-object p1, p0, LSl1$b$a;->b:LSl1$b;

    invoke-direct {p0}, LoX2$c;-><init>()V

    return-void
.end method

.method public static synthetic b(LIZ3;Ljava/util/Map$Entry;)Z
    .locals 0

    invoke-static {p0, p1}, LSl1$b$a;->c(LIZ3;Ljava/util/Map$Entry;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(LIZ3;Ljava/util/Map$Entry;)Z
    .locals 1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    invoke-static {v0, p1}, LoX2;->g(Ljava/lang/Object;I)LmX2$a;

    move-result-object p1

    invoke-interface {p0, p1}, LIZ3;->apply(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public a()LmX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LmX2<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, LSl1$b$a;->b:LSl1$b;

    return-object v0
.end method

.method public final e(LIZ3;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LIZ3<",
            "-",
            "LmX2$a<",
            "TK;>;>;)Z"
        }
    .end annotation

    iget-object v0, p0, LSl1$b$a;->b:LSl1$b;

    iget-object v0, v0, LSl1$b;->e:LSl1;

    new-instance v1, LTl1;

    invoke-direct {v1, p1}, LTl1;-><init>(LIZ3;)V

    invoke-virtual {v0, v1}, LSl1;->r(LIZ3;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "LmX2$a<",
            "TK;>;>;"
        }
    .end annotation

    iget-object v0, p0, LSl1$b$a;->b:LSl1$b;

    invoke-virtual {v0}, LjX2$c;->f()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    invoke-static {p1}, LJZ3;->f(Ljava/util/Collection;)LIZ3;

    move-result-object p1

    invoke-virtual {p0, p1}, LSl1$b$a;->e(LIZ3;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    invoke-static {p1}, LJZ3;->f(Ljava/util/Collection;)LIZ3;

    move-result-object p1

    invoke-static {p1}, LJZ3;->i(LIZ3;)LIZ3;

    move-result-object p1

    invoke-virtual {p0, p1}, LSl1$b$a;->e(LIZ3;)Z

    move-result p1

    return p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LSl1$b$a;->b:LSl1$b;

    iget-object v0, v0, LSl1$b;->e:LSl1;

    invoke-virtual {v0}, LX0;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    return v0
.end method
