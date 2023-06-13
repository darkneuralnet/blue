.class public final LzV2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LzV2$b;,
        LzV2$c;
    }
.end annotation


# instance fields
.field public final a:LxV2;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LzV2$c;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(LxV2;Ljava/util/List;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxV2;",
            "Ljava/util/List<",
            "LzV2$c;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzV2;->a:LxV2;

    iput-object p2, p0, LzV2;->b:Ljava/util/List;

    iput-object p3, p0, LzV2;->c:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(LxV2;Ljava/util/List;Ljava/lang/Integer;LzV2$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LzV2;-><init>(LxV2;Ljava/util/List;Ljava/lang/Integer;)V

    return-void
.end method

.method public static a()LzV2$b;
    .locals 1

    new-instance v0, LzV2$b;

    invoke-direct {v0}, LzV2$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LzV2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LzV2;

    iget-object v0, p0, LzV2;->a:LxV2;

    iget-object v2, p1, LzV2;->a:LxV2;

    invoke-virtual {v0, v2}, LxV2;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LzV2;->b:Ljava/util/List;

    iget-object v2, p1, LzV2;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LzV2;->c:Ljava/lang/Integer;

    iget-object p1, p1, LzV2;->c:Ljava/lang/Integer;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LzV2;->a:LxV2;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, LzV2;->b:Ljava/util/List;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LzV2;->a:LxV2;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, LzV2;->b:Ljava/util/List;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, LzV2;->c:Ljava/lang/Integer;

    aput-object v2, v0, v1

    const-string v1, "(annotations=%s, entries=%s, primaryKeyId=%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
