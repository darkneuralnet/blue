.class public final Lcom/stripe/android/ui/core/injection/FormControllerModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002Jj\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0016\u0008\u0001\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e2\u0018\u0008\u0001\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u000e2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/injection/FormControllerModule;",
        "",
        "()V",
        "provideTransformSpecToElements",
        "Lcom/stripe/android/ui/core/forms/TransformSpecToElements;",
        "addressRepository",
        "Lcom/stripe/android/uicore/address/AddressRepository;",
        "context",
        "Landroid/content/Context;",
        "merchantName",
        "",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "initialValues",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "shippingValues",
        "viewOnlyFields",
        "",
        "payments-ui-core_release"
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

.field public static final INSTANCE:Lcom/stripe/android/ui/core/injection/FormControllerModule;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/injection/FormControllerModule;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/injection/FormControllerModule;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/injection/FormControllerModule;->INSTANCE:Lcom/stripe/android/ui/core/injection/FormControllerModule;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final provideTransformSpecToElements(Lcom/stripe/android/uicore/address/AddressRepository;Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Lcom/stripe/android/ui/core/forms/TransformSpecToElements;
    .locals 11
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;)",
            "Lcom/stripe/android/ui/core/forms/TransformSpecToElements;"
        }
    .end annotation

    move-object v0, p4

    const-string v1, "addressRepository"

    move-object v3, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    move-object v9, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "merchantName"

    move-object v8, p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "initialValues"

    move-object/from16 v4, p5

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "viewOnlyFields"

    move-object/from16 v10, p7

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/stripe/android/model/PaymentIntent;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent;->getAmount()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent;->getCurrency()Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    new-instance v2, Lcom/stripe/android/ui/core/Amount;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-direct {v2, v5, v6, v0}, Lcom/stripe/android/ui/core/Amount;-><init>(JLjava/lang/String;)V

    :cond_1
    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v0, Lcom/stripe/android/ui/core/forms/TransformSpecToElements;

    move-object v2, v0

    move-object v3, p1

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object v8, p3

    move-object v9, p2

    move-object/from16 v10, p7

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/ui/core/forms/TransformSpecToElements;-><init>(Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Map;Ljava/util/Map;Lcom/stripe/android/ui/core/Amount;ZLjava/lang/String;Landroid/content/Context;Ljava/util/Set;)V

    return-object v0
.end method
