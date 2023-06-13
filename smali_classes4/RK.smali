.class public final synthetic LRK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/f;


# instance fields
.field public final synthetic b:LLK;

.field public final synthetic c:LLK$m0$b;


# direct methods
.method public synthetic constructor <init>(LLK;LLK$m0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRK;->b:LLK;

    iput-object p2, p0, LRK;->c:LLK$m0$b;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    iget-object v0, p0, LRK;->b:LLK;

    iget-object v1, p0, LRK;->c:LLK$m0$b;

    invoke-static {v0, v1}, LLK$m0;->a(LLK;LLK$m0$b;)V

    return-void
.end method
