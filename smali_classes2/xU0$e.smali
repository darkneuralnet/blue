.class public final LxU0$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LxU0;->J(Lco/bird/android/model/Deal;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "enabled",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)V"
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
.field public final synthetic g:LxU0;

.field public final synthetic h:Lco/bird/android/model/Deal;


# direct methods
.method public constructor <init>(LxU0;Lco/bird/android/model/Deal;)V
    .locals 0

    iput-object p1, p0, LxU0$e;->g:LxU0;

    iput-object p2, p0, LxU0$e;->h:Lco/bird/android/model/Deal;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LxU0$e;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 4

    const-string v0, "enabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LxU0$e;->g:LxU0;

    invoke-static {p1}, LxU0;->access$getUi$p(LxU0;)LCU0;

    move-result-object p1

    iget-object v0, p0, LxU0$e;->h:Lco/bird/android/model/Deal;

    invoke-interface {p1, v0}, LCU0;->Dk(Lco/bird/android/model/Deal;)V

    iget-object p1, p0, LxU0$e;->g:LxU0;

    invoke-static {p1}, LxU0;->access$getDealRelay$p(LxU0;)La94;

    move-result-object p1

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    iget-object v1, p0, LxU0$e;->h:Lco/bird/android/model/Deal;

    invoke-virtual {v0, v1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, LxU0$e;->g:LxU0;

    invoke-static {p1}, LxU0;->access$getDealManager$p(LxU0;)LJT0;

    move-result-object p1

    iget-object v0, p0, LxU0$e;->h:Lco/bird/android/model/Deal;

    invoke-interface {p1, v0}, LJT0;->g(Lco/bird/android/model/Deal;)V

    iget-object p1, p0, LxU0$e;->g:LxU0;

    invoke-static {p1}, LxU0;->access$getAnalyticsManager$p(LxU0;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/BonusDealScreenShown;

    iget-object v1, p0, LxU0$e;->h:Lco/bird/android/model/Deal;

    iget-object v2, p0, LxU0$e;->g:LxU0;

    invoke-static {v2}, LxU0;->access$getPreferences$p(LxU0;)Lgl;

    move-result-object v2

    invoke-virtual {v2}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, LxU0$e;->h:Lco/bird/android/model/Deal;

    invoke-virtual {v3}, Lco/bird/android/model/Deal;->getDuration()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lco/bird/android/model/analytics/BonusDealScreenShown;-><init>(Lco/bird/android/model/Deal;Ljava/lang/String;I)V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, LxU0$e;->g:LxU0;

    invoke-static {p1}, LxU0;->access$getNavigator$p(LxU0;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    :goto_1
    return-void
.end method
