.class public final LjE4$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LjE4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LjE4$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lhf2;",
        "b",
        "Lhf2;",
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
        "SMAP\nRepairV3IssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$IssueViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,128:1\n18#2:129\n9#3,4:130\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueAdapter.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapter$IssueViewHolder\n*L\n77#1:129\n77#1:130,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lhf2;

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

    iput-object p1, p0, LjE4$a;->d:LjE4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lhf2;->a(Landroid/view/View;)Lhf2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LjE4$a;->b:Lhf2;

    new-instance v0, LQE4;

    invoke-direct {v0}, LQE4;-><init>()V

    iput-object v0, p0, LjE4$a;->c:LQE4;

    iget-object p2, p2, Lhf2;->c:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    new-instance v1, Landroidx/recyclerview/widget/g;

    invoke-direct {v1}, Landroidx/recyclerview/widget/g;-><init>()V

    invoke-virtual {p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    new-instance p2, LjE4$a$a;

    invoke-static {p1}, LjE4;->access$getRepairSelectsSubject$p(LjE4;)Lio/reactivex/subjects/d;

    move-result-object v1

    invoke-direct {p2, v1}, LjE4$a$a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, LQE4;->w(Lkotlin/jvm/functions/Function1;)V

    new-instance p2, LjE4$a$b;

    invoke-direct {p2, p0, p1}, LjE4$a$b;-><init>(LjE4$a;LjE4;)V

    invoke-virtual {v0, p2}, LQE4;->v(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    iget-object v0, p0, LjE4$a;->d:LjE4;

    invoke-static {v0}, LjE4;->access$getAdapterData(LjE4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LDA4;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LDA4;

    if-eqz p1, :cond_1

    iget-object v0, p0, LjE4$a;->b:Lhf2;

    iget-object v0, v0, Lhf2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, LDA4;->e()Lco/bird/android/model/RepairIssue;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/RepairIssue;->getDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LjE4$a;->b:Lhf2;

    iget-object v0, v0, Lhf2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, LDA4;->g()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, LjE4$a;->b:Lhf2;

    iget-object v0, v0, Lhf2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, LDA4;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, LjE4$a;->b:Lhf2;

    iget-object v0, v0, Lhf2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, LDA4;->c()Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, LjE4$a;->c:LQE4;

    invoke-virtual {p1}, LDA4;->f()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LMy;->u(Ljava/util/Collection;)V

    :cond_1
    return-void
.end method
