.class public LHg2;
.super Ljava/util/ArrayList;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements LKg2;
.implements LSg2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/util/List<",
        "Ljava/lang/Object;",
        ">;",
        "LKg2;",
        "LSg2;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x7e6226d42d49fb00L


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public static o(Ljava/util/List;LTg2;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "LTg2;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :try_start_0
    invoke-static {p0, v0, p1}, LHg2;->w(Ljava/lang/Iterable;Ljava/lang/Appendable;LTg2;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static w(Ljava/lang/Iterable;Ljava/lang/Appendable;LTg2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Appendable;",
            "LTg2;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p0, :cond_0

    const-string p0, "null"

    invoke-interface {p1, p0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void

    :cond_0
    sget-object v0, LCj2;->g:LEj2;

    invoke-interface {v0, p0, p1, p2}, LEj2;->a(Ljava/lang/Object;Ljava/lang/Appendable;LTg2;)V

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/Appendable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LVg2;->a:LTg2;

    invoke-static {p0, p1, v0}, LHg2;->w(Ljava/lang/Iterable;Ljava/lang/Appendable;LTg2;)V

    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    sget-object v0, LVg2;->a:LTg2;

    invoke-static {p0, v0}, LHg2;->o(Ljava/util/List;LTg2;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/Appendable;LTg2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p0, p1, p2}, LHg2;->w(Ljava/lang/Iterable;Ljava/lang/Appendable;LTg2;)V

    return-void
.end method

.method public j(LTg2;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LHg2;->o(Ljava/util/List;LTg2;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LHg2;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
