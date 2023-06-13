.class public final LKb7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljc7;


# static fields
.field public static final b:LRb7;


# instance fields
.field public final a:LRb7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LIb7;

    invoke-direct {v0}, LIb7;-><init>()V

    sput-object v0, LKb7;->b:LRb7;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    new-instance v0, LJb7;

    const/4 v1, 0x2

    new-array v1, v1, [LRb7;

    invoke-static {}, LZa7;->c()LZa7;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    :try_start_0
    const-string v2, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v4, "getInstance"

    new-array v5, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LRb7;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, LKb7;->b:LRb7;

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, LJb7;-><init>([LRb7;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lpb7;->a:Ljava/nio/charset/Charset;

    iput-object v0, p0, LKb7;->a:LRb7;

    return-void
.end method

.method public static b(LQb7;)Z
    .locals 1

    invoke-interface {p0}, LQb7;->zbc()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lic7;
    .locals 8

    invoke-static {p1}, Lkc7;->e(Ljava/lang/Class;)V

    iget-object v0, p0, LKb7;->a:LRb7;

    invoke-interface {v0, p1}, LRb7;->a(Ljava/lang/Class;)LQb7;

    move-result-object v2

    invoke-interface {v2}, LQb7;->zbb()Z

    move-result v0

    const-class v1, Lfb7;

    if-eqz v0, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lkc7;->a()LBc7;

    move-result-object p1

    invoke-static {}, LRa7;->b()LPa7;

    move-result-object v0

    invoke-interface {v2}, LQb7;->y()LTb7;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lac7;->i(LBc7;LPa7;LTb7;)Lac7;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lkc7;->X()LBc7;

    move-result-object p1

    invoke-static {}, LRa7;->a()LPa7;

    move-result-object v0

    invoke-interface {v2}, LQb7;->y()LTb7;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lac7;->i(LBc7;LPa7;LTb7;)Lac7;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, LKb7;->b(LQb7;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ldc7;->b()Lcc7;

    move-result-object v3

    invoke-static {}, LGb7;->d()LGb7;

    move-result-object v4

    invoke-static {}, Lkc7;->a()LBc7;

    move-result-object v5

    invoke-static {}, LRa7;->b()LPa7;

    move-result-object v6

    invoke-static {}, LPb7;->b()LOb7;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LZb7;->I(Ljava/lang/Class;LQb7;Lcc7;LGb7;LBc7;LPa7;LOb7;)LZb7;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {}, Ldc7;->b()Lcc7;

    move-result-object v3

    invoke-static {}, LGb7;->d()LGb7;

    move-result-object v4

    invoke-static {}, Lkc7;->a()LBc7;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LPb7;->b()LOb7;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LZb7;->I(Ljava/lang/Class;LQb7;Lcc7;LGb7;LBc7;LPa7;LOb7;)LZb7;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {v2}, LKb7;->b(LQb7;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Ldc7;->a()Lcc7;

    move-result-object v3

    invoke-static {}, LGb7;->c()LGb7;

    move-result-object v4

    invoke-static {}, Lkc7;->X()LBc7;

    move-result-object v5

    invoke-static {}, LRa7;->a()LPa7;

    move-result-object v6

    invoke-static {}, LPb7;->a()LOb7;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LZb7;->I(Ljava/lang/Class;LQb7;Lcc7;LGb7;LBc7;LPa7;LOb7;)LZb7;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-static {}, Ldc7;->a()Lcc7;

    move-result-object v3

    invoke-static {}, LGb7;->c()LGb7;

    move-result-object v4

    invoke-static {}, Lkc7;->Y()LBc7;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LPb7;->a()LOb7;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LZb7;->I(Ljava/lang/Class;LQb7;Lcc7;LGb7;LBc7;LPa7;LOb7;)LZb7;

    move-result-object p1

    :goto_0
    return-object p1
.end method
