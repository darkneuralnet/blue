.class public final LyE;
.super Lu1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Q:",
        "Ljava/lang/Object;",
        ">",
        "Lu1<",
        "TQ;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x17e474aaa1aeb57aL


# instance fields
.field public final f:LV31;


# direct methods
.method public constructor <init>(Ljava/lang/String;LV31;)V
    .locals 0

    invoke-direct {p0, p1}, Lu1;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, LyE;->f:LV31;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;LV31;)V
    .locals 0

    invoke-direct {p0, p1}, Lu1;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lu1;->b:Ljava/lang/String;

    iput-object p3, p0, LyE;->f:LV31;

    return-void
.end method


# virtual methods
.method public F()LV31;
    .locals 1

    iget-object v0, p0, LyE;->f:LV31;

    return-object v0
.end method

.method public J()LSd6;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation

    return-object p0
.end method

.method public b0()Lae6;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/UnsupportedOperationException;
        }
    .end annotation

    sget-object v0, Lo0;->c:Lo0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    const-class v2, LyE;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    check-cast p1, LyE;

    iget-object v2, p0, LyE;->f:LV31;

    iget-object v3, p1, LyE;->f:LV31;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lu1;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lu1;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lu1;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lu1;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    add-int/2addr v2, v0

    mul-int/lit8 v0, v2, 0x1f

    add-int/2addr v2, v0

    iget-object v0, p0, LyE;->f:LV31;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v2, v1

    return v2
.end method

.method public l()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "+",
            "Lu1<",
            "TQ;>;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method
