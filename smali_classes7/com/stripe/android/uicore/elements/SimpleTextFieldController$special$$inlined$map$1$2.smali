.class public final Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TextFieldController.kt\ncom/stripe/android/uicore/elements/SimpleTextFieldController\n*L\n1#1,222:1\n48#2:223\n133#3:224\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $this_unsafeFlow:LGu1;

.field final synthetic this$0:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;


# direct methods
.method public constructor <init>(LGu1;Lcom/stripe/android/uicore/elements/SimpleTextFieldController;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2;->$this_unsafeFlow:LGu1;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2;->this$0:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2$1;

    iget v1, v0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2$1;-><init>(Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2;->$this_unsafeFlow:LGu1;

    check-cast p1, Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2;->this$0:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getTextFieldConfig()Lcom/stripe/android/uicore/elements/TextFieldConfig;

    move-result-object v2

    invoke-interface {v2, p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->convertToRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput v3, v0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1$2$1;->label:I

    invoke-interface {p2, p1, v0}, LGu1;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
