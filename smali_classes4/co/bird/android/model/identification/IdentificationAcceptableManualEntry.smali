.class public final Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\"\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\u0008\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u009a\u0001\u0010.\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\u0008\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010/J\t\u00100\u001a\u00020\u0010H\u00d6\u0001J\u0013\u00101\u001a\u00020\u00032\u0008\u00102\u001a\u0004\u0018\u000103H\u00d6\u0003J\t\u00104\u001a\u00020\u0010H\u00d6\u0001J\t\u00105\u001a\u00020\tH\u00d6\u0001J\u0019\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0010H\u00d6\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\u0016\u0010\u0017R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001bR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001bR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001bR\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001b\u00a8\u0006;"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;",
        "Landroid/os/Parcelable;",
        "offerBeforeScan",
        "",
        "allowedDocumentTypes",
        "",
        "Lco/bird/android/model/identification/IdentificationDocumentType;",
        "allowedSpecialDocumentTypes",
        "requireIdNumberRegex",
        "",
        "requireIssuingAuthority",
        "requireGender",
        "requireNationality",
        "requireName",
        "requireIssueDate",
        "implicitAgeYears",
        "",
        "implicitExpirationDays",
        "(ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZZZLjava/lang/Integer;Ljava/lang/Integer;)V",
        "getAllowedDocumentTypes",
        "()Ljava/util/List;",
        "getAllowedSpecialDocumentTypes",
        "getImplicitAgeYears",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getImplicitExpirationDays",
        "getOfferBeforeScan",
        "()Z",
        "getRequireGender",
        "getRequireIdNumberRegex",
        "()Ljava/lang/String;",
        "getRequireIssueDate",
        "getRequireIssuingAuthority",
        "getRequireName",
        "getRequireNationality",
        "component1",
        "component10",
        "component11",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZZZLjava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final allowedDocumentTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;"
        }
    .end annotation
.end field

.field private final allowedSpecialDocumentTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;"
        }
    .end annotation
.end field

.field private final implicitAgeYears:Ljava/lang/Integer;

.field private final implicitExpirationDays:Ljava/lang/Integer;

.field private final offerBeforeScan:Z

.field private final requireGender:Z

.field private final requireIdNumberRegex:Ljava/lang/String;

.field private final requireIssueDate:Z

.field private final requireIssuingAuthority:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final requireName:Z

.field private final requireNationality:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry$Creator;

    invoke-direct {v0}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZZZLjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZZZ",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->offerBeforeScan:Z

    iput-object p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedDocumentTypes:Ljava/util/List;

    iput-object p3, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedSpecialDocumentTypes:Ljava/util/List;

    iput-object p4, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIdNumberRegex:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssuingAuthority:Ljava/util/List;

    iput-boolean p6, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireGender:Z

    iput-boolean p7, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireNationality:Z

    iput-boolean p8, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireName:Z

    iput-boolean p9, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssueDate:Z

    iput-object p10, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitAgeYears:Ljava/lang/Integer;

    iput-object p11, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitExpirationDays:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZZZLjava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p4

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p5

    :goto_3
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_4

    move-object v13, v2

    goto :goto_4

    :cond_4
    move-object/from16 v13, p10

    :goto_4
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_5

    move-object v14, v2

    goto :goto_5

    :cond_5
    move-object/from16 v14, p11

    :goto_5
    move-object v3, p0

    move/from16 v4, p1

    move/from16 v9, p6

    move/from16 v10, p7

    move/from16 v11, p8

    move/from16 v12, p9

    invoke-direct/range {v3 .. v14}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;-><init>(ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZZZLjava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZZZLjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;
    .locals 12

    move-object v0, p0

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->offerBeforeScan:Z

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedDocumentTypes:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedSpecialDocumentTypes:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIdNumberRegex:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssuingAuthority:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireGender:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireNationality:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireName:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssueDate:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitAgeYears:Ljava/lang/Integer;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    iget-object v1, v0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitExpirationDays:Ljava/lang/Integer;

    goto :goto_a

    :cond_a
    move-object/from16 v1, p11

    :goto_a
    move p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v1

    invoke-virtual/range {p0 .. p11}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->copy(ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZZZLjava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->offerBeforeScan:Z

    return v0
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitAgeYears:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component11()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitExpirationDays:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedDocumentTypes:Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedSpecialDocumentTypes:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIdNumberRegex:Ljava/lang/String;

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

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssuingAuthority:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireGender:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireNationality:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireName:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssueDate:Z

    return v0
.end method

.method public final copy(ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZZZLjava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZZZ",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")",
            "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;"
        }
    .end annotation

    new-instance v12, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    move-object v0, v12

    move v1, p1

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;-><init>(ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZZZLjava/lang/Integer;Ljava/lang/Integer;)V

    return-object v12
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
    instance-of v1, p1, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    iget-boolean v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->offerBeforeScan:Z

    iget-boolean v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->offerBeforeScan:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedDocumentTypes:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedDocumentTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedSpecialDocumentTypes:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedSpecialDocumentTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIdNumberRegex:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIdNumberRegex:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssuingAuthority:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssuingAuthority:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireGender:Z

    iget-boolean v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireGender:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireNationality:Z

    iget-boolean v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireNationality:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireName:Z

    iget-boolean v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireName:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssueDate:Z

    iget-boolean v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssueDate:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitAgeYears:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitAgeYears:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitExpirationDays:Ljava/lang/Integer;

    iget-object p1, p1, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitExpirationDays:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAllowedDocumentTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedDocumentTypes:Ljava/util/List;

    return-object v0
.end method

.method public final getAllowedSpecialDocumentTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedSpecialDocumentTypes:Ljava/util/List;

    return-object v0
.end method

.method public final getImplicitAgeYears()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitAgeYears:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getImplicitExpirationDays()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitExpirationDays:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getOfferBeforeScan()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->offerBeforeScan:Z

    return v0
.end method

.method public final getRequireGender()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireGender:Z

    return v0
.end method

.method public final getRequireIdNumberRegex()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIdNumberRegex:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequireIssueDate()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssueDate:Z

    return v0
.end method

.method public final getRequireIssuingAuthority()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssuingAuthority:Ljava/util/List;

    return-object v0
.end method

.method public final getRequireName()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireName:Z

    return v0
.end method

.method public final getRequireNationality()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireNationality:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->offerBeforeScan:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedDocumentTypes:Ljava/util/List;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedSpecialDocumentTypes:Ljava/util/List;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIdNumberRegex:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssuingAuthority:Ljava/util/List;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_3

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireGender:Z

    if-eqz v2, :cond_5

    move v2, v1

    :cond_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireNationality:Z

    if-eqz v2, :cond_6

    move v2, v1

    :cond_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireName:Z

    if-eqz v2, :cond_7

    move v2, v1

    :cond_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssueDate:Z

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    move v1, v2

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitAgeYears:Ljava/lang/Integer;

    if-nez v1, :cond_9

    move v1, v3

    goto :goto_5

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitExpirationDays:Ljava/lang/Integer;

    if-nez v1, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->offerBeforeScan:Z

    iget-object v1, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedDocumentTypes:Ljava/util/List;

    iget-object v2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedSpecialDocumentTypes:Ljava/util/List;

    iget-object v3, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIdNumberRegex:Ljava/lang/String;

    iget-object v4, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssuingAuthority:Ljava/util/List;

    iget-boolean v5, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireGender:Z

    iget-boolean v6, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireNationality:Z

    iget-boolean v7, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireName:Z

    iget-boolean v8, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssueDate:Z

    iget-object v9, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitAgeYears:Ljava/lang/Integer;

    iget-object v10, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitExpirationDays:Ljava/lang/Integer;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "IdentificationAcceptableManualEntry(offerBeforeScan="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", allowedDocumentTypes="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", allowedSpecialDocumentTypes="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", requireIdNumberRegex="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", requireIssuingAuthority="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", requireGender="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", requireNationality="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", requireName="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", requireIssueDate="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", implicitAgeYears="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", implicitExpirationDays="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->offerBeforeScan:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedDocumentTypes:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/identification/IdentificationDocumentType;

    invoke-virtual {v3, p1, p2}, Lco/bird/android/model/identification/IdentificationDocumentType;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->allowedSpecialDocumentTypes:Ljava/util/List;

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
    iget-object p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIdNumberRegex:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssuingAuthority:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-boolean p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireGender:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireNationality:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireName:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->requireIssueDate:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitAgeYears:Ljava/lang/Integer;

    if-nez p2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_4
    iget-object p2, p0, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->implicitExpirationDays:Ljava/lang/Integer;

    if-nez p2, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_5
    return-void
.end method
