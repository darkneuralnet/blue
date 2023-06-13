.class public final LJ24$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ24;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TP;"
        }
    .end annotation
.end field

.field public final b:[B

.field public final c:LIk2;

.field public final d:LeA3;

.field public final e:I

.field public final f:Lbk2;


# direct methods
.method public constructor <init>(Ljava/lang/Object;[BLIk2;LeA3;ILbk2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;[B",
            "LIk2;",
            "LeA3;",
            "I",
            "Lbk2;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ24$c;->a:Ljava/lang/Object;

    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, LJ24$c;->b:[B

    iput-object p3, p0, LJ24$c;->c:LIk2;

    iput-object p4, p0, LJ24$c;->d:LeA3;

    iput p5, p0, LJ24$c;->e:I

    iput-object p6, p0, LJ24$c;->f:Lbk2;

    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 2

    iget-object v0, p0, LJ24$c;->b:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public b()Lbk2;
    .locals 1

    iget-object v0, p0, LJ24$c;->f:Lbk2;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LJ24$c;->e:I

    return v0
.end method

.method public d()LeA3;
    .locals 1

    iget-object v0, p0, LJ24$c;->d:LeA3;

    return-object v0
.end method

.method public e()LJE3;
    .locals 1

    iget-object v0, p0, LJ24$c;->f:Lbk2;

    invoke-virtual {v0}, Lbk2;->a()LJE3;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TP;"
        }
    .end annotation

    iget-object v0, p0, LJ24$c;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public g()LIk2;
    .locals 1

    iget-object v0, p0, LJ24$c;->c:LIk2;

    return-object v0
.end method
