.class public final LzV2$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LzV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:LHk2;

.field public final b:I

.field public final c:LJE3;


# direct methods
.method public constructor <init>(LHk2;ILJE3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzV2$c;->a:LHk2;

    iput p2, p0, LzV2$c;->b:I

    iput-object p3, p0, LzV2$c;->c:LJE3;

    return-void
.end method

.method public synthetic constructor <init>(LHk2;ILJE3;LzV2$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LzV2$c;-><init>(LHk2;ILJE3;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LzV2$c;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LzV2$c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LzV2$c;

    iget-object v0, p0, LzV2$c;->a:LHk2;

    iget-object v2, p1, LzV2$c;->a:LHk2;

    if-ne v0, v2, :cond_1

    iget v0, p0, LzV2$c;->b:I

    iget v2, p1, LzV2$c;->b:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, LzV2$c;->c:LJE3;

    iget-object p1, p1, LzV2$c;->c:LJE3;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LzV2$c;->a:LHk2;

    aput-object v2, v0, v1

    iget v1, p0, LzV2$c;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, LzV2$c;->c:LJE3;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LzV2$c;->a:LHk2;

    aput-object v2, v0, v1

    iget v1, p0, LzV2$c;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    iget-object v2, p0, LzV2$c;->c:LJE3;

    aput-object v2, v0, v1

    const-string v1, "(status=%s, keyId=%s, parameters=\'%s\')"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
