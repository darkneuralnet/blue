.class public final Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireCaptureValidation;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireCaptureValidation;",
        "item",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireCaptureValidation;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCaptureBulkScannerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$onCreate$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$d;->g:Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireCaptureValidation;)V
    .locals 4

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireCaptureValidation;->getBirdId()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    sget-object v1, Lts1;->f:Lts1$a;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, p1, v2, v3, v0}, Lts1$a;->newInstance$default(Lts1$a;Ljava/lang/String;ZILjava/lang/Object;)Lts1;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    iget-object p1, p0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$d;->g:Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v1, "FlightSheetBottomSheetFragment"

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireCaptureValidation;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$d;->a(Lco/bird/android/model/wire/WireCaptureValidation;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
