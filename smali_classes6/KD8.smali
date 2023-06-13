.class public final LKD8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "LPC8;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LKD8;->a:Ljava/util/Map;

    return-void
.end method

.method public static a(LYH8;)LYH8;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "LYH8<",
            "TI;TO;>;)",
            "LYH8<",
            "TI;TO;>;"
        }
    .end annotation

    invoke-static {}, LFE8;->b()LPC8;

    move-result-object v0

    new-instance v1, LmD8;

    invoke-direct {v1, v0, p0}, LmD8;-><init>(LPC8;LYH8;)V

    return-object v1
.end method

.method public static b(Lc69;)Lc69;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lc69<",
            "TV;>;)",
            "Lc69<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LFE8;->b()LPC8;

    move-result-object v0

    new-instance v1, LaD8;

    invoke-direct {v1, v0, p0}, LaD8;-><init>(LPC8;Lc69;)V

    return-object v1
.end method

.method public static c(Lk69;)Lk69;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Lk69<",
            "TI;TO;>;)",
            "Lk69<",
            "TI;TO;>;"
        }
    .end annotation

    invoke-static {}, LFE8;->b()LPC8;

    move-result-object v0

    new-instance v1, LyD8;

    invoke-direct {v1, v0, p0}, LyD8;-><init>(LPC8;Lk69;)V

    return-object v1
.end method
