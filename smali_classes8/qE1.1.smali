.class public final LqE1;
.super LsB0$a;
.source "SourceFile"


# instance fields
.field public final a:LoE1;


# direct methods
.method public constructor <init>(LoE1;)V
    .locals 0

    invoke-direct {p0}, LsB0$a;-><init>()V

    iput-object p1, p0, LqE1;->a:LoE1;

    return-void
.end method

.method public static f(LoE1;)LqE1;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, LqE1;

    invoke-direct {v0, p0}, LqE1;-><init>(LoE1;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "gson == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;LMN4;)LsB0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "LMN4;",
            ")",
            "LsB0<",
            "*",
            "Lokhttp3/RequestBody;",
            ">;"
        }
    .end annotation

    iget-object p2, p0, LqE1;->a:LoE1;

    invoke-static {p1}, LFb6;->get(Ljava/lang/reflect/Type;)LFb6;

    move-result-object p1

    invoke-virtual {p2, p1}, LoE1;->p(LFb6;)LBb6;

    move-result-object p1

    new-instance p2, LsE1;

    iget-object p3, p0, LqE1;->a:LoE1;

    invoke-direct {p2, p3, p1}, LsE1;-><init>(LoE1;LBb6;)V

    return-object p2
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMN4;)LsB0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "LMN4;",
            ")",
            "LsB0<",
            "Lokhttp3/ResponseBody;",
            "*>;"
        }
    .end annotation

    iget-object p2, p0, LqE1;->a:LoE1;

    invoke-static {p1}, LFb6;->get(Ljava/lang/reflect/Type;)LFb6;

    move-result-object p1

    invoke-virtual {p2, p1}, LoE1;->p(LFb6;)LBb6;

    move-result-object p1

    new-instance p2, LtE1;

    iget-object p3, p0, LqE1;->a:LoE1;

    invoke-direct {p2, p3, p1}, LtE1;-><init>(LoE1;LBb6;)V

    return-object p2
.end method
