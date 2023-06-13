.class public final LG71$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG71;->z(Lco/bird/android/model/BarcodeDriversLicense;)Lio/reactivex/c;
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
        "error",
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
.field public final synthetic g:LG71;


# direct methods
.method public constructor <init>(LG71;)V
    .locals 0

    iput-object p1, p0, LG71$l;->g:LG71;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LG71$l;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 8

    iget-object v0, p0, LG71$l;->g:LG71;

    invoke-static {v0}, LG71;->access$getAnalyticsManager$p(LG71;)LEa;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/analytics/IdStoreFailed;

    invoke-direct {v1}, Lco/bird/android/model/analytics/IdStoreFailed;-><init>()V

    invoke-interface {v0, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object v0, p0, LG71$l;->g:LG71;

    invoke-static {v0}, LG71;->access$getAnalyticsManager$p(LG71;)LEa;

    move-result-object v0

    new-instance v7, LHP1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LHP1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v7}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    instance-of v0, p1, Lco/bird/api/error/RetrofitException;

    if-eqz v0, :cond_0

    iget-object v0, p0, LG71$l;->g:LG71;

    invoke-static {v0}, LG71;->access$getUi$p(LG71;)LM71;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Lco/bird/api/error/RetrofitException;

    const-class v2, Ltg1;

    invoke-virtual {v1, v2}, Lco/bird/api/error/RetrofitException;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltg1;

    invoke-virtual {v1}, Ltg1;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LaM5;->error(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LG71$l;->g:LG71;

    invoke-static {v0}, LG71;->access$getUi$p(LG71;)LM71;

    move-result-object v0

    sget v1, Lnl4;->failed_to_validate_driver_license:I

    invoke-interface {v0, v1}, LaM5;->error(I)V

    :goto_0
    iget-object v0, p0, LG71$l;->g:LG71;

    invoke-static {v0}, LG71;->access$getNavigator$p(LG71;)Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->e3()V

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    return-void
.end method
