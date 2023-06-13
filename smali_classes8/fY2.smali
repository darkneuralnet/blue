.class public LfY2;
.super Lcp;
.source "SourceFile"


# instance fields
.field public final c:[S


# direct methods
.method public constructor <init>([S)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcp;-><init>(Z)V

    invoke-static {p1}, LAo;->e([S)[S

    move-result-object p1

    iput-object p1, p0, LfY2;->c:[S

    return-void
.end method


# virtual methods
.method public a()[S
    .locals 1

    iget-object v0, p0, LfY2;->c:[S

    invoke-static {v0}, LAo;->e([S)[S

    move-result-object v0

    return-object v0
.end method
