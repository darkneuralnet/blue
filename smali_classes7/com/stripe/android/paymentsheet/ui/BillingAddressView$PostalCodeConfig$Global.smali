.class public final Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;
.super Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Global"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;",
        "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;",
        "()V",
        "inputType",
        "",
        "getInputType",
        "()I",
        "maxLength",
        "getMaxLength",
        "getKeyListener",
        "Landroid/text/method/KeyListener;",
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

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;

.field private static final inputType:I

.field private static final maxLength:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;

    const/16 v0, 0xd

    sput v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;->maxLength:I

    const/16 v0, 0x70

    sput v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;->inputType:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public getInputType()I
    .locals 1

    sget v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;->inputType:I

    return v0
.end method

.method public getKeyListener()Landroid/text/method/KeyListener;
    .locals 2

    invoke-static {}, Landroid/text/method/TextKeyListener;->getInstance()Landroid/text/method/TextKeyListener;

    move-result-object v0

    const-string v1, "getInstance()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getMaxLength()I
    .locals 1

    sget v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;->maxLength:I

    return v0
.end method
