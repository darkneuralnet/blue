.class public LHr2$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHr2;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LHr2;


# direct methods
.method public constructor <init>(LHr2;)V
    .locals 0

    iput-object p1, p0, LHr2$a;->a:LHr2;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    iget-object p1, p0, LHr2$a;->a:LHr2;

    invoke-static {p1}, LHr2;->i(LHr2;)I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, LHr2$a;->a:LHr2;

    invoke-static {v2}, LHr2;->k(LHr2;)LyC;

    move-result-object v2

    iget-object v2, v2, LyC;->c:[I

    array-length v2, v2

    rem-int/2addr v0, v2

    invoke-static {p1, v0}, LHr2;->j(LHr2;I)I

    iget-object p1, p0, LHr2$a;->a:LHr2;

    invoke-static {p1, v1}, LHr2;->l(LHr2;Z)Z

    return-void
.end method
