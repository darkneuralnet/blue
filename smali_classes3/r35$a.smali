.class public final Lr35$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr35;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr35$a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0007H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "Lr35$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/model/constant/RideReportIcon;",
        "Landroid/content/Context;",
        "context",
        "Landroid/graphics/drawable/Drawable;",
        "a",
        "Lqf2;",
        "b",
        "Lqf2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lr35;Landroid/view/View;)V",
        "ride-end-summary_release"
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
        "SMAP\nRideReportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideReportAdapter.kt\nco/bird/android/feature/rideendsummary/ridereport/adapters/RideReportAdapter$ReportItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n18#2:114\n9#3,4:115\n1#4:119\n*S KotlinDebug\n*F\n+ 1 RideReportAdapter.kt\nco/bird/android/feature/rideendsummary/ridereport/adapters/RideReportAdapter$ReportItemViewHolder\n*L\n81#1:114\n81#1:115,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lqf2;

.field public final synthetic c:Lr35;


# direct methods
.method public constructor <init>(Lr35;Landroid/view/View;)V
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

    iput-object p1, p0, Lr35$a;->c:Lr35;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lqf2;->a(Landroid/view/View;)Lqf2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lr35$a;->b:Lqf2;

    invoke-virtual {p2}, Lqf2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr35$a$a;

    invoke-direct {v0, p0, p1}, Lr35$a$a;-><init>(Lr35$a;Lr35;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/constant/RideReportIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 1

    sget-object v0, Lr35$a$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget p1, Lrg4;->ic_issue_triangle:I

    goto :goto_0

    :cond_1
    sget p1, Lrg4;->ic_check:I

    :goto_0
    invoke-static {p2, p1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public bind(I)V
    .locals 7

    iget-object v0, p0, Lr35$a;->c:Lr35;

    invoke-static {v0}, Lr35;->access$getAdapterData(Lr35;)LE6;

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

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireRideReportItem;

    iget-object v2, p0, Lr35$a;->b:Lqf2;

    iget-object v2, v2, Lqf2;->f:Landroid/widget/TextView;

    const/4 v3, 0x1

    add-int/2addr v0, v3

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lr35$a;->b:Lqf2;

    iget-object v0, v0, Lqf2;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideReportItem;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lr35$a;->b:Lqf2;

    iget-object v0, v0, Lqf2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideReportItem;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideReportItem;->getStatus()Lco/bird/android/model/constant/RideReportStatus;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/constant/RideReportStatus;->PENDING:Lco/bird/android/model/constant/RideReportStatus;

    const/4 v6, 0x0

    if-eq v4, v5, :cond_1

    move v4, v3

    goto :goto_1

    :cond_1
    move v4, v6

    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v4, Lnl4;->ride_report_rule_pending_status_text:I

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lr35$a;->b:Lqf2;

    iget-object v0, v0, Lqf2;->d:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideReportItem;->getIconName()Lco/bird/android/model/constant/RideReportIcon;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {p0, v2, v4}, Lr35$a;->a(Lco/bird/android/model/constant/RideReportIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_4

    :cond_4
    move-object v2, v1

    :goto_4
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lr35$a;->b:Lqf2;

    iget-object v0, v0, Lqf2;->d:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideReportItem;->getIconColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireThemedColors;->getLightMode()I

    move-result v2

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    goto :goto_5

    :cond_5
    move-object v2, v1

    :goto_5
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lr35$a;->b:Lqf2;

    iget-object v0, v0, Lqf2;->e:Lcom/google/android/material/imageview/ShapeableImageView;

    const-string v2, "binding.image"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideReportItem;->getImageAsset()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object v2

    if-eqz v2, :cond_6

    goto :goto_6

    :cond_6
    move v3, v6

    :goto_6
    const/4 v2, 0x2

    invoke-static {v0, v3, v6, v2, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideReportItem;->getImageAsset()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object v0, p0, Lr35$a;->b:Lqf2;

    invoke-virtual {v0}, Lqf2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/a;->u(Landroid/view/View;)LUI4;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireLegacyAsset;->getMedia()Lco/bird/android/model/wire/WireAssetMedia;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object p1

    iget-object v0, p0, Lr35$a;->b:Lqf2;

    iget-object v0, v0, Lqf2;->e:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-virtual {p1, v0}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    :cond_7
    return-void
.end method
