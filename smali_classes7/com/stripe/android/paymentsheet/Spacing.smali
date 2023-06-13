.class final Lcom/stripe/android/paymentsheet/Spacing;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0004\u001a\u0004\u0008\u0008\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0004\u001a\u0004\u0008\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0004\u001a\u0004\u0008\u000c\u0010\u0006\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/Spacing;",
        "",
        "Lk61;",
        "cardLeadingInnerPadding",
        "F",
        "getCardLeadingInnerPadding-D9Ej5fM",
        "()F",
        "carouselOuterPadding",
        "getCarouselOuterPadding-D9Ej5fM",
        "carouselInnerPadding",
        "getCarouselInnerPadding-D9Ej5fM",
        "iconSize",
        "getIconSize-D9Ej5fM",
        "<init>",
        "()V",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentMethodsUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsUI.kt\ncom/stripe/android/paymentsheet/Spacing\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,274:1\n154#2:275\n154#2:276\n154#2:277\n154#2:278\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsUI.kt\ncom/stripe/android/paymentsheet/Spacing\n*L\n43#1:275\n44#1:276\n45#1:277\n46#1:278\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/Spacing;

.field private static final cardLeadingInnerPadding:F

.field private static final carouselInnerPadding:F

.field private static final carouselOuterPadding:F

.field private static final iconSize:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/Spacing;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/Spacing;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/Spacing;->INSTANCE:Lcom/stripe/android/paymentsheet/Spacing;

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v1

    sput v1, Lcom/stripe/android/paymentsheet/Spacing;->cardLeadingInnerPadding:F

    const/16 v1, 0x14

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    sput v1, Lcom/stripe/android/paymentsheet/Spacing;->carouselOuterPadding:F

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, Lcom/stripe/android/paymentsheet/Spacing;->carouselInnerPadding:F

    const/16 v0, 0x1c

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, Lcom/stripe/android/paymentsheet/Spacing;->iconSize:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCardLeadingInnerPadding-D9Ej5fM()F
    .locals 1

    sget v0, Lcom/stripe/android/paymentsheet/Spacing;->cardLeadingInnerPadding:F

    return v0
.end method

.method public final getCarouselInnerPadding-D9Ej5fM()F
    .locals 1

    sget v0, Lcom/stripe/android/paymentsheet/Spacing;->carouselInnerPadding:F

    return v0
.end method

.method public final getCarouselOuterPadding-D9Ej5fM()F
    .locals 1

    sget v0, Lcom/stripe/android/paymentsheet/Spacing;->carouselOuterPadding:F

    return v0
.end method

.method public final getIconSize-D9Ej5fM()F
    .locals 1

    sget v0, Lcom/stripe/android/paymentsheet/Spacing;->iconSize:F

    return v0
.end method
