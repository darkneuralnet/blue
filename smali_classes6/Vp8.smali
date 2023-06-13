.class public final LVp8;
.super LDu8;
.source "SourceFile"


# static fields
.field public static final a:LDu8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LVp8;

    invoke-direct {v0}, LVp8;-><init>()V

    sput-object v0, LVp8;->a:LDu8;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LDu8;-><init>()V

    return-void
.end method

.method public static synthetic b()LDu8;
    .locals 1

    sget-object v0, LVp8;->a:LDu8;

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic a(LOl8;Ljava/lang/String;Ljava/util/concurrent/Executor;LP78;I)Lpu8;
    .locals 9

    invoke-virtual {p1}, LOl8;->g()Z

    move-result p5

    if-eqz p5, :cond_0

    invoke-static {}, Lsk9;->b()Lsk9;

    move-result-object p5

    goto :goto_0

    :cond_0
    invoke-static {}, Lsk9;->a()Lsk9;

    move-result-object p5

    :goto_0
    invoke-virtual {p1}, LOl8;->d()LNp9;

    move-result-object v0

    invoke-static {v0, p5}, Lfw8;->c(LNp9;Lsk9;)Lfw8;

    move-result-object v4

    new-instance p5, Lqq8;

    invoke-virtual {p1}, LOl8;->a()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lva9;->f(Ljava/lang/Object;)LMb9;

    move-result-object v3

    invoke-virtual {p1}, LOl8;->b()Lmj8;

    move-result-object v7

    invoke-virtual {p1}, LOl8;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LYA8;->d()LYA8;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, LYA8;->c()LYA8;

    move-result-object p1

    :goto_1
    move-object v8, p1

    move-object v1, p5

    move-object v2, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v8}, Lqq8;-><init>(Ljava/lang/String;LMb9;LAn8;Ljava/util/concurrent/Executor;LP78;Lmj8;LYA8;)V

    return-object p5
.end method
