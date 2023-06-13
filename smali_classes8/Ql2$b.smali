.class public LQl2$b;
.super LCH6$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQl2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LCH6$a<",
        "LQl2$b;",
        ">;"
    }
.end annotation


# instance fields
.field public e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LCH6$a;-><init>(I)V

    const/4 v0, 0x0

    iput v0, p0, LQl2$b;->e:I

    iput v0, p0, LQl2$b;->f:I

    iput v0, p0, LQl2$b;->g:I

    return-void
.end method

.method public static synthetic i(LQl2$b;)I
    .locals 0

    iget p0, p0, LQl2$b;->e:I

    return p0
.end method

.method public static synthetic j(LQl2$b;)I
    .locals 0

    iget p0, p0, LQl2$b;->f:I

    return p0
.end method

.method public static synthetic k(LQl2$b;)I
    .locals 0

    iget p0, p0, LQl2$b;->g:I

    return p0
.end method


# virtual methods
.method public bridge synthetic e()LCH6$a;
    .locals 1

    invoke-virtual {p0}, LQl2$b;->m()LQl2$b;

    move-result-object v0

    return-object v0
.end method

.method public l()LCH6;
    .locals 2

    new-instance v0, LQl2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LQl2;-><init>(LQl2$b;LQl2$a;)V

    return-object v0
.end method

.method public m()LQl2$b;
    .locals 0

    return-object p0
.end method

.method public n(I)LQl2$b;
    .locals 0

    iput p1, p0, LQl2$b;->e:I

    return-object p0
.end method

.method public o(I)LQl2$b;
    .locals 0

    iput p1, p0, LQl2$b;->f:I

    return-object p0
.end method

.method public p(I)LQl2$b;
    .locals 0

    iput p1, p0, LQl2$b;->g:I

    return-object p0
.end method
