.class public final LoL$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoL;->d(Lco/bird/android/model/constant/DeviceVerificationMethod;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/DeviceCheckSendResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/DeviceCheckSendResponse;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(Lco/bird/api/response/DeviceCheckSendResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LoL;

.field public final synthetic h:Lco/bird/android/model/constant/DeviceVerificationMethod;


# direct methods
.method public constructor <init>(LoL;Lco/bird/android/model/constant/DeviceVerificationMethod;)V
    .locals 0

    iput-object p1, p0, LoL$g;->g:LoL;

    iput-object p2, p0, LoL$g;->h:Lco/bird/android/model/constant/DeviceVerificationMethod;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/DeviceCheckSendResponse;)V
    .locals 11

    iget-object v0, p0, LoL$g;->g:LoL;

    invoke-static {v0}, LoL;->access$getAnalyticsManager$p(LoL;)LEa;

    move-result-object v0

    new-instance v10, LB21;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v1, p0, LoL$g;->h:Lco/bird/android/model/constant/DeviceVerificationMethod;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lco/bird/api/response/DeviceCheckSendResponse;->getSuccess()Z

    move-result v6

    const/4 v7, 0x0

    const/16 v8, 0x27

    const/4 v9, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, LB21;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v10}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/DeviceCheckSendResponse;

    invoke-virtual {p0, p1}, LoL$g;->a(Lco/bird/api/response/DeviceCheckSendResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
