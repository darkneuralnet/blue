.class public final LGP2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWU2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGP2$a;,
        LGP2$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LWU2<",
        "Landroid/net/Uri;",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGP2;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, LGP2;->d(Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILsy3;)LWU2$a;
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2, p3, p4}, LGP2;->c(Landroid/net/Uri;IILsy3;)LWU2$a;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/net/Uri;IILsy3;)LWU2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "II",
            "Lsy3;",
            ")",
            "LWU2$a<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    new-instance p2, LWU2$a;

    new-instance p3, LQd3;

    invoke-direct {p3, p1}, LQd3;-><init>(Ljava/lang/Object;)V

    new-instance p4, LGP2$b;

    iget-object v0, p0, LGP2;->a:Landroid/content/Context;

    invoke-direct {p4, v0, p1}, LGP2$b;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-direct {p2, p3, p4}, LWU2$a;-><init>(Lak2;LIS0;)V

    return-object p2
.end method

.method public d(Landroid/net/Uri;)Z
    .locals 0

    invoke-static {p1}, LJP2;->b(Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method
