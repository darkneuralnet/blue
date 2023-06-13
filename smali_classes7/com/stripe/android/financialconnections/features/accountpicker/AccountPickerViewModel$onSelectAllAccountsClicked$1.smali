.class final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSelectAllAccountsClicked$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->onSelectAllAccountsClicked()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
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
        "state",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
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
.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSelectAllAccountsClicked$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSelectAllAccountsClicked$1;->invoke(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)V
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->getPayload()Ldp;

    move-result-object v0

    invoke-virtual {v0}, Ldp;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSelectAllAccountsClicked$1;->this$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;->getAllAccountsSelected()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSelectAllAccountsClicked$1$1$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSelectAllAccountsClicked$1$1$1;

    invoke-static {v1, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$setState(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSelectAllAccountsClicked$1$1$2;

    invoke-direct {p1, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSelectAllAccountsClicked$1$1$2;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;)V

    invoke-static {v1, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->access$setState(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    :goto_0
    return-void
.end method
