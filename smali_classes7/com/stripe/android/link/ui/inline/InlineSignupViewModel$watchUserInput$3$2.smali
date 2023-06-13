.class final Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$3$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LGu1<",
        "Lcom/stripe/android/link/ui/inline/UserInput;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/inline/UserInput;",
        "it",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInlineSignupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineSignupViewModel.kt\ncom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$3$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,245:1\n230#2,5:246\n*S KotlinDebug\n*F\n+ 1 InlineSignupViewModel.kt\ncom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$3$2\n*L\n159#1:246,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$3$2;->this$0:Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/inline/UserInput;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$3$2;->this$0:Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    invoke-static {p2}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->access$get_viewState$p(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)LGX2;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1e

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->copy$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;ZZLcom/stripe/android/link/ui/signup/SignUpState;ILjava/lang/Object;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/link/ui/inline/UserInput;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$3$2;->emit(Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
