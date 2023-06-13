.class public final synthetic LzM6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:LAM6;

.field public final c:Landroid/content/Intent;


# direct methods
.method public constructor <init>(LAM6;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzM6;->b:LAM6;

    iput-object p2, p0, LzM6;->c:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LzM6;->b:LAM6;

    iget-object v1, p0, LzM6;->c:Landroid/content/Intent;

    invoke-virtual {v0, v1}, LAM6;->h(Landroid/content/Intent;)V

    return-void
.end method
