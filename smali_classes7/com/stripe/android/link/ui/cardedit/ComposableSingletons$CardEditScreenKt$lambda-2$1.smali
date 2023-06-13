.class final Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt$lambda-2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt;
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


# static fields
.field public static final INSTANCE:Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt$lambda-2$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt$lambda-2$1;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt$lambda-2$1;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt$lambda-2$1;->INSTANCE:Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt$lambda-2$1;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt$lambda-2$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 15

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

    const-string v2, "com.stripe.android.link.ui.cardedit.ComposableSingletons$CardEditScreenKt.lambda-2.<anonymous> (CardEditScreen.kt:46)"

    const v3, -0xad5b731

    invoke-static {v3, v0, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    sget-object v9, Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt$lambda-2$1$1;->INSTANCE:Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt$lambda-2$1$1;

    sget-object v10, Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt$lambda-2$1$2;->INSTANCE:Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt$lambda-2$1$2;

    sget-object v11, Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt$lambda-2$1$3;->INSTANCE:Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt$lambda-2$1$3;

    sget-object v0, Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt;->INSTANCE:Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/cardedit/ComposableSingletons$CardEditScreenKt;->getLambda-1$link_release()Lkotlin/jvm/functions/Function3;

    move-result-object v12

    const v14, 0x6db6db6

    move-object/from16 v13, p1

    invoke-static/range {v4 .. v14}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;->CardEditBody(ZZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
