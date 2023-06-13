.class public final LF00;
.super LwZ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LwZ<",
        "Lco/bird/android/model/BountyFlightSheetButton;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0008\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LF00;",
        "LwZ;",
        "Lco/bird/android/model/BountyFlightSheetButton;",
        "LE00;",
        "c",
        "LE00;",
        "d",
        "()LE00;",
        "adapter",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "e",
        "()Landroidx/recyclerview/widget/LinearLayoutManager;",
        "layoutManager",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "flight-sheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final c:LE00;

.field public final d:Landroidx/recyclerview/widget/LinearLayoutManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LwZ;-><init>(Landroid/content/Context;)V

    new-instance v0, LE00;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LE00;-><init>(Landroidx/recyclerview/widget/RecyclerView$o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, LF00;->c:LE00;

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, LF00;->d:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, LF00;->d()LE00;

    move-result-object p1

    new-instance v0, LF00$a;

    invoke-direct {v0, p0}, LF00$a;-><init>(LF00;)V

    invoke-virtual {p1, v0}, LE00;->x(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$getOnClick(LF00;)Lkotlin/jvm/functions/Function1;
    .locals 0

    invoke-virtual {p0}, LwZ;->a()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()LE00;
    .locals 1

    iget-object v0, p0, LF00;->c:LE00;

    return-object v0
.end method

.method public e()Landroidx/recyclerview/widget/LinearLayoutManager;
    .locals 1

    iget-object v0, p0, LF00;->d:Landroidx/recyclerview/widget/LinearLayoutManager;

    return-object v0
.end method

.method public bridge synthetic getAdapter()LyS0;
    .locals 1

    invoke-virtual {p0}, LF00;->d()LE00;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;
    .locals 1

    invoke-virtual {p0}, LF00;->e()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object v0

    return-object v0
.end method
