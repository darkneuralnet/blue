.class public LG91;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LJj1;


# direct methods
.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LJj1;

    invoke-static {p1}, LG91;->c(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    invoke-direct {v0, p1}, LJj1;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LG91;->a:LJj1;

    return-void
.end method

.method public static b(Ljava/util/Collection;)V
    .locals 1

    new-instance v0, LG91;

    invoke-direct {v0, p0}, LG91;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, LG91;->a()V

    return-void
.end method

.method public static c(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq91;

    new-instance v2, LSE;

    invoke-virtual {v1}, Lq91;->n()[LyB0;

    move-result-object v3

    invoke-direct {v2, v3, v1}, LSE;-><init>([LyB0;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LG91;->a:LJj1;

    invoke-virtual {v0}, LJj1;->b()V

    return-void
.end method
