.class public final Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/PaymentAuthConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Stripe3ds2Config"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Companion;,
        Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0019\u0008\u0000\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\r\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008\u000eJ\u000e\u0010\u000f\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\u0008\u0010J\u001d\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;",
        "Landroid/os/Parcelable;",
        "timeout",
        "",
        "uiCustomization",
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;",
        "(ILcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;)V",
        "getTimeout$payments_core_release",
        "()I",
        "getUiCustomization$payments_core_release",
        "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;",
        "checkValidTimeout",
        "",
        "component1",
        "component1$payments_core_release",
        "component2",
        "component2$payments_core_release",
        "copy",
        "describeContents",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "Builder",
        "Companion",
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
            "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Companion;

.field public static final DEFAULT_TIMEOUT:I = 0x5


# instance fields
.field private final timeout:I

.field private final uiCustomization:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->Companion:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->$stable:I

    new-instance v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Creator;

    invoke-direct {v0}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;)V
    .locals 1

    const-string v0, "uiCustomization"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->timeout:I

    iput-object p2, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->uiCustomization:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;

    invoke-direct {p0, p1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->checkValidTimeout(I)V

    return-void
.end method

.method private final checkValidTimeout(I)V
    .locals 1

    const/4 v0, 0x5

    if-lt p1, v0, :cond_0

    const/16 v0, 0x63

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Timeout value must be between 5 and 99, inclusive"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic copy$default(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;ILcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;ILjava/lang/Object;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->timeout:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->uiCustomization:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->copy(ILcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->timeout:I

    return v0
.end method

.method public final component2$payments_core_release()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->uiCustomization:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;

    return-object v0
.end method

.method public final copy(ILcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;
    .locals 1

    const-string v0, "uiCustomization"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;-><init>(ILcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;)V

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
    instance-of v1, p1, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;

    iget v1, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->timeout:I

    iget v3, p1, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->timeout:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->uiCustomization:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;

    iget-object p1, p1, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->uiCustomization:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getTimeout$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->timeout:I

    return v0
.end method

.method public final getUiCustomization$payments_core_release()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->uiCustomization:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->timeout:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->uiCustomization:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;

    invoke-virtual {v1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->timeout:I

    iget-object v1, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->uiCustomization:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Stripe3ds2Config(timeout="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", uiCustomization="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->timeout:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;->uiCustomization:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
