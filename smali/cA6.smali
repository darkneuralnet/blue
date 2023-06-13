.class public LcA6;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/webkit/WebSettings;)LaA6;
    .locals 1

    invoke-static {}, LtA6;->c()LDA6;

    move-result-object v0

    invoke-virtual {v0, p0}, LDA6;->a(Landroid/webkit/WebSettings;)LaA6;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/webkit/WebSettings;I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, LrA6;->Y:LrA6;

    invoke-virtual {v0}, LrA6;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, LbA6;->a(Landroid/webkit/WebSettings;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LrA6;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, LcA6;->a(Landroid/webkit/WebSettings;)LaA6;

    move-result-object p0

    invoke-virtual {p0, p1}, LaA6;->a(I)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, LrA6;->b()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static c(Landroid/webkit/WebSettings;I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, LrA6;->Z:LrA6;

    invoke-virtual {v0}, LrA6;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LcA6;->a(Landroid/webkit/WebSettings;)LaA6;

    move-result-object p0

    invoke-virtual {p0, p1}, LaA6;->b(I)V

    return-void

    :cond_0
    invoke-static {}, LrA6;->b()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method
