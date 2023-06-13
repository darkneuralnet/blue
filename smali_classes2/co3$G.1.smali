.class public final Lco3$G;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco3;->k0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/NestFlightSheetDetails;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/NestFlightSheetDetails;",
        "kotlin.jvm.PlatformType",
        "nestFlightSheetDetails",
        "",
        "a",
        "(Lco/bird/android/model/persistence/NestFlightSheetDetails;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco3;


# direct methods
.method public constructor <init>(Lco3;)V
    .locals 0

    iput-object p1, p0, Lco3$G;->g:Lco3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/NestFlightSheetDetails;)V
    .locals 4

    iget-object v0, p0, Lco3$G;->g:Lco3;

    invoke-static {v0}, Lco3;->access$getUi$p(Lco3;)Lpo3;

    move-result-object v0

    const-string v1, "nestFlightSheetDetails"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lpo3;->ua(Lco/bird/android/model/persistence/NestFlightSheetDetails;)V

    iget-object v0, p0, Lco3$G;->g:Lco3;

    invoke-static {v0}, Lco3;->access$getUi$p(Lco3;)Lpo3;

    move-result-object v0

    new-instance v1, LQk3$b;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getClaimDetails()Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;->getStatus()Lco/bird/android/model/constant/ClaimStatus;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    sget-object v3, Lco/bird/android/model/constant/ClaimStatus;->CLAIMED:Lco/bird/android/model/constant/ClaimStatus;

    if-ne v2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p1}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getNewClaimErrorMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, LQk3$b;-><init>(ZLjava/lang/String;)V

    invoke-interface {v0, v1}, LRk3;->xd(LQk3;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/NestFlightSheetDetails;

    invoke-virtual {p0, p1}, Lco3$G;->a(Lco/bird/android/model/persistence/NestFlightSheetDetails;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
