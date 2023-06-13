.class public LGX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGO1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGX0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\"\u0010#J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\r\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J2\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0008\u0010\u001d\u001a\u00020\u0006H\u0002R\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006$"
    }
    d2 = {
        "LGX0;",
        "LGO1;",
        "Landroid/view/View;",
        "inAppMessageView",
        "LwO1;",
        "inAppMessage",
        "",
        "f",
        "d",
        "b",
        "c",
        "LjZ1;",
        "inAppMessageCloser",
        "g",
        "LmT2;",
        "messageButton",
        "LAO1;",
        "inAppMessageImmersive",
        "a",
        "e",
        "j",
        "k",
        "LYj0;",
        "clickAction",
        "Landroid/net/Uri;",
        "clickUri",
        "",
        "openUriInWebview",
        "i",
        "l",
        "Li20;",
        "h",
        "()Li20;",
        "inAppMessageManager",
        "<init>",
        "()V",
        "android-sdk-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LjZ1;LmT2;LAO1;)V
    .locals 9

    const-string v0, "inAppMessageCloser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageButton"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inAppMessageImmersive"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lk20;->a:Lk20;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, LGX0$f;->g:LGX0$f;

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-interface {p3, p2}, LAO1;->L(LmT2;)Z

    :try_start_0
    invoke-virtual {p0}, LGX0;->h()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->i()LCO1;

    move-result-object v0

    invoke-interface {v0, p3, p2, p1}, LCO1;->d(LwO1;LmT2;LjZ1;)Z

    move-result v0
    :try_end_0
    .catch Lcom/braze/support/BrazeFunctionNotImplemented; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, LGX0;->h()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->i()LCO1;

    move-result-object v0

    invoke-interface {v0, p3, p2}, LCO1;->e(LwO1;LmT2;)Z

    move-result v0

    :goto_0
    if-nez v0, :cond_0

    invoke-virtual {p0, p2, p3, p1}, LGX0;->j(LmT2;LwO1;LjZ1;)V

    :cond_0
    return-void
.end method

.method public b(Landroid/view/View;LwO1;)V
    .locals 9

    const-string v0, "inAppMessageView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inAppMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LGX0;->h()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->i()LCO1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LCO1;->g(Landroid/view/View;LwO1;)V

    sget-object v1, Lk20;->a:Lk20;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, LGX0$d;->g:LGX0$d;

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method

.method public c(LwO1;)V
    .locals 9

    const-string v0, "inAppMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lk20;->a:Lk20;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, LGX0$b;->g:LGX0$b;

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual {p0}, LGX0;->h()Li20;

    move-result-object v0

    invoke-virtual {v0}, Li20;->z()V

    instance-of v0, p1, LyO1;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LGX0;->l()V

    :cond_0
    invoke-interface {p1}, LwO1;->q0()V

    invoke-virtual {p0}, LGX0;->h()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->i()LCO1;

    move-result-object v0

    invoke-interface {v0, p1}, LCO1;->a(LwO1;)V

    return-void
.end method

.method public d(Landroid/view/View;LwO1;)V
    .locals 9

    const-string v0, "inAppMessageView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inAppMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lk20;->a:Lk20;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, LGX0$c;->g:LGX0$c;

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual {p0}, LGX0;->h()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->i()LCO1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LCO1;->j(Landroid/view/View;LwO1;)V

    return-void
.end method

.method public e(Landroid/view/View;LwO1;)V
    .locals 8

    const-string v0, "inAppMessageView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "inAppMessage"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk20;->a:Lk20;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, LGX0$j;->g:LGX0$j;

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual {p0}, LGX0;->h()Li20;

    move-result-object p1

    invoke-virtual {p1}, LwZ1;->i()LCO1;

    move-result-object p1

    invoke-interface {p1, p2}, LCO1;->b(LwO1;)V

    return-void
.end method

.method public f(Landroid/view/View;LwO1;)V
    .locals 9

    const-string v0, "inAppMessageView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inAppMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LGX0;->h()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->i()LCO1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LCO1;->i(Landroid/view/View;LwO1;)V

    sget-object v1, Lk20;->a:Lk20;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, LGX0$e;->g:LGX0$e;

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-interface {p2}, LwO1;->logImpression()Z

    return-void
.end method

.method public g(LjZ1;Landroid/view/View;LwO1;)V
    .locals 20

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, "inAppMessageCloser"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "inAppMessageView"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "inAppMessage"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lk20;->a:Lk20;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v8, LGX0$g;->g:LGX0$g;

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v3, v2

    move-object/from16 v4, p0

    invoke-static/range {v3 .. v10}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-interface/range {p3 .. p3}, LwO1;->logClick()Z

    :try_start_0
    invoke-virtual/range {p0 .. p0}, LGX0;->h()Li20;

    move-result-object v3

    invoke-virtual {v3}, LwZ1;->i()LCO1;

    move-result-object v3

    invoke-interface {v3, v1, v0}, LCO1;->c(LwO1;LjZ1;)Z

    move-result v11

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v8, LGX0$h;->g:LGX0$h;

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v3, v2

    move-object/from16 v4, p0

    invoke-static/range {v3 .. v10}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    :try_end_0
    .catch Lcom/braze/support/BrazeFunctionNotImplemented; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v12, Lk20;->a:Lk20;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    sget-object v17, LGX0$i;->g:LGX0$i;

    const/16 v18, 0x7

    const/16 v19, 0x0

    move-object/from16 v13, p0

    invoke-static/range {v12 .. v19}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, LGX0;->h()Li20;

    move-result-object v2

    invoke-virtual {v2}, LwZ1;->i()LCO1;

    move-result-object v2

    invoke-interface {v2, v1}, LCO1;->f(LwO1;)Z

    move-result v11

    :goto_0
    move-object/from16 v2, p0

    if-nez v11, :cond_0

    invoke-virtual {v2, v1, v0}, LGX0;->k(LwO1;LjZ1;)V

    :cond_0
    return-void
.end method

.method public final h()Li20;
    .locals 2

    invoke-static {}, Li20;->s()Li20;

    move-result-object v0

    const-string v1, "getInstance()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final i(LYj0;LwO1;LjZ1;Landroid/net/Uri;Z)V
    .locals 9

    invoke-virtual {p0}, LGX0;->h()Li20;

    move-result-object v0

    invoke-virtual {v0}, LwZ1;->a()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->g:Lk20$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, LGX0$k;->g:LGX0$k;

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_0
    sget-object v1, LGX0$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v1, :cond_5

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 p4, 0x3

    if-eq p1, p4, :cond_1

    invoke-virtual {p3, v2}, LjZ1;->a(Z)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, LwO1;->l0()Z

    move-result p1

    invoke-virtual {p3, p1}, LjZ1;->a(Z)V

    goto :goto_0

    :cond_2
    invoke-virtual {p3, v2}, LjZ1;->a(Z)V

    if-nez p4, :cond_3

    sget-object v0, Lk20;->a:Lk20;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, LGX0$l;->g:LGX0$l;

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_3
    sget-object p1, Lb20;->a:Lb20$a;

    invoke-virtual {p1}, Lb20$a;->a()LdO1;

    move-result-object p3

    invoke-interface {p2}, LwO1;->getExtras()Ljava/util/Map;

    move-result-object p2

    invoke-static {p2}, Le70;->a(Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object p2

    sget-object v0, Lcom/appboy/enums/Channel;->INAPP_MESSAGE:Lcom/appboy/enums/Channel;

    invoke-interface {p3, p4, p2, p5, v0}, LdO1;->e(Landroid/net/Uri;Landroid/os/Bundle;ZLcom/appboy/enums/Channel;)LCf6;

    move-result-object p2

    invoke-virtual {p0}, LGX0;->h()Li20;

    move-result-object p3

    invoke-virtual {p3}, LwZ1;->b()Landroid/content/Context;

    move-result-object p3

    if-nez p3, :cond_4

    sget-object v0, Lk20;->a:Lk20;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, LGX0$m;->g:LGX0$m;

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_4
    invoke-virtual {p1}, Lb20$a;->a()LdO1;

    move-result-object p1

    invoke-interface {p1, p3, p2}, LdO1;->c(Landroid/content/Context;LCf6;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p3, v2}, LjZ1;->a(Z)V

    new-instance p1, Ld83;

    invoke-interface {p2}, LwO1;->getExtras()Ljava/util/Map;

    move-result-object p2

    invoke-static {p2}, Le70;->a(Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object p2

    sget-object p3, Lcom/appboy/enums/Channel;->INAPP_MESSAGE:Lcom/appboy/enums/Channel;

    invoke-direct {p1, p2, p3}, Ld83;-><init>(Landroid/os/Bundle;Lcom/appboy/enums/Channel;)V

    sget-object p2, Lb20;->a:Lb20$a;

    invoke-virtual {p2}, Lb20$a;->a()LdO1;

    move-result-object p2

    invoke-interface {p2, v0, p1}, LdO1;->d(Landroid/content/Context;Ld83;)V

    :goto_0
    return-void
.end method

.method public final j(LmT2;LwO1;LjZ1;)V
    .locals 6

    invoke-virtual {p1}, LmT2;->P()LYj0;

    move-result-object v1

    invoke-virtual {p1}, LmT2;->R()Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {p1}, LmT2;->x()Z

    move-result v5

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, LGX0;->i(LYj0;LwO1;LjZ1;Landroid/net/Uri;Z)V

    return-void
.end method

.method public final k(LwO1;LjZ1;)V
    .locals 6

    invoke-interface {p1}, LwO1;->P()LYj0;

    move-result-object v1

    invoke-interface {p1}, LwO1;->R()Landroid/net/Uri;

    move-result-object v4

    invoke-interface {p1}, LwO1;->getOpenUriInWebView()Z

    move-result v5

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, LGX0;->i(LYj0;LwO1;LjZ1;Landroid/net/Uri;Z)V

    return-void
.end method

.method public final l()V
    .locals 6

    sget-object v0, LZ10;->b:LZ10;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, LGX0$n;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, LGX0$n;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
