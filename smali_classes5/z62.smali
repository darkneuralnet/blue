.class public final Lz62;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz62$b;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Lgg1;

.field public final h:LA62;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lz62;->a()Lz62$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lz62;-><init>(Lz62$b;)V

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;IIILgg1;LA62;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lz62;->a:I

    iput p2, p0, Lz62;->b:I

    iput-object p3, p0, Lz62;->c:Ljava/lang/String;

    iput p4, p0, Lz62;->d:I

    iput p5, p0, Lz62;->e:I

    iput p6, p0, Lz62;->f:I

    iput-object p7, p0, Lz62;->g:Lgg1;

    iput-object p8, p0, Lz62;->h:LA62;

    return-void
.end method

.method public constructor <init>(Lz62$b;)V
    .locals 9

    invoke-static {p1}, Lz62$b;->a(Lz62$b;)I

    move-result v1

    invoke-static {p1}, Lz62$b;->b(Lz62$b;)I

    move-result v2

    invoke-static {p1}, Lz62$b;->c(Lz62$b;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Lz62$b;->d(Lz62$b;)I

    move-result v4

    invoke-static {p1}, Lz62$b;->e(Lz62$b;)I

    move-result v5

    invoke-static {p1}, Lz62$b;->f(Lz62$b;)I

    move-result v6

    invoke-static {p1}, Lz62$b;->g(Lz62$b;)Lgg1;

    move-result-object v7

    invoke-static {p1}, Lz62$b;->h(Lz62$b;)LA62;

    move-result-object v8

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lz62;-><init>(IILjava/lang/String;IIILgg1;LA62;)V

    return-void
.end method

.method public synthetic constructor <init>(Lz62$b;Lz62$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lz62;-><init>(Lz62$b;)V

    return-void
.end method

.method public static a()Lz62$b;
    .locals 2

    new-instance v0, Lz62$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz62$b;-><init>(Lz62$a;)V

    return-object v0
.end method

.method public static b()Lz62;
    .locals 2

    new-instance v0, Lz62$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz62$b;-><init>(Lz62$a;)V

    invoke-virtual {v0}, Lz62$b;->i()Lz62;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c()Lgg1;
    .locals 1

    iget-object v0, p0, Lz62;->g:Lgg1;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz62;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lz62;->f:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lz62;->a:I

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lz62;->b:I

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lz62;->d:I

    return v0
.end method

.method public i()LA62;
    .locals 1

    iget-object v0, p0, Lz62;->h:LA62;

    return-object v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lz62;->e:I

    return v0
.end method
