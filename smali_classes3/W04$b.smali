.class public final LW04$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW04;
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
        "LW04$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LFe2;",
        "b",
        "LFe2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LW04;Landroid/view/View;)V",
        "co.bird.android.feature.payment"
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
        "SMAP\nPreloadV2OptionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsAdapter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsAdapter$PreloadV2OptionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n18#2:111\n9#3,4:112\n1#4:116\n*S KotlinDebug\n*F\n+ 1 PreloadV2OptionsAdapter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsAdapter$PreloadV2OptionViewHolder\n*L\n56#1:111\n56#1:112,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LFe2;

.field public final synthetic c:LW04;


# direct methods
.method public constructor <init>(LW04;Landroid/view/View;)V
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

    iput-object p1, p0, LW04$b;->c:LW04;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LFe2;->a(Landroid/view/View;)LFe2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LW04$b;->b:LFe2;

    invoke-virtual {p1}, LFe2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setClipToOutline(Z)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 7

    iget-object v0, p0, LW04$b;->c:LW04;

    invoke-static {v0}, LW04;->access$getAdapterData(LW04;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LS04;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LS04;

    if-eqz p1, :cond_5

    iget-object v0, p0, LW04$b;->c:LW04;

    iget-object v2, p0, LW04$b;->b:LFe2;

    iget-object v2, v2, LFe2;->i:Landroidx/constraintlayout/widget/Group;

    const-string v3, "binding.selectedIndicator"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LS04;->h()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v2, p0, LW04$b;->b:LFe2;

    iget-object v2, v2, LFe2;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, LS04;->h()Z

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setSelected(Z)V

    iget-object v2, p0, LW04$b;->b:LFe2;

    iget-object v2, v2, LFe2;->e:Landroid/view/View;

    const-string v3, "binding.outline"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LS04;->h()Z

    move-result v3

    invoke-static {v2, v3, v4, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v2, p0, LW04$b;->b:LFe2;

    iget-object v2, v2, LFe2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, LS04;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LW04$b;->b:LFe2;

    iget-object v2, v2, LFe2;->f:Landroid/widget/TextView;

    const-string v3, "binding.promoText"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LS04;->g()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x4

    invoke-static {v2, v3, v6}, Ltu6;->p(Landroid/widget/TextView;Ljava/lang/CharSequence;I)V

    iget-object v2, p0, LW04$b;->b:LFe2;

    iget-object v2, v2, LFe2;->d:Landroid/widget/TextView;

    const-string v3, "binding.incentive"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LS04;->d()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6, v4, v5, v1}, Ltu6;->setTextAndVisibility$default(Landroid/widget/TextView;Ljava/lang/CharSequence;IILjava/lang/Object;)V

    invoke-virtual {p1}, LS04;->e()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    long-to-int v2, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    iget-object v4, p0, LW04$b;->b:LFe2;

    iget-object v4, v4, LFe2;->d:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getBackgroundTintList()Landroid/content/res/ColorStateList;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_2
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, p0, LW04$b;->b:LFe2;

    iget-object v2, v2, LFe2;->d:Landroid/widget/TextView;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_3
    invoke-virtual {p1}, LS04;->h()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {v0}, LW04;->access$getOptionModelSelectedRelay$p(LW04;)La94;

    move-result-object v1

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v2, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v1, v2}, La94;->accept(Ljava/lang/Object;)V

    :cond_4
    iget-object v1, p0, LW04$b;->b:LFe2;

    invoke-virtual {v1}, LFe2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string v2, "binding.root"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LW04$b$a;

    invoke-direct {v2, v0, p1}, LW04$b$a;-><init>(LW04;LS04;)V

    invoke-static {v1, v2}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    :cond_5
    return-void
.end method
