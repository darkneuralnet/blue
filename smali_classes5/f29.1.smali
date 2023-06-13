.class public final Lf29;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lp29;

.field public b:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic c(Lf29;)Lp29;
    .locals 0

    iget-object p0, p0, Lf29;->a:Lp29;

    return-object p0
.end method

.method public static bridge synthetic e(Lf29;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lf29;->b:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public final a(Lp29;)Lf29;
    .locals 0

    iput-object p1, p0, Lf29;->a:Lp29;

    return-object p0
.end method

.method public final b(Ljava/lang/Integer;)Lf29;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lf29;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public final d()LJ29;
    .locals 2

    new-instance v0, LJ29;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LJ29;-><init>(Lf29;Lz29;)V

    return-object v0
.end method
