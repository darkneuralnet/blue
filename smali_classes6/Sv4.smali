.class public final synthetic LSv4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LUv4;


# direct methods
.method public synthetic constructor <init>(LUv4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSv4;->b:LUv4;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LSv4;->b:LUv4;

    invoke-virtual {v0}, LUv4;->f()LNn1;

    move-result-object v0

    return-object v0
.end method
