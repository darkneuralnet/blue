.class public final LjV1$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjV1;->X()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "LZV1;",
        ">;",
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "LZV1;",
        "it",
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LjV1$j;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LjV1$j;

    invoke-direct {v0}, LjV1$j;-><init>()V

    sput-object v0, LjV1$j;->g:LjV1$j;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "LZV1;",
            ">;)",
            "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZV1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LZV1;->b()Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    new-instance p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    sget-object v1, Lco/bird/android/model/identification/IdentificationStatus;->UNKNOWN:Lco/bird/android/model/identification/IdentificationStatus;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3e

    const/4 v8, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;-><init>(Lco/bird/android/model/identification/IdentificationStatus;Lco/bird/android/model/identification/IdentificationRejectionReason;Lco/bird/android/model/identification/IdentificationEntry;Ljava/util/List;Lco/bird/android/model/identification/IdentificationAcceptableAttestation;Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, LjV1$j;->a(Lco/bird/android/buava/Optional;)Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    move-result-object p1

    return-object p1
.end method
