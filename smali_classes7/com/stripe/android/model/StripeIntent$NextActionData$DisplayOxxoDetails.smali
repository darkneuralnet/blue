.class public final Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;
.super Lcom/stripe/android/model/StripeIntent$NextActionData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/StripeIntent$NextActionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DisplayOxxoDetails"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J+\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;",
        "Lcom/stripe/android/model/StripeIntent$NextActionData;",
        "expiresAfter",
        "",
        "number",
        "",
        "hostedVoucherUrl",
        "(ILjava/lang/String;Ljava/lang/String;)V",
        "getExpiresAfter",
        "()I",
        "getHostedVoucherUrl",
        "()Ljava/lang/String;",
        "getNumber",
        "component1",
        "component2",
        "component3",
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
            "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final expiresAfter:I

.field private final hostedVoucherUrl:Ljava/lang/String;

.field private final number:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;-><init>(ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/model/StripeIntent$NextActionData;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->expiresAfter:I

    iput-object p2, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->number:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->hostedVoucherUrl:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->expiresAfter:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->number:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->hostedVoucherUrl:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->copy(ILjava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->expiresAfter:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->number:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->hostedVoucherUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;
    .locals 1

    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;-><init>(ILjava/lang/String;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;

    iget v1, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->expiresAfter:I

    iget v3, p1, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->expiresAfter:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->number:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->number:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->hostedVoucherUrl:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->hostedVoucherUrl:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getExpiresAfter()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->expiresAfter:I

    return v0
.end method

.method public final getHostedVoucherUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->hostedVoucherUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->number:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->expiresAfter:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->number:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->hostedVoucherUrl:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->expiresAfter:I

    iget-object v1, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->number:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->hostedVoucherUrl:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DisplayOxxoDetails(expiresAfter="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", number="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", hostedVoucherUrl="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->expiresAfter:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->number:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;->hostedVoucherUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
