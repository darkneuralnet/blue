.class public LZE2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVE2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZE2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:LJ24;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJ24<",
            "LVE2;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LyV2$a;

.field public final c:LyV2$a;


# direct methods
.method public constructor <init>(LJ24;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJ24<",
            "LVE2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZE2$b;->a:LJ24;

    invoke-virtual {p1}, LJ24;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LwX2;->b()LwX2;

    move-result-object v0

    invoke-virtual {v0}, LwX2;->a()LyV2;

    move-result-object v0

    invoke-static {p1}, LAV2;->a(LJ24;)LzV2;

    move-result-object p1

    const-string v1, "compute"

    const-string v2, "mac"

    invoke-interface {v0, p1, v2, v1}, LyV2;->a(LzV2;Ljava/lang/String;Ljava/lang/String;)LyV2$a;

    move-result-object v1

    iput-object v1, p0, LZE2$b;->b:LyV2$a;

    const-string v1, "verify"

    invoke-interface {v0, p1, v2, v1}, LyV2;->a(LzV2;Ljava/lang/String;Ljava/lang/String;)LyV2$a;

    move-result-object p1

    iput-object p1, p0, LZE2$b;->c:LyV2$a;

    goto :goto_0

    :cond_0
    sget-object p1, LAV2;->a:LyV2$a;

    iput-object p1, p0, LZE2$b;->b:LyV2$a;

    iput-object p1, p0, LZE2$b;->c:LyV2$a;

    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(LJ24;LZE2$a;)V
    .locals 0

    invoke-direct {p0, p1}, LZE2$b;-><init>(LJ24;)V

    return-void
.end method


# virtual methods
.method public a([B[B)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    array-length v0, p1

    const/4 v1, 0x5

    if-le v0, v1, :cond_3

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    array-length v2, p1

    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    iget-object v2, p0, LZE2$b;->a:LJ24;

    invoke-virtual {v2, v0}, LJ24;->f([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJ24$c;

    invoke-virtual {v2}, LJ24$c;->d()LeA3;

    move-result-object v3

    sget-object v4, LeA3;->e:LeA3;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x2

    new-array v3, v3, [[B

    const/4 v4, 0x0

    aput-object p2, v3, v4

    const/4 v4, 0x1

    invoke-static {}, LZE2;->d()[B

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v3}, LT70;->a([[B)[B

    move-result-object v3

    goto :goto_1

    :cond_0
    move-object v3, p2

    :goto_1
    :try_start_0
    invoke-virtual {v2}, LJ24$c;->f()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LVE2;

    invoke-interface {v4, v1, v3}, LVE2;->a([B[B)V

    iget-object v4, p0, LZE2$b;->c:LyV2$a;

    invoke-virtual {v2}, LJ24$c;->c()I

    move-result v2

    array-length v3, v3

    int-to-long v5, v3

    invoke-interface {v4, v2, v5, v6}, LyV2$a;->b(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v2

    invoke-static {}, LZE2;->e()Ljava/util/logging/Logger;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "tag prefix matches a key, but cannot verify: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LZE2$b;->a:LJ24;

    invoke-virtual {v0}, LJ24;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ24$c;

    :try_start_1
    invoke-virtual {v1}, LJ24$c;->f()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LVE2;

    invoke-interface {v2, p1, p2}, LVE2;->a([B[B)V

    iget-object v2, p0, LZE2$b;->c:LyV2$a;

    invoke-virtual {v1}, LJ24$c;->c()I

    move-result v1

    array-length v3, p2

    int-to-long v3, v3

    invoke-interface {v2, v1, v3, v4}, LyV2$a;->b(IJ)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :cond_2
    iget-object p1, p0, LZE2$b;->c:LyV2$a;

    invoke-interface {p1}, LyV2$a;->a()V

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid MAC"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object p1, p0, LZE2$b;->c:LyV2$a;

    invoke-interface {p1}, LyV2$a;->a()V

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "tag too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b([B)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    iget-object v0, p0, LZE2$b;->a:LJ24;

    invoke-virtual {v0}, LJ24;->e()LJ24$c;

    move-result-object v0

    invoke-virtual {v0}, LJ24$c;->d()LeA3;

    move-result-object v0

    sget-object v1, LeA3;->e:LeA3;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    new-array v0, v3, [[B

    aput-object p1, v0, v2

    invoke-static {}, LZE2;->d()[B

    move-result-object p1

    aput-object p1, v0, v1

    invoke-static {v0}, LT70;->a([[B)[B

    move-result-object p1

    :cond_0
    :try_start_0
    new-array v0, v3, [[B

    iget-object v3, p0, LZE2$b;->a:LJ24;

    invoke-virtual {v3}, LJ24;->e()LJ24$c;

    move-result-object v3

    invoke-virtual {v3}, LJ24$c;->a()[B

    move-result-object v3

    aput-object v3, v0, v2

    iget-object v2, p0, LZE2$b;->a:LJ24;

    invoke-virtual {v2}, LJ24;->e()LJ24$c;

    move-result-object v2

    invoke-virtual {v2}, LJ24$c;->f()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LVE2;

    invoke-interface {v2, p1}, LVE2;->b([B)[B

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, LT70;->a([[B)[B

    move-result-object v0

    iget-object v1, p0, LZE2$b;->b:LyV2$a;

    iget-object v2, p0, LZE2$b;->a:LJ24;

    invoke-virtual {v2}, LJ24;->e()LJ24$c;

    move-result-object v2

    invoke-virtual {v2}, LJ24$c;->c()I

    move-result v2

    array-length p1, p1

    int-to-long v3, p1

    invoke-interface {v1, v2, v3, v4}, LyV2$a;->b(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    iget-object v0, p0, LZE2$b;->b:LyV2$a;

    invoke-interface {v0}, LyV2$a;->a()V

    throw p1
.end method
