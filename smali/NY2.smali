.class public LNY2;
.super Ld13;
.source "SourceFile"


# annotations
.annotation runtime Ld13$b;
    value = "navigation"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld13<",
        "LJY2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0017\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J*\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "LNY2;",
        "Ld13;",
        "LJY2;",
        "l",
        "",
        "LAY2;",
        "entries",
        "LTY2;",
        "navOptions",
        "Ld13$a;",
        "navigatorExtras",
        "",
        "e",
        "entry",
        "m",
        "Li13;",
        "c",
        "Li13;",
        "navigatorProvider",
        "<init>",
        "(Li13;)V",
        "navigation-common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final c:Li13;


# direct methods
.method public constructor <init>(Li13;)V
    .locals 1

    const-string v0, "navigatorProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ld13;-><init>()V

    iput-object p1, p0, LNY2;->c:Li13;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()LHY2;
    .locals 1

    invoke-virtual {p0}, LNY2;->l()LJY2;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/util/List;LTY2;Ld13$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LAY2;",
            ">;",
            "LTY2;",
            "Ld13$a;",
            ")V"
        }
    .end annotation

    const-string v0, "entries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAY2;

    invoke-virtual {p0, v0, p2, p3}, LNY2;->m(LAY2;LTY2;Ld13$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l()LJY2;
    .locals 1

    new-instance v0, LJY2;

    invoke-direct {v0, p0}, LJY2;-><init>(Ld13;)V

    return-object v0
.end method

.method public final m(LAY2;LTY2;Ld13$a;)V
    .locals 5

    invoke-virtual {p1}, LAY2;->f()LHY2;

    move-result-object v0

    check-cast v0, LJY2;

    invoke-virtual {p1}, LAY2;->d()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0}, LJY2;->N()I

    move-result v1

    invoke-virtual {v0}, LJY2;->O()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v1, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v4, v3

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v4, 0x1

    :goto_1
    if-eqz v4, :cond_4

    if-eqz v2, :cond_2

    invoke-virtual {v0, v2, v3}, LJY2;->K(Ljava/lang/String;Z)LHY2;

    move-result-object v1

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1, v3}, LJY2;->I(IZ)LHY2;

    move-result-object v1

    :goto_2
    if-eqz v1, :cond_3

    iget-object v0, p0, LNY2;->c:Li13;

    invoke-virtual {v1}, LHY2;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Li13;->e(Ljava/lang/String;)Ld13;

    move-result-object v0

    invoke-virtual {p0}, Ld13;->b()Lj13;

    move-result-object v2

    invoke-virtual {v1, p1}, LHY2;->e(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v2, v1, p1}, Lj13;->a(LHY2;Landroid/os/Bundle;)LAY2;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Ld13;->e(Ljava/util/List;LTY2;Ld13$a;)V

    return-void

    :cond_3
    invoke-virtual {v0}, LJY2;->M()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "navigation destination "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is not a direct child of this NavGraph"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "no start destination defined via app:startDestination for "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LJY2;->o()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
