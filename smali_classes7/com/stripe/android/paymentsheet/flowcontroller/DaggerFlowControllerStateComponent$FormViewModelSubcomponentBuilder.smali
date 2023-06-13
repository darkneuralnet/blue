.class final Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FormViewModelSubcomponentBuilder"
.end annotation


# instance fields
.field private final flowControllerStateComponentImpl:Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FlowControllerStateComponentImpl;

.field private formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

.field private showCheckboxFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FlowControllerStateComponentImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;->flowControllerStateComponentImpl:Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FlowControllerStateComponentImpl;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FlowControllerStateComponentImpl;LRJ0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;-><init>(Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FlowControllerStateComponentImpl;)V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;->formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    const-class v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;->showCheckboxFlow:LEu1;

    const-class v1, LEu1;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentImpl;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;->flowControllerStateComponentImpl:Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FlowControllerStateComponentImpl;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;->formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;->showCheckboxFlow:LEu1;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentImpl;-><init>(Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FlowControllerStateComponentImpl;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;LEu1;LSJ0;)V

    return-object v0
.end method

.method public formArguments(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;)Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;->formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    return-object p0
.end method

.method public bridge synthetic formArguments(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;)Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;->formArguments(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;)Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;

    move-result-object p1

    return-object p1
.end method

.method public showCheckboxFlow(LEu1;)Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEu1;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;->showCheckboxFlow:LEu1;

    return-object p0
.end method

.method public bridge synthetic showCheckboxFlow(LEu1;)Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;->showCheckboxFlow(LEu1;)Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;

    move-result-object p1

    return-object p1
.end method
