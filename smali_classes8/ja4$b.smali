.class public Lja4$b;
.super Lja4$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lja4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
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

    invoke-direct {p0}, Lja4$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LcT5;Ljava/lang/Object;)Lcp;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, LcT5;->u()LS;

    move-result-object p1

    invoke-static {p1}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object p1

    invoke-virtual {p1}, LO;->C()[B

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, LDD3;->a([BI)I

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x4

    if-ne p2, v0, :cond_0

    array-length p2, p1

    invoke-static {p1, v1, p2}, LAo;->h([BII)[B

    move-result-object p1

    invoke-static {p1}, LLl2;->a(Ljava/lang/Object;)LLl2;

    move-result-object p1

    return-object p1

    :cond_0
    array-length p2, p1

    const/16 v0, 0x40

    if-ne p2, v0, :cond_1

    array-length p2, p1

    invoke-static {p1, v1, p2}, LAo;->h([BII)[B

    move-result-object p1

    :cond_1
    invoke-static {p1}, LDE1;->a(Ljava/lang/Object;)LDE1;

    move-result-object p1

    return-object p1
.end method
