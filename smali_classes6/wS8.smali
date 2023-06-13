.class public final LwS8;
.super LZP8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LZP8<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final transient d:[Ljava/lang/Object;

.field public final transient e:I

.field public final transient f:I


# direct methods
.method public constructor <init>([Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, LZP8;-><init>()V

    iput-object p1, p0, LwS8;->d:[Ljava/lang/Object;

    iput p2, p0, LwS8;->e:I

    iput p3, p0, LwS8;->f:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LwS8;->f:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, LyK8;->a(IILjava/lang/String;)I

    iget-object v0, p0, LwS8;->d:[Ljava/lang/Object;

    add-int/2addr p1, p1

    iget v1, p0, LwS8;->e:I

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LwS8;->f:I

    return v0
.end method
