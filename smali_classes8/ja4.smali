.class public Lja4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lja4$b;,
        Lja4$c;,
        Lja4$d;,
        Lja4$e;,
        Lja4$f;,
        Lja4$g;,
        Lja4$h;,
        Lja4$i;
    }
.end annotation


# static fields
.field public static a:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lja4;->a:Ljava/util/Map;

    sget-object v1, LBD3;->X:LN;

    new-instance v2, Lja4$e;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lja4$e;-><init>(Lja4$a;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lja4;->a:Ljava/util/Map;

    sget-object v1, LBD3;->Y:LN;

    new-instance v2, Lja4$e;

    invoke-direct {v2, v3}, Lja4$e;-><init>(Lja4$a;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lja4;->a:Ljava/util/Map;

    sget-object v1, LBD3;->r:LN;

    new-instance v2, Lja4$f;

    invoke-direct {v2, v3}, Lja4$f;-><init>(Lja4$a;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lja4;->a:Ljava/util/Map;

    sget-object v1, LBD3;->v:LN;

    new-instance v2, Lja4$d;

    invoke-direct {v2, v3}, Lja4$d;-><init>(Lja4$a;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lja4;->a:Ljava/util/Map;

    sget-object v1, LBD3;->w:LN;

    new-instance v2, Lja4$h;

    invoke-direct {v2, v3}, Lja4$h;-><init>(Lja4$a;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lja4;->a:Ljava/util/Map;

    sget-object v1, LBD3;->F:LN;

    new-instance v2, Lja4$i;

    invoke-direct {v2, v3}, Lja4$i;-><init>(Lja4$a;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lja4;->a:Ljava/util/Map;

    sget-object v1, Lfa2;->a:LN;

    new-instance v2, Lja4$h;

    invoke-direct {v2, v3}, Lja4$h;-><init>(Lja4$a;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lja4;->a:Ljava/util/Map;

    sget-object v1, Lfa2;->b:LN;

    new-instance v2, Lja4$i;

    invoke-direct {v2, v3}, Lja4$i;-><init>(Lja4$a;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lja4;->a:Ljava/util/Map;

    sget-object v1, LyD3;->I0:LN;

    new-instance v2, Lja4$b;

    invoke-direct {v2, v3}, Lja4$b;-><init>(Lja4$a;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lja4;->a:Ljava/util/Map;

    sget-object v1, LBD3;->n:LN;

    new-instance v2, Lja4$c;

    invoke-direct {v2, v3}, Lja4$c;-><init>(Lja4$a;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LcT5;)Lcp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lja4;->b(LcT5;Ljava/lang/Object;)Lcp;

    move-result-object p0

    return-object p0
.end method

.method public static b(LcT5;Ljava/lang/Object;)Lcp;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LcT5;->j()LG9;

    move-result-object v0

    sget-object v1, Lja4;->a:Ljava/util/Map;

    invoke-virtual {v0}, LG9;->j()LN;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lja4$g;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p0, p1}, Lja4$g;->a(LcT5;Ljava/lang/Object;)Lcp;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "algorithm identifier in public key not recognised: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LG9;->j()LN;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
