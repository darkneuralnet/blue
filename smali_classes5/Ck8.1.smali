.class public LCk8;
.super LQl8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<M:",
        "LCk8<",
        "TM;>;>",
        "LQl8;"
    }
.end annotation


# instance fields
.field public c:Lcl8;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LQl8;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LCk8;->j()LCk8;

    move-result-object v0

    return-object v0
.end method

.method public d(Lck8;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LCk8;->c:Lcl8;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LCk8;->c:Lcl8;

    invoke-virtual {v1}, Lcl8;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LCk8;->c:Lcl8;

    invoke-virtual {v1, v0}, Lcl8;->e(I)Lol8;

    move-result-object v1

    invoke-virtual {v1, p1}, Lol8;->e(Lck8;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public g()I
    .locals 3

    iget-object v0, p0, LCk8;->c:Lcl8;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iget-object v2, p0, LCk8;->c:Lcl8;

    invoke-virtual {v2}, Lcl8;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, LCk8;->c:Lcl8;

    invoke-virtual {v2, v0}, Lcl8;->e(I)Lol8;

    move-result-object v2

    invoke-virtual {v2}, Lol8;->f()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public synthetic h()LQl8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LQl8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCk8;

    return-object v0
.end method

.method public j()LCk8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TM;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-super {p0}, LQl8;->h()LQl8;

    move-result-object v0

    check-cast v0, LCk8;

    invoke-static {p0, v0}, LDl8;->h(LCk8;LCk8;)V

    return-object v0
.end method
