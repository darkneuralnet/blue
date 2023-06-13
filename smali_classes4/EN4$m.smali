.class public final LEN4$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEN4;->E([BLandroid/content/Intent;)V
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
        "e",
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
.field public final synthetic g:LEN4;


# direct methods
.method public constructor <init>(LEN4;)V
    .locals 0

    iput-object p1, p0, LEN4$m;->g:LEN4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LEN4$m;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 8

    iget-object v0, p0, LEN4$m;->g:LEN4;

    invoke-static {v0}, LEN4;->access$getContext$p(LEN4;)Lco/bird/android/model/PhotoBannerContext;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/PhotoBannerContext;->ID_SCAN:Lco/bird/android/model/PhotoBannerContext;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LEN4$m;->g:LEN4;

    invoke-static {v0}, LEN4;->access$getAnalyticsManager$p(LEN4;)LEa;

    move-result-object v0

    new-instance v7, LLP1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LLP1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v7}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_0
    iget-object v0, p0, LEN4$m;->g:LEN4;

    invoke-static {v0}, LEN4;->access$getUi$p(LEN4;)LFN4;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v3, v1, v2}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    iget-object v0, p0, LEN4$m;->g:LEN4;

    invoke-static {v0}, LEN4;->access$getUi$p(LEN4;)LFN4;

    move-result-object v0

    invoke-interface {v0}, LFN4;->nh()V

    iget-object v0, p0, LEN4$m;->g:LEN4;

    invoke-static {v0}, LEN4;->access$getUi$p(LEN4;)LFN4;

    move-result-object v0

    const-string v1, "e"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, LaM5;->error(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    return-void
.end method
