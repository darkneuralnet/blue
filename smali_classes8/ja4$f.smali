.class public Lja4$f;
.super Lja4$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lja4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lja4$g;-><init>(Lja4$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lja4$a;)V
    .locals 0

    invoke-direct {p0}, Lja4$f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LcT5;Ljava/lang/Object;)Lcp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance p2, Lvg5;

    invoke-virtual {p1}, LcT5;->s()LMF0;

    move-result-object v0

    invoke-virtual {v0}, LC;->A()[B

    move-result-object v0

    invoke-virtual {p1}, LcT5;->j()LG9;

    move-result-object p1

    invoke-virtual {p1}, LG9;->s()LE;

    move-result-object p1

    invoke-static {p1}, Lsg5;->j(Ljava/lang/Object;)Lsg5;

    move-result-object p1

    invoke-static {p1}, LHi6;->g(Lsg5;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Lvg5;-><init>([BLjava/lang/String;)V

    return-object p2
.end method
