.class public final LsZ6;
.super LLu6$a;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LLu6$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LLu6;
    .locals 5

    iget-object v0, p0, LsZ6;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p0, LsZ6;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v2, p0, LsZ6;->c:Ljava/lang/String;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, LA17;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v2, v4}, LA17;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw07;)V

    return-object v3

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LsZ6;->a:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, " configLabel"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, LsZ6;->b:Ljava/lang/String;

    if-nez v1, :cond_3

    const-string v1, " modelDir"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, LsZ6;->c:Ljava/lang/String;

    if-nez v1, :cond_4

    const-string v1, " languageHint"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Missing required properties:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final b(Ljava/lang/String;)LLu6$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, LsZ6;->c:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null languageHint"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Ljava/lang/String;)LLu6$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, LsZ6;->b:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null modelDir"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Ljava/lang/String;)LLu6$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, LsZ6;->a:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null configLabel"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
