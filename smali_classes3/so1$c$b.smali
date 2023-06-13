.class public final Lso1$c$b;
.super Lso1$c$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lso1$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lso1$c$c<",
        "Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$BatteryComplication;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u00020\u0001R\u00060\u0003R\u00020\u0004B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\u0010"
    }
    d2 = {
        "Lso1$c$b;",
        "Lso1$c$c;",
        "Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$BatteryComplication;",
        "Lso1$c;",
        "Lso1;",
        "complication",
        "",
        "a",
        "LAs0;",
        "b",
        "LAs0;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lso1$c;Landroid/view/View;)V",
        "co.bird.android.feature.fleet-status"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LAs0;

.field public final synthetic c:Lso1$c;


# direct methods
.method public constructor <init>(Lso1$c;Landroid/view/View;)V
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

    iput-object p1, p0, Lso1$c$b;->c:Lso1$c;

    invoke-direct {p0, p1}, Lso1$c$c;-><init>(Lso1$c;)V

    invoke-static {p2}, LAs0;->a(Landroid/view/View;)LAs0;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lso1$c$b;->b:LAs0;

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$BatteryComplication;)V
    .locals 5

    const-string v0, "complication"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lso1$c$b;->b:LAs0;

    iget-object v0, v0, LAs0;->b:Lco/bird/android/widget/BatteryViewV2;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$BatteryComplication;->getBattery()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lco/bird/android/widget/BatteryViewV2;->setBatteryLevel(F)V

    iget-object v0, p0, Lso1$c$b;->b:LAs0;

    iget-object v0, v0, LAs0;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lso1$c$b;->c:Lso1$c;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lnl4;->battery_percent:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$BatteryComplication;->getBattery()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
