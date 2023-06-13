.class public final LO85$w;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO85;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/VehiclePricingDetails;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/VehiclePricingDetails;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/VehiclePricingDetails;)V"
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
        "SMAP\nRiderBirdScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderBirdScanPresenter.kt\nco/bird/android/app/feature/scanner/RiderBirdScanPresenterImpl$onCreate$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,945:1\n1#2:946\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LO85;


# direct methods
.method public constructor <init>(LO85;)V
    .locals 0

    iput-object p1, p0, LO85$w;->g:LO85;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/VehiclePricingDetails;)V
    .locals 2

    iget-object v0, p0, LO85$w;->g:LO85;

    invoke-static {v0}, LO85;->access$getUi$p(LO85;)LZS;

    move-result-object v0

    invoke-interface {v0}, LZS;->gl()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    iget-object v0, p0, LO85$w;->g:LO85;

    sget-object v1, Lx24;->d:Lx24;

    invoke-static {v0, v1}, LO85;->access$trackScannerScreenViewed(LO85;Lx24;)V

    iget-object v0, p0, LO85$w;->g:LO85;

    invoke-static {v0}, LO85;->access$getPreference$p(LO85;)Lgl;

    move-result-object v0

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lgl;->O2(Lco/bird/android/model/VehiclePricingDetails;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/VehiclePricingDetails;

    invoke-virtual {p0, p1}, LO85$w;->a(Lco/bird/android/model/VehiclePricingDetails;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
