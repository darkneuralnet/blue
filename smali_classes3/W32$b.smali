.class public final LW32$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW32;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u001c\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u001c\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\tR\u001c\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\tR\u001c\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001b"
    }
    d2 = {
        "LW32$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Landroid/widget/TextView;",
        "kotlin.jvm.PlatformType",
        "b",
        "Landroid/widget/TextView;",
        "code",
        "Lco/bird/android/widget/BatteryView;",
        "c",
        "Lco/bird/android/widget/BatteryView;",
        "battery",
        "d",
        "batteryLevel",
        "e",
        "status",
        "Landroid/widget/ImageView;",
        "f",
        "Landroid/widget/ImageView;",
        "statusIcon",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LW32;Landroid/view/View;)V",
        "workorders_release"
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
        "SMAP\nInspectionV3Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$VehicleInfoViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,180:1\n18#2:181\n9#3,4:182\n*S KotlinDebug\n*F\n+ 1 InspectionV3Adapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Adapter$VehicleInfoViewHolder\n*L\n80#1:181\n80#1:182,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/widget/TextView;

.field public final c:Lco/bird/android/widget/BatteryView;

.field public final d:Landroid/widget/TextView;

.field public final e:Landroid/widget/TextView;

.field public final f:Landroid/widget/ImageView;

.field public final synthetic g:LW32;


# direct methods
.method public constructor <init>(LW32;Landroid/view/View;)V
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

    iput-object p1, p0, LW32$b;->g:LW32;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    sget v0, Lzi4;->code:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, LW32$b;->b:Landroid/widget/TextView;

    sget v0, Lzi4;->battery:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lco/bird/android/widget/BatteryView;

    iput-object v0, p0, LW32$b;->c:Lco/bird/android/widget/BatteryView;

    sget v0, Lzi4;->batteryLevel:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, LW32$b;->d:Landroid/widget/TextView;

    sget v0, Lzi4;->status:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, LW32$b;->e:Landroid/widget/TextView;

    sget v0, Lzi4;->statusIcon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, LW32$b;->f:Landroid/widget/ImageView;

    new-instance v0, LW32$b$a;

    invoke-direct {v0, p1}, LW32$b$a;-><init>(LW32;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 7

    iget-object v0, p0, LW32$b;->g:LW32;

    invoke-static {v0}, LW32;->access$getAdapterData(LW32;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/InspectionFlow;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/InspectionFlow;

    if-eqz p1, :cond_3

    iget-object v0, p0, LW32$b;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/InspectionFlow;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LW32$b;->c:Lco/bird/android/widget/BatteryView;

    invoke-virtual {p1}, Lco/bird/android/model/InspectionFlow;->getBatteryLevel()I

    move-result v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/BatteryView;->setPercent(I)V

    iget-object v0, p0, LW32$b;->d:Landroid/widget/TextView;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lnl4;->battery_percent:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/InspectionFlow;->getBatteryLevel()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LW32$b;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/InspectionFlow;->getMarker()Lco/bird/android/model/wire/WireMapMarker;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireMapMarker;->getLabel()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LW32$b;->f:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/InspectionFlow;->getMarker()Lco/bird/android/model/wire/WireMapMarker;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Lco/bird/android/model/wire/WireMapMarkerKt;->getKind(Lco/bird/android/model/wire/WireMapMarker;)Lco/bird/android/model/constant/MapMarkerKind;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "itemView.context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, LyK2;->b(Lco/bird/android/model/constant/MapMarkerKind;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_2
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    return-void
.end method
