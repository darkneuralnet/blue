.class public final synthetic Luh6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LJh6;

.field public final synthetic c:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(LJh6;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luh6;->b:LJh6;

    iput-object p2, p0, Luh6;->c:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Luh6;->b:LJh6;

    iget-object v1, p0, Luh6;->c:Landroid/net/Uri;

    invoke-static {v0, v1}, LJh6;->y(LJh6;Landroid/net/Uri;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
