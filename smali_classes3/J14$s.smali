.class public final LJ14$s;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ14;->b(Ljava/util/Map;)Lio/reactivex/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LJ14;


# direct methods
.method public constructor <init>(LJ14;)V
    .locals 0

    iput-object p1, p0, LJ14$s;->g:LJ14;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LJ14$s;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, LJ14$s;->g:LJ14;

    invoke-static {v1}, LJ14;->access$getAnalyticsManager$p(LJ14;)LEa;

    move-result-object v1

    new-instance v14, Ls04;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v2, v0, LJ14$s;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getContextForAnalytics$p(LJ14;)Ljava/lang/String;

    move-result-object v6

    iget-object v2, v0, LJ14$s;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getReactiveConfig$p(LJ14;)LTq4;

    move-result-object v2

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object v7

    iget-object v2, v0, LJ14$s;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getLatestPreloadOptionsAvailable$p(LJ14;)Li04;

    move-result-object v2

    const/4 v8, 0x1

    const/4 v13, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Li04;->e()Z

    move-result v2

    if-ne v2, v8, :cond_0

    move v9, v8

    goto :goto_0

    :cond_0
    move v9, v13

    :goto_0
    iget-object v2, v0, LJ14$s;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getLatestPreloadOptionsAvailable$p(LJ14;)Li04;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Li04;->d()Z

    move-result v2

    if-ne v2, v8, :cond_1

    move v10, v8

    goto :goto_1

    :cond_1
    move v10, v13

    :goto_1
    iget-object v2, v0, LJ14$s;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getLatestPreloadOptionsAvailable$p(LJ14;)Li04;

    move-result-object v2

    const/4 v8, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Li04;->f()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v8

    :goto_2
    const-string v11, "_included_pay_per_ride"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "PreloadAndMaybeAutoReloadFlow Error: "

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const/16 v19, 0x0

    iget-object v2, v0, LJ14$s;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getLatestPreloadOptionsAvailable$p(LJ14;)Li04;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Li04;->f()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v20, v2

    goto :goto_3

    :cond_3
    move-object/from16 v20, v8

    :goto_3
    iget-object v2, v0, LJ14$s;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getCurrentOptionModelSelected$p(LJ14;)Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LS04;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, LS04;->b()Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v21, v2

    goto :goto_4

    :cond_4
    move-object/from16 v21, v8

    :goto_4
    const/4 v15, 0x0

    iget-object v2, v0, LJ14$s;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getPreference$p(LJ14;)Lgl;

    move-result-object v2

    invoke-virtual {v2}, Lgl;->m0()Ljava/lang/Boolean;

    move-result-object v16

    const/16 v17, 0x1007

    const/16 v18, 0x0

    move-object v2, v14

    move v8, v9

    move v9, v10

    move v10, v11

    move-object v11, v12

    move-object/from16 v12, v19

    move-object/from16 v13, v20

    move-object v0, v14

    move-object/from16 v14, v21

    invoke-direct/range {v2 .. v18}, Ls04;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v0}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    const-string v0, "error while handling preload and maybe auto reload: "

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p1

    invoke-static {v2, v0, v1}, Lg46;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
