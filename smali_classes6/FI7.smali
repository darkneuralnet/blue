.class public final LFI7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public final b:J

.field public final c:LlV7;

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>([BJLlV7;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFI7;->a:[B

    iput-wide p2, p0, LFI7;->b:J

    iput-object p4, p0, LFI7;->c:LlV7;

    iput p5, p0, LFI7;->d:I

    iput p6, p0, LFI7;->e:I

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, LFI7;->b:J

    return-wide v0
.end method

.method public final b()LlV7;
    .locals 1

    iget-object v0, p0, LFI7;->c:LlV7;

    return-object v0
.end method

.method public final c()[B
    .locals 1

    iget-object v0, p0, LFI7;->a:[B

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LFI7;->d:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LFI7;->e:I

    return v0
.end method
