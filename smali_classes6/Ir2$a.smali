.class public LIr2$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIr2;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LIr2;


# direct methods
.method public constructor <init>(LIr2;)V
    .locals 0

    iput-object p1, p0, LIr2$a;->a:LIr2;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    iget-object p1, p0, LIr2$a;->a:LIr2;

    invoke-static {p1}, LIr2;->i(LIr2;)I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, LIr2$a;->a:LIr2;

    invoke-static {v2}, LIr2;->k(LIr2;)LyC;

    move-result-object v2

    iget-object v2, v2, LyC;->c:[I

    array-length v2, v2

    rem-int/2addr v0, v2

    invoke-static {p1, v0}, LIr2;->j(LIr2;I)I

    iget-object p1, p0, LIr2$a;->a:LIr2;

    invoke-static {p1, v1}, LIr2;->l(LIr2;Z)Z

    return-void
.end method
