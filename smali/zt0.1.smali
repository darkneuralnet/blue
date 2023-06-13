.class public final Lzt0;
.super Ld13;
.source "SourceFile"


# annotations
.annotation runtime Ld13$b;
    value = "composable"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzt0$b;,
        Lzt0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld13<",
        "Lzt0$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 \u00162\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J*\u0010\u000b\u001a\u00020\n2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J\u0008\u0010\u000c\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0019"
    }
    d2 = {
        "Lzt0;",
        "Ld13;",
        "Lzt0$b;",
        "",
        "LAY2;",
        "entries",
        "LTY2;",
        "navOptions",
        "Ld13$a;",
        "navigatorExtras",
        "",
        "e",
        "l",
        "popUpTo",
        "",
        "savedState",
        "j",
        "entry",
        "m",
        "(LAY2;)V",
        "<init>",
        "()V",
        "c",
        "a",
        "b",
        "navigation-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final c:Lzt0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzt0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzt0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzt0;->c:Lzt0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ld13;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()LHY2;
    .locals 1

    invoke-virtual {p0}, Lzt0;->l()Lzt0$b;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/util/List;LTY2;Ld13$a;)V
    .locals 0
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

    const-string p2, "entries"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LAY2;

    invoke-virtual {p0}, Ld13;->b()Lj13;

    move-result-object p3

    invoke-virtual {p3, p2}, Lj13;->j(LAY2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j(LAY2;Z)V
    .locals 1

    const-string v0, "popUpTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ld13;->b()Lj13;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lj13;->h(LAY2;Z)V

    return-void
.end method

.method public l()Lzt0$b;
    .locals 2

    new-instance v0, Lzt0$b;

    sget-object v1, Lqt0;->a:Lqt0;

    invoke-virtual {v1}, Lqt0;->a()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lzt0$b;-><init>(Lzt0;Lkotlin/jvm/functions/Function3;)V

    return-object v0
.end method

.method public final m(LAY2;)V
    .locals 1

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ld13;->b()Lj13;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj13;->e(LAY2;)V

    return-void
.end method
