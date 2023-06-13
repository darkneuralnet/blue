.class public final Lxa8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lob8;

.field public b:Ljava/lang/Integer;

.field public c:La09;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic d(Lxa8;)Lob8;
    .locals 0

    iget-object p0, p0, Lxa8;->a:Lob8;

    return-object p0
.end method

.method public static bridge synthetic f(Lxa8;)La09;
    .locals 0

    iget-object p0, p0, Lxa8;->c:La09;

    return-object p0
.end method

.method public static bridge synthetic g(Lxa8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lxa8;->b:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)Lxa8;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lxa8;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public final b(La09;)Lxa8;
    .locals 0

    iput-object p1, p0, Lxa8;->c:La09;

    return-object p0
.end method

.method public final c(Lob8;)Lxa8;
    .locals 0

    iput-object p1, p0, Lxa8;->a:Lob8;

    return-object p0
.end method

.method public final e()LQb8;
    .locals 2

    new-instance v0, LQb8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LQb8;-><init>(Lxa8;LOb8;)V

    return-object v0
.end method
