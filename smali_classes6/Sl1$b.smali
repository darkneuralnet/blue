.class public LSl1$b;
.super LjX2$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSl1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LjX2$c<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:LSl1;


# direct methods
.method public constructor <init>(LSl1;)V
    .locals 0

    iput-object p1, p0, LSl1$b;->e:LSl1;

    invoke-direct {p0, p1}, LjX2$c;-><init>(LgX2;)V

    return-void
.end method


# virtual methods
.method public A2(Ljava/lang/Object;I)I
    .locals 4

    const-string v0, "occurrences"

    invoke-static {p2, v0}, Ldm0;->b(ILjava/lang/String;)I

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, LjX2$c;->d3(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, LSl1$b;->e:LSl1;

    iget-object v0, v0, LSl1;->g:LgX2;

    invoke-interface {v0}, LgX2;->f()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, LSl1$b;->e:LSl1;

    invoke-static {v3, p1, v2}, LSl1;->p(LSl1;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    if-gt v1, p2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return v1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "LmX2$a<",
            "TK;>;>;"
        }
    .end annotation

    new-instance v0, LSl1$b$a;

    invoke-direct {v0, p0}, LSl1$b$a;-><init>(LSl1$b;)V

    return-object v0
.end method
