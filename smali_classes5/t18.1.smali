.class public final Lt18;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LZN8;

.field public b:Ljava/lang/Boolean;

.field public c:LWJ8;

.field public d:Ljava/lang/Integer;

.field public e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic g(Lt18;)LWJ8;
    .locals 0

    iget-object p0, p0, Lt18;->c:LWJ8;

    return-object p0
.end method

.method public static bridge synthetic h(Lt18;)LZN8;
    .locals 0

    iget-object p0, p0, Lt18;->a:LZN8;

    return-object p0
.end method

.method public static bridge synthetic i(Lt18;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lt18;->b:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic j(Lt18;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lt18;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic k(Lt18;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lt18;->e:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)Lt18;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lt18;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method public final b(LWJ8;)Lt18;
    .locals 0

    iput-object p1, p0, Lt18;->c:LWJ8;

    return-object p0
.end method

.method public final c(LZN8;)Lt18;
    .locals 0

    iput-object p1, p0, Lt18;->a:LZN8;

    return-object p0
.end method

.method public final d(Ljava/lang/Boolean;)Lt18;
    .locals 0

    iput-object p1, p0, Lt18;->b:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final e(Ljava/lang/Integer;)Lt18;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lt18;->e:Ljava/lang/Integer;

    return-object p0
.end method

.method public final f()LU18;
    .locals 2

    new-instance v0, LU18;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LU18;-><init>(Lt18;LG18;)V

    return-object v0
.end method
