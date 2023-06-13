.class public final LCw9;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lorg/jspecify/nullness/NullMarked;
.end annotation


# instance fields
.field public final a:LA99;

.field public final b:Z

.field public final c:Lvs9;


# direct methods
.method public constructor <init>(Lvs9;ZLA99;I[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCw9;->c:Lvs9;

    iput-boolean p2, p0, LCw9;->b:Z

    iput-object p3, p0, LCw9;->a:LA99;

    return-void
.end method

.method public static synthetic a(LCw9;)LA99;
    .locals 0

    iget-object p0, p0, LCw9;->a:LA99;

    return-object p0
.end method

.method public static c(LA99;)LCw9;
    .locals 7

    new-instance v6, LCw9;

    new-instance v1, Lvs9;

    invoke-direct {v1, p0}, Lvs9;-><init>(LA99;)V

    const/4 v2, 0x0

    sget-object v3, Ld59;->b:Ld59;

    const v4, 0x7fffffff

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LCw9;-><init>(Lvs9;ZLA99;I[B)V

    return-object v6
.end method

.method public static synthetic e(LCw9;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p1}, LCw9;->h(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(LCw9;)Z
    .locals 0

    iget-boolean p0, p0, LCw9;->b:Z

    return p0
.end method


# virtual methods
.method public final b()LCw9;
    .locals 7

    new-instance v6, LCw9;

    iget-object v1, p0, LCw9;->c:Lvs9;

    const/4 v2, 0x1

    iget-object v3, p0, LCw9;->a:LA99;

    const v4, 0x7fffffff

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LCw9;-><init>(Lvs9;ZLA99;I[B)V

    return-object v6
.end method

.method public final d(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
    .locals 1

    new-instance v0, Lau9;

    invoke-direct {v0, p0, p1}, Lau9;-><init>(LCw9;Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public final f(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p1}, LCw9;->h(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, LCw9;->c:Lvs9;

    new-instance v1, LTq9;

    invoke-direct {v1, v0, p0, p1}, LTq9;-><init>(Lvs9;LCw9;Ljava/lang/CharSequence;)V

    return-object v1
.end method
