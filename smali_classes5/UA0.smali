.class public final LUA0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a4\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroid/content/Context;",
        "Lo31;",
        "dialogData",
        "Lkotlin/Function0;",
        "",
        "onPositiveClick",
        "onNegativeClick",
        "c",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static synthetic a(Lkotlin/jvm/functions/Function0;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LUA0;->e(Lkotlin/jvm/functions/Function0;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function0;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LUA0;->d(Lkotlin/jvm/functions/Function0;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static final c(Landroid/content/Context;Lo31;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lo31;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dialogData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LAM2;

    invoke-direct {v0, p0}, LAM2;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lo31;->d()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, LAM2;->K(Ljava/lang/CharSequence;)LAM2;

    move-result-object p0

    invoke-virtual {p1}, Lo31;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LAM2;->B(Ljava/lang/CharSequence;)LAM2;

    move-result-object p0

    invoke-virtual {p1}, Lo31;->c()Ljava/lang/String;

    move-result-object v0

    new-instance v1, LSA0;

    invoke-direct {v1, p2}, LSA0;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0, v0, v1}, LAM2;->H(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)LAM2;

    move-result-object p0

    invoke-virtual {p1}, Lo31;->b()Ljava/lang/String;

    move-result-object p1

    new-instance p2, LTA0;

    invoke-direct {p2, p3}, LTA0;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0, p1, p2}, LAM2;->D(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)LAM2;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/appcompat/app/b$a;->s()Landroidx/appcompat/app/b;

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function0;Landroid/content/DialogInterface;I)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static final e(Lkotlin/jvm/functions/Function0;Landroid/content/DialogInterface;I)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method
