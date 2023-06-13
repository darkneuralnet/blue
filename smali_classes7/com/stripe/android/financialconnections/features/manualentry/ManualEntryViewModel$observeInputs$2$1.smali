.class final Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $input:Ljava/lang/String;

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2$1;->$input:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2$1;->invoke(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->getAccount()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2$1;->$input:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator;->getAccountConfirmIdOrNull(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    new-instance v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2$1$1;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$observeInputs$2$1$1;-><init>(Ljava/lang/Integer;)V

    invoke-static {v0, v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->access$setState(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
