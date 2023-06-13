.class public final LoP3$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoP3;->b(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
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
.field public final synthetic g:LoP3;


# direct methods
.method public constructor <init>(LoP3;)V
    .locals 0

    iput-object p1, p0, LoP3$j;->g:LoP3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LoP3$j;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 1

    iget-object p1, p0, LoP3$j;->g:LoP3;

    invoke-static {p1}, LoP3;->access$getAnalyticsManager$p(LoP3;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/RiderFlightBarLocationServicesButtonTapped;

    invoke-direct {v0}, Lco/bird/android/model/analytics/RiderFlightBarLocationServicesButtonTapped;-><init>()V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, LoP3$j;->g:LoP3;

    invoke-static {p1}, LoP3;->access$getLocationManager$p(LoP3;)Ldr4;

    move-result-object p1

    invoke-interface {p1}, Ldr4;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LoP3$j;->g:LoP3;

    invoke-static {p1}, LoP3;->access$getNavigator$p(LoP3;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->C()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LoP3$j;->g:LoP3;

    invoke-static {p1}, LoP3;->access$getNavigator$p(LoP3;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->v1()V

    :goto_0
    return-void
.end method
