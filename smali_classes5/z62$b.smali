.class public final Lz62$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz62;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:I

.field public g:Lgg1;

.field public h:LA62;


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lz62$b;->a:I

    const/16 v0, 0x7d0

    iput v0, p0, Lz62$b;->b:I

    const-string v1, "http://clients3.google.com/generate_204"

    iput-object v1, p0, Lz62$b;->c:Ljava/lang/String;

    const/16 v1, 0x50

    iput v1, p0, Lz62$b;->d:I

    iput v0, p0, Lz62$b;->e:I

    const/16 v0, 0xcc

    iput v0, p0, Lz62$b;->f:I

    new-instance v0, LZW0;

    invoke-direct {v0}, LZW0;-><init>()V

    iput-object v0, p0, Lz62$b;->g:Lgg1;

    new-instance v0, LOx6;

    invoke-direct {v0}, LOx6;-><init>()V

    iput-object v0, p0, Lz62$b;->h:LA62;

    return-void
.end method

.method public synthetic constructor <init>(Lz62$a;)V
    .locals 0

    invoke-direct {p0}, Lz62$b;-><init>()V

    return-void
.end method

.method public static synthetic a(Lz62$b;)I
    .locals 0

    iget p0, p0, Lz62$b;->a:I

    return p0
.end method

.method public static synthetic b(Lz62$b;)I
    .locals 0

    iget p0, p0, Lz62$b;->b:I

    return p0
.end method

.method public static synthetic c(Lz62$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lz62$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic d(Lz62$b;)I
    .locals 0

    iget p0, p0, Lz62$b;->d:I

    return p0
.end method

.method public static synthetic e(Lz62$b;)I
    .locals 0

    iget p0, p0, Lz62$b;->e:I

    return p0
.end method

.method public static synthetic f(Lz62$b;)I
    .locals 0

    iget p0, p0, Lz62$b;->f:I

    return p0
.end method

.method public static synthetic g(Lz62$b;)Lgg1;
    .locals 0

    iget-object p0, p0, Lz62$b;->g:Lgg1;

    return-object p0
.end method

.method public static synthetic h(Lz62$b;)LA62;
    .locals 0

    iget-object p0, p0, Lz62$b;->h:LA62;

    return-object p0
.end method


# virtual methods
.method public i()Lz62;
    .locals 2

    new-instance v0, Lz62;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lz62;-><init>(Lz62$b;Lz62$a;)V

    return-object v0
.end method
