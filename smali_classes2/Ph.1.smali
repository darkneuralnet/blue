.class public final LPh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOh;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\'\u0010(R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00088\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u000f\u001a\u00020\u00088\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\n\u001a\u0004\u0008\u000e\u0010\u000cR\u001a\u0010\u0012\u001a\u00020\u00088\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\n\u001a\u0004\u0008\u0011\u0010\u000cR\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00088\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\n\u001a\u0004\u0008\u0003\u0010\u000cR\u001a\u0010\u001b\u001a\u00020\u00088\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\n\u001a\u0004\u0008\u001a\u0010\u000cR\u001a\u0010\u001d\u001a\u00020\u00088\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\n\u001a\u0004\u0008\u0010\u0010\u000cR\u001a\u0010\u001f\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0004\u001a\u0004\u0008\t\u0010\u0006R\u001b\u0010#\u001a\u00020 8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010!\u001a\u0004\u0008\u001c\u0010\"R\u001a\u0010$\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0014\u001a\u0004\u0008\u0019\u0010\u0016R\u001a\u0010&\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u0014\u001a\u0004\u0008\u001e\u0010\u0016\u00a8\u0006)"
    }
    d2 = {
        "LPh;",
        "LOh;",
        "",
        "a",
        "Z",
        "k",
        "()Z",
        "debug",
        "",
        "b",
        "Ljava/lang/String;",
        "c",
        "()Ljava/lang/String;",
        "applicationId",
        "e",
        "buildType",
        "d",
        "f",
        "flavor",
        "",
        "I",
        "getVersionCode",
        "()I",
        "versionCode",
        "versionName",
        "g",
        "j",
        "brazeApiKeyProd",
        "h",
        "brazeApiKeyStage",
        "i",
        "operatorOnly",
        "Lorg/joda/time/DateTime;",
        "Lkotlin/Lazy;",
        "()Lorg/joda/time/DateTime;",
        "buildTimestamp",
        "appLogoFilled",
        "l",
        "appLogoFilledWhite",
        "<init>",
        "()V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:Lkotlin/Lazy;

.field public final k:I

.field public final l:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "co.bird.android"

    iput-object v0, p0, LPh;->b:Ljava/lang/String;

    const-string v0, "release"

    iput-object v0, p0, LPh;->c:Ljava/lang/String;

    const-string v0, "bird"

    iput-object v0, p0, LPh;->d:Ljava/lang/String;

    const v0, 0xdcf47

    iput v0, p0, LPh;->e:I

    const-string v0, "4.244.0.7"

    iput-object v0, p0, LPh;->f:Ljava/lang/String;

    const-string v0, "0746cb31-9572-4495-ac5e-ce1236eebf5e"

    iput-object v0, p0, LPh;->g:Ljava/lang/String;

    const-string v0, "2b52ab40-cadb-4142-92d2-716dacca6d50"

    iput-object v0, p0, LPh;->h:Ljava/lang/String;

    invoke-virtual {p0}, LPh;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "birdOperator"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, LPh;->i:Z

    sget-object v0, LPh$a;->g:LPh$a;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, LPh;->j:Lkotlin/Lazy;

    sget v0, Lyg4;->ic_filled_logo:I

    iput v0, p0, LPh;->k:I

    sget v0, Lyg4;->ic_filled_logo_white:I

    iput v0, p0, LPh;->l:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LPh;->f:Ljava/lang/String;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, LPh;->i:Z

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LPh;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LPh;->h:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LPh;->c:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LPh;->d:Ljava/lang/String;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, LPh;->k:I

    return v0
.end method

.method public h()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, LPh;->j:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, LPh;->l:I

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LPh;->g:Ljava/lang/String;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, LPh;->a:Z

    return v0
.end method
