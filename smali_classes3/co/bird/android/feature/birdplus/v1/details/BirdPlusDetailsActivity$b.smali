.class public final Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00d6\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\u0002\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;",
        "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;",
        "",
        "d",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "",
        "c",
        "(Ljava/lang/String;)I",
        "",
        "other",
        "",
        "b",
        "(Ljava/lang/String;Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "value",
        "bird-plus_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/jvm/JvmInline;
.end annotation


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;

    invoke-virtual {p1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;->unbox-impl()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final synthetic box-impl(Ljava/lang/String;)Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;
    .locals 1

    new-instance v0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;

    invoke-direct {v0, p0}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;)I
    .locals 0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    return p0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CodenameIdentifier(value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;->a:Ljava/lang/String;

    invoke-static {v0, p1}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;->b(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;->a:Ljava/lang/String;

    invoke-static {v0}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;->c(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;->a:Ljava/lang/String;

    invoke-static {v0}, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unbox-impl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;->a:Ljava/lang/String;

    return-object v0
.end method
