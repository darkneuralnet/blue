.class public final Lco/bird/android/manager/analytics/AnalyticsManagerImpl$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->E1(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LBy0;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LBy0;",
        "kotlin.jvm.PlatformType",
        "connectivity",
        "",
        "a",
        "(LBy0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnalyticsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsManagerImpl.kt\nco/bird/android/manager/analytics/AnalyticsManagerImpl$registerNetworkListener$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,879:1\n1855#2,2:880\n*S KotlinDebug\n*F\n+ 1 AnalyticsManagerImpl.kt\nco/bird/android/manager/analytics/AnalyticsManagerImpl$registerNetworkListener$1\n*L\n690#1:880,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$i;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LBy0;)V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/model/analytics/PersistentPropertyEntry;

    new-instance v1, Lco/bird/android/model/analytics/NetworkType;

    invoke-virtual {p1}, LBy0;->k()Ljava/lang/String;

    move-result-object v2

    const-string v3, "connectivity.typeName()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lco/bird/android/model/analytics/NetworkType;-><init>(Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lco/bird/android/model/analytics/NetworkSubType;

    invoke-virtual {p1}, LBy0;->i()Ljava/lang/String;

    move-result-object p1

    const-string v2, "connectivity.subTypeName()"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1}, Lco/bird/android/model/analytics/NetworkSubType;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x1

    aput-object v1, v0, p1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$i;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/analytics/PersistentPropertyEntry;

    invoke-virtual {v0, v1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->x(Lco/bird/android/model/analytics/PersistentPropertyEntry;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBy0;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$i;->a(LBy0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
