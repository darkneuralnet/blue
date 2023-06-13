.class public final LAT1$m;
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


# direct methods
.method public constructor <init>(LAT1;)V
    .locals 0

    iput-object p1, p0, LAT1$m;->g:LAT1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V
    .locals 4

    iget-object v0, p0, LAT1$m;->g:LAT1;

    invoke-static {v0}, LAT1;->access$getMutableBackgroundSubmissionStates$p(LAT1;)La94;

    move-result-object v0

    sget-object v1, LcT1;->a:LcT1;

    invoke-virtual {v0, v1}, La94;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, LAT1$m;->g:LAT1;

    invoke-static {v0}, LAT1;->access$getApiResponseIdentificationStatusRelay$p(LAT1;)La94;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    new-instance v2, LZV1;

    const-string v3, "status"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-direct {v2, v3, p1}, LZV1;-><init>(Lco/bird/android/model/identification/IdentificationRequestIdentifier;Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V

    invoke-virtual {v1, v2}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v0, p1}, La94;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, LAT1$m;->g:LAT1;

    invoke-static {p1}, LAT1;->access$cleanUpPostSubmission(LAT1;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    invoke-virtual {p0, p1}, LAT1$m;->a(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
