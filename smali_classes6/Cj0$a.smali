.class public LCj0$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCj0;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LCj0;


# direct methods
.method public constructor <init>(LCj0;)V
    .locals 0

    iput-object p1, p0, LCj0$a;->a:LCj0;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    iget-object p1, p0, LCj0$a;->a:LCj0;

    invoke-static {p1}, LCj0;->i(LCj0;)I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    iget-object v1, p0, LCj0$a;->a:LCj0;

    invoke-static {v1}, LCj0;->k(LCj0;)LyC;

    move-result-object v1

    iget-object v1, v1, LyC;->c:[I

    array-length v1, v1

    rem-int/2addr v0, v1

    invoke-static {p1, v0}, LCj0;->j(LCj0;I)I

    return-void
.end method
