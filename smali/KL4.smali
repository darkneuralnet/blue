.class public LKL4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LRi1;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-class v0, LRi1;

    invoke-static {v0}, LS21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    check-cast v0, LRi1;

    invoke-direct {p0, v0}, LKL4;-><init>(LRi1;)V

    return-void
.end method

.method public constructor <init>(LRi1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKL4;->a:LRi1;

    return-void
.end method


# virtual methods
.method public a(LDV5$b;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDV5$b;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LKL4;->a:LRi1;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    invoke-virtual {v0, p1}, LRi1;->d(LDV5$b;)Landroid/util/Size;

    move-result-object p1

    if-nez p1, :cond_1

    return-object p2

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    invoke-virtual {v1, p1}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method
