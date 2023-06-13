.class public abstract Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008!\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011H\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0014H\'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0017H\'\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule;",
        "",
        "()V",
        "bindsCustomerRepository",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
        "repository",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;",
        "bindsEventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;",
        "bindsIntentConfirmationInterceptor",
        "Lcom/stripe/android/IntentConfirmationInterceptor;",
        "impl",
        "Lcom/stripe/android/DefaultIntentConfirmationInterceptor;",
        "bindsLinkAccountStatusProvider",
        "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
        "Lcom/stripe/android/paymentsheet/state/DefaultLinkAccountStatusProvider;",
        "bindsPaymentSheetLoader",
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;",
        "Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;",
        "bindsStripeIntentRepository",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;",
        "Companion",
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
.field public static final Companion:Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule;->Companion:Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract bindsCustomerRepository(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;)Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsEventReporter(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;)Lcom/stripe/android/paymentsheet/analytics/EventReporter;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsIntentConfirmationInterceptor(Lcom/stripe/android/DefaultIntentConfirmationInterceptor;)Lcom/stripe/android/IntentConfirmationInterceptor;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsLinkAccountStatusProvider(Lcom/stripe/android/paymentsheet/state/DefaultLinkAccountStatusProvider;)Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsPaymentSheetLoader(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;)Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsStripeIntentRepository(Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;)Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
