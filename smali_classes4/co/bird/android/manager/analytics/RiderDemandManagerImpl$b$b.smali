.class public final Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b;->c(Lorg/joda/time/DateTime;)Lio/reactivex/h;
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
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lorg/joda/time/DateTime;",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lco/bird/android/buava/Optional;)Lio/reactivex/h;"
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

    iput-object p1, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b$b;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/buava/Optional;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b$b;->d(Lco/bird/android/buava/Optional;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b$b;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lco/bird/android/buava/Optional;)V
    .locals 2

    const-string v0, "$it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Called user/start-session on app foreground after receiving location update: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lco/bird/android/buava/Optional;)Lio/reactivex/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lorg/joda/time/DateTime;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b$b;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl;

    invoke-static {v0}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl;->access$getUserManager$p(Lco/bird/android/manager/analytics/RiderDemandManagerImpl;)Llh6;

    move-result-object v0

    invoke-interface {v0}, Llh6;->n()Lio/reactivex/c;

    move-result-object v0

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lio/reactivex/c;->U(J)Lio/reactivex/c;

    move-result-object v0

    sget-object v1, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b$b$a;->g:Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b$b$a;

    new-instance v2, Lg95;

    invoke-direct {v2, v1}, Lg95;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v0

    new-instance v1, Lh95;

    invoke-direct {v1, p1}, Lh95;-><init>(Lco/bird/android/buava/Optional;)V

    invoke-virtual {v0, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/RiderDemandManagerImpl$b$b;->c(Lco/bird/android/buava/Optional;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
