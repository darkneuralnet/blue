.class public LSl1$a$a;
.super LaM2$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSl1$a;->a()Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LaM2$h<",
        "TK;",
        "Ljava/util/Collection<",
        "TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LSl1$a;


# direct methods
.method public constructor <init>(LSl1$a;)V
    .locals 0

    iput-object p1, p0, LSl1$a$a;->b:LSl1$a;

    invoke-direct {p0}, LaM2$h;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, LSl1$a$a;->b:LSl1$a;

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;>;"
        }
    .end annotation

    new-instance v0, LSl1$a$a$a;

    invoke-direct {v0, p0}, LSl1$a$a$a;-><init>(LSl1$a$a;)V

    return-object v0
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

    iget-object v0, p0, LSl1$a$a;->b:LSl1$a;

    iget-object v0, v0, LSl1$a;->e:LSl1;

    invoke-static {p1}, LJZ3;->f(Ljava/util/Collection;)LIZ3;

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

    iget-object v0, p0, LSl1$a$a;->b:LSl1$a;

    iget-object v0, v0, LSl1$a;->e:LSl1;

    invoke-static {p1}, LJZ3;->f(Ljava/util/Collection;)LIZ3;

    move-result-object p1

    invoke-static {p1}, LJZ3;->i(LIZ3;)LIZ3;

    move-result-object p1

    invoke-virtual {v0, p1}, LSl1;->r(LIZ3;)Z

    move-result p1

    return p1
.end method

.method public size()I
    .locals 1

    invoke-virtual {p0}, LSl1$a$a;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lzg2;->s(Ljava/util/Iterator;)I

    move-result v0

    return v0
.end method
