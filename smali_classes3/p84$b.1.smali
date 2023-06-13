.class public final Lp84$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp84;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp84$b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0007H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001b"
    }
    d2 = {
        "Lp84$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/model/constant/CouponDisplayIcon;",
        "Landroid/content/Context;",
        "context",
        "Landroid/graphics/drawable/Drawable;",
        "e",
        "LLe2;",
        "b",
        "LLe2;",
        "binding",
        "",
        "c",
        "Ljava/lang/String;",
        "couponId",
        "Landroid/view/View$OnClickListener;",
        "d",
        "Landroid/view/View$OnClickListener;",
        "activateListener",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lp84;Landroid/view/View;)V",
        "promotions_release"
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
        "SMAP\nPromotionsCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromotionsCenterAdapter.kt\nco/bird/android/feature/promotions/PromotionsCenterAdapter$CouponViewHolder\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n9#2,4:193\n1#3:197\n*S KotlinDebug\n*F\n+ 1 PromotionsCenterAdapter.kt\nco/bird/android/feature/promotions/PromotionsCenterAdapter$CouponViewHolder\n*L\n119#1:193,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LLe2;

.field public c:Ljava/lang/String;

.field public final d:Landroid/view/View$OnClickListener;

.field public final synthetic e:Lp84;


# direct methods
.method public constructor <init>(Lp84;Landroid/view/View;)V
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

    iput-object p1, p0, Lp84$b;->e:Lp84;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LLe2;->a(Landroid/view/View;)LLe2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lp84$b;->b:LLe2;

    new-instance v0, Lq84;

    invoke-direct {v0, p0, p1}, Lq84;-><init>(Lp84$b;Lp84;)V

    iput-object v0, p0, Lp84$b;->d:Landroid/view/View$OnClickListener;

    iget-object p1, p2, LLe2;->b:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic a(Lp84$b;Lp84;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lp84$b;->b(Lp84$b;Lp84;Landroid/view/View;)V

    return-void
.end method

.method public static final b(Lp84$b;Lp84;Landroid/view/View;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$1"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lp84$b;->c:Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-static {p1}, Lp84;->access$getMutableActivateClicks$p(Lp84;)Lma4;

    move-result-object p1

    invoke-virtual {p1, p0}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 6

    iget-object v0, p0, Lp84$b;->e:Lp84;

    invoke-static {v0}, Lp84;->access$getAdapterData(Lp84;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/wire/WireCouponDisplayView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/wire/WireCouponDisplayView;

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/wire/WireCouponDisplayView;->getCouponId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lp84$b;->c:Ljava/lang/String;

    iget-object v0, p0, Lp84$b;->b:LLe2;

    iget-object v0, v0, LLe2;->f:Lco/bird/android/widget/RibbonTextView;

    const-string v2, "binding.ribbonTag"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireCouponDisplayView;->getFlagText()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->setTextAndVisibility$default(Landroid/widget/TextView;Ljava/lang/CharSequence;IILjava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireCouponDisplayView;->getIcon()Lco/bird/android/model/constant/CouponDisplayIcon;

    move-result-object v0

    sget-object v2, Lco/bird/android/model/constant/CouponDisplayIcon;->NONE:Lco/bird/android/model/constant/CouponDisplayIcon;

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Lp84$b;->b:LLe2;

    iget-object v0, v0, LLe2;->e:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lp84$b;->b:LLe2;

    iget-object v0, v0, LLe2;->e:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireCouponDisplayView;->getIcon()Lco/bird/android/model/constant/CouponDisplayIcon;

    move-result-object v2

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {p0, v2, v5}, Lp84$b;->e(Lco/bird/android/model/constant/CouponDisplayIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lp84$b;->b:LLe2;

    iget-object v0, v0, LLe2;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_1
    iget-object v0, p0, Lp84$b;->b:LLe2;

    iget-object v0, v0, LLe2;->g:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireCouponDisplayView;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lp84$b;->b:LLe2;

    iget-object v0, v0, LLe2;->c:Landroidx/appcompat/widget/AppCompatTextView;

    const-string v2, "binding.description"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireCouponDisplayView;->getBody()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->setTextAndVisibility$default(Landroid/widget/TextView;Ljava/lang/CharSequence;IILjava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireCouponDisplayView;->getExpiresAt()Lorg/joda/time/DateTime;

    move-result-object p1

    if-eqz p1, :cond_6

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/joda/time/DateTime;->minusHours(I)Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v1}, Lorg/joda/time/DateTime;->toLocalDate()Lorg/joda/time/LocalDate;

    move-result-object v1

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-static {v2, p1}, Lorg/joda/time/Days;->daysBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Days;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/Days;->getDays()I

    move-result v2

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lnl4;->promo_center_coupon_expires_today_at_time:I

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v4, Lxx1;->a:Lxx1;

    invoke-virtual {v4, p1}, Lxx1;->t(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v3

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_3
    if-gt v0, v2, :cond_4

    const/4 p1, 0x7

    if-ge v2, p1, :cond_4

    move p1, v0

    goto :goto_2

    :cond_4
    move p1, v3

    :goto_2
    if-eqz p1, :cond_5

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/DateTime;->toLocalDate()Lorg/joda/time/LocalDate;

    move-result-object p1

    invoke-static {p1, v1}, Lorg/joda/time/Days;->daysBetween(Lorg/joda/time/ReadablePartial;Lorg/joda/time/ReadablePartial;)Lorg/joda/time/Days;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/Days;->getDays()I

    move-result p1

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LXk4;->promo_center_coupon_expires_in_number_of_days:I

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v0, v3

    invoke-virtual {v1, v2, p1, v0}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v2, Lnl4;->promo_center_coupon_expires_on_date:I

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v4, Lxx1;->a:Lxx1;

    const-string v5, "expiresAtLocalDate"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Lxx1;->r(Lorg/joda/time/LocalDate;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v3

    invoke-virtual {p1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_3
    if-nez p1, :cond_7

    :cond_6
    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lnl4;->promo_center_coupon_no_expiration:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :cond_7
    const-string v0, "couponView.expiresAt?.le\u2026on_no_expiration)\n      }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lp84$b;->b:LLe2;

    iget-object v0, v0, LLe2;->d:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lp84$b;->b:LLe2;

    iget-object p1, p1, LLe2;->b:Landroidx/appcompat/widget/AppCompatTextView;

    const-string v0, "binding.activateButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    return-void
.end method

.method public final e(Lco/bird/android/model/constant/CouponDisplayIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 1

    sget-object v0, Lp84$b$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 p2, 0x3

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget p1, Lrg4;->ic_pricing:I

    invoke-static {p2, p1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_2
    sget p1, Lrg4;->ic_gift_icon:I

    invoke-static {p2, p1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    :goto_0
    return-object p1
.end method
