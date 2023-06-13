.class public final LIV1$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIV1;->t(Lco/bird/android/model/identification/IdentificationDocumentDescriptor;)V
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
.field public final synthetic g:LIV1;

.field public final synthetic h:Lco/bird/android/model/identification/IdentificationDocumentDescriptor;


# direct methods
.method public constructor <init>(LIV1;Lco/bird/android/model/identification/IdentificationDocumentDescriptor;)V
    .locals 0

    iput-object p1, p0, LIV1$l;->g:LIV1;

    iput-object p2, p0, LIV1$l;->h:Lco/bird/android/model/identification/IdentificationDocumentDescriptor;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LIV1$l;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, LIV1$l;->g:LIV1;

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-static {v1, v2}, LIV1;->access$displayDebugDetails(LIV1;Lco/bird/android/buava/Optional;)V

    iget-object v1, v0, LIV1$l;->g:LIV1;

    invoke-static {v1}, LIV1;->access$getIdentificationManager$p(LIV1;)LmT1;

    move-result-object v1

    invoke-interface {v1}, LmT1;->h()LoU1;

    move-result-object v1

    iget-object v2, v0, LIV1$l;->g:LIV1;

    invoke-static {v2}, LIV1;->access$getCapturedFileRelay$p(LIV1;)La94;

    move-result-object v2

    invoke-virtual {v2}, La94;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/Pair;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    iget-object v4, v0, LIV1$l;->g:LIV1;

    invoke-static {v4}, LIV1;->access$getCapturedFileRelay$p(LIV1;)La94;

    move-result-object v4

    invoke-virtual {v4}, La94;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/buava/Optional;

    invoke-virtual {v4}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/Pair;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-ne v4, v6, :cond_1

    move/from16 v16, v6

    goto :goto_1

    :cond_1
    move/from16 v16, v5

    :goto_1
    if-eqz v1, :cond_6

    if-nez v2, :cond_2

    goto/16 :goto_4

    :cond_2
    iget-object v4, v0, LIV1$l;->g:LIV1;

    iget-object v7, v0, LIV1$l;->h:Lco/bird/android/model/identification/IdentificationDocumentDescriptor;

    invoke-static {v4, v1, v2, v7}, LIV1;->access$updateSubmissionDataBasedOnDescriptor(LIV1;LoU1;Landroid/net/Uri;Lco/bird/android/model/identification/IdentificationDocumentDescriptor;)V

    iget-object v1, v0, LIV1$l;->g:LIV1;

    invoke-static {v1}, LIV1;->access$getHasSubmitted$p(LIV1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v1, v0, LIV1$l;->g:LIV1;

    invoke-static {v1}, LIV1;->access$getAnalyticsManager$p(LIV1;)LEa;

    move-result-object v1

    new-instance v2, LOP1;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    iget-object v4, v0, LIV1$l;->h:Lco/bird/android/model/identification/IdentificationDocumentDescriptor;

    invoke-virtual {v4}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/identification/IdentificationDocumentType;->toWire()Ljava/lang/String;

    move-result-object v11

    iget-object v4, v0, LIV1$l;->h:Lco/bird/android/model/identification/IdentificationDocumentDescriptor;

    invoke-virtual {v4}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getJurisdiction()Lco/bird/android/model/identification/IdentificationJurisdiction;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/identification/IdentificationJurisdiction;->getJurisdiction()Ljava/lang/String;

    move-result-object v12

    iget-object v4, v0, LIV1$l;->h:Lco/bird/android/model/identification/IdentificationDocumentDescriptor;

    invoke-virtual {v4}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getEntryMethodType()Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->toDocumentEntryMethod()Lco/bird/android/model/identification/IdentificationEntryMethod;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lco/bird/android/model/identification/IdentificationEntryMethod;->toWire()Ljava/lang/String;

    move-result-object v4

    move-object v13, v4

    goto :goto_2

    :cond_3
    move-object v13, v3

    :goto_2
    iget-object v4, v0, LIV1$l;->h:Lco/bird/android/model/identification/IdentificationDocumentDescriptor;

    invoke-virtual {v4}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getEntryMethodType()Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->toSelfieEntryMethod()Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;->toWire()Ljava/lang/String;

    move-result-object v3

    :cond_4
    move-object v14, v3

    sget-object v3, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->Companion:Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;

    iget-object v4, v0, LIV1$l;->h:Lco/bird/android/model/identification/IdentificationDocumentDescriptor;

    iget-object v7, v0, LIV1$l;->g:LIV1;

    invoke-static {v7}, LIV1;->access$getReactiveConfig$p(LIV1;)LTq4;

    move-result-object v7

    invoke-virtual {v7}, LTq4;->f8()LZ84;

    move-result-object v7

    invoke-virtual {v7}, LZ84;->a()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v7}, Lco/bird/android/model/wire/configs/Config;->getIdentificationConfig()Lco/bird/android/model/wire/configs/IdentificationConfig;

    move-result-object v7

    invoke-virtual {v3, v4, v7}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;->toStrategy(Lco/bird/android/model/identification/IdentificationDocumentDescriptor;Lco/bird/android/model/wire/configs/IdentificationConfig;)Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->getEnableAutoDetect()Z

    move-result v3

    if-ne v3, v6, :cond_5

    move v15, v6

    goto :goto_3

    :cond_5
    move v15, v5

    :goto_3
    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v3

    const-string v4, "now()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, LIV1$l;->g:LIV1;

    invoke-static {v4}, LIV1;->access$getInitialTime$p(LIV1;)Lorg/joda/time/DateTime;

    move-result-object v4

    invoke-static {v3, v4}, LpT0;->i(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)D

    move-result-wide v17

    const/16 v19, 0x7

    const/16 v20, 0x0

    move-object v7, v2

    invoke-direct/range {v7 .. v20}, LOP1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object v1, v0, LIV1$l;->g:LIV1;

    invoke-static {v1}, LIV1;->access$getNavigator$p(LIV1;)Le13;

    move-result-object v1

    const/4 v2, -0x1

    invoke-interface {v1, v2}, Le13;->b1(I)V

    return-void

    :cond_6
    :goto_4
    iget-object v1, v0, LIV1$l;->g:LIV1;

    invoke-static {v1}, LIV1;->access$getUi$p(LIV1;)LTV1;

    move-result-object v1

    invoke-virtual {v1}, LXC;->errorGeneric()V

    return-void
.end method
