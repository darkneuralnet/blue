.class public final synthetic LAj8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LOk8;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LOk8;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAj8;->b:LOk8;

    iput-object p2, p0, LAj8;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LAj8;->b:LOk8;

    iget-object v1, p0, LAj8;->c:Ljava/lang/String;

    new-instance v2, Lxs9;

    new-instance v3, LZi8;

    invoke-direct {v3, v0, v1}, LZi8;-><init>(LOk8;Ljava/lang/String;)V

    const-string v0, "internal.appMetadata"

    invoke-direct {v2, v0, v3}, Lxs9;-><init>(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    return-object v2
.end method
