.class public final Lkb4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWU2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb4$a;,
        Lkb4$b;,
        Lkb4$c;,
        Lkb4$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LWU2<",
        "Landroid/net/Uri;",
        "TDataT;>;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LWU2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWU2<",
            "Ljava/io/File;",
            "TDataT;>;"
        }
    .end annotation
.end field

.field public final c:LWU2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWU2<",
            "Landroid/net/Uri;",
            "TDataT;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TDataT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;LWU2;LWU2;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LWU2<",
            "Ljava/io/File;",
            "TDataT;>;",
            "LWU2<",
            "Landroid/net/Uri;",
            "TDataT;>;",
            "Ljava/lang/Class<",
            "TDataT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lkb4;->a:Landroid/content/Context;

    iput-object p2, p0, Lkb4;->b:LWU2;

    iput-object p3, p0, Lkb4;->c:LWU2;

    iput-object p4, p0, Lkb4;->d:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, Lkb4;->d(Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILsy3;)LWU2$a;
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkb4;->c(Landroid/net/Uri;IILsy3;)LWU2$a;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/net/Uri;IILsy3;)LWU2$a;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "II",
            "Lsy3;",
            ")",
            "LWU2$a<",
            "TDataT;>;"
        }
    .end annotation

    move-object v0, p0

    new-instance v1, LWU2$a;

    new-instance v2, LQd3;

    move-object v7, p1

    invoke-direct {v2, p1}, LQd3;-><init>(Ljava/lang/Object;)V

    new-instance v12, Lkb4$d;

    iget-object v4, v0, Lkb4;->a:Landroid/content/Context;

    iget-object v5, v0, Lkb4;->b:LWU2;

    iget-object v6, v0, Lkb4;->c:LWU2;

    iget-object v11, v0, Lkb4;->d:Ljava/lang/Class;

    move-object v3, v12

    move v8, p2

    move/from16 v9, p3

    move-object/from16 v10, p4

    invoke-direct/range {v3 .. v11}, Lkb4$d;-><init>(Landroid/content/Context;LWU2;LWU2;Landroid/net/Uri;IILsy3;Ljava/lang/Class;)V

    invoke-direct {v1, v2, v12}, LWU2$a;-><init>(Lak2;LIS0;)V

    return-object v1
.end method

.method public d(Landroid/net/Uri;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p1}, LJP2;->b(Landroid/net/Uri;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
