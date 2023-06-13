.class public LP80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LLw1$c;

.field public final b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(LLw1$c;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP80;->a:LLw1$c;

    iput-object p2, p0, LP80;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    iget-object v0, p0, LP80;->a:LLw1$c;

    iget-object v1, p0, LP80;->b:Landroid/os/Handler;

    new-instance v2, LP80$b;

    invoke-direct {v2, p0, v0, p1}, LP80$b;-><init>(LP80;LLw1$c;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b(LCw1$e;)V
    .locals 1

    invoke-virtual {p1}, LCw1$e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, LCw1$e;->a:Landroid/graphics/Typeface;

    invoke-virtual {p0, p1}, LP80;->c(Landroid/graphics/Typeface;)V

    goto :goto_0

    :cond_0
    iget p1, p1, LCw1$e;->b:I

    invoke-virtual {p0, p1}, LP80;->a(I)V

    :goto_0
    return-void
.end method

.method public final c(Landroid/graphics/Typeface;)V
    .locals 3

    iget-object v0, p0, LP80;->a:LLw1$c;

    iget-object v1, p0, LP80;->b:Landroid/os/Handler;

    new-instance v2, LP80$a;

    invoke-direct {v2, p0, v0, p1}, LP80$a;-><init>(LP80;LLw1$c;Landroid/graphics/Typeface;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
