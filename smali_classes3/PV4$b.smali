.class public final LPV4$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPV4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\r\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "LPV4$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "",
        "show",
        "b",
        "Landroid/view/View;",
        "Landroid/view/View;",
        "getView",
        "()Landroid/view/View;",
        "view",
        "Ltt6;",
        "c",
        "Ltt6;",
        "binding",
        "Lco/bird/android/model/persistence/RidePassView;",
        "d",
        "Lco/bird/android/model/persistence/RidePassView;",
        "pass",
        "<init>",
        "(LPV4;Landroid/view/View;)V",
        "ride-pass_release"
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
        "SMAP\nRidePassV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter$PassViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n18#2:179\n9#3,4:180\n766#4:184\n857#4,2:185\n1#5:187\n*S KotlinDebug\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter$PassViewHolder\n*L\n121#1:179\n121#1:180,4\n154#1:184\n154#1:185,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/view/View;

.field public final c:Ltt6;

.field public d:Lco/bird/android/model/persistence/RidePassView;

.field public final synthetic e:LPV4;


# direct methods
.method public constructor <init>(LPV4;Landroid/view/View;)V
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

    iput-object p1, p0, LPV4$b;->e:LPV4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    iput-object p2, p0, LPV4$b;->b:Landroid/view/View;

    invoke-static {p2}, Ltt6;->a(Landroid/view/View;)Ltt6;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LPV4$b;->c:Ltt6;

    iget-object v0, p2, Ltt6;->j:Landroid/widget/Button;

    const-string v1, "binding.passBuy"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LPV4$b$a;

    invoke-direct {v1, p0, p1}, LPV4$b$a;-><init>(LPV4$b;LPV4;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p2, Ltt6;->o:Landroid/widget/Button;

    const-string v1, "binding.transferButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LPV4$b$b;

    invoke-direct {v1, p0, p1}, LPV4$b$b;-><init>(LPV4$b;LPV4;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p2, Ltt6;->b:Landroid/widget/Button;

    const-string v1, "binding.cancelButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LPV4$b$c;

    invoke-direct {v1, p0, p1}, LPV4$b$c;-><init>(LPV4$b;LPV4;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p2, Ltt6;->i:Landroid/widget/TextView;

    const-string v0, "binding.passBody"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPV4$b$d;

    invoke-direct {v0, p0}, LPV4$b$d;-><init>(LPV4$b;)V

    invoke-static {p1, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p2, Ltt6;->g:Landroid/widget/ImageView;

    const-string v0, "binding.hide"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPV4$b$e;

    invoke-direct {v0, p0}, LPV4$b$e;-><init>(LPV4$b;)V

    invoke-static {p1, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p2, Ltt6;->f:Landroid/widget/ImageView;

    const-string p2, "binding.expand"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LPV4$b$f;

    invoke-direct {p2, p0}, LPV4$b$f;-><init>(LPV4$b;)V

    invoke-static {p1, p2}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(LPV4$b;)Lco/bird/android/model/persistence/RidePassView;
    .locals 0

    iget-object p0, p0, LPV4$b;->d:Lco/bird/android/model/persistence/RidePassView;

    return-object p0
.end method


# virtual methods
.method public final b(Z)V
    .locals 5

    iget-object v0, p0, LPV4$b;->c:Ltt6;

    iget-object v0, v0, Ltt6;->d:Lco/bird/android/feature/ridepass/v2/list/adapter/view/RidePassV2DetailsView;

    const-string v1, "binding.details"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LPV4$b;->c:Ltt6;

    iget-object v0, v0, Ltt6;->g:Landroid/widget/ImageView;

    const-string v4, "binding.hide"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1, v1, v2, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LPV4$b;->c:Ltt6;

    iget-object v0, v0, Ltt6;->f:Landroid/widget/ImageView;

    const-string v4, "binding.expand"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/lit8 p1, p1, 0x1

    invoke-static {v0, p1, v1, v2, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public bind(I)V
    .locals 12

    iget-object v0, p0, LPV4$b;->e:LPV4;

    invoke-static {v0}, LPV4;->access$getAdapterData(LPV4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object v0

    invoke-virtual {v0}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lco/bird/android/model/persistence/RidePassView;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    check-cast v0, Lco/bird/android/model/persistence/RidePassView;

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getExpiresAt()Lorg/joda/time/DateTime;

    move-result-object v3

    iput-object v0, p0, LPV4$b;->d:Lco/bird/android/model/persistence/RidePassView;

    iget-object v4, p0, LPV4$b;->c:Ltt6;

    iget-object v4, v4, Ltt6;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, LPV4$b;->c:Ltt6;

    iget-object v4, v4, Ltt6;->m:Landroid/widget/TextView;

    sget-object v5, Lxx1;->a:Lxx1;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getPrice()J

    move-result-wide v6

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getCurrency()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v8

    sget-object v9, LUx1;->d:LUx1;

    invoke-virtual {v5, v6, v7, v8, v9}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, LPV4$b;->c:Ltt6;

    iget-object v4, v4, Ltt6;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getDetailBody()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, LPV4$b;->c:Ltt6;

    iget-object v4, v4, Ltt6;->j:Landroid/widget/Button;

    const-string v6, "binding.passBuy"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->isAvailable()Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x2

    invoke-static {v4, v6, v7, v8, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getPreviousPrice()Ljava/lang/Long;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    iget-object v4, p0, LPV4$b;->c:Ltt6;

    iget-object v4, v4, Ltt6;->l:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getCurrency()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v6

    invoke-virtual {v5, v10, v11, v6, v9}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, LPV4$b;->c:Ltt6;

    iget-object v4, v4, Ltt6;->l:Landroid/widget/TextView;

    const-string v6, "binding.previousPrice"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ltu6;->r(Landroid/view/View;)V

    :cond_2
    const-string v4, "binding.validityPeriod"

    if-eqz v1, :cond_3

    if-eqz v3, :cond_3

    iget-object v6, p0, LPV4$b;->c:Ltt6;

    iget-object v6, v6, Ltt6;->r:Landroid/widget/TextView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v5, v9, v1, v3, v7}, Lxx1;->g(Landroid/content/Context;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, LPV4$b;->c:Ltt6;

    iget-object v1, v1, Ltt6;->r:Landroid/widget/TextView;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ltu6;->r(Landroid/view/View;)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, LPV4$b;->c:Ltt6;

    iget-object v1, v1, Ltt6;->r:Landroid/widget/TextView;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ltu6;->l(Landroid/view/View;)V

    :goto_1
    iget-object v1, p0, LPV4$b;->c:Ltt6;

    iget-object v1, v1, Ltt6;->h:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->isActive()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v5, Lnl4;->active_uppercased:I

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->isIneligible()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v5, Lnl4;->inactive:I

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getLabel()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/2addr v3, v4

    if-ne v3, v4, :cond_6

    move v3, v4

    goto :goto_2

    :cond_6
    move v3, v7

    :goto_2
    if-eqz v3, :cond_7

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getLabel()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_7
    move-object v3, v2

    :goto_3
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, LPV4$b;->c:Ltt6;

    iget-object v1, v1, Ltt6;->h:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->isIneligible()Z

    move-result v3

    const-string v5, "view.context"

    if-eqz v3, :cond_8

    iget-object v3, p0, LPV4$b;->b:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v5, LDf4;->secondaryBG:I

    invoke-static {v3, v5}, LfB0;->f(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    goto :goto_4

    :cond_8
    iget-object v3, p0, LPV4$b;->b:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v5, LDf4;->tertiaryBG:I

    invoke-static {v3, v5}, LfB0;->f(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    :goto_4
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v1, p0, LPV4$b;->c:Ltt6;

    iget-object v1, v1, Ltt6;->h:Landroid/widget/TextView;

    const-string v3, "binding.label"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, LPV4$b;->c:Ltt6;

    iget-object v3, v3, Ltt6;->h:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    const-string v5, "binding.label.text"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/2addr v3, v4

    invoke-static {v1, v3, v7, v8, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getDetailBodyList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_a

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v6

    xor-int/2addr v6, v4

    if-eqz v6, :cond_9

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    move-object v3, v2

    :cond_b
    if-eqz v3, :cond_d

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    move v1, v7

    goto :goto_7

    :cond_d
    :goto_6
    move v1, v4

    :goto_7
    if-nez v1, :cond_11

    iget-object v1, p0, LPV4$b;->c:Ltt6;

    iget-object v1, v1, Ltt6;->d:Lco/bird/android/feature/ridepass/v2/list/adapter/view/RidePassV2DetailsView;

    invoke-virtual {v1, v3}, Lco/bird/android/feature/ridepass/v2/list/adapter/view/RidePassV2DetailsView;->setDetails(Ljava/util/List;)V

    iget-object v1, p0, LPV4$b;->e:LPV4;

    invoke-virtual {v1}, LPV4;->w()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_e

    goto :goto_8

    :cond_e
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq p1, v1, :cond_10

    :goto_8
    iget-object p1, p0, LPV4$b;->d:Lco/bird/android/model/persistence/RidePassView;

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->isActive()Z

    move-result p1

    if-ne p1, v4, :cond_f

    move p1, v4

    goto :goto_9

    :cond_f
    move p1, v7

    :goto_9
    if-eqz p1, :cond_12

    :cond_10
    invoke-virtual {p0, v4}, LPV4$b;->b(Z)V

    goto :goto_a

    :cond_11
    iget-object p1, p0, LPV4$b;->c:Ltt6;

    iget-object p1, p1, Ltt6;->d:Lco/bird/android/feature/ridepass/v2/list/adapter/view/RidePassV2DetailsView;

    const-string v1, "binding.details"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v7, v7, v8, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p1, p0, LPV4$b;->c:Ltt6;

    iget-object p1, p1, Ltt6;->g:Landroid/widget/ImageView;

    const-string v1, "binding.hide"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v7, v7, v8, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p1, p0, LPV4$b;->c:Ltt6;

    iget-object p1, p1, Ltt6;->f:Landroid/widget/ImageView;

    const-string v1, "binding.expand"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v7, v7, v8, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_12
    :goto_a
    iget-object p1, p0, LPV4$b;->c:Ltt6;

    iget-object p1, p1, Ltt6;->q:Landroidx/constraintlayout/widget/Group;

    const-string v1, "binding.transferGroup"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getNeedsDeviceTransfer()Z

    move-result v1

    invoke-static {p1, v1, v7, v8, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p1, p0, LPV4$b;->c:Ltt6;

    iget-object p1, p1, Ltt6;->b:Landroid/widget/Button;

    const-string v1, "binding.cancelButton"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->isPurchased()Z

    move-result v1

    if-eqz v1, :cond_13

    goto :goto_b

    :cond_13
    move-object v0, v2

    :goto_b
    if-eqz v0, :cond_14

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getCancelArticleId()Ljava/lang/String;

    move-result-object v0

    goto :goto_c

    :cond_14
    move-object v0, v2

    :goto_c
    if-eqz v0, :cond_15

    goto :goto_d

    :cond_15
    move v4, v7

    :goto_d
    invoke-static {p1, v4, v7, v8, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method
