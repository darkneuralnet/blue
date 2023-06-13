.class public final synthetic LxK1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LRK1;


# direct methods
.method public synthetic constructor <init>(LRK1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxK1;->b:LRK1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LxK1;->b:LRK1;

    invoke-static {v0}, LRK1;->x(LRK1;)Lio/reactivex/B;

    move-result-object v0

    return-object v0
.end method
