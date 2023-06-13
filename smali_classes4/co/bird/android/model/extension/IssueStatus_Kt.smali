.class public final Lco/bird/android/model/extension/IssueStatus_Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/extension/IssueStatus_Kt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a\u000c\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u0002\u001a\u000c\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0002\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0008\"\u0014\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "FAILED_STATUSES",
        "",
        "Lco/bird/android/model/IssueStatus;",
        "PASSED_STATUSES",
        "isFailedStatus",
        "",
        "isPassedStatus",
        "toBoolean",
        "(Lco/bird/android/model/IssueStatus;)Ljava/lang/Boolean;",
        "model_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final FAILED_STATUSES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lco/bird/android/model/IssueStatus;",
            ">;"
        }
    .end annotation
.end field

.field private static final PASSED_STATUSES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lco/bird/android/model/IssueStatus;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [Lco/bird/android/model/IssueStatus;

    sget-object v2, Lco/bird/android/model/IssueStatus;->RESOLVED:Lco/bird/android/model/IssueStatus;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lco/bird/android/model/IssueStatus;->DISPUTED:Lco/bird/android/model/IssueStatus;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, Lco/bird/android/model/extension/IssueStatus_Kt;->PASSED_STATUSES:Ljava/util/Set;

    new-array v0, v0, [Lco/bird/android/model/IssueStatus;

    sget-object v1, Lco/bird/android/model/IssueStatus;->OPEN:Lco/bird/android/model/IssueStatus;

    aput-object v1, v0, v3

    sget-object v1, Lco/bird/android/model/IssueStatus;->FAILED_QC:Lco/bird/android/model/IssueStatus;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/extension/IssueStatus_Kt;->FAILED_STATUSES:Ljava/util/Set;

    return-void
.end method

.method public static final isFailedStatus(Lco/bird/android/model/IssueStatus;)Z
    .locals 1

    sget-object v0, Lco/bird/android/model/extension/IssueStatus_Kt;->FAILED_STATUSES:Ljava/util/Set;

    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isPassedStatus(Lco/bird/android/model/IssueStatus;)Z
    .locals 1

    sget-object v0, Lco/bird/android/model/extension/IssueStatus_Kt;->PASSED_STATUSES:Ljava/util/Set;

    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final toBoolean(Lco/bird/android/model/IssueStatus;)Ljava/lang/Boolean;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lco/bird/android/model/extension/IssueStatus_Kt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1

    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_1
    return-object p0
.end method
