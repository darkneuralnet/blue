.class public final Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->o(Lco/bird/android/model/itemlease/enum/ItemLeaseType;ZLjava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/WireLeaseItemAvailabilityResponse;",
        "Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/WireLeaseItemAvailabilityResponse;",
        "response",
        "Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/WireLeaseItemAvailabilityResponse;)Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;"
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
        "SMAP\nItemLeaseManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl$markLeaseItemAvailability$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,476:1\n1#2:477\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$h;

    invoke-direct {v0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$h;-><init>()V

    sput-object v0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$h;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/WireLeaseItemAvailabilityResponse;)Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;
    .locals 9

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/WireLeaseItemAvailabilityResponse;->getAvailability()Lco/bird/api/response/WireLeaseItemAvailability;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/api/response/WireLeaseItemAvailability;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/api/response/WireLeaseItemAvailabilityResponse;->getAvailability()Lco/bird/api/response/WireLeaseItemAvailability;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/api/response/WireLeaseItemAvailability;->getLeaseType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->Companion:Lco/bird/android/model/itemlease/enum/ItemLeaseType$Companion;

    invoke-virtual {v1, v0}, Lco/bird/android/model/itemlease/enum/ItemLeaseType$Companion;->fromWire(Ljava/lang/String;)Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v3, v0

    invoke-virtual {p1}, Lco/bird/api/response/WireLeaseItemAvailabilityResponse;->getAvailability()Lco/bird/api/response/WireLeaseItemAvailability;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/api/response/WireLeaseItemAvailability;->getItemId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lco/bird/api/response/WireLeaseItemAvailabilityResponse;->getAvailability()Lco/bird/api/response/WireLeaseItemAvailability;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/api/response/WireLeaseItemAvailability;->getAssociatedItemId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lco/bird/api/response/WireLeaseItemAvailabilityResponse;->getAvailability()Lco/bird/api/response/WireLeaseItemAvailability;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/api/response/WireLeaseItemAvailability;->getConfidence()Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {p1}, Lco/bird/api/response/WireLeaseItemAvailabilityResponse;->getAvailability()Lco/bird/api/response/WireLeaseItemAvailability;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/api/response/WireLeaseItemAvailability;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object v7

    invoke-virtual {p1}, Lco/bird/api/response/WireLeaseItemAvailabilityResponse;->getAvailability()Lco/bird/api/response/WireLeaseItemAvailability;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/api/response/WireLeaseItemAvailability;->getUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v8

    new-instance p1, Lco/bird/android/model/itemlease/LeaseItemAvailability;

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Lco/bird/android/model/itemlease/LeaseItemAvailability;-><init>(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V

    new-instance v0, Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;

    invoke-direct {v0, p1}, Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;-><init>(Lco/bird/android/model/itemlease/LeaseItemAvailability;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/WireLeaseItemAvailabilityResponse;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$h;->a(Lco/bird/api/response/WireLeaseItemAvailabilityResponse;)Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;

    move-result-object p1

    return-object p1
.end method
