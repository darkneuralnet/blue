.class public LqB6$c$a$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LqB6$c$a;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LqB6;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:LqB6$c$a;


# direct methods
.method public constructor <init>(LqB6$c$a;LqB6;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, LqB6$c$a$b;->c:LqB6$c$a;

    iput-object p2, p0, LqB6$c$a$b;->a:LqB6;

    iput-object p3, p0, LqB6$c$a$b;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, LqB6$c$a$b;->a:LqB6;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, LqB6;->d(F)V

    iget-object p1, p0, LqB6$c$a$b;->b:Landroid/view/View;

    iget-object v0, p0, LqB6$c$a$b;->a:LqB6;

    invoke-static {p1, v0}, LqB6$c;->g(Landroid/view/View;LqB6;)V

    return-void
.end method
