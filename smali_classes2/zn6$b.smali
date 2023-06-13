.class public final Lzn6$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzn6;->e(Lzendesk/support/CreateRequest;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/e;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/reactivex/e;",
        "emitter",
        "",
        "a",
        "(Lio/reactivex/e;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lzendesk/support/CreateRequest;


# direct methods
.method public constructor <init>(Lzendesk/support/CreateRequest;)V
    .locals 0

    iput-object p1, p0, Lzn6$b;->g:Lzendesk/support/CreateRequest;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/e;)V
    .locals 2

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzn6$b$a;

    invoke-direct {v0, p1}, Lzn6$b$a;-><init>(Lio/reactivex/e;)V

    sget-object p1, Lzendesk/support/Support;->INSTANCE:Lzendesk/support/Support;

    invoke-virtual {p1}, Lzendesk/support/Support;->provider()Lzendesk/support/ProviderStore;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p1}, Lzendesk/support/ProviderStore;->requestProvider()Lzendesk/support/RequestProvider;

    move-result-object p1

    iget-object v1, p0, Lzn6$b;->g:Lzendesk/support/CreateRequest;

    invoke-interface {p1, v1, v0}, Lzendesk/support/RequestProvider;->createRequest(Lzendesk/support/CreateRequest;LlI6;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/e;

    invoke-virtual {p0, p1}, Lzn6$b;->a(Lio/reactivex/e;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
