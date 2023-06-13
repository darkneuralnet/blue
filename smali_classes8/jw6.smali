.class public Ljw6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static g:LFB0;


# instance fields
.field public a:LbC1;

.field public b:LFB0;

.field public c:LeZ3;

.field public d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, LAB0;->d()LAB0;

    move-result-object v0

    sput-object v0, Ljw6;->g:LFB0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, LbC1;

    invoke-direct {v0}, LbC1;-><init>()V

    invoke-direct {p0, v0}, Ljw6;-><init>(LbC1;)V

    return-void
.end method

.method public constructor <init>(LbC1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ljw6;->d:Z

    iput-boolean v0, p0, Ljw6;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Ljw6;->f:Z

    iput-object p1, p0, Ljw6;->a:LbC1;

    invoke-virtual {p1}, LbC1;->z()LFB0;

    move-result-object v0

    iput-object v0, p0, Ljw6;->b:LFB0;

    invoke-virtual {p1}, LbC1;->B()LeZ3;

    move-result-object p1

    iput-object p1, p0, Ljw6;->c:LeZ3;

    return-void
.end method

.method public static H(Ljava/io/StreamTokenizer;)Ljava/lang/String;
    .locals 3

    iget v0, p0, Ljava/io/StreamTokenizer;->ttype:I

    const/4 v1, -0x3

    const-string v2, "\'"

    if-eq v0, v1, :cond_3

    const/4 v1, -0x2

    if-eq v0, v1, :cond_2

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Ljava/io/StreamTokenizer;->ttype:I

    int-to-char p0, p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "End-of-Line"

    return-object p0

    :cond_1
    const-string p0, "End-of-Stream"

    return-object p0

    :cond_2
    const-string p0, "<NUMBER>"

    return-object p0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Ljava/io/StreamTokenizer;->sval:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/io/Reader;)Ljava/io/StreamTokenizer;
    .locals 2

    new-instance v0, Ljava/io/StreamTokenizer;

    invoke-direct {v0, p0}, Ljava/io/StreamTokenizer;-><init>(Ljava/io/Reader;)V

    invoke-virtual {v0}, Ljava/io/StreamTokenizer;->resetSyntax()V

    const/16 p0, 0x61

    const/16 v1, 0x7a

    invoke-virtual {v0, p0, v1}, Ljava/io/StreamTokenizer;->wordChars(II)V

    const/16 p0, 0x41

    const/16 v1, 0x5a

    invoke-virtual {v0, p0, v1}, Ljava/io/StreamTokenizer;->wordChars(II)V

    const/16 p0, 0xa0

    const/16 v1, 0xff

    invoke-virtual {v0, p0, v1}, Ljava/io/StreamTokenizer;->wordChars(II)V

    const/16 p0, 0x30

    const/16 v1, 0x39

    invoke-virtual {v0, p0, v1}, Ljava/io/StreamTokenizer;->wordChars(II)V

    const/16 p0, 0x2d

    invoke-virtual {v0, p0, p0}, Ljava/io/StreamTokenizer;->wordChars(II)V

    const/16 p0, 0x2b

    invoke-virtual {v0, p0, p0}, Ljava/io/StreamTokenizer;->wordChars(II)V

    const/16 p0, 0x2e

    invoke-virtual {v0, p0, p0}, Ljava/io/StreamTokenizer;->wordChars(II)V

    const/4 p0, 0x0

    const/16 v1, 0x20

    invoke-virtual {v0, p0, v1}, Ljava/io/StreamTokenizer;->whitespaceChars(II)V

    const/16 p0, 0x23

    invoke-virtual {v0, p0}, Ljava/io/StreamTokenizer;->commentChar(I)V

    return-object v0
.end method

.method public static d(Ljava/util/List;IZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LyB0;",
            ">;IZ)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p0}, Ljw6;->n(Ljava/util/List;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LyB0;

    invoke-virtual {p2}, LyB0;->e()LyB0;

    move-result-object p2

    invoke-interface {p0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    if-ge p2, p1, :cond_2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LyB0;

    invoke-virtual {p2}, LyB0;->e()LyB0;

    move-result-object p2

    invoke-interface {p0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static i(Ljava/io/StreamTokenizer;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-static {p0}, Ljw6;->m(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, ", or )"

    invoke-static {p0, v0}, Ljw6;->s(Ljava/io/StreamTokenizer;Ljava/lang/String;)Lorg/locationtech/jts/io/ParseException;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static j(Ljava/io/StreamTokenizer;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-static {p0}, Ljw6;->m(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Z"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Ljw6;->m(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v1, "M"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p0}, Ljw6;->m(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v1, "ZM"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p0}, Ljw6;->m(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    :goto_0
    const-string v1, "EMPTY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "EMPTY or ("

    invoke-static {p0, v0}, Ljw6;->s(Ljava/io/StreamTokenizer;Ljava/lang/String;)Lorg/locationtech/jts/io/ParseException;

    move-result-object p0

    throw p0

    :cond_4
    :goto_1
    return-object v0
.end method

.method public static l(Ljava/io/StreamTokenizer;)Ljava/util/EnumSet;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/StreamTokenizer;",
            ")",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    sget-object v0, LAy3;->b:LAy3;

    sget-object v1, LAy3;->c:LAy3;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {p0}, Ljw6;->r(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Z"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/io/StreamTokenizer;->nextToken()I

    sget-object p0, LAy3;->d:LAy3;

    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v2, "M"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava/io/StreamTokenizer;->nextToken()I

    sget-object p0, LAy3;->e:LAy3;

    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-string v2, "ZM"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Ljava/io/StreamTokenizer;->nextToken()I

    sget-object p0, LAy3;->d:LAy3;

    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    sget-object p0, LAy3;->e:LAy3;

    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static m(Ljava/io/StreamTokenizer;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-virtual {p0}, Ljava/io/StreamTokenizer;->nextToken()I

    move-result v0

    const/4 v1, -0x3

    if-eq v0, v1, :cond_3

    const/16 v1, 0x2c

    if-eq v0, v1, :cond_2

    const/16 v1, 0x28

    if-eq v0, v1, :cond_1

    const/16 v1, 0x29

    if-ne v0, v1, :cond_0

    const-string p0, ")"

    return-object p0

    :cond_0
    const-string v0, "word"

    invoke-static {p0, v0}, Ljw6;->s(Ljava/io/StreamTokenizer;Ljava/lang/String;)Lorg/locationtech/jts/io/ParseException;

    move-result-object p0

    throw p0

    :cond_1
    const-string p0, "("

    return-object p0

    :cond_2
    const-string p0, ","

    return-object p0

    :cond_3
    iget-object p0, p0, Ljava/io/StreamTokenizer;->sval:Ljava/lang/String;

    const-string v0, "EMPTY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    return-object v0

    :cond_4
    return-object p0
.end method

.method public static n(Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LyB0;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LyB0;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LyB0;

    invoke-virtual {v0, p0}, LyB0;->g(LyB0;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    return v2
.end method

.method public static o(Ljava/io/StreamTokenizer;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ljava/io/StreamTokenizer;->nextToken()I

    move-result v0

    invoke-virtual {p0}, Ljava/io/StreamTokenizer;->pushBack()V

    const/4 p0, -0x3

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static p(Ljava/io/StreamTokenizer;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ljava/io/StreamTokenizer;->nextToken()I

    move-result v0

    invoke-virtual {p0}, Ljava/io/StreamTokenizer;->pushBack()V

    const/16 p0, 0x28

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static r(Ljava/io/StreamTokenizer;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-static {p0}, Ljw6;->m(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/StreamTokenizer;->pushBack()V

    return-object v0
.end method

.method public static s(Ljava/io/StreamTokenizer;Ljava/lang/String;)Lorg/locationtech/jts/io/ParseException;
    .locals 3

    iget v0, p0, Ljava/io/StreamTokenizer;->ttype:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    const-string v0, "Unexpected NUMBER token"

    invoke-static {v0}, LKo;->f(Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Ljava/io/StreamTokenizer;->ttype:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    const-string v0, "Unexpected EOL token"

    invoke-static {v0}, LKo;->f(Ljava/lang/String;)V

    :cond_1
    invoke-static {p0}, Ljw6;->H(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " but found "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Ljw6;->t(Ljava/io/StreamTokenizer;Ljava/lang/String;)Lorg/locationtech/jts/io/ParseException;

    move-result-object p0

    return-object p0
.end method

.method public static t(Ljava/io/StreamTokenizer;Ljava/lang/String;)Lorg/locationtech/jts/io/ParseException;
    .locals 2

    new-instance v0, Lorg/locationtech/jts/io/ParseException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " (line "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/io/StreamTokenizer;->lineno()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/locationtech/jts/io/ParseException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final A(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LKr2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/StreamTokenizer;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;)",
            "LKr2;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    iget-object v0, p0, Ljw6;->a:LbC1;

    const/4 v1, 0x3

    const/4 v2, 0x1

    invoke-virtual {p0, p1, p2, v1, v2}, Ljw6;->f(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;IZ)LEB0;

    move-result-object p1

    invoke-virtual {v0, p1}, LbC1;->i(LEB0;)LKr2;

    move-result-object p1

    return-object p1
.end method

.method public final B(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LDW2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/StreamTokenizer;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;)",
            "LDW2;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-static {p1}, Ljw6;->j(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "EMPTY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ljw6;->a:LbC1;

    invoke-virtual {p1}, LbC1;->k()LDW2;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    invoke-virtual {p0, p1, p2}, Ljw6;->z(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LBr2;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Ljw6;->i(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [LBr2;

    iget-object p2, p0, Ljw6;->a:LbC1;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LBr2;

    invoke-virtual {p2, p1}, LbC1;->l([LBr2;)LDW2;

    move-result-object p1

    return-object p1
.end method

.method public final C(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LVW2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/StreamTokenizer;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;)",
            "LVW2;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-static {p1}, Ljw6;->j(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "EMPTY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ljw6;->a:LbC1;

    const/4 p2, 0x0

    new-array p2, p2, [LFW3;

    invoke-virtual {p1, p2}, LbC1;->o([LFW3;)LVW2;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v0, p0, Ljw6;->e:Z

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljw6;->r(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "("

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Ljw6;->a:LbC1;

    invoke-virtual {p0, p1, p2}, Ljw6;->g(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LEB0;

    move-result-object p1

    invoke-virtual {v0, p1}, LbC1;->n(LEB0;)LVW2;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1, p2}, Ljw6;->E(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LFW3;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Ljw6;->i(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1, p2}, Ljw6;->E(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LFW3;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Ljw6;->i(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [LFW3;

    iget-object p2, p0, Ljw6;->a:LbC1;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LFW3;

    invoke-virtual {p2, p1}, LbC1;->o([LFW3;)LVW2;

    move-result-object p1

    return-object p1
.end method

.method public final D(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LWW2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/StreamTokenizer;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;)",
            "LWW2;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-static {p1}, Ljw6;->j(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "EMPTY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ljw6;->a:LbC1;

    invoke-virtual {p1}, LbC1;->q()LWW2;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    invoke-virtual {p0, p1, p2}, Ljw6;->F(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LCX3;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Ljw6;->i(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [LCX3;

    iget-object p2, p0, Ljw6;->a:LbC1;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LCX3;

    invoke-virtual {p2, p1}, LbC1;->r([LCX3;)LWW2;

    move-result-object p1

    return-object p1
.end method

.method public final E(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LFW3;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/StreamTokenizer;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;)",
            "LFW3;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    iget-object v0, p0, Ljw6;->a:LbC1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, p2, v1, v2}, Ljw6;->f(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;IZ)LEB0;

    move-result-object p1

    invoke-virtual {v0, p1}, LbC1;->u(LEB0;)LFW3;

    move-result-object p1

    return-object p1
.end method

.method public final F(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LCX3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/StreamTokenizer;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;)",
            "LCX3;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-static {p1}, Ljw6;->j(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "EMPTY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ljw6;->a:LbC1;

    invoke-virtual {p0, p2}, Ljw6;->b(Ljava/util/EnumSet;)LEB0;

    move-result-object p2

    invoke-virtual {p1, p2}, LbC1;->w(LEB0;)LCX3;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1, p2}, Ljw6;->A(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LKr2;

    move-result-object v1

    invoke-static {p1}, Ljw6;->i(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v2

    :goto_0
    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1, p2}, Ljw6;->A(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LKr2;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Ljw6;->i(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [LKr2;

    iget-object p2, p0, Ljw6;->a:LbC1;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LKr2;

    invoke-virtual {p2, v1, p1}, LbC1;->y(LKr2;[LKr2;)LCX3;

    move-result-object p1

    return-object p1
.end method

.method public final G(Ljava/util/EnumSet;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;)I"
        }
    .end annotation

    sget-object v0, LAy3;->d:LAy3;

    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    sget-object v2, LAy3;->e:LAy3;

    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    add-int/lit8 v0, v0, 0x1

    :cond_1
    if-ne v0, v1, :cond_2

    iget-boolean p1, p0, Ljw6;->d:Z

    if-eqz p1, :cond_2

    add-int/lit8 v0, v0, 0x1

    :cond_2
    return v0
.end method

.method public final a(Ljava/util/EnumSet;)LyB0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;)",
            "LyB0;"
        }
    .end annotation

    sget-object v0, LAy3;->d:LAy3;

    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    sget-object v1, LAy3;->e:LAy3;

    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    new-instance p1, LKB0;

    invoke-direct {p1}, LKB0;-><init>()V

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    new-instance p1, LJB0;

    invoke-direct {p1}, LJB0;-><init>()V

    return-object p1

    :cond_1
    if-nez v0, :cond_3

    iget-boolean p1, p0, Ljw6;->d:Z

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, LIB0;

    invoke-direct {p1}, LIB0;-><init>()V

    return-object p1

    :cond_3
    :goto_0
    new-instance p1, LyB0;

    invoke-direct {p1}, LyB0;-><init>()V

    return-object p1
.end method

.method public final b(Ljava/util/EnumSet;)LEB0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;)",
            "LEB0;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    iget-object v0, p0, Ljw6;->b:LFB0;

    invoke-virtual {p0, p1}, Ljw6;->G(Ljava/util/EnumSet;)I

    move-result v1

    sget-object v2, LAy3;->e:LAy3;

    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1, p1}, LFB0;->a(III)LEB0;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;Z)LyB0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/StreamTokenizer;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;Z)",
            "LyB0;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    invoke-static {p1}, Ljw6;->p(Ljava/io/StreamTokenizer;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Ljava/io/StreamTokenizer;->nextToken()I

    move p3, v0

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    sget-object v2, LAy3;->d:LAy3;

    invoke-virtual {p2, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p0, p2}, Ljw6;->a(Ljava/util/EnumSet;)LyB0;

    move-result-object v4

    iget-object v5, p0, Ljw6;->c:LeZ3;

    invoke-virtual {p0, p1}, Ljw6;->k(Ljava/io/StreamTokenizer;)D

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, LeZ3;->e(D)D

    move-result-wide v5

    invoke-virtual {v4, v1, v5, v6}, LyB0;->p(ID)V

    iget-object v1, p0, Ljw6;->c:LeZ3;

    invoke-virtual {p0, p1}, Ljw6;->k(Ljava/io/StreamTokenizer;)D

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, LeZ3;->e(D)D

    move-result-wide v5

    invoke-virtual {v4, v0, v5, v6}, LyB0;->p(ID)V

    invoke-virtual {p2, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Ljw6;->k(Ljava/io/StreamTokenizer;)D

    move-result-wide v5

    invoke-virtual {v4, v1, v5, v6}, LyB0;->p(ID)V

    :cond_1
    sget-object v0, LAy3;->e:LAy3;

    invoke-virtual {p2, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    add-int/2addr v3, v1

    invoke-virtual {p0, p1}, Ljw6;->k(Ljava/io/StreamTokenizer;)D

    move-result-wide v5

    invoke-virtual {v4, v3, v5, v6}, LyB0;->p(ID)V

    :cond_2
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    if-ne p2, v1, :cond_3

    iget-boolean p2, p0, Ljw6;->d:Z

    if-eqz p2, :cond_3

    invoke-static {p1}, Ljw6;->o(Ljava/io/StreamTokenizer;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0, p1}, Ljw6;->k(Ljava/io/StreamTokenizer;)D

    move-result-wide v2

    invoke-virtual {v4, v1, v2, v3}, LyB0;->p(ID)V

    :cond_3
    if-eqz p3, :cond_4

    invoke-virtual {p0, p1}, Ljw6;->h(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    :cond_4
    return-object v4
.end method

.method public final f(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;IZ)LEB0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/StreamTokenizer;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;IZ)",
            "LEB0;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-static {p1}, Ljw6;->j(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "EMPTY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Ljw6;->b(Ljava/util/EnumSet;)LEB0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v1}, Ljw6;->e(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;Z)LyB0;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Ljw6;->i(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-boolean p1, p0, Ljw6;->f:Z

    if-eqz p1, :cond_2

    invoke-static {v0, p3, p4}, Ljw6;->d(Ljava/util/List;IZ)V

    :cond_2
    new-array p1, v1, [LyB0;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LyB0;

    iget-object p2, p0, Ljw6;->b:LFB0;

    invoke-interface {p2, p1}, LFB0;->c([LyB0;)LEB0;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LEB0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/StreamTokenizer;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;)",
            "LEB0;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p0, p1, p2, v1}, Ljw6;->e(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;Z)LyB0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Ljw6;->i(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [LyB0;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LyB0;

    iget-object p2, p0, Ljw6;->b:LFB0;

    invoke-interface {p2, p1}, LFB0;->c([LyB0;)LEB0;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/io/StreamTokenizer;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-static {p1}, Ljw6;->m(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    invoke-static {p1, v1}, Ljw6;->s(Ljava/io/StreamTokenizer;Ljava/lang/String;)Lorg/locationtech/jts/io/ParseException;

    move-result-object p1

    throw p1
.end method

.method public final k(Ljava/io/StreamTokenizer;)D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/io/StreamTokenizer;->nextToken()I

    move-result v0

    const/4 v1, -0x3

    if-ne v0, v1, :cond_1

    iget-object v0, p1, Ljava/io/StreamTokenizer;->sval:Ljava/lang/String;

    const-string v1, "NaN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    return-wide v0

    :cond_0
    :try_start_0
    iget-object v0, p1, Ljava/io/StreamTokenizer;->sval:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid number: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Ljava/io/StreamTokenizer;->sval:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ljw6;->t(Ljava/io/StreamTokenizer;Ljava/lang/String;)Lorg/locationtech/jts/io/ParseException;

    move-result-object p1

    throw p1

    :cond_1
    const-string v0, "number"

    invoke-static {p1, v0}, Ljw6;->s(Ljava/io/StreamTokenizer;Ljava/lang/String;)Lorg/locationtech/jts/io/ParseException;

    move-result-object p1

    throw p1
.end method

.method public final q(Ljava/io/StreamTokenizer;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-virtual {p2, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-gt v0, v2, :cond_2

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Z"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "M"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ZM"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    :cond_1
    move v1, v3

    :cond_2
    if-eqz v1, :cond_3

    return v3

    :cond_3
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid dimension modifiers: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ljw6;->t(Ljava/io/StreamTokenizer;Ljava/lang/String;)Lorg/locationtech/jts/io/ParseException;

    move-result-object p1

    throw p1
.end method

.method public u(Ljava/io/Reader;)LWB1;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-static {p1}, Ljw6;->c(Ljava/io/Reader;)Ljava/io/StreamTokenizer;

    move-result-object p1

    :try_start_0
    invoke-virtual {p0, p1}, Ljw6;->x(Ljava/io/StreamTokenizer;)LWB1;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lorg/locationtech/jts/io/ParseException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/locationtech/jts/io/ParseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public v(Ljava/lang/String;)LWB1;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, v0}, Ljw6;->u(Ljava/io/Reader;)LWB1;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/io/StringReader;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/io/StringReader;->close()V

    throw p1
.end method

.method public final w(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LXB1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/StreamTokenizer;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;)",
            "LXB1;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-static {p1}, Ljw6;->j(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "EMPTY"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Ljw6;->a:LbC1;

    invoke-virtual {p1}, LbC1;->c()LXB1;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    invoke-virtual {p0, p1}, Ljw6;->x(Ljava/io/StreamTokenizer;)LWB1;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Ljw6;->i(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [LWB1;

    iget-object v0, p0, Ljw6;->a:LbC1;

    invoke-interface {p2, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LWB1;

    invoke-virtual {v0, p1}, LbC1;->d([LWB1;)LXB1;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/io/StreamTokenizer;)LWB1;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    sget-object v0, LAy3;->b:LAy3;

    sget-object v1, LAy3;->c:LAy3;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {p1}, Ljw6;->m(Ljava/io/StreamTokenizer;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ZM"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, LAy3;->d:LAy3;

    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    sget-object v2, LAy3;->e:LAy3;

    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v2, "Z"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, LAy3;->d:LAy3;

    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-string v2, "M"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, LAy3;->e:LAy3;

    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    invoke-virtual {p0, p1, v1, v0}, Ljw6;->y(Ljava/io/StreamTokenizer;Ljava/lang/String;Ljava/util/EnumSet;)LWB1;

    move-result-object p1

    return-object p1
.end method

.method public final y(Ljava/io/StreamTokenizer;Ljava/lang/String;Ljava/util/EnumSet;)LWB1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/StreamTokenizer;",
            "Ljava/lang/String;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;)",
            "LWB1;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Ljw6;->l(Ljava/io/StreamTokenizer;)Ljava/util/EnumSet;

    move-result-object p3

    :cond_0
    :try_start_0
    iget-object v0, p0, Ljw6;->b:LFB0;

    invoke-virtual {p0, p3}, Ljw6;->G(Ljava/util/EnumSet;)I

    move-result v1

    sget-object v2, LAy3;->e:LAy3;

    invoke-virtual {p3, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    invoke-interface {v0, v3, v1, v2}, LFB0;->a(III)LEB0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    new-instance v0, LbC1;

    iget-object v1, p0, Ljw6;->a:LbC1;

    invoke-virtual {v1}, LbC1;->B()LeZ3;

    move-result-object v1

    iget-object v2, p0, Ljw6;->a:LbC1;

    invoke-virtual {v2}, LbC1;->C()I

    move-result v2

    sget-object v3, Ljw6;->g:LFB0;

    invoke-direct {v0, v1, v2, v3}, LbC1;-><init>(LeZ3;ILFB0;)V

    iput-object v0, p0, Ljw6;->a:LbC1;

    :goto_1
    const-string v0, "POINT"

    invoke-virtual {p0, p1, p2, v0}, Ljw6;->q(Ljava/io/StreamTokenizer;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1, p3}, Ljw6;->E(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LFW3;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v0, "LINESTRING"

    invoke-virtual {p0, p1, p2, v0}, Ljw6;->q(Ljava/io/StreamTokenizer;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1, p3}, Ljw6;->z(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LBr2;

    move-result-object p1

    return-object p1

    :cond_3
    const-string v0, "LINEARRING"

    invoke-virtual {p0, p1, p2, v0}, Ljw6;->q(Ljava/io/StreamTokenizer;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, p1, p3}, Ljw6;->A(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LKr2;

    move-result-object p1

    return-object p1

    :cond_4
    const-string v0, "POLYGON"

    invoke-virtual {p0, p1, p2, v0}, Ljw6;->q(Ljava/io/StreamTokenizer;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0, p1, p3}, Ljw6;->F(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LCX3;

    move-result-object p1

    return-object p1

    :cond_5
    const-string v0, "MULTIPOINT"

    invoke-virtual {p0, p1, p2, v0}, Ljw6;->q(Ljava/io/StreamTokenizer;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0, p1, p3}, Ljw6;->C(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LVW2;

    move-result-object p1

    return-object p1

    :cond_6
    const-string v0, "MULTILINESTRING"

    invoke-virtual {p0, p1, p2, v0}, Ljw6;->q(Ljava/io/StreamTokenizer;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0, p1, p3}, Ljw6;->B(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LDW2;

    move-result-object p1

    return-object p1

    :cond_7
    const-string v0, "MULTIPOLYGON"

    invoke-virtual {p0, p1, p2, v0}, Ljw6;->q(Ljava/io/StreamTokenizer;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0, p1, p3}, Ljw6;->D(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LWW2;

    move-result-object p1

    return-object p1

    :cond_8
    const-string v0, "GEOMETRYCOLLECTION"

    invoke-virtual {p0, p1, p2, v0}, Ljw6;->q(Ljava/io/StreamTokenizer;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0, p1, p3}, Ljw6;->w(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LXB1;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown geometry type: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ljw6;->t(Ljava/io/StreamTokenizer;Ljava/lang/String;)Lorg/locationtech/jts/io/ParseException;

    move-result-object p1

    throw p1
.end method

.method public final z(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;)LBr2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/StreamTokenizer;",
            "Ljava/util/EnumSet<",
            "LAy3;",
            ">;)",
            "LBr2;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/locationtech/jts/io/ParseException;
        }
    .end annotation

    iget-object v0, p0, Ljw6;->a:LbC1;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {p0, p1, p2, v1, v2}, Ljw6;->f(Ljava/io/StreamTokenizer;Ljava/util/EnumSet;IZ)LEB0;

    move-result-object p1

    invoke-virtual {v0, p1}, LbC1;->f(LEB0;)LBr2;

    move-result-object p1

    return-object p1
.end method
