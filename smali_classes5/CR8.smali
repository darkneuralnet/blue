.class public final LCR8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LUO8;

.field public final b:LiR8;


# direct methods
.method public constructor <init>(LiR8;[B)V
    .locals 0

    sget-object p2, LJO8;->b:LJO8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCR8;->b:LiR8;

    iput-object p2, p0, LCR8;->a:LUO8;

    return-void
.end method

.method public static synthetic a(LCR8;)LUO8;
    .locals 0

    iget-object p0, p0, LCR8;->a:LUO8;

    return-object p0
.end method

.method public static b(Ljava/lang/String;)LCR8;
    .locals 2

    new-instance p0, LCR8;

    new-instance v0, LiR8;

    const-string v1, "#vk "

    invoke-direct {v0, v1}, LiR8;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LCR8;-><init>(LiR8;[B)V

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, LCR8;->b:LiR8;

    new-instance v1, LYQ8;

    invoke-direct {v1, v0, p0, p1}, LYQ8;-><init>(LiR8;LCR8;Ljava/lang/CharSequence;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
