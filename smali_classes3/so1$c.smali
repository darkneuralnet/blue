.class public final Lso1$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lso1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lso1$c$b;,
        Lso1$c$c;,
        Lso1$c$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0082\u0004\u0018\u00002\u00020\u0001:\u0003\u0007\u000e\u000fB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0010"
    }
    d2 = {
        "Lso1$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LNb2;",
        "b",
        "LNb2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lso1;Landroid/view/View;)V",
        "c",
        "d",
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
        "SMAP\nFleetListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListAdapter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,218:1\n18#2:219\n9#3,4:220\n*S KotlinDebug\n*F\n+ 1 FleetListAdapter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$VehicleViewHolder\n*L\n140#1:219\n140#1:220,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LNb2;

.field public final synthetic c:Lso1;


# direct methods
.method public constructor <init>(Lso1;Landroid/view/View;)V
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

    iput-object p1, p0, Lso1$c;->c:Lso1;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LNb2;->a(Landroid/view/View;)LNb2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lso1$c;->b:LNb2;

    invoke-virtual {p2}, LNb2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lso1$c$a;

    invoke-direct {v0, p1, p0}, Lso1$c$a;-><init>(Lso1;Lso1$c;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 9

    iget-object v0, p0, Lso1$c;->c:Lso1;

    invoke-static {v0}, Lso1;->access$getAdapterData(Lso1;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/FleetListVehicle;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/FleetListVehicle;

    if-eqz p1, :cond_8

    iget-object v0, p0, Lso1$c;->b:LNb2;

    iget-object v0, v0, LNb2;->h:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lso1$c;->b:LNb2;

    iget-object v0, v0, LNb2;->b:Landroid/widget/TextView;

    const-string v2, "binding.caption"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getCaption()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    const/4 v5, 0x2

    invoke-static {v0, v2, v4, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lso1$c;->b:LNb2;

    iget-object v0, v0, LNb2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getCaption()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lso1$c;->b:LNb2;

    iget-object v0, v0, LNb2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getCaptionColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lso1$c;->b:LNb2;

    iget-object v0, v0, LNb2;->c:Landroid/widget/TextView;

    const-string v2, "binding.caption2"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getCaption2()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    move v2, v4

    :goto_2
    invoke-static {v0, v2, v4, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lso1$c;->b:LNb2;

    iget-object v0, v0, LNb2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getCaption2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lso1$c;->b:LNb2;

    iget-object v0, v0, LNb2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getCaption2Color()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lso1$c;->b:LNb2;

    iget-object v0, v0, LNb2;->f:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v2

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const-string v7, "itemView.context"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v6}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lso1$c;->b:LNb2;

    iget-object v0, v0, LNb2;->f:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v2

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lso1$c;->b:LNb2;

    iget-object v0, v0, LNb2;->g:Landroid/widget/TextView;

    const-string v2, "binding.notification"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getNotification()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    move v2, v4

    :goto_3
    invoke-static {v0, v2, v4, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lso1$c;->b:LNb2;

    iget-object v0, v0, LNb2;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getNotification()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lso1$c;->b:LNb2;

    invoke-virtual {v0}, LNb2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v6, LDf4;->baseBG:I

    invoke-static {v2, v6}, LNA0;->c(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lso1$c;->b:LNb2;

    iget-object v0, v0, LNb2;->e:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getComplication()Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Luo1;->a(Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;)I

    move-result v6

    iget-object v7, p0, Lso1$c;->b:LNb2;

    iget-object v7, v7, LNb2;->e:Landroid/widget/FrameLayout;

    const-string v8, "binding.complication"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v6, v7, v4}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    iget-object v6, p0, Lso1$c;->b:LNb2;

    iget-object v6, v6, LNb2;->e:Landroid/widget/FrameLayout;

    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    instance-of v6, v0, Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$BatteryComplication;

    if-eqz v6, :cond_4

    new-instance v6, Lso1$c$b;

    invoke-direct {v6, p0, v2}, Lso1$c$b;-><init>(Lso1$c;Landroid/view/View;)V

    check-cast v0, Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$BatteryComplication;

    invoke-virtual {v6, v0}, Lso1$c$b;->a(Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$BatteryComplication;)V

    goto :goto_4

    :cond_4
    instance-of v6, v0, Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$IconComplication;

    if-eqz v6, :cond_5

    new-instance v6, Lso1$c$d;

    invoke-direct {v6, p0, v2}, Lso1$c$d;-><init>(Lso1$c;Landroid/view/View;)V

    check-cast v0, Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$IconComplication;

    invoke-virtual {v6, v0}, Lso1$c$d;->a(Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$IconComplication;)V

    :cond_5
    :goto_4
    iget-object v0, p0, Lso1$c;->b:LNb2;

    iget-object v0, v0, LNb2;->d:Landroid/widget/ImageView;

    const-string v2, "binding.chevron"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getAction()Lco/bird/android/model/persistence/nestedstructures/FleetListAction;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetListVehicle;->getAction()Lco/bird/android/model/persistence/nestedstructures/FleetListAction;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetListAction;->getKind()Lco/bird/android/model/constant/FleetListActionKind;

    move-result-object p1

    goto :goto_5

    :cond_6
    move-object p1, v1

    :goto_5
    sget-object v2, Lco/bird/android/model/constant/FleetListActionKind;->UNKNOWN:Lco/bird/android/model/constant/FleetListActionKind;

    if-eq p1, v2, :cond_7

    goto :goto_6

    :cond_7
    move v3, v4

    :goto_6
    invoke-static {v0, v3, v4, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_8
    return-void
.end method
