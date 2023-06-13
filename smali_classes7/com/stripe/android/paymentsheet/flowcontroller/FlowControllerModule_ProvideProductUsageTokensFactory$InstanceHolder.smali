.class final Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InstanceHolder"
.end annotation


# static fields
.field private static final INSTANCE:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory;

    return-object v0
.end method
