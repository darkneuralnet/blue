.class public final synthetic Lhg5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/io/File;

.field public final synthetic c:Lokhttp3/MediaType;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;Lokhttp3/MediaType;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhg5;->b:Ljava/io/File;

    iput-object p2, p0, Lhg5;->c:Lokhttp3/MediaType;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhg5;->b:Ljava/io/File;

    iget-object v1, p0, Lhg5;->c:Lokhttp3/MediaType;

    invoke-static {v0, v1}, Ljg5;->c(Ljava/io/File;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    move-result-object v0

    return-object v0
.end method
