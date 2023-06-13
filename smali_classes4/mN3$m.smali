.class public final LmN3$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmN3;->y()Lio/reactivex/F;
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
        "Lco/bird/api/response/ReloadConfigResponse;",
        "+",
        "Lco/bird/android/model/Balance;",
        ">;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\"\u0010\u0003\u001a\u001e\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00060\u00060\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/api/response/ReloadConfigResponse;",
        "Lco/bird/android/model/Balance;",
        "invoke",
        "(Lkotlin/Pair;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final g:LmN3$m;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LmN3$m;

    invoke-direct {v0}, LmN3$m;-><init>()V

    sput-object v0, LmN3$m;->g:LmN3$m;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Pair;)Ljava/lang/Boolean;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/api/response/ReloadConfigResponse;",
            "Lco/bird/android/model/Balance;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/api/response/ReloadConfigResponse;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/Balance;

    invoke-virtual {p1}, Lco/bird/android/model/Balance;->getBalance()J

    move-result-wide v1

    invoke-virtual {v0}, Lco/bird/api/response/ReloadConfigResponse;->getPreload()Lco/bird/api/response/PreloadConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/api/response/PreloadConfig;->getMandatoryMinBalance()J

    move-result-wide v3

    cmp-long v1, v1, v3

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ltz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    invoke-virtual {v0}, Lco/bird/api/response/ReloadConfigResponse;->getAutoReload()Lco/bird/api/response/AutoReloadConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/api/response/AutoReloadConfig;->getCurrentOption()Lco/bird/api/response/ReloadOption;

    move-result-object v4

    const-wide/16 v5, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lco/bird/api/response/ReloadOption;->getAmount()J

    move-result-wide v7

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/Balance;->getAutoPayRefillAmount()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long v7, p1

    goto :goto_1

    :cond_2
    move-wide v7, v5

    :goto_1
    cmp-long p1, v7, v5

    if-lez p1, :cond_3

    move p1, v2

    goto :goto_2

    :cond_3
    move p1, v3

    :goto_2
    if-nez p1, :cond_4

    invoke-virtual {v0}, Lco/bird/api/response/ReloadConfigResponse;->getPreload()Lco/bird/api/response/PreloadConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/api/response/PreloadConfig;->getEnabled()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Lco/bird/api/response/ReloadConfigResponse;->getPreload()Lco/bird/api/response/PreloadConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/api/response/PreloadConfig;->getMandatory()Z

    move-result p1

    if-eqz p1, :cond_4

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    move v2, v3

    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LmN3$m;->invoke(Lkotlin/Pair;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
