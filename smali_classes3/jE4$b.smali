.class public final LjE4$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LjE4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LjE4$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lgf2;",
        "b",
        "Lgf2;",
        "binding",
        "LQE4;",
        "c",
        "LQE4;",
        "adapter",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LjE4;Landroid/view/View;)V",
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
        "SMAP\nRepairV3IssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$TrainingGuideViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n18#2:129\n9#3,4:130\n1#4:134\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$TrainingGuideViewHolder\n*L\n121#1:129\n121#1:130,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lgf2;

.field public final c:LQE4;

.field public final synthetic d:LjE4;


# direct methods
.method public constructor <init>(LjE4;Landroid/view/View;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LjE4$b;->d:LjE4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lgf2;->a(Landroid/view/View;)Lgf2;

    move-result-object v0

    const-string v1, "bind(view)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LjE4$b;->b:Lgf2;

    new-instance v1, LQE4;

    invoke-direct {v1}, LQE4;-><init>()V

    iput-object v1, p0, LjE4$b;->c:LQE4;

    new-instance v2, LjE4$b$a;

    invoke-direct {v2, p0, p1}, LjE4$b$a;-><init>(LjE4$b;LjE4;)V

    invoke-static {p2, v2}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, v0, Lgf2;->e:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    new-instance v0, Landroidx/recyclerview/widget/g;

    invoke-direct {v0}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    new-instance p2, LjE4$b$b;

    invoke-direct {p2, p0, p1}, LjE4$b$b;-><init>(LjE4$b;LjE4;)V

    invoke-virtual {v1, p2}, LQE4;->v(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, LjE4$b;->d:LjE4;

    invoke-static {v0}, LjE4;->access$getAdapterData(LjE4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lo66;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lo66;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lo66;->a()Lco/bird/android/model/wire/WireQuickLink;

    move-result-object v0

    invoke-virtual {p1}, Lo66;->c()LH6;

    move-result-object p1

    iget-object v1, p0, LjE4$b;->b:Lgf2;

    iget-object v1, v1, Lgf2;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireQuickLink;->getDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_1

    iget-object v0, p0, LjE4$b;->c:LQE4;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    :cond_1
    return-void
.end method
