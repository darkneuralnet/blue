.class final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR \u0010\u0003\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0004\u001a\u0004\u0008\u0008\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0004\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;",
        "",
        "Lk61;",
        "extended",
        "F",
        "getExtended-D9Ej5fM",
        "()F",
        "normal",
        "getNormal-D9Ej5fM",
        "",
        "lineHeightMultiplier",
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
        "SMAP\nPollingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,261:1\n154#2:262\n154#2:263\n*S KotlinDebug\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing\n*L\n44#1:262\n45#1:263\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;

.field private static final extended:F

.field public static final lineHeightMultiplier:F = 1.3f

.field private static final normal:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->extended:F

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    sput v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->normal:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getExtended-D9Ej5fM()F
    .locals 1

    sget v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->extended:F

    return v0
.end method

.method public final getNormal-D9Ej5fM()F
    .locals 1

    sget v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->normal:F

    return v0
.end method
