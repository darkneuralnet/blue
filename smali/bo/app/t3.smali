.class public final Lbo/app/t3;
.super Lbo/app/i3;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lbo/app/b2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lbo/app/i3;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public a(Lbo/app/t2;)Z
    .locals 2

    iget-object v0, p0, Lbo/app/i3;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbo/app/b2;

    invoke-interface {v1, p1}, Lbo/app/b2;->a(Lbo/app/t2;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
