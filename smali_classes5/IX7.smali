.class public final LIX7;
.super LlZ7;
.source "SourceFile"


# direct methods
.method public constructor <init>(LWY7;)V
    .locals 0

    iget-object p1, p1, LWY7;->b:LNZ7;

    invoke-direct {p0, p1}, LlZ7;-><init>(LNZ7;)V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LlZ7;->a()LzZ7;

    move-result-object v0

    iget-object v0, v0, LzZ7;->g:Ljava/lang/Object;

    return-object v0
.end method
