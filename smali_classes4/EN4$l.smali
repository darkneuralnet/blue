.class public final LEN4$l;
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
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
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
.field public final synthetic g:LEN4;

.field public final synthetic h:Landroid/content/Intent;


# direct methods
.method public constructor <init>(LEN4;Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, LEN4$l;->g:LEN4;

    iput-object p2, p0, LEN4$l;->h:Landroid/content/Intent;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LEN4$l;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, LEN4$l;->g:LEN4;

    invoke-static {v0}, LEN4;->access$getContext$p(LEN4;)Lco/bird/android/model/PhotoBannerContext;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/PhotoBannerContext;->ID_SCAN:Lco/bird/android/model/PhotoBannerContext;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LEN4$l;->g:LEN4;

    invoke-static {v0}, LEN4;->access$getAnalyticsManager$p(LEN4;)LEa;

    move-result-object v0

    new-instance v7, LMP1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LMP1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v7}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_0
    iget-object v0, p0, LEN4$l;->g:LEN4;

    invoke-static {v0}, LEN4;->access$getEventStream$p(LEN4;)LVq4;

    move-result-object v0

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, LVq4;->d(Ljava/lang/String;)V

    iget-object v0, p0, LEN4$l;->h:Landroid/content/Intent;

    const-string v1, "photo_url"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, LEN4$l;->g:LEN4;

    invoke-static {p1}, LEN4;->access$getNavigator$p(LEN4;)Le13;

    move-result-object p1

    const/4 v0, -0x1

    iget-object v1, p0, LEN4$l;->h:Landroid/content/Intent;

    invoke-interface {p1, v0, v1}, Le13;->e4(ILandroid/content/Intent;)V

    return-void
.end method
