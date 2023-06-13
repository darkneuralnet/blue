.class public final Lcom/google/gson/internal/bind/a;
.super LBb6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LBb6<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:LoE1;

.field public final b:LBb6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBb6<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(LoE1;LBb6;Ljava/lang/reflect/Type;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LoE1;",
            "LBb6<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, LBb6;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/a;->a:LoE1;

    iput-object p2, p0, Lcom/google/gson/internal/bind/a;->b:LBb6;

    iput-object p3, p0, Lcom/google/gson/internal/bind/a;->c:Ljava/lang/reflect/Type;

    return-void
.end method

.method public static e(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;
    .locals 1

    if-eqz p1, :cond_1

    instance-of v0, p0, Ljava/lang/Class;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static f(LBb6;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBb6<",
            "*>;)Z"
        }
    .end annotation

    :goto_0
    instance-of v0, p0, Lct5;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lct5;

    invoke-virtual {v0}, Lct5;->e()LBb6;

    move-result-object v0

    if-ne v0, p0, :cond_0

    goto :goto_1

    :cond_0
    move-object p0, v0

    goto :goto_0

    :cond_1
    :goto_1
    instance-of p0, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$b;

    return p0
.end method


# virtual methods
.method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/stream/JsonReader;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/gson/internal/bind/a;->b:LBb6;

    invoke-virtual {v0, p1}, LBb6;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/stream/JsonWriter;",
            "TT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/gson/internal/bind/a;->b:LBb6;

    iget-object v1, p0, Lcom/google/gson/internal/bind/a;->c:Ljava/lang/reflect/Type;

    invoke-static {v1, p2}, Lcom/google/gson/internal/bind/a;->e(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Lcom/google/gson/internal/bind/a;->c:Ljava/lang/reflect/Type;

    if-eq v1, v2, :cond_1

    iget-object v0, p0, Lcom/google/gson/internal/bind/a;->a:LoE1;

    invoke-static {v1}, LFb6;->get(Ljava/lang/reflect/Type;)LFb6;

    move-result-object v1

    invoke-virtual {v0, v1}, LoE1;->p(LFb6;)LBb6;

    move-result-object v0

    instance-of v1, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$b;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/gson/internal/bind/a;->b:LBb6;

    invoke-static {v1}, Lcom/google/gson/internal/bind/a;->f(LBb6;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Lcom/google/gson/internal/bind/a;->b:LBb6;

    :cond_1
    :goto_0
    invoke-virtual {v0, p1, p2}, LBb6;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    return-void
.end method
