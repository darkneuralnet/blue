.class public final LLd6$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLd6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LLd6;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NullPointerException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    iget-object v0, p0, LLd6$a;->a:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    const-string v3, "[0-9]{8,19}"

    invoke-virtual {v0, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    const-string v3, "number must be null or have 8 to 19 digits (inclusive)."

    invoke-virtual {p0, v0, v3}, LLd6$a;->c(ZLjava/lang/String;)V

    iget-object v0, p0, LLd6$a;->d:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    goto :goto_2

    :cond_2
    move v0, v1

    goto :goto_3

    :cond_3
    :goto_2
    move v0, v2

    :goto_3
    const-string v3, "cardHolderName must be null or not empty."

    invoke-virtual {p0, v0, v3}, LLd6$a;->c(ZLjava/lang/String;)V

    iget-object v0, p0, LLd6$a;->e:Ljava/lang/String;

    if-eqz v0, :cond_5

    const-string v3, "[0-9]{3,4}"

    invoke-virtual {v0, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    move v0, v1

    goto :goto_5

    :cond_5
    :goto_4
    move v0, v2

    :goto_5
    const-string v3, "cvc must be null or have 3 to 4 digits."

    invoke-virtual {p0, v0, v3}, LLd6$a;->c(ZLjava/lang/String;)V

    iget-object v0, p0, LLd6$a;->b:Ljava/lang/String;

    if-eqz v0, :cond_7

    const-string v3, "0?[1-9]|1[0-2]"

    invoke-virtual {v0, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_6

    :cond_6
    move v0, v1

    goto :goto_7

    :cond_7
    :goto_6
    move v0, v2

    :goto_7
    const-string v3, "expiryMonth must be null or between 1 and 12."

    invoke-virtual {p0, v0, v3}, LLd6$a;->c(ZLjava/lang/String;)V

    iget-object v0, p0, LLd6$a;->c:Ljava/lang/String;

    if-eqz v0, :cond_8

    const-string v3, "20\\d{2}"

    invoke-virtual {v0, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_8
    move v1, v2

    :cond_9
    const-string v0, "expiryYear must be in the second millennium and first century."

    invoke-virtual {p0, v1, v0}, LLd6$a;->c(ZLjava/lang/String;)V

    new-instance v0, LLd6;

    iget-object v3, p0, LLd6$a;->a:Ljava/lang/String;

    iget-object v4, p0, LLd6$a;->b:Ljava/lang/String;

    iget-object v5, p0, LLd6$a;->c:Ljava/lang/String;

    iget-object v6, p0, LLd6$a;->e:Ljava/lang/String;

    iget-object v7, p0, LLd6$a;->d:Ljava/lang/String;

    iget-object v8, p0, LLd6$a;->f:Ljava/util/Date;

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, LLd6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "\\s"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final c(ZLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Ljava/lang/String;)LLd6$a;
    .locals 0

    invoke-virtual {p0, p1}, LLd6$a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LLd6$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)LLd6$a;
    .locals 0

    invoke-virtual {p0, p1}, LLd6$a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LLd6$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public f(Ljava/lang/String;)LLd6$a;
    .locals 0

    invoke-virtual {p0, p1}, LLd6$a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LLd6$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/lang/String;)LLd6$a;
    .locals 0

    invoke-virtual {p0, p1}, LLd6$a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LLd6$a;->a:Ljava/lang/String;

    return-object p0
.end method
