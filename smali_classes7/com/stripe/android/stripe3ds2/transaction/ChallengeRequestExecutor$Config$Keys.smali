.class public final Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Keys"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u0004H\u00c0\u0003\u00a2\u0006\u0002\u0008\u000bJ\u000e\u0010\u000c\u001a\u00020\u0004H\u00c0\u0003\u00a2\u0006\u0002\u0008\rJ\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\u0008\u0010\u0015\u001a\u00020\u0010H\u0016J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0000H\u0002J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;",
        "Ljava/io/Serializable;",
        "Landroid/os/Parcelable;",
        "sdkPrivateKeyEncoded",
        "",
        "acsPublicKeyEncoded",
        "([B[B)V",
        "getAcsPublicKeyEncoded$3ds2sdk_release",
        "()[B",
        "getSdkPrivateKeyEncoded$3ds2sdk_release",
        "component1",
        "component1$3ds2sdk_release",
        "component2",
        "component2$3ds2sdk_release",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "typedEquals",
        "keys",
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
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final acsPublicKeyEncoded:[B

.field private final sdkPrivateKeyEncoded:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys$Creator;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>([B[B)V
    .locals 1

    const-string v0, "sdkPrivateKeyEncoded"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acsPublicKeyEncoded"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->sdkPrivateKeyEncoded:[B

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->acsPublicKeyEncoded:[B

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;[B[BILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->sdkPrivateKeyEncoded:[B

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->acsPublicKeyEncoded:[B

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->copy([B[B)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    move-result-object p0

    return-object p0
.end method

.method private final typedEquals(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;)Z
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->sdkPrivateKeyEncoded:[B

    iget-object v1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->sdkPrivateKeyEncoded:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->acsPublicKeyEncoded:[B

    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->acsPublicKeyEncoded:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public final component1$3ds2sdk_release()[B
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->sdkPrivateKeyEncoded:[B

    return-object v0
.end method

.method public final component2$3ds2sdk_release()[B
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->acsPublicKeyEncoded:[B

    return-object v0
.end method

.method public final copy([B[B)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;
    .locals 1

    const-string v0, "sdkPrivateKeyEncoded"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acsPublicKeyEncoded"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;-><init>([B[B)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->typedEquals(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final getAcsPublicKeyEncoded$3ds2sdk_release()[B
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->acsPublicKeyEncoded:[B

    return-object v0
.end method

.method public final getSdkPrivateKeyEncoded$3ds2sdk_release()[B
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->sdkPrivateKeyEncoded:[B

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->sdkPrivateKeyEncoded:[B

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->acsPublicKeyEncoded:[B

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/stripe/android/stripe3ds2/utils/ObjectUtils;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Keys(sdkPrivateKeyEncoded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->sdkPrivateKeyEncoded:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", acsPublicKeyEncoded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->acsPublicKeyEncoded:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->sdkPrivateKeyEncoded:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->acsPublicKeyEncoded:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method
