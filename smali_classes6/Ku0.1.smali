.class public final synthetic LKu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LMu0;

.field public final synthetic c:Lcom/google/firebase/remoteconfig/internal/b;


# direct methods
.method public synthetic constructor <init>(LMu0;Lcom/google/firebase/remoteconfig/internal/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKu0;->b:LMu0;

    iput-object p2, p0, LKu0;->c:Lcom/google/firebase/remoteconfig/internal/b;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LKu0;->b:LMu0;

    iget-object v1, p0, LKu0;->c:Lcom/google/firebase/remoteconfig/internal/b;

    invoke-static {v0, v1}, LMu0;->a(LMu0;Lcom/google/firebase/remoteconfig/internal/b;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
