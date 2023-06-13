.class public final LLi8;
.super LAl8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "LNp9;",
        ">",
        "LAl8<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Landroid/net/Uri;

.field public b:LNp9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public c:Lmj8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmj8<",
            "TT;>;"
        }
    .end annotation
.end field

.field public d:LZP8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZP8<",
            "LNj8<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/Boolean;

.field public f:Ljava/lang/Boolean;

.field public g:Ljava/lang/Boolean;

.field public h:LOn8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LOn8;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LAl8;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)LAl8;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "LAl8<",
            "TT;>;"
        }
    .end annotation

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, LLi8;->g:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final b(Lmj8;)LAl8;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmj8<",
            "TT;>;)",
            "LAl8<",
            "TT;>;"
        }
    .end annotation

    iput-object p1, p0, LLi8;->c:Lmj8;

    return-object p0
.end method

.method public final c(LNp9;)LAl8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "LAl8<",
            "TT;>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iput-object p1, p0, LLi8;->b:LNp9;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null schema"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Z)LAl8;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "LAl8<",
            "TT;>;"
        }
    .end annotation

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, LLi8;->f:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final e(Landroid/net/Uri;)LAl8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "LAl8<",
            "TT;>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iput-object p1, p0, LLi8;->a:Landroid/net/Uri;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null uri"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Z)LAl8;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "LAl8<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, LLi8;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final g()LOl8;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LOl8<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LLi8;->d:LZP8;

    if-nez v0, :cond_0

    invoke-static {}, LZP8;->z()LZP8;

    move-result-object v0

    iput-object v0, p0, LLi8;->d:LZP8;

    :cond_0
    iget-object v2, p0, LLi8;->a:Landroid/net/Uri;

    if-eqz v2, :cond_2

    iget-object v3, p0, LLi8;->b:LNp9;

    if-eqz v3, :cond_2

    iget-object v4, p0, LLi8;->c:Lmj8;

    if-eqz v4, :cond_2

    iget-object v6, p0, LLi8;->h:LOn8;

    if-eqz v6, :cond_2

    iget-object v0, p0, LLi8;->e:Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    iget-object v1, p0, LLi8;->f:Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    iget-object v1, p0, LLi8;->g:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v12, LYi8;

    iget-object v5, p0, LLi8;->d:LZP8;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    iget-object v0, p0, LLi8;->f:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    iget-object v0, p0, LLi8;->g:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, v12

    invoke-direct/range {v1 .. v11}, LYi8;-><init>(Landroid/net/Uri;LNp9;Lmj8;LZP8;LOn8;ZZZLwi8;[B)V

    return-object v12

    :cond_2
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LLi8;->a:Landroid/net/Uri;

    if-nez v1, :cond_3

    const-string v1, " uri"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, LLi8;->b:LNp9;

    if-nez v1, :cond_4

    const-string v1, " schema"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v1, p0, LLi8;->c:Lmj8;

    if-nez v1, :cond_5

    const-string v1, " handler"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-object v1, p0, LLi8;->h:LOn8;

    if-nez v1, :cond_6

    const-string v1, " variantConfig"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-object v1, p0, LLi8;->e:Ljava/lang/Boolean;

    if-nez v1, :cond_7

    const-string v1, " useGeneratedExtensionRegistry"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    iget-object v1, p0, LLi8;->f:Ljava/lang/Boolean;

    if-nez v1, :cond_8

    const-string v1, " updateSequencingBugFix"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    iget-object v1, p0, LLi8;->g:Ljava/lang/Boolean;

    if-nez v1, :cond_9

    const-string v1, " enableTracing"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1c

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Missing required properties:"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final h(LOn8;)LAl8;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOn8;",
            ")",
            "LAl8<",
            "TT;>;"
        }
    .end annotation

    iput-object p1, p0, LLi8;->h:LOn8;

    return-object p0
.end method
