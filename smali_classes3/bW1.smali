.class public final LbW1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LbW1$a;,
        LbW1$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 %2\u00020\u0001:\u0001\u000bB1\u0008\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u00a2\u0006\u0004\u0008#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008J\u0008\u0010\u000b\u001a\u00020\u0002H\u0002J\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u001eR\u0016\u0010\"\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006&"
    }
    d2 = {
        "LbW1;",
        "",
        "",
        "d",
        "e",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "c",
        "a",
        "Lco/bird/android/model/identification/IdentificationSubmissionData;",
        "Lco/bird/android/model/identification/IdentificationDocumentDescriptor;",
        "descriptor",
        "",
        "b",
        "LmT1;",
        "LmT1;",
        "identificationManager",
        "Lcom/uber/autodispose/ScopeProvider;",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "Le13;",
        "Le13;",
        "navigator",
        "Lgl;",
        "Lgl;",
        "appPreference",
        "LEa;",
        "LEa;",
        "analyticsManager",
        "f",
        "Z",
        "backPressed",
        "<init>",
        "(LmT1;Lcom/uber/autodispose/ScopeProvider;Le13;Lgl;LEa;)V",
        "g",
        "co.bird.android.feature.identification"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LbW1$a;


# instance fields
.field public final a:LmT1;

.field public final b:Lcom/uber/autodispose/ScopeProvider;

.field public final c:Le13;

.field public final d:Lgl;

.field public final e:LEa;

.field public f:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LbW1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LbW1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LbW1;->g:LbW1$a;

    return-void
.end method

.method public constructor <init>(LmT1;Lcom/uber/autodispose/ScopeProvider;Le13;Lgl;LEa;)V
    .locals 1

    const-string v0, "identificationManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appPreference"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LbW1;->a:LmT1;

    iput-object p2, p0, LbW1;->b:Lcom/uber/autodispose/ScopeProvider;

    iput-object p3, p0, LbW1;->c:Le13;

    iput-object p4, p0, LbW1;->d:Lgl;

    iput-object p5, p0, LbW1;->e:LEa;

    return-void
.end method

.method public static final synthetic access$getNavigator$p(LbW1;)Le13;
    .locals 0

    iget-object p0, p0, LbW1;->c:Le13;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LbW1;->c:Le13;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Le13;->b1(I)V

    return-void
.end method

.method public final b(Lco/bird/android/model/identification/IdentificationSubmissionData;Lco/bird/android/model/identification/IdentificationDocumentDescriptor;)Z
    .locals 3

    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getEntryMethodType()Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    move-result-object p2

    sget-object v0, LbW1$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p2, v1, :cond_3

    const/4 v2, 0x2

    if-eq p2, v2, :cond_2

    const/4 v2, 0x3

    if-eq p2, v2, :cond_1

    const/4 v2, 0x4

    if-ne p2, v2, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationSubmissionData;->getSelfieVideo()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v1

    if-ne p1, v1, :cond_4

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationSubmissionData;->getSelfiePhoto()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v1

    if-ne p1, v1, :cond_4

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationSubmissionData;->getDocumentBack()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v1

    if-ne p1, v1, :cond_4

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationSubmissionData;->getDocumentFront()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v1

    if-ne p1, v1, :cond_4

    :goto_0
    move v0, v1

    :cond_4
    return v0
.end method

.method public final c(IILandroid/content/Intent;)V
    .locals 0

    if-nez p2, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, LbW1;->f:Z

    invoke-virtual {p0}, LbW1;->a()V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 0

    return-void
.end method

.method public final e()V
    .locals 9

    iget-boolean v0, p0, LbW1;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LbW1;->a:LmT1;

    invoke-interface {v0}, LmT1;->h()LoU1;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LbW1;->a()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const-string v0, "IdentificationTrampolinePresenter was resumed but no partial submission data exists"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {v0}, LoU1;->b()Lco/bird/android/model/identification/IdentificationAcceptableMethod;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->requiredEntryMethodTypes()Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, LbW1;->a()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const-string v0, "IdentificationTrampolinePresenter was resumed but a document entry method was not found or had no sides to scan for"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    new-instance v4, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;

    invoke-virtual {v0}, LoU1;->d()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v5

    new-instance v6, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    invoke-virtual {v0}, LoU1;->e()Ljava/util/Locale;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v7

    const-string v8, "partialData.locale.country"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v7}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5, v6, v3}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;-><init>(Lco/bird/android/model/identification/IdentificationDocumentType;Lco/bird/android/model/identification/IdentificationJurisdiction;Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;)V

    invoke-virtual {v0}, LoU1;->f()Lco/bird/android/model/identification/IdentificationSubmissionData;

    move-result-object v3

    invoke-virtual {p0, v3, v4}, LbW1;->b(Lco/bird/android/model/identification/IdentificationSubmissionData;Lco/bird/android/model/identification/IdentificationDocumentDescriptor;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, LbW1;->c:Le13;

    const/16 v1, 0x2738

    invoke-interface {v0, v4, v1}, Le13;->a(Lco/bird/android/model/identification/IdentificationDocumentDescriptor;I)V

    return-void

    :cond_4
    const-string v2, "All submission requirements met, starting submission process"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, LbW1;->a:LmT1;

    new-instance v2, LbW1$c;

    invoke-direct {v2, p0}, LbW1$c;-><init>(LbW1;)V

    invoke-interface {v1, v0, v2}, LmT1;->k(LoU1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
