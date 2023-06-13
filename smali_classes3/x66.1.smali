.class public final synthetic Lx66;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Landroid/content/Intent;

.field public final synthetic c:Ly66;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;Ly66;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx66;->b:Landroid/content/Intent;

    iput-object p2, p0, Lx66;->c:Ly66;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lx66;->b:Landroid/content/Intent;

    iget-object v1, p0, Lx66;->c:Ly66;

    invoke-static {v0, v1}, Ly66;->b(Landroid/content/Intent;Ly66;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
