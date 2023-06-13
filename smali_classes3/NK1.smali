.class public final synthetic LNK1;
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

    iput-object p1, p0, LNK1;->b:LRK1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LNK1;->b:LRK1;

    invoke-static {v0}, LRK1;->d(LRK1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
