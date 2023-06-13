.class public final LO85$t;
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
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/model/VehiclePricingDetails;",
        "vehiclePricingDetails",
        "",
        "a",
        "(Lco/bird/android/model/VehiclePricingDetails;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LO85;


# direct methods
.method public constructor <init>(LO85;)V
    .locals 0

    iput-object p1, p0, LO85$t;->g:LO85;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/VehiclePricingDetails;)Ljava/lang/Boolean;
    .locals 4

    const-string v0, "vehiclePricingDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LO85$t;->g:LO85;

    invoke-static {v0}, LO85;->access$getPreference$p(LO85;)Lgl;

    move-result-object v0

    invoke-virtual {v0}, Lgl;->b0()Lco/bird/android/model/VehiclePricingDetails;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, Lco/bird/android/model/VehiclePricingDetails;->pricingChanged$default(Lco/bird/android/model/VehiclePricingDetails;Lco/bird/android/model/VehiclePricingDetails;ZILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object v0, p0, LO85$t;->g:LO85;

    sget-object v1, Lx24;->b:Lx24;

    invoke-static {v0, v1}, LO85;->access$trackScannerScreenViewed(LO85;Lx24;)V

    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/VehiclePricingDetails;

    invoke-virtual {p0, p1}, LO85$t;->a(Lco/bird/android/model/VehiclePricingDetails;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
