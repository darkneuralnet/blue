.class public final Lco/bird/android/manager/analytics/AnalyticsManagerImpl$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->C()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/AnalyticsEntity;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/AnalyticsEntity;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/persistence/AnalyticsEntity;",
        "events",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/util/List;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$k;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$k;->c(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$events"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/List;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/AnalyticsEntity;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/AnalyticsEntity;",
            ">;>;"
        }
    .end annotation

    const-string v0, "events"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/CreateAnalyticsEventsBody;

    invoke-direct {v0, p1}, Lco/bird/api/request/CreateAnalyticsEventsBody;-><init>(Ljava/util/List;)V

    iget-object v1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$k;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;

    invoke-static {v1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->access$getUserStream$p(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)LRh6;

    move-result-object v1

    invoke-interface {v1}, LRh6;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$k;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;

    invoke-static {v1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->access$getClient$p(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)LZ9;

    move-result-object v1

    invoke-interface {v1, v0}, LZ9;->b(Lco/bird/api/request/CreateAnalyticsEventsBody;)Lio/reactivex/F;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$k;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;

    invoke-static {v1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->access$getUnauthenticatedClient$p(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)Lab;

    move-result-object v1

    invoke-interface {v1, v0}, Lab;->a(Lco/bird/api/request/CreateAnalyticsEventsBody;)Lio/reactivex/F;

    move-result-object v0

    :goto_0
    new-instance v1, LTa;

    invoke-direct {v1, p1}, LTa;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$k;->b(Ljava/util/List;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
