.class public final LTQ7;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/content/Context;Lcn8;)Lnl8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcn8;",
            ")",
            "Lnl8<",
            "Lz18;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lka8;->a(Landroid/content/Context;)LU98;

    move-result-object p0

    const-string v0, "recaptcha"

    invoke-virtual {p0, v0}, LU98;->b(Ljava/lang/String;)LU98;

    const-string v0, "token.pb"

    invoke-virtual {p0, v0}, LU98;->c(Ljava/lang/String;)LU98;

    invoke-virtual {p0}, LU98;->a()Landroid/net/Uri;

    move-result-object p0

    invoke-static {}, LOl8;->i()LAl8;

    move-result-object v0

    invoke-virtual {v0, p0}, LAl8;->e(Landroid/net/Uri;)LAl8;

    invoke-static {}, Lz18;->x()Lz18;

    move-result-object p0

    invoke-virtual {v0, p0}, LAl8;->c(LNp9;)LAl8;

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, LAl8;->f(Z)LAl8;

    invoke-virtual {v0}, LAl8;->g()LOl8;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcn8;->a(LOl8;)Lnl8;

    move-result-object p0

    return-object p0
.end method
