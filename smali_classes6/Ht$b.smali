.class public final LHt$b;
.super LZ42$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ls56;

.field public e:LZ42$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LZ42$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LZ42;
    .locals 8

    new-instance v7, LHt;

    iget-object v1, p0, LHt$b;->a:Ljava/lang/String;

    iget-object v2, p0, LHt$b;->b:Ljava/lang/String;

    iget-object v3, p0, LHt$b;->c:Ljava/lang/String;

    iget-object v4, p0, LHt$b;->d:Ls56;

    iget-object v5, p0, LHt$b;->e:LZ42$b;

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LHt;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls56;LZ42$b;LHt$a;)V

    return-object v7
.end method

.method public b(Ls56;)LZ42$a;
    .locals 0

    iput-object p1, p0, LHt$b;->d:Ls56;

    return-object p0
.end method

.method public c(Ljava/lang/String;)LZ42$a;
    .locals 0

    iput-object p1, p0, LHt$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)LZ42$a;
    .locals 0

    iput-object p1, p0, LHt$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public e(LZ42$b;)LZ42$a;
    .locals 0

    iput-object p1, p0, LHt$b;->e:LZ42$b;

    return-object p0
.end method

.method public f(Ljava/lang/String;)LZ42$a;
    .locals 0

    iput-object p1, p0, LHt$b;->a:Ljava/lang/String;

    return-object p0
.end method
