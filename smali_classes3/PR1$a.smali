.class public final LPR1$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPR1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016J\u0008\u0010\u0007\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "LPR1$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "record",
        "a",
        "Lrc2;",
        "b",
        "Lrc2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LPR1;Landroid/view/View;)V",
        "servicecenter_release"
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
        "SMAP\nIdToolsLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$BrainSwapRecordViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n18#2:164\n18#2:170\n9#3,4:165\n9#3,4:171\n1#4:169\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$BrainSwapRecordViewHolder\n*L\n114#1:164\n153#1:170\n114#1:165,4\n153#1:171,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lrc2;

.field public final synthetic c:LPR1;


# direct methods
.method public constructor <init>(LPR1;Landroid/view/View;)V
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

    iput-object p1, p0, LPR1$a;->c:LPR1;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lrc2;->a(Landroid/view/View;)Lrc2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LPR1$a;->b:Lrc2;

    invoke-virtual {p2}, Lrc2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPR1$a$a;

    invoke-direct {v0, p0, p1}, LPR1$a$a;-><init>(LPR1$a;LPR1;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic b(LPR1$a;Lco/bird/android/model/persistence/BrainSwapRecord;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LPR1$a;->a(Lco/bird/android/model/persistence/BrainSwapRecord;)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/BrainSwapRecord;)V
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lw1;->getSafePosition()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v1, p0, LPR1$a;->c:LPR1;

    invoke-static {v1}, LPR1;->access$getAdapterData(LPR1;)LE6;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v1, p1}, LE6;->e(I)LG6;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lco/bird/android/model/persistence/BrainSwapRecord;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/BrainSwapRecord;

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    if-nez p1, :cond_2

    return-void

    :cond_2
    iget-object v1, p0, LPR1$a;->b:Lrc2;

    iget-object v1, v1, Lrc2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BrainSwapRecord;->getStatus()Ljava/lang/Boolean;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lnl4;->completed:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lco/bird/android/model/persistence/BrainSwapRecord;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {p1, v2, v3, v4, v0}, LpT0;->getElapsedTime$default(Lorg/joda/time/DateTime;Landroid/content/Context;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_2
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public bind(I)V
    .locals 2

    iget-object v0, p0, LPR1$a;->c:LPR1;

    invoke-static {v0}, LPR1;->access$getAdapterData(LPR1;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/BrainSwapRecord;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/BrainSwapRecord;

    if-eqz p1, :cond_3

    iget-object v0, p0, LPR1$a;->b:Lrc2;

    iget-object v0, v0, Lrc2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BrainSwapRecord;->getBirdCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0, p1}, LPR1$a;->a(Lco/bird/android/model/persistence/BrainSwapRecord;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BrainSwapRecord;->getStatus()Ljava/lang/Boolean;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lrg4;->ic_filled_check_circle:I

    invoke-static {p1, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LDf4;->birdGreen:I

    invoke-static {v0, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    goto :goto_1

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lrg4;->ic_filled_x_circle:I

    invoke-static {p1, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LDf4;->birdRed:I

    invoke-static {v0, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lrg4;->ic_filled_dash_circle:I

    invoke-static {p1, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LDf4;->secondaryBG:I

    invoke-static {v0, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    :goto_1
    iget-object v1, p0, LPR1$a;->b:Lrc2;

    iget-object v1, v1, Lrc2;->e:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, LPR1$a;->b:Lrc2;

    iget-object p1, p1, Lrc2;->e:Landroid/widget/ImageView;

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    :cond_3
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Lw1;->onAttachedToWindow()V

    iget-object v0, p0, LPR1$a;->c:LPR1;

    invoke-static {v0}, LPR1;->access$getVisibleBrainSwapVH$p(LPR1;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Lw1;->onDetachedFromWindow()V

    iget-object v0, p0, LPR1$a;->c:LPR1;

    invoke-static {v0}, LPR1;->access$getVisibleBrainSwapVH$p(LPR1;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method
