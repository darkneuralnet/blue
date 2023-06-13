.class public final synthetic Lws8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# instance fields
.field public final synthetic a:Lzs8;

.field public final synthetic b:Lk69;

.field public final synthetic c:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(Lzs8;Lk69;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lws8;->a:Lzs8;

    iput-object p2, p0, Lws8;->b:Lk69;

    iput-object p3, p0, Lws8;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)LMb9;
    .locals 3

    iget-object v0, p0, Lws8;->a:Lzs8;

    iget-object v1, p0, Lws8;->b:Lk69;

    iget-object v2, p0, Lws8;->c:Ljava/util/concurrent/Executor;

    check-cast p1, Ljava/lang/Void;

    iget-object p1, v0, Lzs8;->a:LOs8;

    invoke-static {p1}, LOs8;->a(LOs8;)Lpu8;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v1, v2, v0}, Lpu8;->b(Lk69;Ljava/util/concurrent/Executor;Lcu8;)LMb9;

    move-result-object p1

    return-object p1
.end method
