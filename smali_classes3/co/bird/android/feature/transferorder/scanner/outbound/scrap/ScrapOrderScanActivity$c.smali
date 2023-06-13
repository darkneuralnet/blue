.class public final Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;->q0(LLz3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireItemScrapReason;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireItemScrapReason;",
        "kotlin.jvm.PlatformType",
        "reason",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireItemScrapReason;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;

.field public final synthetic h:LqA5;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;LqA5;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity$c;->g:Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;

    iput-object p2, p0, Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity$c;->h:LqA5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireItemScrapReason;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity$c;->g:Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;

    invoke-static {v0}, Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;->access$getScrapReasonSelectsRelay$p(Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;)Lma4;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity$c;->h:LqA5;

    invoke-virtual {v1}, LqA5;->c()Lco/bird/android/model/wire/WireSkuScanItem;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireItemScrapReason;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireItemScrapReason;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity$c;->a(Lco/bird/android/model/wire/WireItemScrapReason;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
