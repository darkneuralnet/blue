.class public abstract Lgi1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgi1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0011\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016J\u0008\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u0082\u0001\u0001\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lgi1;",
        "",
        "exit",
        "c",
        "other",
        "",
        "equals",
        "",
        "toString",
        "",
        "hashCode",
        "LH96;",
        "b",
        "()LH96;",
        "data",
        "<init>",
        "()V",
        "a",
        "Lhi1;",
        "animation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lgi1$a;

.field public static final b:Lgi1;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lgi1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgi1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgi1;->a:Lgi1$a;

    new-instance v0, Lhi1;

    new-instance v8, LH96;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xf

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LH96;-><init>(Lvj1;LdE5;LEh0;LYi5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v8}, Lhi1;-><init>(LH96;)V

    sput-object v0, Lgi1;->b:Lgi1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lgi1;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lgi1;
    .locals 1

    sget-object v0, Lgi1;->b:Lgi1;

    return-object v0
.end method


# virtual methods
.method public abstract b()LH96;
.end method

.method public final c(Lgi1;)Lgi1;
    .locals 6

    const-string v0, "exit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhi1;

    new-instance v1, LH96;

    invoke-virtual {p0}, Lgi1;->b()LH96;

    move-result-object v2

    invoke-virtual {v2}, LH96;->b()Lvj1;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Lgi1;->b()LH96;

    move-result-object v2

    invoke-virtual {v2}, LH96;->b()Lvj1;

    move-result-object v2

    :cond_0
    invoke-virtual {p0}, Lgi1;->b()LH96;

    move-result-object v3

    invoke-virtual {v3}, LH96;->d()LdE5;

    move-result-object v3

    if-nez v3, :cond_1

    invoke-virtual {p1}, Lgi1;->b()LH96;

    move-result-object v3

    invoke-virtual {v3}, LH96;->d()LdE5;

    move-result-object v3

    :cond_1
    invoke-virtual {p0}, Lgi1;->b()LH96;

    move-result-object v4

    invoke-virtual {v4}, LH96;->a()LEh0;

    move-result-object v4

    if-nez v4, :cond_2

    invoke-virtual {p1}, Lgi1;->b()LH96;

    move-result-object v4

    invoke-virtual {v4}, LH96;->a()LEh0;

    move-result-object v4

    :cond_2
    invoke-virtual {p0}, Lgi1;->b()LH96;

    move-result-object v5

    invoke-virtual {v5}, LH96;->c()LYi5;

    move-result-object v5

    if-nez v5, :cond_3

    invoke-virtual {p1}, Lgi1;->b()LH96;

    move-result-object p1

    invoke-virtual {p1}, LH96;->c()LYi5;

    move-result-object v5

    :cond_3
    invoke-direct {v1, v2, v3, v4, v5}, LH96;-><init>(Lvj1;LdE5;LEh0;LYi5;)V

    invoke-direct {v0, v1}, Lhi1;-><init>(LH96;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lgi1;

    if-eqz v0, :cond_0

    check-cast p1, Lgi1;

    invoke-virtual {p1}, Lgi1;->b()LH96;

    move-result-object p1

    invoke-virtual {p0}, Lgi1;->b()LH96;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lgi1;->b()LH96;

    move-result-object v0

    invoke-virtual {v0}, LH96;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    sget-object v0, Lgi1;->b:Lgi1;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ExitTransition.None"

    goto :goto_3

    :cond_0
    invoke-virtual {p0}, Lgi1;->b()LH96;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ExitTransition: \nFade - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LH96;->b()Lvj1;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lvj1;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nSlide - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LH96;->d()LdE5;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LdE5;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v3

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nShrink - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LH96;->a()LEh0;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, LEh0;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object v2, v3

    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nScale - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LH96;->c()LYi5;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LYi5;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_4
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    return-object v0
.end method
