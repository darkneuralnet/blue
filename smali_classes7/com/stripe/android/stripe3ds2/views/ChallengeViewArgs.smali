.class public final Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 A2\u00020\u0001:\u0001AB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010#\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008$J\u000e\u0010%\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\u0008&J\u000e\u0010\'\u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\u0008(J\u000e\u0010)\u001a\u00020\tH\u00c0\u0003\u00a2\u0006\u0002\u0008*J\u000e\u0010+\u001a\u00020\u000bH\u00c0\u0003\u00a2\u0006\u0002\u0008,J\u000e\u0010-\u001a\u00020\rH\u00c0\u0003\u00a2\u0006\u0002\u0008.J\u000e\u0010/\u001a\u00020\u000fH\u00c0\u0003\u00a2\u0006\u0002\u00080JO\u00101\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\t\u00102\u001a\u00020\rH\u00d6\u0001J\u0013\u00103\u001a\u0002042\u0008\u00105\u001a\u0004\u0018\u000106H\u00d6\u0003J\t\u00107\u001a\u00020\rH\u00d6\u0001J\u0006\u00108\u001a\u000209J\t\u0010:\u001a\u00020;H\u00d6\u0001J\u0019\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\rH\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0008\u001a\u00020\tX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u000c\u001a\u00020\rX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"\u00a8\u0006B"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;",
        "Landroid/os/Parcelable;",
        "cresData",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;",
        "creqData",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;",
        "uiCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;",
        "creqExecutorConfig",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;",
        "creqExecutorFactory",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;",
        "timeoutMins",
        "",
        "intentData",
        "Lcom/stripe/android/stripe3ds2/transaction/IntentData;",
        "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)V",
        "getCreqData$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;",
        "getCreqExecutorConfig$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;",
        "getCreqExecutorFactory$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;",
        "getCresData$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;",
        "getIntentData$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;",
        "sdkTransactionId",
        "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
        "getSdkTransactionId$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
        "getTimeoutMins$3ds2sdk_release",
        "()I",
        "getUiCustomization$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;",
        "component1",
        "component1$3ds2sdk_release",
        "component2",
        "component2$3ds2sdk_release",
        "component3",
        "component3$3ds2sdk_release",
        "component4",
        "component4$3ds2sdk_release",
        "component5",
        "component5$3ds2sdk_release",
        "component6",
        "component6$3ds2sdk_release",
        "component7",
        "component7$3ds2sdk_release",
        "copy",
        "describeContents",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toBundle",
        "Landroid/os/Bundle;",
        "toString",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "Companion",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs$Companion;

.field private static final EXTRA_ARGS:Ljava/lang/String; = "extra_args"


# instance fields
.field private final creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

.field private final creqExecutorConfig:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

.field private final creqExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;

.field private final cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

.field private final intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

.field private final timeoutMins:I

.field private final uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->Companion:Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs$Companion;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs$Creator;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)V
    .locals 1

    const-string v0, "cresData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiCustomization"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqExecutorConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqExecutorFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentData"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorConfig:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;

    iput p6, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->timeoutMins:I

    iput-object p7, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;ILcom/stripe/android/stripe3ds2/transaction/IntentData;ILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    :cond_1
    move-object p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorConfig:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget p6, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->timeoutMins:I

    :cond_5
    move v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-object p7, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    :cond_6
    move-object v4, p7

    move-object p2, p0

    move-object p3, p1

    move-object p4, p9

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move p8, v3

    move-object p9, v4

    invoke-virtual/range {p2 .. p9}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->copy(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    return-object v0
.end method

.method public final component2$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    return-object v0
.end method

.method public final component3$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    return-object v0
.end method

.method public final component4$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorConfig:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    return-object v0
.end method

.method public final component5$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;

    return-object v0
.end method

.method public final component6$3ds2sdk_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->timeoutMins:I

    return v0
.end method

.method public final component7$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;
    .locals 9

    const-string v0, "cresData"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqData"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiCustomization"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqExecutorConfig"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqExecutorFactory"

    move-object v6, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentData"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    move-object v1, v0

    move v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;-><init>(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    return-object v0
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
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorConfig:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorConfig:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->timeoutMins:I

    iget v3, p1, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->timeoutMins:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCreqData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    return-object v0
.end method

.method public final getCreqExecutorConfig$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorConfig:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    return-object v0
.end method

.method public final getCreqExecutorFactory$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;

    return-object v0
.end method

.method public final getCresData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    return-object v0
.end method

.method public final getIntentData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    return-object v0
.end method

.method public final getSdkTransactionId$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->getSdkTransId()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    move-result-object v0

    return-object v0
.end method

.method public final getTimeoutMins$3ds2sdk_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->timeoutMins:I

    return v0
.end method

.method public final getUiCustomization$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorConfig:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->timeoutMins:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transaction/IntentData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toBundle()Landroid/os/Bundle;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "extra_args"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ld70;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ChallengeViewArgs(cresData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", creqData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", uiCustomization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", creqExecutorConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorConfig:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", creqExecutorFactory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeoutMins="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->timeoutMins:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", intentData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->cresData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqData:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorConfig:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->creqExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->timeoutMins:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/IntentData;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
