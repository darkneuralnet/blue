.class public final Lfv6$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfv6;->F()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/ar/core/VpsAvailability;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/google/ar/core/VpsAvailability;",
        "vpsAvailability",
        "",
        "a",
        "(Lcom/google/ar/core/VpsAvailability;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lfv6;


# direct methods
.method public constructor <init>(Lfv6;)V
    .locals 0

    iput-object p1, p0, Lfv6$c;->g:Lfv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/ar/core/VpsAvailability;)V
    .locals 4

    const-string v0, "vpsAvailability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "vps availability returned "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lfv6$c;->g:Lfv6;

    sget-object v2, Lcom/google/ar/core/VpsAvailability;->AVAILABLE:Lcom/google/ar/core/VpsAvailability;

    if-ne p1, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-static {v0, v1}, Lfv6;->access$setGeospatialModeAvailableAtCurrentLocation$p(Lfv6;Z)V

    iget-object v0, p0, Lfv6$c;->g:Lfv6;

    invoke-static {v0}, Lfv6;->access$getGeospatialAvailability$p(Lfv6;)Lcom/google/common/util/concurrent/SettableFuture;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/common/util/concurrent/SettableFuture;->set(Ljava/lang/Object;)Z

    iget-object p1, p0, Lfv6$c;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$isGeospatialModeAvailableAtCurrentLocation$p(Lfv6;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lfv6$c;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getArManager$p(Lfv6;)Ltm;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->GOOGLE_VPS_V2:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object v1, p0, Lfv6$c;->g:Lfv6;

    invoke-static {v1}, Lfv6;->access$getRide$p(Lfv6;)Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lfv6$c;->g:Lfv6;

    invoke-static {v2}, Lfv6;->access$getRide$p(Lfv6;)Lco/bird/android/model/wire/WireRide;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireRide;->getBirdId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "api"

    invoke-interface {p1, v0, v1, v2, v3}, Ltm;->c(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/ar/core/VpsAvailability;

    invoke-virtual {p0, p1}, Lfv6$c;->a(Lcom/google/ar/core/VpsAvailability;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
