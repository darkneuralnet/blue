.class public final LNH7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[B

.field public b:J

.field public c:LlV7;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)LNH7;
    .locals 0

    iput-object p1, p0, LNH7;->a:[B

    return-object p0
.end method

.method public final b(LlV7;)LNH7;
    .locals 0

    iput-object p1, p0, LNH7;->c:LlV7;

    return-object p0
.end method

.method public final c(J)LNH7;
    .locals 0

    iput-wide p1, p0, LNH7;->b:J

    return-object p0
.end method

.method public final d()LFI7;
    .locals 8

    new-instance v7, LFI7;

    iget-object v1, p0, LNH7;->a:[B

    iget-wide v2, p0, LNH7;->b:J

    iget-object v4, p0, LNH7;->c:LlV7;

    iget v5, p0, LNH7;->d:I

    iget v6, p0, LNH7;->e:I

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LFI7;-><init>([BJLlV7;II)V

    return-object v7
.end method

.method public final e(I)LNH7;
    .locals 0

    const/4 p1, 0x2

    iput p1, p0, LNH7;->d:I

    return-object p0
.end method

.method public final f(I)LNH7;
    .locals 0

    iput p1, p0, LNH7;->e:I

    return-object p0
.end method
