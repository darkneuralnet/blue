.class final Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt;
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
        "SMAP\nVerificationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,312:1\n25#2:313\n1057#3,6:314\n*S KotlinDebug\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1\n*L\n70#1:313\n70#1:314,6\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 16

    move-object/from16 v13, p1

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0xb

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.verification.ComposableSingletons$VerificationScreenKt.lambda-1.<anonymous> (VerificationScreen.kt:58)"

    const v3, -0x77e7d8f0

    invoke-static {v3, v0, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget v0, Lcom/stripe/android/link/R$string;->verification_header:I

    sget v1, Lcom/stripe/android/link/R$string;->verification_message:I

    const/4 v2, 0x1

    const-string v3, "+1********23"

    const-string v4, "test@stripe.com"

    sget-object v5, Lcom/stripe/android/ui/core/elements/OTPSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/OTPSpec;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/OTPSpec;->transform()Lcom/stripe/android/uicore/elements/OTPElement;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v9, -0x1d58f75c

    invoke-interface {v13, v9}, LEt0;->F(I)V

    invoke-interface/range {p1 .. p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, LEt0;->a:LEt0$a;

    invoke-virtual {v10}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_3

    new-instance v9, Landroidx/compose/ui/focus/h;

    invoke-direct {v9}, Landroidx/compose/ui/focus/h;-><init>()V

    invoke-interface {v13, v9}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    check-cast v9, Landroidx/compose/ui/focus/h;

    sget-object v10, Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1$2;->INSTANCE:Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1$2;

    sget-object v11, Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1$3;->INSTANCE:Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1$3;

    sget-object v12, Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1$4;->INSTANCE:Lcom/stripe/android/link/ui/verification/ComposableSingletons$VerificationScreenKt$lambda-1$1$4;

    sget v14, Lcom/stripe/android/uicore/elements/OTPElement;->$stable:I

    shl-int/lit8 v14, v14, 0xf

    const v15, 0x6d86d80

    or-int/2addr v14, v15

    sget v15, Landroidx/compose/ui/focus/h;->c:I

    shl-int/lit8 v15, v15, 0x1b

    or-int/2addr v14, v15

    const/16 v15, 0x1b6

    move-object/from16 v13, p1

    invoke-static/range {v0 .. v15}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBody(IIZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ZZLcom/stripe/android/link/ui/ErrorMessage;Landroidx/compose/ui/focus/h;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    :goto_1
    return-void
.end method
