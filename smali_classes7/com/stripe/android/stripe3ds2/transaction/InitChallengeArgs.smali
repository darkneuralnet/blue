.class public final Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u000e\u0010\u0017\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008\u0018J\u000e\u0010\u0019\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\u0008\u001aJ\u000e\u0010\u001b\u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\u0008\u001cJ\u000e\u0010\u001d\u001a\u00020\tH\u00c0\u0003\u00a2\u0006\u0002\u0008\u001eJ\u000e\u0010\u001f\u001a\u00020\u000bH\u00c0\u0003\u00a2\u0006\u0002\u0008 J;\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\"\u001a\u00020\tH\u00d6\u0001J\u0013\u0010#\u001a\u00020$2\u0008\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020\tH\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\tH\u00d6\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0008\u001a\u00020\tX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006."
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;",
        "Landroid/os/Parcelable;",
        "sdkReferenceNumber",
        "",
        "sdkKeyPair",
        "Ljava/security/KeyPair;",
        "challengeParameters",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;",
        "timeoutMins",
        "",
        "intentData",
        "Lcom/stripe/android/stripe3ds2/transaction/IntentData;",
        "(Ljava/lang/String;Ljava/security/KeyPair;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)V",
        "getChallengeParameters$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;",
        "getIntentData$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;",
        "getSdkKeyPair$3ds2sdk_release",
        "()Ljava/security/KeyPair;",
        "getSdkReferenceNumber$3ds2sdk_release",
        "()Ljava/lang/String;",
        "getTimeoutMins$3ds2sdk_release",
        "()I",
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
        "copy",
        "describeContents",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
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
            "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final challengeParameters:Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

.field private final intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

.field private final sdkKeyPair:Ljava/security/KeyPair;

.field private final sdkReferenceNumber:Ljava/lang/String;

.field private final timeoutMins:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs$Creator;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/security/KeyPair;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)V
    .locals 1

    const-string v0, "sdkReferenceNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkKeyPair"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "challengeParameters"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentData"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkReferenceNumber:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkKeyPair:Ljava/security/KeyPair;

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->challengeParameters:Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

    iput p4, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->timeoutMins:I

    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;Ljava/lang/String;Ljava/security/KeyPair;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;ILcom/stripe/android/stripe3ds2/transaction/IntentData;ILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkReferenceNumber:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkKeyPair:Ljava/security/KeyPair;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->challengeParameters:Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget p4, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->timeoutMins:I

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->copy(Ljava/lang/String;Ljava/security/KeyPair;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1$3ds2sdk_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkReferenceNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component2$3ds2sdk_release()Ljava/security/KeyPair;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkKeyPair:Ljava/security/KeyPair;

    return-object v0
.end method

.method public final component3$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->challengeParameters:Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

    return-object v0
.end method

.method public final component4$3ds2sdk_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->timeoutMins:I

    return v0
.end method

.method public final component5$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/security/KeyPair;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;
    .locals 7

    const-string v0, "sdkReferenceNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkKeyPair"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "challengeParameters"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentData"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;-><init>(Ljava/lang/String;Ljava/security/KeyPair;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)V

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
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkReferenceNumber:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkReferenceNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkKeyPair:Ljava/security/KeyPair;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkKeyPair:Ljava/security/KeyPair;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->challengeParameters:Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

    iget-object v3, p1, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->challengeParameters:Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->timeoutMins:I

    iget v3, p1, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->timeoutMins:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getChallengeParameters$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->challengeParameters:Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

    return-object v0
.end method

.method public final getIntentData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    return-object v0
.end method

.method public final getSdkKeyPair$3ds2sdk_release()Ljava/security/KeyPair;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkKeyPair:Ljava/security/KeyPair;

    return-object v0
.end method

.method public final getSdkReferenceNumber$3ds2sdk_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkReferenceNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeoutMins$3ds2sdk_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->timeoutMins:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkReferenceNumber:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkKeyPair:Ljava/security/KeyPair;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->challengeParameters:Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->timeoutMins:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transaction/IntentData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InitChallengeArgs(sdkReferenceNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkReferenceNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sdkKeyPair="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkKeyPair:Ljava/security/KeyPair;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", challengeParameters="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->challengeParameters:Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeoutMins="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->timeoutMins:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", intentData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

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

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkReferenceNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->sdkKeyPair:Ljava/security/KeyPair;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->challengeParameters:Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;->writeToParcel(Landroid/os/Parcel;I)V

    iget v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->timeoutMins:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->intentData:Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/IntentData;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
