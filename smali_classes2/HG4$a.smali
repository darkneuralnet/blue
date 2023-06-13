.class public final LHG4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHG4;->z(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHG4$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/android/model/BatchBirdFraudReport;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/android/model/BatchBirdFraudReport;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(LHM4;)V"
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

    iput-object p1, p0, LHG4$a;->g:LHG4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/BatchBirdFraudReport;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->f()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LHG4$a;->g:LHG4;

    invoke-static {p1}, LHG4;->access$getMapMode$p(LHG4;)Lco/bird/android/model/constant/MapMode;

    move-result-object p1

    sget-object v0, LHG4$a$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LHG4$a;->g:LHG4;

    invoke-static {p1}, LHG4;->access$getAnalyticsManager$p(LHG4;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/RiderBulkReportFraudSubmitted;

    invoke-direct {v0}, Lco/bird/android/model/analytics/RiderBulkReportFraudSubmitted;-><init>()V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    :cond_0
    iget-object p1, p0, LHG4$a;->g:LHG4;

    invoke-static {p1}, LHG4;->access$getNavigator$p(LHG4;)Le13;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iget-object v1, p0, LHG4$a;->g:LHG4;

    invoke-static {v1}, LHG4;->access$getBirdIds$p(LHG4;)Ljava/util/ArrayList;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "birdIds"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_1
    const-string v2, "bird_ids"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "Intent().putExtra(Extras.BIRD_IDS, birdIds)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, -0x1

    invoke-interface {p1, v1, v0}, Le13;->e4(ILandroid/content/Intent;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, LHG4$a;->g:LHG4;

    invoke-static {p1}, LHG4;->access$getUi$p(LHG4;)LIG4;

    move-result-object p1

    sget v0, Lnl4;->error_generic_body:I

    invoke-interface {p1, v0}, LaM5;->error(I)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LHG4$a;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
