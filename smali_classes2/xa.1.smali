.class public final Lxa;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0008\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0007R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "Lxa;",
        "",
        "Landroid/content/Intent;",
        "intent",
        "",
        "a",
        "LEa;",
        "LEa;",
        "analyticsManager",
        "Le13;",
        "b",
        "Le13;",
        "navigator",
        "LBa;",
        "c",
        "LBa;",
        "ui",
        "<init>",
        "(LEa;Le13;LBa;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnalyticsEventDetailDebuggerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsEventDetailDebuggerPresenter.kt\nco/bird/android/app/feature/settings/analytics/AnalyticsEventDetailDebuggerPresenter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,38:1\n215#2,2:39\n*S KotlinDebug\n*F\n+ 1 AnalyticsEventDetailDebuggerPresenter.kt\nco/bird/android/app/feature/settings/analytics/AnalyticsEventDetailDebuggerPresenter\n*L\n30#1:39,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LEa;

.field public final b:Le13;

.field public final c:LBa;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LEa;Le13;LBa;)V
    .locals 1

    const-string v0, "analyticsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxa;->a:LEa;

    iput-object p2, p0, Lxa;->b:Le13;

    iput-object p3, p0, Lxa;->c:LBa;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)V
    .locals 3

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item_index"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-ltz p1, :cond_0

    iget-object v0, p0, Lxa;->a:LEa;

    invoke-interface {v0}, LEa;->e()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/analytics/AnalyticsDebugEvent;

    iget-object v0, p0, Lxa;->c:LBa;

    invoke-virtual {p1}, Lco/bird/android/model/analytics/AnalyticsDebugEvent;->getEvent()Lco/bird/android/model/analytics/AnalyticsEvent;

    move-result-object v1

    invoke-interface {v1}, Lco/bird/android/model/analytics/AnalyticsEvent;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LBa;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/analytics/AnalyticsDebugEvent;->getEvent()Lco/bird/android/model/analytics/AnalyticsEvent;

    move-result-object p1

    invoke-interface {p1}, Lco/bird/android/model/analytics/AnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Lxa;->c:LBa;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, LBa;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lxa;->b:Le13;

    invoke-interface {p1}, Le13;->close()V

    :cond_1
    return-void
.end method
