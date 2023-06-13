.class public final Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity;->H1()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LG6;",
        "Lco/bird/android/model/wire/WireCaptureValidation;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LG6;",
        "kotlin.jvm.PlatformType",
        "item",
        "Lco/bird/android/model/wire/WireCaptureValidation;",
        "a",
        "(LG6;)Lco/bird/android/model/wire/WireCaptureValidation;"
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
        "SMAP\nCaptureBulkScannerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$swipeToRemove$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,124:1\n18#2:125\n9#3,4:126\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$swipeToRemove$2\n*L\n83#1:125\n83#1:126,4\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$j;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$j;

    invoke-direct {v0}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$j;-><init>()V

    sput-object v0, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$j;->g:Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$j;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LG6;)Lco/bird/android/model/wire/WireCaptureValidation;
    .locals 1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/wire/WireCaptureValidation;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/wire/WireCaptureValidation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG6;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerActivity$j;->a(LG6;)Lco/bird/android/model/wire/WireCaptureValidation;

    move-result-object p1

    return-object p1
.end method
