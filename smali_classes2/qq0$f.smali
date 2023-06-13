.class public final Lqq0$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqq0;->b(Landroid/content/Intent;)V
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
.field public final synthetic g:Lqq0;


# direct methods
.method public constructor <init>(Lqq0;)V
    .locals 0

    iput-object p1, p0, Lqq0$f;->g:Lqq0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lqq0$f;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 6

    iget-object p1, p0, Lqq0$f;->g:Lqq0;

    invoke-static {p1}, Lqq0;->access$getAnalyticsManager$p(Lqq0;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/RiderBulkReportFraudButtonClicked;

    invoke-direct {v0}, Lco/bird/android/model/analytics/RiderBulkReportFraudButtonClicked;-><init>()V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, Lqq0$f;->g:Lqq0;

    invoke-static {p1}, Lqq0;->access$getNavigator$p(Lqq0;)Le13;

    move-result-object v0

    iget-object p1, p0, Lqq0$f;->g:Lqq0;

    invoke-static {p1}, Lqq0;->access$getRole$p(Lqq0;)Lco/bird/android/model/constant/MapMode;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "role"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    move-object v1, p1

    const/4 v2, 0x0

    sget-object p1, LuI4;->b:LuI4;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Le13$a;->goToReportMultipleBirdsFraud$default(Le13;Lco/bird/android/model/constant/MapMode;Lcom/google/android/gms/maps/model/CameraPosition;Ljava/lang/Integer;ILjava/lang/Object;)V

    return-void
.end method
