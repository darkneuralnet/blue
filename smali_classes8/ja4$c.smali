.class public Lja4$c;
.super Lja4$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lja4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
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

    invoke-direct {p0}, Lja4$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LcT5;Ljava/lang/Object;)Lcp;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, LcT5;->u()LS;

    move-result-object p1

    invoke-static {p1}, LlO2;->s(Ljava/lang/Object;)LlO2;

    move-result-object p1

    new-instance p2, LmO2;

    invoke-virtual {p1}, LlO2;->u()I

    move-result v0

    invoke-virtual {p1}, LlO2;->v()I

    move-result v1

    invoke-virtual {p1}, LlO2;->o()LOA1;

    move-result-object v2

    invoke-virtual {p1}, LlO2;->j()LG9;

    move-result-object p1

    invoke-virtual {p1}, LG9;->j()LN;

    move-result-object p1

    invoke-static {p1}, LHi6;->c(LN;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, v0, v1, v2, p1}, LmO2;-><init>(IILOA1;Ljava/lang/String;)V

    return-object p2
.end method
