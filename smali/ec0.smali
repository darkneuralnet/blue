.class public Lec0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;LWa0;)LTe4;
    .locals 1

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Lo8;->f(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lo8;

    invoke-direct {v0, p1}, Lo8;-><init>(LWa0;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {p1}, LIo;->e(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LIo;

    invoke-direct {v0}, LIo;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-static {p1}, LZh2;->d(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, LZh2;

    invoke-direct {v0}, LZh2;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-static {p1}, LU80;->d(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, LU80;

    invoke-direct {v0, p1}, LU80;-><init>(LWa0;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-static {p1}, LnX1;->d(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, LnX1;

    invoke-direct {v0}, LnX1;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-static {p1}, LZb0;->d(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, LZb0;

    invoke-direct {v0}, LZb0;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {p1}, LgI6;->g(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, LgI6;

    invoke-direct {v0}, LgI6;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-static {p1}, Lpo1;->d(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Lpo1;

    invoke-direct {v0}, Lpo1;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    invoke-static {p1}, Ld9;->d(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v0, Ld9;

    invoke-direct {v0}, Ld9;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    invoke-static {p1}, LGx0;->d(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance v0, LGx0;

    invoke-direct {v0}, LGx0;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-static {p1}, LZ14;->d(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v0, LZ14;

    invoke-direct {v0}, LZ14;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-static {p1}, Lwf0;->d(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v0, Lwf0;

    invoke-direct {v0}, Lwf0;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    invoke-static {p1}, LhX1;->d(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_c

    new-instance v0, LhX1;

    invoke-direct {v0}, LhX1;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    invoke-static {p1}, LoX1;->d(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_d

    new-instance v0, LoX1;

    invoke-direct {v0}, LoX1;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_d
    invoke-static {p1}, LfX1;->d(LWa0;)Z

    move-result p1

    if-eqz p1, :cond_e

    new-instance p1, LfX1;

    invoke-direct {p1}, LfX1;-><init>()V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_e
    new-instance p1, LTe4;

    invoke-direct {p1, p0}, LTe4;-><init>(Ljava/util/List;)V

    return-object p1
.end method
