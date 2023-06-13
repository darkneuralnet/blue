.class public final LHz8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDW8;


# instance fields
.field public final synthetic a:LRC8;


# direct methods
.method public constructor <init>(LRC8;)V
    .locals 0

    iput-object p1, p0, LHz8;->a:LRC8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const-string v0, "auto"

    const-string v1, "_err"

    if-nez p2, :cond_0

    iget-object p2, p0, LHz8;->a:LRC8;

    invoke-virtual {p2, v0, v1, p3, p1}, LRC8;->q(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, LHz8;->a:LRC8;

    invoke-virtual {p1, v0, v1, p3}, LRC8;->o(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
