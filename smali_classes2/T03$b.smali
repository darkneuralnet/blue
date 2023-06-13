.class public final LT03$b;
.super Landroidx/appcompat/app/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT03;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroidx/appcompat/widget/Toolbar;Landroidx/drawerlayout/widget/DrawerLayout;Lcom/guness/widget/NavigationView;Lgl;LTq4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "T03$b",
        "Landroidx/appcompat/app/a;",
        "Landroid/view/View;",
        "drawerView",
        "",
        "slideOffset",
        "",
        "d",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNavigationDrawerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawerUi.kt\nco/bird/android/app/feature/operator/ui/NavigationDrawerUiImpl$toggle$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,326:1\n1#2:327\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic l:LT03;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Landroidx/appcompat/widget/Toolbar;LT03;Landroidx/drawerlayout/widget/DrawerLayout;II)V
    .locals 6

    iput-object p3, p0, LT03$b;->l:LT03;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p4

    move-object v3, p2

    move v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Landroidx/appcompat/app/a;-><init>(Landroid/app/Activity;Landroidx/drawerlayout/widget/DrawerLayout;Landroidx/appcompat/widget/Toolbar;II)V

    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;F)V
    .locals 1

    const-string v0, "drawerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/a;->d(Landroid/view/View;F)V

    iget-object p1, p0, LT03$b;->l:LT03;

    invoke-static {p1}, LT03;->access$getNavigationView$p(LT03;)Lcom/guness/widget/NavigationView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/guness/widget/NavigationView;->u()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, LVq6;->a(Landroid/view/View;)LVq6;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, LVq6;->c:LCt6;

    if-eqz p1, :cond_0

    iget-object p1, p1, LCt6;->b:Landroid/widget/RelativeLayout;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    :goto_1
    return-void
.end method
