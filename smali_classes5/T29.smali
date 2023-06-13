.class public final LT29;
.super LKn2;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LKn2;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LK29;)V
    .locals 0

    invoke-direct {p0}, LKn2;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Lx09;

    new-instance v0, Lt19;

    invoke-static {}, LyU2;->c()LyU2;

    move-result-object v1

    new-instance v2, LH09;

    invoke-static {}, LyU2;->c()LyU2;

    move-result-object v3

    invoke-virtual {v3}, LyU2;->b()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3, p1}, LH09;-><init>(Landroid/content/Context;Lx09;)V

    invoke-virtual {p1}, Lx09;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, LyU2;->b()Landroid/content/Context;

    move-result-object v3

    const-class v4, LZy5;

    invoke-virtual {v1, v4}, LyU2;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZy5;

    invoke-direct {v0, v3, v1, v2, p1}, Lt19;-><init>(Landroid/content/Context;LZy5;Lf09;Ljava/lang/String;)V

    return-object v0
.end method
