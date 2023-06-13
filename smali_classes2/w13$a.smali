.class public final Lw13$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw13;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lw13$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Landroid/view/View;",
        "b",
        "Landroid/view/View;",
        "getView",
        "()Landroid/view/View;",
        "view",
        "<init>",
        "(Lw13;Landroid/view/View;)V",
        "app_birdRelease"
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
        "SMAP\nNearbyBirdsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdsAdapter.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsAdapter$NearbyBirdViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,159:1\n18#2:160\n9#3,4:161\n*S KotlinDebug\n*F\n+ 1 NearbyBirdsAdapter.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsAdapter$NearbyBirdViewHolder\n*L\n124#1:160\n124#1:161,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/view/View;

.field public final synthetic c:Lw13;


# direct methods
.method public constructor <init>(Lw13;Landroid/view/View;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lw13$a;->c:Lw13;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lw13$a;->b:Landroid/view/View;

    sget v0, LVg4;->optionsButton:I

    invoke-static {p2, v0}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    sget v1, LVg4;->addButton:I

    invoke-static {p2, v1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    invoke-virtual {p1}, Lw13;->u()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v0, v2, v3, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    new-instance v2, Lw13$a$a;

    invoke-direct {v2, p0, p1}, Lw13$a$a;-><init>(Lw13$a;Lw13;)V

    invoke-static {v0, v2}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1}, Lw13;->q()Z

    move-result v0

    invoke-static {v1, v0, v3, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    new-instance v0, Lw13$a$b;

    invoke-direct {v0, p0, p1}, Lw13$a$b;-><init>(Lw13$a;Lw13;)V

    invoke-static {v1, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    sget v0, LVg4;->serialNumber:I

    invoke-static {p2, v0}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Lw13;->t()Z

    move-result v1

    invoke-static {v0, v1, v3, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    sget v0, LVg4;->serialNumberLabel:I

    invoke-static {p2, v0}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Lw13;->t()Z

    move-result v1

    invoke-static {v0, v1, v3, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    sget v0, LVg4;->signalStrengthNumber:I

    invoke-static {p2, v0}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Lw13;->t()Z

    move-result v1

    invoke-static {v0, v1, v3, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    sget v0, LVg4;->serviceCenterLabel:I

    invoke-static {p2, v0}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Lw13;->v()Z

    move-result v1

    invoke-static {v0, v1, v3, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    sget v0, LVg4;->serviceCenterStatus:I

    invoke-static {p2, v0}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Lw13;->v()Z

    move-result v1

    invoke-static {v0, v1, v3, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    sget v0, LVg4;->birdModelLabel:I

    invoke-static {p2, v0}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Lw13;->r()Z

    move-result v1

    invoke-static {v0, v1, v3, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    sget v0, LVg4;->birdModel:I

    invoke-static {p2, v0}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1}, Lw13;->r()Z

    move-result p1

    invoke-static {p2, p1, v3, v4, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lw13$a;->c:Lw13;

    invoke-static {v1}, Lw13;->access$getAdapterData$p(Lw13;)LE6;

    move-result-object v1

    invoke-virtual {v1}, LE6;->h()Ljava/util/List;

    move-result-object v1

    move/from16 v2, p1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LG6;

    invoke-virtual {v1}, LG6;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lco/bird/android/model/NearbyBirdViewModel;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lco/bird/android/model/NearbyBirdViewModel;

    if-nez v1, :cond_1

    return-void

    :cond_1
    iget-object v2, v0, Lw13$a;->b:Landroid/view/View;

    sget v4, LVg4;->codeLabel:I

    invoke-static {v2, v4}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v4, v0, Lw13$a;->b:Landroid/view/View;

    sget v5, LVg4;->code:I

    invoke-static {v4, v5}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iget-object v5, v0, Lw13$a;->b:Landroid/view/View;

    sget v6, LVg4;->birdModel:I

    invoke-static {v5, v6}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iget-object v6, v0, Lw13$a;->b:Landroid/view/View;

    sget v7, LVg4;->serialNumberLabel:I

    invoke-static {v6, v7}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iget-object v7, v0, Lw13$a;->b:Landroid/view/View;

    sget v8, LVg4;->serialNumber:I

    invoke-static {v7, v8}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iget-object v8, v0, Lw13$a;->b:Landroid/view/View;

    sget v9, LVg4;->batteryLabel:I

    invoke-static {v8, v9}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iget-object v9, v0, Lw13$a;->b:Landroid/view/View;

    sget v10, LVg4;->battery:I

    invoke-static {v9, v10}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    iget-object v10, v0, Lw13$a;->b:Landroid/view/View;

    sget v11, LVg4;->beaconHashLabel:I

    invoke-static {v10, v11}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    iget-object v11, v0, Lw13$a;->b:Landroid/view/View;

    sget v12, LVg4;->beaconHash:I

    invoke-static {v11, v12}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    iget-object v12, v0, Lw13$a;->b:Landroid/view/View;

    sget v13, LVg4;->signalStrengthNumber:I

    invoke-static {v12, v13}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/TextView;

    iget-object v13, v0, Lw13$a;->b:Landroid/view/View;

    sget v14, LVg4;->signalStrength:I

    invoke-static {v13, v14}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/ImageView;

    iget-object v14, v0, Lw13$a;->b:Landroid/view/View;

    sget v15, LVg4;->serviceCenterStatus:I

    invoke-static {v14, v15}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/TextView;

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->isIBeacon()Z

    move-result v15

    if-eqz v15, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->getShouldShowIBeaconLabel()Z

    move-result v15

    if-eqz v15, :cond_2

    const-string v15, "[iBeacon] "

    goto :goto_1

    :cond_2
    const-string v15, ""

    :goto_1
    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->getVehicle()Lco/bird/android/model/Vehicle;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v16, v14

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->getCodeLabelText()I

    move-result v14

    invoke-virtual {v2, v14}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->getVehicle()Lco/bird/android/model/Vehicle;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->isIBeacon()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    const/16 v4, 0x8

    invoke-static {v6, v2, v4}, Ltu6;->s(Landroid/view/View;ZI)V

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->isIBeacon()Z

    move-result v2

    xor-int/2addr v2, v3

    invoke-static {v7, v2, v4}, Ltu6;->s(Landroid/view/View;ZI)V

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->getVehicle()Lco/bird/android/model/Vehicle;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->isIBeacon()Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->getShouldShowIBeaconLabel()Z

    move-result v2

    if-eqz v2, :cond_3

    move v2, v3

    goto :goto_2

    :cond_3
    move v2, v5

    :goto_2
    invoke-static {v10, v2, v4}, Ltu6;->s(Landroid/view/View;ZI)V

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->isIBeacon()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->getShouldShowIBeaconLabel()Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v3

    goto :goto_3

    :cond_4
    move v2, v5

    :goto_3
    invoke-static {v11, v2, v4}, Ltu6;->s(Landroid/view/View;ZI)V

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->getVehicle()Lco/bird/android/model/Vehicle;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/Vehicle;->getBeaconHash()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->getVehicle()Lco/bird/android/model/Vehicle;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getBatteryLevel()I

    move-result v2

    if-ltz v2, :cond_5

    const/16 v6, 0x65

    if-ge v2, v6, :cond_5

    move v2, v3

    goto :goto_4

    :cond_5
    move v2, v5

    :goto_4
    if-eqz v2, :cond_6

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->isIBeacon()Z

    move-result v2

    if-nez v2, :cond_6

    move v5, v3

    :cond_6
    invoke-static {v8, v5, v4}, Ltu6;->s(Landroid/view/View;ZI)V

    invoke-static {v9, v5, v4}, Ltu6;->s(Landroid/view/View;ZI)V

    sget-object v2, Lxx1;->a:Lxx1;

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "itemView.context"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->getVehicle()Lco/bird/android/model/Vehicle;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getBatteryLevel()I

    move-result v5

    invoke-virtual {v2, v4, v5, v3}, Lxx1;->a(Landroid/content/Context;IZ)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->getVehicle()Lco/bird/android/model/Vehicle;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/Vehicle;->getRssi()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->getVehicle()Lco/bird/android/model/Vehicle;

    move-result-object v2

    invoke-static {v2}, Ly13;->a(Lco/bird/android/model/Vehicle;)LJA5;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, LJA5;->b()I

    move-result v2

    goto :goto_5

    :cond_7
    sget v2, Lrg4;->ic_ui_signal_one:I

    :goto_5
    invoke-virtual {v13, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v1}, Lco/bird/android/model/NearbyBirdViewModel;->getServiceCenterStatus()Lco/bird/android/model/wire/WireServiceCenterStatus;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireServiceCenterStatus;->getDisplayName()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v14, v16

    goto :goto_6

    :cond_8
    move-object/from16 v14, v16

    const/4 v3, 0x0

    :goto_6
    invoke-virtual {v14, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
