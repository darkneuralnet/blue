.class public final LdM1$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LdM1;
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
        "LdM1$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Loc2;",
        "b",
        "Loc2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LdM1;Landroid/view/View;)V",
        "hibernation-scan_release"
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
        "SMAP\nHibernationScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationScanAdapter.kt\nco/bird/android/feature/hibernationscan/adapter/HibernationScanAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,93:1\n18#2:94\n9#3,4:95\n*S KotlinDebug\n*F\n+ 1 HibernationScanAdapter.kt\nco/bird/android/feature/hibernationscan/adapter/HibernationScanAdapter$VehicleViewHolder\n*L\n78#1:94\n78#1:95,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Loc2;

.field public final synthetic c:LdM1;


# direct methods
.method public constructor <init>(LdM1;Landroid/view/View;)V
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

    iput-object p1, p0, LdM1$c;->c:LdM1;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Loc2;->a(Landroid/view/View;)Loc2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LdM1$c;->b:Loc2;

    invoke-virtual {p2}, Loc2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LdM1$c$a;

    invoke-direct {v0, p0, p1}, LdM1$c$a;-><init>(LdM1$c;LdM1;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 8

    iget-object v0, p0, LdM1$c;->c:LdM1;

    invoke-static {v0}, LdM1;->access$getAdapterData(LdM1;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LHM1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LHM1;

    if-eqz p1, :cond_2

    iget-object v0, p0, LdM1$c;->b:Loc2;

    iget-object v0, v0, Loc2;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, LHM1;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LdM1$c;->b:Loc2;

    iget-object v0, v0, Loc2;->b:Lco/bird/android/widget/BatteryViewV2;

    invoke-virtual {p1}, LHM1;->b()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    invoke-virtual {v0, v2}, Lco/bird/android/widget/BatteryViewV2;->setBatteryLevel(F)V

    iget-object v0, p0, LdM1$c;->b:Loc2;

    iget-object v0, v0, Loc2;->c:Landroid/widget/TextView;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lnl4;->battery_percent:I

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, LHM1;->b()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-virtual {v2, v3, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LdM1$c;->b:Loc2;

    iget-object v0, v0, Loc2;->h:Landroid/widget/TextView;

    invoke-virtual {p1}, LHM1;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LdM1$c;->b:Loc2;

    iget-object v0, v0, Loc2;->h:Landroid/widget/TextView;

    invoke-virtual {p1}, LHM1;->j()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, LdM1$c;->b:Loc2;

    iget-object v0, v0, Loc2;->f:Landroid/widget/ImageView;

    const-string v2, "binding.icon"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LdM1;->access$getFAILED_STATES$cp()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {p1}, LHM1;->d()Lco/bird/android/model/constant/VehicleHibernationCategory;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x2

    invoke-static {v0, v2, v7, v3, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LdM1$c;->b:Loc2;

    iget-object v0, v0, Loc2;->g:Landroid/widget/ImageView;

    const-string v2, "binding.moreIcon"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LHM1;->g()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move v4, v7

    :goto_1
    invoke-static {v0, v4, v7, v3, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LdM1$c;->b:Loc2;

    iget-object v0, v0, Loc2;->g:Landroid/widget/ImageView;

    invoke-virtual {p1}, LHM1;->g()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    return-void
.end method
