.class public LMH6;
.super LM;
.source "SourceFile"


# instance fields
.field public final b:[B

.field public final c:[B


# direct methods
.method public constructor <init>([B[B)V
    .locals 0

    invoke-direct {p0}, LM;-><init>()V

    invoke-static {p1}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LMH6;->b:[B

    invoke-static {p2}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, LMH6;->c:[B

    return-void
.end method


# virtual methods
.method public c()LS;
    .locals 4

    new-instance v0, LF;

    invoke-direct {v0}, LF;-><init>()V

    new-instance v1, LK;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, LK;-><init>(J)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LVF0;

    iget-object v2, p0, LMH6;->b:[B

    invoke-direct {v1, v2}, LVF0;-><init>([B)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LVF0;

    iget-object v2, p0, LMH6;->c:[B

    invoke-direct {v1, v2}, LVF0;-><init>([B)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LZF0;

    invoke-direct {v1, v0}, LZF0;-><init>(LF;)V

    return-object v1
.end method
