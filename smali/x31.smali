.class public final Lx31;
.super Ld13;
.source "SourceFile"


# annotations
.annotation runtime Ld13$b;
    value = "dialog"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx31$b;,
        Lx31$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld13<",
        "Lx31$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u001c2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J*\u0010\u000e\u001a\u00020\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016J\u0008\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0007R \u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00080\u00168@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001f"
    }
    d2 = {
        "Lx31;",
        "Ld13;",
        "Lx31$b;",
        "LAY2;",
        "backStackEntry",
        "",
        "m",
        "(LAY2;)V",
        "",
        "entries",
        "LTY2;",
        "navOptions",
        "Ld13$a;",
        "navigatorExtras",
        "e",
        "l",
        "popUpTo",
        "",
        "savedState",
        "j",
        "entry",
        "o",
        "LtP5;",
        "n",
        "()LtP5;",
        "backStack",
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
.field public static final c:Lx31$a;

.field public static final d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx31$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx31$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lx31;->c:Lx31$a;

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

    invoke-virtual {p0}, Lx31;->l()Lx31$b;

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

    invoke-virtual {p3, p2}, Lj13;->i(LAY2;)V

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

.method public l()Lx31$b;
    .locals 7

    new-instance v6, Lx31$b;

    const/4 v2, 0x0

    sget-object v0, Ltt0;->a:Ltt0;

    invoke-virtual {v0}, Ltt0;->a()Lkotlin/jvm/functions/Function3;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lx31$b;-><init>(Lx31;LD31;Lkotlin/jvm/functions/Function3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public final m(LAY2;)V
    .locals 2

    const-string v0, "backStackEntry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ld13;->b()Lj13;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lj13;->h(LAY2;Z)V

    return-void
.end method

.method public final n()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/util/List<",
            "LAY2;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Ld13;->b()Lj13;

    move-result-object v0

    invoke-virtual {v0}, Lj13;->b()LtP5;

    move-result-object v0

    return-object v0
.end method

.method public final o(LAY2;)V
    .locals 1

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ld13;->b()Lj13;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj13;->e(LAY2;)V

    return-void
.end method
