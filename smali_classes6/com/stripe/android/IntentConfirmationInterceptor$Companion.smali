.class public final Lcom/stripe/android/IntentConfirmationInterceptor$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/IntentConfirmationInterceptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/IntentConfirmationInterceptor$Companion;",
        "",
        "()V",
        "createIntentCallback",
        "Lcom/stripe/android/AbsCreateIntentCallback;",
        "getCreateIntentCallback",
        "()Lcom/stripe/android/AbsCreateIntentCallback;",
        "setCreateIntentCallback",
        "(Lcom/stripe/android/AbsCreateIntentCallback;)V",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/IntentConfirmationInterceptor$Companion;

.field private static createIntentCallback:Lcom/stripe/android/AbsCreateIntentCallback;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/IntentConfirmationInterceptor$Companion;

    invoke-direct {v0}, Lcom/stripe/android/IntentConfirmationInterceptor$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/IntentConfirmationInterceptor$Companion;->$$INSTANCE:Lcom/stripe/android/IntentConfirmationInterceptor$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCreateIntentCallback()Lcom/stripe/android/AbsCreateIntentCallback;
    .locals 1

    sget-object v0, Lcom/stripe/android/IntentConfirmationInterceptor$Companion;->createIntentCallback:Lcom/stripe/android/AbsCreateIntentCallback;

    return-object v0
.end method

.method public final setCreateIntentCallback(Lcom/stripe/android/AbsCreateIntentCallback;)V
    .locals 0

    sput-object p1, Lcom/stripe/android/IntentConfirmationInterceptor$Companion;->createIntentCallback:Lcom/stripe/android/AbsCreateIntentCallback;

    return-void
.end method
