.class public Lx01;
.super LNs0;
.source "SourceFile"


# instance fields
.field public g:Ljava/lang/String;

.field public h:LPE2;

.field public i:Landroid/graphics/Paint$Align;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LNs0;-><init>()V

    const-string v0, "Description Label"

    iput-object v0, p0, Lx01;->g:Ljava/lang/String;

    sget-object v0, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    iput-object v0, p0, Lx01;->i:Landroid/graphics/Paint$Align;

    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    iput v0, p0, LNs0;->e:F

    return-void
.end method


# virtual methods
.method public i()LPE2;
    .locals 1

    iget-object v0, p0, Lx01;->h:LPE2;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx01;->g:Ljava/lang/String;

    return-object v0
.end method

.method public k()Landroid/graphics/Paint$Align;
    .locals 1

    iget-object v0, p0, Lx01;->i:Landroid/graphics/Paint$Align;

    return-object v0
.end method
