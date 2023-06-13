.class public final LAT1$h;
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
        "Lco/bird/api/response/WireIdentificationIntentPermissionResponse;",
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/WireIdentificationIntentPermissionResponse;",
        "response",
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/WireIdentificationIntentPermissionResponse;)Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LAT1$h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LAT1$h;

    invoke-direct {v0}, LAT1$h;-><init>()V

    sput-object v0, LAT1$h;->g:LAT1$h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/WireIdentificationIntentPermissionResponse;)Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LBT1;->e(Lco/bird/api/response/WireIdentificationIntentPermissionResponse;)Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;

    invoke-virtual {p0, p1}, LAT1$h;->a(Lco/bird/api/response/WireIdentificationIntentPermissionResponse;)Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    move-result-object p1

    return-object p1
.end method
