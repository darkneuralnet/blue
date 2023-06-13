.class public abstract LFp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFp$a;
    }
.end annotation


# static fields
.field public static final a:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:LFp;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/util/Range;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const v3, 0x7fffffff

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    sput-object v0, LFp;->a:Landroid/util/Range;

    new-instance v0, Landroid/util/Range;

    invoke-direct {v0, v2, v3}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    sput-object v0, LFp;->b:Landroid/util/Range;

    invoke-static {}, LFp;->a()LFp$a;

    move-result-object v0

    invoke-virtual {v0, v1}, LFp$a;->c(I)LFp$a;

    move-result-object v0

    invoke-virtual {v0}, LFp$a;->a()LFp;

    move-result-object v0

    sput-object v0, LFp;->c:LFp;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LFp$a;
    .locals 2

    new-instance v0, Lft$b;

    invoke-direct {v0}, Lft$b;-><init>()V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lft$b;->f(I)LFp$a;

    move-result-object v0

    invoke-virtual {v0, v1}, LFp$a;->e(I)LFp$a;

    move-result-object v0

    invoke-virtual {v0, v1}, LFp$a;->c(I)LFp$a;

    move-result-object v0

    sget-object v1, LFp;->a:Landroid/util/Range;

    invoke-virtual {v0, v1}, LFp$a;->b(Landroid/util/Range;)LFp$a;

    move-result-object v0

    sget-object v1, LFp;->b:Landroid/util/Range;

    invoke-virtual {v0, v1}, LFp$a;->d(Landroid/util/Range;)LFp$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c()I
.end method

.method public abstract d()Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e()I
.end method

.method public abstract f()I
.end method
