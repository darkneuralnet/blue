.class public final Le18;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LU18;

.field public b:Ljava/lang/Integer;

.field public c:LfI8;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic d(Le18;)LU18;
    .locals 0

    iget-object p0, p0, Le18;->a:LU18;

    return-object p0
.end method

.method public static bridge synthetic f(Le18;)LfI8;
    .locals 0

    iget-object p0, p0, Le18;->c:LfI8;

    return-object p0
.end method

.method public static bridge synthetic g(Le18;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Le18;->b:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)Le18;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Le18;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public final b(LfI8;)Le18;
    .locals 0

    iput-object p1, p0, Le18;->c:LfI8;

    return-object p0
.end method

.method public final c(LU18;)Le18;
    .locals 0

    iput-object p1, p0, Le18;->a:LU18;

    return-object p0
.end method

.method public final e()Ly28;
    .locals 2

    new-instance v0, Ly28;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ly28;-><init>(Le18;Li28;)V

    return-object v0
.end method
