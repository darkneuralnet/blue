.class public final Lmo0$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmo0;->a(Lco/bird/android/model/wire/WireBird;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LRe4<",
        "+",
        "Lco/bird/android/model/CommandCenterBody;",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00030\u00032,\u0010\u0004\u001a(\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LRe4;",
        "Lco/bird/android/model/CommandCenterBody;",
        "kotlin.jvm.PlatformType",
        "",
        "<name for destructuring parameter 0>",
        "a",
        "(LRe4;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lmo0$h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmo0$h;

    invoke-direct {v0}, Lmo0$h;-><init>()V

    sput-object v0, Lmo0$h;->g:Lmo0$h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LRe4;)Ljava/lang/Boolean;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRe4<",
            "Lco/bird/android/model/CommandCenterBody;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LRe4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/CommandCenterBody;

    invoke-virtual {p1}, LRe4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1}, LRe4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p1}, LRe4;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {p1}, LRe4;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0}, Lco/bird/android/model/CommandCenterBody;->getStatus()Lco/bird/android/model/constant/ServiceCenterStatus;

    move-result-object v0

    sget-object v4, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_INSPECTION:Lco/bird/android/model/constant/ServiceCenterStatus;

    if-ne v0, v4, :cond_0

    goto :goto_5

    :cond_0
    sget-object v1, Lco/bird/android/model/constant/ServiceCenterRoute;->Companion:Lco/bird/android/model/constant/ServiceCenterRoute$Companion;

    invoke-virtual {v1}, Lco/bird/android/model/constant/ServiceCenterRoute$Companion;->getREPAIR_ROUTE_STATUSES()Ljava/util/Set;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    :goto_0
    move v1, v2

    goto :goto_5

    :cond_1
    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_QUALITY_CONTROL:Lco/bird/android/model/constant/ServiceCenterStatus;

    if-ne v0, v2, :cond_2

    move v1, v3

    goto :goto_5

    :cond_2
    invoke-virtual {v1}, Lco/bird/android/model/constant/ServiceCenterRoute$Companion;->getSCRAP_ROUTE_STATUSES()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, p1

    goto :goto_5

    :cond_3
    sget-object p1, Lco/bird/android/model/constant/ServiceCenterStatus;->CHARGING:Lco/bird/android/model/constant/ServiceCenterStatus;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, p1, :cond_4

    :goto_1
    move p1, v2

    goto :goto_2

    :cond_4
    sget-object p1, Lco/bird/android/model/constant/ServiceCenterStatus;->HIBERNATE:Lco/bird/android/model/constant/ServiceCenterStatus;

    if-ne v0, p1, :cond_5

    goto :goto_1

    :cond_5
    move p1, v1

    :goto_2
    if-eqz p1, :cond_6

    :goto_3
    move p1, v2

    goto :goto_4

    :cond_6
    sget-object p1, Lco/bird/android/model/constant/ServiceCenterStatus;->SERVICE_COMPLETE_AWAITING_EXIT:Lco/bird/android/model/constant/ServiceCenterStatus;

    if-ne v0, p1, :cond_7

    goto :goto_3

    :cond_7
    move p1, v1

    :goto_4
    if-eqz p1, :cond_8

    goto :goto_0

    :cond_8
    :goto_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LRe4;

    invoke-virtual {p0, p1}, Lmo0$h;->a(LRe4;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
