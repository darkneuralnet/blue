.class public final Lcom/stripe/android/SetupIntentResult;
.super Lcom/stripe/android/StripeIntentResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/StripeIntentResult<",
        "Lcom/stripe/android/model/SetupIntent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B%\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\r\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c2\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/SetupIntentResult;",
        "Lcom/stripe/android/StripeIntentResult;",
        "Lcom/stripe/android/model/SetupIntent;",
        "intent",
        "outcomeFromFlow",
        "",
        "failureMessage",
        "",
        "(Lcom/stripe/android/model/SetupIntent;ILjava/lang/String;)V",
        "getFailureMessage",
        "()Ljava/lang/String;",
        "getIntent",
        "()Lcom/stripe/android/model/SetupIntent;",
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
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/SetupIntentResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final failureMessage:Ljava/lang/String;

.field private final intent:Lcom/stripe/android/model/SetupIntent;

.field private final outcomeFromFlow:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/SetupIntentResult$Creator;

    invoke-direct {v0}, Lcom/stripe/android/SetupIntentResult$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/SetupIntentResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/SetupIntent;ILjava/lang/String;)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/stripe/android/StripeIntentResult;-><init>(I)V

    iput-object p1, p0, Lcom/stripe/android/SetupIntentResult;->intent:Lcom/stripe/android/model/SetupIntent;

    iput p2, p0, Lcom/stripe/android/SetupIntentResult;->outcomeFromFlow:I

    iput-object p3, p0, Lcom/stripe/android/SetupIntentResult;->failureMessage:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/model/SetupIntent;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/SetupIntentResult;-><init>(Lcom/stripe/android/model/SetupIntent;ILjava/lang/String;)V

    return-void
.end method

.method private final component2()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/SetupIntentResult;->outcomeFromFlow:I

    return v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/SetupIntentResult;Lcom/stripe/android/model/SetupIntent;ILjava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/SetupIntentResult;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/SetupIntentResult;->getIntent()Lcom/stripe/android/model/SetupIntent;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/stripe/android/SetupIntentResult;->outcomeFromFlow:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/SetupIntentResult;->getFailureMessage()Ljava/lang/String;

    move-result-object p3

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/SetupIntentResult;->copy(Lcom/stripe/android/model/SetupIntent;ILjava/lang/String;)Lcom/stripe/android/SetupIntentResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/SetupIntent;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/SetupIntentResult;->getIntent()Lcom/stripe/android/model/SetupIntent;

    move-result-object v0

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/SetupIntentResult;->getFailureMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/SetupIntent;ILjava/lang/String;)Lcom/stripe/android/SetupIntentResult;
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/SetupIntentResult;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/SetupIntentResult;-><init>(Lcom/stripe/android/model/SetupIntent;ILjava/lang/String;)V

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
    instance-of v1, p1, Lcom/stripe/android/SetupIntentResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/SetupIntentResult;

    invoke-virtual {p0}, Lcom/stripe/android/SetupIntentResult;->getIntent()Lcom/stripe/android/model/SetupIntent;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/SetupIntentResult;->getIntent()Lcom/stripe/android/model/SetupIntent;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/SetupIntentResult;->outcomeFromFlow:I

    iget v3, p1, Lcom/stripe/android/SetupIntentResult;->outcomeFromFlow:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lcom/stripe/android/SetupIntentResult;->getFailureMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/SetupIntentResult;->getFailureMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public getFailureMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/SetupIntentResult;->failureMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getIntent()Lcom/stripe/android/model/SetupIntent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/SetupIntentResult;->intent:Lcom/stripe/android/model/SetupIntent;

    return-object v0
.end method

.method public bridge synthetic getIntent()Lcom/stripe/android/model/StripeIntent;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/SetupIntentResult;->getIntent()Lcom/stripe/android/model/SetupIntent;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/SetupIntentResult;->getIntent()Lcom/stripe/android/model/SetupIntent;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/model/SetupIntent;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/SetupIntentResult;->outcomeFromFlow:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/stripe/android/SetupIntentResult;->getFailureMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/SetupIntentResult;->getFailureMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lcom/stripe/android/SetupIntentResult;->getIntent()Lcom/stripe/android/model/SetupIntent;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/SetupIntentResult;->outcomeFromFlow:I

    invoke-virtual {p0}, Lcom/stripe/android/SetupIntentResult;->getFailureMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SetupIntentResult(intent="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", outcomeFromFlow="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", failureMessage="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/SetupIntentResult;->intent:Lcom/stripe/android/model/SetupIntent;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/SetupIntent;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, Lcom/stripe/android/SetupIntentResult;->outcomeFromFlow:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/stripe/android/SetupIntentResult;->failureMessage:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
