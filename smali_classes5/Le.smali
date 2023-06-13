.class public final LLe;
.super Ld13;
.source "SourceFile"


# annotations
.annotation runtime Ld13$b;
    value = "animatedComposable"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLe$b;,
        LLe$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld13<",
        "LLe$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 \u001c2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ*\u0010\u000b\u001a\u00020\n2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J\u0008\u0010\u000c\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R \u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00148\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001f"
    }
    d2 = {
        "LLe;",
        "Ld13;",
        "LLe$b;",
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
        "n",
        "(LAY2;)V",
        "LEX2;",
        "c",
        "LEX2;",
        "m",
        "()LEX2;",
        "isPop",
        "<init>",
        "()V",
        "d",
        "a",
        "b",
        "navigation-animation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final d:LLe$a;


# instance fields
.field public final c:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LLe$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LLe$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LLe;->d:LLe$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ld13;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    iput-object v0, p0, LLe;->c:LEX2;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()LHY2;
    .locals 1

    invoke-virtual {p0}, LLe;->l()LLe$b;

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
    iget-object p1, p0, LLe;->c:LEX2;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public j(LAY2;Z)V
    .locals 1

    const-string v0, "popUpTo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ld13;->b()Lj13;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lj13;->h(LAY2;Z)V

    iget-object p1, p0, LLe;->c:LEX2;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public l()LLe$b;
    .locals 2

    new-instance v0, LLe$b;

    sget-object v1, Lmt0;->a:Lmt0;

    invoke-virtual {v1}, Lmt0;->a()Lkotlin/jvm/functions/Function4;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LLe$b;-><init>(LLe;Lkotlin/jvm/functions/Function4;)V

    return-object v0
.end method

.method public final m()LEX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LLe;->c:LEX2;

    return-object v0
.end method

.method public final n(LAY2;)V
    .locals 1

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ld13;->b()Lj13;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj13;->e(LAY2;)V

    return-void
.end method
