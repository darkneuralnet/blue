.class public final synthetic LZV5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LbW5;

.field public final synthetic c:Landroidx/camera/core/o;


# direct methods
.method public synthetic constructor <init>(LbW5;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZV5;->b:LbW5;

    iput-object p2, p0, LZV5;->c:Landroidx/camera/core/o;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LZV5;->b:LbW5;

    iget-object v1, p0, LZV5;->c:Landroidx/camera/core/o;

    invoke-static {v0, v1}, LbW5;->c(LbW5;Landroidx/camera/core/o;)V

    return-void
.end method
