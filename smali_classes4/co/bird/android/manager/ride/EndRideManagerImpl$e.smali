.class public final Lco/bird/android/manager/ride/EndRideManagerImpl$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/ride/EndRideManagerImpl;->onStart(LLifecycleOwner;)V
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
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
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
.field public final synthetic g:Lco/bird/android/manager/ride/EndRideManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl$e;->g:Lco/bird/android/manager/ride/EndRideManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lorg/joda/time/DateTime;)Lio/reactivex/h;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "refreshing configs now post foreground location lock"

    invoke-static {v0, p1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl$e;->g:Lco/bird/android/manager/ride/EndRideManagerImpl;

    invoke-static {p1}, Lco/bird/android/manager/ride/EndRideManagerImpl;->access$getConfigManager$p(Lco/bird/android/manager/ride/EndRideManagerImpl;)Lpv0;

    move-result-object p1

    invoke-interface {p1}, Lpv0;->E()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lorg/joda/time/DateTime;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl$e;->a(Lorg/joda/time/DateTime;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
