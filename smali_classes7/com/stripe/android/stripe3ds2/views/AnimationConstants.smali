.class public final Lcom/stripe/android/stripe3ds2/views/AnimationConstants;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/AnimationConstants;",
        "",
        "()V",
        "SLIDE_IN",
        "",
        "getSLIDE_IN",
        "()I",
        "SLIDE_OUT",
        "getSLIDE_OUT",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/stripe3ds2/views/AnimationConstants;

.field private static final SLIDE_IN:I

.field private static final SLIDE_OUT:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;-><init>()V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->INSTANCE:Lcom/stripe/android/stripe3ds2/views/AnimationConstants;

    sget v0, Lcom/stripe/android/stripe3ds2/R$anim;->stripe_3ds2_challenge_transition_slide_in:I

    sput v0, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->SLIDE_IN:I

    sget v0, Lcom/stripe/android/stripe3ds2/R$anim;->stripe_3ds2_challenge_transition_slide_out:I

    sput v0, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->SLIDE_OUT:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getSLIDE_IN()I
    .locals 1

    sget v0, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->SLIDE_IN:I

    return v0
.end method

.method public final getSLIDE_OUT()I
    .locals 1

    sget v0, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->SLIDE_OUT:I

    return v0
.end method
