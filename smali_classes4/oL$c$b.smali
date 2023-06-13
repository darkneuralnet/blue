.class public final LoL$c$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoL$c;->invoke(Ljava/lang/String;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "error",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBirdDeviceCheckManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdDeviceCheckManagerImpl.kt\nco/bird/android/manager/devicecheck/BirdDeviceCheckManagerImpl$4$2\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,178:1\n9#2,4:179\n*S KotlinDebug\n*F\n+ 1 BirdDeviceCheckManagerImpl.kt\nco/bird/android/manager/devicecheck/BirdDeviceCheckManagerImpl$4$2\n*L\n91#1:179,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LoL;


# direct methods
.method public constructor <init>(LoL;)V
    .locals 0

    iput-object p1, p0, LoL$c$b;->g:LoL;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LoL$c$b;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 14

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    instance-of v0, p1, Lretrofit2/HttpException;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lretrofit2/HttpException;

    if-eqz p1, :cond_1

    iget-object v0, p0, LoL$c$b;->g:LoL;

    invoke-static {v0}, LoL;->access$getAnalyticsManager$p(LoL;)LEa;

    move-result-object v1

    invoke-static {v0}, LoL;->access$getCheckDeviceMethodSubject$p(LoL;)Lco/bird/android/model/constant/DeviceVerificationMethod;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v0}, LoL;->access$operationTime(LoL;)D

    move-result-wide v10

    invoke-virtual {p1}, Lretrofit2/HttpException;->a()I

    move-result p1

    new-instance v0, Lk21;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v12, 0x7

    const/4 v13, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v13}, Lk21;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/Integer;DILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v0}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_1
    return-void
.end method
