.class public LVt6$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVt6$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVt6;->d(Landroid/view/View;Landroid/util/AttributeSet;IILVt6$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:LVt6$e;


# direct methods
.method public constructor <init>(ZZZLVt6$e;)V
    .locals 0

    iput-boolean p1, p0, LVt6$b;->a:Z

    iput-boolean p2, p0, LVt6$b;->b:Z

    iput-boolean p3, p0, LVt6$b;->c:Z

    iput-object p4, p0, LVt6$b;->d:LVt6$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;LDB6;LVt6$f;)LDB6;
    .locals 3

    iget-boolean v0, p0, LVt6$b;->a:Z

    if-eqz v0, :cond_0

    iget v0, p3, LVt6$f;->d:I

    invoke-virtual {p2}, LDB6;->j()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p3, LVt6$f;->d:I

    :cond_0
    invoke-static {p1}, LVt6;->n(Landroid/view/View;)Z

    move-result v0

    iget-boolean v1, p0, LVt6$b;->b:Z

    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    iget v1, p3, LVt6$f;->c:I

    invoke-virtual {p2}, LDB6;->k()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, p3, LVt6$f;->c:I

    goto :goto_0

    :cond_1
    iget v1, p3, LVt6$f;->a:I

    invoke-virtual {p2}, LDB6;->k()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, p3, LVt6$f;->a:I

    :cond_2
    :goto_0
    iget-boolean v1, p0, LVt6$b;->c:Z

    if-eqz v1, :cond_4

    if-eqz v0, :cond_3

    iget v0, p3, LVt6$f;->a:I

    invoke-virtual {p2}, LDB6;->l()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p3, LVt6$f;->a:I

    goto :goto_1

    :cond_3
    iget v0, p3, LVt6$f;->c:I

    invoke-virtual {p2}, LDB6;->l()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p3, LVt6$f;->c:I

    :cond_4
    :goto_1
    invoke-virtual {p3, p1}, LVt6$f;->a(Landroid/view/View;)V

    iget-object v0, p0, LVt6$b;->d:LVt6$e;

    if-eqz v0, :cond_5

    invoke-interface {v0, p1, p2, p3}, LVt6$e;->a(Landroid/view/View;LDB6;LVt6$f;)LDB6;

    move-result-object p2

    :cond_5
    return-object p2
.end method
