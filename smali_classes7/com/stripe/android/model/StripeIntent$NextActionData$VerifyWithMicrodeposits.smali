.class public final Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;
.super Lcom/stripe/android/model/StripeIntent$NextActionData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/StripeIntent$NextActionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "VerifyWithMicrodeposits"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;",
        "Lcom/stripe/android/model/StripeIntent$NextActionData;",
        "arrivalDate",
        "",
        "hostedVerificationUrl",
        "",
        "microdepositType",
        "Lcom/stripe/android/model/MicrodepositType;",
        "(JLjava/lang/String;Lcom/stripe/android/model/MicrodepositType;)V",
        "getArrivalDate",
        "()J",
        "getHostedVerificationUrl",
        "()Ljava/lang/String;",
        "getMicrodepositType",
        "()Lcom/stripe/android/model/MicrodepositType;",
        "component1",
        "component2",
        "component3",
        "copy",
        "describeContents",
        "",
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
        "payments-core_release"
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
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final arrivalDate:J

.field private final hostedVerificationUrl:Ljava/lang/String;

.field private final microdepositType:Lcom/stripe/android/model/MicrodepositType;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Lcom/stripe/android/model/MicrodepositType;)V
    .locals 1

    const-string v0, "hostedVerificationUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "microdepositType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/model/StripeIntent$NextActionData;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-wide p1, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->arrivalDate:J

    iput-object p3, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->hostedVerificationUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->microdepositType:Lcom/stripe/android/model/MicrodepositType;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;JLjava/lang/String;Lcom/stripe/android/model/MicrodepositType;ILjava/lang/Object;)Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->arrivalDate:J

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p3, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->hostedVerificationUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->microdepositType:Lcom/stripe/android/model/MicrodepositType;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->copy(JLjava/lang/String;Lcom/stripe/android/model/MicrodepositType;)Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->arrivalDate:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->hostedVerificationUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/model/MicrodepositType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->microdepositType:Lcom/stripe/android/model/MicrodepositType;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Lcom/stripe/android/model/MicrodepositType;)Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;
    .locals 1

    const-string v0, "hostedVerificationUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "microdepositType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;-><init>(JLjava/lang/String;Lcom/stripe/android/model/MicrodepositType;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;

    iget-wide v3, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->arrivalDate:J

    iget-wide v5, p1, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->arrivalDate:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->hostedVerificationUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->hostedVerificationUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->microdepositType:Lcom/stripe/android/model/MicrodepositType;

    iget-object p1, p1, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->microdepositType:Lcom/stripe/android/model/MicrodepositType;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getArrivalDate()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->arrivalDate:J

    return-wide v0
.end method

.method public final getHostedVerificationUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->hostedVerificationUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getMicrodepositType()Lcom/stripe/android/model/MicrodepositType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->microdepositType:Lcom/stripe/android/model/MicrodepositType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->arrivalDate:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->hostedVerificationUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->microdepositType:Lcom/stripe/android/model/MicrodepositType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->arrivalDate:J

    iget-object v2, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->hostedVerificationUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->microdepositType:Lcom/stripe/android/model/MicrodepositType;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "VerifyWithMicrodeposits(arrivalDate="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", hostedVerificationUrl="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", microdepositType="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->arrivalDate:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->hostedVerificationUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$VerifyWithMicrodeposits;->microdepositType:Lcom/stripe/android/model/MicrodepositType;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
