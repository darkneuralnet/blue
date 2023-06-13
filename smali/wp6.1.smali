.class public abstract Lwp6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwp6$a;
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

.field public static final c:LRc4;


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

    sput-object v0, Lwp6;->a:Landroid/util/Range;

    new-instance v0, Landroid/util/Range;

    invoke-direct {v0, v2, v3}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    sput-object v0, Lwp6;->b:Landroid/util/Range;

    const/4 v0, 0x3

    new-array v0, v0, [Lzb4;

    sget-object v2, Lzb4;->c:Lzb4;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v3, Lzb4;->b:Lzb4;

    aput-object v3, v0, v1

    const/4 v1, 0x2

    sget-object v3, Lzb4;->a:Lzb4;

    aput-object v3, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v2}, LIj1;->a(Lzb4;)LIj1;

    move-result-object v1

    invoke-static {v0, v1}, LRc4;->e(Ljava/util/List;LIj1;)LRc4;

    move-result-object v0

    sput-object v0, Lwp6;->c:LRc4;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lwp6$a;
    .locals 2

    new-instance v0, Lsu$b;

    invoke-direct {v0}, Lsu$b;-><init>()V

    sget-object v1, Lwp6;->c:LRc4;

    invoke-virtual {v0, v1}, Lsu$b;->e(LRc4;)Lwp6$a;

    move-result-object v0

    sget-object v1, Lwp6;->a:Landroid/util/Range;

    invoke-virtual {v0, v1}, Lwp6$a;->d(Landroid/util/Range;)Lwp6$a;

    move-result-object v0

    sget-object v1, Lwp6;->b:Landroid/util/Range;

    invoke-virtual {v0, v1}, Lwp6$a;->c(Landroid/util/Range;)Lwp6$a;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lwp6$a;->b(I)Lwp6$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract c()Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
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

.method public abstract e()LRc4;
.end method

.method public abstract f()Lwp6$a;
.end method
