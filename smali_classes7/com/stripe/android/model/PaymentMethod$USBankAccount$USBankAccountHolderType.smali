.class public final enum Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PaymentMethod$USBankAccount;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "USBankAccountHolderType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;",
        ">;",
        "Lcom/stripe/android/core/model/StripeModel;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0008\u001a\u00020\tH\u00d6\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;",
        "",
        "Lcom/stripe/android/core/model/StripeModel;",
        "value",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "UNKNOWN",
        "INDIVIDUAL",
        "COMPANY",
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

.field public static final enum COMPANY:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum INDIVIDUAL:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

.field public static final enum UNKNOWN:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->UNKNOWN:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->INDIVIDUAL:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->COMPANY:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    const/4 v1, 0x0

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->UNKNOWN:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    new-instance v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    const/4 v1, 0x1

    const-string v2, "individual"

    const-string v3, "INDIVIDUAL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->INDIVIDUAL:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    new-instance v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    const/4 v1, 0x2

    const-string v2, "company"

    const-string v3, "COMPANY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->COMPANY:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    invoke-static {}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->$values()[Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->$VALUES:[Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    new-instance v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->value:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;
    .locals 1

    const-class v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->$VALUES:[Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->value:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
