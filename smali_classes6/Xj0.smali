.class public final LXj0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lol2;)Lll2;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    invoke-interface {p0}, Lol2;->read()Lkl2;

    move-result-object p0

    invoke-static {p0}, Lll2;->e(Lkl2;)Lll2;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lll2;Lpl2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lll2;->f()Lkl2;

    move-result-object p0

    invoke-interface {p1, p0}, Lpl2;->b(Lkl2;)V

    return-void
.end method
