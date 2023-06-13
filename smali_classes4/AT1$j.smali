.class public final LAT1$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAT1;->k(LoU1;Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/identification/IdentificationRequestIdentifier;",
        "+",
        "Lco/bird/android/model/identification/IdentificationEntryMethod;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/identification/IdentificationRequestIdentifier;",
        "Lco/bird/android/model/identification/IdentificationEntryMethod;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lkotlin/Pair;)Lio/reactivex/K;"
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

.field public final synthetic h:LoU1;


# direct methods
.method public constructor <init>(LAT1;LoU1;)V
    .locals 0

    iput-object p1, p0, LAT1$j;->g:LAT1;

    iput-object p2, p0, LAT1$j;->h:LoU1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;)Lio/reactivex/K;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/identification/IdentificationRequestIdentifier;",
            "+",
            "Lco/bird/android/model/identification/IdentificationEntryMethod;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lco/bird/android/model/identification/IdentificationRequestIdentifier;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lco/bird/android/model/identification/IdentificationEntryMethod;

    iget-object v1, p0, LAT1$j;->g:LAT1;

    iget-object p1, p0, LAT1$j;->h:LoU1;

    invoke-virtual {p1}, LoU1;->d()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v4

    iget-object p1, p0, LAT1$j;->h:LoU1;

    invoke-virtual {p1}, LoU1;->b()Lco/bird/android/model/identification/IdentificationAcceptableMethod;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getSelfieEntryMethod()Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    move-result-object v5

    const/4 v6, 0x0

    iget-object p1, p0, LAT1$j;->h:LoU1;

    invoke-virtual {p1}, LoU1;->e()Ljava/util/Locale;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    iget-object p1, p0, LAT1$j;->g:LAT1;

    iget-object v0, p0, LAT1$j;->h:LoU1;

    invoke-static {p1, v0}, LAT1;->access$toProcessedSubmissionData(LAT1;LoU1;)Lco/bird/android/model/identification/IdentificationSubmissionData;

    move-result-object v10

    invoke-virtual/range {v1 .. v10}, LAT1;->d(Lco/bird/android/model/identification/IdentificationRequestIdentifier;Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationDocumentType;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/identification/IdentificationSubmissionData;)Lio/reactivex/F;

    move-result-object p1

    const-wide/16 v0, 0x3

    invoke-virtual {p1, v0, v1}, Lio/reactivex/F;->T(J)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LAT1$j;->a(Lkotlin/Pair;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
