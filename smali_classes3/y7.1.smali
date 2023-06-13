.class public final Ly7;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7$a;,
        Ly7$b;,
        Ly7$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lw1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\'\u0014\u001aB\u0007\u00a2\u0006\u0004\u0008%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0008\u0010\u0008\u001a\u00020\u0005H\u0016J\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0014\u0010\u0011\u001a\u00020\u000b2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eR\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R%\u0010\u001e\u001a\u0010\u0012\u000c\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR=\u0010$\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020! \u0019*\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0018\u00010\u001f0\u001f0\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001b\u001a\u0004\u0008#\u0010\u001d\u00a8\u0006("
    }
    d2 = {
        "Ly7;",
        "Landroidx/recyclerview/widget/RecyclerView$h;",
        "Lw1;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "getItemCount",
        "holder",
        "position",
        "",
        "onBindViewHolder",
        "getItemViewType",
        "",
        "LH6;",
        "adapterSections",
        "r",
        "o",
        "LE6;",
        "b",
        "LE6;",
        "adapterData",
        "Lio/reactivex/subjects/d;",
        "",
        "kotlin.jvm.PlatformType",
        "c",
        "Lio/reactivex/subjects/d;",
        "q",
        "()Lio/reactivex/subjects/d;",
        "searchPublisher",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/LegacyRepairType;",
        "",
        "d",
        "p",
        "repairChecksPublisher",
        "<init>",
        "()V",
        "a",
        "servicecenter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LE6;

.field public final c:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/LegacyRepairType;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    new-instance v0, LE6;

    invoke-direct {v0, p0}, LE6;-><init>(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iput-object v0, p0, Ly7;->b:LE6;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<CharSequence>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ly7;->c:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<Pair<LegacyRepairType, Boolean>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ly7;->d:Lio/reactivex/subjects/d;

    return-void
.end method

.method public static final synthetic access$getAdapterData$p(Ly7;)LE6;
    .locals 0

    iget-object p0, p0, Ly7;->b:LE6;

    return-object p0
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Ly7;->b:LE6;

    invoke-virtual {v0}, LE6;->g()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    iget-object v0, p0, Ly7;->b:LE6;

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->b()I

    move-result p1

    return p1
.end method

.method public final o()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly7;->b:LE6;

    invoke-virtual {v0}, LE6;->j()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 0

    check-cast p1, Lw1;

    invoke-virtual {p0, p1, p2}, Ly7;->onBindViewHolder(Lw1;I)V

    return-void
.end method

.method public onBindViewHolder(Lw1;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lw1;->bind(I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ly7;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lw1;

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

    sget v0, LNj4;->view_repair_logger_search:I

    if-ne p2, v0, :cond_0

    new-instance p2, Ly7$b;

    invoke-direct {p2, p0, p1}, Ly7$b;-><init>(Ly7;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget v0, LNj4;->view_repair_logger_add_repair:I

    if-ne p2, v0, :cond_1

    new-instance p2, Ly7$a;

    invoke-direct {p2, p0, p1}, Ly7$a;-><init>(Ly7;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    sget v0, LNj4;->view_repair_logger_add_sub_repair:I

    if-ne p2, v0, :cond_2

    new-instance p2, Ly7$c;

    invoke-direct {p2, p0, p1}, Ly7$c;-><init>(Ly7;Landroid/view/View;)V

    goto :goto_0

    :cond_2
    new-instance p2, Lw1;

    invoke-direct {p2, p1}, Lw1;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2
.end method

.method public final p()Lio/reactivex/subjects/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/LegacyRepairType;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Ly7;->d:Lio/reactivex/subjects/d;

    return-object v0
.end method

.method public final q()Lio/reactivex/subjects/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/subjects/d<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly7;->c:Lio/reactivex/subjects/d;

    return-object v0
.end method

.method public final r(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "adapterSections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly7;->b:LE6;

    invoke-virtual {v0}, LE6;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly7;->b:LE6;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LE6;->b(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ls7;

    invoke-direct {v0}, Ls7;-><init>()V

    iget-object v1, p0, Ly7;->b:LE6;

    invoke-virtual {v1}, LE6;->j()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ls7;->a(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/h$e;

    move-result-object v0

    iget-object v1, p0, Ly7;->b:LE6;

    invoke-virtual {v1}, LE6;->c()V

    iget-object v1, p0, Ly7;->b:LE6;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v1, p1}, LE6;->a(Ljava/util/Collection;)V

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/h$e;->d(Landroidx/recyclerview/widget/RecyclerView$h;)V

    :goto_0
    return-void
.end method
