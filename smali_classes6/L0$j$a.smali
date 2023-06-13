.class public LL0$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL0$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final synthetic d:LL0$j;


# direct methods
.method public constructor <init>(LL0$j;)V
    .locals 0

    iput-object p1, p0, LL0$j$a;->d:LL0$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, LL0$j;->c:Ljava/util/Collection;

    iput-object p1, p0, LL0$j$a;->c:Ljava/util/Collection;

    invoke-static {p1}, LL0;->q(Ljava/util/Collection;)Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LL0$j$a;->b:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(LL0$j;Ljava/util/Iterator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, LL0$j$a;->d:LL0$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, LL0$j;->c:Ljava/util/Collection;

    iput-object p1, p0, LL0$j$a;->c:Ljava/util/Collection;

    iput-object p2, p0, LL0$j$a;->b:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LL0$j$a;->d:LL0$j;

    invoke-virtual {v0}, LL0$j;->f()V

    iget-object v0, p0, LL0$j$a;->d:LL0$j;

    iget-object v0, v0, LL0$j;->c:Ljava/util/Collection;

    iget-object v1, p0, LL0$j$a;->c:Ljava/util/Collection;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    invoke-virtual {p0}, LL0$j$a;->a()V

    iget-object v0, p0, LL0$j$a;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    invoke-virtual {p0}, LL0$j$a;->a()V

    iget-object v0, p0, LL0$j$a;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    iget-object v0, p0, LL0$j$a;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    iget-object v0, p0, LL0$j$a;->d:LL0$j;

    iget-object v0, v0, LL0$j;->f:LL0;

    invoke-static {v0}, LL0;->s(LL0;)I

    iget-object v0, p0, LL0$j$a;->d:LL0$j;

    invoke-virtual {v0}, LL0$j;->h()V

    return-void
.end method
