.class public final Lq74$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq74;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x6492916182a4e0bL


# instance fields
.field public final b:LSd6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LSd6<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(LSd6;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;II)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq74$b;->b:LSd6;

    iput p2, p0, Lq74$b;->c:I

    iput p3, p0, Lq74$b;->d:I

    return-void
.end method

.method public synthetic constructor <init>(LSd6;IILq74$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lq74$b;-><init>(LSd6;II)V

    return-void
.end method

.method public static synthetic a(Lq74$b;)LSd6;
    .locals 0

    iget-object p0, p0, Lq74$b;->b:LSd6;

    return-object p0
.end method

.method public static synthetic b(Lq74$b;)I
    .locals 0

    iget p0, p0, Lq74$b;->c:I

    return p0
.end method

.method public static synthetic c(Lq74$b;)I
    .locals 0

    iget p0, p0, Lq74$b;->d:I

    return p0
.end method


# virtual methods
.method public d()I
    .locals 1

    iget v0, p0, Lq74$b;->c:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lq74$b;->d:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    const-class v2, Lq74$b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lq74$b;

    iget v2, p0, Lq74$b;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lq74$b;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget v2, p0, Lq74$b;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lq74$b;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lq74$b;->b:LSd6;

    iget-object p1, p1, Lq74$b;->b:LSd6;

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0

    :cond_5
    :goto_0
    return v1
.end method

.method public f()LSd6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LSd6<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lq74$b;->b:LSd6;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lq74$b;->b:LSd6;

    aput-object v2, v0, v1

    iget v1, p0, Lq74$b;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Lq74$b;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
