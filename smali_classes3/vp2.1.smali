.class public final Lvp2;
.super LyS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvp2$a;,
        Lvp2$b;,
        Lvp2$c;,
        Lvp2$d;,
        Lvp2$e;,
        Lvp2$f;,
        Lvp2$g;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0018\u00002\u00020\u0001:\u0007 !\u0015\u0018\u001a\u001c\"B\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016J\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000eJ\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000eJ\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000eR\"\u0010\u0017\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\n0\n0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00100\u00100\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0016R\"\u0010\u001b\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00100\u00100\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0016R\"\u0010\u001d\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\n0\n0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0016\u00a8\u0006#"
    }
    d2 = {
        "Lvp2;",
        "LyS0;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "",
        "onAttachedToRecyclerView",
        "LF6;",
        "r",
        "Lio/reactivex/Observable;",
        "w",
        "",
        "v",
        "z",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lio/reactivex/subjects/d;",
        "commandSubject",
        "d",
        "categorySubject",
        "e",
        "noteSubject",
        "f",
        "submitSubject",
        "<init>",
        "()V",
        "a",
        "b",
        "g",
        "workorders_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, LyS0;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lvp2;->c:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v2, "create<String>()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lvp2;->d:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lvp2;->e:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lvp2;->f:Lio/reactivex/subjects/d;

    return-void
.end method

.method public static final synthetic access$getAdapterData(Lvp2;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCategorySubject$p(Lvp2;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lvp2;->d:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getCommandSubject$p(Lvp2;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lvp2;->c:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getNoteSubject$p(Lvp2;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lvp2;->e:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getSubmitSubject$p(Lvp2;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lvp2;->f:Lio/reactivex/subjects/d;

    return-object p0
.end method


# virtual methods
.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lzp2;

    invoke-direct {v0}, Lzp2;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lvp2;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;
    .locals 2

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "parent.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v0, p2, p1, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget v0, LXj4;->item_vehicle_summary:I

    if-ne p2, v0, :cond_0

    new-instance p2, Lvp2$g;

    invoke-direct {p2, p0, p1}, Lvp2$g;-><init>(Lvp2;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, Lmk4;->item_button_secondary:I

    if-ne p2, v0, :cond_1

    new-instance p2, Lvp2$b;

    invoke-direct {p2, p0, p1}, Lvp2$b;-><init>(Lvp2;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    sget v0, LXj4;->item_category_header:I

    if-ne p2, v0, :cond_2

    new-instance p2, Lvp2$a;

    invoke-direct {p2, p0, p1}, Lvp2$a;-><init>(Lvp2;Landroid/view/View;)V

    goto :goto_0

    :cond_2
    sget v0, LXj4;->item_issue_header:I

    if-ne p2, v0, :cond_3

    new-instance p2, Lvp2$d;

    invoke-direct {p2, p0, p1}, Lvp2$d;-><init>(Lvp2;Landroid/view/View;)V

    goto :goto_0

    :cond_3
    sget v0, LXj4;->item_work_order_notes:I

    if-ne p2, v0, :cond_4

    new-instance p2, Lvp2$e;

    invoke-direct {p2, p0, p1}, Lvp2$e;-><init>(Lvp2;Landroid/view/View;)V

    goto :goto_0

    :cond_4
    sget v0, LXj4;->item_dropdown_button:I

    if-ne p2, v0, :cond_5

    new-instance p2, Lvp2$c;

    invoke-direct {p2, p0, p1}, Lvp2$c;-><init>(Lvp2;Landroid/view/View;)V

    goto :goto_0

    :cond_5
    sget v0, Lmk4;->item_button:I

    if-ne p2, v0, :cond_6

    new-instance p2, Lvp2$f;

    invoke-direct {p2, p0, p1}, Lvp2$f;-><init>(Lvp2;Landroid/view/View;)V

    goto :goto_0

    :cond_6
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public r()LF6;
    .locals 1

    new-instance v0, Lyp2;

    invoke-direct {v0}, Lyp2;-><init>()V

    return-object v0
.end method

.method public final v()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lvp2;->d:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "categorySubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final w()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lvp2;->c:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "commandSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final z()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lvp2;->e:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "noteSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
