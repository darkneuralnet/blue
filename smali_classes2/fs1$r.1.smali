.class public final Lfs1$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfs1;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/FlightBannerNode$FlightBanner;",
        "+",
        "Landroid/view/View;",
        "+",
        "Lco/bird/android/model/FlightBanner;",
        ">;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/FlightBannerNode$FlightBanner;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u001e\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u0001 \u0006*\u000e\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00050\u00052\u001e\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/model/FlightBannerNode$FlightBanner;",
        "Landroid/view/View;",
        "Lco/bird/android/model/FlightBanner;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/B;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lkotlin/Triple;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lfs1$r;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfs1$r;

    invoke-direct {v0}, Lfs1$r;-><init>()V

    sput-object v0, Lfs1$r;->g:Lfs1$r;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/FlightBannerNode$FlightBanner;
    .locals 0

    invoke-static {p0, p1}, Lfs1$r;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/FlightBannerNode$FlightBanner;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/FlightBannerNode$FlightBanner;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/FlightBannerNode$FlightBanner;

    return-object p0
.end method


# virtual methods
.method public final b(Lkotlin/Triple;)Lio/reactivex/B;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "+",
            "Lco/bird/android/model/FlightBannerNode$FlightBanner;",
            "+",
            "Landroid/view/View;",
            "+",
            "Lco/bird/android/model/FlightBanner;",
            ">;)",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/FlightBannerNode$FlightBanner;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/FlightBanner;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lco/bird/android/model/FlightBanner;->closeImmediately()Lio/reactivex/Observable;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v1, Lfs1$r$a;

    invoke-direct {v1, v0}, Lfs1$r$a;-><init>(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    new-instance v0, Lgs1;

    invoke-direct {v0, v1}, Lgs1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, Lfs1$r;->b(Lkotlin/Triple;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
