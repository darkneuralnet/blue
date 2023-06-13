.class public final Lco/bird/android/model/UserRoleItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J:\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001d"
    }
    d2 = {
        "Lco/bird/android/model/UserRoleItem;",
        "",
        "userRole",
        "Lco/bird/android/model/constant/UserRole;",
        "userRoleCode",
        "",
        "userRoleTitle",
        "userRoleTitleStringRes",
        "",
        "(Lco/bird/android/model/constant/UserRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V",
        "getUserRole",
        "()Lco/bird/android/model/constant/UserRole;",
        "getUserRoleCode",
        "()Ljava/lang/String;",
        "getUserRoleTitle",
        "getUserRoleTitleStringRes",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(Lco/bird/android/model/constant/UserRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lco/bird/android/model/UserRoleItem;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "model_release"
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
.field private final userRole:Lco/bird/android/model/constant/UserRole;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "user_role"
    .end annotation

    .annotation runtime Lft5;
        value = "user_role"
    .end annotation
.end field

.field private final userRoleCode:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "user_role_code"
    .end annotation

    .annotation runtime Lft5;
        value = "user_role_code"
    .end annotation
.end field

.field private final userRoleTitle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "user_role_title"
    .end annotation

    .annotation runtime Lft5;
        value = "user_role_title"
    .end annotation
.end field

.field private final userRoleTitleStringRes:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "user_role_title_string_res"
    .end annotation

    .annotation runtime Lft5;
        value = "user_role_title_string_res"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/UserRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "userRole"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userRoleCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/UserRoleItem;->userRole:Lco/bird/android/model/constant/UserRole;

    iput-object p2, p0, Lco/bird/android/model/UserRoleItem;->userRoleCode:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/UserRoleItem;->userRoleTitle:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/android/model/UserRoleItem;->userRoleTitleStringRes:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/constant/UserRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const-string p2, ""

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/UserRoleItem;-><init>(Lco/bird/android/model/constant/UserRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/UserRoleItem;Lco/bird/android/model/constant/UserRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lco/bird/android/model/UserRoleItem;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/UserRoleItem;->userRole:Lco/bird/android/model/constant/UserRole;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/UserRoleItem;->userRoleCode:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/UserRoleItem;->userRoleTitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/UserRoleItem;->userRoleTitleStringRes:Ljava/lang/Integer;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/UserRoleItem;->copy(Lco/bird/android/model/constant/UserRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lco/bird/android/model/UserRoleItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/UserRole;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/UserRoleItem;->userRole:Lco/bird/android/model/constant/UserRole;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/UserRoleItem;->userRoleCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/UserRoleItem;->userRoleTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/UserRoleItem;->userRoleTitleStringRes:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/UserRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lco/bird/android/model/UserRoleItem;
    .locals 1

    const-string v0, "userRole"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userRoleCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/UserRoleItem;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/UserRoleItem;-><init>(Lco/bird/android/model/constant/UserRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/UserRoleItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/UserRoleItem;

    iget-object v1, p0, Lco/bird/android/model/UserRoleItem;->userRole:Lco/bird/android/model/constant/UserRole;

    iget-object v3, p1, Lco/bird/android/model/UserRoleItem;->userRole:Lco/bird/android/model/constant/UserRole;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/UserRoleItem;->userRoleCode:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/UserRoleItem;->userRoleCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/UserRoleItem;->userRoleTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/UserRoleItem;->userRoleTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/UserRoleItem;->userRoleTitleStringRes:Ljava/lang/Integer;

    iget-object p1, p1, Lco/bird/android/model/UserRoleItem;->userRoleTitleStringRes:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getUserRole()Lco/bird/android/model/constant/UserRole;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/UserRoleItem;->userRole:Lco/bird/android/model/constant/UserRole;

    return-object v0
.end method

.method public final getUserRoleCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/UserRoleItem;->userRoleCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserRoleTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/UserRoleItem;->userRoleTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserRoleTitleStringRes()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/UserRoleItem;->userRoleTitleStringRes:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/UserRoleItem;->userRole:Lco/bird/android/model/constant/UserRole;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/UserRoleItem;->userRoleCode:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/UserRoleItem;->userRoleTitle:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/UserRoleItem;->userRoleTitleStringRes:Ljava/lang/Integer;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/UserRoleItem;->userRole:Lco/bird/android/model/constant/UserRole;

    iget-object v1, p0, Lco/bird/android/model/UserRoleItem;->userRoleCode:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/UserRoleItem;->userRoleTitle:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/android/model/UserRoleItem;->userRoleTitleStringRes:Ljava/lang/Integer;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "UserRoleItem(userRole="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userRoleCode="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userRoleTitle="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userRoleTitleStringRes="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
