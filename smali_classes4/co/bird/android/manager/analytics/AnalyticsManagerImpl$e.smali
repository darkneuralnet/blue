.class public final Lco/bird/android/manager/analytics/AnalyticsManagerImpl$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->s0(Lco/bird/android/model/persistence/AnalyticsEntity;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "count",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Integer;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$e;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$e;->invoke(Ljava/lang/Integer;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Integer;)V
    .locals 4

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$e;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;

    invoke-static {v0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->access$getPreference$p(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)Lgl;

    move-result-object v0

    invoke-virtual {v0}, Lgl;->d1()Lorg/joda/time/DateTime;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-static {v1, v0}, Lorg/joda/time/Seconds;->secondsBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Seconds;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/Seconds;->getSeconds()I

    move-result v0

    goto :goto_0

    :cond_0
    const v0, 0x7fffffff

    :goto_0
    const-string v1, "count"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v1, 0xa

    if-gt p1, v1, :cond_1

    const/16 p1, 0xb4

    if-le v0, p1, :cond_2

    :cond_1
    iget-object p1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$e;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;

    invoke-static {p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->access$getWorkManager$p(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)Ldagger/Lazy;

    move-result-object p1

    invoke-interface {p1}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZC6;

    sget-object v0, Lfi1;->c:Lfi1;

    new-instance v1, LFh3$a;

    const-class v2, Lco/bird/android/manager/analytics/workers/AnalyticsSubmitWorker;

    invoke-direct {v1, v2}, LFh3$a;-><init>(Ljava/lang/Class;)V

    new-instance v2, Llz0$a;

    invoke-direct {v2}, Llz0$a;-><init>()V

    sget-object v3, LS73;->c:LS73;

    invoke-virtual {v2, v3}, Llz0$a;->b(LS73;)Llz0$a;

    move-result-object v2

    invoke-virtual {v2}, Llz0$a;->a()Llz0;

    move-result-object v2

    invoke-virtual {v1, v2}, LEG6$a;->h(Llz0;)LEG6$a;

    move-result-object v1

    check-cast v1, LFh3$a;

    invoke-virtual {v1}, LEG6$a;->a()LEG6;

    move-result-object v1

    check-cast v1, LFh3;

    const-string v2, "analytics_worker"

    invoke-virtual {p1, v2, v0, v1}, LZC6;->f(Ljava/lang/String;Lfi1;LFh3;)LXh3;

    iget-object p1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$e;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;

    invoke-static {p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->access$getPreference$p(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)Lgl;

    move-result-object p1

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    const-string v1, "now()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lgl;->W1(Lorg/joda/time/DateTime;)V

    :cond_2
    return-void
.end method
