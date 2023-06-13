.class public final enum Lco/bird/android/model/identification/IdentificationRejectionReason;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/identification/IdentificationRejectionReason$Companion;,
        Lco/bird/android/model/identification/IdentificationRejectionReason$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/identification/IdentificationRejectionReason;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0086\u0001\u0018\u0000 \u00132\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationRejectionReason;",
        "",
        "(Ljava/lang/String;I)V",
        "explanationResId",
        "",
        "hasIngestionResultExplanation",
        "",
        "UNSUPPORTED_DOCUMENT",
        "COULD_NOT_INITIATE",
        "INVALID_METADATA",
        "NOT_COMPLETED",
        "INGESTION_FAILURE",
        "MINIMUM_AGE",
        "VEHICLE_CLASS",
        "BAD_SCORE",
        "DUPLICATE_ID",
        "EXPIRED",
        "RATE_LIMIT",
        "UNKNOWN",
        "Companion",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/identification/IdentificationRejectionReason;

.field public static final enum BAD_SCORE:Lco/bird/android/model/identification/IdentificationRejectionReason;

.field public static final enum COULD_NOT_INITIATE:Lco/bird/android/model/identification/IdentificationRejectionReason;

.field public static final Companion:Lco/bird/android/model/identification/IdentificationRejectionReason$Companion;

.field public static final enum DUPLICATE_ID:Lco/bird/android/model/identification/IdentificationRejectionReason;

.field public static final enum EXPIRED:Lco/bird/android/model/identification/IdentificationRejectionReason;

.field public static final enum INGESTION_FAILURE:Lco/bird/android/model/identification/IdentificationRejectionReason;

.field public static final enum INVALID_METADATA:Lco/bird/android/model/identification/IdentificationRejectionReason;

.field public static final enum MINIMUM_AGE:Lco/bird/android/model/identification/IdentificationRejectionReason;

.field public static final enum NOT_COMPLETED:Lco/bird/android/model/identification/IdentificationRejectionReason;

.field public static final enum RATE_LIMIT:Lco/bird/android/model/identification/IdentificationRejectionReason;

.field public static final enum UNKNOWN:Lco/bird/android/model/identification/IdentificationRejectionReason;

.field public static final enum UNSUPPORTED_DOCUMENT:Lco/bird/android/model/identification/IdentificationRejectionReason;

.field public static final enum VEHICLE_CLASS:Lco/bird/android/model/identification/IdentificationRejectionReason;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/identification/IdentificationRejectionReason;
    .locals 3

    const/16 v0, 0xc

    new-array v0, v0, [Lco/bird/android/model/identification/IdentificationRejectionReason;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/identification/IdentificationRejectionReason;->UNSUPPORTED_DOCUMENT:Lco/bird/android/model/identification/IdentificationRejectionReason;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/identification/IdentificationRejectionReason;->COULD_NOT_INITIATE:Lco/bird/android/model/identification/IdentificationRejectionReason;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/identification/IdentificationRejectionReason;->INVALID_METADATA:Lco/bird/android/model/identification/IdentificationRejectionReason;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/identification/IdentificationRejectionReason;->NOT_COMPLETED:Lco/bird/android/model/identification/IdentificationRejectionReason;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/identification/IdentificationRejectionReason;->INGESTION_FAILURE:Lco/bird/android/model/identification/IdentificationRejectionReason;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/identification/IdentificationRejectionReason;->MINIMUM_AGE:Lco/bird/android/model/identification/IdentificationRejectionReason;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/identification/IdentificationRejectionReason;->VEHICLE_CLASS:Lco/bird/android/model/identification/IdentificationRejectionReason;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/identification/IdentificationRejectionReason;->BAD_SCORE:Lco/bird/android/model/identification/IdentificationRejectionReason;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/identification/IdentificationRejectionReason;->DUPLICATE_ID:Lco/bird/android/model/identification/IdentificationRejectionReason;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/identification/IdentificationRejectionReason;->EXPIRED:Lco/bird/android/model/identification/IdentificationRejectionReason;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/identification/IdentificationRejectionReason;->RATE_LIMIT:Lco/bird/android/model/identification/IdentificationRejectionReason;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lco/bird/android/model/identification/IdentificationRejectionReason;->UNKNOWN:Lco/bird/android/model/identification/IdentificationRejectionReason;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/identification/IdentificationRejectionReason;

    const-string v1, "UNSUPPORTED_DOCUMENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationRejectionReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->UNSUPPORTED_DOCUMENT:Lco/bird/android/model/identification/IdentificationRejectionReason;

    new-instance v0, Lco/bird/android/model/identification/IdentificationRejectionReason;

    const-string v1, "COULD_NOT_INITIATE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationRejectionReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->COULD_NOT_INITIATE:Lco/bird/android/model/identification/IdentificationRejectionReason;

    new-instance v0, Lco/bird/android/model/identification/IdentificationRejectionReason;

    const-string v1, "INVALID_METADATA"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationRejectionReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->INVALID_METADATA:Lco/bird/android/model/identification/IdentificationRejectionReason;

    new-instance v0, Lco/bird/android/model/identification/IdentificationRejectionReason;

    const-string v1, "NOT_COMPLETED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationRejectionReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->NOT_COMPLETED:Lco/bird/android/model/identification/IdentificationRejectionReason;

    new-instance v0, Lco/bird/android/model/identification/IdentificationRejectionReason;

    const-string v1, "INGESTION_FAILURE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationRejectionReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->INGESTION_FAILURE:Lco/bird/android/model/identification/IdentificationRejectionReason;

    new-instance v0, Lco/bird/android/model/identification/IdentificationRejectionReason;

    const-string v1, "MINIMUM_AGE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationRejectionReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->MINIMUM_AGE:Lco/bird/android/model/identification/IdentificationRejectionReason;

    new-instance v0, Lco/bird/android/model/identification/IdentificationRejectionReason;

    const-string v1, "VEHICLE_CLASS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationRejectionReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->VEHICLE_CLASS:Lco/bird/android/model/identification/IdentificationRejectionReason;

    new-instance v0, Lco/bird/android/model/identification/IdentificationRejectionReason;

    const-string v1, "BAD_SCORE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationRejectionReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->BAD_SCORE:Lco/bird/android/model/identification/IdentificationRejectionReason;

    new-instance v0, Lco/bird/android/model/identification/IdentificationRejectionReason;

    const-string v1, "DUPLICATE_ID"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationRejectionReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->DUPLICATE_ID:Lco/bird/android/model/identification/IdentificationRejectionReason;

    new-instance v0, Lco/bird/android/model/identification/IdentificationRejectionReason;

    const-string v1, "EXPIRED"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationRejectionReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->EXPIRED:Lco/bird/android/model/identification/IdentificationRejectionReason;

    new-instance v0, Lco/bird/android/model/identification/IdentificationRejectionReason;

    const-string v1, "RATE_LIMIT"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationRejectionReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->RATE_LIMIT:Lco/bird/android/model/identification/IdentificationRejectionReason;

    new-instance v0, Lco/bird/android/model/identification/IdentificationRejectionReason;

    const-string v1, "UNKNOWN"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationRejectionReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->UNKNOWN:Lco/bird/android/model/identification/IdentificationRejectionReason;

    invoke-static {}, Lco/bird/android/model/identification/IdentificationRejectionReason;->$values()[Lco/bird/android/model/identification/IdentificationRejectionReason;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->$VALUES:[Lco/bird/android/model/identification/IdentificationRejectionReason;

    new-instance v0, Lco/bird/android/model/identification/IdentificationRejectionReason$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/identification/IdentificationRejectionReason$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->Companion:Lco/bird/android/model/identification/IdentificationRejectionReason$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/identification/IdentificationRejectionReason;
    .locals 1

    const-class v0, Lco/bird/android/model/identification/IdentificationRejectionReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/identification/IdentificationRejectionReason;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/identification/IdentificationRejectionReason;
    .locals 1

    sget-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason;->$VALUES:[Lco/bird/android/model/identification/IdentificationRejectionReason;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/identification/IdentificationRejectionReason;

    return-object v0
.end method


# virtual methods
.method public final explanationResId(Z)I
    .locals 2

    sget-object v0, Lco/bird/android/model/identification/IdentificationRejectionReason$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget p1, Lnl4;->identification_reject_explanation_unknown:I

    goto :goto_0

    :pswitch_1
    if-eqz p1, :cond_0

    sget p1, Lnl4;->identification_reject_explanation_ingestion_failure_known:I

    goto :goto_0

    :cond_0
    sget p1, Lnl4;->identification_reject_explanation_ingestion_failure_unkown:I

    goto :goto_0

    :pswitch_2
    sget p1, Lnl4;->identification_reject_explanation_rate_limit:I

    goto :goto_0

    :pswitch_3
    sget p1, Lnl4;->identification_reject_explanation_expired:I

    goto :goto_0

    :pswitch_4
    sget p1, Lnl4;->identification_reject_explanation_duplicate:I

    goto :goto_0

    :pswitch_5
    sget p1, Lnl4;->identification_reject_explanation_authenticity:I

    goto :goto_0

    :pswitch_6
    sget p1, Lnl4;->identification_reject_explanation_vehicle_class_not_met:I

    goto :goto_0

    :pswitch_7
    sget p1, Lnl4;->identification_reject_explanation_min_age_not_met:I

    goto :goto_0

    :pswitch_8
    sget p1, Lnl4;->identification_reject_explanation_invalid_data:I

    goto :goto_0

    :pswitch_9
    sget p1, Lnl4;->identification_reject_explanation_server_error:I

    goto :goto_0

    :pswitch_a
    sget p1, Lnl4;->identification_reject_explanation_unsupported_document:I

    :goto_0
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
