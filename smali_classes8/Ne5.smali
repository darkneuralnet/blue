.class public final synthetic LNe5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/z;


# instance fields
.field public final synthetic b:Lkotlin/coroutines/CoroutineContext;

.field public final synthetic c:LEu1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/coroutines/CoroutineContext;LEu1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNe5;->b:Lkotlin/coroutines/CoroutineContext;

    iput-object p2, p0, LNe5;->c:LEu1;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/y;)V
    .locals 2

    iget-object v0, p0, LNe5;->b:Lkotlin/coroutines/CoroutineContext;

    iget-object v1, p0, LNe5;->c:LEu1;

    invoke-static {v0, v1, p1}, LOe5;->a(Lkotlin/coroutines/CoroutineContext;LEu1;Lio/reactivex/y;)V

    return-void
.end method
