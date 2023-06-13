.class public final Lcom/google/gson/internal/bind/TreeTypeAdapter;
.super Lct5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/gson/internal/bind/TreeTypeAdapter$b;,
        Lcom/google/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lct5<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Llj2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llj2<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Lvi2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi2<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:LoE1;

.field public final d:LFb6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LFb6<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final e:LCb6;

.field public final f:Lcom/google/gson/internal/bind/TreeTypeAdapter$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/internal/bind/TreeTypeAdapter<",
            "TT;>.b;"
        }
    .end annotation
.end field

.field public final g:Z

.field public volatile h:LBb6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBb6<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llj2;Lvi2;LoE1;LFb6;LCb6;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llj2<",
            "TT;>;",
            "Lvi2<",
            "TT;>;",
            "LoE1;",
            "LFb6<",
            "TT;>;",
            "LCb6;",
            ")V"
        }
    .end annotation

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/gson/internal/bind/TreeTypeAdapter;-><init>(Llj2;Lvi2;LoE1;LFb6;LCb6;Z)V

    return-void
.end method

.method public constructor <init>(Llj2;Lvi2;LoE1;LFb6;LCb6;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llj2<",
            "TT;>;",
            "Lvi2<",
            "TT;>;",
            "LoE1;",
            "LFb6<",
            "TT;>;",
            "LCb6;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Lct5;-><init>()V

    new-instance v0, Lcom/google/gson/internal/bind/TreeTypeAdapter$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/gson/internal/bind/TreeTypeAdapter$b;-><init>(Lcom/google/gson/internal/bind/TreeTypeAdapter;Lcom/google/gson/internal/bind/TreeTypeAdapter$a;)V

    iput-object v0, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->f:Lcom/google/gson/internal/bind/TreeTypeAdapter$b;

    iput-object p1, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->a:Llj2;

    iput-object p2, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->b:Lvi2;

    iput-object p3, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->c:LoE1;

    iput-object p4, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->d:LFb6;

    iput-object p5, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->e:LCb6;

    iput-boolean p6, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->g:Z

    return-void
.end method

.method public static g(LFb6;Ljava/lang/Object;)LCb6;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LFb6<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "LCb6;"
        }
    .end annotation

    invoke-virtual {p0}, LFb6;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p0}, LFb6;->getRawType()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Lcom/google/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v0, v2}, Lcom/google/gson/internal/bind/TreeTypeAdapter$SingleTypeFactory;-><init>(Ljava/lang/Object;LFb6;ZLjava/lang/Class;)V

    return-object v1
.end method


# virtual methods
.method public e()LBb6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LBb6<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->a:Llj2;

    if-eqz v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/gson/internal/bind/TreeTypeAdapter;->f()LBb6;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final f()LBb6;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LBb6<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->h:LBb6;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->c:LoE1;

    iget-object v1, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->e:LCb6;

    iget-object v2, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->d:LFb6;

    invoke-virtual {v0, v1, v2}, LoE1;->r(LCb6;LFb6;)LBb6;

    move-result-object v0

    iput-object v0, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->h:LBb6;

    :goto_0
    return-object v0
.end method

.method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->b:Lvi2;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/gson/internal/bind/TreeTypeAdapter;->f()LBb6;

    move-result-object v0

    invoke-virtual {v0, p1}, LBb6;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, LKR5;->a(Lcom/google/gson/stream/JsonReader;)Lyi2;

    move-result-object p1

    iget-boolean v0, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->g:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lyi2;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->b:Lvi2;

    iget-object v1, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->d:LFb6;

    invoke-virtual {v1}, LFb6;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->f:Lcom/google/gson/internal/bind/TreeTypeAdapter$b;

    invoke-interface {v0, p1, v1, v2}, Lvi2;->deserialize(Lyi2;Ljava/lang/reflect/Type;Lui2;)Ljava/lang/Object;

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

    iget-object v0, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->a:Llj2;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/gson/internal/bind/TreeTypeAdapter;->f()LBb6;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LBb6;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v1, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->g:Z

    if-eqz v1, :cond_1

    if-nez p2, :cond_1

    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;

    return-void

    :cond_1
    iget-object v1, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->d:LFb6;

    invoke-virtual {v1}, LFb6;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Lcom/google/gson/internal/bind/TreeTypeAdapter;->f:Lcom/google/gson/internal/bind/TreeTypeAdapter$b;

    invoke-interface {v0, p2, v1, v2}, Llj2;->serialize(Ljava/lang/Object;Ljava/lang/reflect/Type;Lkj2;)Lyi2;

    move-result-object p2

    invoke-static {p2, p1}, LKR5;->b(Lyi2;Lcom/google/gson/stream/JsonWriter;)V

    return-void
.end method
