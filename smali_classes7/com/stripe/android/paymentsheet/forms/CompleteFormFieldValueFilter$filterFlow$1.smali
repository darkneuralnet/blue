.class final Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;->filterFlow()LEu1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function5<",
        "Ljava/util/Map<",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "+",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        ">;",
        "Ljava/util/Set<",
        "+",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        ">;",
        "Ljava/lang/Boolean;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u008a@"
    }
    d2 = {
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "idFieldSnapshotMap",
        "",
        "hiddenIdentifiers",
        "",
        "showingMandate",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;",
        "userRequestedReuse",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.paymentsheet.forms.CompleteFormFieldValueFilter$filterFlow$1"
    f = "CompleteFormFieldValueFilter.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic L$2:Ljava/lang/Object;

.field synthetic Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;->this$0:Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;

    const/4 p1, 0x5

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v1, p1

    check-cast v1, Ljava/util/Map;

    move-object v2, p2

    check-cast v2, Ljava/util/Set;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move-object v4, p4

    check-cast v4, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    move-object v5, p5

    check-cast v5, Lkotlin/coroutines/Continuation;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;->invoke(Ljava/util/Map;Ljava/util/Set;ZLcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/util/Map;Ljava/util/Set;ZLcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;Z",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;->this$0:Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;

    invoke-direct {v0, v1, p5}, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;-><init>(Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;->L$1:Ljava/lang/Object;

    iput-boolean p3, v0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;->Z$0:Z

    iput-object p4, v0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;->L$2:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;->Z$0:Z

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter$filterFlow$1;->this$0:Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;

    invoke-static {v3, p1, v0, v1, v2}, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;->access$filterFlow(Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;Ljava/util/Map;Ljava/util/Set;ZLcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
