.class public LdB6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Liz0;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:I

.field public final s:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public t:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LdB6;->a:Liz0;

    const/4 v1, 0x0

    iput v1, p0, LdB6;->b:I

    iput v1, p0, LdB6;->c:I

    iput v1, p0, LdB6;->d:I

    iput v1, p0, LdB6;->e:I

    const/high16 v2, 0x7fc00000    # Float.NaN

    iput v2, p0, LdB6;->f:F

    iput v2, p0, LdB6;->g:F

    iput v2, p0, LdB6;->h:F

    iput v2, p0, LdB6;->i:F

    iput v2, p0, LdB6;->j:F

    iput v2, p0, LdB6;->k:F

    iput v2, p0, LdB6;->l:F

    iput v2, p0, LdB6;->m:F

    iput v2, p0, LdB6;->n:F

    iput v2, p0, LdB6;->o:F

    iput v2, p0, LdB6;->p:F

    iput v2, p0, LdB6;->q:F

    iput v1, p0, LdB6;->r:I

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, LdB6;->s:Ljava/util/HashMap;

    iput-object v0, p0, LdB6;->t:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Liz0;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LdB6;->a:Liz0;

    const/4 v1, 0x0

    iput v1, p0, LdB6;->b:I

    iput v1, p0, LdB6;->c:I

    iput v1, p0, LdB6;->d:I

    iput v1, p0, LdB6;->e:I

    const/high16 v2, 0x7fc00000    # Float.NaN

    iput v2, p0, LdB6;->f:F

    iput v2, p0, LdB6;->g:F

    iput v2, p0, LdB6;->h:F

    iput v2, p0, LdB6;->i:F

    iput v2, p0, LdB6;->j:F

    iput v2, p0, LdB6;->k:F

    iput v2, p0, LdB6;->l:F

    iput v2, p0, LdB6;->m:F

    iput v2, p0, LdB6;->n:F

    iput v2, p0, LdB6;->o:F

    iput v2, p0, LdB6;->p:F

    iput v2, p0, LdB6;->q:F

    iput v1, p0, LdB6;->r:I

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, LdB6;->s:Ljava/util/HashMap;

    iput-object v0, p0, LdB6;->t:Ljava/lang/String;

    iput-object p1, p0, LdB6;->a:Liz0;

    return-void
.end method
