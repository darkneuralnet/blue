.class public LbF1;
.super LyS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LbF1$a;,
        LbF1$b;,
        LbF1$c;,
        LbF1$d;,
        LbF1$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0016\u0018\u00002\u00020\u0001:\u0005\u001f \u0018\u001b!B\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016J\u0010\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\u000eJ\u001e\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u000f\u0012\u0004\u0012\u00020\u00140\u00120\u000eR.\u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 \u0017*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u000f0\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019RF\u0010\u001c\u001a4\u00120\u0012.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u000f\u0012\u0004\u0012\u00020\u0014 \u0017*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00120\u00120\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019\u00a8\u0006\""
    }
    d2 = {
        "LbF1;",
        "LyS0;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "Lw1;",
        "onCreateViewHolder",
        "LF6;",
        "r",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "",
        "onAttachedToRecyclerView",
        "Lio/reactivex/Observable;",
        "",
        "Lco/bird/android/model/persistence/HardCountScan;",
        "v",
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;",
        "w",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lio/reactivex/subjects/d;",
        "hardCountScansSubject",
        "d",
        "identifiersSubject",
        "<init>",
        "()V",
        "a",
        "b",
        "e",
        "co.bird.android.feature.hardcount"
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
            "Ljava/util/Collection<",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Pair<",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LyS0;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<Collection<HardCountScan>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LbF1;->c:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<Pair<Collection<S\u2026ingIdentifierCategory>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LbF1;->d:Lio/reactivex/subjects/d;

    return-void
.end method

.method public static final synthetic access$getAdapterData(LbF1;)LE6;
    .locals 0

    invoke-virtual {p0}, LMy;->o()LE6;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getHardCountScansSubject$p(LbF1;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, LbF1;->c:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getIdentifiersSubject$p(LbF1;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, LbF1;->d:Lio/reactivex/subjects/d;

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

    new-instance v0, LWF1;

    invoke-direct {v0}, LWF1;-><init>()V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$o;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, LbF1;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;
    .locals 3

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "parent.context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v0, p2, p1, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget v0, Lej4;->item_hard_count:I

    if-ne p2, v0, :cond_0

    new-instance p2, LbF1$a;

    invoke-direct {p2, p0, p1}, LbF1$a;-><init>(LbF1;Landroid/view/View;)V

    goto :goto_2

    :cond_0
    sget v0, Lej4;->item_hard_count_unidentified:I

    const/4 v2, 0x1

    if-ne p2, v0, :cond_1

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    sget v0, Lej4;->item_hard_count_pending_upload:I

    if-ne p2, v0, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    new-instance p2, LbF1$d;

    invoke-direct {p2, p0, p1}, LbF1$d;-><init>(LbF1;Landroid/view/View;)V

    goto :goto_2

    :cond_3
    sget v0, Lej4;->item_last_successful_hard_count:I

    if-ne p2, v0, :cond_4

    new-instance p2, LbF1$e;

    invoke-direct {p2, p0, p1}, LbF1$e;-><init>(LbF1;Landroid/view/View;)V

    goto :goto_2

    :cond_4
    sget v0, Lej4;->item_vehicle_models_header:I

    if-ne p2, v0, :cond_5

    new-instance p2, LbF1$c;

    invoke-direct {p2, p0, p1}, LbF1$c;-><init>(LbF1;Landroid/view/View;)V

    goto :goto_2

    :cond_5
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_2
    return-object p2
.end method

.method public r()LF6;
    .locals 1

    new-instance v0, LcF1;

    invoke-direct {v0}, LcF1;-><init>()V

    return-object v0
.end method

.method public final v()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/Collection<",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LbF1;->c:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "hardCountScansSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final w()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LbF1;->d:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "identifiersSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
