.class public final Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lco/bird/android/vehiclescanner/common/mrp/a$a;->a(Lco/bird/android/vehiclescanner/common/mrp/a;Ljava/lang/Object;)V

    return-void
.end method
