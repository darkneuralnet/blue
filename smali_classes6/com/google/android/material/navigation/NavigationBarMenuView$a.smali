.class public Lcom/google/android/material/navigation/NavigationBarMenuView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/navigation/NavigationBarMenuView;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/google/android/material/navigation/NavigationBarMenuView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/navigation/NavigationBarMenuView;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView$a;->b:Lcom/google/android/material/navigation/NavigationBarMenuView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    check-cast p1, Lcom/google/android/material/navigation/NavigationBarItemView;

    invoke-virtual {p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->e()Landroidx/appcompat/view/menu/g;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView$a;->b:Lcom/google/android/material/navigation/NavigationBarMenuView;

    invoke-static {v0}, Lcom/google/android/material/navigation/NavigationBarMenuView;->c(Lcom/google/android/material/navigation/NavigationBarMenuView;)Landroidx/appcompat/view/menu/e;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView$a;->b:Lcom/google/android/material/navigation/NavigationBarMenuView;

    invoke-static {v1}, Lcom/google/android/material/navigation/NavigationBarMenuView;->b(Lcom/google/android/material/navigation/NavigationBarMenuView;)Lcom/google/android/material/navigation/NavigationBarPresenter;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroidx/appcompat/view/menu/e;->O(Landroid/view/MenuItem;Landroidx/appcompat/view/menu/i;I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    :cond_0
    return-void
.end method
