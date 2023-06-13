.class public final LAT1$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAT1;->d(Lco/bird/android/model/identification/IdentificationRequestIdentifier;Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationDocumentType;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/identification/IdentificationSubmissionData;)Lio/reactivex/F;
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
        "status",
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
.field public final synthetic g:LAT1;

.field public final synthetic h:Lco/bird/android/model/identification/IdentificationRequestIdentifier;

.field public final synthetic i:Lco/bird/android/model/identification/IdentificationDocumentType;

.field public final synthetic j:Lco/bird/android/model/identification/IdentificationEntryMethod;

.field public final synthetic k:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/lang/String;


# direct methods
.method public constructor <init>(LAT1;Lco/bird/android/model/identification/IdentificationRequestIdentifier;Lco/bird/android/model/identification/IdentificationDocumentType;Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LAT1$i;->g:LAT1;

    iput-object p2, p0, LAT1$i;->h:Lco/bird/android/model/identification/IdentificationRequestIdentifier;

    iput-object p3, p0, LAT1$i;->i:Lco/bird/android/model/identification/IdentificationDocumentType;

    iput-object p4, p0, LAT1$i;->j:Lco/bird/android/model/identification/IdentificationEntryMethod;

    iput-object p5, p0, LAT1$i;->k:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    iput-object p6, p0, LAT1$i;->l:Ljava/lang/String;

    iput-object p7, p0, LAT1$i;->m:Ljava/lang/String;

    iput-object p8, p0, LAT1$i;->n:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V
    .locals 13

    iget-object v0, p0, LAT1$i;->g:LAT1;

    invoke-static {v0}, LAT1;->access$getApiResponseIdentificationStatusRelay$p(LAT1;)La94;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    new-instance v2, LZV1;

    iget-object v3, p0, LAT1$i;->h:Lco/bird/android/model/identification/IdentificationRequestIdentifier;

    const-string v4, "status"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3, p1}, LZV1;-><init>(Lco/bird/android/model/identification/IdentificationRequestIdentifier;Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V

    invoke-virtual {v1, v2}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v0, p1}, La94;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, LAT1$i;->g:LAT1;

    invoke-static {p1}, LAT1;->access$getDateTimeLock$p(LAT1;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LAT1$i;->g:LAT1;

    monitor-enter p1

    :try_start_0
    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-static {v0, v1}, LAT1;->access$setLastSubmissionDateTime$p(LAT1;Lorg/joda/time/DateTime;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    iget-object p1, p0, LAT1$i;->g:LAT1;

    invoke-static {p1}, LAT1;->access$getAnalyticsManager$p(LAT1;)LEa;

    move-result-object p1

    new-instance v12, LZP1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v0, p0, LAT1$i;->i:Lco/bird/android/model/identification/IdentificationDocumentType;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/identification/IdentificationDocumentType;->toWire()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "unknown"

    :cond_1
    move-object v4, v0

    iget-object v0, p0, LAT1$i;->j:Lco/bird/android/model/identification/IdentificationEntryMethod;

    invoke-virtual {v0}, Lco/bird/android/model/identification/IdentificationEntryMethod;->toWire()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, LAT1$i;->k:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;->toWire()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    move-object v6, v0

    iget-object v7, p0, LAT1$i;->l:Ljava/lang/String;

    iget-object v8, p0, LAT1$i;->m:Ljava/lang/String;

    iget-object v9, p0, LAT1$i;->n:Ljava/lang/String;

    const/4 v10, 0x7

    const/4 v11, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, LZP1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v12}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    invoke-virtual {p0, p1}, LAT1$i;->a(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
