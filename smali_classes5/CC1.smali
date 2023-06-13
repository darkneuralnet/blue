.class public LCC1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[I

.field public b:I

.field public c:I

.field public d:LzC1;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LzC1;",
            ">;"
        }
    .end annotation
.end field

.field public f:I

.field public g:I

.field public h:Z

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LCC1;->a:[I

    const/4 v0, 0x0

    iput v0, p0, LCC1;->b:I

    iput v0, p0, LCC1;->c:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LCC1;->e:Ljava/util/List;

    const/4 v0, -0x1

    iput v0, p0, LCC1;->m:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LCC1;->g:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, LCC1;->c:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LCC1;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, LCC1;->f:I

    return v0
.end method
