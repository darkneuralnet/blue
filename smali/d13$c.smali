.class public final Ld13$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld13;->e(Ljava/util/List;LTY2;Ld13$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LAY2;",
        "LAY2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LHY2;",
        "D",
        "LAY2;",
        "backStackEntry",
        "a",
        "(LAY2;)LAY2;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ld13;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld13<",
            "TD;>;"
        }
    .end annotation
.end field

.field public final synthetic h:LTY2;

.field public final synthetic i:Ld13$a;


# direct methods
.method public constructor <init>(Ld13;LTY2;Ld13$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld13<",
            "TD;>;",
            "LTY2;",
            "Ld13$a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ld13$c;->g:Ld13;

    iput-object p2, p0, Ld13$c;->h:LTY2;

    iput-object p3, p0, Ld13$c;->i:Ld13$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LAY2;)LAY2;
    .locals 6

    const-string v0, "backStackEntry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LAY2;->f()LHY2;

    move-result-object v0

    instance-of v1, v0, LHY2;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    return-object v2

    :cond_1
    iget-object v1, p0, Ld13$c;->g:Ld13;

    invoke-virtual {p1}, LAY2;->d()Landroid/os/Bundle;

    move-result-object v3

    iget-object v4, p0, Ld13$c;->h:LTY2;

    iget-object v5, p0, Ld13$c;->i:Ld13$a;

    invoke-virtual {v1, v0, v3, v4, v5}, Ld13;->d(LHY2;Landroid/os/Bundle;LTY2;Ld13$a;)LHY2;

    move-result-object v1

    if-nez v1, :cond_2

    move-object p1, v2

    goto :goto_1

    :cond_2
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Ld13$c;->g:Ld13;

    invoke-virtual {v0}, Ld13;->b()Lj13;

    move-result-object v0

    invoke-virtual {p1}, LAY2;->d()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v1, p1}, LHY2;->e(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lj13;->a(LHY2;Landroid/os/Bundle;)LAY2;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LAY2;

    invoke-virtual {p0, p1}, Ld13$c;->a(LAY2;)LAY2;

    move-result-object p1

    return-object p1
.end method
