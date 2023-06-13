.class public final synthetic LTX1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/j;

.field public final synthetic c:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/j;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTX1;->b:Landroidx/camera/core/j;

    iput-object p2, p0, LTX1;->c:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LTX1;->b:Landroidx/camera/core/j;

    iget-object v1, p0, LTX1;->c:Landroid/net/Uri;

    invoke-static {v0, v1}, Landroidx/camera/core/j;->a(Landroidx/camera/core/j;Landroid/net/Uri;)V

    return-void
.end method
