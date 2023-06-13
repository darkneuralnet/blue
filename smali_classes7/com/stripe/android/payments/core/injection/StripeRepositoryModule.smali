.class public abstract Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\u0008\u0007J\u0015\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH!\u00a2\u0006\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;",
        "",
        "()V",
        "bindsAnalyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "default",
        "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;",
        "bindsAnalyticsRequestExecutor$payments_core_release",
        "bindsStripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "stripeApiRepository",
        "Lcom/stripe/android/networking/StripeApiRepository;",
        "bindsStripeRepository$payments_core_release",
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


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract bindsAnalyticsRequestExecutor$payments_core_release(Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsStripeRepository$payments_core_release(Lcom/stripe/android/networking/StripeApiRepository;)Lcom/stripe/android/networking/StripeRepository;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
