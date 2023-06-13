.class public final LWt6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\u0016\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\t2\u0006\u0010\r\u001a\u00020\u000c\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000c\u001a\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0016\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u0014\u001a\u000e\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u000e\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u000e\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u000e\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0000\"\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Landroid/view/View;",
        "",
        "j",
        "l",
        "Landroid/content/Context;",
        "context",
        "",
        "valueInDp",
        "a",
        "Landroid/app/Activity;",
        "",
        "i",
        "",
        "requestedOrientation",
        "k",
        "view",
        "height",
        "m",
        "g",
        "currentScreenOrientation",
        "LCy3;",
        "preferredOrientation",
        "f",
        "LDB6;",
        "windowInsets",
        "c",
        "d",
        "e",
        "b",
        "h",
        "",
        "Ljava/lang/String;",
        "TAG",
        "android-sdk-ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/JvmName;
    name = "ViewUtils"
.end annotation


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lk20;->a:Lk20;

    const-string v1, "ViewUtils"

    invoke-virtual {v0, v1}, Lk20;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LWt6;->a:Ljava/lang/String;

    return-void
.end method

.method public static final a(Landroid/content/Context;D)D
    .locals 2

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    float-to-double v0, p0

    mul-double/2addr p1, v0

    return-wide p1
.end method

.method public static final b(LDB6;)I
    .locals 2

    const-string v0, "windowInsets"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LDB6;->e()Lf51;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lf51;->a()I

    move-result v0

    :goto_0
    invoke-static {}, LDB6$m;->h()I

    move-result v1

    invoke-virtual {p0, v1}, LDB6;->f(I)LD32;

    move-result-object p0

    iget p0, p0, LD32;->d:I

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static final c(LDB6;)I
    .locals 2

    const-string v0, "windowInsets"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LDB6;->e()Lf51;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lf51;->b()I

    move-result v0

    :goto_0
    invoke-static {}, LDB6$m;->h()I

    move-result v1

    invoke-virtual {p0, v1}, LDB6;->f(I)LD32;

    move-result-object p0

    iget p0, p0, LD32;->a:I

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static final d(LDB6;)I
    .locals 2

    const-string v0, "windowInsets"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LDB6;->e()Lf51;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lf51;->c()I

    move-result v0

    :goto_0
    invoke-static {}, LDB6$m;->h()I

    move-result v1

    invoke-virtual {p0, v1}, LDB6;->f(I)LD32;

    move-result-object p0

    iget p0, p0, LD32;->c:I

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static final e(LDB6;)I
    .locals 2

    const-string v0, "windowInsets"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LDB6;->e()Lf51;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lf51;->d()I

    move-result v0

    :goto_0
    invoke-static {}, LDB6$m;->h()I

    move-result v1

    invoke-virtual {p0, v1}, LDB6;->f(I)LD32;

    move-result-object p0

    iget p0, p0, LD32;->b:I

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static final f(ILCy3;)Z
    .locals 20

    move/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "preferredOrientation"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-ne v0, v2, :cond_0

    sget-object v2, LCy3;->c:LCy3;

    if-ne v1, v2, :cond_0

    sget-object v4, Lk20;->a:Lk20;

    sget-object v5, LWt6;->a:Ljava/lang/String;

    sget-object v6, Lk20$a;->c:Lk20$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    sget-object v9, LWt6$a;->g:LWt6$a;

    const/16 v10, 0xc

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lk20;->f(Lk20;Ljava/lang/String;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    if-ne v0, v3, :cond_1

    sget-object v2, LCy3;->b:LCy3;

    if-ne v1, v2, :cond_1

    sget-object v4, Lk20;->a:Lk20;

    sget-object v5, LWt6;->a:Ljava/lang/String;

    sget-object v6, Lk20$a;->c:Lk20$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    sget-object v9, LWt6$b;->g:LWt6$b;

    const/16 v10, 0xc

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lk20;->f(Lk20;Ljava/lang/String;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object v12, Lk20;->a:Lk20;

    sget-object v13, LWt6;->a:Ljava/lang/String;

    sget-object v14, Lk20$a;->c:Lk20$a;

    const/4 v15, 0x0

    const/16 v16, 0x0

    new-instance v2, LWt6$c;

    invoke-direct {v2, v0, v1}, LWt6$c;-><init>(ILCy3;)V

    const/16 v18, 0xc

    const/16 v19, 0x0

    move-object/from16 v17, v2

    invoke-static/range {v12 .. v19}, Lk20;->f(Lk20;Ljava/lang/String;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const/4 v3, 0x0

    :goto_0
    return v3
.end method

.method public static final g(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final h(Landroid/view/View;)Z
    .locals 1

    const-string v0, "view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final i(Landroid/app/Activity;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    const/16 v0, 0x258

    if-lt p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final j(Landroid/view/View;)V
    .locals 9

    if-nez p0, :cond_0

    sget-object v0, Lk20;->a:Lk20;

    sget-object v1, LWt6;->a:Ljava/lang/String;

    sget-object v2, Lk20$a;->c:Lk20$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, LWt6$d;->g:LWt6$d;

    const/16 v6, 0xc

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lk20;->f(Lk20;Ljava/lang/String;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_0
    if-nez p0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    sget-object v1, Lk20;->a:Lk20;

    sget-object v2, LWt6;->a:Ljava/lang/String;

    sget-object v3, Lk20$a;->c:Lk20$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, LWt6$e;

    invoke-direct {v6, p0, v0}, LWt6$e;-><init>(Landroid/view/View;Landroid/view/ViewGroup;)V

    const/16 v7, 0xc

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lk20;->f(Lk20;Ljava/lang/String;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    return-void
.end method

.method public static final k(Landroid/app/Activity;I)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    sget-object v1, Lk20;->a:Lk20;

    sget-object v2, LWt6;->a:Ljava/lang/String;

    sget-object v3, Lk20$a;->e:Lk20$a;

    const/4 v5, 0x0

    new-instance v6, LWt6$f;

    invoke-direct {v6, p1, p0}, LWt6$f;-><init>(ILandroid/app/Activity;)V

    const/16 v7, 0x8

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lk20;->f(Lk20;Ljava/lang/String;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final l(Landroid/view/View;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    move-object v3, p0

    sget-object v0, Lk20;->a:Lk20;

    sget-object v1, LWt6;->a:Ljava/lang/String;

    sget-object v2, Lk20$a;->e:Lk20$a;

    const/4 v4, 0x0

    sget-object v5, LWt6$g;->g:LWt6$g;

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lk20;->f(Lk20;Ljava/lang/String;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final m(Landroid/view/View;I)V
    .locals 1

    const-string v0, "view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
