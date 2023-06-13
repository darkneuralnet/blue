.class final Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$1$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;->SuccessLoaded(LXp5;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $disconnectUrl:Ljava/lang/String;

.field final synthetic $onDisconnectLinkClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $uriHandler:LDf6;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;LDf6;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LDf6;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$1$1$2;->$onDisconnectLinkClick:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$1$1$2;->$uriHandler:LDf6;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$1$1$2;->$disconnectUrl:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$1$1$2;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$1$1$2;->$onDisconnectLinkClick:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$1$1$2;->$uriHandler:LDf6;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessLoaded$1$1$2;->$disconnectUrl:Ljava/lang/String;

    invoke-interface {p1, v0}, LDf6;->openUri(Ljava/lang/String;)V

    return-void
.end method
