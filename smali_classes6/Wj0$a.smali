.class public LWj0$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWj0;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LWj0;


# direct methods
.method public constructor <init>(LWj0;)V
    .locals 0

    iput-object p1, p0, LWj0$a;->a:LWj0;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, LWj0$a;->a:LWj0;

    iget-object p1, p1, LVc1;->b:Lcom/google/android/material/textfield/a;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/a;->e0(Z)V

    return-void
.end method
