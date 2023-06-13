.class final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer$startWatching$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer$startWatching$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "query",
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

.field final synthetic $onValidQuery:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;LZC0;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;",
            "LZC0;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer$startWatching$1$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer$startWatching$1$1;->$$this$launch:LZC0;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer$startWatching$1$1;->$onValidQuery:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer$startWatching$1$1;->emit(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer$startWatching$1$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer$startWatching$1$1;->$$this$launch:LZC0;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer$startWatching$1$1;->$onValidQuery:Lkotlin/jvm/functions/Function1;

    invoke-static {p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;->access$getSearchJob$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;)Lzh2;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/4 v4, 0x1

    invoke-static {v2, v3, v4, v3}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x3

    if-le v2, v4, :cond_1

    const/4 v2, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer$startWatching$1$1$emit$2$1;

    invoke-direct {v5, v1, p1, v3}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer$startWatching$1$1$emit$2$1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 p1, 0x3

    const/4 v6, 0x0

    move-object v1, v2

    move-object v2, v4

    move-object v3, v5

    move v4, p1

    move-object v5, v6

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;->access$setSearchJob$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;Lzh2;)V

    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
