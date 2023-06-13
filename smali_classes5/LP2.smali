.class public LLP2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWU2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLP2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LWU2<",
        "Landroid/net/Uri;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LLP2;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, LLP2;->d(Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILsy3;)LWU2$a;
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2, p3, p4}, LLP2;->c(Landroid/net/Uri;IILsy3;)LWU2$a;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/net/Uri;IILsy3;)LWU2$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "II",
            "Lsy3;",
            ")",
            "LWU2$a<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    invoke-static {p2, p3}, LJP2;->d(II)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p4}, LLP2;->e(Lsy3;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, LWU2$a;

    new-instance p3, LQd3;

    invoke-direct {p3, p1}, LQd3;-><init>(Ljava/lang/Object;)V

    iget-object p4, p0, LLP2;->a:Landroid/content/Context;

    invoke-static {p4, p1}, LX36;->f(Landroid/content/Context;Landroid/net/Uri;)LX36;

    move-result-object p1

    invoke-direct {p2, p3, p1}, LWU2$a;-><init>(Lak2;LIS0;)V

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Landroid/net/Uri;)Z
    .locals 0

    invoke-static {p1}, LJP2;->c(Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method

.method public final e(Lsy3;)Z
    .locals 4

    sget-object v0, Lcp6;->d:Liy3;

    invoke-virtual {p1, v0}, Lsy3;->c(Liy3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
