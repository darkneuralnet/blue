.class public final Lch5$d;
.super LZ0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lch5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, LZ0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LZ0;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls00;

    if-nez v1, :cond_0

    new-instance v1, Lsf1;

    invoke-interface {v2}, Ls00;->getBounds()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsf1;

    invoke-direct {v1, v2}, Lsf1;-><init>(Lsf1;)V

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ls00;->getBounds()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsf1;

    invoke-virtual {v1, v2}, Lsf1;->l(Lsf1;)V

    goto :goto_0

    :cond_1
    return-object v1
.end method
