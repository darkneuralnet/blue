.class final Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LGu1<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"
    }
    d2 = {
        "",
        "email",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $$this$launch:LZC0;

.field final synthetic $onStateChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onValidEmailEntered:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;Lkotlin/jvm/functions/Function1;LZC0;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            "Lkotlin/Unit;",
            ">;",
            "LZC0;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;

    iput-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;->$onStateChanged:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;->$$this$launch:LZC0;

    iput-object p4, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;->$onValidEmailEntered:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;->emit(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final emit(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;

    invoke-static {p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;->access$getInitialEmail$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;

    invoke-static {p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;->access$getLookupJob$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;)Lzh2;

    move-result-object p2

    if-nez p2, :cond_1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;->$onStateChanged:Lkotlin/jvm/functions/Function1;

    sget-object p2, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingPhoneOrName:Lcom/stripe/android/link/ui/signup/SignUpState;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_1
    iget-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;

    invoke-static {p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;->access$getLookupJob$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;)Lzh2;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    const/4 v1, 0x1

    invoke-static {p2, v0, v1, v0}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_2
    if-eqz p1, :cond_3

    iget-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;

    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;->$$this$launch:LZC0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1$emit$2;

    iget-object v5, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;->$onStateChanged:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;->$onValidEmailEntered:Lkotlin/jvm/functions/Function1;

    invoke-direct {v4, v5, v6, p1, v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1$emit$2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;->access$setLookupJob$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;Lzh2;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer$startWatching$1$1;->$onStateChanged:Lkotlin/jvm/functions/Function1;

    sget-object p2, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingEmail:Lcom/stripe/android/link/ui/signup/SignUpState;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
