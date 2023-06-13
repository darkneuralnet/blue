.class public LEj6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL80;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEj6;->g(Landroid/os/Handler;)LEj6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/os/Handler;

.field public final synthetic b:LEj6;


# direct methods
.method public constructor <init>(LEj6;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, LEj6$a;->b:LEj6;

    iput-object p2, p0, LEj6$a;->a:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 0

    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, LEj6$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void
.end method

.method public c(Ljava/lang/Runnable;J)V
    .locals 0

    return-void
.end method
