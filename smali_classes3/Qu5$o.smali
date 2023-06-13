.class public final LQu5$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQu5;->E(Lco/bird/android/model/wire/WireBird;)V
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
        "Lco/bird/android/model/wire/WireServiceCenterStatus;",
        "+",
        "Ljava/lang/String;",
        "+",
        "Lco/bird/android/model/User;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/wire/WireServiceCenterStatus;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00060\u00062(\u0010\u0005\u001a$\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/model/wire/WireServiceCenterStatus;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/model/User;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "b",
        "(Lkotlin/Triple;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireBird;

.field public final synthetic h:LQu5;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireBird;LQu5;)V
    .locals 0

    iput-object p1, p0, LQu5$o;->g:Lco/bird/android/model/wire/WireBird;

    iput-object p2, p0, LQu5$o;->h:LQu5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireServiceCenterStatus;
    .locals 0

    invoke-static {p0, p1}, LQu5$o;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireServiceCenterStatus;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireServiceCenterStatus;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/WireServiceCenterStatus;

    return-object p0
.end method


# virtual methods
.method public final b(Lkotlin/Triple;)Lio/reactivex/K;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/wire/WireServiceCenterStatus;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/User;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/wire/WireServiceCenterStatus;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireServiceCenterStatus;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/User;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireServiceCenterStatus;->getStatus()Lco/bird/android/model/constant/ServiceCenterStatus;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/constant/ServiceCenterStatus;->isHibernate()Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, LQu5$o;->g:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getBatteryLevel()I

    move-result p1

    iget-object v2, p0, LQu5$o;->h:LQu5;

    invoke-static {v2}, LQu5;->access$getMinHibernateBattery$p(LQu5;)I

    move-result v2

    if-ge p1, v2, :cond_0

    new-instance p1, Lco/bird/api/exception/HibernateException;

    const/4 v0, 0x1

    invoke-direct {p1, v1, v0, v1}, Lco/bird/api/exception/HibernateException;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_1

    :cond_0
    iget-object p1, p0, LQu5$o;->h:LQu5;

    invoke-static {p1}, LQu5;->access$getServiceCenterManager$p(LQu5;)LGt5;

    move-result-object v2

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireServiceCenterStatus;->getStatus()Lco/bird/android/model/constant/ServiceCenterStatus;

    move-result-object v3

    iget-object v4, p0, LQu5$o;->g:Lco/bird/android/model/wire/WireBird;

    const/4 v6, 0x0

    sget-object v7, LbH;->b:LbH;

    const/4 v8, 0x0

    const/16 v9, 0x28

    const/4 v10, 0x0

    invoke-static/range {v2 .. v10}, LGt5$a;->addEvent$default(LGt5;Lco/bird/android/model/constant/ServiceCenterStatus;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;Ljava/lang/String;LbH;Ljava/lang/Integer;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    iget-object v2, p0, LQu5$o;->h:LQu5;

    invoke-static {v2}, LQu5;->access$getUi$p(LQu5;)Lbv5;

    move-result-object v2

    invoke-interface {v2}, LFQ5;->oc()LnQ5;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, LQu5$o;->h:LQu5;

    invoke-static {v2}, LQu5;->access$getUi$p(LQu5;)Lbv5;

    move-result-object v2

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {p1, v2, v3, v4, v1}, LsD;->progress$default(Lio/reactivex/F;LS74;IILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1}, Lag5;->l(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    new-instance v1, LQu5$o$a;

    invoke-direct {v1, v0}, LQu5$o$a;-><init>(Lco/bird/android/model/wire/WireServiceCenterStatus;)V

    new-instance v0, LTu5;

    invoke-direct {v0, v1}, LTu5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LQu5$o;->b(Lkotlin/Triple;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
