.class public final LnL7;
.super LHK7;
.source "SourceFile"


# instance fields
.field public final d:[B

.field public final e:Z

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I


# direct methods
.method public constructor <init>([BIIZ)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LHK7;-><init>(LXK7;)V

    const v0, 0x7fffffff

    iput v0, p0, LnL7;->j:I

    iput-object p1, p0, LnL7;->d:[B

    add-int/2addr p3, p2

    iput p3, p0, LnL7;->f:I

    iput p2, p0, LnL7;->h:I

    iput p2, p0, LnL7;->i:I

    iput-boolean p4, p0, LnL7;->e:Z

    return-void
.end method

.method public synthetic constructor <init>([BIIZLXK7;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LnL7;-><init>([BIIZ)V

    return-void
.end method


# virtual methods
.method public final c()I
    .locals 2

    iget v0, p0, LnL7;->h:I

    iget v1, p0, LnL7;->i:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final d(I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/clearcut/zzco;
        }
    .end annotation

    if-ltz p1, :cond_2

    invoke-virtual {p0}, LHK7;->c()I

    move-result v0

    add-int/2addr p1, v0

    iget v0, p0, LnL7;->j:I

    if-gt p1, v0, :cond_1

    iput p1, p0, LnL7;->j:I

    iget v1, p0, LnL7;->f:I

    iget v2, p0, LnL7;->g:I

    add-int/2addr v1, v2

    iput v1, p0, LnL7;->f:I

    iget v2, p0, LnL7;->i:I

    sub-int v2, v1, v2

    if-le v2, p1, :cond_0

    sub-int/2addr v2, p1

    iput v2, p0, LnL7;->g:I

    sub-int/2addr v1, v2

    iput v1, p0, LnL7;->f:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, LnL7;->g:I

    :goto_0
    return v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/zzco;->a()Lcom/google/android/gms/internal/clearcut/zzco;

    move-result-object p1

    throw p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/clearcut/zzco;

    const-string v0, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/clearcut/zzco;-><init>(Ljava/lang/String;)V

    throw p1
.end method
