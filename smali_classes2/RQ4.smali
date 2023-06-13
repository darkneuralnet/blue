.class public final synthetic LRQ4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LZQ4;

.field public final synthetic c:Landroid/graphics/Bitmap;


# direct methods
.method public synthetic constructor <init>(LZQ4;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRQ4;->b:LZQ4;

    iput-object p2, p0, LRQ4;->c:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LRQ4;->b:LZQ4;

    iget-object v1, p0, LRQ4;->c:Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, LZQ4;->p(LZQ4;Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
