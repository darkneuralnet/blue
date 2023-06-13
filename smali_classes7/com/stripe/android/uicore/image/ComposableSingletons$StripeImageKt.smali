.class public final Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;

.field public static lambda-1:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Lh10;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public static lambda-2:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Lh10;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;

    invoke-direct {v0}, Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;->INSTANCE:Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;

    sget-object v0, Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt$lambda-1$1;

    const v1, 0x588315ec

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;->lambda-1:Lkotlin/jvm/functions/Function3;

    const v0, -0x382340e0    # -113022.25f

    sget-object v1, Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt$lambda-2$1;->INSTANCE:Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt$lambda-2$1;

    invoke-static {v0, v2, v1}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;->lambda-2:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLambda-1$stripe_ui_core_release()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Lh10;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;->lambda-1:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final getLambda-2$stripe_ui_core_release()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Lh10;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;->lambda-2:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
