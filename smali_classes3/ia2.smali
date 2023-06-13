.class public final Lia2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0003\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\"\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lco/bird/android/model/IssueCreateSource;",
        "",
        "a",
        "",
        "Ljava/util/Set;",
        "DISPUTABLE_SOURCES",
        "workorders_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lco/bird/android/model/IssueCreateSource;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lco/bird/android/model/IssueCreateSource;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/IssueCreateSource;->VEHICLE_FAULT_CODE:Lco/bird/android/model/IssueCreateSource;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/IssueCreateSource;->RIDER_REPORT:Lco/bird/android/model/IssueCreateSource;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/IssueCreateSource;->FIELD_CENTER:Lco/bird/android/model/IssueCreateSource;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lia2;->a:Ljava/util/Set;

    return-void
.end method

.method public static final a(Lco/bird/android/model/IssueCreateSource;)Z
    .locals 1

    sget-object v0, Lia2;->a:Ljava/util/Set;

    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
