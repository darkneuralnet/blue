.class public final Lcom/stripe/android/utils/AnimationConstants;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/utils/AnimationConstants;",
        "",
        "()V",
        "FADE_IN",
        "",
        "getFADE_IN",
        "()I",
        "FADE_OUT",
        "getFADE_OUT",
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

.field private static final FADE_IN:I

.field private static final FADE_OUT:I

.field public static final INSTANCE:Lcom/stripe/android/utils/AnimationConstants;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/utils/AnimationConstants;

    invoke-direct {v0}, Lcom/stripe/android/utils/AnimationConstants;-><init>()V

    sput-object v0, Lcom/stripe/android/utils/AnimationConstants;->INSTANCE:Lcom/stripe/android/utils/AnimationConstants;

    sget v0, Lcom/stripe/android/R$anim;->stripe_paymentsheet_transition_fade_in:I

    sput v0, Lcom/stripe/android/utils/AnimationConstants;->FADE_IN:I

    sget v0, Lcom/stripe/android/R$anim;->stripe_paymentsheet_transition_fade_out:I

    sput v0, Lcom/stripe/android/utils/AnimationConstants;->FADE_OUT:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getFADE_IN()I
    .locals 1

    sget v0, Lcom/stripe/android/utils/AnimationConstants;->FADE_IN:I

    return v0
.end method

.method public final getFADE_OUT()I
    .locals 1

    sget v0, Lcom/stripe/android/utils/AnimationConstants;->FADE_OUT:I

    return v0
.end method
