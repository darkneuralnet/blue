.class public final Lco/bird/android/manager/ride/EndRideManagerImpl$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/ride/EndRideManagerImpl;->j(Lco/bird/android/model/wire/WireRide;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "Lorg/joda/time/DateTime;",
        ">;",
        "Lorg/joda/time/DateTime;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lorg/joda/time/DateTime;",
        "lastRequestTime",
        "a",
        "(Lco/bird/android/buava/Optional;)Lorg/joda/time/DateTime;"
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
        "SMAP\nEndRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndRideManagerImpl.kt\nco/bird/android/manager/ride/EndRideManagerImpl$waitForEndRideConditions$parkingNestsCompletable$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,285:1\n1#2:286\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/ride/EndRideManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl$p;->g:Lco/bird/android/manager/ride/EndRideManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)Lorg/joda/time/DateTime;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lorg/joda/time/DateTime;",
            ">;)",
            "Lorg/joda/time/DateTime;"
        }
    .end annotation

    const-string v0, "lastRequestTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/joda/time/DateTime;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object v1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl$p;->g:Lco/bird/android/manager/ride/EndRideManagerImpl;

    invoke-static {v1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->access$getFirstLocationUpdatePostForeground$p(Lco/bird/android/manager/ride/EndRideManagerImpl;)LAG;

    move-result-object v1

    invoke-virtual {v1}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/joda/time/DateTime;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-virtual {p1, v1}, Lorg/joda/time/base/AbstractInstant;->isAfter(Lorg/joda/time/ReadableInstant;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl$p;->a(Lco/bird/android/buava/Optional;)Lorg/joda/time/DateTime;

    move-result-object p1

    return-object p1
.end method
