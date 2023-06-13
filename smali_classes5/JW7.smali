.class public final LJW7;
.super LDR7;
.source "SourceFile"


# instance fields
.field public final transient d:[Ljava/lang/Object;

.field public final transient e:I

.field public final transient f:I


# direct methods
.method public constructor <init>([Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, LDR7;-><init>()V

    iput-object p1, p0, LJW7;->d:[Ljava/lang/Object;

    iput p2, p0, LJW7;->e:I

    iput p3, p0, LJW7;->f:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LJW7;->f:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, LNt7;->a(IILjava/lang/String;)I

    iget-object v0, p0, LJW7;->d:[Ljava/lang/Object;

    add-int/2addr p1, p1

    iget v1, p0, LJW7;->e:I

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LJW7;->f:I

    return v0
.end method
