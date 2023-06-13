.class public final Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/view/ActivityStarter$Args;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/AddPaymentMethodActivityStarter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Args"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Companion;,
        Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008#\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u00029:BG\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u001d\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008\u001eJ\u000e\u0010\u001f\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\u0008 J\u000e\u0010!\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\u0008\"J\u000e\u0010#\u001a\u00020\u0008H\u00c0\u0003\u00a2\u0006\u0002\u0008$J\u0010\u0010%\u001a\u0004\u0018\u00010\nH\u00c0\u0003\u00a2\u0006\u0002\u0008&J\u000e\u0010\'\u001a\u00020\u000cH\u00c0\u0003\u00a2\u0006\u0002\u0008(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000cH\u00c0\u0003\u00a2\u0006\u0004\u0008*\u0010\u001bJX\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0003\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0002\u0010,J\t\u0010-\u001a\u00020\u000cH\u00d6\u0001J\u0013\u0010.\u001a\u00020\u00052\u0008\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00101\u001a\u00020\u000cH\u00d6\u0001J\t\u00102\u001a\u000203H\u00d6\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000cH\u00d6\u0001R\u0014\u0010\u000b\u001a\u00020\u000cX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u0008X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000cX\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006;"
    }
    d2 = {
        "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;",
        "Lcom/stripe/android/view/ActivityStarter$Args;",
        "billingAddressFields",
        "Lcom/stripe/android/view/BillingAddressFields;",
        "shouldAttachToCustomer",
        "",
        "isPaymentSessionActive",
        "paymentMethodType",
        "Lcom/stripe/android/model/PaymentMethod$Type;",
        "paymentConfiguration",
        "Lcom/stripe/android/PaymentConfiguration;",
        "addPaymentMethodFooterLayoutId",
        "",
        "windowFlags",
        "(Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/PaymentConfiguration;ILjava/lang/Integer;)V",
        "getAddPaymentMethodFooterLayoutId$payments_core_release",
        "()I",
        "getBillingAddressFields$payments_core_release",
        "()Lcom/stripe/android/view/BillingAddressFields;",
        "isPaymentSessionActive$payments_core_release",
        "()Z",
        "getPaymentConfiguration$payments_core_release",
        "()Lcom/stripe/android/PaymentConfiguration;",
        "getPaymentMethodType$payments_core_release",
        "()Lcom/stripe/android/model/PaymentMethod$Type;",
        "getShouldAttachToCustomer$payments_core_release",
        "getWindowFlags$payments_core_release",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "component1",
        "component1$payments_core_release",
        "component2",
        "component2$payments_core_release",
        "component3",
        "component3$payments_core_release",
        "component4",
        "component4$payments_core_release",
        "component5",
        "component5$payments_core_release",
        "component6",
        "component6$payments_core_release",
        "component7",
        "component7$payments_core_release",
        "copy",
        "(Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/PaymentConfiguration;ILjava/lang/Integer;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
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
            "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Companion;


# instance fields
.field private final addPaymentMethodFooterLayoutId:I

.field private final billingAddressFields:Lcom/stripe/android/view/BillingAddressFields;

.field private final isPaymentSessionActive:Z

.field private final paymentConfiguration:Lcom/stripe/android/PaymentConfiguration;

.field private final paymentMethodType:Lcom/stripe/android/model/PaymentMethod$Type;

.field private final shouldAttachToCustomer:Z

.field private final windowFlags:Ljava/lang/Integer;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->Companion:Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Companion;

    new-instance v0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Creator;

    invoke-direct {v0}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/PaymentConfiguration;ILjava/lang/Integer;)V
    .locals 1

    const-string v0, "billingAddressFields"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->billingAddressFields:Lcom/stripe/android/view/BillingAddressFields;

    iput-boolean p2, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->shouldAttachToCustomer:Z

    iput-boolean p3, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->isPaymentSessionActive:Z

    iput-object p4, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentMethodType:Lcom/stripe/android/model/PaymentMethod$Type;

    iput-object p5, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentConfiguration:Lcom/stripe/android/PaymentConfiguration;

    iput p6, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->addPaymentMethodFooterLayoutId:I

    iput-object p7, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->windowFlags:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/PaymentConfiguration;ILjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;-><init>(Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/PaymentConfiguration;ILjava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/PaymentConfiguration;ILjava/lang/Integer;ILjava/lang/Object;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->billingAddressFields:Lcom/stripe/android/view/BillingAddressFields;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->shouldAttachToCustomer:Z

    :cond_1
    move p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->isPaymentSessionActive:Z

    :cond_2
    move v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentMethodType:Lcom/stripe/android/model/PaymentMethod$Type;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentConfiguration:Lcom/stripe/android/PaymentConfiguration;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget p6, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->addPaymentMethodFooterLayoutId:I

    :cond_5
    move v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-object p7, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->windowFlags:Ljava/lang/Integer;

    :cond_6
    move-object v4, p7

    move-object p2, p0

    move-object p3, p1

    move p4, p9

    move p5, v0

    move-object p6, v1

    move-object p7, v2

    move p8, v3

    move-object p9, v4

    invoke-virtual/range {p2 .. p9}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->copy(Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/PaymentConfiguration;ILjava/lang/Integer;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1$payments_core_release()Lcom/stripe/android/view/BillingAddressFields;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->billingAddressFields:Lcom/stripe/android/view/BillingAddressFields;

    return-object v0
.end method

.method public final component2$payments_core_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->shouldAttachToCustomer:Z

    return v0
.end method

.method public final component3$payments_core_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->isPaymentSessionActive:Z

    return v0
.end method

.method public final component4$payments_core_release()Lcom/stripe/android/model/PaymentMethod$Type;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentMethodType:Lcom/stripe/android/model/PaymentMethod$Type;

    return-object v0
.end method

.method public final component5$payments_core_release()Lcom/stripe/android/PaymentConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentConfiguration:Lcom/stripe/android/PaymentConfiguration;

    return-object v0
.end method

.method public final component6$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->addPaymentMethodFooterLayoutId:I

    return v0
.end method

.method public final component7$payments_core_release()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->windowFlags:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/PaymentConfiguration;ILjava/lang/Integer;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;
    .locals 9

    const-string v0, "billingAddressFields"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodType"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;

    move-object v1, v0

    move v3, p2

    move v4, p3

    move-object v6, p5

    move v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;-><init>(Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/PaymentConfiguration;ILjava/lang/Integer;)V

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
    instance-of v1, p1, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;

    iget-object v1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->billingAddressFields:Lcom/stripe/android/view/BillingAddressFields;

    iget-object v3, p1, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->billingAddressFields:Lcom/stripe/android/view/BillingAddressFields;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->shouldAttachToCustomer:Z

    iget-boolean v3, p1, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->shouldAttachToCustomer:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->isPaymentSessionActive:Z

    iget-boolean v3, p1, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->isPaymentSessionActive:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentMethodType:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v3, p1, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentMethodType:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentConfiguration:Lcom/stripe/android/PaymentConfiguration;

    iget-object v3, p1, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentConfiguration:Lcom/stripe/android/PaymentConfiguration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->addPaymentMethodFooterLayoutId:I

    iget v3, p1, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->addPaymentMethodFooterLayoutId:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->windowFlags:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->windowFlags:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAddPaymentMethodFooterLayoutId$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->addPaymentMethodFooterLayoutId:I

    return v0
.end method

.method public final getBillingAddressFields$payments_core_release()Lcom/stripe/android/view/BillingAddressFields;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->billingAddressFields:Lcom/stripe/android/view/BillingAddressFields;

    return-object v0
.end method

.method public final getPaymentConfiguration$payments_core_release()Lcom/stripe/android/PaymentConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentConfiguration:Lcom/stripe/android/PaymentConfiguration;

    return-object v0
.end method

.method public final getPaymentMethodType$payments_core_release()Lcom/stripe/android/model/PaymentMethod$Type;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentMethodType:Lcom/stripe/android/model/PaymentMethod$Type;

    return-object v0
.end method

.method public final getShouldAttachToCustomer$payments_core_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->shouldAttachToCustomer:Z

    return v0
.end method

.method public final getWindowFlags$payments_core_release()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->windowFlags:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->billingAddressFields:Lcom/stripe/android/view/BillingAddressFields;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->shouldAttachToCustomer:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->isPaymentSessionActive:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentMethodType:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentConfiguration:Lcom/stripe/android/PaymentConfiguration;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/PaymentConfiguration;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->addPaymentMethodFooterLayoutId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->windowFlags:Ljava/lang/Integer;

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final isPaymentSessionActive$payments_core_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->isPaymentSessionActive:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->billingAddressFields:Lcom/stripe/android/view/BillingAddressFields;

    iget-boolean v1, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->shouldAttachToCustomer:Z

    iget-boolean v2, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->isPaymentSessionActive:Z

    iget-object v3, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentMethodType:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v4, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentConfiguration:Lcom/stripe/android/PaymentConfiguration;

    iget v5, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->addPaymentMethodFooterLayoutId:I

    iget-object v6, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->windowFlags:Ljava/lang/Integer;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Args(billingAddressFields="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldAttachToCustomer="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isPaymentSessionActive="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", paymentMethodType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentConfiguration="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", addPaymentMethodFooterLayoutId="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", windowFlags="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->billingAddressFields:Lcom/stripe/android/view/BillingAddressFields;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->shouldAttachToCustomer:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->isPaymentSessionActive:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentMethodType:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/PaymentMethod$Type;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->paymentConfiguration:Lcom/stripe/android/PaymentConfiguration;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/PaymentConfiguration;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget p2, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->addPaymentMethodFooterLayoutId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;->windowFlags:Ljava/lang/Integer;

    if-nez p2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_1
    return-void
.end method
