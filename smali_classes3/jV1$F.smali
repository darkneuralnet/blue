.class public final LjV1$F;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjV1;->o0()V
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIdentificationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationPresenter.kt\nco/bird/android/feature/identification/IdentificationPresenter$initializeUiClickCallbacks$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,511:1\n1#2:512\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LjV1;


# direct methods
.method public constructor <init>(LjV1;)V
    .locals 0

    iput-object p1, p0, LjV1$F;->g:LjV1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LjV1$F;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, LjV1$F;->g:LjV1;

    invoke-static {v1}, LjV1;->access$getCurrentAcceptableMethod$p(LjV1;)La94;

    move-result-object v1

    invoke-virtual {v1}, La94;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lco/bird/android/model/identification/IdentificationAcceptableMethod;

    if-nez v5, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, LjV1$F;->g:LjV1;

    invoke-static {v1}, LjV1;->access$getAppPreference$p(LjV1;)Lgl;

    move-result-object v1

    iget-object v2, v0, LjV1$F;->g:LjV1;

    invoke-static {v2}, LjV1;->access$getCurrentLocale$p(LjV1;)La94;

    move-result-object v2

    invoke-virtual {v2}, La94;->getValue()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "currentLocale.value"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/Locale;

    invoke-virtual {v1, v2}, Lgl;->b2(Ljava/util/Locale;)V

    iget-object v1, v0, LjV1$F;->g:LjV1;

    invoke-static {v1}, LjV1;->access$getAppPreference$p(LjV1;)Lgl;

    move-result-object v1

    iget-object v2, v0, LjV1$F;->g:LjV1;

    invoke-static {v2}, LjV1;->access$getCurrentDocumentType$p(LjV1;)La94;

    move-result-object v2

    invoke-virtual {v2}, La94;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/identification/IdentificationDocumentType;

    invoke-virtual {v1, v2}, Lgl;->a2(Lco/bird/android/model/identification/IdentificationDocumentType;)V

    iget-object v1, v0, LjV1$F;->g:LjV1;

    invoke-static {v1}, LjV1;->access$getCurrentDebugResponse$p(LjV1;)La94;

    move-result-object v1

    invoke-virtual {v1}, La94;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/identification/IdentificationDebugResponse;

    if-eqz v1, :cond_1

    iget-object v2, v0, LjV1$F;->g:LjV1;

    invoke-static {v2}, LjV1;->access$getAppPreference$p(LjV1;)Lgl;

    move-result-object v2

    invoke-virtual {v2, v1}, Lgl;->Z1(Lco/bird/android/model/identification/IdentificationDebugResponse;)V

    :cond_1
    iget-object v1, v0, LjV1$F;->g:LjV1;

    invoke-static {v1}, LjV1;->access$getIdentificationManager$p(LjV1;)LmT1;

    move-result-object v1

    new-instance v8, LoU1;

    iget-object v2, v0, LjV1$F;->g:LjV1;

    invoke-static {v2}, LjV1;->access$getCurrentLocale$p(LjV1;)La94;

    move-result-object v2

    invoke-virtual {v2}, La94;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v2

    check-cast v3, Ljava/util/Locale;

    iget-object v2, v0, LjV1$F;->g:LjV1;

    invoke-static {v2}, LjV1;->access$getCurrentDocumentType$p(LjV1;)La94;

    move-result-object v2

    invoke-virtual {v2}, La94;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lco/bird/android/model/identification/IdentificationDocumentType;

    iget-object v2, v0, LjV1$F;->g:LjV1;

    invoke-static {v2}, LjV1;->access$getCurrentDebugResponse$p(LjV1;)La94;

    move-result-object v2

    invoke-virtual {v2}, La94;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lco/bird/android/model/identification/IdentificationDebugResponse;

    new-instance v7, Lco/bird/android/model/identification/IdentificationSubmissionData;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x1f

    const/16 v16, 0x0

    move-object v9, v7

    invoke-direct/range {v9 .. v16}, Lco/bird/android/model/identification/IdentificationSubmissionData;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LoU1;-><init>(Ljava/util/Locale;Lco/bird/android/model/identification/IdentificationDocumentType;Lco/bird/android/model/identification/IdentificationAcceptableMethod;Lco/bird/android/model/identification/IdentificationDebugResponse;Lco/bird/android/model/identification/IdentificationSubmissionData;)V

    invoke-interface {v1, v8}, LmT1;->f(LoU1;)V

    iget-object v1, v0, LjV1$F;->g:LjV1;

    invoke-static {v1}, LjV1;->access$getNavigator$p(LjV1;)Le13;

    move-result-object v1

    const/16 v2, 0x2739

    invoke-interface {v1, v2}, Le13;->c1(I)V

    return-void
.end method
