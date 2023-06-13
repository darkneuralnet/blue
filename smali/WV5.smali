.class public final synthetic LWV5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LYV5;

.field public final synthetic c:LMV5;

.field public final synthetic d:Ljava/util/Map$Entry;


# direct methods
.method public synthetic constructor <init>(LYV5;LMV5;Ljava/util/Map$Entry;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWV5;->b:LYV5;

    iput-object p2, p0, LWV5;->c:LMV5;

    iput-object p3, p0, LWV5;->d:Ljava/util/Map$Entry;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LWV5;->b:LYV5;

    iget-object v1, p0, LWV5;->c:LMV5;

    iget-object v2, p0, LWV5;->d:Ljava/util/Map$Entry;

    invoke-static {v0, v1, v2}, LYV5;->b(LYV5;LMV5;Ljava/util/Map$Entry;)V

    return-void
.end method
