.class public final synthetic LOj8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LOk8;


# direct methods
.method public synthetic constructor <init>(LOk8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOj8;->b:LOk8;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LOj8;->b:LOk8;

    new-instance v1, LVq9;

    iget-object v0, v0, LOk8;->k:LNl9;

    invoke-direct {v1, v0}, LVq9;-><init>(LNl9;)V

    return-object v1
.end method
