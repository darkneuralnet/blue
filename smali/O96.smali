.class public LO96;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lso;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lso<",
            "Landroid/view/View;",
            "LN96;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Loz2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Loz2<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lso;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lso<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lso;

    invoke-direct {v0}, Lso;-><init>()V

    iput-object v0, p0, LO96;->a:Lso;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, LO96;->b:Landroid/util/SparseArray;

    new-instance v0, Loz2;

    invoke-direct {v0}, Loz2;-><init>()V

    iput-object v0, p0, LO96;->c:Loz2;

    new-instance v0, Lso;

    invoke-direct {v0}, Lso;-><init>()V

    iput-object v0, p0, LO96;->d:Lso;

    return-void
.end method
