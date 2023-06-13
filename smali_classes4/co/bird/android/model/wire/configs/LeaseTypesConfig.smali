.class public final Lco/bird/android/model/wire/configs/LeaseTypesConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000c\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0010"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/LeaseTypesConfig;",
        "",
        "helmet",
        "Lco/bird/android/model/wire/configs/LeaseTypeConfig;",
        "(Lco/bird/android/model/wire/configs/LeaseTypeConfig;)V",
        "getHelmet",
        "()Lco/bird/android/model/wire/configs/LeaseTypeConfig;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "model-wire_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final helmet:Lco/bird/android/model/wire/configs/LeaseTypeConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "helmet"
    .end annotation

    .annotation runtime Lft5;
        value = "helmet"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lco/bird/android/model/wire/configs/LeaseTypesConfig;-><init>(Lco/bird/android/model/wire/configs/LeaseTypeConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/configs/LeaseTypeConfig;)V
    .locals 1

    const-string v0, "helmet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/configs/LeaseTypesConfig;->helmet:Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/configs/LeaseTypeConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    new-instance v0, Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    move-object v1, v0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x3ff

    const/16 v18, 0x0

    invoke-direct/range {v1 .. v18}, Lco/bird/android/model/wire/configs/LeaseTypeConfig;-><init>(ZJJJIJZZJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, p0

    goto :goto_0

    :cond_0
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    :goto_0
    invoke-direct {v1, v0}, Lco/bird/android/model/wire/configs/LeaseTypesConfig;-><init>(Lco/bird/android/model/wire/configs/LeaseTypeConfig;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/LeaseTypesConfig;Lco/bird/android/model/wire/configs/LeaseTypeConfig;ILjava/lang/Object;)Lco/bird/android/model/wire/configs/LeaseTypesConfig;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/configs/LeaseTypesConfig;->helmet:Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/model/wire/configs/LeaseTypesConfig;->copy(Lco/bird/android/model/wire/configs/LeaseTypeConfig;)Lco/bird/android/model/wire/configs/LeaseTypesConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/configs/LeaseTypeConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/LeaseTypesConfig;->helmet:Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/wire/configs/LeaseTypeConfig;)Lco/bird/android/model/wire/configs/LeaseTypesConfig;
    .locals 1

    const-string v0, "helmet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/configs/LeaseTypesConfig;

    invoke-direct {v0, p1}, Lco/bird/android/model/wire/configs/LeaseTypesConfig;-><init>(Lco/bird/android/model/wire/configs/LeaseTypeConfig;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/LeaseTypesConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/LeaseTypesConfig;

    iget-object v1, p0, Lco/bird/android/model/wire/configs/LeaseTypesConfig;->helmet:Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    iget-object p1, p1, Lco/bird/android/model/wire/configs/LeaseTypesConfig;->helmet:Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getHelmet()Lco/bird/android/model/wire/configs/LeaseTypeConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/LeaseTypesConfig;->helmet:Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/LeaseTypesConfig;->helmet:Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/LeaseTypeConfig;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/configs/LeaseTypesConfig;->helmet:Lco/bird/android/model/wire/configs/LeaseTypeConfig;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "LeaseTypesConfig(helmet="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
