.class public final Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->invoke(Ljava/lang/String;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/WireItemLeaseStartResponse;",
        "Lco/bird/android/model/itemlease/LeaseStartResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/WireItemLeaseStartResponse;",
        "response",
        "Lco/bird/android/model/itemlease/LeaseStartResponse;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/WireItemLeaseStartResponse;)Lco/bird/android/model/itemlease/LeaseStartResponse;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s$b;

    invoke-direct {v0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s$b;-><init>()V

    sput-object v0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s$b;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/WireItemLeaseStartResponse;)Lco/bird/android/model/itemlease/LeaseStartResponse;
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/itemlease/LeaseStartResponse;

    invoke-virtual {p1}, Lco/bird/api/response/WireItemLeaseStartResponse;->getLease()Lco/bird/android/model/wire/WireLeaseObjectResponse;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lco/bird/android/model/itemlease/ItemLeaseKt;->toItemLease(Lco/bird/android/model/wire/WireLeaseObjectResponse;)Lco/bird/android/model/itemlease/ItemLease;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lco/bird/api/response/WireItemLeaseStartResponse;->getPaymentAuth()Lco/bird/android/model/wire/WirePaymentAuthResponse;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lco/bird/android/model/itemlease/LeaseStartResponse;-><init>(Lco/bird/android/model/itemlease/ItemLease;Lco/bird/android/model/wire/WirePaymentAuthResponse;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/WireItemLeaseStartResponse;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s$b;->a(Lco/bird/api/response/WireItemLeaseStartResponse;)Lco/bird/android/model/itemlease/LeaseStartResponse;

    move-result-object p1

    return-object p1
.end method
