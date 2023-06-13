.class public final synthetic LLB7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LyP7;


# direct methods
.method public synthetic constructor <init>(LyP7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLB7;->b:LyP7;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LLB7;->b:LyP7;

    new-instance v1, LSN8;

    iget-object v0, v0, LyP7;->c:LOg7;

    invoke-direct {v1, v0}, LSN8;-><init>(LOg7;)V

    return-object v1
.end method
