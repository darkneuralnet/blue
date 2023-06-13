.class public LLe3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLe3;->E0(LH80;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LH80;

.field public final synthetic b:LLe3;


# direct methods
.method public constructor <init>(LLe3;LH80;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LLe3$a;->b:LLe3;

    iput-object p2, p0, LLe3$a;->a:LH80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LLe3$a;->a:LH80;

    iget-object v1, p0, LLe3$a;->b:LLe3;

    invoke-interface {v0, v1, p1}, LH80;->a(Lx80;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, LKi6;->s(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 0

    invoke-virtual {p0, p2}, LLe3$a;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 1

    :try_start_0
    iget-object p1, p0, LLe3$a;->b:LLe3;

    invoke-virtual {p1, p2}, LLe3;->g(Lokhttp3/Response;)LHM4;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object p2, p0, LLe3$a;->a:LH80;

    iget-object v0, p0, LLe3$a;->b:LLe3;

    invoke-interface {p2, v0, p1}, LH80;->b(Lx80;LHM4;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, LKi6;->s(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void

    :catchall_1
    move-exception p1

    invoke-static {p1}, LKi6;->s(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, LLe3$a;->a(Ljava/lang/Throwable;)V

    return-void
.end method
