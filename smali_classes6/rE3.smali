.class public final LrE3;
.super LES0;
.source "SourceFile"


# instance fields
.field public final c:Lmm1;

.field public d:I


# direct methods
.method public constructor <init>(IILmm1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LES0;-><init>(II)V

    iput-object p3, p0, LrE3;->c:Lmm1;

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, LrE3;->d:I

    return v0
.end method

.method public d()Lmm1;
    .locals 1

    iget-object v0, p0, LrE3;->c:Lmm1;

    return-object v0
.end method

.method public e()V
    .locals 1

    iget v0, p0, LrE3;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LrE3;->d:I

    return-void
.end method
