.class public final Lly3;
.super LsB0$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lly3$a;
    }
.end annotation

.annotation build Lorg/codehaus/mojo/animal_sniffer/IgnoreJRERequirement;
.end annotation


# static fields
.field public static final a:LsB0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lly3;

    invoke-direct {v0}, Lly3;-><init>()V

    sput-object v0, Lly3;->a:LsB0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LsB0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMN4;)LsB0;
    .locals 2
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

    invoke-static {p1}, LsB0$a;->b(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/util/Optional;

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v0, p1}, LsB0$a;->a(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    invoke-virtual {p3, p1, p2}, LMN4;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)LsB0;

    move-result-object p1

    new-instance p2, Lly3$a;

    invoke-direct {p2, p1}, Lly3$a;-><init>(LsB0;)V

    return-object p2
.end method
