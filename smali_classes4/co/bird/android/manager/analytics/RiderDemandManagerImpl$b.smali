.class public final Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->onStart(LLifecycleOwner;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lorg/joda/time/DateTime;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lorg/joda/time/DateTime;",
        "appForegroundTime",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lorg/joda/time/DateTime;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b;->invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final invoke$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method


# virtual methods
.method public final c(Lorg/joda/time/DateTime;)Lio/reactivex/h;
    .locals 2

    const-string v0, "appForegroundTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-static {v0}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->access$getReactiveLocationManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Ldr4;

    move-result-object v0

    invoke-interface {v0}, Ldr4;->t()LZ84;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b$a;

    invoke-direct {v1, p1}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b$a;-><init>(Lorg/joda/time/DateTime;)V

    new-instance p1, Le95;

    invoke-direct {p1, v1}, Le95;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->firstElement()Lio/reactivex/p;

    move-result-object p1

    new-instance v0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b$b;

    iget-object v1, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-direct {v0, v1}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b$b;-><init>(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)V

    new-instance v1, Lf95;

    invoke-direct {v1, v0}, Lf95;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->A(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lorg/joda/time/DateTime;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b;->c(Lorg/joda/time/DateTime;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
