.class public final Lcom/stripe/android/core/networking/RetryDelaySupplier;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/networking/RetryDelaySupplier$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\u0008\u0017\u00a2\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/RetryDelaySupplier;",
        "",
        "()V",
        "incrementSeconds",
        "",
        "(J)V",
        "getDelayMillis",
        "maxRetries",
        "",
        "remainingRetries",
        "Companion",
        "stripe-core_release"
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
.field private static final Companion:Lcom/stripe/android/core/networking/RetryDelaySupplier$Companion;

.field private static final DEFAULT_INCREMENT_SECONDS:J = 0x2L
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final incrementSeconds:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/core/networking/RetryDelaySupplier$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/core/networking/RetryDelaySupplier$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/core/networking/RetryDelaySupplier;->Companion:Lcom/stripe/android/core/networking/RetryDelaySupplier$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-wide/16 v0, 0x2

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/core/networking/RetryDelaySupplier;-><init>(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/stripe/android/core/networking/RetryDelaySupplier;->incrementSeconds:J

    return-void
.end method


# virtual methods
.method public final getDelayMillis(II)J
    .locals 4

    const/4 v0, 0x1

    invoke-static {p2, v0, p1}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result p2

    sub-int/2addr p1, p2

    add-int/2addr p1, v0

    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v0, p0, Lcom/stripe/android/core/networking/RetryDelaySupplier;->incrementSeconds:J

    long-to-double v0, v0

    int-to-double v2, p1

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-long v0, v0

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    return-wide p1
.end method
