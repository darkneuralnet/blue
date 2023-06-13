.class public Le81$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le81;->F()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Le81;


# direct methods
.method public constructor <init>(Le81;)V
    .locals 0

    iput-object p1, p0, Le81$a;->a:Le81;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Le81$a;->a:Le81;

    invoke-virtual {p1}, LVc1;->r()V

    iget-object p1, p0, Le81$a;->a:Le81;

    invoke-static {p1}, Le81;->C(Le81;)Landroid/animation/ValueAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
