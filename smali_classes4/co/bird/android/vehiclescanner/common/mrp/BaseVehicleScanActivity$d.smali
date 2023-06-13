.class public final Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LRk5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "S",
        "LRk5;",
        "b",
        "()LRk5;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity<",
            "TS;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity<",
            "TS;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity$d;->g:Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LRk5;
    .locals 4

    new-instance v0, LRk5;

    iget-object v1, p0, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity$d;->g:Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;

    invoke-virtual {v1}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->U()Lf00;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LRk5;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lf00;Landroid/content/DialogInterface;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity$d;->b()LRk5;

    move-result-object v0

    return-object v0
.end method
