.class public final Lco/bird/android/manager/ride/EndRideManagerImpl$g;
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
        "Lorg/joda/time/DateTime;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lorg/joda/time/DateTime;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0004* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lorg/joda/time/DateTime;",
        "lastRequestTime",
        "Lio/reactivex/K;",
        "Lco/bird/android/buava/Optional;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lorg/joda/time/DateTime;)Lio/reactivex/K;"
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

    iput-object p1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl$g;->g:Lco/bird/android/manager/ride/EndRideManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl$g;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl$g;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
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


# virtual methods
.method public final c(Lorg/joda/time/DateTime;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/joda/time/DateTime;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/buava/Optional<",
            "Lorg/joda/time/DateTime;",
            ">;>;"
        }
    .end annotation

    const-string v0, "lastRequestTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/ride/EndRideManagerImpl$g;->g:Lco/bird/android/manager/ride/EndRideManagerImpl;

    invoke-static {v0}, Lco/bird/android/manager/ride/EndRideManagerImpl;->access$getAreaManager$p(Lco/bird/android/manager/ride/EndRideManagerImpl;)Lbn;

    move-result-object v0

    invoke-interface {v0}, Lbn;->w()LZ84;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/ride/EndRideManagerImpl$g$a;

    invoke-direct {v1, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl$g$a;-><init>(Lorg/joda/time/DateTime;)V

    new-instance p1, Lud1;

    invoke-direct {p1, v1}, Lud1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/manager/ride/EndRideManagerImpl$g$b;

    iget-object v1, p0, Lco/bird/android/manager/ride/EndRideManagerImpl$g;->g:Lco/bird/android/manager/ride/EndRideManagerImpl;

    invoke-direct {v0, v1}, Lco/bird/android/manager/ride/EndRideManagerImpl$g$b;-><init>(Lco/bird/android/manager/ride/EndRideManagerImpl;)V

    new-instance v1, Lvd1;

    invoke-direct {v1, v0}, Lvd1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lorg/joda/time/DateTime;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/ride/EndRideManagerImpl$g;->c(Lorg/joda/time/DateTime;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
