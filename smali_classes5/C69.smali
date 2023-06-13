.class public final LC69;
.super LKn2;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LKn2;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lv69;)V
    .locals 0

    invoke-direct {p0}, LKn2;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, LL29;

    new-instance v0, Ly49;

    invoke-static {}, LyU2;->c()LyU2;

    move-result-object v1

    new-instance v2, LU29;

    invoke-static {}, LyU2;->c()LyU2;

    move-result-object v3

    invoke-virtual {v3}, LyU2;->b()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3, p1}, LU29;-><init>(Landroid/content/Context;LL29;)V

    invoke-virtual {p1}, LL29;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, LyU2;->b()Landroid/content/Context;

    move-result-object v3

    const-class v4, LZy5;

    invoke-virtual {v1, v4}, LyU2;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZy5;

    invoke-direct {v0, v3, v1, v2, p1}, Ly49;-><init>(Landroid/content/Context;LZy5;Lq49;Ljava/lang/String;)V

    return-object v0
.end method
