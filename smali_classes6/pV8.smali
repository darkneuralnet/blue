.class public final LpV8;
.super LeV8;
.source "SourceFile"


# instance fields
.field public final a:LAV8;

.field public final synthetic b:LLV8;


# direct methods
.method public constructor <init>(LLV8;I)V
    .locals 0

    iput-object p1, p0, LpV8;->b:LLV8;

    invoke-direct {p0}, LeV8;-><init>()V

    new-instance p1, LAV8;

    invoke-direct {p1, p2}, LAV8;-><init>(I)V

    iput-object p1, p0, LpV8;->a:LAV8;

    return-void
.end method


# virtual methods
.method public final a([BII)LWW8;
    .locals 1

    iget-object p2, p0, LpV8;->a:LAV8;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0, p3}, Ljava/io/OutputStream;->write([BII)V

    return-object p0
.end method

.method public final zzd()LAW8;
    .locals 4

    iget-object v0, p0, LpV8;->b:LLV8;

    iget-object v1, p0, LpV8;->a:LAV8;

    invoke-virtual {v1}, LAV8;->b()[B

    move-result-object v1

    iget-object v2, p0, LpV8;->a:LAV8;

    invoke-virtual {v2}, LAV8;->a()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, LTU8;->c([BII)LAW8;

    move-result-object v0

    return-object v0
.end method
