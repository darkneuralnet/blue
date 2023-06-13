.class public final Lso1$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lso1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lso1$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LMb2;",
        "b",
        "LMb2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lso1;Landroid/view/View;)V",
        "co.bird.android.feature.fleet-status"
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
        "SMAP\nFleetListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListAdapter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$TitleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n18#2:219\n18#2:225\n9#3,4:220\n9#3,4:226\n1#4:224\n*S KotlinDebug\n*F\n+ 1 FleetListAdapter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$TitleViewHolder\n*L\n111#1:219\n94#1:225\n111#1:220,4\n94#1:226,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LMb2;

.field public final synthetic c:Lso1;


# direct methods
.method public constructor <init>(Lso1;Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lso1$b;->c:Lso1;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LMb2;->a(Landroid/view/View;)LMb2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lso1$b;->b:LMb2;

    iget-object v0, p2, LMb2;->b:Landroid/widget/TextView;

    const-string v1, "binding.sort"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lso1$b$a;

    invoke-direct {v1, p1, p0}, Lso1$b$a;-><init>(Lso1;Lso1$b;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, p2, LMb2;->c:Landroid/widget/ImageView;

    const-string v0, "binding.sortIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lso1$b$b;

    invoke-direct {v0, p1, p0}, Lso1$b$b;-><init>(Lso1;Lso1$b;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final a(Lso1;Lso1$b;Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lso1;->access$getAdapterData(Lso1;)LE6;

    move-result-object p2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getBindingAdapterPosition()I

    move-result p1

    invoke-virtual {p2, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lkotlin/Pair;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LuN5;

    invoke-static {p0}, Lso1;->access$getSortOrderingSubject$p(Lso1;)Lio/reactivex/subjects/d;

    move-result-object p0

    sget-object p2, LuN5;->b:LuN5;

    if-ne p1, p2, :cond_1

    sget-object p2, LuN5;->c:LuN5;

    :cond_1
    invoke-virtual {p0, p2}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public static final synthetic b(Lso1;Lso1$b;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lso1$b;->a(Lso1;Lso1$b;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 6

    iget-object v0, p0, Lso1$b;->c:Lso1;

    invoke-static {v0}, Lso1;->access$getAdapterData(Lso1;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LuN5;

    iget-object v2, p0, Lso1$b;->b:LMb2;

    iget-object v2, v2, LMb2;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lso1$b;->b:LMb2;

    iget-object v0, v0, LMb2;->b:Landroid/widget/TextView;

    const-string v2, "binding.sort"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    const/4 v5, 0x2

    invoke-static {v0, v4, v3, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lso1$b;->b:LMb2;

    iget-object v0, v0, LMb2;->c:Landroid/widget/ImageView;

    const-string v4, "binding.sortIcon"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    invoke-static {v0, v2, v3, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lso1$b;->b:LMb2;

    iget-object v1, v0, LMb2;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, LMb2;->b()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, LuN5;->b:LuN5;

    if-ne p1, v2, :cond_3

    sget p1, Lrg4;->ic_sort_ascending:I

    goto :goto_3

    :cond_3
    sget p1, Lrg4;->ic_sort_descending:I

    :goto_3
    invoke-static {v0, p1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    return-void
.end method
