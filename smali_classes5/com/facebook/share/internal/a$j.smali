.class public Lcom/facebook/share/internal/a$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/share/internal/a$w;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/share/internal/a;->d0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/facebook/share/internal/a;


# direct methods
.method public constructor <init>(Lcom/facebook/share/internal/a;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/internal/a$j;->a:Lcom/facebook/share/internal/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 5

    sget-object v0, Lcom/facebook/share/internal/a$c;->a:[I

    iget-object v1, p0, Lcom/facebook/share/internal/a$j;->a:Lcom/facebook/share/internal/a;

    invoke-static {v1}, Lcom/facebook/share/internal/a;->j(Lcom/facebook/share/internal/a;)Lcom/facebook/share/widget/LikeView$g;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Lcom/facebook/share/internal/a$p;

    iget-object v1, p0, Lcom/facebook/share/internal/a$j;->a:Lcom/facebook/share/internal/a;

    invoke-static {v1}, Lcom/facebook/share/internal/a;->h(Lcom/facebook/share/internal/a;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/share/internal/a$j;->a:Lcom/facebook/share/internal/a;

    invoke-static {v3}, Lcom/facebook/share/internal/a;->j(Lcom/facebook/share/internal/a;)Lcom/facebook/share/widget/LikeView$g;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/share/internal/a$p;-><init>(Lcom/facebook/share/internal/a;Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/facebook/share/internal/a$r;

    iget-object v1, p0, Lcom/facebook/share/internal/a$j;->a:Lcom/facebook/share/internal/a;

    invoke-static {v1}, Lcom/facebook/share/internal/a;->h(Lcom/facebook/share/internal/a;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/share/internal/a$r;-><init>(Lcom/facebook/share/internal/a;Ljava/lang/String;)V

    :goto_0
    new-instance v1, Lcom/facebook/share/internal/a$n;

    iget-object v2, p0, Lcom/facebook/share/internal/a$j;->a:Lcom/facebook/share/internal/a;

    invoke-static {v2}, Lcom/facebook/share/internal/a;->h(Lcom/facebook/share/internal/a;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/share/internal/a$j;->a:Lcom/facebook/share/internal/a;

    invoke-static {v4}, Lcom/facebook/share/internal/a;->j(Lcom/facebook/share/internal/a;)Lcom/facebook/share/widget/LikeView$g;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/share/internal/a$n;-><init>(Lcom/facebook/share/internal/a;Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V

    new-instance v2, LVD1;

    invoke-direct {v2}, LVD1;-><init>()V

    invoke-interface {v0, v2}, Lcom/facebook/share/internal/a$x;->c(LVD1;)V

    invoke-virtual {v1, v2}, Lcom/facebook/share/internal/a$k;->c(LVD1;)V

    new-instance v3, Lcom/facebook/share/internal/a$j$a;

    invoke-direct {v3, p0, v0, v1}, Lcom/facebook/share/internal/a$j$a;-><init>(Lcom/facebook/share/internal/a$j;Lcom/facebook/share/internal/a$s;Lcom/facebook/share/internal/a$n;)V

    invoke-virtual {v2, v3}, LVD1;->c(LVD1$a;)V

    invoke-virtual {v2}, LVD1;->j()LUD1;

    return-void
.end method
