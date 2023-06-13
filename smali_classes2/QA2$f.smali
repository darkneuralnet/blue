.class public final LQA2$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQA2;->B()Lio/reactivex/Observable;
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
        "Lco/bird/android/model/DeliveryWindow;",
        "+",
        "Lco/bird/android/model/RentalPeriod;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "Lorg/joda/time/DateTime;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/DeliveryWindow;",
        "Lco/bird/android/model/RentalPeriod;",
        "<name for destructuring parameter 0>",
        "Lco/bird/android/buava/Optional;",
        "Lorg/joda/time/DateTime;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lkotlin/Pair;)Lco/bird/android/buava/Optional;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LQA2$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LQA2$f;

    invoke-direct {v0}, LQA2$f;-><init>()V

    sput-object v0, LQA2$f;->g:LQA2$f;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;)Lco/bird/android/buava/Optional;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/DeliveryWindow;",
            "Lco/bird/android/model/RentalPeriod;",
            ">;)",
            "Lco/bird/android/buava/Optional<",
            "Lorg/joda/time/DateTime;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/DeliveryWindow;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/RentalPeriod;

    if-eqz p1, :cond_0

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, Lco/bird/android/model/RentalPeriod;->getServiceEndsAt()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {v0, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    sget-object p1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0}, Lco/bird/android/model/DeliveryWindow;->getEnd()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/DeliveryWindow;->getRentalPeriodDays()I

    move-result v0

    int-to-long v2, v0

    invoke-static {v2, v3}, Lorg/joda/time/Duration;->standardDays(J)Lorg/joda/time/Duration;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/joda/time/DateTime;->plus(Lorg/joda/time/ReadableDuration;)Lorg/joda/time/DateTime;

    move-result-object v0

    const-string v1, "selectedWindow.end + Dur\u2026entalPeriodDays.toLong())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LQA2$f;->a(Lkotlin/Pair;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method
