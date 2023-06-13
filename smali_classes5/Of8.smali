.class public final LOf8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LJg8;

.field public b:Ljava/lang/Integer;

.field public c:LZR8;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic d(LOf8;)LJg8;
    .locals 0

    iget-object p0, p0, LOf8;->a:LJg8;

    return-object p0
.end method

.method public static bridge synthetic f(LOf8;)LZR8;
    .locals 0

    iget-object p0, p0, LOf8;->c:LZR8;

    return-object p0
.end method

.method public static bridge synthetic g(LOf8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LOf8;->b:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)LOf8;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LOf8;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public final b(LZR8;)LOf8;
    .locals 0

    iput-object p1, p0, LOf8;->c:LZR8;

    return-object p0
.end method

.method public final c(LJg8;)LOf8;
    .locals 0

    iput-object p1, p0, LOf8;->a:LJg8;

    return-object p0
.end method

.method public final e()Loh8;
    .locals 2

    new-instance v0, Loh8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Loh8;-><init>(LOf8;LYg8;)V

    return-object v0
.end method
