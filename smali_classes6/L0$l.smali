.class public LL0$l;
.super LL0$j;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LL0<",
        "TK;TV;>.j;",
        "Ljava/util/Set<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic g:LL0;


# direct methods
.method public constructor <init>(LL0;Ljava/lang/Object;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Set<",
            "TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, LL0$l;->g:LL0;

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, LL0$j;-><init>(LL0;Ljava/lang/Object;Ljava/util/Collection;LL0$j;)V

    return-void
.end method


# virtual methods
.method public removeAll(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, LL0$j;->size()I

    move-result v0

    iget-object v1, p0, LL0$j;->c:Ljava/util/Collection;

    check-cast v1, Ljava/util/Set;

    invoke-static {v1, p1}, Ldw5;->k(Ljava/util/Set;Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object v1, p0, LL0$j;->c:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    iget-object v2, p0, LL0$l;->g:LL0;

    sub-int/2addr v1, v0

    invoke-static {v2, v1}, LL0;->t(LL0;I)I

    invoke-virtual {p0}, LL0$j;->h()V

    :cond_1
    return p1
.end method
