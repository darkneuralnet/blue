.class public final LRk6$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRk6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LRk6$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/feature/commandcenter/vehicledetails/views/PastWorkOrderView;",
        "b",
        "Lco/bird/android/feature/commandcenter/vehicledetails/views/PastWorkOrderView;",
        "pastWorkOrderView",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LRk6;Landroid/view/View;)V",
        "co.bird.android.feature.commandcenter"
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
        "SMAP\nVehicleDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter$PastWorkOrderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,128:1\n18#2:129\n9#3,4:130\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsAdapter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapter$PastWorkOrderViewHolder\n*L\n122#1:129\n122#1:130,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/feature/commandcenter/vehicledetails/views/PastWorkOrderView;

.field public final synthetic c:LRk6;


# direct methods
.method public constructor <init>(LRk6;Landroid/view/View;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LRk6$a;->c:LRk6;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Lco/bird/android/feature/commandcenter/vehicledetails/views/PastWorkOrderView;

    iput-object p2, p0, LRk6$a;->b:Lco/bird/android/feature/commandcenter/vehicledetails/views/PastWorkOrderView;

    new-instance v0, LVS5;

    sget v1, LUi4;->item_command_center_past_work_order_issue_item:I

    const-string v2, "\u2022"

    invoke-direct {v0, v1, v2}, LVS5;-><init>(ILjava/lang/String;)V

    invoke-virtual {p2, v0}, Lco/bird/android/feature/commandcenter/vehicledetails/views/PastWorkOrderView;->setManager(LVS5;)V

    invoke-virtual {p2}, Lco/bird/android/feature/commandcenter/vehicledetails/views/PastWorkOrderView;->h()Landroid/widget/Button;

    move-result-object p2

    new-instance v0, LRk6$a$a;

    invoke-direct {v0, p0, p1}, LRk6$a$a;-><init>(LRk6$a;LRk6;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 1

    iget-object v0, p0, LRk6$a;->c:LRk6;

    invoke-static {v0}, LRk6;->access$getAdapterData(LRk6;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LbJ3;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LbJ3;

    if-eqz p1, :cond_1

    iget-object v0, p0, LRk6$a;->b:Lco/bird/android/feature/commandcenter/vehicledetails/views/PastWorkOrderView;

    invoke-virtual {v0, p1}, Lco/bird/android/feature/commandcenter/vehicledetails/views/PastWorkOrderView;->f(LbJ3;)V

    :cond_1
    return-void
.end method
