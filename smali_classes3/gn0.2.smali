.class public final Lgn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Len0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0008\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "Lgn0;",
        "Len0;",
        "",
        "d",
        "c",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Lio/reactivex/c;",
        "e",
        "b",
        "",
        "action",
        "a",
        "LEa;",
        "LEa;",
        "analyticsManager",
        "LGt5;",
        "LGt5;",
        "serviceCenterManager",
        "LOh;",
        "LOh;",
        "appBuildConfig",
        "Ljava/lang/String;",
        "sessionId",
        "Lco/bird/android/model/wire/WireBird;",
        "",
        "f",
        "Z",
        "actionTaken",
        "<init>",
        "(LEa;LGt5;LOh;)V",
        "co.bird.android.feature.commandcenter"
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
        "SMAP\nCommandCenterAnalyticsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandCenterAnalyticsManager.kt\nco/bird/android/feature/commandcenter/analytics/CommandCenterAnalyticsManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LEa;

.field public final b:LGt5;

.field public final c:LOh;

.field public d:Ljava/lang/String;

.field public e:Lco/bird/android/model/wire/WireBird;

.field public f:Z


# direct methods
.method public constructor <init>(LEa;LGt5;LOh;)V
    .locals 1

    const-string v0, "analyticsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serviceCenterManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appBuildConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgn0;->a:LEa;

    iput-object p2, p0, Lgn0;->b:LGt5;

    iput-object p3, p0, Lgn0;->c:LOh;

    return-void
.end method

.method public static final synthetic access$getAnalyticsManager$p(Lgn0;)LEa;
    .locals 0

    iget-object p0, p0, Lgn0;->a:LEa;

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lgn0;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 11

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, p0, Lgn0;->d:Ljava/lang/String;

    if-eqz v6, :cond_1

    iget-object v0, p0, Lgn0;->e:Lco/bird/android/model/wire/WireBird;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lgn0;->f:Z

    iget-object v10, p0, Lgn0;->a:LEa;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lln0;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v8, 0xd

    const/4 v9, 0x0

    move-object v1, v0

    move-object v7, p1

    invoke-direct/range {v1 .. v9}, Lln0;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v10, v0}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot track CTA click without scanning a vehicle"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot track CTA click before starting a session"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()V
    .locals 12

    iget-object v5, p0, Lgn0;->d:Ljava/lang/String;

    iget-object v0, p0, Lgn0;->e:Lco/bird/android/model/wire/WireBird;

    const/4 v9, 0x0

    if-eqz v5, :cond_0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v9

    :goto_0
    if-eqz v1, :cond_1

    iget-object v10, p0, Lgn0;->a:LEa;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v2

    iget-boolean v6, p0, Lgn0;->f:Z

    new-instance v11, Ltn0;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v7, 0xd

    const/4 v8, 0x0

    move-object v0, v11

    invoke-direct/range {v0 .. v8}, Ltn0;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v10, v11}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lgn0;->d:Ljava/lang/String;

    iput-object v0, p0, Lgn0;->e:Lco/bird/android/model/wire/WireBird;

    iput-boolean v9, p0, Lgn0;->f:Z

    return-void

    :cond_1
    :try_start_0
    const-string v0, "Cannot end a session before starting a session"

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lgn0;->c:LOh;

    invoke-interface {v1}, LOh;->k()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {v0}, Lg46;->e(Ljava/lang/Throwable;)V

    return-void

    :cond_2
    throw v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lgn0;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lgn0;->d()V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 12

    const/4 v0, 0x0

    iput-boolean v0, p0, Lgn0;->f:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lgn0;->e:Lco/bird/android/model/wire/WireBird;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v0, "randomUUID().toString()"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, p0, Lgn0;->d:Ljava/lang/String;

    iget-object v0, p0, Lgn0;->a:LEa;

    new-instance v11, Lmn0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x77

    const/4 v10, 0x0

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lmn0;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v11}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public e(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/c;
    .locals 3

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lgn0;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lgn0;->e:Lco/bird/android/model/wire/WireBird;

    iget-object v1, p0, Lgn0;->b:LGt5;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, LGt5;->b(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v1

    invoke-static {v1}, Lag5;->h(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v1

    new-instance v2, Lgn0$a;

    invoke-direct {v2, p0, p1, v0}, Lgn0$a;-><init>(Lgn0;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;)V

    new-instance p1, Lfn0;

    invoke-direct {p1, v2}, Lfn0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    const-string v0, "override fun scannedBird\u2026     .ignoreElement()\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot track a vehicle scan before starting a session"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
