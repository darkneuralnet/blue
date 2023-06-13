.class public LNs6$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNs6;->i(Landroid/view/View;LPs6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LPs6;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:LNs6;


# direct methods
.method public constructor <init>(LNs6;LPs6;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, LNs6$a;->c:LNs6;

    iput-object p2, p0, LNs6$a;->a:LPs6;

    iput-object p3, p0, LNs6$a;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, LNs6$a;->a:LPs6;

    iget-object v0, p0, LNs6$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, LPs6;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, LNs6$a;->a:LPs6;

    iget-object v0, p0, LNs6$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, LPs6;->b(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, LNs6$a;->a:LPs6;

    iget-object v0, p0, LNs6$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, LPs6;->c(Landroid/view/View;)V

    return-void
.end method
