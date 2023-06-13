.class public final synthetic Lqr1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/appbar/AppBarLayout$f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ltr1;

.field public final synthetic c:Lco/bird/android/core/mvp/BaseActivity;


# direct methods
.method public synthetic constructor <init>(ILtr1;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lqr1;->a:I

    iput-object p2, p0, Lqr1;->b:Ltr1;

    iput-object p3, p0, Lqr1;->c:Lco/bird/android/core/mvp/BaseActivity;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/material/appbar/AppBarLayout;I)V
    .locals 3

    iget v0, p0, Lqr1;->a:I

    iget-object v1, p0, Lqr1;->b:Ltr1;

    iget-object v2, p0, Lqr1;->c:Lco/bird/android/core/mvp/BaseActivity;

    invoke-static {v0, v1, v2, p1, p2}, Ltr1;->Pl(ILtr1;Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/material/appbar/AppBarLayout;I)V

    return-void
.end method
