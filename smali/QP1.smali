.class public final synthetic LQP1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LSP1;


# direct methods
.method public synthetic constructor <init>(LSP1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQP1;->b:LSP1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQP1;->b:LSP1;

    invoke-static {v0}, LSP1;->b(LSP1;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
