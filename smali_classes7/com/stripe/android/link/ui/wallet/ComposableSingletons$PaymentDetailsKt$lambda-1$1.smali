.class final Lcom/stripe/android/link/ui/wallet/ComposableSingletons$PaymentDetailsKt$lambda-1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/wallet/ComposableSingletons$PaymentDetailsKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "invoke",
        "(LEt0;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentDetails.kt\ncom/stripe/android/link/ui/wallet/ComposableSingletons$PaymentDetailsKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,251:1\n154#2:252\n*S KotlinDebug\n*F\n+ 1 PaymentDetails.kt\ncom/stripe/android/link/ui/wallet/ComposableSingletons$PaymentDetailsKt$lambda-1$1\n*L\n142#1:252\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/link/ui/wallet/ComposableSingletons$PaymentDetailsKt$lambda-1$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/wallet/ComposableSingletons$PaymentDetailsKt$lambda-1$1;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/wallet/ComposableSingletons$PaymentDetailsKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/wallet/ComposableSingletons$PaymentDetailsKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/link/ui/wallet/ComposableSingletons$PaymentDetailsKt$lambda-1$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/ComposableSingletons$PaymentDetailsKt$lambda-1$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 8

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.link.ui.wallet.ComposableSingletons$PaymentDetailsKt.lambda-1.<anonymous> (PaymentDetails.kt:136)"

    const v2, -0x49f904bb

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, LEP1$a;->a:LEP1$a;

    invoke-static {p2}, LLV2;->a(LEP1$a;)LtY1;

    move-result-object v0

    sget p2, Lcom/stripe/android/link/R$string;->edit:I

    const/4 v1, 0x0

    invoke-static {p2, p1, v1}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v1

    sget-object p2, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-static {p2, p1, v2}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/link/theme/LinkColors;->getActionLabelLight-0d7_KjU()J

    move-result-wide v3

    sget-object p2, LgV2;->b0:LgV2$a;

    const/16 v2, 0x18

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {p2, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v2

    const/16 v6, 0x180

    const/4 v7, 0x0

    move-object v5, p1

    invoke-static/range {v0 .. v7}, LDP1;->a(LtY1;Ljava/lang/String;LgV2;JLEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
