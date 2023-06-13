.class public final LiD6;
.super LyS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LiD6$a;,
        LiD6$b;,
        LiD6$c;,
        LiD6$d;,
        LiD6$e;,
        LiD6$f;,
        LiD6$g;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001:\u0007\u001b\u001c\u0012\u0016\u001d\u001e\u001fB\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016J\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000eR\"\u0010\u0014\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\n0\n0\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006 "
    }
    d2 = {
        "LiD6;",
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
        "v",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lio/reactivex/subjects/d;",
        "addSubject",
        "Ljava/text/SimpleDateFormat;",
        "d",
        "Ljava/text/SimpleDateFormat;",
        "repairDateFormat",
        "<init>",
        "()V",
        "a",
        "b",
        "e",
        "f",
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

.field public final d:Ljava/text/SimpleDateFormat;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, LyS0;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LiD6;->c:Lio/reactivex/subjects/d;

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "h:mm a"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v0, p0, LiD6;->d:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public static final synthetic access$getAdapterData(LiD6;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAddSubject$p(LiD6;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, LiD6;->c:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getRepairDateFormat$p(LiD6;)Ljava/text/SimpleDateFormat;
    .locals 0

    iget-object p0, p0, LiD6;->d:Ljava/text/SimpleDateFormat;

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

    new-instance v0, LoD6;

    invoke-direct {v0}, LoD6;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LiD6;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

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

    sget v0, LXj4;->item_bird_code_and_model:I

    if-ne p2, v0, :cond_0

    new-instance p2, LiD6$b;

    invoke-direct {p2, p0, p1}, LiD6$b;-><init>(LiD6;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, LXj4;->item_work_order_header:I

    if-ne p2, v0, :cond_1

    new-instance p2, LiD6$d;

    invoke-direct {p2, p0, p1}, LiD6$d;-><init>(LiD6;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    sget v0, LXj4;->item_issue_header:I

    if-ne p2, v0, :cond_2

    new-instance p2, LiD6$e;

    invoke-direct {p2, p0, p1}, LiD6$e;-><init>(LiD6;Landroid/view/View;)V

    goto :goto_0

    :cond_2
    sget v0, LXj4;->item_work_order_repair:I

    if-ne p2, v0, :cond_3

    new-instance p2, LiD6$f;

    invoke-direct {p2, p0, p1}, LiD6$f;-><init>(LiD6;Landroid/view/View;)V

    goto :goto_0

    :cond_3
    sget v0, LXj4;->item_work_order_details_header:I

    if-ne p2, v0, :cond_4

    new-instance p2, LiD6$g;

    invoke-direct {p2, p0, p1}, LiD6$g;-><init>(LiD6;Landroid/view/View;)V

    goto :goto_0

    :cond_4
    sget v0, LXj4;->item_work_order_details:I

    if-ne p2, v0, :cond_5

    new-instance p2, LiD6$c;

    invoke-direct {p2, p0, p1}, LiD6$c;-><init>(LiD6;Landroid/view/View;)V

    goto :goto_0

    :cond_5
    sget v0, LXj4;->item_work_order_details_add:I

    if-ne p2, v0, :cond_6

    new-instance p2, LiD6$a;

    invoke-direct {p2, p0, p1}, LiD6$a;-><init>(LiD6;Landroid/view/View;)V

    goto :goto_0

    :cond_6
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public r()LF6;
    .locals 1

    new-instance v0, LjD6;

    invoke-direct {v0}, LjD6;-><init>()V

    return-object v0
.end method

.method public final v()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LiD6;->c:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "addSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
