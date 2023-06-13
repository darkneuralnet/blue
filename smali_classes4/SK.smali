.class public final synthetic LSK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/f;


# instance fields
.field public final synthetic b:LLK;

.field public final synthetic c:LLK$n0$b;


# direct methods
.method public synthetic constructor <init>(LLK;LLK$n0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSK;->b:LLK;

    iput-object p2, p0, LSK;->c:LLK$n0$b;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    iget-object v0, p0, LSK;->b:LLK;

    iget-object v1, p0, LSK;->c:LLK$n0$b;

    invoke-static {v0, v1}, LLK$n0;->a(LLK;LLK$n0$b;)V

    return-void
.end method
