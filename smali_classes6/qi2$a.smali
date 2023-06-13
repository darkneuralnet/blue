.class public Lqi2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHS0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqi2;->i()LHS0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lqi2;


# direct methods
.method public constructor <init>(Lqi2;)V
    .locals 0

    iput-object p1, p0, Lqi2$a;->a:Lqi2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/io/Writer;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v6, LBj2;

    iget-object v0, p0, Lqi2$a;->a:Lqi2;

    invoke-static {v0}, Lqi2;->e(Lqi2;)Ljava/util/Map;

    move-result-object v2

    iget-object v0, p0, Lqi2$a;->a:Lqi2;

    invoke-static {v0}, Lqi2;->f(Lqi2;)Ljava/util/Map;

    move-result-object v3

    iget-object v0, p0, Lqi2$a;->a:Lqi2;

    invoke-static {v0}, Lqi2;->g(Lqi2;)LOd3;

    move-result-object v4

    iget-object v0, p0, Lqi2$a;->a:Lqi2;

    invoke-static {v0}, Lqi2;->h(Lqi2;)Z

    move-result v5

    move-object v0, v6

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, LBj2;-><init>(Ljava/io/Writer;Ljava/util/Map;Ljava/util/Map;LOd3;Z)V

    const/4 p2, 0x0

    invoke-virtual {v6, p1, p2}, LBj2;->i(Ljava/lang/Object;Z)LBj2;

    invoke-virtual {v6}, LBj2;->r()V

    return-void
.end method

.method public encode(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1, v0}, Lqi2$a;->a(Ljava/lang/Object;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
