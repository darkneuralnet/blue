.class public final Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;
.super Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LinkInline"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010!\u001a\u00020\u000cH\u00d6\u0001J\u0013\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\u000cH\u00d6\u0001J\t\u0010\'\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000cH\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\r\u0010\u0008\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0012\u0010\u0008\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0019\u0010\u0008R\u001a\u0010\u001a\u001a\u00020\u001bX\u0096\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001c\u0010\u0008\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006-"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "linkPaymentDetails",
        "Lcom/stripe/android/link/LinkPaymentDetails$New;",
        "(Lcom/stripe/android/link/LinkPaymentDetails$New;)V",
        "customerRequestedSave",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;",
        "getCustomerRequestedSave$annotations",
        "()V",
        "getCustomerRequestedSave",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;",
        "iconResource",
        "",
        "getIconResource$annotations",
        "getIconResource",
        "()I",
        "label",
        "",
        "getLabel$annotations",
        "getLabel",
        "()Ljava/lang/String;",
        "getLinkPaymentDetails",
        "()Lcom/stripe/android/link/LinkPaymentDetails$New;",
        "paymentDetails",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "getPaymentDetails$annotations",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "getPaymentMethodCreateParams$annotations",
        "getPaymentMethodCreateParams",
        "()Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "component1",
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
        "paymentsheet_release"
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
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final customerRequestedSave:Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

.field private final iconResource:I

.field private final label:Ljava/lang/String;

.field private final linkPaymentDetails:Lcom/stripe/android/link/LinkPaymentDetails$New;

.field private final paymentDetails:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

.field private final paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/stripe/android/model/PaymentMethodCreateParams;->$stable:I

    sget v1, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/link/LinkPaymentDetails$New;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->$stable:I

    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkPaymentDetails$New;)V
    .locals 2

    const-string v0, "linkPaymentDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->linkPaymentDetails:Lcom/stripe/android/link/LinkPaymentDetails$New;

    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;->NoRequest:Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->customerRequestedSave:Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentDetails$New;->getPaymentDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->paymentDetails:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentDetails$New;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    sget p1, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_paymentsheet_link:I

    iput p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->iconResource:I

    instance-of p1, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    const-string v1, "\u00b7\u00b7\u00b7\u00b7"

    if-eqz p1, :cond_0

    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getLast4()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p1, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    if-eqz p1, :cond_1

    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->getLast4()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->label:Ljava/lang/String;

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;Lcom/stripe/android/link/LinkPaymentDetails$New;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->linkPaymentDetails:Lcom/stripe/android/link/LinkPaymentDetails$New;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->copy(Lcom/stripe/android/link/LinkPaymentDetails$New;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCustomerRequestedSave$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getIconResource$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getLabel$annotations()V
    .locals 0

    return-void
.end method

.method private static synthetic getPaymentDetails$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getPaymentMethodCreateParams$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/link/LinkPaymentDetails$New;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->linkPaymentDetails:Lcom/stripe/android/link/LinkPaymentDetails$New;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/link/LinkPaymentDetails$New;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;
    .locals 1

    const-string v0, "linkPaymentDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;-><init>(Lcom/stripe/android/link/LinkPaymentDetails$New;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->linkPaymentDetails:Lcom/stripe/android/link/LinkPaymentDetails$New;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->linkPaymentDetails:Lcom/stripe/android/link/LinkPaymentDetails$New;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getCustomerRequestedSave()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->customerRequestedSave:Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    return-object v0
.end method

.method public final getIconResource()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->iconResource:I

    return v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkPaymentDetails()Lcom/stripe/android/link/LinkPaymentDetails$New;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->linkPaymentDetails:Lcom/stripe/android/link/LinkPaymentDetails$New;

    return-object v0
.end method

.method public getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->linkPaymentDetails:Lcom/stripe/android/link/LinkPaymentDetails$New;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->linkPaymentDetails:Lcom/stripe/android/link/LinkPaymentDetails$New;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "LinkInline(linkPaymentDetails="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->linkPaymentDetails:Lcom/stripe/android/link/LinkPaymentDetails$New;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
