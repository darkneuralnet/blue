.class final Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt$lambda-8$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LPD3;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LPD3;",
        "it",
        "",
        "invoke",
        "(LPD3;LEt0;I)V",
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
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt$lambda-8$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt$lambda-8$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt$lambda-8$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt$lambda-8$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt$lambda-8$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPD3;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt$lambda-8$1;->invoke(LPD3;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPD3;LEt0;I)V
    .locals 21

    move/from16 v0, p3

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v0, 0x51

    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt.lambda-8.<anonymous> (ErrorContent.kt:404)"

    const v3, -0x14b6a604

    invoke-static {v3, v0, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const/4 v5, 0x0

    const-string v6, "3"

    const/4 v7, 0x0

    const-string v8, "Random Institution"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v12, "Random Institution url"

    move-object v4, v0

    invoke-direct/range {v4 .. v12}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/core/exception/APIException;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1f

    const/16 v20, 0x0

    move-object v13, v1

    invoke-direct/range {v13 .. v20}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/stripe/android/financialconnections/exception/AccountLoadError;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v3, v0, v1}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;-><init>(ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/core/exception/StripeException;)V

    sget-object v3, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt$lambda-8$1$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt$lambda-8$1$1;

    sget-object v4, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt$lambda-8$1$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt$lambda-8$1$2;

    sget-object v5, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt$lambda-8$1$3;->INSTANCE:Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt$lambda-8$1$3;

    const/16 v7, 0xdb0

    move-object/from16 v6, p2

    invoke-static/range {v2 .. v7}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->NoAccountsAvailableErrorContent(Lcom/stripe/android/financialconnections/exception/AccountLoadError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method