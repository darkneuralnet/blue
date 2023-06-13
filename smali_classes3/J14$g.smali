.class public final LJ14$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ14;->F(LK14;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LJ14$b;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LJ14$b;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(LJ14$b;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LJ14;


# direct methods
.method public constructor <init>(LJ14;)V
    .locals 0

    iput-object p1, p0, LJ14$g;->g:LJ14;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ14$b;)V
    .locals 11

    invoke-virtual {p1}, LJ14$b;->a()Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, LJ14$b;->b()Z

    move-result v6

    invoke-virtual {p1}, LJ14$b;->c()Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, LJ14$b;->d()Z

    move-result v7

    iget-object p1, p0, LJ14$g;->g:LJ14;

    invoke-static {p1}, LJ14;->access$getHasCalledShownEvent$p(LJ14;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LJ14$g;->g:LJ14;

    const/4 v0, 0x1

    invoke-static {p1, v0}, LJ14;->access$setHasCalledShownEvent$p(LJ14;Z)V

    iget-object p1, p0, LJ14$g;->g:LJ14;

    invoke-static {p1}, LJ14;->access$getAnalyticsManager$p(LJ14;)LEa;

    move-result-object p1

    new-instance v10, Lu04;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v0, p0, LJ14$g;->g:LJ14;

    invoke-static {v0}, LJ14;->access$getContextForAnalytics$p(LJ14;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, LJ14$g;->g:LJ14;

    invoke-static {v0}, LJ14;->access$getReactiveConfig$p(LJ14;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x7

    const/4 v9, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lu04;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v10}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ14$b;

    invoke-virtual {p0, p1}, LJ14$g;->a(LJ14$b;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
