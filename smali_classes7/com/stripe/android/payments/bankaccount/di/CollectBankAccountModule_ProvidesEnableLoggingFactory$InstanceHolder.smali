.class final Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesEnableLoggingFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesEnableLoggingFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InstanceHolder"
.end annotation


# static fields
.field private static final INSTANCE:Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesEnableLoggingFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesEnableLoggingFactory;

    invoke-direct {v0}, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesEnableLoggingFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesEnableLoggingFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesEnableLoggingFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a()Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesEnableLoggingFactory;
    .locals 1

    sget-object v0, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesEnableLoggingFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesEnableLoggingFactory;

    return-object v0
.end method
