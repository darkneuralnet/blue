.class final Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "VehicleViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Luf2;",
        "b",
        "Luf2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;Landroid/view/View;)V",
        "core-inventory_release"
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
        "SMAP\nCoreInventoryScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanAdapter.kt\nco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n18#2:120\n9#3,4:121\n1#4:125\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanAdapter.kt\nco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder\n*L\n88#1:120\n88#1:121,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Luf2;

.field public final synthetic c:Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;Landroid/view/View;)V
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

    iput-object p1, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;->c:Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Luf2;->a(Landroid/view/View;)Luf2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;->b:Luf2;

    iget-object p1, p1, Luf2;->i:Landroid/widget/ImageView;

    const-string p2, "binding.scan"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, v1, p2, v0}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 9

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;->c:Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;

    invoke-static {v0}, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;->access$getAdapterData(Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;)LE6;

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

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireVehicleInventoryScan;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iget-object v2, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;->b:Luf2;

    iget-object v2, v2, Luf2;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireVehicleInventoryScan;->getItemDisplayTitle()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireVehicleInventoryScan;->getScanIdentifier()Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;->b:Luf2;

    iget-object v2, v2, Luf2;->h:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireVehicleInventoryScan;->getFailureMessage()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireVehicleInventoryScan;->getItemDisplayDetail()Ljava/lang/String;

    move-result-object v3

    :goto_2
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;->b:Luf2;

    iget-object v2, v2, Luf2;->c:Landroidx/constraintlayout/widget/Group;

    const-string v3, "binding.batteryGroup"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireVehicleInventoryScan;->getBattery()Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    move v3, v4

    goto :goto_3

    :cond_3
    move v3, v5

    :goto_3
    const/4 v6, 0x2

    invoke-static {v2, v3, v5, v6, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v2, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;->b:Luf2;

    iget-object v2, v2, Luf2;->b:Lco/bird/android/widget/BatteryViewV2;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireVehicleInventoryScan;->getBattery()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_4

    :cond_4
    move v3, v5

    :goto_4
    int-to-float v3, v3

    const/high16 v7, 0x42c80000    # 100.0f

    div-float/2addr v3, v7

    invoke-virtual {v2, v3}, Lco/bird/android/widget/BatteryViewV2;->setBatteryLevel(F)V

    iget-object v2, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;->b:Luf2;

    iget-object v2, v2, Luf2;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v7, Lnl4;->battery_percent:I

    new-array v8, v4, [Ljava/lang/Object;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireVehicleInventoryScan;->getBattery()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_5

    :cond_5
    move v0, v5

    :goto_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v8, v5

    invoke-virtual {v3, v7, v8}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;->b:Luf2;

    iget-object v0, v0, Luf2;->f:Landroid/widget/ImageView;

    const-string v2, "binding.check"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_6

    goto :goto_6

    :cond_6
    move v4, v5

    :goto_6
    invoke-static {v0, v4, v5, v6, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;->b:Luf2;

    iget-object v1, v0, Luf2;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Luf2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    sget v3, Lrg4;->ic_close:I

    goto :goto_7

    :cond_7
    sget v3, Lrg4;->ic_check:I

    :goto_7
    invoke-static {v0, v3}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;->b:Luf2;

    invoke-virtual {v0}, Luf2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    sget p1, LDf4;->errorRed:I

    goto :goto_8

    :cond_8
    sget p1, LDf4;->primaryText:I

    :goto_8
    invoke-static {v0, p1}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;->b:Luf2;

    iget-object v0, v0, Luf2;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;->b:Luf2;

    iget-object v0, v0, Luf2;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;->b:Luf2;

    iget-object v0, v0, Luf2;->f:Landroid/widget/ImageView;

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    :cond_9
    return-void
.end method
