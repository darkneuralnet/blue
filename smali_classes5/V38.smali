.class public final LV38;
.super LM48;
.source "SourceFile"


# instance fields
.field public b:I

.field public final c:I

.field public final synthetic d:Lw78;


# direct methods
.method public constructor <init>(Lw78;)V
    .locals 1

    iput-object p1, p0, LV38;->d:Lw78;

    invoke-direct {p0}, LM48;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LV38;->b:I

    invoke-virtual {p1}, Lw78;->c()I

    move-result p1

    iput p1, p0, LV38;->c:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, LV38;->b:I

    iget v1, p0, LV38;->c:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()B
    .locals 2

    iget v0, p0, LV38;->b:I

    iget v1, p0, LV38;->c:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, LV38;->b:I

    iget-object v1, p0, LV38;->d:Lw78;

    invoke-virtual {v1, v0}, Lw78;->b(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
