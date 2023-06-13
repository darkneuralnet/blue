.class public final LG71$k;
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
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LG71;


# direct methods
.method public constructor <init>(LG71;)V
    .locals 0

    iput-object p1, p0, LG71$k;->g:LG71;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V
    .locals 7

    iget-object p1, p0, LG71$k;->g:LG71;

    invoke-static {p1}, LG71;->access$getAnalyticsManager$p(LG71;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/IdSubmitted;

    sget-object v1, Lco/bird/android/model/analytics/IdSubmitted$IdSource;->SCAN:Lco/bird/android/model/analytics/IdSubmitted$IdSource;

    invoke-direct {v0, v1}, Lco/bird/android/model/analytics/IdSubmitted;-><init>(Lco/bird/android/model/analytics/IdSubmitted$IdSource;)V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, LG71$k;->g:LG71;

    invoke-static {p1}, LG71;->access$getAnalyticsManager$p(LG71;)LEa;

    move-result-object p1

    new-instance v6, LIP1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LIP1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v6}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object p1, p0, LG71$k;->g:LG71;

    invoke-static {p1}, LG71;->access$getEventBus$p(LG71;)LEg1;

    move-result-object p1

    new-instance v0, LP71;

    invoke-direct {v0}, LP71;-><init>()V

    invoke-interface {p1, v0}, LEg1;->c(Lg70;)V

    iget-object p1, p0, LG71$k;->g:LG71;

    invoke-static {p1}, LG71;->access$getNavigator$p(LG71;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->e3()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    invoke-virtual {p0, p1}, LG71$k;->a(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
