.class public final LRl0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsr6$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRl0;->n(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:LMk1;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(LMk1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LRl0$b;->a:LMk1;

    iput-object p2, p0, LRl0$b;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, LRl0$b;->a:LMk1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LMk1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {}, Lcom/facebook/a;->n()Z

    move-result v3

    if-nez v3, :cond_1

    move v1, v2

    :cond_1
    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    invoke-static {}, LRl0;->a()LRl0$d;

    move-result-object v0

    iget-object v1, p0, LRl0$b;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, LRl0$d;->a(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
