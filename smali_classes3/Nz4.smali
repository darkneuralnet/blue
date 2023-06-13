.class public final synthetic LNz4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:LOz4;

.field public final synthetic d:Ljava/util/Collection;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;LOz4;Ljava/util/Collection;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNz4;->b:Ljava/util/List;

    iput-object p2, p0, LNz4;->c:LOz4;

    iput-object p3, p0, LNz4;->d:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LNz4;->b:Ljava/util/List;

    iget-object v1, p0, LNz4;->c:LOz4;

    iget-object v2, p0, LNz4;->d:Ljava/util/Collection;

    invoke-static {v0, v1, v2}, LOz4;->b(Ljava/util/List;LOz4;Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
