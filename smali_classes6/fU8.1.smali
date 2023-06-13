.class public final LfU8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDW8;


# instance fields
.field public final synthetic a:LhV8;


# direct methods
.method public constructor <init>(LhV8;)V
    .locals 0

    iput-object p1, p0, LfU8;->a:LhV8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const-string v0, "_err"

    if-eqz p2, :cond_1

    iget-object p1, p0, LfU8;->a:LhV8;

    invoke-static {p1}, LhV8;->b0(LhV8;)LPn8;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p1}, LhV8;->b0(LhV8;)LPn8;

    move-result-object p1

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    const-string p2, "AppId not known when logging event"

    invoke-virtual {p1, p2, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    iget-object p2, p0, LfU8;->a:LhV8;

    invoke-virtual {p2}, LhV8;->c()Ldn8;

    move-result-object p2

    new-instance v1, LdU8;

    invoke-direct {v1, p0, p1, v0, p3}, LdU8;-><init>(LfU8;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {p2, v1}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method
