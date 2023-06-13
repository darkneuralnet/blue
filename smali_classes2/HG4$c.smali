.class public final LHG4$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHG4;->C(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/BirdFraudReport;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/model/BirdFraudReport;",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/BirdFraudReport;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LHG4;


# direct methods
.method public constructor <init>(LHG4;)V
    .locals 0

    iput-object p1, p0, LHG4$c;->g:LHG4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/BirdFraudReport;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LHG4$c;->g:LHG4;

    invoke-static {v0}, LHG4;->access$getAnalyticsManager$p(LHG4;)LEa;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/analytics/ChargerReportFraudSubmitted;

    invoke-direct {v1}, Lco/bird/android/model/analytics/ChargerReportFraudSubmitted;-><init>()V

    invoke-interface {v0, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object v0, p0, LHG4$c;->g:LHG4;

    invoke-static {v0}, LHG4;->access$getEventBus$p(LHG4;)LEg1;

    move-result-object v0

    new-instance v1, LZy1;

    invoke-direct {v1, p1}, LZy1;-><init>(Lco/bird/android/model/BirdFraudReport;)V

    invoke-interface {v0, v1}, LEg1;->c(Lg70;)V

    iget-object p1, p0, LHG4$c;->g:LHG4;

    invoke-static {p1}, LHG4;->access$getNavigator$p(LHG4;)Le13;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iget-object v1, p0, LHG4$c;->g:LHG4;

    invoke-static {v1}, LHG4;->access$getBirdIds$p(LHG4;)Ljava/util/ArrayList;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "birdIds"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    const-string v2, "bird_ids"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "Intent().putExtra(Extras.BIRD_IDS, birdIds)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, -0x1

    invoke-interface {p1, v1, v0}, Le13;->e4(ILandroid/content/Intent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/BirdFraudReport;

    invoke-virtual {p0, p1}, LHG4$c;->a(Lco/bird/android/model/BirdFraudReport;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
