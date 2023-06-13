.class public LqB6$c$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LqB6$c$a;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:LqB6;

.field public final synthetic d:LqB6$a;

.field public final synthetic e:Landroid/animation/ValueAnimator;

.field public final synthetic f:LqB6$c$a;


# direct methods
.method public constructor <init>(LqB6$c$a;Landroid/view/View;LqB6;LqB6$a;Landroid/animation/ValueAnimator;)V
    .locals 0

    iput-object p1, p0, LqB6$c$a$c;->f:LqB6$c$a;

    iput-object p2, p0, LqB6$c$a$c;->b:Landroid/view/View;

    iput-object p3, p0, LqB6$c$a$c;->c:LqB6;

    iput-object p4, p0, LqB6$c$a$c;->d:LqB6$a;

    iput-object p5, p0, LqB6$c$a$c;->e:Landroid/animation/ValueAnimator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LqB6$c$a$c;->b:Landroid/view/View;

    iget-object v1, p0, LqB6$c$a$c;->c:LqB6;

    iget-object v2, p0, LqB6$c$a$c;->d:LqB6$a;

    invoke-static {v0, v1, v2}, LqB6$c;->j(Landroid/view/View;LqB6;LqB6$a;)V

    iget-object v0, p0, LqB6$c$a$c;->e:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
