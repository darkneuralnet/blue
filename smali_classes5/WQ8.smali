.class public final LWQ8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LNL8;

.field public b:LRK8;

.field public c:LWJ8;

.field public d:Ljava/lang/Integer;

.field public e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(LWQ8;)LWJ8;
    .locals 0

    iget-object p0, p0, LWQ8;->c:LWJ8;

    return-object p0
.end method

.method public static bridge synthetic b(LWQ8;)LRK8;
    .locals 0

    iget-object p0, p0, LWQ8;->b:LRK8;

    return-object p0
.end method

.method public static bridge synthetic c(LWQ8;)LNL8;
    .locals 0

    iget-object p0, p0, LWQ8;->a:LNL8;

    return-object p0
.end method

.method public static bridge synthetic j(LWQ8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LWQ8;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic k(LWQ8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LWQ8;->e:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public final d(Ljava/lang/Integer;)LWQ8;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LWQ8;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method public final e(LWJ8;)LWQ8;
    .locals 0

    iput-object p1, p0, LWQ8;->c:LWJ8;

    return-object p0
.end method

.method public final f(LRK8;)LWQ8;
    .locals 0

    iput-object p1, p0, LWQ8;->b:LRK8;

    return-object p0
.end method

.method public final g(LNL8;)LWQ8;
    .locals 0

    iput-object p1, p0, LWQ8;->a:LNL8;

    return-object p0
.end method

.method public final h(Ljava/lang/Integer;)LWQ8;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LWQ8;->e:Ljava/lang/Integer;

    return-object p0
.end method

.method public final i()LqR8;
    .locals 2

    new-instance v0, LqR8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LqR8;-><init>(LWQ8;LgR8;)V

    return-object v0
.end method
