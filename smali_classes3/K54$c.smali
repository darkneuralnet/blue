.class public final LK54$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK54;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LK54$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LOe2;",
        "b",
        "LOe2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LK54;Landroid/view/View;)V",
        "ownedbirds_release"
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
        "SMAP\nPrivateBirdsOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsOverviewAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdsOverviewAdapter$PromotionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,123:1\n18#2:124\n9#3,4:125\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsOverviewAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdsOverviewAdapter$PromotionViewHolder\n*L\n62#1:124\n62#1:125,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LOe2;

.field public final synthetic c:LK54;


# direct methods
.method public constructor <init>(LK54;Landroid/view/View;)V
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

    iput-object p1, p0, LK54$c;->c:LK54;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LOe2;->a(Landroid/view/View;)LOe2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LK54$c;->b:LOe2;

    iget-object v0, p2, LOe2;->b:LKs6;

    invoke-virtual {v0}, LKs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "binding.viewPromotionCollapse.root"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LK54$c$a;

    invoke-direct {v1, p1}, LK54$c$a;-><init>(LK54;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, p2, LOe2;->c:LLs6;

    iget-object p2, p2, LLs6;->b:Landroid/widget/Button;

    const-string v0, "binding.viewPromotionExpanded.buyButton"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LK54$c$b;

    invoke-direct {v0, p1}, LK54$c$b;-><init>(LK54;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 7

    iget-object v0, p0, LK54$c;->c:LK54;

    invoke-static {v0}, LK54;->access$getAdapterData(LK54;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_1

    iget-object p1, p0, LK54$c;->b:LOe2;

    invoke-virtual {p1}, LOe2;->b()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lnl4;->retail_promotion_cta:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "binding.root.resources.g\u2026ing.retail_promotion_cta)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, LK54$c;->c:LK54;

    invoke-virtual {v0}, LMy;->getItemCount()I

    move-result v0

    const-string v2, "binding.viewPromotionCollapse.root"

    const-string v3, "binding.viewPromotionExpanded.root"

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-ne v0, v4, :cond_2

    iget-object v0, p0, LK54$c;->b:LOe2;

    iget-object v0, v0, LOe2;->c:LLs6;

    invoke-virtual {v0}, LLs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v4, v6, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LK54$c;->b:LOe2;

    iget-object v0, v0, LOe2;->c:LLs6;

    iget-object v0, v0, LLs6;->b:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LK54$c;->b:LOe2;

    iget-object p1, p1, LOe2;->b:LKs6;

    invoke-virtual {p1}, LKs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v6, v6, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, LK54$c;->b:LOe2;

    iget-object v0, v0, LOe2;->c:LLs6;

    invoke-virtual {v0}, LLs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6, v6, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LK54$c;->b:LOe2;

    iget-object v0, v0, LOe2;->b:LKs6;

    invoke-virtual {v0}, LKs6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v4, v6, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LK54$c;->b:LOe2;

    iget-object v0, v0, LOe2;->b:LKs6;

    iget-object v0, v0, LKs6;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method
