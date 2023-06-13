.class public final Lcom/stripe/android/link/ui/wallet/ComposableSingletons$WalletScreenKt;
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
.field public static final INSTANCE:Lcom/stripe/android/link/ui/wallet/ComposableSingletons$WalletScreenKt;

.field public static lambda-1:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "LZc5;",
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

    new-instance v0, Lcom/stripe/android/link/ui/wallet/ComposableSingletons$WalletScreenKt;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/wallet/ComposableSingletons$WalletScreenKt;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/wallet/ComposableSingletons$WalletScreenKt;->INSTANCE:Lcom/stripe/android/link/ui/wallet/ComposableSingletons$WalletScreenKt;

    const/4 v0, 0x0

    sget-object v1, Lcom/stripe/android/link/ui/wallet/ComposableSingletons$WalletScreenKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/link/ui/wallet/ComposableSingletons$WalletScreenKt$lambda-1$1;

    const v2, 0x784bcd24

    invoke-static {v2, v0, v1}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/ui/wallet/ComposableSingletons$WalletScreenKt;->lambda-1:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLambda-1$link_release()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "LZc5;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/link/ui/wallet/ComposableSingletons$WalletScreenKt;->lambda-1:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
