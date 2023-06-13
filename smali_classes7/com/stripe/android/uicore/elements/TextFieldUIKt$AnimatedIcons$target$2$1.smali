.class final Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LZC0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.uicore.elements.TextFieldUIKt$AnimatedIcons$target$2$1"
    f = "TextFieldUI.kt"
    i = {
        0x0
    }
    l = {
        0x11d
    }
    m = "invokeSuspend"
    n = {
        "it"
    }
    s = {
        "L$2"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTextFieldUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldUI.kt\ncom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,346:1\n1855#2,2:347\n*S KotlinDebug\n*F\n+ 1 TextFieldUI.kt\ncom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1\n*L\n284#1:347,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$this$produceState:Lk74;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk74<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $icons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;",
            ">;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lk74;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;",
            ">;",
            "Lk74<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->$icons:Ljava/util/List;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->$$this$produceState:Lk74;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->$icons:Ljava/util/List;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->$$this$produceState:Lk74;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;-><init>(Ljava/util/List;Lk74;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v4, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lk74;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, p0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, p0

    :cond_2
    iget-object v1, p1, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->$icons:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    iget-object v3, p1, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->$$this$produceState:Lk74;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v4, v3

    move-object v3, v1

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    iput-object v4, p1, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->L$0:Ljava/lang/Object;

    iput-object v3, p1, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->L$1:Ljava/lang/Object;

    iput-object v1, p1, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->L$2:Ljava/lang/Object;

    iput v2, p1, Lcom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1;->label:I

    const-wide/16 v5, 0x3e8

    invoke-static {v5, v6, p1}, LrZ0;->a(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    invoke-interface {v4, v1}, LEX2;->setValue(Ljava/lang/Object;)V

    goto :goto_0
.end method
