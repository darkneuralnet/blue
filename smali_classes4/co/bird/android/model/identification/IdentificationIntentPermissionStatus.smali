.class public final Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ&\u0010$\u001a\u0004\u0018\u00010\n2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020+0*J\u001c\u0010,\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010*2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020+0*J\"\u0010-\u001a\u0008\u0012\u0004\u0012\u00020(0*2\u0006\u0010%\u001a\u00020&2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020+0*J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003JU\u00104\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001J\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00020&0*J\u0010\u00106\u001a\u0004\u0018\u00010(2\u0006\u0010%\u001a\u00020&J\u0012\u00107\u001a\u0004\u0018\u0001082\u0008\u0008\u0002\u00109\u001a\u000208J\u0013\u0010:\u001a\u00020\u00172\u0008\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020=H\u00d6\u0001J\t\u0010>\u001a\u00020&H\u00d6\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0019\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#\u00a8\u0006?"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        "",
        "status",
        "Lco/bird/android/model/identification/IdentificationStatus;",
        "rejectionReason",
        "Lco/bird/android/model/identification/IdentificationRejectionReason;",
        "idCard",
        "Lco/bird/android/model/identification/IdentificationEntry;",
        "acceptableMethods",
        "",
        "Lco/bird/android/model/identification/IdentificationAcceptableMethod;",
        "acceptableAttestation",
        "Lco/bird/android/model/identification/IdentificationAcceptableAttestation;",
        "acceptableManualEntry",
        "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;",
        "(Lco/bird/android/model/identification/IdentificationStatus;Lco/bird/android/model/identification/IdentificationRejectionReason;Lco/bird/android/model/identification/IdentificationEntry;Ljava/util/List;Lco/bird/android/model/identification/IdentificationAcceptableAttestation;Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;)V",
        "getAcceptableAttestation",
        "()Lco/bird/android/model/identification/IdentificationAcceptableAttestation;",
        "getAcceptableManualEntry",
        "()Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;",
        "getAcceptableMethods",
        "()Ljava/util/List;",
        "attestationAllowed",
        "",
        "getAttestationAllowed",
        "()Z",
        "getIdCard",
        "()Lco/bird/android/model/identification/IdentificationEntry;",
        "manualEntryAllowed",
        "getManualEntryAllowed",
        "manualEntryOfferBeforeScan",
        "getManualEntryOfferBeforeScan",
        "getRejectionReason",
        "()Lco/bird/android/model/identification/IdentificationRejectionReason;",
        "getStatus",
        "()Lco/bird/android/model/identification/IdentificationStatus;",
        "acceptableMethod",
        "countryCode",
        "",
        "documentType",
        "Lco/bird/android/model/identification/IdentificationDocumentType;",
        "allowedDocumentEntryMethods",
        "",
        "Lco/bird/android/model/identification/IdentificationEntryMethod;",
        "allowedCountryCodes",
        "allowedDocumentTypes",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "countriesAllowingBarcode",
        "defaultDocumentType",
        "defaultLocale",
        "Ljava/util/Locale;",
        "locale",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIdentificationIntentPermissionStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationIntentPermissionStatus.kt\nco/bird/android/model/identification/IdentificationIntentPermissionStatus\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1789#2,3:126\n1789#2,3:129\n288#2,2:133\n1#3:132\n*S KotlinDebug\n*F\n+ 1 IdentificationIntentPermissionStatus.kt\nco/bird/android/model/identification/IdentificationIntentPermissionStatus\n*L\n24#1:126,3\n34#1:129,3\n100#1:133,2\n*E\n"
    }
.end annotation


# instance fields
.field private final acceptableAttestation:Lco/bird/android/model/identification/IdentificationAcceptableAttestation;

.field private final acceptableManualEntry:Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

.field private final acceptableMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationAcceptableMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final attestationAllowed:Z

.field private final idCard:Lco/bird/android/model/identification/IdentificationEntry;

.field private final manualEntryAllowed:Z

.field private final manualEntryOfferBeforeScan:Z

.field private final rejectionReason:Lco/bird/android/model/identification/IdentificationRejectionReason;

.field private final status:Lco/bird/android/model/identification/IdentificationStatus;


# direct methods
.method public constructor <init>(Lco/bird/android/model/identification/IdentificationStatus;Lco/bird/android/model/identification/IdentificationRejectionReason;Lco/bird/android/model/identification/IdentificationEntry;Ljava/util/List;Lco/bird/android/model/identification/IdentificationAcceptableAttestation;Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/identification/IdentificationStatus;",
            "Lco/bird/android/model/identification/IdentificationRejectionReason;",
            "Lco/bird/android/model/identification/IdentificationEntry;",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationAcceptableMethod;",
            ">;",
            "Lco/bird/android/model/identification/IdentificationAcceptableAttestation;",
            "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;",
            ")V"
        }
    .end annotation

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->status:Lco/bird/android/model/identification/IdentificationStatus;

    iput-object p2, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->rejectionReason:Lco/bird/android/model/identification/IdentificationRejectionReason;

    iput-object p3, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->idCard:Lco/bird/android/model/identification/IdentificationEntry;

    iput-object p4, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableMethods:Ljava/util/List;

    iput-object p5, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableAttestation:Lco/bird/android/model/identification/IdentificationAcceptableAttestation;

    iput-object p6, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableManualEntry:Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    const/4 p1, 0x1

    const/4 p2, 0x0

    if-eqz p5, :cond_0

    move p3, p1

    goto :goto_0

    :cond_0
    move p3, p2

    :goto_0
    iput-boolean p3, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->attestationAllowed:Z

    if-eqz p6, :cond_1

    move p3, p1

    goto :goto_1

    :cond_1
    move p3, p2

    :goto_1
    iput-boolean p3, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->manualEntryAllowed:Z

    if-eqz p6, :cond_2

    invoke-virtual {p6}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getOfferBeforeScan()Z

    move-result p3

    if-ne p3, p1, :cond_2

    goto :goto_2

    :cond_2
    move p1, p2

    :goto_2
    iput-boolean p1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->manualEntryOfferBeforeScan:Z

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/identification/IdentificationStatus;Lco/bird/android/model/identification/IdentificationRejectionReason;Lco/bird/android/model/identification/IdentificationEntry;Ljava/util/List;Lco/bird/android/model/identification/IdentificationAcceptableAttestation;Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 v0, p7, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v2, p7, 0x4

    if-eqz v2, :cond_1

    move-object v2, v1

    goto :goto_1

    :cond_1
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, p7, 0x8

    if-eqz v3, :cond_2

    move-object v3, v1

    goto :goto_2

    :cond_2
    move-object v3, p4

    :goto_2
    and-int/lit8 v4, p7, 0x10

    if-eqz v4, :cond_3

    move-object v4, v1

    goto :goto_3

    :cond_3
    move-object v4, p5

    :goto_3
    and-int/lit8 v5, p7, 0x20

    if-eqz v5, :cond_4

    goto :goto_4

    :cond_4
    move-object v1, p6

    :goto_4
    move-object p2, p0

    move-object p3, p1

    move-object p4, v0

    move-object p5, v2

    move-object p6, v3

    move-object p7, v4

    move-object p8, v1

    invoke-direct/range {p2 .. p8}, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;-><init>(Lco/bird/android/model/identification/IdentificationStatus;Lco/bird/android/model/identification/IdentificationRejectionReason;Lco/bird/android/model/identification/IdentificationEntry;Ljava/util/List;Lco/bird/android/model/identification/IdentificationAcceptableAttestation;Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;Lco/bird/android/model/identification/IdentificationStatus;Lco/bird/android/model/identification/IdentificationRejectionReason;Lco/bird/android/model/identification/IdentificationEntry;Ljava/util/List;Lco/bird/android/model/identification/IdentificationAcceptableAttestation;Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;ILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->status:Lco/bird/android/model/identification/IdentificationStatus;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->rejectionReason:Lco/bird/android/model/identification/IdentificationRejectionReason;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->idCard:Lco/bird/android/model/identification/IdentificationEntry;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableMethods:Ljava/util/List;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableAttestation:Lco/bird/android/model/identification/IdentificationAcceptableAttestation;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableManualEntry:Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->copy(Lco/bird/android/model/identification/IdentificationStatus;Lco/bird/android/model/identification/IdentificationRejectionReason;Lco/bird/android/model/identification/IdentificationEntry;Ljava/util/List;Lco/bird/android/model/identification/IdentificationAcceptableAttestation;Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;)Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic defaultLocale$default(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;Ljava/util/Locale;ILjava/lang/Object;)Ljava/util/Locale;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p1

    const-string p2, "getDefault()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->defaultLocale(Ljava/util/Locale;)Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final acceptableMethod(Ljava/lang/String;Lco/bird/android/model/identification/IdentificationDocumentType;Ljava/util/Set;)Lco/bird/android/model/identification/IdentificationAcceptableMethod;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            "Ljava/util/Set<",
            "+",
            "Lco/bird/android/model/identification/IdentificationEntryMethod;",
            ">;)",
            "Lco/bird/android/model/identification/IdentificationAcceptableMethod;"
        }
    .end annotation

    const-string v0, "countryCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowedDocumentEntryMethods"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableMethods:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/identification/IdentificationAcceptableMethod;

    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getDocumentEntryMethod()Lco/bird/android/model/identification/IdentificationEntryMethod;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    invoke-interface {p3, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-ne v3, v4, :cond_2

    move v3, v4

    goto :goto_1

    :cond_2
    move v3, v5

    :goto_1
    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getCanSubmit()Ljava/lang/Boolean;

    move-result-object v3

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getStateCodes()Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getRegionCodes()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getCountryCodes()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-interface {v3, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    move v3, v4

    goto :goto_2

    :cond_6
    move v3, v5

    :goto_2
    if-eqz v3, :cond_7

    goto :goto_0

    :cond_7
    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getDocumentTypes()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-interface {v3, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-ne v3, v4, :cond_8

    goto :goto_3

    :cond_8
    move v4, v5

    :goto_3
    if-nez v4, :cond_9

    goto :goto_0

    :cond_9
    return-object v2

    :cond_a
    return-object v1
.end method

.method public final allowedCountryCodes(Ljava/util/Set;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lco/bird/android/model/identification/IdentificationEntryMethod;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "allowedDocumentEntryMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableMethods:Ljava/util/List;

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/identification/IdentificationAcceptableMethod;

    invoke-virtual {v2, p1}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->allowedCountryCodes(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->union(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    goto :goto_0

    :cond_1
    if-nez v1, :cond_3

    :cond_2
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method public final allowedDocumentTypes(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "+",
            "Lco/bird/android/model/identification/IdentificationEntryMethod;",
            ">;)",
            "Ljava/util/Set<",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;"
        }
    .end annotation

    const-string v0, "countryCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowedDocumentEntryMethods"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableMethods:Ljava/util/List;

    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/identification/IdentificationAcceptableMethod;

    invoke-virtual {v2, p1, p2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->allowedDocumentTypes(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->union(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    goto :goto_0

    :cond_0
    if-nez v1, :cond_2

    :cond_1
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    :cond_2
    return-object v1
.end method

.method public final component1()Lco/bird/android/model/identification/IdentificationStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->status:Lco/bird/android/model/identification/IdentificationStatus;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/identification/IdentificationRejectionReason;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->rejectionReason:Lco/bird/android/model/identification/IdentificationRejectionReason;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/identification/IdentificationEntry;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->idCard:Lco/bird/android/model/identification/IdentificationEntry;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationAcceptableMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableMethods:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/identification/IdentificationAcceptableAttestation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableAttestation:Lco/bird/android/model/identification/IdentificationAcceptableAttestation;

    return-object v0
.end method

.method public final component6()Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableManualEntry:Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/identification/IdentificationStatus;Lco/bird/android/model/identification/IdentificationRejectionReason;Lco/bird/android/model/identification/IdentificationEntry;Ljava/util/List;Lco/bird/android/model/identification/IdentificationAcceptableAttestation;Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;)Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/identification/IdentificationStatus;",
            "Lco/bird/android/model/identification/IdentificationRejectionReason;",
            "Lco/bird/android/model/identification/IdentificationEntry;",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationAcceptableMethod;",
            ">;",
            "Lco/bird/android/model/identification/IdentificationAcceptableAttestation;",
            "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;",
            ")",
            "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;"
        }
    .end annotation

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;-><init>(Lco/bird/android/model/identification/IdentificationStatus;Lco/bird/android/model/identification/IdentificationRejectionReason;Lco/bird/android/model/identification/IdentificationEntry;Ljava/util/List;Lco/bird/android/model/identification/IdentificationAcceptableAttestation;Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;)V

    return-object v0
.end method

.method public final countriesAllowingBarcode()Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableMethods:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/identification/IdentificationAcceptableMethod;

    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getCanSubmit()Ljava/lang/Boolean;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getDocumentEntryMethod()Lco/bird/android/model/identification/IdentificationEntryMethod;

    move-result-object v3

    sget-object v4, Lco/bird/android/model/identification/IdentificationEntryMethod;->BARCODE_ONLY:Lco/bird/android/model/identification/IdentificationEntryMethod;

    if-eq v3, v4, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getDocumentTypes()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    sget-object v5, Lco/bird/android/model/identification/IdentificationDocumentType;->DRIVER_LICENSE:Lco/bird/android/model/identification/IdentificationDocumentType;

    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    const/4 v5, 0x1

    if-ne v3, v5, :cond_4

    move v4, v5

    :cond_4
    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getCountryCodes()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_6
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final defaultDocumentType(Ljava/lang/String;)Lco/bird/android/model/identification/IdentificationDocumentType;
    .locals 5

    const-string v0, "countryCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableMethods:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/identification/IdentificationAcceptableMethod;

    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getCanSubmit()Ljava/lang/Boolean;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getDocumentTypes()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2, p1}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->allowsCountry(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getDocumentTypes()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lco/bird/android/model/identification/IdentificationDocumentType;

    :cond_5
    return-object v1
.end method

.method public final defaultLocale(Ljava/util/Locale;)Ljava/util/Locale;
    .locals 7

    const-string v0, "locale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableMethods:Ljava/util/List;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lco/bird/android/model/identification/IdentificationAcceptableMethod;

    invoke-virtual {v4}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getCanSubmit()Ljava/lang/Boolean;

    move-result-object v5

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getCountryCodes()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    goto :goto_0

    :cond_1
    move v4, v6

    :goto_0
    if-lez v4, :cond_2

    move v6, v1

    :cond_2
    if-eqz v6, :cond_0

    goto :goto_1

    :cond_3
    move-object v3, v2

    :goto_1
    check-cast v3, Lco/bird/android/model/identification/IdentificationAcceptableMethod;

    goto :goto_2

    :cond_4
    move-object v3, v2

    :goto_2
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->getCountryCodes()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_3

    :cond_5
    move-object v0, v2

    :goto_3
    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v3

    const-string v4, "it.country"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/2addr v1, v3

    if-eqz v1, :cond_6

    goto :goto_4

    :cond_6
    move-object p1, v2

    :goto_4
    if-nez p1, :cond_7

    if-eqz v0, :cond_8

    new-instance v2, Ljava/util/Locale;

    const-string p1, ""

    invoke-direct {v2, p1, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    move-object v2, p1

    :cond_8
    :goto_5
    return-object v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->status:Lco/bird/android/model/identification/IdentificationStatus;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->status:Lco/bird/android/model/identification/IdentificationStatus;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->rejectionReason:Lco/bird/android/model/identification/IdentificationRejectionReason;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->rejectionReason:Lco/bird/android/model/identification/IdentificationRejectionReason;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->idCard:Lco/bird/android/model/identification/IdentificationEntry;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->idCard:Lco/bird/android/model/identification/IdentificationEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableMethods:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableMethods:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableAttestation:Lco/bird/android/model/identification/IdentificationAcceptableAttestation;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableAttestation:Lco/bird/android/model/identification/IdentificationAcceptableAttestation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableManualEntry:Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    iget-object p1, p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableManualEntry:Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAcceptableAttestation()Lco/bird/android/model/identification/IdentificationAcceptableAttestation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableAttestation:Lco/bird/android/model/identification/IdentificationAcceptableAttestation;

    return-object v0
.end method

.method public final getAcceptableManualEntry()Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableManualEntry:Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    return-object v0
.end method

.method public final getAcceptableMethods()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationAcceptableMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableMethods:Ljava/util/List;

    return-object v0
.end method

.method public final getAttestationAllowed()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->attestationAllowed:Z

    return v0
.end method

.method public final getIdCard()Lco/bird/android/model/identification/IdentificationEntry;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->idCard:Lco/bird/android/model/identification/IdentificationEntry;

    return-object v0
.end method

.method public final getManualEntryAllowed()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->manualEntryAllowed:Z

    return v0
.end method

.method public final getManualEntryOfferBeforeScan()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->manualEntryOfferBeforeScan:Z

    return v0
.end method

.method public final getRejectionReason()Lco/bird/android/model/identification/IdentificationRejectionReason;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->rejectionReason:Lco/bird/android/model/identification/IdentificationRejectionReason;

    return-object v0
.end method

.method public final getStatus()Lco/bird/android/model/identification/IdentificationStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->status:Lco/bird/android/model/identification/IdentificationStatus;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->status:Lco/bird/android/model/identification/IdentificationStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->rejectionReason:Lco/bird/android/model/identification/IdentificationRejectionReason;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->idCard:Lco/bird/android/model/identification/IdentificationEntry;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/identification/IdentificationEntry;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableMethods:Ljava/util/List;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableAttestation:Lco/bird/android/model/identification/IdentificationAcceptableAttestation;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lco/bird/android/model/identification/IdentificationAcceptableAttestation;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableManualEntry:Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->status:Lco/bird/android/model/identification/IdentificationStatus;

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->rejectionReason:Lco/bird/android/model/identification/IdentificationRejectionReason;

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->idCard:Lco/bird/android/model/identification/IdentificationEntry;

    iget-object v3, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableMethods:Ljava/util/List;

    iget-object v4, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableAttestation:Lco/bird/android/model/identification/IdentificationAcceptableAttestation;

    iget-object v5, p0, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->acceptableManualEntry:Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "IdentificationIntentPermissionStatus(status="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rejectionReason="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", idCard="

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
