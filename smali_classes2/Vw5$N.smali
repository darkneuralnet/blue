.class public final LVw5$N;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVw5;->c(Landroid/content/Intent;LsJ4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LJx5<",
        "+",
        "Lco/bird/android/model/User;",
        "+",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u00062f\u0010\u0005\u001ab\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0002*0\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "LJx5;",
        "Lco/bird/android/model/User;",
        "kotlin.jvm.PlatformType",
        "",
        "",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(LJx5;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LVw5;


# direct methods
.method public constructor <init>(LVw5;)V
    .locals 0

    iput-object p1, p0, LVw5$N;->g:LVw5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJx5;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJx5<",
            "Lco/bird/android/model/User;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LJx5;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/User;

    invoke-virtual {p1}, LJx5;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1}, LJx5;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1}, LJx5;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1}, LJx5;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {p1}, LJx5;->f()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0}, Lco/bird/android/model/User;->getEmail()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/User;->getEmailVerifiedAt()Lorg/joda/time/DateTime;

    move-result-object v7

    if-eqz v7, :cond_0

    move v7, v5

    goto :goto_0

    :cond_0
    move v7, v6

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lco/bird/android/model/User;->getEmailVerifiedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    :cond_1
    iget-object v0, p0, LVw5$N;->g:LVw5;

    invoke-static {v0}, LVw5;->access$getUi$p(LVw5;)Lex5;

    move-result-object v0

    invoke-interface {v0, v7}, Lex5;->Hl(Z)V

    iget-object v0, p0, LVw5$N;->g:LVw5;

    invoke-static {v0}, LVw5;->access$getUi$p(LVw5;)Lex5;

    move-result-object v0

    invoke-interface {v0, v6}, Lex5;->c6(Z)V

    iget-object v0, p0, LVw5$N;->g:LVw5;

    invoke-static {v0}, LVw5;->access$getUi$p(LVw5;)Lex5;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lex5;->Tk(Ljava/lang/String;)V

    iget-object v0, p0, LVw5$N;->g:LVw5;

    invoke-static {v0}, LVw5;->access$getUi$p(LVw5;)Lex5;

    move-result-object v0

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_2

    move v1, v5

    goto :goto_1

    :cond_2
    move v1, v6

    :goto_1
    if-eqz v1, :cond_3

    move v1, v5

    goto :goto_2

    :cond_3
    move v1, v6

    :goto_2
    invoke-interface {v0, v1}, Lex5;->D3(Z)V

    iget-object v0, p0, LVw5$N;->g:LVw5;

    invoke-static {v0}, LVw5;->access$getUi$p(LVw5;)Lex5;

    move-result-object v0

    if-eqz p1, :cond_5

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_4

    move p1, v5

    goto :goto_3

    :cond_4
    move p1, v6

    :goto_3
    if-eqz p1, :cond_5

    goto :goto_4

    :cond_5
    move v5, v6

    :goto_4
    invoke-interface {v0, v5}, Lex5;->k3(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJx5;

    invoke-virtual {p0, p1}, LVw5$N;->a(LJx5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
