.class public final synthetic LqM4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BiFunction;


# instance fields
.field public final synthetic a:LrM4;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/util/concurrent/CompletableFuture;


# direct methods
.method public synthetic constructor <init>(LrM4;Ljava/lang/Object;Ljava/util/concurrent/CompletableFuture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LqM4;->a:LrM4;

    iput-object p2, p0, LqM4;->b:Ljava/lang/Object;

    iput-object p3, p0, LqM4;->c:Ljava/util/concurrent/CompletableFuture;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LqM4;->a:LrM4;

    iget-object v1, p0, LqM4;->b:Ljava/lang/Object;

    iget-object v2, p0, LqM4;->c:Ljava/util/concurrent/CompletableFuture;

    check-cast p2, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, p1, p2}, LrM4;->b(LrM4;Ljava/lang/Object;Ljava/util/concurrent/CompletableFuture;Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
