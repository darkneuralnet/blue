.class public final LKI7;
.super LyJ7;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 2

    new-instance v0, LzN7;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, LzN7;-><init>(I)V

    invoke-direct {p0, v0}, LyJ7;-><init>(Ljava/util/Map;)V

    return-void
.end method

.method public static o()LKI7;
    .locals 1

    new-instance v0, LKI7;

    invoke-direct {v0}, LKI7;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic d()Ljava/util/Collection;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0
.end method
