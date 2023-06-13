.class public final synthetic LiE6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LjE6;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(LjE6;Ljava/util/List;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiE6;->b:LjE6;

    iput-object p2, p0, LiE6;->c:Ljava/util/List;

    iput-object p3, p0, LiE6;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LiE6;->b:LjE6;

    iget-object v1, p0, LiE6;->c:Ljava/util/List;

    iget-object v2, p0, LiE6;->d:Ljava/util/Map;

    invoke-static {v0, v1, v2}, LjE6;->b(LjE6;Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
