.class public final Lbo/app/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/app/m0$b;,
        Lbo/app/m0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0002\u0005\u0007B5\u0008\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\r\u001a\u00020\u000cH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a8\u0006\u0017"
    }
    d2 = {
        "Lbo/app/m0;",
        "",
        "",
        "toString",
        "Lbo/app/m0$b;",
        "a",
        "Lbo/app/u1;",
        "b",
        "Lbo/app/f5;",
        "c",
        "Lbo/app/z1;",
        "d",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "commandType",
        "brazeEvent",
        "sessionId",
        "brazeRequest",
        "<init>",
        "(Lbo/app/m0$b;Lbo/app/u1;Lbo/app/f5;Lbo/app/z1;)V",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final e:Lbo/app/m0$a;


# instance fields
.field public final a:Lbo/app/m0$b;

.field public final b:Lbo/app/u1;

.field public final c:Lbo/app/f5;

.field public final d:Lbo/app/z1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbo/app/m0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbo/app/m0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbo/app/m0;->e:Lbo/app/m0$a;

    return-void
.end method

.method private constructor <init>(Lbo/app/m0$b;Lbo/app/u1;Lbo/app/f5;Lbo/app/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo/app/m0;->a:Lbo/app/m0$b;

    iput-object p2, p0, Lbo/app/m0;->b:Lbo/app/u1;

    iput-object p3, p0, Lbo/app/m0;->c:Lbo/app/f5;

    iput-object p4, p0, Lbo/app/m0;->d:Lbo/app/z1;

    return-void
.end method

.method public synthetic constructor <init>(Lbo/app/m0$b;Lbo/app/u1;Lbo/app/f5;Lbo/app/z1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lbo/app/m0;-><init>(Lbo/app/m0$b;Lbo/app/u1;Lbo/app/f5;Lbo/app/z1;)V

    return-void
.end method


# virtual methods
.method public final a()Lbo/app/m0$b;
    .locals 1

    iget-object v0, p0, Lbo/app/m0;->a:Lbo/app/m0$b;

    return-object v0
.end method

.method public final b()Lbo/app/u1;
    .locals 1

    iget-object v0, p0, Lbo/app/m0;->b:Lbo/app/u1;

    return-object v0
.end method

.method public final c()Lbo/app/f5;
    .locals 1

    iget-object v0, p0, Lbo/app/m0;->c:Lbo/app/f5;

    return-object v0
.end method

.method public final d()Lbo/app/z1;
    .locals 1

    iget-object v0, p0, Lbo/app/m0;->d:Lbo/app/z1;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lbo/app/m0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lbo/app/m0;

    iget-object v1, p0, Lbo/app/m0;->a:Lbo/app/m0$b;

    iget-object v3, p1, Lbo/app/m0;->a:Lbo/app/m0$b;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lbo/app/m0;->b:Lbo/app/u1;

    iget-object v3, p1, Lbo/app/m0;->b:Lbo/app/u1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lbo/app/m0;->c:Lbo/app/f5;

    iget-object v3, p1, Lbo/app/m0;->c:Lbo/app/f5;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lbo/app/m0;->d:Lbo/app/z1;

    iget-object p1, p1, Lbo/app/m0;->d:Lbo/app/z1;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lbo/app/m0;->a:Lbo/app/m0$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lbo/app/m0;->b:Lbo/app/u1;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lbo/app/m0;->c:Lbo/app/f5;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lbo/app/f5;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lbo/app/m0;->d:Lbo/app/z1;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n            mCommandType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbo/app/m0;->a:Lbo/app/m0$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n            mBrazeEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbo/app/m0;->b:Lbo/app/u1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n            mSessionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbo/app/m0;->c:Lbo/app/f5;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n            mBrazeRequest="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbo/app/m0;->d:Lbo/app/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n        "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
