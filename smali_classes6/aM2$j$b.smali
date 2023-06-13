.class public LaM2$j$b;
.super LaM2$n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LaM2$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LaM2$n<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:LaM2$j;


# direct methods
.method public constructor <init>(LaM2$j;)V
    .locals 0

    iput-object p1, p0, LaM2$j$b;->c:LaM2$j;

    invoke-direct {p0, p1}, LaM2$n;-><init>(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LaM2$j$b;->c:LaM2$j;

    invoke-virtual {v0, p1}, LaM2$f;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LaM2$j$b;->c:LaM2$j;

    iget-object v0, v0, LaM2$f;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, LaM2$j$b;->c:LaM2$j;

    iget-object v1, v0, LaM2$f;->e:Ljava/util/Map;

    iget-object v0, v0, LaM2$f;->f:LIZ3;

    invoke-static {v1, v0, p1}, LaM2$j;->e(Ljava/util/Map;LIZ3;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, LaM2$j$b;->c:LaM2$j;

    iget-object v1, v0, LaM2$f;->e:Ljava/util/Map;

    iget-object v0, v0, LaM2$f;->f:LIZ3;

    invoke-static {v1, v0, p1}, LaM2$j;->f(Ljava/util/Map;LIZ3;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LaM2$n;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, LNs2;->i(Ljava/util/Iterator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    invoke-virtual {p0}, LaM2$n;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, LNs2;->i(Ljava/util/Iterator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
