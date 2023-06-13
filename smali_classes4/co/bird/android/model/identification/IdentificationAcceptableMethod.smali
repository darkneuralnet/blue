.class public final Lco/bird/android/model/identification/IdentificationAcceptableMethod;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;,
        Lco/bird/android/model/identification/IdentificationAcceptableMethod$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0018\n\u0002\u0010\"\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0001JB\u009b\u0001\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0010\u0008\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\u0008\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J\u001c\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010,2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00030,J\"\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00080,2\u0006\u0010/\u001a\u00020\n2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00030,J\u000e\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\nJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u00103\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u00c6\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u00c6\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u00c6\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u00c6\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010:\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u00a4\u0001\u0010;\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\u0010\u0008\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\u0008\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001\u00a2\u0006\u0002\u0010<J\t\u0010=\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010>\u001a\u00020\u00132\u0008\u0010?\u001a\u0004\u0018\u00010@H\u00d6\u0003J\t\u0010A\u001a\u00020\u0011H\u00d6\u0001J\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010\u0007J\t\u0010D\u001a\u00020\nH\u00d6\u0001J\u0019\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0011H\u00d6\u0001R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\u0008 \u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\u0008#\u0010$R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u0019R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u0019\u00a8\u0006K"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationAcceptableMethod;",
        "Landroid/os/Parcelable;",
        "documentEntryMethod",
        "Lco/bird/android/model/identification/IdentificationEntryMethod;",
        "selfieEntryMethod",
        "Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;",
        "documentTypes",
        "",
        "Lco/bird/android/model/identification/IdentificationDocumentType;",
        "services",
        "",
        "stateCodes",
        "countryCodes",
        "regionCodes",
        "minimumScore",
        "",
        "maxDocumentExpirationDays",
        "",
        "canSubmit",
        "",
        "(Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)V",
        "getCanSubmit",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getCountryCodes",
        "()Ljava/util/List;",
        "getDocumentEntryMethod",
        "()Lco/bird/android/model/identification/IdentificationEntryMethod;",
        "getDocumentTypes",
        "hasJurisdictionRestrictions",
        "getHasJurisdictionRestrictions",
        "()Z",
        "getMaxDocumentExpirationDays",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getMinimumScore",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getRegionCodes",
        "getSelfieEntryMethod",
        "()Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;",
        "getServices",
        "getStateCodes",
        "allowedCountryCodes",
        "",
        "allowedDocumentEntryMethods",
        "allowedDocumentTypes",
        "countryCode",
        "allowsCountry",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)Lco/bird/android/model/identification/IdentificationAcceptableMethod;",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "requiredEntryMethodTypes",
        "Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "EntryMethodType",
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
        "SMAP\nIdentificationAcceptableMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationAcceptableMethod.kt\nco/bird/android/model/identification/IdentificationAcceptableMethod\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/identification/IdentificationAcceptableMethod;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final canSubmit:Ljava/lang/Boolean;

.field private final countryCodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final documentEntryMethod:Lco/bird/android/model/identification/IdentificationEntryMethod;

.field private final documentTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;"
        }
    .end annotation
.end field

.field private final hasJurisdictionRestrictions:Z

.field private final maxDocumentExpirationDays:Ljava/lang/Integer;

.field private final minimumScore:Ljava/lang/Double;

.field private final regionCodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final selfieEntryMethod:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

.field private final services:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stateCodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/identification/IdentificationAcceptableMethod$Creator;

    invoke-direct {v0}, Lco/bird/android/model/identification/IdentificationAcceptableMethod$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x3ff

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;-><init>(Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/identification/IdentificationEntryMethod;",
            "Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Double;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentEntryMethod:Lco/bird/android/model/identification/IdentificationEntryMethod;

    iput-object p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->selfieEntryMethod:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    iput-object p3, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentTypes:Ljava/util/List;

    iput-object p4, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->services:Ljava/util/List;

    iput-object p5, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->stateCodes:Ljava/util/List;

    iput-object p6, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->countryCodes:Ljava/util/List;

    iput-object p7, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->regionCodes:Ljava/util/List;

    iput-object p8, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->minimumScore:Ljava/lang/Double;

    iput-object p9, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->maxDocumentExpirationDays:Ljava/lang/Integer;

    iput-object p10, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->canSubmit:Ljava/lang/Boolean;

    if-nez p5, :cond_1

    if-nez p6, :cond_1

    if-eqz p7, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->hasJurisdictionRestrictions:Z

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move-object v6, v2

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move-object v7, v2

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    move-object v8, v2

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move-object v9, v2

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    move-object v10, v2

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    goto :goto_9

    :cond_9
    move-object/from16 v2, p10

    :goto_9
    move-object p1, p0

    move-object p2, v1

    move-object p3, v3

    move-object p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v2

    invoke-direct/range {p1 .. p11}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;-><init>(Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/identification/IdentificationAcceptableMethod;Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;ILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationAcceptableMethod;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentEntryMethod:Lco/bird/android/model/identification/IdentificationEntryMethod;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->selfieEntryMethod:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentTypes:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->services:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->stateCodes:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->countryCodes:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->regionCodes:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->minimumScore:Ljava/lang/Double;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->maxDocumentExpirationDays:Ljava/lang/Integer;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget-object v1, v0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->canSubmit:Ljava/lang/Boolean;

    goto :goto_9

    :cond_9
    move-object/from16 v1, p10

    :goto_9
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->copy(Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)Lco/bird/android/model/identification/IdentificationAcceptableMethod;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final allowedCountryCodes(Ljava/util/Set;)Ljava/util/Set;
    .locals 2
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

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->canSubmit:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentEntryMethod:Lco/bird/android/model/identification/IdentificationEntryMethod;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    move v1, v0

    :cond_0
    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->hasJurisdictionRestrictions:Z

    if-nez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->countryCodes:Ljava/util/List;

    if-eqz p1, :cond_3

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toSortedSet(Ljava/lang/Iterable;)Ljava/util/SortedSet;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    if-nez p1, :cond_5

    :cond_3
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p1

    goto :goto_1

    :cond_4
    :goto_0
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p1

    :cond_5
    :goto_1
    return-object p1
.end method

.method public final allowedDocumentTypes(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
    .locals 4
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

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentTypes:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->canSubmit:Ljava/lang/Boolean;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentEntryMethod:Lco/bird/android/model/identification/IdentificationEntryMethod;

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-interface {p2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-ne p2, v3, :cond_0

    move p2, v3

    goto :goto_0

    :cond_0
    move p2, v2

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->allowsCountry(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v2, v3

    :cond_1
    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public final allowsCountry(Ljava/lang/String;)Z
    .locals 3

    const-string v0, "countryCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->hasJurisdictionRestrictions:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->countryCodes:Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :cond_2
    :goto_1
    return v1
.end method

.method public final component1()Lco/bird/android/model/identification/IdentificationEntryMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentEntryMethod:Lco/bird/android/model/identification/IdentificationEntryMethod;

    return-object v0
.end method

.method public final component10()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->canSubmit:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->selfieEntryMethod:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentTypes:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->services:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->stateCodes:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->countryCodes:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->regionCodes:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->minimumScore:Ljava/lang/Double;

    return-object v0
.end method

.method public final component9()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->maxDocumentExpirationDays:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)Lco/bird/android/model/identification/IdentificationAcceptableMethod;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/identification/IdentificationEntryMethod;",
            "Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Double;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ")",
            "Lco/bird/android/model/identification/IdentificationAcceptableMethod;"
        }
    .end annotation

    new-instance v11, Lco/bird/android/model/identification/IdentificationAcceptableMethod;

    move-object v0, v11

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lco/bird/android/model/identification/IdentificationAcceptableMethod;-><init>(Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-object v11
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/identification/IdentificationAcceptableMethod;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/identification/IdentificationAcceptableMethod;

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentEntryMethod:Lco/bird/android/model/identification/IdentificationEntryMethod;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentEntryMethod:Lco/bird/android/model/identification/IdentificationEntryMethod;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->selfieEntryMethod:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->selfieEntryMethod:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentTypes:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->services:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->services:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->stateCodes:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->stateCodes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->countryCodes:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->countryCodes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->regionCodes:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->regionCodes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->minimumScore:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->minimumScore:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->maxDocumentExpirationDays:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->maxDocumentExpirationDays:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->canSubmit:Ljava/lang/Boolean;

    iget-object p1, p1, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->canSubmit:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getCanSubmit()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->canSubmit:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getCountryCodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->countryCodes:Ljava/util/List;

    return-object v0
.end method

.method public final getDocumentEntryMethod()Lco/bird/android/model/identification/IdentificationEntryMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentEntryMethod:Lco/bird/android/model/identification/IdentificationEntryMethod;

    return-object v0
.end method

.method public final getDocumentTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentTypes:Ljava/util/List;

    return-object v0
.end method

.method public final getHasJurisdictionRestrictions()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->hasJurisdictionRestrictions:Z

    return v0
.end method

.method public final getMaxDocumentExpirationDays()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->maxDocumentExpirationDays:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMinimumScore()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->minimumScore:Ljava/lang/Double;

    return-object v0
.end method

.method public final getRegionCodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->regionCodes:Ljava/util/List;

    return-object v0
.end method

.method public final getSelfieEntryMethod()Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->selfieEntryMethod:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    return-object v0
.end method

.method public final getServices()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->services:Ljava/util/List;

    return-object v0
.end method

.method public final getStateCodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->stateCodes:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentEntryMethod:Lco/bird/android/model/identification/IdentificationEntryMethod;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->selfieEntryMethod:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentTypes:Ljava/util/List;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->services:Ljava/util/List;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->stateCodes:Ljava/util/List;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->countryCodes:Ljava/util/List;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->regionCodes:Ljava/util/List;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->minimumScore:Ljava/lang/Double;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->maxDocumentExpirationDays:Ljava/lang/Integer;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->canSubmit:Ljava/lang/Boolean;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    return v0
.end method

.method public final requiredEntryMethodTypes()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentEntryMethod:Lco/bird/android/model/identification/IdentificationEntryMethod;

    const/4 v2, -0x1

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    sget-object v3, Lco/bird/android/model/identification/IdentificationAcceptableMethod$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    :goto_0
    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v1, v4, :cond_3

    if-eq v1, v3, :cond_2

    const/4 v5, 0x3

    if-eq v1, v5, :cond_1

    goto :goto_1

    :cond_1
    new-array v1, v3, [Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    const/4 v5, 0x0

    sget-object v6, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->FRONT_SCAN:Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    aput-object v6, v1, v5

    sget-object v5, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->BACK_SCAN:Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    aput-object v5, v1, v4

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_2
    sget-object v1, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->BACK_SCAN:Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    sget-object v1, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->FRONT_SCAN:Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->selfieEntryMethod:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    sget-object v2, Lco/bird/android/model/identification/IdentificationAcceptableMethod$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v2, v2, v1

    :goto_2
    if-eq v2, v4, :cond_6

    if-eq v2, v3, :cond_5

    goto :goto_3

    :cond_5
    sget-object v1, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->SELFIE_VIDEO:Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    sget-object v1, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->SELFIE_PHOTO:Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v4

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    const/4 v0, 0x0

    :goto_4
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentEntryMethod:Lco/bird/android/model/identification/IdentificationEntryMethod;

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->selfieEntryMethod:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentTypes:Ljava/util/List;

    iget-object v3, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->services:Ljava/util/List;

    iget-object v4, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->stateCodes:Ljava/util/List;

    iget-object v5, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->countryCodes:Ljava/util/List;

    iget-object v6, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->regionCodes:Ljava/util/List;

    iget-object v7, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->minimumScore:Ljava/lang/Double;

    iget-object v8, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->maxDocumentExpirationDays:Ljava/lang/Integer;

    iget-object v9, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->canSubmit:Ljava/lang/Boolean;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "IdentificationAcceptableMethod(documentEntryMethod="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selfieEntryMethod="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", documentTypes="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", services="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stateCodes="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", countryCodes="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", regionCodes="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", minimumScore="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", maxDocumentExpirationDays="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", canSubmit="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentEntryMethod:Lco/bird/android/model/identification/IdentificationEntryMethod;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->selfieEntryMethod:Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->documentTypes:Ljava/util/List;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/identification/IdentificationDocumentType;

    invoke-virtual {v3, p1, p2}, Lco/bird/android/model/identification/IdentificationDocumentType;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_2

    :cond_3
    :goto_3
    iget-object p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->services:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->stateCodes:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->countryCodes:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->regionCodes:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->minimumScore:Ljava/lang/Double;

    if-nez p2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeDouble(D)V

    :goto_4
    iget-object p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->maxDocumentExpirationDays:Ljava/lang/Integer;

    if-nez p2, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_5
    iget-object p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableMethod;->canSubmit:Ljava/lang/Boolean;

    if-nez p2, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_6
    return-void
.end method
