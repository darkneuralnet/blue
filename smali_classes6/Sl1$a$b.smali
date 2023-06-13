.class public LSl1$a$b;
.super LaM2$n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSl1$a;->b()Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LaM2$n<",
        "TK;",
        "Ljava/util/Collection<",
        "TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:LSl1$a;


# direct methods
.method public constructor <init>(LSl1$a;)V
    .locals 0

    iput-object p1, p0, LSl1$a$b;->c:LSl1$a;

    invoke-direct {p0, p1}, LaM2$n;-><init>(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LSl1$a$b;->c:LSl1$a;

    invoke-virtual {v0, p1}, LSl1$a;->e(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, LSl1$a$b;->c:LSl1$a;

    iget-object v0, v0, LSl1$a;->e:LSl1;

    invoke-static {p1}, LJZ3;->f(Ljava/util/Collection;)LIZ3;

    move-result-object p1

    invoke-static {p1}, LaM2;->j(LIZ3;)LIZ3;

    move-result-object p1

    invoke-virtual {v0, p1}, LSl1;->r(LIZ3;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, LSl1$a$b;->c:LSl1$a;

    iget-object v0, v0, LSl1$a;->e:LSl1;

    invoke-static {p1}, LJZ3;->f(Ljava/util/Collection;)LIZ3;

    move-result-object p1

    invoke-static {p1}, LJZ3;->i(LIZ3;)LIZ3;

    move-result-object p1

    invoke-static {p1}, LaM2;->j(LIZ3;)LIZ3;

    move-result-object p1

    invoke-virtual {v0, p1}, LSl1;->r(LIZ3;)Z

    move-result p1

    return p1
.end method
