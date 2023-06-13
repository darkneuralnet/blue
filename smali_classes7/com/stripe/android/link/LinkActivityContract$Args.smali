.class public final Lcom/stripe/android/link/LinkActivityContract$Args;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/view/ActivityStarter$Args;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkActivityContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Args"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;,
        Lcom/stripe/android/link/LinkActivityContract$Args$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0012\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 =2\u00020\u0001:\u0002=>B\'\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\u000e\u0010)\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008*J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c0\u0003\u00a2\u0006\u0002\u0008,J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007H\u00c0\u0003\u00a2\u0006\u0002\u0008.J+\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\t\u00100\u001a\u000201H\u00d6\u0001J\u0013\u00102\u001a\u0002032\u0008\u00104\u001a\u0004\u0018\u000105H\u00d6\u0003J\t\u00106\u001a\u000201H\u00d6\u0001J\t\u00107\u001a\u00020\u000cH\u00d6\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000201H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0080\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000cX\u0080\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0012\u0010\u000e\u001a\u0004\u0008\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000cX\u0080\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0015\u0010\u000e\u001a\u0004\u0008\u0016\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000cX\u0080\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001a\u0010\u000e\u001a\u0004\u0008\u001b\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR*\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0018\u00010\u001fX\u0080\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008!\u0010\u000e\u001a\u0004\u0008\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0080\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008&\u0010\u000e\u001a\u0004\u0008\'\u0010(\u00a8\u0006?"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "Lcom/stripe/android/view/ActivityStarter$Args;",
        "configuration",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "prefilledCardParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "injectionParams",
        "Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;",
        "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;)V",
        "getConfiguration$link_release",
        "()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "customerEmail",
        "",
        "getCustomerEmail$link_release$annotations",
        "()V",
        "getCustomerEmail$link_release",
        "()Ljava/lang/String;",
        "customerName",
        "getCustomerName$link_release$annotations",
        "getCustomerName$link_release",
        "customerPhone",
        "getCustomerPhone$link_release$annotations",
        "getCustomerPhone$link_release",
        "getInjectionParams$link_release",
        "()Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;",
        "merchantName",
        "getMerchantName$link_release$annotations",
        "getMerchantName$link_release",
        "getPrefilledCardParams$link_release",
        "()Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "shippingValues",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getShippingValues$link_release$annotations",
        "getShippingValues$link_release",
        "()Ljava/util/Map;",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "getStripeIntent$link_release$annotations",
        "getStripeIntent$link_release",
        "()Lcom/stripe/android/model/StripeIntent;",
        "component1",
        "component1$link_release",
        "component2",
        "component2$link_release",
        "component3",
        "component3$link_release",
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
        "Companion",
        "InjectionParams",
        "link_release"
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
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/link/LinkActivityContract$Args$Companion;


# instance fields
.field private final configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

.field private final customerEmail:Ljava/lang/String;

.field private final customerName:Ljava/lang/String;

.field private final customerPhone:Ljava/lang/String;

.field private final injectionParams:Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

.field private final merchantName:Ljava/lang/String;

.field private final prefilledCardParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

.field private final shippingValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeIntent:Lcom/stripe/android/model/StripeIntent;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/LinkActivityContract$Args$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/LinkActivityContract$Args$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/LinkActivityContract$Args;->Companion:Lcom/stripe/android/link/LinkActivityContract$Args$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/LinkActivityContract$Args;->$stable:I

    new-instance v0, Lcom/stripe/android/link/LinkActivityContract$Args$Creator;

    invoke-direct {v0}, Lcom/stripe/android/link/LinkActivityContract$Args$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/link/LinkActivityContract$Args;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->prefilledCardParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    iput-object p3, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->injectionParams:Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getMerchantName()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->merchantName:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getCustomerEmail()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->customerEmail:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getCustomerPhone()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->customerPhone:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getCustomerName()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->customerName:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getShippingValues()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->shippingValues:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/LinkActivityContract$Args;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;ILjava/lang/Object;)Lcom/stripe/android/link/LinkActivityContract$Args;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->prefilledCardParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->injectionParams:Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/LinkActivityContract$Args;->copy(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;)Lcom/stripe/android/link/LinkActivityContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCustomerEmail$link_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCustomerName$link_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCustomerPhone$link_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getMerchantName$link_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getShippingValues$link_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getStripeIntent$link_release$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final component1$link_release()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    return-object v0
.end method

.method public final component2$link_release()Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->prefilledCardParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    return-object v0
.end method

.method public final component3$link_release()Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->injectionParams:Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;)Lcom/stripe/android/link/LinkActivityContract$Args;
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/link/LinkActivityContract$Args;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;)V

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
    instance-of v1, p1, Lcom/stripe/android/link/LinkActivityContract$Args;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/LinkActivityContract$Args;

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iget-object v3, p1, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->prefilledCardParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    iget-object v3, p1, Lcom/stripe/android/link/LinkActivityContract$Args;->prefilledCardParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->injectionParams:Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    iget-object p1, p1, Lcom/stripe/android/link/LinkActivityContract$Args;->injectionParams:Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getConfiguration$link_release()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    return-object v0
.end method

.method public final getCustomerEmail$link_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->customerEmail:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomerName$link_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->customerName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomerPhone$link_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->customerPhone:Ljava/lang/String;

    return-object v0
.end method

.method public final getInjectionParams$link_release()Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->injectionParams:Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    return-object v0
.end method

.method public final getMerchantName$link_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrefilledCardParams$link_release()Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->prefilledCardParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    return-object v0
.end method

.method public final getShippingValues$link_release()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->shippingValues:Ljava/util/Map;

    return-object v0
.end method

.method public final getStripeIntent$link_release()Lcom/stripe/android/model/StripeIntent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->prefilledCardParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethodCreateParams;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->injectionParams:Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->prefilledCardParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    iget-object v2, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->injectionParams:Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Args(configuration="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", prefilledCardParams="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", injectionParams="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->prefilledCardParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->injectionParams:Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/LinkActivityContract$Args$InjectionParams;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    return-void
.end method
