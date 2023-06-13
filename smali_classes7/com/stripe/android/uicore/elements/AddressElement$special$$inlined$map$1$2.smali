.class public final Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LGu1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "R",
        "value",
        "",
        "emit",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n48#2:223\n67#3,4:224\n72#3,4:230\n71#3,8:234\n2634#4:228\n1#5:229\n*S KotlinDebug\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement\n*L\n70#1:228\n70#1:229\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $this_unsafeFlow:LGu1;

.field final synthetic this$0:Lcom/stripe/android/uicore/elements/AddressElement;


# direct methods
.method public constructor <init>(LGu1;Lcom/stripe/android/uicore/elements/AddressElement;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2;->$this_unsafeFlow:LGu1;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;

    iget v1, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;-><init>(Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$5:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    iget-object v2, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$4:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v5, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v6, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    check-cast v7, LGu1;

    iget-object v8, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-object p1, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    check-cast v2, LGu1;

    iget-object v5, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2;->$this_unsafeFlow:LGu1;

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {p2}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getPhoneNumberElement$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/PhoneNumberElement;->getController()Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryDropdownController()Lcom/stripe/android/uicore/elements/DropdownFieldController;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->onRawValueChange(Ljava/lang/String;)V

    :cond_5
    iget-object p2, p0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {p2}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getAddressRepository$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/address/AddressRepository;

    move-result-object p2

    iput-object p0, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->label:I

    invoke-virtual {p2, p1, v0}, Lcom/stripe/android/uicore/address/AddressRepository;->get(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v5, p0

    :goto_1
    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_7

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_7
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v7, v2

    move-object v8, v5

    move-object v2, v6

    move-object v6, p1

    move-object v5, p2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    iget-object p2, v8, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {p2}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getAddressType$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/AddressType;

    move-result-object p2

    iget-object v9, v8, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {v9}, Lcom/stripe/android/uicore/elements/AddressElement;->access$isPlacesAvailable$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/IsPlacesAvailable;

    move-result-object v9

    iput-object v8, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$4:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$5:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->label:I

    invoke-static {p1, v6, p2, v9, v0}, Lcom/stripe/android/uicore/elements/AddressElementKt;->updateLine1WithAutocompleteAffordance(Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/String;Lcom/stripe/android/uicore/elements/AddressType;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    return-object v1

    :cond_8
    :goto_3
    iget-object p2, v8, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {p2}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getRawValuesMap$p(Lcom/stripe/android/uicore/elements/AddressElement;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->setRawValue(Ljava/util/Map;)V

    goto :goto_2

    :cond_9
    const/4 p1, 0x0

    iput-object p1, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$4:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->L$5:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1$2$1;->label:I

    invoke-interface {v7, v5, v0}, LGu1;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    return-object v1

    :cond_a
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
