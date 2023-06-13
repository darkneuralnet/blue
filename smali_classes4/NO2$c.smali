.class public final LNO2$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNO2;->z(Ljava/lang/String;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/BirdInspection;",
        "+",
        "Lco/bird/android/model/BirdRepair;",
        ">;",
        "Lco/bird/android/model/MechanicRepairStep;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/BirdInspection;",
        "Lco/bird/android/model/BirdRepair;",
        "it",
        "Lco/bird/android/model/MechanicRepairStep;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lkotlin/Pair;)Lco/bird/android/model/MechanicRepairStep;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LNO2$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LNO2$c;

    invoke-direct {v0}, LNO2$c;-><init>()V

    sput-object v0, LNO2$c;->g:LNO2$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;)Lco/bird/android/model/MechanicRepairStep;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/BirdInspection;",
            "Lco/bird/android/model/BirdRepair;",
            ">;)",
            "Lco/bird/android/model/MechanicRepairStep;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/BirdRepair;

    invoke-virtual {v0}, Lco/bird/android/model/BirdRepair;->getCloseReason()Lco/bird/android/model/constant/Resolution;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/Resolution;->COMPLETED:Lco/bird/android/model/constant/Resolution;

    if-ne v0, v1, :cond_0

    sget-object p1, Lco/bird/android/model/MechanicRepairStep;->INSPECTION:Lco/bird/android/model/MechanicRepairStep;

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/BirdInspection;

    invoke-virtual {p1}, Lco/bird/android/model/BirdInspection;->getInspectionJobs()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_1

    sget-object p1, Lco/bird/android/model/MechanicRepairStep;->REPAIR:Lco/bird/android/model/MechanicRepairStep;

    goto :goto_0

    :cond_1
    sget-object p1, Lco/bird/android/model/MechanicRepairStep;->INSPECTION:Lco/bird/android/model/MechanicRepairStep;

    :goto_0
    if-nez p1, :cond_3

    :cond_2
    sget-object p1, Lco/bird/android/model/MechanicRepairStep;->INSPECTION:Lco/bird/android/model/MechanicRepairStep;

    :cond_3
    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LNO2$c;->a(Lkotlin/Pair;)Lco/bird/android/model/MechanicRepairStep;

    move-result-object p1

    return-object p1
.end method
