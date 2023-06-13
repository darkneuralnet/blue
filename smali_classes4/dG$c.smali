.class public final LdG$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LdG;->b(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/c;
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
        "Ljava/lang/String;",
        "+",
        "Lco/bird/api/response/BeaconConfigurationRequestResponseBody;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001 \u0005*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "Lco/bird/api/response/BeaconConfigurationRequestResponseBody;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lkotlin/Pair;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LdG;


# direct methods
.method public constructor <init>(LdG;)V
    .locals 0

    iput-object p1, p0, LdG$c;->g:LdG;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;)Lio/reactivex/K;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lco/bird/api/response/BeaconConfigurationRequestResponseBody;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/response/BeaconConfigurationRequestResponseBody;

    iget-object v0, p0, LdG$c;->g:LdG;

    invoke-static {v0}, LdG;->access$getVtBeaconManager$p(LdG;)Laj6;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/api/response/BeaconConfigurationRequestResponseBody;->getOldPin()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "000000"

    :cond_0
    move-object v3, v0

    invoke-virtual {p1}, Lco/bird/api/response/BeaconConfigurationRequestResponseBody;->getProximityUUID()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lco/bird/api/response/BeaconConfigurationRequestResponseBody;->getMajorNumber()S

    move-result v5

    invoke-virtual {p1}, Lco/bird/api/response/BeaconConfigurationRequestResponseBody;->getMinorNumber()S

    move-result v6

    invoke-virtual {p1}, Lco/bird/api/response/BeaconConfigurationRequestResponseBody;->getNewPin()Ljava/lang/String;

    move-result-object v7

    invoke-interface/range {v1 .. v7}, Laj6;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;SSLjava/lang/String;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/api/response/BeaconConfigurationRequestResponseBody;->getConfigurationRequestId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LdG$c;->a(Lkotlin/Pair;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
