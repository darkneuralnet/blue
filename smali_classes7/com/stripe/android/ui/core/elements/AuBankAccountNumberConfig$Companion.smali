.class final Lcom/stripe/android/ui/core/elements/AuBankAccountNumberConfig$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/elements/AuBankAccountNumberConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/AuBankAccountNumberConfig$Companion;",
        "",
        "()V",
        "LENGTH",
        "",
        "VALID_INPUT_RANGES",
        "Lkotlin/ranges/CharRange;",
        "getVALID_INPUT_RANGES",
        "()Lkotlin/ranges/CharRange;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberConfig$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getVALID_INPUT_RANGES()Lkotlin/ranges/CharRange;
    .locals 1

    invoke-static {}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberConfig;->access$getVALID_INPUT_RANGES$cp()Lkotlin/ranges/CharRange;

    move-result-object v0

    return-object v0
.end method
