.class public abstract Lbi2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbi2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u00072\u00020\u0001:\u0001\u0012B\u0019\u0008\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0019\u00a2\u0006\u0004\u0008%\u0010&J)\u0010\u0007\u001a\u00020\u0006\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J)\u0010\u000c\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rJ)\u0010\u000f\u001a\u00020\u000e\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J)\u0010\u0012\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR \u0010$\u001a\u00020\u001e8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u001f\u0012\u0004\u0008\"\u0010#\u001a\u0004\u0008 \u0010!\u0082\u0001\u0002\'(\u00a8\u0006)"
    }
    d2 = {
        "Lbi2;",
        "",
        "T",
        "Let5;",
        "serializer",
        "value",
        "",
        "d",
        "(Let5;Ljava/lang/Object;)Ljava/lang/String;",
        "LE01;",
        "deserializer",
        "string",
        "b",
        "(LE01;Ljava/lang/String;)Ljava/lang/Object;",
        "Lxi2;",
        "c",
        "(Let5;Ljava/lang/Object;)Lxi2;",
        "element",
        "a",
        "(LE01;Lxi2;)Ljava/lang/Object;",
        "Lji2;",
        "Lji2;",
        "e",
        "()Lji2;",
        "configuration",
        "Lkt5;",
        "Lkt5;",
        "f",
        "()Lkt5;",
        "serializersModule",
        "Ly01;",
        "Ly01;",
        "g",
        "()Ly01;",
        "get_schemaCache$kotlinx_serialization_json$annotations",
        "()V",
        "_schemaCache",
        "<init>",
        "(Lji2;Lkt5;)V",
        "Lbi2$a;",
        "LHi2;",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final d:Lbi2$a;


# instance fields
.field public final a:Lji2;

.field public final b:Lkt5;

.field public final c:Ly01;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbi2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbi2$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbi2;->d:Lbi2$a;

    return-void
.end method

.method public constructor <init>(Lji2;Lkt5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbi2;->a:Lji2;

    iput-object p2, p0, Lbi2;->b:Lkt5;

    new-instance p1, Ly01;

    invoke-direct {p1}, Ly01;-><init>()V

    iput-object p1, p0, Lbi2;->c:Ly01;

    return-void
.end method

.method public synthetic constructor <init>(Lji2;Lkt5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lbi2;-><init>(Lji2;Lkt5;)V

    return-void
.end method


# virtual methods
.method public final a(LE01;Lxi2;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LE01<",
            "+TT;>;",
            "Lxi2;",
            ")TT;"
        }
    .end annotation

    const-string v0, "deserializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2, p1}, Lma6;->a(Lbi2;Lxi2;LE01;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(LE01;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LE01<",
            "+TT;>;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    const-string v0, "deserializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "string"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWR5;

    invoke-direct {v0, p2}, LWR5;-><init>(Ljava/lang/String;)V

    new-instance p2, LHR5;

    sget-object v3, LjH6;->d:LjH6;

    invoke-interface {p1}, LE01;->getDescriptor()LMs5;

    move-result-object v5

    const/4 v6, 0x0

    move-object v1, p2

    move-object v2, p0

    move-object v4, v0

    invoke-direct/range {v1 .. v6}, LHR5;-><init>(Lbi2;LjH6;LC0;LMs5;LHR5$a;)V

    invoke-virtual {p2, p1}, LHR5;->B(LE01;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0}, LC0;->w()V

    return-object p1
.end method

.method public final c(Let5;Ljava/lang/Object;)Lxi2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Let5<",
            "-TT;>;TT;)",
            "Lxi2;"
        }
    .end annotation

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2, p1}, Lna6;->c(Lbi2;Ljava/lang/Object;Let5;)Lxi2;

    move-result-object p1

    return-object p1
.end method

.method public final d(Let5;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Let5<",
            "-TT;>;TT;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnj2;

    invoke-direct {v0}, Lnj2;-><init>()V

    :try_start_0
    invoke-static {p0, v0, p1, p2}, Lmj2;->a(Lbi2;LDj2;Let5;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnj2;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lnj2;->h()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lnj2;->h()V

    throw p1
.end method

.method public final e()Lji2;
    .locals 1

    iget-object v0, p0, Lbi2;->a:Lji2;

    return-object v0
.end method

.method public f()Lkt5;
    .locals 1

    iget-object v0, p0, Lbi2;->b:Lkt5;

    return-object v0
.end method

.method public final g()Ly01;
    .locals 1

    iget-object v0, p0, Lbi2;->c:Ly01;

    return-object v0
.end method
