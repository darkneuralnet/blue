.class public final Lcom/stripe/android/core/Logger$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/Logger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003*\u0002\u0004\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0006\u0010\u000f\u001a\u00020\u000cJ\u0006\u0010\u0010\u001a\u00020\u000cR\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0008R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/core/Logger$Companion;",
        "",
        "()V",
        "NOOP_LOGGER",
        "com/stripe/android/core/Logger$Companion$NOOP_LOGGER$1",
        "Lcom/stripe/android/core/Logger$Companion$NOOP_LOGGER$1;",
        "REAL_LOGGER",
        "com/stripe/android/core/Logger$Companion$REAL_LOGGER$1",
        "Lcom/stripe/android/core/Logger$Companion$REAL_LOGGER$1;",
        "TAG",
        "",
        "getInstance",
        "Lcom/stripe/android/core/Logger;",
        "enableLogging",
        "",
        "noop",
        "real",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/core/Logger$Companion;

.field private static final NOOP_LOGGER:Lcom/stripe/android/core/Logger$Companion$NOOP_LOGGER$1;

.field private static final REAL_LOGGER:Lcom/stripe/android/core/Logger$Companion$REAL_LOGGER$1;

.field private static final TAG:Ljava/lang/String; = "StripeSdk"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/core/Logger$Companion;

    invoke-direct {v0}, Lcom/stripe/android/core/Logger$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/core/Logger$Companion;->$$INSTANCE:Lcom/stripe/android/core/Logger$Companion;

    new-instance v0, Lcom/stripe/android/core/Logger$Companion$REAL_LOGGER$1;

    invoke-direct {v0}, Lcom/stripe/android/core/Logger$Companion$REAL_LOGGER$1;-><init>()V

    sput-object v0, Lcom/stripe/android/core/Logger$Companion;->REAL_LOGGER:Lcom/stripe/android/core/Logger$Companion$REAL_LOGGER$1;

    new-instance v0, Lcom/stripe/android/core/Logger$Companion$NOOP_LOGGER$1;

    invoke-direct {v0}, Lcom/stripe/android/core/Logger$Companion$NOOP_LOGGER$1;-><init>()V

    sput-object v0, Lcom/stripe/android/core/Logger$Companion;->NOOP_LOGGER:Lcom/stripe/android/core/Logger$Companion$NOOP_LOGGER$1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInstance(Z)Lcom/stripe/android/core/Logger;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/core/Logger$Companion;->real()Lcom/stripe/android/core/Logger;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/core/Logger$Companion;->noop()Lcom/stripe/android/core/Logger;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final noop()Lcom/stripe/android/core/Logger;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/Logger$Companion;->NOOP_LOGGER:Lcom/stripe/android/core/Logger$Companion$NOOP_LOGGER$1;

    return-object v0
.end method

.method public final real()Lcom/stripe/android/core/Logger;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/Logger$Companion;->REAL_LOGGER:Lcom/stripe/android/core/Logger$Companion$REAL_LOGGER$1;

    return-object v0
.end method
