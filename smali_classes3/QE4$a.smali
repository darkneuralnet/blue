.class public final LQE4$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQE4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LQE4$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lif2;",
        "b",
        "Lif2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LQE4;Landroid/view/View;)V",
        "repair_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRepairV3IssueRepairAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueRepairAdapter$NonRepairViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n18#2:111\n9#3,4:112\n288#4,2:116\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueRepairAdapter$NonRepairViewHolder\n*L\n92#1:111\n92#1:112,4\n93#1:116,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lif2;

.field public final synthetic c:LQE4;


# direct methods
.method public constructor <init>(LQE4;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LQE4$a;->c:LQE4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lif2;->a(Landroid/view/View;)Lif2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LQE4$a;->b:Lif2;

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v0, "itemView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LQE4$a$a;

    invoke-direct {v0, p0, p1}, LQE4$a$a;-><init>(LQE4$a;LQE4;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 4

    iget-object v0, p0, LQE4$a;->c:LQE4;

    invoke-static {v0}, LQE4;->access$getAdapterData(LQE4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/NonRepair;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/NonRepair;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lco/bird/android/model/NonRepair;->getReasons()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/model/NonRepairReason;

    invoke-virtual {v3}, Lco/bird/android/model/NonRepairReason;->getSelected()Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v1, v2

    :cond_2
    check-cast v1, Lco/bird/android/model/NonRepairReason;

    iget-object v0, p0, LQE4$a;->b:Lif2;

    iget-object v0, v0, Lif2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/NonRepair;->getDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/model/NonRepair;->getSelected()Z

    move-result v0

    const-string v2, "binding.reason"

    if-eqz v0, :cond_5

    iget-object v0, p0, LQE4$a;->b:Lif2;

    iget-object v0, v0, Lif2;->c:Landroid/widget/TextView;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lco/bird/android/model/NonRepairReason;->getDisplay()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v3, Lnl4;->repair_non_repair_confirmed:I

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LQE4$a;->b:Lif2;

    iget-object v0, v0, Lif2;->c:Landroid/widget/TextView;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/NonRepair;->getAllowRepairs()Z

    move-result p1

    if-eqz p1, :cond_4

    sget p1, LDf4;->failedIssueRed:I

    goto :goto_2

    :cond_4
    sget p1, LDf4;->passedIssueGreen:I

    :goto_2
    invoke-static {v1, p1}, LNA0;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, LQE4$a;->b:Lif2;

    iget-object p1, p1, Lif2;->c:Landroid/widget/TextView;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    goto :goto_3

    :cond_5
    iget-object p1, p0, LQE4$a;->b:Lif2;

    iget-object p1, p1, Lif2;->c:Landroid/widget/TextView;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    :cond_6
    :goto_3
    return-void
.end method
