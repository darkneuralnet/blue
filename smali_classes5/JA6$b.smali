.class public final LJA6$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJA6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:LJA6$c;

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LJA6$b;)LJA6$c;
    .locals 0

    iget-object p0, p0, LJA6$b;->a:LJA6$c;

    return-object p0
.end method

.method public static synthetic b(LJA6$b;)I
    .locals 0

    iget p0, p0, LJA6$b;->b:I

    return p0
.end method


# virtual methods
.method public c()LJA6;
    .locals 2

    new-instance v0, LJA6;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LJA6;-><init>(LJA6$b;LJA6$a;)V

    return-object v0
.end method

.method public d()LJA6$b;
    .locals 1

    sget-object v0, LJA6$c;->e:LJA6$c;

    iput-object v0, p0, LJA6$b;->a:LJA6$c;

    return-object p0
.end method

.method public e()LJA6$b;
    .locals 1

    sget-object v0, LJA6$c;->d:LJA6$c;

    iput-object v0, p0, LJA6$b;->a:LJA6$c;

    return-object p0
.end method

.method public f()LJA6$b;
    .locals 1

    sget-object v0, LJA6$c;->b:LJA6$c;

    iput-object v0, p0, LJA6$b;->a:LJA6$c;

    return-object p0
.end method
