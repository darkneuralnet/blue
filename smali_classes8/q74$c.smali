.class public final Lq74$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq74;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lq74$b;Lq74$b;)I
    .locals 0

    invoke-static {p0, p1}, Lq74$c;->e(Lq74$b;Lq74$b;)I

    move-result p0

    return p0
.end method

.method public static synthetic b([Lq74$b;[Lq74$b;)Z
    .locals 0

    invoke-static {p0, p1}, Lq74$c;->d([Lq74$b;[Lq74$b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c([Lq74$b;)[Lq74$b;
    .locals 0

    invoke-static {p0}, Lq74$c;->f([Lq74$b;)[Lq74$b;

    move-result-object p0

    return-object p0
.end method

.method public static d([Lq74$b;[Lq74$b;)Z
    .locals 10

    array-length v0, p0

    array-length v1, p1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    array-length v0, p0

    move v1, v2

    :goto_0
    const/4 v3, 0x1

    if-ge v1, v0, :cond_6

    aget-object v4, p0, v1

    array-length v5, p1

    move v6, v2

    :goto_1
    if-ge v6, v5, :cond_3

    aget-object v7, p1, v6

    invoke-static {v4}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object v8

    invoke-static {v7}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-static {v4}, Lq74$b;->b(Lq74$b;)I

    move-result v5

    invoke-static {v7}, Lq74$b;->b(Lq74$b;)I

    move-result v6

    if-ne v5, v6, :cond_1

    invoke-static {v4}, Lq74$b;->c(Lq74$b;)I

    move-result v4

    invoke-static {v7}, Lq74$b;->c(Lq74$b;)I

    move-result v5

    if-eq v4, v5, :cond_4

    :cond_1
    return v2

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    move v3, v2

    :cond_4
    if-nez v3, :cond_5

    return v2

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    return v3
.end method

.method public static e(Lq74$b;Lq74$b;)I
    .locals 2

    invoke-virtual {p0}, Lq74$b;->f()LSd6;

    move-result-object p0

    invoke-interface {p0}, LSd6;->G()LSd6;

    move-result-object p0

    invoke-virtual {p1}, Lq74$b;->f()LSd6;

    move-result-object p1

    invoke-interface {p1}, LSd6;->G()LSd6;

    move-result-object p1

    invoke-interface {p0}, LSd6;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, LSd6;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_0
    invoke-interface {p0}, LSd6;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1}, LSd6;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static f([Lq74$b;)[Lq74$b;
    .locals 2

    if-eqz p0, :cond_1

    array-length v0, p0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lq74$b;

    new-instance v0, Lr74;

    invoke-direct {v0}, Lr74;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    :cond_1
    :goto_0
    return-object p0
.end method
