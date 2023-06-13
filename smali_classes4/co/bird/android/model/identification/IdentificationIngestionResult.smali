.class public final enum Lco/bird/android/model/identification/IdentificationIngestionResult;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/identification/IdentificationIngestionResult$Companion;,
        Lco/bird/android/model/identification/IdentificationIngestionResult$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/identification/IdentificationIngestionResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0086\u0001\u0018\u0000 \u00162\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationIngestionResult;",
        "",
        "(Ljava/lang/String;I)V",
        "explanationResId",
        "",
        "()Ljava/lang/Integer;",
        "toWire",
        "",
        "SUCCESS",
        "BLURRY",
        "NOT_READABLE",
        "PARTIALLY_READABLE",
        "DOCUMENT_TYPE_NOT_SUPPORTED",
        "REJECTED",
        "DAMAGED",
        "INVALID",
        "FACE_DID_NOT_MATCH",
        "FRAUD_SUSPECTED",
        "NETWORK_ERROR",
        "RESULT_TIMEOUT",
        "UNKNOWN_ERROR",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIdentificationEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationEntry.kt\nco/bird/android/model/identification/IdentificationIngestionResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/identification/IdentificationIngestionResult;

.field public static final enum BLURRY:Lco/bird/android/model/identification/IdentificationIngestionResult;

.field public static final Companion:Lco/bird/android/model/identification/IdentificationIngestionResult$Companion;

.field public static final enum DAMAGED:Lco/bird/android/model/identification/IdentificationIngestionResult;

.field public static final enum DOCUMENT_TYPE_NOT_SUPPORTED:Lco/bird/android/model/identification/IdentificationIngestionResult;

.field public static final enum FACE_DID_NOT_MATCH:Lco/bird/android/model/identification/IdentificationIngestionResult;

.field public static final enum FRAUD_SUSPECTED:Lco/bird/android/model/identification/IdentificationIngestionResult;

.field public static final enum INVALID:Lco/bird/android/model/identification/IdentificationIngestionResult;

.field public static final enum NETWORK_ERROR:Lco/bird/android/model/identification/IdentificationIngestionResult;

.field public static final enum NOT_READABLE:Lco/bird/android/model/identification/IdentificationIngestionResult;

.field public static final enum PARTIALLY_READABLE:Lco/bird/android/model/identification/IdentificationIngestionResult;

.field public static final enum REJECTED:Lco/bird/android/model/identification/IdentificationIngestionResult;

.field public static final enum RESULT_TIMEOUT:Lco/bird/android/model/identification/IdentificationIngestionResult;

.field public static final enum SUCCESS:Lco/bird/android/model/identification/IdentificationIngestionResult;

.field public static final enum UNKNOWN:Lco/bird/android/model/identification/IdentificationIngestionResult;

.field public static final enum UNKNOWN_ERROR:Lco/bird/android/model/identification/IdentificationIngestionResult;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/identification/IdentificationIngestionResult;
    .locals 3

    const/16 v0, 0xe

    new-array v0, v0, [Lco/bird/android/model/identification/IdentificationIngestionResult;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/identification/IdentificationIngestionResult;->SUCCESS:Lco/bird/android/model/identification/IdentificationIngestionResult;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/identification/IdentificationIngestionResult;->BLURRY:Lco/bird/android/model/identification/IdentificationIngestionResult;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/identification/IdentificationIngestionResult;->NOT_READABLE:Lco/bird/android/model/identification/IdentificationIngestionResult;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/identification/IdentificationIngestionResult;->PARTIALLY_READABLE:Lco/bird/android/model/identification/IdentificationIngestionResult;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/identification/IdentificationIngestionResult;->DOCUMENT_TYPE_NOT_SUPPORTED:Lco/bird/android/model/identification/IdentificationIngestionResult;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/identification/IdentificationIngestionResult;->REJECTED:Lco/bird/android/model/identification/IdentificationIngestionResult;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/identification/IdentificationIngestionResult;->DAMAGED:Lco/bird/android/model/identification/IdentificationIngestionResult;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/identification/IdentificationIngestionResult;->INVALID:Lco/bird/android/model/identification/IdentificationIngestionResult;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/identification/IdentificationIngestionResult;->FACE_DID_NOT_MATCH:Lco/bird/android/model/identification/IdentificationIngestionResult;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/identification/IdentificationIngestionResult;->FRAUD_SUSPECTED:Lco/bird/android/model/identification/IdentificationIngestionResult;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/identification/IdentificationIngestionResult;->NETWORK_ERROR:Lco/bird/android/model/identification/IdentificationIngestionResult;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lco/bird/android/model/identification/IdentificationIngestionResult;->RESULT_TIMEOUT:Lco/bird/android/model/identification/IdentificationIngestionResult;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lco/bird/android/model/identification/IdentificationIngestionResult;->UNKNOWN_ERROR:Lco/bird/android/model/identification/IdentificationIngestionResult;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lco/bird/android/model/identification/IdentificationIngestionResult;->UNKNOWN:Lco/bird/android/model/identification/IdentificationIngestionResult;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationIngestionResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->SUCCESS:Lco/bird/android/model/identification/IdentificationIngestionResult;

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string v1, "BLURRY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationIngestionResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->BLURRY:Lco/bird/android/model/identification/IdentificationIngestionResult;

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string v1, "NOT_READABLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationIngestionResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->NOT_READABLE:Lco/bird/android/model/identification/IdentificationIngestionResult;

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string v1, "PARTIALLY_READABLE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationIngestionResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->PARTIALLY_READABLE:Lco/bird/android/model/identification/IdentificationIngestionResult;

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string v1, "DOCUMENT_TYPE_NOT_SUPPORTED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationIngestionResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->DOCUMENT_TYPE_NOT_SUPPORTED:Lco/bird/android/model/identification/IdentificationIngestionResult;

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string v1, "REJECTED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationIngestionResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->REJECTED:Lco/bird/android/model/identification/IdentificationIngestionResult;

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string v1, "DAMAGED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationIngestionResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->DAMAGED:Lco/bird/android/model/identification/IdentificationIngestionResult;

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string v1, "INVALID"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationIngestionResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->INVALID:Lco/bird/android/model/identification/IdentificationIngestionResult;

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string v1, "FACE_DID_NOT_MATCH"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationIngestionResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->FACE_DID_NOT_MATCH:Lco/bird/android/model/identification/IdentificationIngestionResult;

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string v1, "FRAUD_SUSPECTED"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationIngestionResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->FRAUD_SUSPECTED:Lco/bird/android/model/identification/IdentificationIngestionResult;

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string v1, "NETWORK_ERROR"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationIngestionResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->NETWORK_ERROR:Lco/bird/android/model/identification/IdentificationIngestionResult;

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string v1, "RESULT_TIMEOUT"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationIngestionResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->RESULT_TIMEOUT:Lco/bird/android/model/identification/IdentificationIngestionResult;

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string v1, "UNKNOWN_ERROR"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationIngestionResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->UNKNOWN_ERROR:Lco/bird/android/model/identification/IdentificationIngestionResult;

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    const-string v1, "UNKNOWN"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationIngestionResult;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->UNKNOWN:Lco/bird/android/model/identification/IdentificationIngestionResult;

    invoke-static {}, Lco/bird/android/model/identification/IdentificationIngestionResult;->$values()[Lco/bird/android/model/identification/IdentificationIngestionResult;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->$VALUES:[Lco/bird/android/model/identification/IdentificationIngestionResult;

    new-instance v0, Lco/bird/android/model/identification/IdentificationIngestionResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/identification/IdentificationIngestionResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->Companion:Lco/bird/android/model/identification/IdentificationIngestionResult$Companion;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/identification/IdentificationIngestionResult;
    .locals 1

    const-class v0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/identification/IdentificationIngestionResult;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/identification/IdentificationIngestionResult;
    .locals 1

    sget-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult;->$VALUES:[Lco/bird/android/model/identification/IdentificationIngestionResult;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/identification/IdentificationIngestionResult;

    return-object v0
.end method


# virtual methods
.method public final explanationResId()Ljava/lang/Integer;
    .locals 2

    sget-object v0, Lco/bird/android/model/identification/IdentificationIngestionResult$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    sget v0, Lnl4;->identification_ingestion_result_unknown_error:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    sget v0, Lnl4;->identification_ingestion_result_unknown_error:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    sget v0, Lnl4;->identification_ingestion_result_result_timeout:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_3
    sget v0, Lnl4;->identification_ingestion_result_network_error:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_4
    sget v0, Lnl4;->identification_ingestion_result_fraud_suspected:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_5
    sget v0, Lnl4;->identification_ingestion_result_face_did_not_match:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_6
    sget v0, Lnl4;->identification_ingestion_result_invalid:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_7
    sget v0, Lnl4;->identification_ingestion_result_damaged:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_8
    sget v0, Lnl4;->identification_ingestion_result_rejected:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_9
    sget v0, Lnl4;->identification_ingestion_result_not_supported:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_a
    sget v0, Lnl4;->identification_ingestion_result_not_readable:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_b
    sget v0, Lnl4;->identification_ingestion_result_blurry:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_c
    const/4 v0, 0x0

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
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

.method public final toWire()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "getDefault()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lco/bird/android/model/identification/IdentificationIngestionResult;->UNKNOWN:Lco/bird/android/model/identification/IdentificationIngestionResult;

    if-eq p0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method
