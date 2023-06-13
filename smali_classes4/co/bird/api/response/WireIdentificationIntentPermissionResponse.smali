.class public final Lco/bird/api/response/WireIdentificationIntentPermissionResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001BS\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0008\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u00c6\u0003JW\u0010 \u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0008\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018\u00a8\u0006\'"
    }
    d2 = {
        "Lco/bird/api/response/WireIdentificationIntentPermissionResponse;",
        "",
        "status",
        "",
        "rejectionReason",
        "identification",
        "Lco/bird/android/model/wire/WireIdentification;",
        "acceptableMethods",
        "",
        "Lco/bird/android/model/wire/WireIdentificationAcceptableMethod;",
        "acceptableAttestation",
        "Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;",
        "acceptableManualEntry",
        "Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;",
        "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireIdentification;Ljava/util/List;Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;)V",
        "getAcceptableAttestation",
        "()Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;",
        "getAcceptableManualEntry",
        "()Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;",
        "getAcceptableMethods",
        "()Ljava/util/List;",
        "getIdentification",
        "()Lco/bird/android/model/wire/WireIdentification;",
        "getRejectionReason",
        "()Ljava/lang/String;",
        "getStatus",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "co.bird.android.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final acceptableAttestation:Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "acceptable_attestation"
    .end annotation

    .annotation runtime Lft5;
        value = "acceptable_attestation"
    .end annotation
.end field

.field private final acceptableManualEntry:Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "acceptable_manual_entry"
    .end annotation

    .annotation runtime Lft5;
        value = "acceptable_manual_entry"
    .end annotation
.end field

.field private final acceptableMethods:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "acceptable_methods"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireIdentificationAcceptableMethod;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "acceptable_methods"
    .end annotation
.end field

.field private final identification:Lco/bird/android/model/wire/WireIdentification;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "identification"
    .end annotation

    .annotation runtime Lft5;
        value = "identification"
    .end annotation
.end field

.field private final rejectionReason:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "rejection_reason"
    .end annotation

    .annotation runtime Lft5;
        value = "rejection_reason"
    .end annotation
.end field

.field private final status:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status"
    .end annotation

    .annotation runtime Lft5;
        value = "status"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireIdentification;Ljava/util/List;Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireIdentification;Ljava/util/List;Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireIdentification;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireIdentificationAcceptableMethod;",
            ">;",
            "Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;",
            "Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->status:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->rejectionReason:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->identification:Lco/bird/android/model/wire/WireIdentification;

    iput-object p4, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableMethods:Ljava/util/List;

    iput-object p5, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableAttestation:Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;

    iput-object p6, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableManualEntry:Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireIdentification;Ljava/util/List;Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 5

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p8, v0

    goto :goto_0

    :cond_0
    move-object p8, p1

    :goto_0
    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    move-object v1, v0

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    move-object v2, v0

    goto :goto_2

    :cond_2
    move-object v2, p3

    :goto_2
    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    move-object v3, v0

    goto :goto_3

    :cond_3
    move-object v3, p4

    :goto_3
    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    move-object v4, v0

    goto :goto_4

    :cond_4
    move-object v4, p5

    :goto_4
    and-int/lit8 p1, p7, 0x20

    if-eqz p1, :cond_5

    move-object p7, v0

    goto :goto_5

    :cond_5
    move-object p7, p6

    :goto_5
    move-object p1, p0

    move-object p2, p8

    move-object p3, v1

    move-object p4, v2

    move-object p5, v3

    move-object p6, v4

    invoke-direct/range {p1 .. p7}, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireIdentification;Ljava/util/List;Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/WireIdentificationIntentPermissionResponse;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireIdentification;Ljava/util/List;Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;ILjava/lang/Object;)Lco/bird/api/response/WireIdentificationIntentPermissionResponse;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->status:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->rejectionReason:Ljava/lang/String;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->identification:Lco/bird/android/model/wire/WireIdentification;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableMethods:Ljava/util/List;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableAttestation:Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableManualEntry:Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireIdentification;Ljava/util/List;Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;)Lco/bird/api/response/WireIdentificationIntentPermissionResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->rejectionReason:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/wire/WireIdentification;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->identification:Lco/bird/android/model/wire/WireIdentification;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireIdentificationAcceptableMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableMethods:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableAttestation:Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;

    return-object v0
.end method

.method public final component6()Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableManualEntry:Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireIdentification;Ljava/util/List;Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;)Lco/bird/api/response/WireIdentificationIntentPermissionResponse;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireIdentification;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireIdentificationAcceptableMethod;",
            ">;",
            "Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;",
            "Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;",
            ")",
            "Lco/bird/api/response/WireIdentificationIntentPermissionResponse;"
        }
    .end annotation

    new-instance v7, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireIdentification;Ljava/util/List;Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;)V

    return-object v7
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;

    iget-object v1, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->status:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->status:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->rejectionReason:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->rejectionReason:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->identification:Lco/bird/android/model/wire/WireIdentification;

    iget-object v3, p1, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->identification:Lco/bird/android/model/wire/WireIdentification;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableMethods:Ljava/util/List;

    iget-object v3, p1, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableMethods:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableAttestation:Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;

    iget-object v3, p1, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableAttestation:Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableManualEntry:Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;

    iget-object p1, p1, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableManualEntry:Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAcceptableAttestation()Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableAttestation:Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;

    return-object v0
.end method

.method public final getAcceptableManualEntry()Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableManualEntry:Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;

    return-object v0
.end method

.method public final getAcceptableMethods()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireIdentificationAcceptableMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableMethods:Ljava/util/List;

    return-object v0
.end method

.method public final getIdentification()Lco/bird/android/model/wire/WireIdentification;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->identification:Lco/bird/android/model/wire/WireIdentification;

    return-object v0
.end method

.method public final getRejectionReason()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->rejectionReason:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->status:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->status:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->rejectionReason:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->identification:Lco/bird/android/model/wire/WireIdentification;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lco/bird/android/model/wire/WireIdentification;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableMethods:Ljava/util/List;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableAttestation:Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableManualEntry:Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->status:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->rejectionReason:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->identification:Lco/bird/android/model/wire/WireIdentification;

    iget-object v3, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableMethods:Ljava/util/List;

    iget-object v4, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableAttestation:Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;

    iget-object v5, p0, Lco/bird/api/response/WireIdentificationIntentPermissionResponse;->acceptableManualEntry:Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "WireIdentificationIntentPermissionResponse(status="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", rejectionReason="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", identification="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptableMethods="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptableAttestation="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptableManualEntry="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
