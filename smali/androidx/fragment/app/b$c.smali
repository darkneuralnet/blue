.class public Landroidx/fragment/app/b$c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/b;->w(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Z

.field public final synthetic d:Landroidx/fragment/app/o$e;

.field public final synthetic e:Landroidx/fragment/app/b$k;

.field public final synthetic f:Landroidx/fragment/app/b;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/b;Landroid/view/ViewGroup;Landroid/view/View;ZLandroidx/fragment/app/o$e;Landroidx/fragment/app/b$k;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/b$c;->f:Landroidx/fragment/app/b;

    iput-object p2, p0, Landroidx/fragment/app/b$c;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Landroidx/fragment/app/b$c;->b:Landroid/view/View;

    iput-boolean p4, p0, Landroidx/fragment/app/b$c;->c:Z

    iput-object p5, p0, Landroidx/fragment/app/b$c;->d:Landroidx/fragment/app/o$e;

    iput-object p6, p0, Landroidx/fragment/app/b$c;->e:Landroidx/fragment/app/b$k;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Landroidx/fragment/app/b$c;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Landroidx/fragment/app/b$c;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-boolean p1, p0, Landroidx/fragment/app/b$c;->c:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/b$c;->d:Landroidx/fragment/app/o$e;

    invoke-virtual {p1}, Landroidx/fragment/app/o$e;->e()Landroidx/fragment/app/o$e$c;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/b$c;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/o$e$c;->a(Landroid/view/View;)V

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/b$c;->e:Landroidx/fragment/app/b$k;

    invoke-virtual {p1}, Landroidx/fragment/app/b$l;->a()V

    const/4 p1, 0x2

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Animator from operation "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/b$c;->d:Landroidx/fragment/app/o$e;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has ended."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method
